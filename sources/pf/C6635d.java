package pf;

import kotlin.jvm.internal.C6496s;

/* renamed from: pf.d  reason: case insensitive filesystem */
abstract class C6635d extends C6634c {
    public static int h(int i10, int... iArr) {
        C6496s.h(iArr, "other");
        for (int max : iArr) {
            i10 = Math.max(i10, max);
        }
        return i10;
    }

    public static int i(int i10, int... iArr) {
        C6496s.h(iArr, "other");
        for (int min : iArr) {
            i10 = Math.min(i10, min);
        }
        return i10;
    }
}
