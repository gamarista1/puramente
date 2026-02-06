package Vg;

import Ug.H;
import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import qf.C6655a;
import qf.g;

public final class b extends C6655a implements H {
    private volatile Object _preHandler = this;

    public b() {
        super(H.f65314N);
    }

    private final Method z1() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", (Class[]) null);
            if (Modifier.isPublic(declaredMethod.getModifiers()) && Modifier.isStatic(declaredMethod.getModifiers())) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    public void I(g gVar, Throwable th2) {
        Object obj;
        int i10 = Build.VERSION.SDK_INT;
        if (26 <= i10 && i10 < 28) {
            Method z12 = z1();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            if (z12 != null) {
                obj = z12.invoke((Object) null, (Object[]) null);
            } else {
                obj = null;
            }
            if (obj instanceof Thread.UncaughtExceptionHandler) {
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) obj;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
            }
        }
    }
}
