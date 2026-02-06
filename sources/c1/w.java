package c1;

import e1.C1943b;

public abstract class w {
    public static final long a(float f10, long j10) {
        return i(j10, f10);
    }

    public static final void b(long j10) {
        if (g(j10)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void c(long j10, long j11) {
        if (g(j10) || g(j11)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        } else if (!x.g(v.g(j10), v.g(j11))) {
            throw new IllegalArgumentException(("Cannot perform operation for " + x.i(v.g(j10)) + " and " + x.i(v.g(j11))).toString());
        }
    }

    public static final long d(double d10) {
        return i(4294967296L, (float) d10);
    }

    public static final long e(float f10) {
        return i(4294967296L, f10);
    }

    public static final long f(int i10) {
        return i(4294967296L, (float) i10);
    }

    public static final boolean g(long j10) {
        if (v.f(j10) == 0) {
            return true;
        }
        return false;
    }

    public static final long h(long j10, long j11, float f10) {
        c(j10, j11);
        return i(v.f(j10), C1943b.b(v.h(j10), v.h(j11), f10));
    }

    public static final long i(long j10, float f10) {
        return v.c(j10 | (((long) Float.floatToIntBits(f10)) & 4294967295L));
    }
}
