package pb;

import nb.o;

abstract class c {
    static long a(double d10) {
        o.e(b(d10), "not a normal value");
        int exponent = Math.getExponent(d10);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d10) & 4503599627370495L;
        if (exponent == -1023) {
            return doubleToRawLongBits << 1;
        }
        return doubleToRawLongBits | 4503599627370496L;
    }

    static boolean b(double d10) {
        if (Math.getExponent(d10) <= 1023) {
            return true;
        }
        return false;
    }
}
