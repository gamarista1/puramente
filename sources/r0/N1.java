package r0;

public abstract class N1 {
    /* access modifiers changed from: private */
    public static final float b(float[] fArr, int i10, float[] fArr2, int i11) {
        int i12 = i10 * 4;
        return (fArr[i12] * fArr2[i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 3] * fArr2[12 + i11]);
    }

    public static final boolean c(float[] fArr) {
        float f10;
        for (int i10 = 0; i10 < 4; i10++) {
            for (int i11 = 0; i11 < 4; i11++) {
                if (i10 == i11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                if (fArr[(i10 * 4) + i11] != f10) {
                    return false;
                }
            }
        }
        return true;
    }
}
