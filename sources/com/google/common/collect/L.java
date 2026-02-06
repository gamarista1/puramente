package com.google.common.collect;

import java.io.Serializable;
import nb.o;

final class L extends O implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    static final L f56622a = new L();
    private static final long serialVersionUID = 0;

    private L() {
    }

    private Object readResolve() {
        return f56622a;
    }

    public O g() {
        return V.f56649a;
    }

    /* renamed from: h */
    public int compare(Comparable comparable, Comparable comparable2) {
        o.j(comparable);
        o.j(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
