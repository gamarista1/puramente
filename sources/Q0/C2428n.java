package q0;

/* renamed from: q0.n  reason: case insensitive filesystem */
public abstract class C2428n {
    public static final long a(float f10, float f11) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f10);
        return C2427m.d((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (floatToRawIntBits << 32));
    }

    public static final long b(long j10) {
        if (j10 == 9205357640488583168L) {
            C2418d.a("Size is unspecified");
        }
        return C2422h.a(Float.intBitsToFloat((int) (j10 >> 32)) / 2.0f, Float.intBitsToFloat((int) (j10 & 4294967295L)) / 2.0f);
    }

    public static final C2423i c(long j10) {
        return C2424j.b(C2421g.f25320b.c(), j10);
    }
}
