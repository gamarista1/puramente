package S9;

import D9.a;
import I9.h;
import P9.n;
import S9.f;
import T9.g;
import android.net.Uri;
import com.google.common.collect.C4770v;
import ia.C3612j;
import ia.n;
import ja.B;
import ja.C3645a;
import ja.I;
import ja.K;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import k9.C3717q0;
import l9.s0;
import nb.C5108c;
import o9.m;
import q9.C3970e;
import q9.l;

final class i extends n {

    /* renamed from: M  reason: collision with root package name */
    private static final AtomicInteger f34005M = new AtomicInteger();

    /* renamed from: A  reason: collision with root package name */
    private final boolean f34006A;

    /* renamed from: B  reason: collision with root package name */
    private final boolean f34007B;

    /* renamed from: C  reason: collision with root package name */
    private final s0 f34008C;

    /* renamed from: D  reason: collision with root package name */
    private j f34009D;

    /* renamed from: E  reason: collision with root package name */
    private p f34010E;

    /* renamed from: F  reason: collision with root package name */
    private int f34011F;

    /* renamed from: G  reason: collision with root package name */
    private boolean f34012G;

    /* renamed from: H  reason: collision with root package name */
    private volatile boolean f34013H;

    /* renamed from: I  reason: collision with root package name */
    private boolean f34014I;

    /* renamed from: J  reason: collision with root package name */
    private C4770v f34015J;

    /* renamed from: K  reason: collision with root package name */
    private boolean f34016K;

    /* renamed from: L  reason: collision with root package name */
    private boolean f34017L;

    /* renamed from: k  reason: collision with root package name */
    public final int f34018k;

    /* renamed from: l  reason: collision with root package name */
    public final int f34019l;

    /* renamed from: m  reason: collision with root package name */
    public final Uri f34020m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f34021n;

    /* renamed from: o  reason: collision with root package name */
    public final int f34022o;

    /* renamed from: p  reason: collision with root package name */
    private final C3612j f34023p;

    /* renamed from: q  reason: collision with root package name */
    private final ia.n f34024q;

    /* renamed from: r  reason: collision with root package name */
    private final j f34025r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f34026s;

    /* renamed from: t  reason: collision with root package name */
    private final boolean f34027t;

    /* renamed from: u  reason: collision with root package name */
    private final I f34028u;

    /* renamed from: v  reason: collision with root package name */
    private final h f34029v;

    /* renamed from: w  reason: collision with root package name */
    private final List f34030w;

    /* renamed from: x  reason: collision with root package name */
    private final m f34031x;

    /* renamed from: y  reason: collision with root package name */
    private final h f34032y;

    /* renamed from: z  reason: collision with root package name */
    private final B f34033z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private i(h hVar, C3612j jVar, ia.n nVar, C3717q0 q0Var, boolean z10, C3612j jVar2, ia.n nVar2, boolean z11, Uri uri, List list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, I i13, m mVar, j jVar3, h hVar2, B b10, boolean z15, s0 s0Var) {
        super(jVar, nVar, q0Var, i10, obj, j10, j11, j12);
        ia.n nVar3 = nVar2;
        this.f34006A = z10;
        this.f34022o = i11;
        this.f34017L = z12;
        this.f34019l = i12;
        this.f34024q = nVar3;
        this.f34023p = jVar2;
        this.f34012G = nVar3 != null;
        this.f34007B = z11;
        this.f34020m = uri;
        this.f34026s = z14;
        this.f34028u = i13;
        this.f34027t = z13;
        this.f34029v = hVar;
        this.f34030w = list;
        this.f34031x = mVar;
        this.f34025r = jVar3;
        this.f34032y = hVar2;
        this.f34033z = b10;
        this.f34021n = z15;
        this.f34008C = s0Var;
        this.f34015J = C4770v.E();
        this.f34018k = f34005M.getAndIncrement();
    }

