package F;

import E.C1144m;
import H0.W;
import mf.C6565s;

/* renamed from: F.d  reason: case insensitive filesystem */
public final class C1169d implements C1144m {

    /* renamed from: a  reason: collision with root package name */
    private final E f1974a;

    public C1169d(E e10) {
        this.f1974a = e10;
    }

    public int a() {
        return this.f1974a.w().h();
    }

    public void b() {
        W D10 = this.f1974a.D();
        if (D10 != null) {
            D10.h();
        }
    }

    public boolean c() {
        return !this.f1974a.w().k().isEmpty();
    }

    public int d() {
        return this.f1974a.r();
    }

    public int e() {
        return ((C1174i) C6565s.z0(this.f1974a.w().k())).getIndex();
    }
}
