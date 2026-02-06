package D;

import E.C1144m;
import H0.W;
import mf.C6565s;

public final class g implements C1144m {

    /* renamed from: a  reason: collision with root package name */
    private final A f1233a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1234b;

    public g(A a10, int i10) {
        this.f1233a = a10;
        this.f1234b = i10;
    }

    public int a() {
        return this.f1233a.x().h();
    }

    public void b() {
        W E10 = this.f1233a.E();
        if (E10 != null) {
            E10.h();
        }
    }

    public boolean c() {
        return !this.f1233a.x().k().isEmpty();
    }

    public int d() {
        return Math.max(0, this.f1233a.s() - this.f1234b);
    }

    public int e() {
        return Math.min(a() - 1, ((k) C6565s.z0(this.f1233a.x().k())).getIndex() + this.f1234b);
    }
}
