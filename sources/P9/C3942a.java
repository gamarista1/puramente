package p9;

import android.net.Uri;
import com.adjust.sdk.network.ErrorCodes;
import com.google.common.util.concurrent.k;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import ia.C3608f;
import ia.C3613k;
import ia.n;
import ia.y;
import ia.z;
import ja.C3645a;
import ja.M;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import k9.C3711n0;
import nb.p;
import rh.C;
import rh.C6707d;
import rh.C6708e;
import rh.C6709f;
import rh.D;
import rh.E;
import rh.F;
import rh.v;

/* renamed from: p9.a  reason: case insensitive filesystem */
public class C3942a extends C3608f implements y {

    /* renamed from: e  reason: collision with root package name */
    private final C6708e.a f47586e;

    /* renamed from: f  reason: collision with root package name */
    private final y.g f47587f;

    /* renamed from: g  reason: collision with root package name */
    private final String f47588g;

    /* renamed from: h  reason: collision with root package name */
    private final C6707d f47589h;

    /* renamed from: i  reason: collision with root package name */
    private final y.g f47590i;

    /* renamed from: j  reason: collision with root package name */
    private p f47591j;

    /* renamed from: k  reason: collision with root package name */
    private n f47592k;

    /* renamed from: l  reason: collision with root package name */
    private E f47593l;

    /* renamed from: m  reason: collision with root package name */
    private InputStream f47594m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f47595n;

    /* renamed from: o  reason: collision with root package name */
    private long f47596o;

    /* renamed from: p  reason: collision with root package name */
    private long f47597p;

    /* renamed from: p9.a$a  reason: collision with other inner class name */
    class C0716a implements C6709f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f47598a;

        C0716a(C3942a aVar, k kVar) {
            this.f47598a = kVar;
        }

        public void onFailure(C6708e eVar, IOException iOException) {
            this.f47598a.y(iOException);
        }

