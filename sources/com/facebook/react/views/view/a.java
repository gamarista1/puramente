package com.facebook.react.views.view;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C6496s;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f42332a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static Method f42333b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f42334c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f42335d;

    private a() {
    }

    public static final void a(Canvas canvas, boolean z10) {
        Method method;
        C6496s.h(canvas, "canvas");
        if (Build.VERSION.SDK_INT < 29) {
            f42332a.b();
            if (z10) {
                try {
                    Method method2 = f42333b;
                    if (method2 != null) {
                        if (method2 != null) {
                            method2.invoke(canvas, (Object[]) null);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                    return;
                }
            }
            if (!z10 && (method = f42334c) != null) {
                if (method != null) {
                    method.invoke(canvas, (Object[]) null);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        } else if (z10) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }

    private final void b() {
        if (!f42335d) {
            try {
                Class<Canvas> cls = Canvas.class;
                if (Build.VERSION.SDK_INT == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", new Class[]{String.class, Object[].class});
                    Object invoke = declaredMethod.invoke(cls, new Object[]{"insertReorderBarrier", new Class[0]});
                    C6496s.f(invoke, "null cannot be cast to non-null type java.lang.reflect.Method");
                    f42333b = (Method) invoke;
                    Object invoke2 = declaredMethod.invoke(cls, new Object[]{"insertInorderBarrier", new Class[0]});
                    C6496s.f(invoke2, "null cannot be cast to non-null type java.lang.reflect.Method");
                    f42334c = (Method) invoke2;
                } else {
                    f42333b = cls.getDeclaredMethod("insertReorderBarrier", (Class[]) null);
                    f42334c = cls.getDeclaredMethod("insertInorderBarrier", (Class[]) null);
                }
                Method method = f42333b;
                if (method == null) {
                    return;
                }
                if (f42334c != null) {
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Method method2 = f42334c;
                    if (method2 != null) {
                        method2.setAccessible(true);
                    }
                    f42335d = true;
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
    }
}
