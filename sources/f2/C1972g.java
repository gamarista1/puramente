package f2;

import com.google.common.collect.C4770v;
import f2.H;
import java.util.List;

/* renamed from: f2.g  reason: case insensitive filesystem */
public abstract class C1972g implements C1964E {

    /* renamed from: a  reason: collision with root package name */
    protected final H.c f19971a = new H.c();

    protected C1972g() {
    }

    private int d() {
        int n10 = n();
        if (n10 == 1) {
            return 0;
        }
        return n10;
    }

    private void e(int i10) {
        h0(-1, -9223372036854775807L, i10, false);
    }

    private void g0(int i10) {
        h0(B(), -9223372036854775807L, i10, true);
    }

    private void i0(long j10, int i10) {
        h0(B(), j10, i10, false);
    }

    private void j0(int i10, int i11) {
        h0(i10, -9223372036854775807L, i11, false);
    }

    private void k0(int i10) {
        int a10 = a();
        if (a10 == -1) {
            e(i10);
        } else if (a10 == B()) {
            g0(i10);
        } else {
            j0(a10, i10);
        }
    }

    private void l0(long j10, int i10) {
        long currentPosition = getCurrentPosition() + j10;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        i0(Math.max(currentPosition, 0), i10);
    }

    private void m0(int i10) {
        int b10 = b();
        if (b10 == -1) {
            e(i10);
        } else if (b10 == B()) {
            g0(i10);
        } else {
            j0(b10, i10);
        }
    }

    public final boolean A() {
        H s10 = s();
        if (s10.q() || !s10.n(B(), this.f19971a).f19774h) {
            return false;
        }
        return true;
    }

    public final boolean E() {
        H s10 = s();
        if (s10.q() || !s10.n(B(), this.f19971a).f()) {
            return false;
        }
        return true;
    }

    public final void G() {
        j0(B(), 4);
    }

    public final void J() {
        if (s().q() || g()) {
            e(7);
            return;
        }
        boolean w10 = w();
        if (!E() || A()) {
            if (!w10 || getCurrentPosition() > S()) {
                i0(0, 7);
            } else {
                m0(7);
            }
        } else if (w10) {
            m0(7);
        } else {
            e(7);
        }
    }

    public final boolean L(int i10) {
        return Q().b(i10);
    }

    public final void O() {
        if (s().q() || g()) {
            e(9);
        } else if (o()) {
            k0(9);
        } else if (!E() || !q()) {
            e(9);
        } else {
            j0(B(), 9);
        }
    }

    public final long T() {
        H s10 = s();
        if (s10.q()) {
            return -9223372036854775807L;
        }
        return s10.n(B(), this.f19971a).d();
    }

    public final void W(w wVar) {
        n0(C4770v.H(wVar));
    }

    public final int a() {
        H s10 = s();
        if (s10.q()) {
            return -1;
        }
        return s10.e(B(), d(), D());
    }

    public final int b() {
        H s10 = s();
        if (s10.q()) {
            return -1;
        }
        return s10.l(B(), d(), D());
    }

    public final void b0() {
        l0(X(), 12);
    }

    public final void c0() {
        l0(-f0(), 11);
    }

    public abstract void h0(int i10, long j10, int i11, boolean z10);

    public final boolean isPlaying() {
        if (k() == 3 && u() && r() == 0) {
            return true;
        }
        return false;
    }

    public final void l() {
        K(true);
    }

    public final void n0(List list) {
        H(list, true);
    }

    public final boolean o() {
        if (a() != -1) {
            return true;
        }
        return false;
    }

    public final void pause() {
        K(false);
    }

    public final boolean q() {
        H s10 = s();
        if (s10.q() || !s10.n(B(), this.f19971a).f19775i) {
            return false;
        }
        return true;
    }

    public final void t(int i10, long j10) {
        h0(i10, j10, 10, false);
    }

    public final boolean w() {
        if (b() != -1) {
            return true;
        }
        return false;
    }

    public final void y(long j10) {
        i0(j10, 5);
    }
}
