package com.amazon.a.a.o.d;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class c implements Iterable<a> {

    /* renamed from: a  reason: collision with root package name */
    private Map<b, a> f37563a = new HashMap();

    public <T> c a(T t10, T t11, b bVar) {
        if (!a((Object) t10, (Object) t11)) {
            this.f37563a.put(bVar, new a(bVar, "'" + t10 + "' != '" + t11 + "'"));
        }
        return this;
    }

    public Iterator<a> iterator() {
        return this.f37563a.values().iterator();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Verifier:");
        for (a aVar : this.f37563a.values()) {
            sb2.append("\n\t" + aVar);
        }
        return sb2.toString();
    }

    private boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public <T extends Comparable<T>> c a(T t10, T t11, b bVar) {
        if (t10.compareTo(t11) <= 0) {
            this.f37563a.put(bVar, new a(bVar, "'" + t10 + "' <= '" + t11 + "'"));
        }
        return this;
    }

    public c a(Exception exc, b bVar) {
        this.f37563a.put(bVar, new a(bVar, "Exception: " + exc));
        return this;
    }

    public boolean a() {
        return !this.f37563a.isEmpty();
    }

    public boolean a(b bVar) {
        return this.f37563a.containsKey(bVar);
    }
}
