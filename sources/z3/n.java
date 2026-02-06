package Z3;

import Af.a;
import H0.C1187h;
import H0.C1193n;
import H0.C1194o;
import H0.E;
import H0.G;
import H0.H;
import H0.U;
import H0.b0;
import H0.c0;
import J0.B;
import J0.r;
import c1.b;
import java.util.Map;
import k0.c;
import k0.i;
import lf.C6514M;
import q0.C2427m;
import q0.C2428n;
import r0.C2547y0;
import t0.C2602c;
import w0.C2817c;

public final class n extends i.c implements r, B {

    /* renamed from: n  reason: collision with root package name */
    private C2817c f10481n;

    /* renamed from: o  reason: collision with root package name */
    private c f10482o;

    /* renamed from: p  reason: collision with root package name */
    private C1187h f10483p;

    /* renamed from: q  reason: collision with root package name */
    private float f10484q;

    /* renamed from: r  reason: collision with root package name */
    private C2547y0 f10485r;

    public n(C2817c cVar, c cVar2, C1187h hVar, float f10, C2547y0 y0Var) {
        this.f10481n = cVar;
        this.f10482o = cVar2;
        this.f10483p = hVar;
        this.f10484q = f10;
        this.f10485r = y0Var;
    }

    private final long m2(long j10) {
        if (C2427m.m(j10)) {
            return C2427m.f25341b.b();
        }
        long k10 = this.f10481n.k();
        if (k10 == C2427m.f25341b.a()) {
            return j10;
        }
        float k11 = C2427m.k(k10);
        if (Float.isInfinite(k11) || Float.isNaN(k11)) {
            k11 = C2427m.k(j10);
        }
        float i10 = C2427m.i(k10);
        if (Float.isInfinite(i10) || Float.isNaN(i10)) {
            i10 = C2427m.i(j10);
        }
        long a10 = C2428n.a(k11, i10);
        long a11 = this.f10483p.a(a10, j10);
        float b10 = b0.b(a11);
        if (Float.isInfinite(b10) || Float.isNaN(b10)) {
            return j10;
        }
        float c10 = b0.c(a11);
        if (Float.isInfinite(c10) || Float.isNaN(c10)) {
            return j10;
        }
        return c0.c(a11, a10);
    }

    /* access modifiers changed from: private */
    public static final C6514M o2(U u10, U.a aVar) {
        U.a.l(aVar, u10, 0, 0, 0.0f, 4, (Object) null);
        return C6514M.f71813a;
    }

    private final long p2(long j10) {
        boolean z10;
        float f10;
        float f11;
        int m10;
        boolean j11 = b.j(j10);
        boolean i10 = b.i(j10);
        if (j11 && i10) {
            return j10;
        }
        if (!b.h(j10) || !b.g(j10)) {
            z10 = false;
        } else {
            z10 = true;
        }
        long k10 = this.f10481n.k();
        if (k10 != C2427m.f25341b.a()) {
            if (!z10 || (!j11 && !i10)) {
                float k11 = C2427m.k(k10);
                float i11 = C2427m.i(k10);
                if (Float.isInfinite(k11) || Float.isNaN(k11)) {
                    f11 = (float) b.n(j10);
                } else {
                    f11 = z.d(j10, k11);
                }
                if (Float.isInfinite(i11) || Float.isNaN(i11)) {
                    m10 = b.m(j10);
                } else {
                    f10 = z.c(j10, i11);
                    long m22 = m2(C2428n.a(f11, f10));
                    float k12 = C2427m.k(m22);
                    float i12 = C2427m.i(m22);
                    return b.d(j10, c1.c.i(j10, a.d(k12)), 0, c1.c.h(j10, a.d(i12)), 0, 10, (Object) null);
                }
            } else {
                f11 = (float) b.l(j10);
                m10 = b.k(j10);
            }
            f10 = (float) m10;
            long m222 = m2(C2428n.a(f11, f10));
            float k122 = C2427m.k(m222);
            float i122 = C2427m.i(m222);
            return b.d(j10, c1.c.i(j10, a.d(k122)), 0, c1.c.h(j10, a.d(i122)), 0, 10, (Object) null);
        } else if (!z10) {
            return j10;
        } else {
            return b.d(j10, b.l(j10), 0, b.k(j10), 0, 10, (Object) null);
        }
    }

    public int B(C1194o oVar, C1193n nVar, int i10) {
        if (this.f10481n.k() == C2427m.f25341b.a()) {
            return nVar.s(i10);
        }
        int s10 = nVar.s(b.l(p2(c1.c.b(0, i10, 0, 0, 13, (Object) null))));
        return Math.max(a.d(C2427m.i(m2(C2428n.a((float) i10, (float) s10)))), s10);
    }

    public int D(C1194o oVar, C1193n nVar, int i10) {
        if (this.f10481n.k() == C2427m.f25341b.a()) {
            return nVar.e0(i10);
        }
        int e02 = nVar.e0(b.l(p2(c1.c.b(0, i10, 0, 0, 13, (Object) null))));
        return Math.max(a.d(C2427m.i(m2(C2428n.a((float) i10, (float) e02)))), e02);
    }

    public int G(C1194o oVar, C1193n nVar, int i10) {
        if (this.f10481n.k() == C2427m.f25341b.a()) {
            return nVar.t0(i10);
        }
        int t02 = nVar.t0(b.k(p2(c1.c.b(0, 0, 0, i10, 7, (Object) null))));
        return Math.max(a.d(C2427m.k(m2(C2428n.a((float) t02, (float) i10)))), t02);
    }

    public boolean Q1() {
        return false;
    }

    public final void c(float f10) {
        this.f10484q = f10;
    }

    public final C2817c n2() {
        return this.f10481n;
    }

    public G o(H h10, E e10, long j10) {
        U v02 = e10.v0(p2(j10));
        return H.N(h10, v02.X0(), v02.R0(), (Map) null, new m(v02), 4, (Object) null);
    }

    public final void q2(c cVar) {
        this.f10482o = cVar;
    }

    public final void r2(C2547y0 y0Var) {
        this.f10485r = y0Var;
    }

    public final void s2(C1187h hVar) {
        this.f10483p = hVar;
    }

    public final void t2(C2817c cVar) {
        this.f10481n = cVar;
    }

    public void u(C2602c cVar) {
        long m22 = m2(cVar.d());
        long a10 = this.f10482o.a(z.m(m22), z.m(cVar.d()), cVar.getLayoutDirection());
        float c10 = (float) c1.n.c(a10);
        float d10 = (float) c1.n.d(a10);
        cVar.w1().e().d(c10, d10);
        this.f10481n.j(cVar, m22, this.f10484q, this.f10485r);
        cVar.w1().e().d(-c10, -d10);
        cVar.H1();
    }

    public int x(C1194o oVar, C1193n nVar, int i10) {
        if (this.f10481n.k() == C2427m.f25341b.a()) {
            return nVar.s0(i10);
        }
        int s02 = nVar.s0(b.k(p2(c1.c.b(0, 0, 0, i10, 7, (Object) null))));
        return Math.max(a.d(C2427m.k(m2(C2428n.a((float) s02, (float) i10)))), s02);
    }
}
