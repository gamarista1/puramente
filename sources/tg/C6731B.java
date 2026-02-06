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

/* renamed from: tg.B  reason: case insensitive filesystem */
public final class C6731B extends C6734E {
    public C6731B(int i10) {
        super(Integer.valueOf(i10));
    }

    public S a(H h10) {
        C5366d0 p10;
        C6496s.h(h10, "module");
        C5487e b10 = C5506y.b(h10, o.a.f63965F0);
        if (b10 == null || (p10 = b10.p()) == null) {
            return l.d(k.NOT_FOUND_UNSIGNED_TYPE, "UInt");
        }
        return p10;
    }

    public String toString() {
        return ((Number) b()).intValue() + ".toUInt()";
    }
}