    private static C3612j i(C3612j jVar, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return jVar;
        }
        C3645a.e(bArr2);
        return new a(jVar, bArr, bArr2);
    }

    public static i j(h hVar, C3612j jVar, C3717q0 q0Var, long j10, g gVar, f.e eVar, Uri uri, List list, int i10, Object obj, boolean z10, s sVar, i iVar, byte[] bArr, byte[] bArr2, boolean z11, s0 s0Var) {
        boolean z12;
        boolean z13;
        ia.n nVar;
        C3612j jVar2;
        B b10;
        h hVar2;
        j jVar3;
        C3612j jVar4 = jVar;
        g gVar2 = gVar;
        f.e eVar2 = eVar;
        i iVar2 = iVar;
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        g.e eVar3 = eVar2.f34000a;
        ia.n a10 = new n.b().i(K.e(gVar2.f34331a, eVar3.f34294a)).h(eVar3.f34302i).g(eVar3.f34303j).b(eVar2.f34003d ? 8 : 0).a();
        boolean z14 = bArr3 != null;
        C3612j i11 = i(jVar4, bArr3, z14 ? l((String) C3645a.e(eVar3.f34301h)) : null);
        g.d dVar = eVar3.f34295b;
        if (dVar != null) {
            boolean z15 = bArr4 != null;
            byte[] l10 = z15 ? l((String) C3645a.e(dVar.f34301h)) : null;
            z12 = z14;
            nVar = new ia.n(K.e(gVar2.f34331a, dVar.f34294a), dVar.f34302i, dVar.f34303j);
            jVar2 = i(jVar4, bArr4, l10);
            z13 = z15;
        } else {
            z12 = z14;
            jVar2 = null;
            nVar = null;
            z13 = false;
        }
        long j11 = j10 + eVar3.f34298e;
        long j12 = j11 + eVar3.f34296c;
        int i12 = gVar2.f34274j + eVar3.f34297d;
        if (iVar2 != null) {
            ia.n nVar2 = iVar2.f34024q;
            boolean z16 = nVar == nVar2 || (nVar != null && nVar2 != null && nVar.f44456a.equals(nVar2.f44456a) && nVar.f44462g == iVar2.f34024q.f44462g);
            boolean z17 = uri.equals(iVar2.f34020m) && iVar2.f34014I;
            h hVar3 = iVar2.f34032y;
            hVar2 = hVar3;
            b10 = iVar2.f34033z;
            jVar3 = (!z16 || !z17 || iVar2.f34016K || iVar2.f34019l != i12) ? null : iVar2.f34009D;
        } else {
            Uri uri2 = uri;
            hVar2 = new h();
            b10 = new B(10);
            jVar3 = null;
        }
        return new i(hVar, i11, a10, q0Var, z12, jVar2, nVar, z13, uri, list, i10, obj, j11, j12, eVar2.f34001b, eVar2.f34002c, !eVar2.f34003d, i12, eVar3.f34304k, z10, sVar.a(i12), eVar3.f34299f, jVar3, hVar2, b10, z11, s0Var);
    }

    private void k(C3612j jVar, ia.n nVar, boolean z10, boolean z11) {
        ia.n nVar2;
        C3970e u10;
        long j10;
        long j11;
        boolean z12 = false;
        if (z10) {
            if (this.f34011F != 0) {
                z12 = true;
            }
            nVar2 = nVar;
        } else {
            nVar2 = nVar.e((long) this.f34011F);
        }
        try {
            u10 = u(jVar, nVar2, z11);
            if (z12) {
                u10.j(this.f34011F);
            }
            do {
                if (this.f34013H || !this.f34009D.a(u10)) {
                    break;
                }
                break;
                break;
            } while (!this.f34009D.a(u10));
            break;
            j10 = u10.getPosition();
            j11 = nVar.f44462g;
        } catch (EOFException e10) {
            if ((this.f33603d.f45763e & 16384) != 0) {
                this.f34009D.g();
                j10 = u10.getPosition();
                j11 = nVar.f44462g;
            } else {
                throw e10;
            }
        } catch (Throwable th2) {
            ia.m.a(jVar);
            throw th2;
        }
        this.f34011F = (int) (j10 - j11);
        ia.m.a(jVar);
    }

    private static byte[] l(String str) {
        int i10;
        if (C5108c.e(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        if (byteArray.length > 16) {
            i10 = byteArray.length - 16;
        } else {
            i10 = 0;
        }
        System.arraycopy(byteArray, i10, bArr, (16 - byteArray.length) + i10, byteArray.length - i10);
        return bArr;
    }

    private static boolean p(f.e eVar, g gVar) {
        g.e eVar2 = eVar.f34000a;
        if (!(eVar2 instanceof g.b)) {
            return gVar.f34333c;
        }
        if (((g.b) eVar2).f34287l || (eVar.f34002c == 0 && gVar.f34333c)) {
            return true;
        }
        return false;
    }

    private void r() {
        k(this.f33608i, this.f33601b, this.f34006A, true);
    }

    private void s() {
        if (this.f34012G) {
            C3645a.e(this.f34023p);
            C3645a.e(this.f34024q);
            k(this.f34023p, this.f34024q, this.f34007B, false);
            this.f34011F = 0;
            this.f34012G = false;
        }
    }

    private long t(l lVar) {
        lVar.e();
        try {
            this.f34033z.L(10);
            lVar.l(this.f34033z.d(), 0, 10);
            if (this.f34033z.G() != 4801587) {
                return -9223372036854775807L;
            }
            this.f34033z.Q(3);
            int C10 = this.f34033z.C();
            int i10 = C10 + 10;
            if (i10 > this.f34033z.b()) {
                byte[] d10 = this.f34033z.d();
                this.f34033z.L(i10);
                System.arraycopy(d10, 0, this.f34033z.d(), 0, 10);
            }
            lVar.l(this.f34033z.d(), 10, C10);
            a e10 = this.f34032y.e(this.f34033z.d(), C10);
            if (e10 == null) {
                return -9223372036854775807L;
            }
            int d11 = e10.d();
            for (int i11 = 0; i11 < d11; i11++) {
                a.b c10 = e10.c(i11);
                if (c10 instanceof I9.l) {
                    I9.l lVar2 = (I9.l) c10;
                    if ("com.apple.streaming.transportStreamTimestamp".equals(lVar2.f31819b)) {
                        System.arraycopy(lVar2.f31820c, 0, this.f34033z.d(), 0, 8);
                        this.f34033z.P(0);
                        this.f34033z.O(8);
                        return this.f34033z.w() & 8589934591L;
                    }
                }
            }
            return -9223372036854775807L;
        } catch (EOFException unused) {
        }
    }

    private C3970e u(C3612j jVar, ia.n nVar, boolean z10) {
        j jVar2;
        long j10;
        long m10 = jVar.m(nVar);
        if (z10) {
            try {
                this.f34028u.h(this.f34026s, this.f33606g);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        }
        C3970e eVar = new C3970e(jVar, nVar.f44462g, m10);
        if (this.f34009D == null) {
            long t10 = t(eVar);
            eVar.e();
            j jVar3 = this.f34025r;
            if (jVar3 != null) {
                jVar2 = jVar3.j();
            } else {
                jVar2 = this.f34029v.a(nVar.f44456a, this.f33603d, this.f34030w, this.f34028u, jVar.d(), eVar, this.f34008C);
            }
            this.f34009D = jVar2;
            if (jVar2.i()) {
                p pVar = this.f34010E;
                if (t10 != -9223372036854775807L) {
                    j10 = this.f34028u.b(t10);
                } else {
                    j10 = this.f33606g;
                }
                pVar.n0(j10);
            } else {
                this.f34010E.n0(0);
            }
            this.f34010E.Z();
            this.f34009D.f(this.f34010E);
        }
        this.f34010E.k0(this.f34031x);
        return eVar;
    }

    public static boolean w(i iVar, Uri uri, g gVar, f.e eVar, long j10) {
        if (iVar == null) {
            return false;
        }
        if (uri.equals(iVar.f34020m) && iVar.f34014I) {
            return false;
        }
        long j11 = j10 + eVar.f34000a.f34298e;
        if (!p(eVar, gVar) || j11 < iVar.f33607h) {
            return true;
        }
        return false;
    }

    public void a() {
        j jVar;
        C3645a.e(this.f34010E);
        if (this.f34009D == null && (jVar = this.f34025r) != null && jVar.h()) {
            this.f34009D = this.f34025r;
            this.f34012G = false;
        }
        s();
        if (!this.f34013H) {
            if (!this.f34027t) {
                r();
            }
            this.f34014I = !this.f34013H;
        }
    }

    public void b() {
        this.f34013H = true;
    }

    public boolean h() {
        return this.f34014I;
    }

    public int m(int i10) {
        C3645a.f(!this.f34021n);
        if (i10 >= this.f34015J.size()) {
            return 0;
        }
        return ((Integer) this.f34015J.get(i10)).intValue();
    }

    public void n(p pVar, C4770v vVar) {
        this.f34010E = pVar;
        this.f34015J = vVar;
    }

    public void o() {
        this.f34016K = true;
    }

    public boolean q() {
        return this.f34017L;
    }

    public void v() {
        this.f34017L = true;
    }
}
