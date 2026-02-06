package e1;

/* renamed from: e1.b  reason: case insensitive filesystem */
public abstract class C1943b {
    public static final float a(float f10) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f10)) & 8589934591L) / ((long) 3))) + 709952852);
        float f11 = intBitsToFloat - ((intBitsToFloat - (f10 / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f11 - ((f11 - (f10 / (f11 * f11))) * 0.33333334f);
    }

    public static final float b(float f10, float f11, float f12) {
        return ((((float) 1) - f12) * f10) + (f12 * f11);
    }

    public static final int c(int i10, int i11, float f10) {
        return i10 + ((int) Math.round(((double) (i11 - i10)) * ((double) f10)));
    }
}
