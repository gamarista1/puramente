package tg;

import Fg.C5366d0;
import Of.H;
import kotlin.jvm.internal.C6496s;

public final class t extends r {
    public t(long j10) {
        super(Long.valueOf(j10));
    }

    /* renamed from: c */
    public C5366d0 a(H h10) {
        C6496s.h(h10, "module");
        C5366d0 F10 = h10.m().F();
        C6496s.g(F10, "getLongType(...)");
        return F10;
    }

    public String toString() {
        return ((Number) b()).longValue() + ".toLong()";
    }
}
