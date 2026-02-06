package c1;

import q0.C2427m;
import q0.C2428n;

public abstract class s {
    public static final long a(int i10, int i11) {
        return r.c((((long) i11) & 4294967295L) | (((long) i10) << 32));
    }

    public static final long b(long j10) {
        return n.e((((j10 << 32) >> 33) & 4294967295L) | ((j10 >> 33) << 32));
    }

    public static final long c(long j10) {
        int round = Math.round(C2427m.k(j10));
        return r.c((((long) Math.round(C2427m.i(j10))) & 4294967295L) | (((long) round) << 32));
    }

    public static final long d(long j10) {
        return C2428n.a((float) r.g(j10), (float) r.f(j10));
    }
}
