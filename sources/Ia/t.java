package ia;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.google.common.collect.C4766q;
import com.google.common.collect.C4771w;
import com.google.common.collect.a0;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import ia.y;
import ja.C3645a;
import ja.M;
import ja.s;
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
import nb.p;

public class t extends C3608f implements y {

    /* renamed from: e  reason: collision with root package name */
    private final boolean f44529e;

    /* renamed from: f  reason: collision with root package name */
    private final int f44530f;

    /* renamed from: g  reason: collision with root package name */
    private final int f44531g;

    /* renamed from: h  reason: collision with root package name */
    private final String f44532h;

    /* renamed from: i  reason: collision with root package name */
    private final y.g f44533i;

    /* renamed from: j  reason: collision with root package name */
    private final y.g f44534j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f44535k;

    /* renamed from: l  reason: collision with root package name */
    private p f44536l;

    /* renamed from: m  reason: collision with root package name */
    private n f44537m;

    /* renamed from: n  reason: collision with root package name */
    private HttpURLConnection f44538n;

    /* renamed from: o  reason: collision with root package name */
    private InputStream f44539o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f44540p;

    /* renamed from: q  reason: collision with root package name */
    private int f44541q;

    /* renamed from: r  reason: collision with root package name */
    private long f44542r;

    /* renamed from: s  reason: collision with root package name */
    private long f44543s;

    public static final class b implements y.c {

        /* renamed from: a  reason: collision with root package name */
        private final y.g f44544a = new y.g();

        /* renamed from: b  reason: collision with root package name */
        private J f44545b;

        /* renamed from: c  reason: collision with root package name */
        private p f44546c;

        /* renamed from: d  reason: collision with root package name */
        private String f44547d;

        /* renamed from: e  reason: collision with root package name */
        private int f44548e = 8000;

        /* renamed from: f  reason: collision with root package name */
        private int f44549f = 8000;

        /* renamed from: g  reason: collision with root package name */
        private boolean f44550g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f44551h;

        /* renamed from: b */
        public t a() {
            t tVar = new t(this.f44547d, this.f44548e, this.f44549f, this.f44550g, this.f44544a, this.f44546c, this.f44551h);
            J j10 = this.f44545b;
            if (j10 != null) {
                tVar.n(j10);
            }
            return tVar;
        }

        public b c(String str) {
            this.f44547d = str;
            return this;
        }
    }

    private static class c extends C4766q {

        /* renamed from: a  reason: collision with root package name */
        private final Map f44552a;

        public c(Map map) {
            this.f44552a = map;
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
            return this.f44552a;
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
            return a0.b(super.entrySet(), new v());
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
            return a0.b(super.keySet(), new u());
        }

        public int size() {
            return super.size() - (super.containsKey((Object) null) ? 1 : 0);
        }
    }

    private void A(long j10, n nVar) {
        if (j10 != 0) {
            byte[] bArr = new byte[4096];
            while (j10 > 0) {
                int read = ((InputStream) M.j(this.f44539o)).read(bArr, 0, (int) Math.min(j10, (long) 4096));
                if (Thread.currentThread().isInterrupted()) {
                    throw new y.d((IOException) new InterruptedIOException(), nVar, 2000, 1);
                } else if (read != -1) {
                    j10 -= (long) read;
                    o(read);
                } else {
                    throw new y.d(nVar, 2008, 1);
                }
            }
        }
    }

