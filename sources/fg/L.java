package Fg;

import kotlin.jvm.internal.C6496s;
import lf.C6535s;

public abstract class L {
    public static final I a(S s10) {
        C6496s.h(s10, "<this>");
        M0 Q02 = s10.Q0();
        C6496s.f(Q02, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (I) Q02;
    }

    public static final boolean b(S s10) {
        C6496s.h(s10, "<this>");
        return s10.Q0() instanceof I;
    }

    public static final C5366d0 c(S s10) {
        C6496s.h(s10, "<this>");
        M0 Q02 = s10.Q0();
        if (Q02 instanceof I) {
            return ((I) Q02).V0();
        }
        if (Q02 instanceof C5366d0) {
            return (C5366d0) Q02;
        }
        throw new C6535s();
    }

    public static final C5366d0 d(S s10) {
        C6496s.h(s10, "<this>");
        M0 Q02 = s10.Q0();
        if (Q02 instanceof I) {
            return ((I) Q02).W0();
        }
        if (Q02 instanceof C5366d0) {
            return (C5366d0) Q02;
        }
        throw new C6535s();
    }
}
