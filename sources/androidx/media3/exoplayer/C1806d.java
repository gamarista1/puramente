package androidx.media3.exoplayer;

import androidx.media3.exoplayer.r0;
import f2.H;
import f2.s;
import i2.C2076a;
import i2.C2078c;
import i2.L;
import l2.f;
import m2.w;
import m2.y;
import m2.z;
import n2.u1;
import t2.C2615C;
import t2.Z;

/* renamed from: androidx.media3.exoplayer.d  reason: case insensitive filesystem */
public abstract class C1806d implements q0, r0 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f17618a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final int f17619b;

    /* renamed from: c  reason: collision with root package name */
    private final w f17620c;

    /* renamed from: d  reason: collision with root package name */
    private z f17621d;

    /* renamed from: e  reason: collision with root package name */
    private int f17622e;

    /* renamed from: f  reason: collision with root package name */
    private u1 f17623f;

    /* renamed from: g  reason: collision with root package name */
    private C2078c f17624g;

    /* renamed from: h  reason: collision with root package name */
    private int f17625h;

    /* renamed from: i  reason: collision with root package name */
    private Z f17626i;

    /* renamed from: j  reason: collision with root package name */
    private s[] f17627j;

    /* renamed from: k  reason: collision with root package name */
    private long f17628k;

    /* renamed from: l  reason: collision with root package name */
    private long f17629l;

    /* renamed from: m  reason: collision with root package name */
    private long f17630m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f17631n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f17632o;

    /* renamed from: p  reason: collision with root package name */
    private H f17633p;

    /* renamed from: q  reason: collision with root package name */
    private r0.a f17634q;

    public C1806d(int i10) {
        this.f17619b = i10;
        this.f17620c = new w();
        this.f17630m = Long.MIN_VALUE;
        this.f17633p = H.f19735a;
    }

    private void n0(long j10, boolean z10) {
        this.f17631n = false;
        this.f17629l = j10;
        this.f17630m = j10;
        e0(j10, z10);
    }

    public y A() {
        return null;
    }

    public final void C() {
        synchronized (this.f17618a) {
            this.f17634q = null;
        }
    }

    public final void D(int i10, u1 u1Var, C2078c cVar) {
        this.f17622e = i10;
        this.f17623f = u1Var;
        this.f17624g = cVar;
        d0();
    }

    public final void G(z zVar, s[] sVarArr, Z z10, long j10, boolean z11, boolean z12, long j11, long j12, C2615C.b bVar) {
        boolean z13;
        boolean z14 = z11;
        if (this.f17625h == 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        C2076a.g(z13);
        this.f17621d = zVar;
        this.f17625h = 1;
        c0(z14, z12);
        O(sVarArr, z10, j11, j12, bVar);
        n0(j11, z14);
    }

    public final void N(H h10) {
        if (!L.c(this.f17633p, h10)) {
            this.f17633p = h10;
            l0(h10);
        }
    }

    public final void O(s[] sVarArr, Z z10, long j10, long j11, C2615C.b bVar) {
        C2076a.g(!this.f17631n);
        this.f17626i = z10;
        if (this.f17630m == Long.MIN_VALUE) {
            this.f17630m = j10;
        }
        this.f17627j = sVarArr;
        this.f17628k = j11;
        k0(sVarArr, j10, j11, bVar);
    }

    public final void P(r0.a aVar) {
        synchronized (this.f17618a) {
            this.f17634q = aVar;
        }
    }

    /* access modifiers changed from: protected */
    public final C1810h R(Throwable th2, s sVar, int i10) {
        return S(th2, sVar, false, i10);
    }

    /* access modifiers changed from: protected */
    public final C1810h S(Throwable th2, s sVar, boolean z10, int i10) {
        int i11;
        if (sVar != null && !this.f17632o) {
            this.f17632o = true;
            try {
                i11 = r0.B(a(sVar));
            } catch (C1810h unused) {
            } finally {
                this.f17632o = false;
            }
            return C1810h.b(th2, getName(), W(), sVar, i11, z10, i10);
        }
        i11 = 4;
        return C1810h.b(th2, getName(), W(), sVar, i11, z10, i10);
    }

    /* access modifiers changed from: protected */
    public final C2078c T() {
        return (C2078c) C2076a.e(this.f17624g);
    }

    /* access modifiers changed from: protected */
    public final z U() {
        return (z) C2076a.e(this.f17621d);
    }

    /* access modifiers changed from: protected */
    public final w V() {
        this.f17620c.a();
        return this.f17620c;
    }

    /* access modifiers changed from: protected */
    public final int W() {
        return this.f17622e;
    }

    /* access modifiers changed from: protected */
    public final long X() {
        return this.f17629l;
    }

    /* access modifiers changed from: protected */
    public final u1 Y() {
        return (u1) C2076a.e(this.f17623f);
    }

    /* access modifiers changed from: protected */
    public final s[] Z() {
        return (s[]) C2076a.e(this.f17627j);
    }

    /* access modifiers changed from: protected */
    public final boolean a0() {
        if (h()) {
            return this.f17631n;
        }
        return ((Z) C2076a.e(this.f17626i)).d();
    }

    /* access modifiers changed from: protected */
    public abstract void b0();

    /* access modifiers changed from: protected */
    public void c0(boolean z10, boolean z11) {
    }

    /* access modifiers changed from: protected */
    public void d0() {
    }

    public final void disable() {
        boolean z10 = true;
        if (this.f17625h != 1) {
            z10 = false;
        }
        C2076a.g(z10);
        this.f17620c.a();
        this.f17625h = 0;
        this.f17626i = null;
        this.f17627j = null;
        this.f17631n = false;
        b0();
    }

    public final int e() {
        return this.f17619b;
    }

    /* access modifiers changed from: protected */
    public abstract void e0(long j10, boolean z10);

    /* access modifiers changed from: protected */
    public void f0() {
    }

    /* access modifiers changed from: protected */
    public final void g0() {
        r0.a aVar;
        synchronized (this.f17618a) {
            aVar = this.f17634q;
        }
        if (aVar != null) {
            aVar.c(this);
        }
    }

    public final int getState() {
        return this.f17625h;
    }

    public final boolean h() {
        if (this.f17630m == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void h0() {
    }

    /* access modifiers changed from: protected */
    public void i0() {
    }

    /* access modifiers changed from: protected */
    public void j0() {
    }

    public final void k() {
        this.f17631n = true;
    }

    /* access modifiers changed from: protected */
    public final int m0(w wVar, f fVar, int i10) {
        int a10 = ((Z) C2076a.e(this.f17626i)).a(wVar, fVar, i10);
        if (a10 == -4) {
            if (fVar.m()) {
                this.f17630m = Long.MIN_VALUE;
                if (this.f17631n) {
                    return -4;
                }
                return -3;
            }
            long j10 = fVar.f23522f + this.f17628k;
            fVar.f23522f = j10;
            this.f17630m = Math.max(this.f17630m, j10);
        } else if (a10 == -5) {
            s sVar = (s) C2076a.e(wVar.f23734b);
            if (sVar.f20088s != Long.MAX_VALUE) {
                wVar.f23734b = sVar.a().s0(sVar.f20088s + this.f17628k).K();
            }
        }
        return a10;
    }

    /* access modifiers changed from: protected */
    public int o0(long j10) {
        return ((Z) C2076a.e(this.f17626i)).k(j10 - this.f17628k);
    }

    public void p(int i10, Object obj) {
    }

    public final void q() {
        ((Z) C2076a.e(this.f17626i)).e();
    }

    public final boolean r() {
        return this.f17631n;
    }

    public final void release() {
        boolean z10;
        if (this.f17625h == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        f0();
    }

    public final void reset() {
        boolean z10;
        if (this.f17625h == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        this.f17620c.a();
        h0();
    }

    public final void start() {
        boolean z10 = true;
        if (this.f17625h != 1) {
            z10 = false;
        }
        C2076a.g(z10);
        this.f17625h = 2;
        i0();
    }

    public final void stop() {
        boolean z10;
        if (this.f17625h == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        this.f17625h = 1;
        j0();
    }

    public final r0 t() {
        return this;
    }

    public int w() {
        return 0;
    }

    public final Z x() {
        return this.f17626i;
    }

    public final long y() {
        return this.f17630m;
    }

    public final void z(long j10) {
        n0(j10, false);
    }

    /* access modifiers changed from: protected */
    public void l0(H h10) {
    }

    /* access modifiers changed from: protected */
    public void k0(s[] sVarArr, long j10, long j11, C2615C.b bVar) {
    }
}
