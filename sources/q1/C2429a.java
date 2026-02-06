package q1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: q1.a  reason: case insensitive filesystem */
public abstract class C2429a {

    /* renamed from: q1.a$a  reason: collision with other inner class name */
    static class C0426a {
        static void a(Drawable drawable, float f10, float f11) {
            drawable.setHotspot(f10, f11);
        }

        static void b(Drawable drawable, int i10, int i11, int i12, int i13) {
            drawable.setHotspotBounds(i10, i11, i12, i13);
        }

        static void c(Drawable drawable, int i10) {
            drawable.setTint(i10);
        }

        static void d(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        static void e(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* renamed from: q1.a$b */
    static class b {
        static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        static boolean b(Drawable drawable, int i10) {
            return drawable.setLayoutDirection(i10);
        }
    }

    public static void a(Drawable drawable) {
        drawable.clearColorFilter();
    }

    public static int b(Drawable drawable) {
        return b.a(drawable);
    }

    public static boolean c(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static void d(Drawable drawable, boolean z10) {
        drawable.setAutoMirrored(z10);
    }

    public static void e(Drawable drawable, float f10, float f11) {
        C0426a.a(drawable, f10, f11);
    }

    public static void f(Drawable drawable, int i10, int i11, int i12, int i13) {
        C0426a.b(drawable, i10, i11, i12, i13);
    }

    public static boolean g(Drawable drawable, int i10) {
        return b.b(drawable, i10);
    }

    public static void h(Drawable drawable, int i10) {
        C0426a.c(drawable, i10);
    }

    public static void i(Drawable drawable, ColorStateList colorStateList) {
        C0426a.d(drawable, colorStateList);
    }

    public static void j(Drawable drawable, PorterDuff.Mode mode) {
        C0426a.e(drawable, mode);
    }

    public static Drawable k(Drawable drawable) {
        if (drawable instanceof C2430b) {
            return ((C2430b) drawable).a();
        }
        return drawable;
    }

    public static Drawable l(Drawable drawable) {
        return drawable;
    }
}
