package tg;

import Fg.C5366d0;
import Of.H;
import kotlin.jvm.internal.C6496s;

/* renamed from: tg.d  reason: case insensitive filesystem */
public final class C6738d extends r {
    public C6738d(byte b10) {
        super(Byte.valueOf(b10));
    }

    /* renamed from: c */
    public C5366d0 a(H h10) {
        C6496s.h(h10, "module");
        C5366d0 t10 = h10.m().t();
        C6496s.g(t10, "getByteType(...)");
        return t10;
    }

    public String toString() {
        return ((Number) b()).intValue() + ".toByte()";
    }
}
