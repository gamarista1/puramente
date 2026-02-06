package k2;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.google.common.collect.C4766q;
import com.google.common.collect.C4771w;
import com.google.common.collect.a0;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import i2.C2076a;
import i2.L;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import k2.f;
import nb.p;
import ob.C5120a;

public class l extends C2147b implements f {

    /* renamed from: e  reason: collision with root package name */
    private final boolean f23229e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f23230f;

    /* renamed from: g  reason: collision with root package name */
    private final int f23231g;

    /* renamed from: h  reason: collision with root package name */
    private final int f23232h;

    /* renamed from: i  reason: collision with root package name */
    private final String f23233i;

    /* renamed from: j  reason: collision with root package name */
    private final t f23234j;

    /* renamed from: k  reason: collision with root package name */
    private final t f23235k;

    /* renamed from: l  reason: collision with root package name */
    private final p f23236l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f23237m;

    /* renamed from: n  reason: collision with root package name */
    private j f23238n;

    /* renamed from: o  reason: collision with root package name */
    private HttpURLConnection f23239o;

    /* renamed from: p  reason: collision with root package name */
    private InputStream f23240p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f23241q;

    /* renamed from: r  reason: collision with root package name */
    private int f23242r;

    /* renamed from: s  reason: collision with root package name */
    private long f23243s;

    /* renamed from: t  reason: collision with root package name */
    private long f23244t;

    public static final class b implements f.a {

        /* renamed from: a  reason: collision with root package name */
        private final t f23245a = new t();

        /* renamed from: b  reason: collision with root package name */
        private x f23246b;

        /* renamed from: c  reason: collision with root package name */
        private p f23247c;

        /* renamed from: d  reason: collision with root package name */
        private String f23248d;

        /* renamed from: e  reason: collision with root package name */
        private int f23249e = 8000;

        /* renamed from: f  reason: collision with root package name */
        private int f23250f = 8000;

        /* renamed from: g  reason: collision with root package name */
        private boolean f23251g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f23252h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f23253i;

        /* renamed from: b */
        public l a() {
            l lVar = new l(this.f23248d, this.f23249e, this.f23250f, this.f23251g, this.f23252h, this.f23245a, this.f23247c, this.f23253i);
            x xVar = this.f23246b;
            if (xVar != null) {
                lVar.n(xVar);
            }
            return lVar;
        }

        public b c(String str) {
            this.f23248d = str;
            return this;
        }
    }

    private static class c extends C4766q {

        /* renamed from: a  reason: collision with root package name */
        private final Map f23254a;

