package u;

import kotlin.jvm.internal.C6496s;

/* renamed from: u.a  reason: case insensitive filesystem */
public abstract class C2664a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f26373a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    public static final long[] f26374b = new long[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Object[] f26375c = new Object[0];

    public static final int a(int[] iArr, int i10, int i11) {
        C6496s.h(iArr, "array");
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else if (i15 <= i11) {
                return i14;
            } else {
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }

    public static final int b(long[] jArr, int i10, long j10) {
        C6496s.h(jArr, "array");
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = (jArr[i13] > j10 ? 1 : (jArr[i13] == j10 ? 0 : -1));
            if (i14 < 0) {
                i12 = i13 + 1;
            } else if (i14 <= 0) {
                return i13;
            } else {
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    public static final boolean c(Object obj, Object obj2) {
        return C6496s.c(obj, obj2);
    }

    public static final int d(int i10) {
        for (int i11 = 4; i11 < 32; i11++) {
            int i12 = (1 << i11) - 12;
            if (i10 <= i12) {
                return i12;
            }
        }
        return i10;
    }

    public static final int e(int i10) {
        return d(i10 * 4) / 4;
    }

    public static final int f(int i10) {
        return d(i10 * 8) / 8;
    }
}
