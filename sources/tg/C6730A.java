package tg;

import Fg.C5366d0;
import Fg.S;
import Hg.k;
import Hg.l;
import Lf.o;
import Of.C5487e;
import Of.C5506y;
import Of.H;
import kotlin.jvm.internal.C6496s;

/* renamed from: tg.A  reason: case insensitive filesystem */
public final class C6730A extends C6734E {
    public C6730A(byte b10) {
        super(Byte.valueOf(b10));
    }

    public S a(H h10) {
        C5366d0 p10;
        C6496s.h(h10, "module");
        C5487e b10 = C5506y.b(h10, o.a.f63961D0);
        if (b10 == null || (p10 = b10.p()) == null) {
            return l.d(k.NOT_FOUND_UNSIGNED_TYPE, "UByte");
        }
        return p10;
    }

    public String toString() {
        return ((Number) b()).intValue() + ".toUByte()";
    }
}
