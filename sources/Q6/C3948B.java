package q6;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: q6.B  reason: case insensitive filesystem */
class C3948B extends p {

    /* renamed from: l  reason: collision with root package name */
    public static final q f47608l = new C3948B();

    private C3948B() {
    }

    public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
        float f14;
        float f15;
        if (f13 > f12) {
            float f16 = ((float) i10) * f13;
            f14 = ((float) rect.left) + Math.max(Math.min((((float) rect.width()) * 0.5f) - (f10 * f16), 0.0f), ((float) rect.width()) - f16);
            f15 = (float) rect.top;
            f12 = f13;
        } else {
            f14 = (float) rect.left;
            float f17 = ((float) i11) * f12;
            f15 = Math.max(Math.min((((float) rect.height()) * 0.5f) - (f11 * f17), 0.0f), ((float) rect.height()) - f17) + ((float) rect.top);
        }
        matrix.setScale(f12, f12);
        matrix.postTranslate((float) ((int) (f14 + 0.5f)), (float) ((int) (f15 + 0.5f)));
    }

    public String toString() {
        return "focus_crop";
    }
}