        public c(Map map) {
            this.f23254a = map;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ boolean l(Map.Entry entry) {
            if (entry.getKey() != null) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ boolean n(String str) {
            if (str != null) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Map a() {
            return this.f23254a;
        }

        public boolean containsKey(Object obj) {
            if (obj == null || !super.containsKey(obj)) {
                return false;
            }
            return true;
        }

        public boolean containsValue(Object obj) {
            return super.c(obj);
        }

        public Set entrySet() {
            return a0.b(super.entrySet(), new m());
        }

        public boolean equals(Object obj) {
            if (obj == null || !super.e(obj)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return super.g();
        }

        public boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            if (super.size() != 1 || !super.containsKey((Object) null)) {
                return false;
            }
            return true;
        }

        /* renamed from: k */
        public List get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        public Set keySet() {
            return a0.b(super.keySet(), new n());
        }

        public int size() {
            return super.size() - (super.containsKey((Object) null) ? 1 : 0);
        }
    }

    private void A(long j10, j jVar) {
        if (j10 != 0) {
            byte[] bArr = new byte[4096];
            while (j10 > 0) {
                int read = ((InputStream) L.h(this.f23240p)).read(bArr, 0, (int) Math.min(j10, (long) 4096));
                if (Thread.currentThread().isInterrupted()) {
                    throw new q((IOException) new InterruptedIOException(), jVar, 2000, 1);
                } else if (read != -1) {
                    j10 -= (long) read;
                    o(read);
                } else {
                    throw new q(jVar, 2008, 1);
                }
            }
        }
    }

    private void s() {
        HttpURLConnection httpURLConnection = this.f23239o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                i2.p.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f23239o = null;
        }
    }

    private URL t(URL url, String str, j jVar) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!Constants.SCHEME.equals(protocol) && !"http".equals(protocol)) {
                    throw new q("Unsupported protocol redirect: " + protocol, jVar, 2001, 1);
                } else if (this.f23229e || protocol.equals(url.getProtocol())) {
                    return url2;
                } else {
                    if (this.f23230f) {
                        try {
                            return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                        } catch (MalformedURLException e10) {
                            throw new q((IOException) e10, jVar, 2001, 1);
                        }
                    } else {
                        throw new q("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", jVar, 2001, 1);
                    }
                }
            } catch (MalformedURLException e11) {
                throw new q((IOException) e11, jVar, 2001, 1);
            }
        } else {
            throw new q("Null location redirect", jVar, 2001, 1);
        }
    }

    private static boolean u(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection v(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) {
        String str;
        boolean z12;
        HttpURLConnection y10 = y(url);
        y10.setConnectTimeout(this.f23231g);
        y10.setReadTimeout(this.f23232h);
        HashMap hashMap = new HashMap();
        t tVar = this.f23234j;
        if (tVar != null) {
            hashMap.putAll(tVar.a());
        }
        hashMap.putAll(this.f23235k.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            y10.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a10 = u.a(j10, j11);
        if (a10 != null) {
            y10.setRequestProperty("Range", a10);
        }
        String str2 = this.f23233i;
        if (str2 != null) {
            y10.setRequestProperty("User-Agent", str2);
        }
        if (z10) {
            str = "gzip";
        } else {
            str = "identity";
        }
        y10.setRequestProperty("Accept-Encoding", str);
        y10.setInstanceFollowRedirects(z11);
        if (bArr != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        y10.setDoOutput(z12);
        y10.setRequestMethod(j.c(i10));
        if (bArr != null) {
            y10.setFixedLengthStreamingMode(bArr.length);
            y10.connect();
            OutputStream outputStream = y10.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            y10.connect();
        }
        return y10;
    }

    private HttpURLConnection w(j jVar) {
        HttpURLConnection v10;
        j jVar2 = jVar;
        URL url = new URL(jVar2.f23194a.toString());
        int i10 = jVar2.f23196c;
        byte[] bArr = jVar2.f23197d;
        long j10 = jVar2.f23200g;
        long j11 = jVar2.f23201h;
        boolean d10 = jVar2.d(1);
        if (!this.f23229e && !this.f23230f && !this.f23237m) {
            return v(url, i10, bArr, j10, j11, d10, true, jVar2.f23198e);
        }
        int i11 = 0;
        URL url2 = url;
        int i12 = i10;
        byte[] bArr2 = bArr;
        while (true) {
            int i13 = i11 + 1;
            if (i11 <= 20) {
                long j12 = j10;
                long j13 = j10;
                int i14 = i12;
                int i15 = i13;
                URL url3 = url2;
                long j14 = j11;
                v10 = v(url2, i12, bArr2, j12, j11, d10, false, jVar2.f23198e);
                int responseCode = v10.getResponseCode();
                String headerField = v10.getHeaderField("Location");
                if ((i14 == 1 || i14 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    URL url4 = url3;
                    v10.disconnect();
                    url2 = t(url4, headerField, jVar2);
                    i12 = i14;
                } else if (i14 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return v10;
                } else {
                    v10.disconnect();
                    if (!this.f23237m || responseCode != 302) {
                        bArr2 = null;
                        i12 = 1;
                    } else {
                        i12 = i14;
                    }
                    url2 = t(url3, headerField, jVar2);
                }
                i11 = i15;
                j10 = j13;
                j11 = j14;
            } else {
                throw new q((IOException) new NoRouteToHostException("Too many redirects: " + i13), jVar2, 2001, 1);
            }
        }
        return v10;
    }

    private static void x(HttpURLConnection httpURLConnection, long j10) {
        if (httpURLConnection != null && L.f22072a <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j10 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j10 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = ((Class) C2076a.e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", (Class[]) null);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, (Object[]) null);
                }
            } catch (Exception unused) {
            }
        }
    }

    private int z(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f23243s;
        if (j10 != -1) {
            long j11 = j10 - this.f23244t;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min((long) i11, j11);
        }
        int read = ((InputStream) L.h(this.f23240p)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f23244t += (long) read;
        o(read);
        return read;
    }

    public void close() {
        try {
            InputStream inputStream = this.f23240p;
            if (inputStream != null) {
                long j10 = this.f23243s;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f23244t;
                }
                x(this.f23239o, j11);
                inputStream.close();
            }
            this.f23240p = null;
            s();
            if (this.f23241q) {
                this.f23241q = false;
                p();
            }
        } catch (IOException e10) {
            throw new q(e10, (j) L.h(this.f23238n), 2000, 3);
        } catch (Throwable th2) {
            this.f23240p = null;
            s();
            if (this.f23241q) {
                this.f23241q = false;
                p();
            }
            throw th2;
        }
    }

    public Map d() {
        HttpURLConnection httpURLConnection = this.f23239o;
        if (httpURLConnection == null) {
            return C4771w.n();
        }
        return new c(httpURLConnection.getHeaderFields());
    }

    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f23239o;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public long m(j jVar) {
        byte[] bArr;
        g gVar;
        this.f23238n = jVar;
        long j10 = 0;
        this.f23244t = 0;
        this.f23243s = 0;
        q(jVar);
        try {
            HttpURLConnection w10 = w(jVar);
            this.f23239o = w10;
            this.f23242r = w10.getResponseCode();
            String responseMessage = w10.getResponseMessage();
            int i10 = this.f23242r;
            long j11 = -1;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = w10.getHeaderFields();
                if (this.f23242r == 416) {
                    if (jVar.f23200g == u.c(w10.getHeaderField("Content-Range"))) {
                        this.f23241q = true;
                        r(jVar);
                        long j12 = jVar.f23201h;
                        if (j12 != -1) {
                            return j12;
                        }
                        return 0;
                    }
                }
                InputStream errorStream = w10.getErrorStream();
                if (errorStream != null) {
                    try {
                        bArr = C5120a.b(errorStream);
                    } catch (IOException unused) {
                        bArr = L.f22077f;
                    }
                } else {
                    bArr = L.f22077f;
                }
                byte[] bArr2 = bArr;
                s();
                if (this.f23242r == 416) {
                    gVar = new g(2008);
                } else {
                    gVar = null;
                }
                throw new s(this.f23242r, responseMessage, gVar, headerFields, jVar, bArr2);
            }
            String contentType = w10.getContentType();
            p pVar = this.f23236l;
            if (pVar == null || pVar.apply(contentType)) {
                if (this.f23242r == 200) {
                    long j13 = jVar.f23200g;
                    if (j13 != 0) {
                        j10 = j13;
                    }
                }
                boolean u10 = u(w10);
                if (!u10) {
                    long j14 = jVar.f23201h;
                    if (j14 != -1) {
                        this.f23243s = j14;
                    } else {
                        long b10 = u.b(w10.getHeaderField("Content-Length"), w10.getHeaderField("Content-Range"));
                        if (b10 != -1) {
                            j11 = b10 - j10;
                        }
                        this.f23243s = j11;
                    }
                } else {
                    this.f23243s = jVar.f23201h;
                }
                try {
                    this.f23240p = w10.getInputStream();
                    if (u10) {
                        this.f23240p = new GZIPInputStream(this.f23240p);
                    }
                    this.f23241q = true;
                    r(jVar);
                    try {
                        A(j10, jVar);
                        return this.f23243s;
                    } catch (IOException e10) {
                        s();
                        if (e10 instanceof q) {
                            throw ((q) e10);
                        }
                        throw new q(e10, jVar, 2000, 1);
                    }
                } catch (IOException e11) {
                    s();
                    throw new q(e11, jVar, 2000, 1);
                }
            } else {
                s();
                throw new r(contentType, jVar);
            }
        } catch (IOException e12) {
            s();
            throw q.c(e12, jVar, 1);
        }
    }

    public int read(byte[] bArr, int i10, int i11) {
        try {
            return z(bArr, i10, i11);
        } catch (IOException e10) {
            throw q.c(e10, (j) L.h(this.f23238n), 2);
        }
    }

    /* access modifiers changed from: package-private */
    public HttpURLConnection y(URL url) {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
    }

    private l(String str, int i10, int i11, boolean z10, boolean z11, t tVar, p pVar, boolean z12) {
        super(true);
        this.f23233i = str;
        this.f23231g = i10;
        this.f23232h = i11;
        this.f23229e = z10;
        this.f23230f = z11;
        if (!z10 || !z11) {
            this.f23234j = tVar;
            this.f23236l = pVar;
            this.f23235k = new t();
            this.f23237m = z12;
            return;
        }
        throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
    }
}
