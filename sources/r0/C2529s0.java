package r0;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C6496s;

/* renamed from: r0.s0  reason: case insensitive filesystem */
public final class C2529s0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C2529s0 f25552a = new C2529s0();

    /* renamed from: b  reason: collision with root package name */
    private static Method f25553b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f25554c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f25555d;

    private C2529s0() {
    }

    public final void a(Canvas canvas, boolean z10) {
        Method method;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            C2538v0.f25556a.a(canvas, z10);
            return;
        }
        if (!f25555d) {
            Class<Canvas> cls = Canvas.class;
            if (i10 == 28) {
                try {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", new Class[]{String.class, new Class[0].getClass()});
                    f25553b = (Method) declaredMethod.invoke(cls, new Object[]{"insertReorderBarrier", new Class[0]});
                    f25554c = (Method) declaredMethod.invoke(cls, new Object[]{"insertInorderBarrier", new Class[0]});
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            } else {
                f25553b = cls.getDeclaredMethod("insertReorderBarrier", (Class[]) null);
                f25554c = cls.getDeclaredMethod("insertInorderBarrier", (Class[]) null);
            }
            Method method2 = f25553b;
            if (method2 != null) {
                method2.setAccessible(true);
            }
            Method method3 = f25554c;
            if (method3 != null) {
                method3.setAccessible(true);
            }
            f25555d = true;
        }
        if (z10) {
            try {
                Method method4 = f25553b;
                if (method4 != null) {
                    C6496s.e(method4);
                    method4.invoke(canvas, (Object[]) null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (!z10 && (method = f25554c) != null) {
            C6496s.e(method);
            method.invoke(canvas, (Object[]) null);
        }
    }
}
