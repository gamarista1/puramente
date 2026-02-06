package W0;

import java.util.concurrent.atomic.AtomicReference;
import w.C2780Y;
import yf.C6798l;

public class T {

    /* renamed from: a  reason: collision with root package name */
    private final L f8512a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference f8513b = new AtomicReference((Object) null);

    public T(L l10) {
        this.f8512a = l10;
    }

    public final Z a() {
        return (Z) this.f8513b.get();
    }

    public final void b() {
        this.f8512a.f();
    }

    public final void c() {
        if (a() != null) {
            this.f8512a.g();
        }
    }

    public Z d(Q q10, C1450s sVar, C6798l lVar, C6798l lVar2) {
        this.f8512a.c(q10, sVar, lVar, lVar2);
        Z z10 = new Z(this, this.f8512a);
        this.f8513b.set(z10);
        return z10;
    }

    public final void e() {
        this.f8512a.a();
        this.f8513b.set(new Z(this, this.f8512a));
    }

    public final void f() {
        this.f8512a.d();
    }

    public void g(Z z10) {
        if (C2780Y.a(this.f8513b, z10, (Object) null)) {
            this.f8512a.d();
        }
    }
}
