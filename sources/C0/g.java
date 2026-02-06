package c0;

import Ef.m;

public final class g extends C1887a {

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f19192c;

    /* renamed from: d  reason: collision with root package name */
    private final k f19193d;

    public g(Object[] objArr, Object[] objArr2, int i10, int i11, int i12) {
        super(i10, i11);
        this.f19192c = objArr2;
        int d10 = l.d(i11);
        this.f19193d = new k(objArr, m.h(i10, d10), d10, i12);
    }

    public Object next() {
        a();
        if (this.f19193d.hasNext()) {
            g(c() + 1);
            return this.f19193d.next();
        }
        Object[] objArr = this.f19192c;
        int c10 = c();
        g(c10 + 1);
        return objArr[c10 - this.f19193d.e()];
    }

    public Object previous() {
        b();
        if (c() > this.f19193d.e()) {
            Object[] objArr = this.f19192c;
            g(c() - 1);
            return objArr[c() - this.f19193d.e()];
        }
        g(c() - 1);
        return this.f19193d.previous();
    }
}
