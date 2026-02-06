package J0;

import a0.C1538b;
import c1.d;
import c1.s;
import c1.t;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2514n0;
import r0.C2520p0;
import r0.C2547y0;
import r0.H1;
import r0.S1;
import r0.T1;
import t0.C2600a;
import t0.C2602c;
import t0.C2603d;
import t0.C2605f;
import t0.C2606g;
import u0.C2673c;

public final class I implements C2605f, C2602c {

    /* renamed from: a  reason: collision with root package name */
    private final C2600a f3603a;

    /* renamed from: b  reason: collision with root package name */
    private r f3604b;

    public I(C2600a aVar) {
        this.f3603a = aVar;
    }

    public long B1(long j10) {
        return this.f3603a.B1(j10);
    }

    public float E(int i10) {
        return this.f3603a.E(i10);
    }

    public int E0(float f10) {
        return this.f3603a.E0(f10);
    }

    public void G1(long j10, long j11, long j12, float f10, int i10, T1 t12, float f11, C2547y0 y0Var, int i11) {
        this.f3603a.G1(j10, j11, j12, f10, i10, t12, f11, y0Var, i11);
    }

    public void H1() {
        C2520p0 f10 = w1().f();
        r rVar = this.f3604b;
        C6496s.e(rVar);
        i.c a10 = J.b(rVar);
        if (a10 != null) {
            int a11 = C1239e0.a(4);
            C1538b bVar = null;
            while (a10 != null) {
                if (a10 instanceof r) {
                    o((r) a10, f10, w1().i());
                } else if ((a10.N1() & a11) != 0 && (a10 instanceof C1247m)) {
                    int i10 = 0;
                    for (i.c m22 = ((C1247m) a10).m2(); m22 != null; m22 = m22.J1()) {
                        if ((m22.N1() & a11) != 0) {
                            i10++;
                            if (i10 == 1) {
                                a10 = m22;
                            } else {
                                if (bVar == null) {
                                    bVar = new C1538b(new i.c[16], 0);
                                }
                                if (a10 != null) {
                                    bVar.b(a10);
                                    a10 = null;
                                }
                                bVar.b(m22);
                            }
                        }
                    }
                    if (i10 == 1) {
                    }
                }
                a10 = C1245k.g(bVar);
            }
            return;
        }
        C1235c0 h10 = C1245k.h(rVar, C1239e0.a(4));
        if (h10.D2() == rVar.v0()) {
            h10 = h10.E2();
            C6496s.e(h10);
        }
        h10.Z2(f10, w1().i());
    }

    public void I0(C2514n0 n0Var, long j10, long j11, float f10, int i10, T1 t12, float f11, C2547y0 y0Var, int i11) {
        this.f3603a.I0(n0Var, j10, j11, f10, i10, t12, f11, y0Var, i11);
    }

    public void K(C2514n0 n0Var, long j10, long j11, long j12, float f10, C2606g gVar, C2547y0 y0Var, int i10) {
        this.f3603a.K(n0Var, j10, j11, j12, f10, gVar, y0Var, i10);
    }

    public float N0(long j10) {
        return this.f3603a.N0(j10);
    }

    public long P(float f10) {
        return this.f3603a.P(f10);
    }

    public long Q(long j10) {
        return this.f3603a.Q(j10);
    }

    public float V(long j10) {
        return this.f3603a.V(j10);
    }

    public void X(long j10, long j11, long j12, long j13, C2606g gVar, float f10, C2547y0 y0Var, int i10) {
        this.f3603a.X(j10, j11, j12, j13, gVar, f10, y0Var, i10);
    }

    public final void a(C2520p0 p0Var, long j10, C1235c0 c0Var, i.c cVar, C2673c cVar2) {
        int a10 = C1239e0.a(4);
        i.c cVar3 = cVar;
        C1538b bVar = null;
        while (cVar3 != null) {
            if (cVar3 instanceof r) {
                e(p0Var, j10, c0Var, (r) cVar3, cVar2);
            } else if ((cVar3.N1() & a10) != 0 && (cVar3 instanceof C1247m)) {
                int i10 = 0;
                for (i.c m22 = ((C1247m) cVar3).m2(); m22 != null; m22 = m22.J1()) {
                    if ((m22.N1() & a10) != 0) {
                        i10++;
                        if (i10 == 1) {
                            cVar3 = m22;
                        } else {
                            if (bVar == null) {
                                bVar = new C1538b(new i.c[16], 0);
                            }
                            if (cVar3 != null) {
                                bVar.b(cVar3);
                                cVar3 = null;
                            }
                            bVar.b(m22);
                        }
                    }
                }
                if (i10 == 1) {
                }
            }
            cVar3 = C1245k.g(bVar);
        }
    }

