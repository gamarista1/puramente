package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import com.google.android.gms.common.api.a;
import java.lang.reflect.Method;
import java.util.Objects;
import x1.i;

/* renamed from: androidx.core.view.e0  reason: case insensitive filesystem */
public abstract class C1686e0 {

    /* renamed from: a  reason: collision with root package name */
    private static Method f16076a;

    /* renamed from: androidx.core.view.e0$a */
    static class a {
        static float a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        static float b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* renamed from: androidx.core.view.e0$b */
    static class b {
        static int a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        static boolean b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    /* renamed from: androidx.core.view.e0$c */
    static class c {
        static int a(ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i10, i11, i12);
        }

        static int b(ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i10, i11, i12);
        }
    }

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f16076a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", (Class[]) null);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    private static int a(Resources resources, int i10, i iVar, int i11) {
        int dimensionPixelSize;
        if (i10 == -1) {
            return ((Integer) iVar.get()).intValue();
        }
        if (i10 == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i10)) < 0) {
            return i11;
        }
        return dimensionPixelSize;
    }

    private static float b(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f16076a) != null) {
            try {
                return (float) ((Integer) method.invoke(viewConfiguration, (Object[]) null)).intValue();
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    private static int c(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    private static int d(Resources resources, int i10, int i11) {
        if (i10 == 4194304 && i11 == 26) {
            return c(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    private static int e(Resources resources, int i10, int i11) {
        if (i10 == 4194304 && i11 == 26) {
            return c(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static float f(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.a(viewConfiguration);
        }
        return b(viewConfiguration, context);
    }

    public static int g(ViewConfiguration viewConfiguration) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(viewConfiguration);
        }
        return viewConfiguration.getScaledTouchSlop() / 2;
    }

    public static int h(Context context, ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.a(viewConfiguration, i10, i11, i12);
        }
        if (!k(i10, i11, i12)) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int d10 = d(resources, i12, i11);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, d10, new C1682c0(viewConfiguration), Integer.MIN_VALUE);
    }

    public static int i(Context context, ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.b(viewConfiguration, i10, i11, i12);
        }
        if (!k(i10, i11, i12)) {
            return a.e.API_PRIORITY_OTHER;
        }
        Resources resources = context.getResources();
        int e10 = e(resources, i12, i11);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, e10, new C1684d0(viewConfiguration), a.e.API_PRIORITY_OTHER);
    }

    public static float j(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.b(viewConfiguration);
        }
        return b(viewConfiguration, context);
    }

    private static boolean k(int i10, int i11, int i12) {
        InputDevice device = InputDevice.getDevice(i10);
        if (device == null || device.getMotionRange(i11, i12) == null) {
            return false;
        }
        return true;
    }

    public static boolean l(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.b(viewConfiguration);
        }
        Resources resources = context.getResources();
        int c10 = c(resources, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
        if (c10 == 0 || !resources.getBoolean(c10)) {
            return false;
        }
        return true;
    }
}
