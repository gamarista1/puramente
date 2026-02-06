package k9;

import k9.n1;

/* renamed from: k9.e  reason: case insensitive filesystem */
public abstract class C3692e implements T0 {

    /* renamed from: a  reason: collision with root package name */
    protected final n1.d f45533a = new n1.d();

    protected C3692e() {
    }

    private int d() {
        int n10 = n();
        if (n10 == 1) {
            return 0;
        }
        return n10;
    }

    public final boolean A() {
        n1 s10 = s();
        if (s10.u() || !s10.r(B(), this.f45533a).f45735h) {
            return false;
        }
        return true;
    }

    public final boolean E() {
        n1 s10 = s();
        if (s10.u() || !s10.r(B(), this.f45533a).g()) {
            return false;
        }
        return true;
    }

    public final long a() {
        n1 s10 = s();
        if (s10.u()) {
            return -9223372036854775807L;
        }
        return s10.r(B(), this.f45533a).f();
    }

    public final int b() {
        n1 s10 = s();
        if (s10.u()) {
            return -1;
        }
        return s10.i(B(), d(), D());
    }

    public final int c() {
        n1 s10 = s();
        if (s10.u()) {
            return -1;
        }
        return s10.p(B(), d(), D());
    }

    public final void e(long j10) {
        t(B(), j10);
    }

    public final boolean o() {
        if (b() != -1) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        n1 s10 = s();
        if (s10.u() || !s10.r(B(), this.f45533a).f45736i) {
            return false;
        }
        return true;
    }

    public final boolean w() {
        if (c() != -1) {
            return true;
        }
        return false;
    }
}
