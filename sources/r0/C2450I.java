package r0;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* renamed from: r0.I  reason: case insensitive filesystem */
public abstract class C2450I {
    public static final ColorFilter a(float[] fArr) {
        return new ColorMatrixColorFilter(fArr);
    }

    public static final float[] b(ColorFilter colorFilter) {
        if ((colorFilter instanceof ColorMatrixColorFilter) && e()) {
            return C2441D0.f25402a.a((ColorMatrixColorFilter) colorFilter);
        }
        throw new IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
    }

    public static final ColorFilter c(long j10, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C2508l0.f25542a.a(j10, i10);
        }
        return new PorterDuffColorFilter(C2550z0.k(j10), C2444F.c(i10));
    }

    public static final ColorFilter d(C2547y0 y0Var) {
        return y0Var.a();
    }

    public static final boolean e() {
        if (26 <= Build.VERSION.SDK_INT) {
            return true;
        }
        return false;
    }
}
