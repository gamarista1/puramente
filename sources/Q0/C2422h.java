package q0;

import e1.C1943b;

/* renamed from: q0.h  reason: case insensitive filesystem */
public abstract class C2422h {
    public static final long a(float f10, float f11) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f10);
        return C2421g.e((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (floatToRawIntBits << 32));
    }

    public static final boolean b(long j10) {
        long j11 = (j10 & 9187343241974906880L) ^ 9187343241974906880L;
        if (((~j11) & (j11 - 4294967297L) & -9223372034707292160L) == 0) {
            return true;
        }
        return false;
    }

    public static final boolean c(long j10) {
        if ((j10 & 9223372034707292159L) != 9205357640488583168L) {
            return true;
        }
        return false;
    }

    public static final boolean d(long j10) {
        if ((j10 & 9223372034707292159L) == 9205357640488583168L) {
            return true;
        }
        return false;
    }

    public static final long e(long j10, long j11, float f10) {
        return C2421g.e((((long) Float.floatToRawIntBits(C1943b.b(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 >> 32)), f10))) << 32) | (((long) Float.floatToRawIntBits(C1943b.b(Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 & 4294967295L)), f10))) & 4294967295L));
    }
}
