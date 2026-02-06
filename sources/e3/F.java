package E3;

import android.graphics.Matrix;
import android.view.View;

abstract class F extends D {

    /* renamed from: d  reason: collision with root package name */
    private static boolean f1765d = true;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f1766e = true;

    F() {
    }

    public void g(View view, Matrix matrix) {
        if (f1765d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f1765d = false;
            }
        }
    }

    public void h(View view, Matrix matrix) {
        if (f1766e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f1766e = false;
            }
        }
    }
}
