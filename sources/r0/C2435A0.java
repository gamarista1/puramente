package r0;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;

/* renamed from: r0.A0  reason: case insensitive filesystem */
public abstract class C2435A0 {
    public static /* synthetic */ float[] b(float[] fArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        }
        return a(fArr);
    }

    public static int c(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public static final void d(float[] fArr) {
        C6559l.x(fArr, 0.0f, 0, 0, 6, (Object) null);
        fArr[0] = 1.0f;
        fArr[12] = 1.0f;
        fArr[6] = 1.0f;
        fArr[18] = 1.0f;
    }

    public static final void e(float[] fArr, float f10) {
        d(fArr);
        float f11 = ((float) 1) - f10;
        float f12 = 0.213f * f11;
        float f13 = 0.715f * f11;
        float f14 = f11 * 0.072f;
        fArr[0] = f12 + f10;
        fArr[1] = f13;
        fArr[2] = f14;
        fArr[5] = f12;
        fArr[6] = f13 + f10;
        fArr[7] = f14;
        fArr[10] = f12;
        fArr[11] = f13;
        fArr[12] = f14 + f10;
    }

    public static String f(float[] fArr) {
        return "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
    }

    public static float[] a(float[] fArr) {
        return fArr;
    }
}
