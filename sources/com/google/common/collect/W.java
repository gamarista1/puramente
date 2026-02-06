package com.google.common.collect;

import java.io.Serializable;
import nb.o;

final class W extends O implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a  reason: collision with root package name */
    final O f56650a;

    W(O o10) {
        this.f56650a = (O) o.j(o10);
    }

    public int compare(Object obj, Object obj2) {
        return this.f56650a.compare(obj2, obj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof W) {
            return this.f56650a.equals(((W) obj).f56650a);
        }
        return false;
    }

    public O g() {
        return this.f56650a;
    }

    public int hashCode() {
        return -this.f56650a.hashCode();
    }

    public String toString() {
        return this.f56650a + ".reverse()";
    }
}
