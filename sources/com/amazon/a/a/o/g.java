package com.amazon.a.a.o;

import java.util.Iterator;
import java.util.WeakHashMap;

public class g<T> implements Iterable<T> {

    /* renamed from: a  reason: collision with root package name */
    private WeakHashMap<T, Object> f37564a = new WeakHashMap<>();

    public void a(T t10) {
        this.f37564a.put(t10, (Object) null);
    }

    public void b(T t10) {
        this.f37564a.remove(t10);
    }

    public Iterator<T> iterator() {
        return this.f37564a.keySet().iterator();
    }

    public String toString() {
        return this.f37564a.keySet().toString();
    }

    public boolean a() {
        return this.f37564a.isEmpty();
    }

    public int b() {
        return this.f37564a.size();
    }
}
