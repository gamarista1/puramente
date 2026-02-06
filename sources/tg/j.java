package tg;

import Fg.C5366d0;
import Of.H;
import kotlin.jvm.internal.C6496s;

public final class j extends g {
    public j(double d10) {
        super(Double.valueOf(d10));
    }

    /* renamed from: c */
    public C5366d0 a(H h10) {
        C6496s.h(h10, "module");
        C5366d0 z10 = h10.m().z();
        C6496s.g(z10, "getDoubleType(...)");
        return z10;
    }

    public String toString() {
        return ((Number) b()).doubleValue() + ".toDouble()";
    }
}
