package F;

public abstract class G {
    public static long a(int i10, int i11) {
        return b((((long) (i11 + i10)) & 4294967295L) | (((long) i10) << 32));
    }

    private static long b(long j10) {
        return j10;
    }
}
