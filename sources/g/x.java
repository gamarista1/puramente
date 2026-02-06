package G;

import E.B;
import E.u;
import Y.C1488g1;
import Y.C1503n0;
import Y.C1505o0;
import Y.D0;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    private final C f2427a;

    /* renamed from: b  reason: collision with root package name */
    private final C1505o0 f2428b;

    /* renamed from: c  reason: collision with root package name */
    private final C1503n0 f2429c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f2430d;

    /* renamed from: e  reason: collision with root package name */
    private Object f2431e;

    /* renamed from: f  reason: collision with root package name */
    private final B f2432f;

    public x(int i10, float f10, C c10) {
        this.f2427a = c10;
        this.f2428b = C1488g1.a(i10);
        this.f2429c = D0.a(f10);
        this.f2432f = new B(i10, 30, 100);
    }

    private final void g(int i10) {
        this.f2428b.f(i10);
    }

    private final void h(float f10) {
        this.f2429c.l(f10);
    }

    private final void i(int i10, float f10) {
        g(i10);
        this.f2432f.m(i10);
        h(f10);
    }

    public final void a(int i10) {
        float f10;
        if (this.f2427a.H() == 0) {
            f10 = 0.0f;
        } else {
            f10 = ((float) i10) / ((float) this.f2427a.H());
        }
        h(c() + f10);
    }

    public final int b() {
        return this.f2428b.b();
    }

    public final float c() {
        return this.f2429c.c();
    }

    public final B d() {
        return this.f2432f;
    }

    public final int e(r rVar, int i10) {
        int a10 = u.a(rVar, this.f2431e, i10);
        if (i10 != a10) {
            g(a10);
            this.f2432f.m(i10);
        }
        return a10;
    }

    public final void f(int i10, float f10) {
        i(i10, f10);
        this.f2431e = null;
    }

    public final void j(float f10) {
        h(f10);
    }

    public final void k(u uVar) {
        Object obj;
        int i10;
        C1179e t10 = uVar.t();
        if (t10 != null) {
            obj = t10.d();
        } else {
            obj = null;
        }
        this.f2431e = obj;
        if (this.f2430d || !uVar.k().isEmpty()) {
            this.f2430d = true;
            C1179e t11 = uVar.t();
            if (t11 != null) {
                i10 = t11.getIndex();
            } else {
                i10 = 0;
            }
            i(i10, uVar.u());
        }
    }
}
