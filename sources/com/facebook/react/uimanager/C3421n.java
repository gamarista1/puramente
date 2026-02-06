package com.facebook.react.uimanager;

/* renamed from: com.facebook.react.uimanager.n  reason: case insensitive filesystem */
public final class C3421n {

    /* renamed from: a  reason: collision with root package name */
    public static final C3421n f41707a = new C3421n();

    private C3421n() {
    }

    public static final boolean a(float f10, float f11) {
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            if (!Float.isNaN(f10) || !Float.isNaN(f11)) {
                return false;
            }
        } else if (Math.abs(f11 - f10) >= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static final boolean b(Float f10, Float f11) {
        if (f10 == null) {
            if (f11 == null) {
                return true;
            }
            return false;
        } else if (f11 == null) {
            return false;
        } else {
            return a(f10.floatValue(), f11.floatValue());
        }
    }
}
