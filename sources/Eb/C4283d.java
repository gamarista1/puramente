package Eb;

import ic.C5026a;
import ic.C5027b;
import java.util.Set;

/* renamed from: Eb.d  reason: case insensitive filesystem */
public interface C4283d {
    C5026a a(E e10);

    Set b(Class cls) {
        return g(E.b(cls));
    }

    C5027b c(E e10);

    Object d(E e10) {
        C5027b f10 = f(e10);
        if (f10 == null) {
            return null;
        }
        return f10.get();
    }

    C5027b e(Class cls) {
        return f(E.b(cls));
    }

    C5027b f(E e10);

    Set g(E e10) {
        return (Set) c(e10).get();
    }

    Object get(Class cls) {
        return d(E.b(cls));
    }

    C5026a h(Class cls) {
        return a(E.b(cls));
    }
}
