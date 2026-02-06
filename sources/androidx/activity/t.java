package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.core.view.C1708p0;
import androidx.core.view.f1;
import kotlin.jvm.internal.C6496s;

final class t extends B {
    public void b(M m10, M m11, Window window, View view, boolean z10, boolean z11) {
        C6496s.h(m10, "statusBarStyle");
        C6496s.h(m11, "navigationBarStyle");
        C6496s.h(window, "window");
        C6496s.h(view, "view");
        C1708p0.b(window, false);
        window.setStatusBarColor(m10.d(z10));
        window.setNavigationBarColor(m11.a());
        new f1(window, view).d(!z10);
    }
}
