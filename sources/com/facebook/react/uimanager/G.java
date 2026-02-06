package com.facebook.react.uimanager;

import android.util.DisplayMetrics;
import android.util.TypedValue;

public final class G {

    /* renamed from: a  reason: collision with root package name */
    public static final G f41415a = new G();

    private G() {
    }

    public static final float c() {
        return C3408e.e().density;
    }

    public static final float f(float f10) {
        if (Float.isNaN(f10)) {
            return Float.NaN;
        }
        return f10 / C3408e.e().density;
    }

    public static final float g(double d10) {
        return h((float) d10);
    }

    public static final float h(float f10) {
        if (Float.isNaN(f10)) {
            return Float.NaN;
        }
        return TypedValue.applyDimension(1, f10, C3408e.e());
    }

    public static final float i(double d10) {
        return l((float) d10, 0.0f, 2, (Object) null);
    }

    public static final float j(float f10) {
        return l(f10, 0.0f, 2, (Object) null);
    }

    public static final float k(float f10, float f11) {
        if (Float.isNaN(f10)) {
            return Float.NaN;
        }
        DisplayMetrics e10 = C3408e.e();
        float applyDimension = TypedValue.applyDimension(2, f10, e10);
        if (f11 >= 1.0f) {
            return Math.min(applyDimension, f10 * e10.density * f11);
        }
        return applyDimension;
    }

    public static /* synthetic */ float l(float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = Float.NaN;
        }
        return k(f10, f11);
    }

    public final float a(double d10) {
        return h((float) d10);
    }

    public final float b(float f10) {
        return h(f10);
    }

    public final float d(float f10) {
        return f(f10);
    }

    public final float e(int i10) {
        return f((float) i10);
    }
}