    public long d() {
        return this.f3603a.d();
    }

    public void d0(long j10, float f10, long j11, float f11, C2606g gVar, C2547y0 y0Var, int i10) {
        this.f3603a.d0(j10, f10, j11, f11, gVar, y0Var, i10);
    }

    public final void e(C2520p0 p0Var, long j10, C1235c0 c0Var, r rVar, C2673c cVar) {
        r rVar2 = rVar;
        r rVar3 = this.f3604b;
        this.f3604b = rVar2;
        C2600a aVar = this.f3603a;
        t layoutDirection = c0Var.getLayoutDirection();
        d density = aVar.w1().getDensity();
        t layoutDirection2 = aVar.w1().getLayoutDirection();
        C2520p0 f10 = aVar.w1().f();
        long d10 = aVar.w1().d();
        C2673c i10 = aVar.w1().i();
        C2603d w12 = aVar.w1();
        w12.b(c0Var);
        w12.a(layoutDirection);
        C2520p0 p0Var2 = p0Var;
        w12.c(p0Var);
        w12.h(j10);
        w12.g(cVar);
        p0Var.q();
        try {
            rVar2.u(this);
            p0Var.h();
            C2603d w13 = aVar.w1();
            w13.b(density);
            w13.a(layoutDirection2);
            w13.c(f10);
            w13.h(d10);
            w13.g(i10);
            this.f3604b = rVar3;
        } catch (Throwable th2) {
            Throwable th3 = th2;
            p0Var.h();
            C2603d w14 = aVar.w1();
            w14.b(density);
            w14.a(layoutDirection2);
            w14.c(f10);
            w14.h(d10);
            w14.g(i10);
            throw th3;
        }
    }

    public long f0(int i10) {
        return this.f3603a.f0(i10);
    }

    public long g0(float f10) {
        return this.f3603a.g0(f10);
    }

    public void g1(S1 s12, long j10, float f10, C2606g gVar, C2547y0 y0Var, int i10) {
        this.f3603a.g1(s12, j10, f10, gVar, y0Var, i10);
    }

    public float getDensity() {
        return this.f3603a.getDensity();
    }

    public t getLayoutDirection() {
        return this.f3603a.getLayoutDirection();
    }

    public void h0(C2514n0 n0Var, long j10, long j11, float f10, C2606g gVar, C2547y0 y0Var, int i10) {
        this.f3603a.h0(n0Var, j10, j11, f10, gVar, y0Var, i10);
    }

    public void h1(S1 s12, C2514n0 n0Var, float f10, C2606g gVar, C2547y0 y0Var, int i10) {
        this.f3603a.h1(s12, n0Var, f10, gVar, y0Var, i10);
    }

    public void j0(long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, C2606g gVar, C2547y0 y0Var, int i10) {
        this.f3603a.j0(j10, f10, f11, z10, j11, j12, f12, gVar, y0Var, i10);
    }

    public float m1(float f10) {
        return this.f3603a.m1(f10);
    }

    public final void o(r rVar, C2520p0 p0Var, C2673c cVar) {
        C1235c0 h10 = C1245k.h(rVar, C1239e0.a(4));
        h10.A1().b0().e(p0Var, s.d(h10.b()), h10, rVar, cVar);
    }

    public void p0(H1 h12, long j10, float f10, C2606g gVar, C2547y0 y0Var, int i10) {
        this.f3603a.p0(h12, j10, f10, gVar, y0Var, i10);
    }

    public float r1() {
        return this.f3603a.r1();
    }

    public void s1(H1 h12, long j10, long j11, long j12, long j13, float f10, C2606g gVar, C2547y0 y0Var, int i10, int i11) {
        this.f3603a.s1(h12, j10, j11, j12, j13, f10, gVar, y0Var, i10, i11);
    }

    public float t1(float f10) {
        return this.f3603a.t1(f10);
    }

    public void u1(long j10, long j11, long j12, float f10, C2606g gVar, C2547y0 y0Var, int i10) {
        this.f3603a.u1(j10, j11, j12, f10, gVar, y0Var, i10);
    }

    public C2603d w1() {
        return this.f3603a.w1();
    }

    public long y1() {
        return this.f3603a.y1();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(C2600a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new C2600a() : aVar);
    }
}
