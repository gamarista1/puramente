package com.google.common.collect;

import nb.o;

final class b0 extends C4773y {

    /* renamed from: c  reason: collision with root package name */
    final transient Object f56666c;

    b0(Object obj) {
        this.f56666c = o.j(obj);
    }

    public C4770v a() {
        return C4770v.H(this.f56666c);
    }

    /* access modifiers changed from: package-private */
    public int b(Object[] objArr, int i10) {
        objArr[i10] = this.f56666c;
        return i10 + 1;
    }

    public boolean contains(Object obj) {
        return this.f56666c.equals(obj);
    }

    public final int hashCode() {
        return this.f56666c.hashCode();
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return false;
    }

    /* renamed from: m */
    public g0 iterator() {
        return C.s(this.f56666c);
    }

    public int size() {
        return 1;
    }

    public String toString() {
        return '[' + this.f56666c.toString() + ']';
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return super.writeReplace();
    }
}
