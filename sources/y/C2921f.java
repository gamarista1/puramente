package y;

/* renamed from: y.f  reason: case insensitive filesystem */
public abstract class C2921f {
    private static final int a(int i10, int i11, boolean z10) {
        return f(i10, i11, !z10);
    }

    public static final int b(int i10, int i11, int i12, boolean z10) {
        if (i11 >= i12) {
            return f(i11, i12, z10);
        }
        if (g(i10, i11, i12, z10)) {
            return e(i10, i11, z10);
        }
        if (h(i10, i11, i12, z10)) {
            return d(i10, i11, z10);
        }
        return a(i11, i12, z10);
    }

    public static /* synthetic */ int c(int i10, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            z10 = true;
        }
        return b(i10, i11, i12, z10);
    }

    private static final int d(int i10, int i11, boolean z10) {
        return e(i10, i11, !z10);
    }

    private static final int e(int i10, int i11, boolean z10) {
        if (z10) {
            return i10;
        }
        return i10 - i11;
    }

    private static final int f(int i10, int i11, boolean z10) {
        if (z10) {
            return 0;
        }
        return i11 - i10;
    }

    private static final boolean g(int i10, int i11, int i12, boolean z10) {
        return h(i10, i11, i12, !z10);
    }

    private static final boolean h(int i10, int i11, int i12, boolean z10) {
        if (z10) {
            if (i11 > i10) {
                return false;
            }
        } else if (i12 - i11 <= i10) {
            return false;
        }
        return true;
    }
}
