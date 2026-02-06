package H0;

import J0.C1235c0;
import c1.r;
import q0.C2421g;
import q0.C2422h;
import q0.C2423i;

/* renamed from: H0.t  reason: case insensitive filesystem */
public abstract class C1198t {
    public static final C2423i a(C1197s sVar) {
        C2423i C02;
        C1197s x02 = sVar.x0();
        if (x02 == null || (C02 = C1197s.C0(x02, sVar, false, 2, (Object) null)) == null) {
            return new C2423i(0.0f, 0.0f, (float) r.g(sVar.b()), (float) r.f(sVar.b()));
        }
        return C02;
    }

    public static final C2423i b(C1197s sVar) {
        return C1197s.C0(d(sVar), sVar, false, 2, (Object) null);
    }

    public static final C2423i c(C1197s sVar) {
        C1197s d10 = d(sVar);
        float g10 = (float) r.g(d10.b());
        float f10 = (float) r.f(d10.b());
        C2423i b10 = b(sVar);
        float i10 = b10.i();
        float f11 = 0.0f;
        if (i10 < 0.0f) {
            i10 = 0.0f;
        }
        if (i10 > g10) {
            i10 = g10;
        }
        float l10 = b10.l();
        if (l10 < 0.0f) {
            l10 = 0.0f;
        }
        if (l10 > f10) {
            l10 = f10;
        }
        float j10 = b10.j();
        if (j10 < 0.0f) {
            j10 = 0.0f;
        }
        if (j10 <= g10) {
            g10 = j10;
        }
        float e10 = b10.e();
        if (e10 >= 0.0f) {
            f11 = e10;
        }
        if (f11 <= f10) {
            f10 = f11;
        }
        if (i10 == g10 || l10 == f10) {
            return C2423i.f25325e.a();
        }
        long m02 = d10.m0(C2422h.a(i10, l10));
        long m03 = d10.m0(C2422h.a(g10, l10));
        long m04 = d10.m0(C2422h.a(g10, f10));
        long m05 = d10.m0(C2422h.a(i10, f10));
        float m10 = C2421g.m(m02);
        float m11 = C2421g.m(m03);
        float m12 = C2421g.m(m05);
        float m13 = C2421g.m(m04);
        float min = Math.min(m10, Math.min(m11, Math.min(m12, m13)));
        float max = Math.max(m10, Math.max(m11, Math.max(m12, m13)));
        float n10 = C2421g.n(m02);
        float n11 = C2421g.n(m03);
        float n12 = C2421g.n(m05);
        float n13 = C2421g.n(m04);
        return new C2423i(min, Math.min(n10, Math.min(n11, Math.min(n12, n13))), max, Math.max(n10, Math.max(n11, Math.max(n12, n13))));
    }

    public static final C1197s d(C1197s sVar) {
        C1197s sVar2;
        C1235c0 c0Var;
        C1197s x02 = sVar.x0();
        while (true) {
            C1197s sVar3 = x02;
            sVar2 = sVar;
            sVar = sVar3;
            if (sVar == null) {
                break;
            }
            x02 = sVar.x0();
        }
        if (sVar2 instanceof C1235c0) {
            c0Var = (C1235c0) sVar2;
        } else {
            c0Var = null;
        }
        if (c0Var == null) {
            return sVar2;
        }
        C1235c0 F22 = c0Var.F2();
        while (true) {
            C1235c0 c0Var2 = F22;
            C1235c0 c0Var3 = c0Var;
            c0Var = c0Var2;
            if (c0Var == null) {
                return c0Var3;
            }
            F22 = c0Var.F2();
        }
    }

    public static final long e(C1197s sVar) {
        return sVar.H0(C2421g.f25320b.c());
    }

    public static final long f(C1197s sVar) {
        return sVar.m0(C2421g.f25320b.c());
    }
}
