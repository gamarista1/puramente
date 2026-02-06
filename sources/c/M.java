package C;

import c1.b;
import c1.c;

public abstract class M {
    public static long a(int i10, int i11, int i12, int i13) {
        return b(c.a(i10, i11, i12, i13));
    }

    public static long c(long j10, J j11) {
        int i10;
        int i11;
        int i12;
        int i13;
        J j12 = J.Horizontal;
        if (j11 == j12) {
            i10 = b.n(j10);
        } else {
            i10 = b.m(j10);
        }
        if (j11 == j12) {
            i11 = b.l(j10);
        } else {
            i11 = b.k(j10);
        }
        if (j11 == j12) {
            i12 = b.m(j10);
        } else {
            i12 = b.n(j10);
        }
        if (j11 == j12) {
            i13 = b.k(j10);
        } else {
            i13 = b.l(j10);
        }
        return a(i10, i11, i12, i13);
    }

    public static final long d(long j10, int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, i13);
    }

    public static /* synthetic */ long e(long j10, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = b.n(j10);
        }
        int i15 = i10;
        if ((i14 & 2) != 0) {
            i11 = b.l(j10);
        }
        int i16 = i11;
        if ((i14 & 4) != 0) {
            i12 = b.m(j10);
        }
        int i17 = i12;
        if ((i14 & 8) != 0) {
            i13 = b.k(j10);
        }
        return d(j10, i15, i16, i17, i13);
    }

    public static final long f(long j10, J j11) {
        if (j11 == J.Horizontal) {
            return c.a(b.n(j10), b.l(j10), b.m(j10), b.k(j10));
        }
        return c.a(b.m(j10), b.k(j10), b.n(j10), b.l(j10));
    }

    private static long b(long j10) {
        return j10;
    }
}
