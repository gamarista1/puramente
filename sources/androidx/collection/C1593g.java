package androidx.collection;

/* renamed from: androidx.collection.g  reason: case insensitive filesystem */
public abstract class C1593g {
    public static long a(float f10, float f11) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f10);
        return b((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (floatToRawIntBits << 32));
    }

    public static long b(long j10) {
        return j10;
    }
}
