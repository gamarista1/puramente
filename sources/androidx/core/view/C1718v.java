package androidx.core.view;

import android.view.ViewGroup;

/* renamed from: androidx.core.view.v  reason: case insensitive filesystem */
public abstract class C1718v {
    public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    public static void c(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.setMarginEnd(i10);
    }

    public static void d(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.setMarginStart(i10);
    }
}
