package E3;

import android.view.View;

abstract class D extends L {

    /* renamed from: c  reason: collision with root package name */
    private static boolean f1764c = true;

    D() {
    }

    public float b(View view) {
        if (f1764c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f1764c = false;
            }
        }
        return view.getAlpha();
    }

    public void e(View view, float f10) {
        if (f1764c) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f1764c = false;
            }
        }
        view.setAlpha(f10);
    }

    public void a(View view) {
    }

    public void c(View view) {
    }
}
