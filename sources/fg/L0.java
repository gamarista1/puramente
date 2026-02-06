package Fg;

import kotlin.jvm.internal.C6496s;
import lf.C6535s;
import yf.C6798l;

public abstract class L0 {
    public static final S a(S s10) {
        C6496s.h(s10, "<this>");
        if (s10 instanceof K0) {
            return ((K0) s10).i0();
        }
        return null;
    }

    public static final M0 b(M0 m02, S s10) {
        C6496s.h(m02, "<this>");
        C6496s.h(s10, "origin");
        return d(m02, a(s10));
    }

    public static final M0 c(M0 m02, S s10, C6798l lVar) {
        S s11;
        C6496s.h(m02, "<this>");
        C6496s.h(s10, "origin");
        C6496s.h(lVar, "transform");
        S a10 = a(s10);
        if (a10 != null) {
            s11 = (S) lVar.invoke(a10);
        } else {
            s11 = null;
        }
        return d(m02, s11);
    }

    public static final M0 d(M0 m02, S s10) {
        C6496s.h(m02, "<this>");
        if (m02 instanceof K0) {
            return d(((K0) m02).H0(), s10);
        }
        if (s10 == null || C6496s.c(s10, m02)) {
            return m02;
        }
        if (m02 instanceof C5366d0) {
            return new C5372g0((C5366d0) m02, s10);
        }
        if (m02 instanceof I) {
            return new K((I) m02, s10);
        }
        throw new C6535s();
    }
}
