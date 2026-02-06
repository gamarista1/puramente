package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import q1.C2429a;

public abstract class N {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f11549a = {16842912};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f11550b = new int[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Rect f11551c = new Rect();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final boolean f11552a;

        /* renamed from: b  reason: collision with root package name */
        private static final Method f11553b;

        /* renamed from: c  reason: collision with root package name */
        private static final Field f11554c;

        /* renamed from: d  reason: collision with root package name */
        private static final Field f11555d;

        /* renamed from: e  reason: collision with root package name */
        private static final Field f11556e;

        /* renamed from: f  reason: collision with root package name */
        private static final Field f11557f;

        /* JADX WARNING: Removed duplicated region for block: B:43:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0057  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ NoSuchMethodException -> 0x0043, ClassNotFoundException -> 0x0040, NoSuchFieldException -> 0x003d }
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.reflect.Method r4 = r4.getMethod(r5, r1)     // Catch:{ NoSuchMethodException -> 0x0043, ClassNotFoundException -> 0x0040, NoSuchFieldException -> 0x003d }
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch:{ NoSuchMethodException -> 0x003a, ClassNotFoundException -> 0x0037, NoSuchFieldException -> 0x0034 }
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch:{ NoSuchMethodException -> 0x0032, ClassNotFoundException -> 0x0030, NoSuchFieldException -> 0x002d }
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException -> 0x002b }
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException -> 0x0046 }
                r8 = r0
                goto L_0x0048
            L_0x002b:
                r7 = r1
                goto L_0x0046
            L_0x002d:
                r6 = r1
            L_0x002e:
                r7 = r6
                goto L_0x0046
            L_0x0030:
                r6 = r1
                goto L_0x002e
            L_0x0032:
                r6 = r1
                goto L_0x002e
            L_0x0034:
                r5 = r1
            L_0x0035:
                r6 = r5
                goto L_0x002e
            L_0x0037:
                r5 = r1
            L_0x0038:
                r6 = r5
                goto L_0x002e
            L_0x003a:
                r5 = r1
            L_0x003b:
                r6 = r5
                goto L_0x002e
            L_0x003d:
                r4 = r1
                r5 = r4
                goto L_0x0035
            L_0x0040:
                r4 = r1
                r5 = r4
                goto L_0x0038
            L_0x0043:
                r4 = r1
                r5 = r4
                goto L_0x003b
            L_0x0046:
                r3 = r1
                r8 = r2
            L_0x0048:
                if (r8 == 0) goto L_0x0057
                f11553b = r4
                f11554c = r5
                f11555d = r6
                f11556e = r7
                f11557f = r3
                f11552a = r0
                goto L_0x0063
            L_0x0057:
                f11553b = r1
                f11554c = r1
                f11555d = r1
                f11556e = r1
                f11557f = r1
                f11552a = r2
            L_0x0063:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.N.a.<clinit>():void");
        }

        static Rect a(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f11552a) {
                try {
                    Object invoke = f11553b.invoke(drawable, (Object[]) null);
                    if (invoke != null) {
                        return new Rect(f11554c.getInt(invoke), f11555d.getInt(invoke), f11556e.getInt(invoke), f11557f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return N.f11551c;
        }
    }

    static class b {
        static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static boolean a(Drawable drawable) {
        return true;
    }

    static void b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29 && i10 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            c(drawable);
        }
    }

    private static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f11549a);
        } else {
            drawable.setState(f11550b);
        }
        drawable.setState(state);
    }

    public static Rect d(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return a.a(C2429a.k(drawable));
        }
        Insets a10 = b.a(drawable);
        return new Rect(a10.left, a10.top, a10.right, a10.bottom);
    }

    public static PorterDuff.Mode e(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case StdKeyDeserializer.TYPE_URL /*14*/:
                return PorterDuff.Mode.MULTIPLY;
            case StdKeyDeserializer.TYPE_CLASS /*15*/:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
