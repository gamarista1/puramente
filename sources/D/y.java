package D;

import E.B;
import E.u;
import Y.C1488g1;
import Y.C1505o0;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final C1505o0 f1354a;

    /* renamed from: b  reason: collision with root package name */
    private final C1505o0 f1355b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1356c;

    /* renamed from: d  reason: collision with root package name */
    private Object f1357d;

    /* renamed from: e  reason: collision with root package name */
    private final B f1358e;

    public y(int i10, int i11) {
        this.f1354a = C1488g1.a(i10);
        this.f1355b = C1488g1.a(i11);
        this.f1358e = new B(i10, 30, 100);
    }

    private final void f(int i10) {
        this.f1355b.f(i10);
    }

    private final void g(int i10, int i11) {
        if (((float) i10) >= 0.0f) {
            e(i10);
            this.f1358e.m(i10);
            f(i11);
            return;
        }
        throw new IllegalArgumentException(("Index should be non-negative (" + i10 + ')').toString());
    }

    public final int a() {
        return this.f1354a.b();
    }

    public final B b() {
        return this.f1358e;
    }

    public final int c() {
        return this.f1355b.b();
    }

    public final void d(int i10, int i11) {
        g(i10, i11);
        this.f1357d = null;
    }

    public final void e(int i10) {
        this.f1354a.f(i10);
    }

    public final void h(r rVar) {
        Object obj;
        int i10;
        s u10 = rVar.u();
        if (u10 != null) {
            obj = u10.getKey();
        } else {
            obj = null;
        }
        this.f1357d = obj;
        if (this.f1356c || rVar.h() > 0) {
            this.f1356c = true;
            int v10 = rVar.v();
            if (((float) v10) >= 0.0f) {
                s u11 = rVar.u();
                if (u11 != null) {
                    i10 = u11.getIndex();
                } else {
                    i10 = 0;
                }
                g(i10, v10);
                return;
            }
            throw new IllegalStateException(("scrollOffset should be non-negative (" + v10 + ')').toString());
        }
    }

    public final void i(int i10) {
        if (((float) i10) >= 0.0f) {
            f(i10);
            return;
        }
        throw new IllegalStateException(("scrollOffset should be non-negative (" + i10 + ')').toString());
    }

    public final int j(l lVar, int i10) {
        int a10 = u.a(lVar, this.f1357d, i10);
        if (i10 != a10) {
            e(a10);
            this.f1358e.m(i10);
        }
        return a10;
    }
}
