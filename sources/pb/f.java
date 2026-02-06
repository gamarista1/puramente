package pb;

import java.math.RoundingMode;

abstract class f {
    static void a(boolean z10, double d10, RoundingMode roundingMode) {
        if (!z10) {
            throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + roundingMode);
        }
    }

    static void b(boolean z10, String str, int i10, int i11) {
        if (!z10) {
            throw new ArithmeticException("overflow: " + str + "(" + i10 + ", " + i11 + ")");
        }
    }

    static void c(boolean z10, String str, long j10, long j11) {
        if (!z10) {
            throw new ArithmeticException("overflow: " + str + "(" + j10 + ", " + j11 + ")");
        }
    }

    static long d(String str, long j10) {
        if (j10 >= 0) {
            return j10;
        }
        throw new IllegalArgumentException(str + " (" + j10 + ") must be >= 0");
    }

    static void e(boolean z10) {
        if (!z10) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
