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

/* renamed from: tg.C  reason: case insensitive filesystem */
public final class C6732C extends C6734E {
    public C6732C(long j10) {
        super(Long.valueOf(j10));
    }

    public S a(H h10) {
        C5366d0 p10;
        C6496s.h(h10, "module");
        C5487e b10 = C5506y.b(h10, o.a.f63967G0);
        if (b10 == null || (p10 = b10.p()) == null) {
            return l.d(k.NOT_FOUND_UNSIGNED_TYPE, "ULong");
        }
        return p10;
    }

    public String toString() {
        return ((Number) b()).longValue() + ".toULong()";
    }
}
