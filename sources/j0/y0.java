package J0;

abstract class y0 {
    public static final void a(int[] iArr, C1257x xVar) {
        if (!f(iArr)) {
            xVar.g(h(iArr), i(iArr), d(iArr) - h(iArr));
        } else if (g(iArr)) {
            xVar.g(h(iArr), i(iArr), c(iArr));
        } else if (j(iArr)) {
            xVar.g(h(iArr), i(iArr) + 1, c(iArr));
        } else {
            xVar.g(h(iArr) + 1, i(iArr), c(iArr));
        }
    }

    public static final int c(int[] iArr) {
        return Math.min(d(iArr) - h(iArr), e(iArr) - i(iArr));
    }

    public static final int d(int[] iArr) {
        return iArr[2];
    }

    public static final int e(int[] iArr) {
        return iArr[3];
    }

    private static final boolean f(int[] iArr) {
        if (e(iArr) - i(iArr) != d(iArr) - h(iArr)) {
            return true;
        }
        return false;
    }

    public static final boolean g(int[] iArr) {
        if (iArr[4] != 0) {
            return true;
        }
        return false;
    }

    public static final int h(int[] iArr) {
        return iArr[0];
    }

    public static final int i(int[] iArr) {
        return iArr[1];
    }

    private static final boolean j(int[] iArr) {
        if (e(iArr) - i(iArr) > d(iArr) - h(iArr)) {
            return true;
        }
        return false;
    }

    public static int[] b(int[] iArr) {
        return iArr;
    }
}
