package Af;

import com.google.android.gms.common.api.a;

abstract class c extends b {
    public static int a(int i10) {
        return Integer.signum(i10);
    }

    public static int b(long j10) {
        return Long.signum(j10);
    }

    public static int c(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        } else if (d10 > 2.147483647E9d) {
            return a.e.API_PRIORITY_OTHER;
        } else {
            if (d10 < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d10);
        }
    }

    public static int d(float f10) {
        if (!Float.isNaN(f10)) {
            return Math.round(f10);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static long e(double d10) {
        if (!Double.isNaN(d10)) {
            return Math.round(d10);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static long f(float f10) {
        return a.e((double) f10);
    }
}
