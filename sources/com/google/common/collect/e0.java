package com.google.common.collect;

import java.util.Iterator;
import nb.o;

abstract class e0 implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    final Iterator f56699a;

    e0(Iterator it) {
        this.f56699a = (Iterator) o.j(it);
    }

    /* access modifiers changed from: package-private */
    public abstract Object a(Object obj);

    public final boolean hasNext() {
        return this.f56699a.hasNext();
    }

    public final Object next() {
        return a(this.f56699a.next());
    }

    public final void remove() {
        this.f56699a.remove();
    }
}
