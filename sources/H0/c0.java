package H0;

import q0.C2427m;
import q0.C2428n;

public abstract class c0 {
    public static final long a(float f10, float f11) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f10);
        return b0.a((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (floatToRawIntBits << 32));
    }

    public static final long b(long j10, long j11) {
        return C2428n.a(C2427m.k(j10) * b0.b(j11), C2427m.i(j10) * b0.c(j11));
    }

    public static final long c(long j10, long j11) {
        return b(j11, j10);
    }
}
