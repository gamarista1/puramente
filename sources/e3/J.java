package E3;

import android.os.Build;
import android.view.View;

class J extends H {

    /* renamed from: g  reason: collision with root package name */
    private static boolean f1768g = true;

    J() {
    }

    public void f(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i10);
        } else if (f1768g) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f1768g = false;
            }
        }
    }
}
