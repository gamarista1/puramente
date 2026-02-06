package J0;

import G0.a;
import H0.C1197s;
import a0.C1538b;
import c1.d;
import c1.t;
import k0.i;
import kotlin.jvm.internal.C6496s;
import lf.C6527k;
import r0.F1;

/* renamed from: J0.k  reason: case insensitive filesystem */
public abstract class C1245k {
    /* access modifiers changed from: private */
    public static final void c(C1538b bVar, i.c cVar) {
        C1538b v02 = m(cVar).v0();
        int q10 = v02.q();
        if (q10 > 0) {
            int i10 = q10 - 1;
            Object[] p10 = v02.p();
            do {
                bVar.b(((G) p10[i10]).j0().k());
                i10--;
            } while (i10 >= 0);
        }
    }

    public static final B d(i.c cVar) {
        if ((C1239e0.a(2) & cVar.N1()) != 0) {
            if (cVar instanceof B) {
                return (B) cVar;
            }
            if (cVar instanceof C1247m) {
                i.c m22 = ((C1247m) cVar).m2();
                while (m22 != null) {
                    if (m22 instanceof B) {
                        return (B) m22;
                    }
                    if (!(m22 instanceof C1247m) || (C1239e0.a(2) & m22.N1()) == 0) {
                        m22 = m22.J1();
                    } else {
                        m22 = ((C1247m) m22).m2();
                    }
                }
            }
        }
        return null;
    }

    public static final boolean e(C1244j jVar, int i10) {
        if ((jVar.v0().I1() & i10) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean f(C1244j jVar) {
        if (jVar.v0() == jVar) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final i.c g(C1538b bVar) {
        if (bVar == null || bVar.s()) {
            return null;
        }
        return (i.c) bVar.y(bVar.q() - 1);
    }

    public static final C1235c0 h(C1244j jVar, int i10) {
        C1235c0 K12 = jVar.v0().K1();
        C6496s.e(K12);
        if (K12.D2() != jVar || !f0.i(i10)) {
            return K12;
        }
        C1235c0 E22 = K12.E2();
        C6496s.e(E22);
        return E22;
    }

    public static final d i(C1244j jVar) {
        return m(jVar).K();
    }

    public static final F1 j(C1244j jVar) {
        return n(jVar).getGraphicsContext();
    }

    public static final C1197s k(C1244j jVar) {
        if (!jVar.v0().S1()) {
            a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        C1197s C12 = h(jVar, C1239e0.a(2)).C1();
        if (!C12.G()) {
            a.b("LayoutCoordinates is not attached.");
        }
        return C12;
    }

    public static final t l(C1244j jVar) {
        return m(jVar).getLayoutDirection();
    }

    public static final G m(C1244j jVar) {
        C1235c0 K12 = jVar.v0().K1();
        if (K12 != null) {
            return K12.A1();
        }
        a.c("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new C6527k();
    }

    public static final m0 n(C1244j jVar) {
        m0 m02 = m(jVar).m0();
        if (m02 != null) {
            return m02;
        }
        a.c("This node does not have an owner.");
        throw new C6527k();
    }
}
