package c1;

import e1.C1943b;

public abstract class i {
    public static final long a(float f10, float f11) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f10);
        return j.b((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (floatToRawIntBits << 32));
    }

    public static final long b(float f10, float f11) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f10);
        return k.d((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (floatToRawIntBits << 32));
    }

    public static final float c(float f10, float f11, float f12) {
        return h.j(C1943b.b(f10, f11, f12));
    }
}
