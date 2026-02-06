package c1;

import q0.C2421g;
import q0.C2422h;

public abstract class o {
    public static final long a(int i10, int i11) {
        return n.e((((long) i11) & 4294967295L) | (((long) i10) << 32));
    }

    public static final long b(long j10, long j11) {
        return C2422h.a(C2421g.m(j10) - ((float) n.j(j11)), C2421g.n(j10) - ((float) n.k(j11)));
    }

    public static final long c(long j10, long j11) {
        return C2422h.a(C2421g.m(j10) + ((float) n.j(j11)), C2421g.n(j10) + ((float) n.k(j11)));
    }

    public static final long d(long j10) {
        int round = Math.round(C2421g.m(j10));
        return n.e((((long) Math.round(C2421g.n(j10))) & 4294967295L) | (((long) round) << 32));
    }
}
