package q0;

/* renamed from: q0.c  reason: case insensitive filesystem */
public abstract class C2417c {
    public static final String a(float f10, int i10) {
        if (Float.isNaN(f10)) {
            return "NaN";
        }
        if (!Float.isInfinite(f10)) {
            int max = Math.max(i10, 0);
            float pow = (float) Math.pow((double) 10.0f, (double) max);
            float f11 = f10 * pow;
            int i11 = (int) f11;
            if (f11 - ((float) i11) >= 0.5f) {
                i11++;
            }
            float f12 = ((float) i11) / pow;
            if (max > 0) {
                return String.valueOf(f12);
            }
            return String.valueOf((int) f12);
        } else if (f10 < 0.0f) {
            return "-Infinity";
        } else {
            return "Infinity";
        }
    }
}
