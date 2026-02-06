package Ef;

import kotlin.jvm.internal.C6496s;

abstract class n {
    public static final void a(boolean z10, Number number) {
        C6496s.h(number, "step");
        if (!z10) {
            throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
        }
    }

    public static e b(float f10, float f11) {
        return new d(f10, f11);
    }
}