    private void s() {
        HttpURLConnection httpURLConnection = this.f44538n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                s.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f44538n = null;
        }
    }

    private URL t(URL url, String str, n nVar) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!Constants.SCHEME.equals(protocol) && !"http".equals(protocol)) {
                    throw new y.d("Unsupported protocol redirect: " + protocol, nVar, 2001, 1);
                } else if (this.f44529e || protocol.equals(url.getProtocol())) {
                    return url2;
                } else {
                    throw new y.d("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", nVar, 2001, 1);
                }
            } catch (MalformedURLException e10) {
                throw new y.d((IOException) e10, nVar, 2001, 1);
            }
        } else {
            throw new y.d("Null location redirect", nVar, 2001, 1);
        }
    }

    private static boolean u(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection v(n nVar) {
        HttpURLConnection w10;
        n nVar2 = nVar;
        URL url = new URL(nVar2.f44456a.toString());
        int i10 = nVar2.f44458c;
        byte[] bArr = nVar2.f44459d;
        long j10 = nVar2.f44462g;
        long j11 = nVar2.f44463h;
        boolean d10 = nVar2.d(1);
        if (!this.f44529e && !this.f44535k) {
            return w(url, i10, bArr, j10, j11, d10, true, nVar2.f44460e);
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
                w10 = w(url2, i12, bArr2, j12, j11, d10, false, nVar2.f44460e);
                int responseCode = w10.getResponseCode();
                String headerField = w10.getHeaderField("Location");
                if ((i14 == 1 || i14 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    URL url4 = url3;
                    w10.disconnect();
                    url2 = t(url4, headerField, nVar2);
                    i12 = i14;
                } else if (i14 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return w10;
                } else {
                    w10.disconnect();
                    if (!this.f44535k || responseCode != 302) {
                        bArr2 = null;
                        i12 = 1;
                    } else {
                        i12 = i14;
                    }
                    url2 = t(url3, headerField, nVar2);
                }
                i11 = i15;
                j10 = j13;
                j11 = j14;
            } else {
                throw new y.d((IOException) new NoRouteToHostException("Too many redirects: " + i13), nVar2, 2001, 1);
            }
        }
        return w10;
    }

    private HttpURLConnection w(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) {
        String str;
        boolean z12;
        HttpURLConnection y10 = y(url);
        y10.setConnectTimeout(this.f44530f);
        y10.setReadTimeout(this.f44531g);
        HashMap hashMap = new HashMap();
        y.g gVar = this.f44533i;
        if (gVar != null) {
            hashMap.putAll(gVar.b());
        }
        hashMap.putAll(this.f44534j.b());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            y10.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a10 = z.a(j10, j11);
        if (a10 != null) {
            y10.setRequestProperty("Range", a10);
        }
        String str2 = this.f44532h;
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
        y10.setRequestMethod(n.c(i10));
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

    private static void x(HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection != null && (i10 = M.f44981a) >= 19 && i10 <= 20) {
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
                    Method declaredMethod = ((Class) C3645a.e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", (Class[]) null);
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
        long j10 = this.f44542r;
        if (j10 != -1) {
            long j11 = j10 - this.f44543s;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min((long) i11, j11);
        }
        int read = ((InputStream) M.j(this.f44539o)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f44543s += (long) read;
        o(read);
        return read;
    }

    public void close() {
        try {
            InputStream inputStream = this.f44539o;
            if (inputStream != null) {
                long j10 = this.f44542r;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f44543s;
                }
                x(this.f44538n, j11);
                inputStream.close();
            }
            this.f44539o = null;
            s();
            if (this.f44540p) {
                this.f44540p = false;
                p();
            }
        } catch (IOException e10) {
            throw new y.d(e10, (n) M.j(this.f44537m), 2000, 3);
        } catch (Throwable th2) {
            this.f44539o = null;
            s();
            if (this.f44540p) {
                this.f44540p = false;
                p();
            }
            throw th2;
        }
    }

    public Map d() {
        HttpURLConnection httpURLConnection = this.f44538n;
        if (httpURLConnection == null) {
            return C4771w.n();
        }
        return new c(httpURLConnection.getHeaderFields());
    }

    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f44538n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public long m(n nVar) {
        byte[] bArr;
        C3613k kVar;
        this.f44537m = nVar;
        long j10 = 0;
        this.f44543s = 0;
        this.f44542r = 0;
        q(nVar);
        try {
            HttpURLConnection v10 = v(nVar);
            this.f44538n = v10;
            this.f44541q = v10.getResponseCode();
            String responseMessage = v10.getResponseMessage();
            int i10 = this.f44541q;
            long j11 = -1;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = v10.getHeaderFields();
                if (this.f44541q == 416) {
                    if (nVar.f44462g == z.c(v10.getHeaderField("Content-Range"))) {
                        this.f44540p = true;
                        r(nVar);
                        long j12 = nVar.f44463h;
                        if (j12 != -1) {
                            return j12;
                        }
                        return 0;
                    }
                }
                InputStream errorStream = v10.getErrorStream();
                if (errorStream != null) {
                    try {
                        bArr = M.V0(errorStream);
                    } catch (IOException unused) {
                        bArr = M.f44986f;
                    }
                } else {
                    bArr = M.f44986f;
                }
                byte[] bArr2 = bArr;
                s();
                if (this.f44541q == 416) {
                    kVar = new C3613k(2008);
                } else {
                    kVar = null;
                }
                throw new y.f(this.f44541q, responseMessage, kVar, headerFields, nVar, bArr2);
            }
            String contentType = v10.getContentType();
            p pVar = this.f44536l;
            if (pVar == null || pVar.apply(contentType)) {
                if (this.f44541q == 200) {
                    long j13 = nVar.f44462g;
                    if (j13 != 0) {
                        j10 = j13;
                    }
                }
                boolean u10 = u(v10);
                if (!u10) {
                    long j14 = nVar.f44463h;
                    if (j14 != -1) {
                        this.f44542r = j14;
                    } else {
                        long b10 = z.b(v10.getHeaderField("Content-Length"), v10.getHeaderField("Content-Range"));
                        if (b10 != -1) {
                            j11 = b10 - j10;
                        }
                        this.f44542r = j11;
                    }
                } else {
                    this.f44542r = nVar.f44463h;
                }
                try {
                    this.f44539o = v10.getInputStream();
                    if (u10) {
                        this.f44539o = new GZIPInputStream(this.f44539o);
                    }
                    this.f44540p = true;
                    r(nVar);
                    try {
                        A(j10, nVar);
                        return this.f44542r;
                    } catch (IOException e10) {
                        s();
                        if (e10 instanceof y.d) {
                            throw ((y.d) e10);
                        }
                        throw new y.d(e10, nVar, 2000, 1);
                    }
                } catch (IOException e11) {
                    s();
                    throw new y.d(e11, nVar, 2000, 1);
                }
            } else {
                s();
                throw new y.e(contentType, nVar);
            }
        } catch (IOException e12) {
            s();
            throw y.d.c(e12, nVar, 1);
        }
    }

    public int read(byte[] bArr, int i10, int i11) {
        try {
            return z(bArr, i10, i11);
        } catch (IOException e10) {
            throw y.d.c(e10, (n) M.j(this.f44537m), 2);
        }
    }

    /* access modifiers changed from: package-private */
    public HttpURLConnection y(URL url) {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
    }

    private t(String str, int i10, int i11, boolean z10, y.g gVar, p pVar, boolean z11) {
        super(true);
        this.f44532h = str;
        this.f44530f = i10;
        this.f44531g = i11;
        this.f44529e = z10;
        this.f44533i = gVar;
        this.f44536l = pVar;
        this.f44534j = new y.g();
        this.f44535k = z11;
    }
}
