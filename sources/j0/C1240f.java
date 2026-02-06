package J0;

/* renamed from: J0.f  reason: case insensitive filesystem */
abstract class C1240f {
    public static final int b(int[] iArr, int i10) {
        return iArr[i10 + c(iArr)];
    }

    private static final int c(int[] iArr) {
        return iArr.length / 2;
    }

    public static final void d(int[] iArr, int i10, int i11) {
        iArr[i10 + c(iArr)] = i11;
    }

    public static int[] a(int[] iArr) {
        return iArr;
    }
}
