package q6;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: q6.A  reason: case insensitive filesystem */
class C3947A extends p {

    /* renamed from: l  reason: collision with root package name */
    public static final q f47607l = new C3947A();

    private C3947A() {
    }

    public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
        matrix.setScale(f13, f13);
        matrix.postTranslate((float) ((int) (((float) rect.left) + ((((float) rect.width()) - (((float) i10) * f13)) * 0.5f) + 0.5f)), (float) ((int) (((float) rect.top) + 0.5f)));
    }

    public String toString() {
        return "fit_y";
    }
}
