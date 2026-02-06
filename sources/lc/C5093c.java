package lc;

import Ea.C4278a;
import Ea.j;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.amazon.a.a.o.b;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.d;
import gc.i;
import ic.C5027b;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import lc.C5094d;
import lc.C5096f;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: lc.c  reason: case insensitive filesystem */
public class C5093c {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f61015d = Pattern.compile("[0-9]+s");

    /* renamed from: e  reason: collision with root package name */
    private static final Charset f61016e = Charset.forName(Constants.ENCODING);

    /* renamed from: a  reason: collision with root package name */
    private final Context f61017a;

    /* renamed from: b  reason: collision with root package name */
    private final C5027b f61018b;

    /* renamed from: c  reason: collision with root package name */
    private final C5095e f61019c = new C5095e();

    public C5093c(Context context, C5027b bVar) {
        this.f61017a = context;
        this.f61018b = bVar;
    }

    private static String a(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", new Object[]{str2, str3, str4});
    }

    private static JSONObject b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put(b.f37451I, "a:18.0.0");
            return jSONObject;
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(b.f37451I, "a:18.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private String f() {
        try {
            Context context = this.f61017a;
            byte[] a10 = C4278a.a(context, context.getPackageName());
            if (a10 != null) {
                return j.c(a10, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f61017a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("ContentValues", "No such package: " + this.f61017a.getPackageName(), e10);
            return null;
        }
    }

    private URL g(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", str}));
        } catch (MalformedURLException e10) {
            throw new d(e10.getMessage(), d.a.UNAVAILABLE);
        }
    }

    private static byte[] h(JSONObject jSONObject) {
        return jSONObject.toString().getBytes(Constants.ENCODING);
    }

    private static boolean i(int i10) {
        if (i10 < 200 || i10 >= 300) {
            return false;
        }
        return true;
    }

    private static void j() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private static void k(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String o10 = o(httpURLConnection);
        if (!TextUtils.isEmpty(o10)) {
            Log.w("Firebase-Installations", o10);
            Log.w("Firebase-Installations", a(str, str2, str3));
        }
    }

    private HttpURLConnection l(URL url, String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f61017a.getPackageName());
            i iVar = (i) this.f61018b.get();
            if (iVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(iVar.a()));
                } catch (ExecutionException e10) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e10);
                } catch (InterruptedException e11) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e11);
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
    }

    static long m(String str) {
        C4536s.b(f61015d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private C5094d n(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f61016e));
        C5096f.a a10 = C5096f.a();
        C5094d.a a11 = C5094d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                a11.f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                a11.c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                a11.d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a10.c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a10.d(m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                a11.b(a10.a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a11.e(C5094d.b.OK).a();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0048 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String o(java.net.HttpURLConnection r5) {
        /*
            java.io.InputStream r0 = r5.getErrorStream()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.nio.charset.Charset r4 = f61016e
            r3.<init>(r0, r4)
            r2.<init>(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0048, all -> 0x0028 }
            r0.<init>()     // Catch:{ IOException -> 0x0048, all -> 0x0028 }
        L_0x0019:
            java.lang.String r3 = r2.readLine()     // Catch:{ IOException -> 0x0048, all -> 0x0028 }
            if (r3 == 0) goto L_0x002a
            r0.append(r3)     // Catch:{ IOException -> 0x0048, all -> 0x0028 }
            r3 = 10
            r0.append(r3)     // Catch:{ IOException -> 0x0048, all -> 0x0028 }
            goto L_0x0019
        L_0x0028:
            r5 = move-exception
            goto L_0x0044
        L_0x002a:
            java.lang.String r3 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            int r4 = r5.getResponseCode()     // Catch:{ IOException -> 0x0048, all -> 0x0028 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x0048, all -> 0x0028 }
            java.lang.String r5 = r5.getResponseMessage()     // Catch:{ IOException -> 0x0048, all -> 0x0028 }
            java.lang.Object[] r5 = new java.lang.Object[]{r4, r5, r0}     // Catch:{ IOException -> 0x0048, all -> 0x0028 }
            java.lang.String r5 = java.lang.String.format(r3, r5)     // Catch:{ IOException -> 0x0048, all -> 0x0028 }
            r2.close()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            return r5
        L_0x0044:
            r2.close()     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            throw r5
        L_0x0048:
            r2.close()     // Catch:{ IOException -> 0x004b }
        L_0x004b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lc.C5093c.o(java.net.HttpURLConnection):java.lang.String");
    }

    private C5096f p(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f61016e));
        C5096f.a a10 = C5096f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a10.c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a10.d(m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a10.b(C5096f.b.OK).a();
    }

    private void q(HttpURLConnection httpURLConnection, String str, String str2) {
        s(httpURLConnection, h(b(str, str2)));
    }

    private void r(HttpURLConnection httpURLConnection) {
        s(httpURLConnection, h(c()));
    }

    private static void s(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    public C5094d d(String str, String str2, String str3, String str4, String str5) {
        C5094d n10;
        if (this.f61019c.b()) {
            URL g10 = g(String.format("projects/%s/installations", new Object[]{str3}));
            int i10 = 0;
            while (i10 <= 1) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection l10 = l(g10, str);
                try {
                    l10.setRequestMethod("POST");
                    l10.setDoOutput(true);
                    if (str5 != null) {
                        l10.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    q(l10, str2, str4);
                    int responseCode = l10.getResponseCode();
                    this.f61019c.f(responseCode);
                    if (i(responseCode)) {
                        n10 = n(l10);
                    } else {
                        k(l10, str4, str, str3);
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                j();
                                n10 = C5094d.a().e(C5094d.b.BAD_CONFIG).a();
                            }
                            l10.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i10++;
                        } else {
                            throw new d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", d.a.TOO_MANY_REQUESTS);
                        }
                    }
                    l10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return n10;
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th2) {
                    l10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
            }
            throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
        throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
    }

    public C5096f e(String str, String str2, String str3, String str4) {
        C5096f p10;
        if (this.f61019c.b()) {
            URL g10 = g(String.format("projects/%s/installations/%s/authTokens:generate", new Object[]{str3, str2}));
            int i10 = 0;
            while (i10 <= 1) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection l10 = l(g10, str);
                try {
                    l10.setRequestMethod("POST");
                    l10.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    l10.setDoOutput(true);
                    r(l10);
                    int responseCode = l10.getResponseCode();
                    this.f61019c.f(responseCode);
                    if (i(responseCode)) {
                        p10 = p(l10);
                    } else {
                        k(l10, (String) null, str, str3);
                        if (responseCode == 401 || responseCode == 404) {
                            p10 = C5096f.a().b(C5096f.b.AUTH_ERROR).a();
                        } else if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                j();
                                p10 = C5096f.a().b(C5096f.b.BAD_CONFIG).a();
                            }
                            l10.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i10++;
                        } else {
                            throw new d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", d.a.TOO_MANY_REQUESTS);
                        }
                    }
                    l10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return p10;
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th2) {
                    l10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
            }
            throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
        throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
    }
}
