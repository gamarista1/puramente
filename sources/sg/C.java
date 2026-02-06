package Sg;

public abstract /* synthetic */ class C {
    public static /* synthetic */ long a(long j10, long j11) {
        if (j11 < 0) {
            if ((j10 ^ Long.MIN_VALUE) < (j11 ^ Long.MIN_VALUE)) {
                return 0;
            }
            return 1;
        } else if (j10 >= 0) {
            return j10 / j11;
        } else {
            int i10 = 1;
            long j12 = ((j10 >>> 1) / j11) << 1;
            if (((j10 - (j12 * j11)) ^ Long.MIN_VALUE) < (j11 ^ Long.MIN_VALUE)) {
                i10 = 0;
            }
            return j12 + ((long) i10);
        }
    }
}
