package x0;

import Y.C1500m;
import Y.C1506p;
import androidx.compose.ui.platform.C1644k0;
import c1.d;
import lf.C6514M;
import q0.C2427m;
import q0.C2428n;
import r0.C2547y0;

public abstract class r {
    public static final q a(q qVar, long j10, long j11, String str, C2547y0 y0Var, boolean z10) {
        qVar.x(j10);
        qVar.t(z10);
        qVar.u(y0Var);
        qVar.y(j11);
        qVar.w(str);
        return qVar;
    }

    private static final C2547y0 b(long j10, int i10) {
        if (j10 != 16) {
            return C2547y0.f25576b.b(j10, i10);
        }
        return null;
    }

    public static final C2890c c(C2890c cVar, n nVar) {
        int z10 = nVar.z();
        for (int i10 = 0; i10 < z10; i10++) {
            p b10 = nVar.b(i10);
            if (b10 instanceof s) {
                C2894g gVar = new C2894g();
                s sVar = (s) b10;
                gVar.k(sVar.k());
                gVar.l(sVar.n());
                gVar.j(sVar.g());
                gVar.h(sVar.a());
                gVar.i(sVar.b());
                gVar.m(sVar.r());
                gVar.n(sVar.t());
                gVar.r(sVar.A());
                gVar.o(sVar.v());
                gVar.p(sVar.x());
                gVar.q(sVar.z());
                gVar.u(sVar.E());
                gVar.s(sVar.C());
                gVar.t(sVar.D());
                cVar.i(i10, gVar);
            } else if (b10 instanceof n) {
                C2890c cVar2 = new C2890c();
                n nVar2 = (n) b10;
                cVar2.p(nVar2.k());
                cVar2.s(nVar2.t());
                cVar2.t(nVar2.v());
                cVar2.u(nVar2.x());
                cVar2.v(nVar2.A());
                cVar2.w(nVar2.C());
                cVar2.q(nVar2.n());
                cVar2.r(nVar2.r());
                cVar2.o(nVar2.g());
                c(cVar2, nVar2);
                cVar.i(i10, cVar2);
            }
        }
        return cVar;
    }

    public static final q d(d dVar, C2891d dVar2, C2890c cVar) {
        long e10 = e(dVar, dVar2.e(), dVar2.d());
        return a(new q(cVar), e10, f(e10, dVar2.l(), dVar2.k()), dVar2.g(), b(dVar2.j(), dVar2.i()), dVar2.c());
    }

    private static final long e(d dVar, float f10, float f11) {
        return C2428n.a(dVar.t1(f10), dVar.t1(f11));
    }

    private static final long f(long j10, float f10, float f11) {
        if (Float.isNaN(f10)) {
            f10 = C2427m.k(j10);
        }
        if (Float.isNaN(f11)) {
            f11 = C2427m.i(j10);
        }
        return C2428n.a(f10, f11);
    }

    public static final q g(C2891d dVar, C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(1413834416, i10, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:171)");
        }
        d dVar2 = (d) mVar.m(C1644k0.e());
        float density = dVar2.getDensity();
        long floatToRawIntBits = (long) Float.floatToRawIntBits((float) dVar.f());
        boolean e10 = mVar.e((((long) Float.floatToRawIntBits(density)) & 4294967295L) | (floatToRawIntBits << 32));
        Object A10 = mVar.A();
        if (e10 || A10 == C1500m.f10026a.a()) {
            C2890c cVar = new C2890c();
            c(cVar, dVar.h());
            C6514M m10 = C6514M.f71813a;
            A10 = d(dVar2, dVar, cVar);
            mVar.r(A10);
        }
        q qVar = (q) A10;
        if (C1506p.H()) {
            C1506p.P();
        }
        return qVar;
    }
}
