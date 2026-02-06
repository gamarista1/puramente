package c1;

import com.google.android.gms.common.api.a;
import q0.C2427m;
import q0.C2428n;

public interface d extends l {
    long B1(long j10) {
        if (j10 != 9205357640488583168L) {
            return C2428n.a(t1(k.h(j10)), t1(k.g(j10)));
        }
        return C2427m.f25341b.a();
    }

    float E(int i10) {
        return h.j(((float) i10) / getDensity());
    }

    int E0(float f10) {
        float t12 = t1(f10);
        if (Float.isInfinite(t12)) {
            return a.e.API_PRIORITY_OTHER;
        }
        return Math.round(t12);
    }

    float N0(long j10) {
        if (x.g(v.g(j10), x.f19246b.b())) {
            return t1(V(j10));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    long Q(long j10) {
        if (j10 != 9205357640488583168L) {
            return i.b(m1(C2427m.k(j10)), m1(C2427m.i(j10)));
        }
        return k.f19222b.a();
    }

    long f0(int i10) {
        return P(E(i10));
    }

    long g0(float f10) {
        return P(m1(f10));
    }

    float getDensity();

    float m1(float f10) {
        return h.j(f10 / getDensity());
    }

    float t1(float f10) {
        return f10 * getDensity();
    }
}
