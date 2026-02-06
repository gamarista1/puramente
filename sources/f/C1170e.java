package F;

/* renamed from: F.e  reason: case insensitive filesystem */
public abstract class C1170e {
    /* access modifiers changed from: private */
    public static final int[] b(int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15 = i10 - (i12 * (i11 - 1));
        int i16 = i15 / i11;
        int i17 = i15 % i11;
        int[] iArr = new int[i11];
        for (int i18 = 0; i18 < i11; i18++) {
            if (i16 < 0) {
                i13 = 0;
            } else {
                if (i18 < i17) {
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                i13 = i14 + i16;
            }
            iArr[i18] = i13;
        }
        return iArr;
    }
}
