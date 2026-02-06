package Y;

import java.util.ArrayList;
import kotlin.jvm.internal.C6496s;

/* renamed from: Y.e1  reason: case insensitive filesystem */
public abstract class C1482e1 {
    /* access modifiers changed from: private */
    public static final int B(int[] iArr, int i10) {
        int i11 = i10 * 5;
        if (i11 >= iArr.length) {
            return iArr.length;
        }
        return E(iArr[i11 + 1] >> 29) + iArr[i11 + 4];
    }

    /* access modifiers changed from: private */
    public static final boolean C(int[] iArr, int i10) {
        if ((iArr[(i10 * 5) + 1] & 201326592) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final boolean D(int[] iArr, int i10) {
        if ((iArr[(i10 * 5) + 1] & 67108864) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final int E(int i10) {
        switch (i10) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* access modifiers changed from: private */
    public static final int F(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 4];
    }

    /* access modifiers changed from: private */
    public static final C1477d G(ArrayList arrayList, int i10, int i11) {
        int U10 = U(arrayList, i10, i11);
        if (U10 >= 0) {
            return (C1477d) arrayList.get(U10);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final int H(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 1];
    }

    /* access modifiers changed from: private */
    public static final int I(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 3];
    }

    /* access modifiers changed from: private */
    public static final boolean J(int[] iArr, int i10) {
        if ((iArr[(i10 * 5) + 1] & 268435456) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final boolean K(int[] iArr, int i10) {
        if ((iArr[(i10 * 5) + 1] & 134217728) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final boolean L(int[] iArr, int i10) {
        if ((iArr[(i10 * 5) + 1] & 536870912) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final void M(int[] iArr, int i10, int i11, boolean z10, boolean z11, boolean z12, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        if (z10) {
            i14 = 1073741824;
        } else {
            i14 = 0;
        }
        if (z11) {
            i15 = 536870912;
        } else {
            i15 = 0;
        }
        if (z12) {
            i16 = 268435456;
        } else {
            i16 = 0;
        }
        int i17 = i10 * 5;
        iArr[i17] = i11;
        iArr[i17 + 1] = i14 | i15 | i16;
        iArr[i17 + 2] = i12;
        iArr[i17 + 3] = 0;
        iArr[i17 + 4] = i13;
    }

    /* access modifiers changed from: private */
    public static final boolean N(int[] iArr, int i10) {
        if ((iArr[(i10 * 5) + 1] & 1073741824) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final int O(int[] iArr, int i10) {
        return iArr[i10 * 5];
    }

    /* access modifiers changed from: private */
    public static final int P(ArrayList arrayList, int i10, int i11) {
        int U10 = U(arrayList, i10, i11);
        if (U10 >= 0) {
            return U10;
        }
        return -(U10 + 1);
    }

    /* access modifiers changed from: private */
    public static final int Q(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 1] & 67108863;
    }

    /* access modifiers changed from: private */
    public static final int R(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 4];
    }

    /* access modifiers changed from: private */
    public static final int S(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return iArr[i11 + 4] + E(iArr[i11 + 1] >> 30);
    }

    /* access modifiers changed from: private */
    public static final int T(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 2];
    }

    /* access modifiers changed from: private */
    public static final int U(ArrayList arrayList, int i10, int i11) {
        int size = arrayList.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            int a10 = ((C1477d) arrayList.get(i13)).a();
            if (a10 < 0) {
                a10 += i11;
            }
            int i14 = C6496s.i(a10, i10);
            if (i14 < 0) {
                i12 = i13 + 1;
            } else if (i14 <= 0) {
                return i13;
            } else {
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    /* access modifiers changed from: private */
    public static final int V(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return iArr[i11 + 4] + E(iArr[i11 + 1] >> 28);
    }

    /* access modifiers changed from: private */
    public static final void W(int[] iArr, int i10, boolean z10) {
        int i11 = (i10 * 5) + 1;
        if (z10) {
            iArr[i11] = iArr[i11] | 67108864;
        } else {
            iArr[i11] = iArr[i11] & -67108865;
        }
    }

    /* access modifiers changed from: private */
    public static final void X(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 4] = i11;
    }

    /* access modifiers changed from: private */
    public static final void Y(int[] iArr, int i10, int i11) {
        boolean z10;
        if (i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C1506p.O(z10);
        iArr[(i10 * 5) + 3] = i11;
    }

    /* access modifiers changed from: private */
    public static final void Z(int[] iArr, int i10, boolean z10) {
        int i11 = (i10 * 5) + 1;
        if (z10) {
            iArr[i11] = iArr[i11] | 134217728;
        } else {
            iArr[i11] = iArr[i11] & -134217729;
        }
    }

    /* access modifiers changed from: private */
    public static final void a0(int[] iArr, int i10, int i11) {
        boolean z10;
        if (i11 < 0 || i11 >= 67108863) {
            z10 = false;
        } else {
            z10 = true;
        }
        C1506p.O(z10);
        int i12 = (i10 * 5) + 1;
        iArr[i12] = i11 | (iArr[i12] & -67108864);
    }

    /* access modifiers changed from: private */
    public static final void b0(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 2] = i11;
    }
}
