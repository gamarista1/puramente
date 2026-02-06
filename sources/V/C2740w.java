package v;

import c1.d;
import w.C2758B;
import w.C2814z;

/* renamed from: v.w  reason: case insensitive filesystem */
public abstract class C2740w {
    /* access modifiers changed from: private */
    public static final void b(float[] fArr, float[] fArr2, int i10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        int i11 = i10;
        float f18 = 0.0f;
        float f19 = 0.0f;
        for (int i12 = 0; i12 < i11; i12++) {
            float f20 = ((float) i12) / ((float) i11);
            float f21 = 1.0f;
            while (true) {
                f10 = ((f21 - f18) / 2.0f) + f18;
                f11 = 1.0f - f10;
                f12 = f10 * 3.0f * f11;
                f13 = f10 * f10 * f10;
                float f22 = (((f11 * 0.175f) + (f10 * 0.35000002f)) * f12) + f13;
                if (((double) Math.abs(f22 - f20)) < 1.0E-5d) {
                    break;
                } else if (f22 > f20) {
                    f21 = f10;
                } else {
                    f18 = f10;
                }
            }
            float f23 = 0.5f;
            fArr[i12] = (f12 * ((f11 * 0.5f) + f10)) + f13;
            float f24 = 1.0f;
            while (true) {
                f14 = ((f24 - f19) / 2.0f) + f19;
                f15 = 1.0f - f14;
                f16 = f14 * 3.0f * f15;
                f17 = f14 * f14 * f14;
                float f25 = (((f15 * f23) + f14) * f16) + f17;
                if (((double) Math.abs(f25 - f20)) < 1.0E-5d) {
                    break;
                }
                if (f25 > f20) {
                    f24 = f14;
                } else {
                    f19 = f14;
                }
                f23 = 0.5f;
            }
            fArr2[i12] = (f16 * ((f15 * 0.175f) + (f14 * 0.35000002f))) + f17;
        }
        fArr2[i11] = 1.0f;
        fArr[i11] = 1.0f;
    }

    public static final C2814z c(d dVar) {
        return C2758B.b(new C2741x(dVar));
    }
}
