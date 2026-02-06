package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import i.j;
import p1.C2387c;

public abstract class c0 {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal f11866a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    static final int[] f11867b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    static final int[] f11868c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    static final int[] f11869d = {16843518};

    /* renamed from: e  reason: collision with root package name */
    static final int[] f11870e = {16842919};

    /* renamed from: f  reason: collision with root package name */
    static final int[] f11871f = {16842912};

    /* renamed from: g  reason: collision with root package name */
    static final int[] f11872g = {16842913};

    /* renamed from: h  reason: collision with root package name */
    static final int[] f11873h = {-16842919, -16842908};

    /* renamed from: i  reason: collision with root package name */
    static final int[] f11874i = new int[0];

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f11875j = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(j.f21675y0);
        try {
            if (!obtainStyledAttributes.hasValue(j.f21448D0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i10) {
        ColorStateList e10 = e(context, i10);
        if (e10 != null && e10.isStateful()) {
            return e10.getColorForState(f11867b, e10.getDefaultColor());
        }
        TypedValue f10 = f();
        context.getTheme().resolveAttribute(16842803, f10, true);
        return d(context, i10, f10.getFloat());
    }

    public static int c(Context context, int i10) {
        int[] iArr = f11875j;
        iArr[0] = i10;
        g0 u10 = g0.u(context, (AttributeSet) null, iArr);
        try {
            return u10.b(0, 0);
        } finally {
            u10.x();
        }
    }

    static int d(Context context, int i10, float f10) {
        int c10 = c(context, i10);
        return C2387c.p(c10, Math.round(((float) Color.alpha(c10)) * f10));
    }

    public static ColorStateList e(Context context, int i10) {
        int[] iArr = f11875j;
        iArr[0] = i10;
        g0 u10 = g0.u(context, (AttributeSet) null, iArr);
        try {
            return u10.c(0);
        } finally {
            u10.x();
        }
    }

    private static TypedValue f() {
        ThreadLocal threadLocal = f11866a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
