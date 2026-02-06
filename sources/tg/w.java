package tg;

import Fg.C5366d0;
import Of.H;
import kotlin.jvm.internal.C6496s;

public final class w extends r {
    public w(short s10) {
        super(Short.valueOf(s10));
    }

    /* renamed from: c */
    public C5366d0 a(H h10) {
        C6496s.h(h10, "module");
        C5366d0 T10 = h10.m().T();
        C6496s.g(T10, "getShortType(...)");
        return T10;
    }

    public String toString() {
        return ((Number) b()).intValue() + ".toShort()";
    }
}
