package Ib;

import Ib.c;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class e implements Iterable {

    /* renamed from: a  reason: collision with root package name */
    private final c f51140a;

    private static class a implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        final Iterator f51141a;

        public a(Iterator it) {
            this.f51141a = it;
        }

        public boolean hasNext() {
            return this.f51141a.hasNext();
        }

        public Object next() {
            return ((Map.Entry) this.f51141a.next()).getKey();
        }

        public void remove() {
            this.f51141a.remove();
        }
    }

    public e(List list, Comparator comparator) {
        this.f51140a = c.a.b(list, Collections.emptyMap(), c.a.e(), comparator);
    }

    public Object a() {
        return this.f51140a.g();
    }

    public Object b() {
        return this.f51140a.h();
    }

    public Object d(Object obj) {
        return this.f51140a.k(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f51140a.equals(((e) obj).f51140a);
    }

    public e g(Object obj) {
        return new e(this.f51140a.n(obj, (Object) null));
    }

    public e h(Object obj) {
        c r10 = this.f51140a.r(obj);
        if (r10 == this.f51140a) {
            return this;
        }
        return new e(r10);
    }

    public int hashCode() {
        return this.f51140a.hashCode();
    }

    public Iterator iterator() {
        return new a(this.f51140a.iterator());
    }

    public Iterator m0() {
        return new a(this.f51140a.m0());
    }

    private e(c cVar) {
        this.f51140a = cVar;
    }
}
