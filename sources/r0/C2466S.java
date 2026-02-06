package r0;

import android.graphics.Matrix;

/* renamed from: r0.S  reason: case insensitive filesystem */
public abstract class C2466S {
    public static final void a(Matrix matrix, float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[12];
        float f20 = fArr[13];
        float f21 = fArr[15];
        fArr[0] = f10;
        fArr[1] = f14;
        fArr[2] = f19;
        fArr[3] = f11;
        fArr[4] = f15;
        fArr[5] = f20;
        fArr[6] = f13;
        fArr[7] = f17;
        fArr[8] = f21;
        matrix.setValues(fArr);
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        fArr[3] = f13;
        fArr[4] = f14;
        fArr[5] = f15;
        fArr[6] = f16;
        fArr[7] = f17;
        fArr[8] = f18;
    }

    public static final void b(float[] fArr, Matrix matrix) {
        float[] fArr2 = fArr;
        matrix.getValues(fArr2);
        float f10 = fArr2[0];
        float f11 = fArr2[1];
        float f12 = fArr2[2];
        float f13 = fArr2[3];
        float f14 = fArr2[4];
        float f15 = fArr2[5];
        float f16 = fArr2[6];
        float f17 = fArr2[7];
        float f18 = fArr2[8];
        fArr2[0] = f10;
        fArr2[1] = f13;
        fArr2[2] = 0.0f;
        fArr2[3] = f16;
        fArr2[4] = f11;
        fArr2[5] = f14;
        fArr2[6] = 0.0f;
        fArr2[7] = f17;
        fArr2[8] = 0.0f;
        fArr2[9] = 0.0f;
        fArr2[10] = 1.0f;
        fArr2[11] = 0.0f;
        fArr2[12] = f12;
        fArr2[13] = f15;
        fArr2[14] = 0.0f;
        fArr2[15] = f18;
    }
}
