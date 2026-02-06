package w;

/* renamed from: w.f0  reason: case insensitive filesystem */
public abstract class C2793f0 {

    /* renamed from: a  reason: collision with root package name */
    private static final float f27415a = Float.MAX_VALUE;

    public static final long a(float f10, float f11) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f10);
        return C2776U.a((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (floatToRawIntBits << 32));
    }

    public static final float b() {
        return f27415a;
    }
}
