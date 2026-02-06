package com.facebook.react.views.view;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.core.view.C1680b0;
import androidx.core.view.C1708p0;
import androidx.core.view.f1;
import kotlin.jvm.internal.C6496s;

public abstract class k {
    public static final void b(Window window, boolean z10) {
        C6496s.h(window, "<this>");
        if (z10) {
            window.getDecorView().setOnApplyWindowInsetsListener(new j());
        } else {
            window.getDecorView().setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
        }
        C1680b0.l0(window.getDecorView());
    }

    /* access modifiers changed from: private */
    public static final WindowInsets c(View view, WindowInsets windowInsets) {
        C6496s.h(view, "v");
        C6496s.h(windowInsets, "insets");
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        return onApplyWindowInsets.replaceSystemWindowInsets(onApplyWindowInsets.getSystemWindowInsetLeft(), 0, onApplyWindowInsets.getSystemWindowInsetRight(), onApplyWindowInsets.getSystemWindowInsetBottom());
    }

    public static final void d(Window window, boolean z10) {
        C6496s.h(window, "<this>");
        if (z10) {
            f(window);
        } else {
            g(window);
        }
    }

    public static final void e(Window window, boolean z10) {
        boolean z11;
        C6496s.h(window, "<this>");
        C1708p0.b(window, !z10);
        if (z10) {
            int i10 = 0;
            int i11 = 1;
            if ((window.getContext().getResources().getConfiguration().uiMode & 48) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 29) {
                window.setStatusBarContrastEnforced(false);
                window.setNavigationBarContrastEnforced(true);
            }
            window.setStatusBarColor(0);
            if (i12 < 29) {
                if (i12 < 27 || z11) {
                    i10 = Color.argb(128, 27, 27, 27);
                } else {
                    i10 = Color.argb(230, 255, 255, 255);
                }
            }
            window.setNavigationBarColor(i10);
            new f1(window, window.getDecorView()).c(!z11);
            if (i12 >= 28) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                if (i12 >= 30) {
                    i11 = 3;
                }
                attributes.layoutInDisplayCutoutMode = i11;
            }
        }
    }

    private static final void f(Window window) {
        if (Build.VERSION.SDK_INT >= 30) {
            window.getAttributes().layoutInDisplayCutoutMode = 1;
            window.setDecorFitsSystemWindows(false);
        }
        window.addFlags(1024);
        window.clearFlags(2048);
    }

    private static final void g(Window window) {
        if (Build.VERSION.SDK_INT >= 30) {
            window.getAttributes().layoutInDisplayCutoutMode = 0;
            window.setDecorFitsSystemWindows(true);
        }
        window.addFlags(2048);
        window.clearFlags(1024);
    }
}
