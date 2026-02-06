package q6;

import android.graphics.Matrix;
import android.graphics.Rect;

class s extends p {

    /* renamed from: l  reason: collision with root package name */
    public static final q f47745l = new s();

    private s() {
    }

    public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
        float f14;
        float f15;
        if (f13 > f12) {
            f14 = ((float) rect.left) + ((((float) rect.width()) - (((float) i10) * f13)) * 0.5f);
            f15 = (float) rect.top;
            f12 = f13;
        } else {
            f15 = ((((float) rect.height()) - (((float) i11) * f12)) * 0.5f) + ((float) rect.top);
            f14 = (float) rect.left;
        }
        matrix.setScale(f12, f12);
        matrix.postTranslate((float) ((int) (f14 + 0.5f)), (float) ((int) (f15 + 0.5f)));
    }

    public String toString() {
        return "center_crop";
    }
}
