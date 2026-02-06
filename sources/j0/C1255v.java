package J0;

/* renamed from: J0.v  reason: case insensitive filesystem */
public abstract class C1255v {
    /* access modifiers changed from: private */
    public static final long a(float f10, boolean z10) {
        long j10;
        long floatToIntBits = (long) Float.floatToIntBits(f10);
        if (z10) {
            j10 = 1;
        } else {
            j10 = 0;
        }
        return C1251q.b((j10 & 4294967295L) | (floatToIntBits << 32));
    }
}
