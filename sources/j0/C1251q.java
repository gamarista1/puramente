package J0;

/* renamed from: J0.q  reason: case insensitive filesystem */
abstract class C1251q {
    public static final int a(long j10, long j11) {
        boolean d10 = d(j10);
        if (d10 == d(j11)) {
            return (int) Math.signum(c(j10) - c(j11));
        }
        if (d10) {
            return -1;
        }
        return 1;
    }

    public static final float c(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final boolean d(long j10) {
        if (((int) (j10 & 4294967295L)) != 0) {
            return true;
        }
        return false;
    }

    public static long b(long j10) {
        return j10;
    }
}
