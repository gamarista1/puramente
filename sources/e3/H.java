package E3;

import android.view.View;

abstract class H extends F {

    /* renamed from: f  reason: collision with root package name */
    private static boolean f1767f = true;

    H() {
    }

    public void d(View view, int i10, int i11, int i12, int i13) {
        if (f1767f) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f1767f = false;
            }
        }
    }
}
