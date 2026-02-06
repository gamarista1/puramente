package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

public final class g extends h implements Iterable {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f58198a = new ArrayList();

    private h t() {
        int size = this.f58198a.size();
        if (size == 1) {
            return (h) this.f58198a.get(0);
        }
        throw new IllegalStateException("Array must have size 1, but has size " + size);
    }

    public boolean equals(Object obj) {
        if (obj == this || ((obj instanceof g) && ((g) obj).f58198a.equals(this.f58198a))) {
            return true;
        }
        return false;
    }

    public String g() {
        return t().g();
    }

    public int hashCode() {
        return this.f58198a.hashCode();
    }

    public Iterator iterator() {
        return this.f58198a.iterator();
    }

    public void r(h hVar) {
        if (hVar == null) {
            hVar = j.f58350a;
        }
        this.f58198a.add(hVar);
    }
}
