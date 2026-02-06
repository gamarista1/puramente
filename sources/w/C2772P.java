package w;

import androidx.collection.C1599m;

/* renamed from: w.P  reason: case insensitive filesystem */
public abstract class C2772P {
    public static final int a(C1599m mVar, int i10, int i11, int i12) {
        boolean z10;
        if (i11 <= i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C2783a0.a("fromIndex(" + i11 + ") > toIndex(" + i12 + ')');
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("Index out of range: " + i11);
        } else if (i12 <= mVar.b()) {
            int i13 = i12 - 1;
            while (i11 <= i13) {
                int i14 = (i11 + i13) >>> 1;
                int a10 = mVar.a(i14);
                if (a10 < i10) {
                    i11 = i14 + 1;
                } else if (a10 <= i10) {
                    return i14;
                } else {
                    i13 = i14 - 1;
                }
            }
            return -(i11 + 1);
        } else {
            throw new IndexOutOfBoundsException("Index out of range: " + i12);
        }
    }

    public static /* synthetic */ int b(C1599m mVar, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = mVar.b();
        }
        return a(mVar, i10, i11, i12);
    }
}
