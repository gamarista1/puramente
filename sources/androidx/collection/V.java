package androidx.collection;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;

public abstract class V {

    /* renamed from: a  reason: collision with root package name */
    public static final long[] f12128a = {-9187201950435737345L, -1};

    /* renamed from: b  reason: collision with root package name */
    private static final K f12129b = new K(0);

    public static final void a(long[] jArr, int i10) {
        C6496s.h(jArr, "metadata");
        int i11 = (i10 + 7) >> 3;
        for (int i12 = 0; i12 < i11; i12++) {
            long j10 = jArr[i12] & -9187201950435737472L;
            jArr[i12] = -72340172838076674L & ((~j10) + (j10 >>> 7));
        }
        int i02 = C6559l.i0(jArr);
        int i13 = i02 - 1;
        jArr[i13] = (jArr[i13] & 72057594037927935L) | -72057594037927936L;
        jArr[i02] = jArr[0];
    }

    public static final int b(long[] jArr, int i10, int i11) {
        C6496s.h(jArr, "metadata");
        while (i10 < i11) {
            if (((jArr[i10 >> 3] >> ((i10 & 7) << 3)) & 255) == 128) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final int c(int i10) {
        if (i10 == 7) {
            return 6;
        }
        return i10 - (i10 / 8);
    }

    public static final K d() {
        return new K(0, 1, (DefaultConstructorMarker) null);
    }

    public static final int e(int i10) {
        if (i10 == 0) {
            return 6;
        }
        return (i10 * 2) + 1;
    }

    public static final int f(int i10) {
        if (i10 > 0) {
            return -1 >>> Integer.numberOfLeadingZeros(i10);
        }
        return 0;
    }

    public static final int g(int i10) {
        if (i10 == 7) {
            return 8;
        }
        return i10 + ((i10 - 1) / 7);
    }
}
