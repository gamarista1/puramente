package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.core.view.C1708p0;
import androidx.core.view.f1;
import kotlin.jvm.internal.C6496s;

class z extends w {
    public void b(M m10, M m11, Window window, View view, boolean z10, boolean z11) {
        C6496s.h(m10, "statusBarStyle");
        C6496s.h(m11, "navigationBarStyle");
        C6496s.h(window, "window");
        C6496s.h(view, "view");
        boolean z12 = false;
        C1708p0.b(window, false);
        window.setStatusBarColor(m10.e(z10));
        window.setNavigationBarColor(m11.e(z11));
        window.setStatusBarContrastEnforced(false);
        if (m11.c() == 0) {
            z12 = true;
        }
        window.setNavigationBarContrastEnforced(z12);
        f1 f1Var = new f1(window, view);
        f1Var.d(!z10);
        f1Var.c(true ^ z11);
    }
}
