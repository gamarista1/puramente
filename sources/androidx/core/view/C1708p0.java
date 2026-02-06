package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: androidx.core.view.p0  reason: case insensitive filesystem */
public abstract class C1708p0 {

    /* renamed from: androidx.core.view.p0$a */
    static class a {
        static void a(Window window, boolean z10) {
            int i10;
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z10) {
                i10 = systemUiVisibility & -1793;
            } else {
                i10 = systemUiVisibility | 1792;
            }
            decorView.setSystemUiVisibility(i10);
        }
    }

    /* renamed from: androidx.core.view.p0$b */
    static class b {
        static void a(Window window, boolean z10) {
            int i10;
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z10) {
                i10 = systemUiVisibility & -257;
            } else {
                i10 = systemUiVisibility | 256;
            }
            decorView.setSystemUiVisibility(i10);
            window.setDecorFitsSystemWindows(z10);
        }
    }

    /* renamed from: androidx.core.view.p0$c */
    static class c {
        static void a(Window window, boolean z10) {
            window.setDecorFitsSystemWindows(z10);
        }
    }

    public static f1 a(Window window, View view) {
        return new f1(window, view);
    }

    public static void b(Window window, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            c.a(window, z10);
        } else if (i10 >= 30) {
            b.a(window, z10);
        } else {
            a.a(window, z10);
        }
    }
}
