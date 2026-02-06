package q6;

import android.graphics.Matrix;
import android.graphics.Rect;

class y extends p {

    /* renamed from: l  reason: collision with root package name */
    public static final q f47751l = new y();

    private y() {
    }

    public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
        float height = ((float) rect.top) + ((((float) rect.height()) - (((float) i11) * f12)) * 0.5f);
        matrix.setScale(f12, f12);
        matrix.postTranslate((float) ((int) (((float) rect.left) + 0.5f)), (float) ((int) (height + 0.5f)));
    }

    public String toString() {
        return "fit_x";
    }
}
