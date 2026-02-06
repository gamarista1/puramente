package h8;

import Ef.m;

public abstract class c {
    public static final float a(float f10, float f11) {
        float f12;
        if (f10 < Math.abs(f11)) {
            float f13 = (float) 1;
            f12 = f13 + ((float) Math.pow((double) ((f10 / Math.abs(f11)) - f13), (double) 3));
        } else {
            f12 = 1.0f;
        }
        return m.c(f10 + (f11 * f12), 0.0f);
    }
}
