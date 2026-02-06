package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class r0 {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f12001a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f12002b;

    /* renamed from: c  reason: collision with root package name */
    static final boolean f12003c;

    static class a {
        static void a(View view, Rect rect, Rect rect2) {
            Insets systemWindowInsets = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
            rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
        }
    }

    static {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 27) {
            z10 = true;
        } else {
            z10 = false;
        }
        f12003c = z10;
    }

    public static void a(View view, Rect rect, Rect rect2) {
        Class<Rect> cls = Rect.class;
        if (Build.VERSION.SDK_INT >= 29) {
            a.a(view, rect, rect2);
            return;
        }
        if (!f12001a) {
            f12001a = true;
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{cls, cls});
                f12002b = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    f12002b.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
        Method method = f12002b;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{rect, rect2});
            } catch (Exception e10) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e10);
            }
        }
    }

    public static boolean b(View view) {
        if (view.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public static void c(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", (Class[]) null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, (Object[]) null);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e10) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
        } catch (IllegalAccessException e11) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e11);
        }
    }
}