        public void onResponse(C6708e eVar, E e10) {
            this.f47598a.x(e10);
        }
    }

    static {
        C3711n0.a("goog.exo.okhttp");
    }

    public C3942a(C6708e.a aVar, String str, C6707d dVar, y.g gVar) {
        this(aVar, str, dVar, gVar, (p) null);
    }

    private void s() {
        E e10 = this.f47593l;
        if (e10 != null) {
            ((F) C3645a.e(e10.a())).close();
            this.f47593l = null;
        }
        this.f47594m = null;
    }

    private E t(C6708e eVar) {
        k z10 = k.z();
        FirebasePerfOkHttpClient.enqueue(eVar, new C0716a(this, z10));
        try {
            return (E) z10.get();
        } catch (InterruptedException unused) {
            eVar.cancel();
            throw new InterruptedIOException();
        } catch (ExecutionException e10) {
            throw new IOException(e10);
        }
    }

    private C u(n nVar) {
        long j10 = nVar.f44462g;
        long j11 = nVar.f44463h;
        v m10 = v.m(nVar.f44456a.toString());
        if (m10 != null) {
            C.a n10 = new C.a().n(m10);
            C6707d dVar = this.f47589h;
            if (dVar != null) {
                n10.c(dVar);
            }
            HashMap hashMap = new HashMap();
            y.g gVar = this.f47590i;
            if (gVar != null) {
                hashMap.putAll(gVar.b());
            }
            hashMap.putAll(this.f47587f.b());
            hashMap.putAll(nVar.f44460e);
            for (Map.Entry entry : hashMap.entrySet()) {
                n10.e((String) entry.getKey(), (String) entry.getValue());
            }
            String a10 = z.a(j10, j11);
            if (a10 != null) {
                n10.a("Range", a10);
            }
            String str = this.f47588g;
            if (str != null) {
                n10.a("User-Agent", str);
            }
            if (!nVar.d(1)) {
                n10.a("Accept-Encoding", "identity");
            }
            byte[] bArr = nVar.f44459d;
            D d10 = null;
            if (bArr != null) {
                d10 = D.create((rh.y) null, bArr);
            } else if (nVar.f44458c == 2) {
                d10 = D.create((rh.y) null, M.f44986f);
            }
            n10.g(nVar.b(), d10);
            return n10.b();
        }
        throw new y.d("Malformed URL", nVar, (int) ErrorCodes.PROTOCOL_EXCEPTION, 1);
    }

    private int v(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f47596o;
        if (j10 != -1) {
            long j11 = j10 - this.f47597p;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min((long) i11, j11);
        }
        int read = ((InputStream) M.j(this.f47594m)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f47597p += (long) read;
        o(read);
        return read;
    }

    private void w(long j10, n nVar) {
        if (j10 != 0) {
            byte[] bArr = new byte[4096];
            while (j10 > 0) {
                try {
                    int read = ((InputStream) M.j(this.f47594m)).read(bArr, 0, (int) Math.min(j10, (long) 4096));
                    if (Thread.currentThread().isInterrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        j10 -= (long) read;
                        o(read);
                    } else {
                        throw new y.d(nVar, 2008, 1);
                    }
                } catch (IOException e10) {
                    if (e10 instanceof y.d) {
                        throw ((y.d) e10);
                    }
                    throw new y.d(nVar, 2000, 1);
                }
            }
        }
    }

    public void close() {
        if (this.f47595n) {
            this.f47595n = false;
            p();
            s();
        }
    }

    public Map d() {
        E e10 = this.f47593l;
        if (e10 == null) {
            return Collections.emptyMap();
        }
        return e10.F().v();
    }

    public Uri getUri() {
        E e10 = this.f47593l;
        if (e10 == null) {
            return null;
        }
        return Uri.parse(e10.g0().l().toString());
    }

    public long m(n nVar) {
        String str;
        byte[] bArr;
        C3613k kVar;
        this.f47592k = nVar;
        long j10 = 0;
        this.f47597p = 0;
        this.f47596o = 0;
        q(nVar);
        try {
            E t10 = t(this.f47586e.a(u(nVar)));
            this.f47593l = t10;
            F f10 = (F) C3645a.e(t10.a());
            this.f47594m = f10.a();
            int o10 = t10.o();
            long j11 = -1;
            if (!t10.m0()) {
                if (o10 == 416) {
                    if (nVar.f44462g == z.c(t10.F().a("Content-Range"))) {
                        this.f47595n = true;
                        r(nVar);
                        long j12 = nVar.f44463h;
                        if (j12 != -1) {
                            return j12;
                        }
                        return 0;
                    }
                }
                try {
                    bArr = M.V0((InputStream) C3645a.e(this.f47594m));
                } catch (IOException unused) {
                    bArr = M.f44986f;
                }
                byte[] bArr2 = bArr;
                Map v10 = t10.F().v();
                s();
                if (o10 == 416) {
                    kVar = new C3613k(2008);
                } else {
                    kVar = null;
                }
                throw new y.f(o10, t10.M(), kVar, v10, nVar, bArr2);
            }
            rh.y q10 = f10.q();
            if (q10 != null) {
                str = q10.toString();
            } else {
                str = "";
            }
            p pVar = this.f47591j;
            if (pVar == null || pVar.apply(str)) {
                if (o10 == 200) {
                    long j13 = nVar.f44462g;
                    if (j13 != 0) {
                        j10 = j13;
                    }
                }
                long j14 = nVar.f44463h;
                if (j14 != -1) {
                    this.f47596o = j14;
                } else {
                    long o11 = f10.o();
                    if (o11 != -1) {
                        j11 = o11 - j10;
                    }
                    this.f47596o = j11;
                }
                this.f47595n = true;
                r(nVar);
                try {
                    w(j10, nVar);
                    return this.f47596o;
                } catch (y.d e10) {
                    s();
                    throw e10;
                }
            } else {
                s();
                throw new y.e(str, nVar);
            }
        } catch (IOException e11) {
            throw y.d.c(e11, nVar, 1);
        }
    }

    public int read(byte[] bArr, int i10, int i11) {
        try {
            return v(bArr, i10, i11);
        } catch (IOException e10) {
            throw y.d.c(e10, (n) M.j(this.f47592k), 2);
        }
    }

    private C3942a(C6708e.a aVar, String str, C6707d dVar, y.g gVar, p pVar) {
        super(true);
        this.f47586e = (C6708e.a) C3645a.e(aVar);
        this.f47588g = str;
        this.f47589h = dVar;
        this.f47590i = gVar;
        this.f47591j = pVar;
        this.f47587f = new y.g();
    }
}
