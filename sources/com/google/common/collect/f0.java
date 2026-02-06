package com.google.common.collect;

import java.util.ListIterator;

abstract class f0 extends e0 implements ListIterator {
    f0(ListIterator listIterator) {
        super(listIterator);
    }

    private ListIterator b() {
        return (ListIterator) this.f56699a;
    }

    public void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    public final int nextIndex() {
        return b().nextIndex();
    }

    public final Object previous() {
        return a(b().previous());
    }

    public final int previousIndex() {
        return b().previousIndex();
    }

    public void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
