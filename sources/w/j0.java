package w;

import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class j0 {
    public static long a(int i10, int i11) {
        return b((long) (i10 * i11));
    }

    public static /* synthetic */ long c(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i12 & 2) != 0) {
            i11 = k0.f27440a.a();
        }
        return a(i10, i11);
    }

    public static final boolean d(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static int e(long j10) {
        return Long.hashCode(j10);
    }

    private static long b(long j10) {
        return j10;
    }
}
