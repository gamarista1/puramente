package Hh;

import Gh.T;
import kotlin.jvm.internal.C6496s;

public abstract class e {
    public static final int a(int[] iArr, int i10, int i11, int i12) {
        C6496s.h(iArr, "<this>");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else if (i15 <= i10) {
                return i14;
            } else {
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    public static final int b(T t10, int i10) {
        C6496s.h(t10, "<this>");
        int a10 = a(t10.Z(), i10 + 1, 0, t10.a0().length);
        if (a10 >= 0) {
            return a10;
        }
        return ~a10;
    }
}
