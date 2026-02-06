package q6;

import android.graphics.Matrix;
import android.graphics.Rect;

class w extends p {

    /* renamed from: l  reason: collision with root package name */
    public static final q f47749l = new w();

    private w() {
    }

    public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
        float min = Math.min(f12, f13);
        matrix.setScale(min, min);
        matrix.postTranslate((float) ((int) (((float) rect.left) + (((float) rect.width()) - (((float) i10) * min)) + 0.5f)), (float) ((int) (((float) rect.top) + (((float) rect.height()) - (((float) i11) * min)) + 0.5f)));
    }

    public String toString() {
        return "fit_end";
    }
}
