package com.google.common.collect;

final class T extends C4773y {

    /* renamed from: h  reason: collision with root package name */
    private static final Object[] f56640h;

    /* renamed from: i  reason: collision with root package name */
    static final T f56641i;

    /* renamed from: c  reason: collision with root package name */
    final transient Object[] f56642c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f56643d;

    /* renamed from: e  reason: collision with root package name */
    final transient Object[] f56644e;

    /* renamed from: f  reason: collision with root package name */
    private final transient int f56645f;

    /* renamed from: g  reason: collision with root package name */
    private final transient int f56646g;

    static {
        Object[] objArr = new Object[0];
        f56640h = objArr;
        f56641i = new T(objArr, 0, objArr, 0, 0);
    }

    T(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f56642c = objArr;
        this.f56643d = i10;
        this.f56644e = objArr2;
        this.f56645f = i11;
        this.f56646g = i12;
    }

    /* access modifiers changed from: package-private */
    public C4770v A() {
        return C4770v.r(this.f56642c, this.f56646g);
    }

    /* access modifiers changed from: package-private */
    public boolean C() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public int b(Object[] objArr, int i10) {
        System.arraycopy(this.f56642c, 0, objArr, i10, this.f56646g);
        return i10 + this.f56646g;
    }

    public boolean contains(Object obj) {
        Object[] objArr = this.f56644e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int c10 = C4767s.c(obj);
        while (true) {
            int i10 = c10 & this.f56645f;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            c10 = i10 + 1;
        }
    }

    /* access modifiers changed from: package-private */
    public Object[] d() {
        return this.f56642c;
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f56646g;
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return 0;
    }

    public int hashCode() {
        return this.f56643d;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return false;
    }

    /* renamed from: m */
    public g0 iterator() {
        return a().iterator();
    }

    public int size() {
        return this.f56646g;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return super.writeReplace();
    }
}
