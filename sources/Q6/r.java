package q6;

import android.graphics.Matrix;
import android.graphics.Rect;

class r extends p {

    /* renamed from: l  reason: collision with root package name */
    public static final q f47744l = new r();

    private r() {
    }

    public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
        matrix.setTranslate((float) ((int) (((float) rect.left) + (((float) (rect.width() - i10)) * 0.5f) + 0.5f)), (float) ((int) (((float) rect.top) + (((float) (rect.height() - i11)) * 0.5f) + 0.5f)));
    }

    public String toString() {
        return "center";
    }
}
