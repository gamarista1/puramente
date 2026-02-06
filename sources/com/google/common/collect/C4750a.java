package com.google.common.collect;

import java.util.NoSuchElementException;
import nb.o;

/* renamed from: com.google.common.collect.a  reason: case insensitive filesystem */
abstract class C4750a extends h0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f56652a;

    /* renamed from: b  reason: collision with root package name */
    private int f56653b;

    protected C4750a(int i10, int i11) {
        o.l(i11, i10);
        this.f56652a = i10;
        this.f56653b = i11;
    }

    /* access modifiers changed from: protected */
    public abstract Object a(int i10);

    public final boolean hasNext() {
        if (this.f56653b < this.f56652a) {
            return true;
        }
        return false;
    }

    public final boolean hasPrevious() {
        if (this.f56653b > 0) {
            return true;
        }
        return false;
    }

    public final Object next() {
        if (hasNext()) {
            int i10 = this.f56653b;
            this.f56653b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f56653b;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f56653b - 1;
            this.f56653b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f56653b - 1;
    }
}
