package Pf;

import Pf.h;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import ng.c;

public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    private final List f64605a;

    public i(List list) {
        C6496s.h(list, "annotations");
        this.f64605a = list;
    }

    public c i(c cVar) {
        return h.b.a(this, cVar);
    }

    public boolean isEmpty() {
        return this.f64605a.isEmpty();
    }

    public Iterator iterator() {
        return this.f64605a.iterator();
    }

    public boolean n0(c cVar) {
        return h.b.b(this, cVar);
    }

    public String toString() {
        return this.f64605a.toString();
    }
}
