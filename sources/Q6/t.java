package q6;

import android.graphics.Matrix;
import android.graphics.Rect;

class t extends p {

    /* renamed from: l  reason: collision with root package name */
    public static final q f47746l = new t();

    private t() {
    }

    public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
        float min = Math.min(Math.min(f12, f13), 1.0f);
        float width = ((float) rect.left) + ((((float) rect.width()) - (((float) i10) * min)) * 0.5f);
        float height = ((float) rect.top) + ((((float) rect.height()) - (((float) i11) * min)) * 0.5f);
        matrix.setScale(min, min);
        matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height + 0.5f)));
    }

    public String toString() {
        return "center_inside";
    }
}
