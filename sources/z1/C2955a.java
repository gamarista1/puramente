package z1;

import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: z1.a  reason: case insensitive filesystem */
public abstract class C2955a {

    /* renamed from: z1.a$a  reason: collision with other inner class name */
    static class C0488a {
        static Interpolator a(float f10, float f11, float f12, float f13) {
            return new PathInterpolator(f10, f11, f12, f13);
        }
    }

    public static Interpolator a(float f10, float f11, float f12, float f13) {
        return C0488a.a(f10, f11, f12, f13);
    }
}
