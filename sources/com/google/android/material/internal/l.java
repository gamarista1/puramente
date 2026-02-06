package com.google.android.material.internal;

import Ua.a;
import Ua.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.g0;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f56088a = {a.f52732j};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f56089b = {a.f52733k};

    public static void a(Context context) {
        e(context, f56088a, "Theme.AppCompat");
    }

    private static void b(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f53277t6, i10, i11);
        boolean z10 = obtainStyledAttributes.getBoolean(j.f53293v6, false);
        obtainStyledAttributes.recycle();
        if (z10) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(a.f52739q, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context);
            }
        }
        a(context);
    }

    public static void c(Context context) {
        e(context, f56089b, "Theme.MaterialComponents");
    }

    private static void d(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        boolean z10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f53277t6, i10, i11);
        boolean z11 = false;
        if (!obtainStyledAttributes.getBoolean(j.f53301w6, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            if (obtainStyledAttributes.getResourceId(j.f53285u6, -1) != -1) {
                z11 = true;
            }
            z10 = z11;
        } else {
            z10 = f(context, attributeSet, iArr, i10, i11, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z10) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static void e(Context context, int[] iArr, String str) {
        if (!g(context, iArr)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
        }
    }

    private static boolean f(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
        for (int resourceId : iArr2) {
            if (obtainStyledAttributes.getResourceId(resourceId, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    private static boolean g(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (!obtainStyledAttributes.hasValue(i10)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    public static TypedArray h(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        b(context, attributeSet, i10, i11);
        d(context, attributeSet, iArr, i10, i11, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
    }

    public static g0 i(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        b(context, attributeSet, i10, i11);
        d(context, attributeSet, iArr, i10, i11, iArr2);
        return g0.v(context, attributeSet, iArr, i10, i11);
    }
}
