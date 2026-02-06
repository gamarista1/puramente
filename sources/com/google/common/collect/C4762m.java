package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;
import nb.o;

/* renamed from: com.google.common.collect.m  reason: case insensitive filesystem */
final class C4762m extends O implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a  reason: collision with root package name */
    final Comparator f56733a;

    C4762m(Comparator comparator) {
        this.f56733a = (Comparator) o.j(comparator);
    }

    public int compare(Object obj, Object obj2) {
        return this.f56733a.compare(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4762m) {
            return this.f56733a.equals(((C4762m) obj).f56733a);
        }
        return false;
    }

    public int hashCode() {
        return this.f56733a.hashCode();
    }

    public String toString() {
        return this.f56733a.toString();
    }
}
