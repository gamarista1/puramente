package Fg;

import kotlin.jvm.internal.C6496s;

public abstract class t0 {
    public static final C5395w a(S s10) {
        C5395w wVar;
        C6496s.h(s10, "<this>");
        M0 Q02 = s10.Q0();
        if (Q02 instanceof C5395w) {
            wVar = (C5395w) Q02;
        } else {
            wVar = null;
        }
        if (wVar == null || !wVar.F0()) {
            return null;
        }
        return wVar;
    }

    public static final boolean b(S s10) {
        C5395w wVar;
        C6496s.h(s10, "<this>");
        M0 Q02 = s10.Q0();
        if (Q02 instanceof C5395w) {
            wVar = (C5395w) Q02;
        } else {
            wVar = null;
        }
        if (wVar != null) {
            return wVar.F0();
        }
        return false;
    }
}
