package com.google.firebase.remoteconfig.internal;

import Dc.o;
import Dc.p;
import Dc.s;
import Ea.C4278a;
import Ea.j;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import com.amazon.a.a.o.b;
import com.google.firebase.remoteconfig.internal.g;
import com.google.firebase.remoteconfig.internal.m;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n1.C2240a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ConfigFetchHttpClient {

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f57799h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a  reason: collision with root package name */
    private final Context f57800a;

    /* renamed from: b  reason: collision with root package name */
    private final String f57801b;

    /* renamed from: c  reason: collision with root package name */
    private final String f57802c;

    /* renamed from: d  reason: collision with root package name */
    private final String f57803d;

    /* renamed from: e  reason: collision with root package name */
    private final String f57804e;

    /* renamed from: f  reason: collision with root package name */
    private final long f57805f;

    /* renamed from: g  reason: collision with root package name */
    private final long f57806g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j10, long j11) {
        this.f57800a = context;
        this.f57801b = str;
        this.f57802c = str2;
        this.f57803d = f(str);
        this.f57804e = str3;
        this.f57805f = j10;
        this.f57806g = j11;
    }

    private boolean a(JSONObject jSONObject) {
        try {
            return !jSONObject.get("state").equals("NO_CHANGE");
        } catch (JSONException unused) {
            return true;
        }
    }

    private String b(long j10) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j10));
    }

    private JSONObject c(String str, String str2, Map map, Long l10) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("appInstanceId", str);
            hashMap.put("appInstanceIdToken", str2);
            hashMap.put("appId", this.f57801b);
            Locale locale = this.f57800a.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale.getCountry());
            int i10 = Build.VERSION.SDK_INT;
            hashMap.put("languageCode", locale.toLanguageTag());
            hashMap.put("platformVersion", Integer.toString(i10));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = this.f57800a.getPackageManager().getPackageInfo(this.f57800a.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                    hashMap.put("appBuild", Long.toString(C2240a.a(packageInfo)));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put("packageName", this.f57800a.getPackageName());
            hashMap.put(b.f37451I, "22.0.0");
            hashMap.put("analyticsUserProperties", new JSONObject(map));
            if (l10 != null) {
                hashMap.put("firstOpenTime", b(l10.longValue()));
            }
            return new JSONObject(hashMap);
        }
        throw new o("Fetch failed: Firebase installation id is null.");
    }

    private static g e(JSONObject jSONObject, Date date) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        String str;
        try {
            g.b e10 = g.l().e(date);
            JSONArray jSONArray2 = null;
            try {
                jSONObject2 = jSONObject.getJSONObject("entries");
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                e10 = e10.c(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray("experimentDescriptions");
            } catch (JSONException unused2) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                e10 = e10.d(jSONArray);
            }
            try {
                jSONObject3 = jSONObject.getJSONObject("personalizationMetadata");
            } catch (JSONException unused3) {
                jSONObject3 = null;
            }
            if (jSONObject3 != null) {
                e10 = e10.f(jSONObject3);
            }
            if (jSONObject.has("templateVersion")) {
                str = jSONObject.getString("templateVersion");
            } else {
                str = null;
            }
            if (str != null) {
                e10.h(Long.parseLong(str));
            }
            try {
                jSONArray2 = jSONObject.getJSONArray("rolloutMetadata");
            } catch (JSONException unused4) {
            }
            if (jSONArray2 != null) {
                e10 = e10.g(jSONArray2);
            }
            return e10.a();
        } catch (JSONException e11) {
            throw new o("Fetch failed: fetch response could not be parsed.", (Throwable) e11);
        }
    }

    private static String f(String str) {
        Matcher matcher = f57799h.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private JSONObject g(URLConnection uRLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read == -1) {
                return new JSONObject(sb2.toString());
            }
            sb2.append((char) read);
        }
    }

    private String h(String str, String str2) {
        return String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", new Object[]{str, str2});
    }

    private String i() {
        try {
            Context context = this.f57800a;
            byte[] a10 = C4278a.a(context, context.getPackageName());
            if (a10 != null) {
                return j.c(a10, false);
            }
            Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.f57800a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("FirebaseRemoteConfig", "No such package: " + this.f57800a.getPackageName(), e10);
            return null;
        }
    }

    private void j(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f57802c);
        httpURLConnection.setRequestProperty("X-Android-Package", this.f57800a.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", i());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    private void k(HttpURLConnection httpURLConnection, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
    }

    private void l(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    private void m(HttpURLConnection httpURLConnection, String str, String str2, Map map) {
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f57805f));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.f57806g));
        httpURLConnection.setRequestProperty("If-None-Match", str);
        j(httpURLConnection, str2);
        k(httpURLConnection, map);
    }

    /* access modifiers changed from: package-private */
    public HttpURLConnection d() {
        try {
            return (HttpURLConnection) new URL(h(this.f57803d, this.f57804e)).openConnection();
        } catch (IOException e10) {
            throw new p(e10.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    @Keep
    public m.a fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l10, Date date) {
        m(httpURLConnection, str3, str2, map2);
        try {
            l(httpURLConnection, c(str, str2, map, l10).toString().getBytes("utf-8"));
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                String headerField = httpURLConnection.getHeaderField("ETag");
                JSONObject g10 = g(httpURLConnection);
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused) {
                }
                g e10 = e(g10, date);
                if (!a(g10)) {
                    return m.a.a(date, e10);
                }
                return m.a.b(e10, headerField);
            }
            throw new s(responseCode, httpURLConnection.getResponseMessage());
        } catch (IOException | JSONException e11) {
            throw new o("The client had an error while calling the backend!", e11);
        } catch (Throwable th2) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
            } catch (IOException unused2) {
            }
            throw th2;
        }
    }
}
