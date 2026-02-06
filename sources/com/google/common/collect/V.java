package com.google.common.collect;

import java.io.Serializable;
import nb.o;

final class V extends O implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    static final V f56649a = new V();
    private static final long serialVersionUID = 0;

    private V() {
    }

    private Object readResolve() {
        return f56649a;
    }

    public O g() {
        return O.d();
    }

    /* renamed from: h */
    public int compare(Comparable comparable, Comparable comparable2) {
        o.j(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
