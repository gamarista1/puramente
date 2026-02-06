package com.google.android.datatransport.cct;

import W8.c;
import X8.j;
import X8.k;
import X8.l;
import X8.m;
import X8.n;
import X8.o;
import X8.p;
import Y8.h;
import Y8.i;
import Z8.f;
import Z8.g;
import Z8.m;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import c9.C3193a;
import com.adjust.sdk.Constants;
import d9.C3485b;
import i9.C3597a;
import io.intercom.android.sdk.models.AttributeType;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

final class d implements m {

    /* renamed from: a  reason: collision with root package name */
    private final Zb.a f42765a;

    /* renamed from: b  reason: collision with root package name */
    private final ConnectivityManager f42766b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f42767c;

    /* renamed from: d  reason: collision with root package name */
    final URL f42768d;

    /* renamed from: e  reason: collision with root package name */
    private final C3597a f42769e;

    /* renamed from: f  reason: collision with root package name */
    private final C3597a f42770f;

    /* renamed from: g  reason: collision with root package name */
    private final int f42771g;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        final URL f42772a;

        /* renamed from: b  reason: collision with root package name */
        final j f42773b;

        /* renamed from: c  reason: collision with root package name */
        final String f42774c;

        a(URL url, j jVar, String str) {
            this.f42772a = url;
            this.f42773b = jVar;
            this.f42774c = str;
        }

        /* access modifiers changed from: package-private */
        public a a(URL url) {
            return new a(url, this.f42773b, this.f42774c);
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        final int f42775a;

        /* renamed from: b  reason: collision with root package name */
        final URL f42776b;

        /* renamed from: c  reason: collision with root package name */
        final long f42777c;

        b(int i10, URL url, long j10) {
            this.f42775a = i10;
            this.f42776b = url;
            this.f42777c = j10;
        }
    }

    d(Context context, C3597a aVar, C3597a aVar2, int i10) {
        this.f42765a = j.b();
        this.f42767c = context;
        this.f42766b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f42768d = n(a.f42756c);
        this.f42769e = aVar2;
        this.f42770f = aVar;
        this.f42771g = i10;
    }

    /* access modifiers changed from: private */
    public b e(a aVar) {
        OutputStream outputStream;
        GZIPOutputStream gZIPOutputStream;
        InputStream m10;
        C3193a.f("CctTransportBackend", "Making request to: %s", aVar.f42772a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f42772a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f42771g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", new Object[]{"3.1.9"}));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f42774c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            outputStream = httpURLConnection.getOutputStream();
            gZIPOutputStream = new GZIPOutputStream(outputStream);
            this.f42765a.a(aVar.f42773b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
            gZIPOutputStream.close();
            if (outputStream != null) {
                outputStream.close();
            }
            int responseCode = httpURLConnection.getResponseCode();
            C3193a.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
            C3193a.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
            C3193a.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
            if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
            }
            if (responseCode != 200) {
                return new b(responseCode, (URL) null, 0);
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            try {
                m10 = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                b bVar = new b(responseCode, (URL) null, n.b(new BufferedReader(new InputStreamReader(m10))).c());
                if (m10 != null) {
                    m10.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                return bVar;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
            throw th;
            throw th;
            throw th;
        } catch (ConnectException | UnknownHostException e10) {
            C3193a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e10);
            return new b(500, (URL) null, 0);
        } catch (Zb.b | IOException e11) {
            C3193a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e11);
            return new b(400, (URL) null, 0);
        } catch (Throwable th3) {
            th.addSuppressed(th3);
        }
    }

    private static int f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return o.b.UNKNOWN_MOBILE_SUBTYPE.b();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return o.b.COMBINED.b();
        }
        if (o.b.a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return o.c.NONE.b();
        }
        return networkInfo.getType();
    }

    private static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            C3193a.d("CctTransportBackend", "Unable to find version code for package", e10);
            return -1;
        }
    }

    private j i(f fVar) {
        l.a aVar;
        HashMap hashMap = new HashMap();
        for (i iVar : fVar.b()) {
            String j10 = iVar.j();
            if (!hashMap.containsKey(j10)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                hashMap.put(j10, arrayList);
            } else {
                ((List) hashMap.get(j10)).add(iVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            m.a b10 = X8.m.a().f(p.DEFAULT).g(this.f42770f.a()).h(this.f42769e.a()).b(k.a().c(k.b.ANDROID_FIREBASE).b(X8.a.a().m(Integer.valueOf(iVar2.g("sdk-version"))).j(iVar2.b("model")).f(iVar2.b("hardware")).d(iVar2.b("device")).l(iVar2.b("product")).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b("country")).g(iVar2.b("locale")).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                b10.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b10.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h e10 = iVar3.e();
                c b11 = e10.b();
                if (b11.equals(c.b("proto"))) {
                    aVar = l.j(e10.a());
                } else if (b11.equals(c.b("json"))) {
                    aVar = l.i(new String(e10.a(), Charset.forName(Constants.ENCODING)));
                } else {
                    C3193a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b11);
                }
                aVar.c(iVar3.f()).d(iVar3.k()).h(iVar3.h("tz-offset")).e(o.a().c(o.c.a(iVar3.g("net-type"))).b(o.b.a(iVar3.g("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    aVar.b(iVar3.d());
                }
                arrayList3.add(aVar.a());
            }
            b10.c(arrayList3);
            arrayList2.add(b10.a());
        }
        return j.a(arrayList2);
    }

    private static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService(AttributeType.PHONE);
    }

    static long k() {
        Calendar.getInstance();
        return (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ a l(a aVar, b bVar) {
        URL url = bVar.f42776b;
        if (url == null) {
            return null;
        }
        C3193a.b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f42776b);
    }

    private static InputStream m(InputStream inputStream, String str) {
        if ("gzip".equals(str)) {
            return new GZIPInputStream(inputStream);
        }
        return inputStream;
    }

    private static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    public g a(f fVar) {
        j i10 = i(fVar);
        URL url = this.f42768d;
        String str = null;
        if (fVar.c() != null) {
            try {
                a c10 = a.c(fVar.c());
                if (c10.d() != null) {
                    str = c10.d();
                }
                if (c10.e() != null) {
                    url = n(c10.e());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) C3485b.a(5, new a(url, i10, str), new b(this), new c());
            int i11 = bVar.f42775a;
            if (i11 == 200) {
                return g.e(bVar.f42777c);
            }
            if (i11 < 500) {
                if (i11 != 404) {
                    if (i11 == 400) {
                        return g.d();
                    }
                    return g.a();
                }
            }
            return g.f();
        } catch (IOException e10) {
            C3193a.d("CctTransportBackend", "Could not make request to the backend", e10);
            return g.f();
        }
    }

    public i b(i iVar) {
        NetworkInfo activeNetworkInfo = this.f42766b.getActiveNetworkInfo();
        return iVar.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.f42767c).getSimOperator()).c("application_build", Integer.toString(h(this.f42767c))).d();
    }

    d(Context context, C3597a aVar, C3597a aVar2) {
        this(context, aVar, aVar2, 130000);
    }
}
