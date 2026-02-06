package tg;

import Fg.C5366d0;
import Of.H;
import kotlin.jvm.internal.C6496s;

public final class m extends g {
    public m(float f10) {
        super(Float.valueOf(f10));
    }

    /* renamed from: c */
    public C5366d0 a(H h10) {
        C6496s.h(h10, "module");
        C5366d0 B10 = h10.m().B();
        C6496s.g(B10, "getFloatType(...)");
        return B10;
    }

    public String toString() {
        return ((Number) b()).floatValue() + ".toFloat()";
    }
}
