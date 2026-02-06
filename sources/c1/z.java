package c1;

public abstract class z {
    public static final long a(float f10, float f11) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f10);
        return y.c((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (floatToRawIntBits << 32));
    }
}
