package E3;

import android.os.Build;
import android.view.ViewGroup;

abstract class x {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f1917a = true;

    static v a(ViewGroup viewGroup) {
        return new u(viewGroup);
    }

    private static void b(ViewGroup viewGroup, boolean z10) {
        if (f1917a) {
            try {
                viewGroup.suppressLayout(z10);
            } catch (NoSuchMethodError unused) {
                f1917a = false;
            }
        }
    }

    static void c(ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z10);
        } else {
            b(viewGroup, z10);
        }
    }
}
