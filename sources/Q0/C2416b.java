package q0;

/* renamed from: q0.b  reason: case insensitive filesystem */
public abstract class C2416b {
    public static final long a(float f10, float f11) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f10);
        return C2415a.b((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (floatToRawIntBits << 32));
    }

    public static /* synthetic */ long b(float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = f10;
        }
        return a(f10, f11);
    }
}
