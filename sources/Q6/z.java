package q6;

import android.graphics.Matrix;
import android.graphics.Rect;

class z extends p {

    /* renamed from: l  reason: collision with root package name */
    public static final q f47752l = new z();

    private z() {
    }

    public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
        matrix.setScale(f12, f13);
        matrix.postTranslate((float) ((int) (((float) rect.left) + 0.5f)), (float) ((int) (((float) rect.top) + 0.5f)));
    }

    public String toString() {
        return "fit_xy";
    }
}
