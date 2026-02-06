package com.google.android.material.internal;

import Ya.a;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.core.view.C1708p0;
import androidx.core.view.f1;
import p1.C2387c;

public abstract class d {
    public static void a(Window window, boolean z10, Integer num, Integer num2) {
        boolean z11;
        boolean z12 = false;
        if (num == null || num.intValue() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (num2 == null || num2.intValue() == 0) {
            z12 = true;
        }
        if (z11 || z12) {
            int b10 = a.b(window.getContext(), 16842801, -16777216);
            if (z11) {
                num = Integer.valueOf(b10);
            }
            if (z12) {
                num2 = Integer.valueOf(b10);
            }
        }
        C1708p0.b(window, !z10);
        int c10 = c(window.getContext(), z10);
        int b11 = b(window.getContext(), z10);
        window.setStatusBarColor(c10);
        window.setNavigationBarColor(b11);
        boolean d10 = d(c10, a.f(num.intValue()));
        boolean d11 = d(b11, a.f(num2.intValue()));
        f1 a10 = C1708p0.a(window, window.getDecorView());
        if (a10 != null) {
            a10.d(d10);
            a10.c(d11);
        }
    }

    private static int b(Context context, boolean z10) {
        if (z10 && Build.VERSION.SDK_INT < 27) {
            return C2387c.p(a.b(context, 16843858, -16777216), 128);
        }
        if (z10) {
            return 0;
        }
        return a.b(context, 16843858, -16777216);
    }

    private static int c(Context context, boolean z10) {
        if (z10) {
            return 0;
        }
        return a.b(context, 16843857, -16777216);
    }

    private static boolean d(int i10, boolean z10) {
        if (a.f(i10) || (i10 == 0 && z10)) {
            return true;
        }
        return false;
    }
}
