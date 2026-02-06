package D0;

import c1.r;
import q0.C2421g;
import q0.C2427m;

/* renamed from: D0.p  reason: case insensitive filesystem */
public abstract class C1125p {
    public static final boolean a(A a10) {
        if (a10.p() || a10.l() || !a10.i()) {
            return false;
        }
        return true;
    }

    public static final boolean b(A a10) {
        if (a10.l() || !a10.i()) {
            return false;
        }
        return true;
    }

    public static final boolean c(A a10) {
        if (a10.p() || !a10.l() || a10.i()) {
            return false;
        }
        return true;
    }

    public static final boolean d(A a10) {
        if (!a10.l() || a10.i()) {
            return false;
        }
        return true;
    }

    public static final boolean e(A a10, long j10) {
        long h10 = a10.h();
        float m10 = C2421g.m(h10);
        float n10 = C2421g.n(h10);
        int g10 = r.g(j10);
        int f10 = r.f(j10);
        if (m10 < 0.0f || m10 > ((float) g10) || n10 < 0.0f || n10 > ((float) f10)) {
            return true;
        }
        return false;
    }

    public static final boolean f(A a10, long j10, long j11) {
        if (!O.g(a10.n(), O.f1413a.d())) {
            return e(a10, j10);
        }
        long h10 = a10.h();
        float m10 = C2421g.m(h10);
        float n10 = C2421g.n(h10);
        float g10 = ((float) r.g(j10)) + C2427m.k(j11);
        float f10 = -C2427m.i(j11);
        float f11 = ((float) r.f(j10)) + C2427m.i(j11);
        if (m10 < (-C2427m.k(j11)) || m10 > g10 || n10 < f10 || n10 > f11) {
            return true;
        }
        return false;
    }

    public static final long g(A a10) {
        return i(a10, false);
    }

    public static final long h(A a10) {
        return i(a10, true);
    }

    private static final long i(A a10, boolean z10) {
        long q10 = C2421g.q(a10.h(), a10.k());
        if (z10 || !a10.p()) {
            return q10;
        }
        return C2421g.f25320b.c();
    }

    public static final boolean j(A a10) {
        return !C2421g.j(i(a10, true), C2421g.f25320b.c());
    }
}
