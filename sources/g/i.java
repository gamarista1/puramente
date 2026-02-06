package G;

import E.C1144m;
import H0.W;
import mf.C6565s;

public final class i implements C1144m {

    /* renamed from: a  reason: collision with root package name */
    private final C f2310a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2311b;

    public i(C c10, int i10) {
        this.f2310a = c10;
        this.f2311b = i10;
    }

    public int a() {
        return this.f2310a.F();
    }

    public void b() {
        W O10 = this.f2310a.O();
        if (O10 != null) {
            O10.h();
        }
    }

    public boolean c() {
        return !this.f2310a.C().k().isEmpty();
    }

    public int d() {
        return Math.max(0, this.f2310a.y() - this.f2311b);
    }

    public int e() {
        return Math.min(a() - 1, ((f) C6565s.z0(this.f2310a.C().k())).getIndex() + this.f2311b);
    }
}
