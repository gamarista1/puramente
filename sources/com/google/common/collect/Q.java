package com.google.common.collect;

import java.util.Objects;
import nb.o;

class Q extends C4770v {

    /* renamed from: e  reason: collision with root package name */
    static final C4770v f56623e = new Q(new Object[0], 0);

    /* renamed from: c  reason: collision with root package name */
    final transient Object[] f56624c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f56625d;

    Q(Object[] objArr, int i10) {
        this.f56624c = objArr;
        this.f56625d = i10;
    }

    /* access modifiers changed from: package-private */
    public int b(Object[] objArr, int i10) {
        System.arraycopy(this.f56624c, 0, objArr, i10, this.f56625d);
        return i10 + this.f56625d;
    }

    /* access modifiers changed from: package-private */
    public Object[] d() {
        return this.f56624c;
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f56625d;
    }

    public Object get(int i10) {
        o.h(i10, this.f56625d);
        Object obj = this.f56624c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return false;
    }

    public int size() {
        return this.f56625d;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return super.writeReplace();
    }
}
