package Fg;

import Gg.g;
import Hg.i;
import Pf.h;
import Pf.p;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import lf.C6535s;

public abstract class F0 {
    public static final C5366d0 a(S s10) {
        C5366d0 d0Var;
        C6496s.h(s10, "<this>");
        M0 Q02 = s10.Q0();
        if (Q02 instanceof C5366d0) {
            d0Var = (C5366d0) Q02;
        } else {
            d0Var = null;
        }
        if (d0Var != null) {
            return d0Var;
        }
        throw new IllegalStateException(("This is should be simple type: " + s10).toString());
    }

    public static final S b(S s10, List list, h hVar) {
        C6496s.h(s10, "<this>");
        C6496s.h(list, "newArguments");
        C6496s.h(hVar, "newAnnotations");
        return e(s10, list, hVar, (List) null, 4, (Object) null);
    }

    public static final S c(S s10, List list, h hVar, List list2) {
        C6496s.h(s10, "<this>");
        C6496s.h(list, "newArguments");
        C6496s.h(hVar, "newAnnotations");
        C6496s.h(list2, "newArgumentsForUpperBound");
        if ((list.isEmpty() || list == s10.L0()) && hVar == s10.getAnnotations()) {
            return s10;
        }
        r0 M02 = s10.M0();
        if ((hVar instanceof p) && ((p) hVar).isEmpty()) {
            hVar = h.f64602L.b();
        }
        r0 a10 = s0.a(M02, hVar);
        M0 Q02 = s10.Q0();
        if (Q02 instanceof I) {
            I i10 = (I) Q02;
            return V.e(d(i10.V0(), list, a10), d(i10.W0(), list2, a10));
        } else if (Q02 instanceof C5366d0) {
            return d((C5366d0) Q02, list, a10);
        } else {
            throw new C6535s();
        }
    }

    public static final C5366d0 d(C5366d0 d0Var, List list, r0 r0Var) {
        C6496s.h(d0Var, "<this>");
        C6496s.h(list, "newArguments");
        C6496s.h(r0Var, "newAttributes");
        if (list.isEmpty() && r0Var == d0Var.M0()) {
            return d0Var;
        }
        if (list.isEmpty()) {
            return d0Var.V0(r0Var);
        }
        if (d0Var instanceof i) {
            return ((i) d0Var).Z0(list);
        }
        return V.k(r0Var, d0Var.N0(), list, d0Var.O0(), (g) null, 16, (Object) null);
    }

    public static /* synthetic */ S e(S s10, List list, h hVar, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = s10.L0();
        }
        if ((i10 & 2) != 0) {
            hVar = s10.getAnnotations();
        }
        if ((i10 & 4) != 0) {
            list2 = list;
        }
        return c(s10, list, hVar, list2);
    }

    public static /* synthetic */ C5366d0 f(C5366d0 d0Var, List list, r0 r0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = d0Var.L0();
        }
        if ((i10 & 2) != 0) {
            r0Var = d0Var.M0();
        }
        return d(d0Var, list, r0Var);
    }
}
