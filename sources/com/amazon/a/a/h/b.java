package com.amazon.a.a.h;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class b implements Serializable, Iterable<a> {

    /* renamed from: a  reason: collision with root package name */
    private static final long f37185a = 1;

    /* renamed from: b  reason: collision with root package name */
    private final List<a> f37186b = new ArrayList();

    public boolean a() {
        return this.f37186b.isEmpty();
    }

    public Collection<a> b() {
        return this.f37186b;
    }

    public int c() {
        return this.f37186b.size();
    }

    public Iterator<a> iterator() {
        return this.f37186b.iterator();
    }

    public String toString() {
        return "MetricBatch: [" + this.f37186b + "]";
    }

    public void a(a aVar) {
        this.f37186b.add(aVar);
    }
}
