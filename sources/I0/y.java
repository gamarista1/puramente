package i0;

import Y.C1486g;

public abstract class y implements x {

    /* renamed from: a  reason: collision with root package name */
    private final C1486g f21815a = new C1486g(0);

    public final boolean q(int i10) {
        if ((i10 & C2053g.a(this.f21815a.get())) != 0) {
            return true;
        }
        return false;
    }

    public final void s(int i10) {
        int a10;
        do {
            a10 = C2053g.a(this.f21815a.get());
            if ((a10 & i10) == 0) {
            } else {
                return;
            }
        } while (!this.f21815a.compareAndSet(a10, C2053g.a(a10 | i10)));
    }
}
