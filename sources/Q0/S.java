package Q0;

import Ef.m;

public abstract class S {
    public static final long a(int i10) {
        return b(i10, i10);
    }

    public static final long b(int i10, int i11) {
        return Q.c(d(i10, i11));
    }

    public static final long c(long j10, int i10, int i11) {
        int l10 = m.l(Q.n(j10), i10, i11);
        int l11 = m.l(Q.i(j10), i10, i11);
        if (l10 == Q.n(j10) && l11 == Q.i(j10)) {
            return j10;
        }
        return b(l10, l11);
    }

    private static final long d(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i10 + ", end: " + i11 + ']').toString());
        } else if (i11 >= 0) {
            return (((long) i11) & 4294967295L) | (((long) i10) << 32);
        } else {
            throw new IllegalArgumentException(("end cannot be negative. [start: " + i10 + ", end: " + i11 + ']').toString());
        }
    }

    public static final String e(CharSequence charSequence, long j10) {
        return charSequence.subSequence(Q.l(j10), Q.k(j10)).toString();
    }
}
