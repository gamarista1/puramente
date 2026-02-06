package D5;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.C6496s;
import t7.C4049a;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final u f30536a = new u();

    public enum a {
        NONE("none"),
        V1("Android-GPBL-V1"),
        V2_V4("Android-GPBL-V2-V4"),
        V5_V7("Android-GPBL-V5-V7");
        

        /* renamed from: a  reason: collision with root package name */
        private final String f30542a;

        private a(String str) {
            this.f30542a = str;
        }

        public final String b() {
            return this.f30542a;
        }
    }

    public enum b {
        INAPP("inapp"),
        SUBS("subs");
        

        /* renamed from: a  reason: collision with root package name */
        private final String f30546a;

        private b(String str) {
            this.f30546a = str;
        }

        public final String b() {
            return this.f30546a;
        }
    }

    private u() {
    }

    public static final Class a(String str) {
        Class<u> cls = u.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(str, "className");
            try {
                return Class.forName(str);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final Class b(Context context, String str) {
        Class<u> cls = u.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(context, "context");
            C6496s.h(str, "className");
            try {
                return context.getClassLoader().loadClass(str);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final Method c(Class cls, String str, Class... clsArr) {
        Class<u> cls2 = u.class;
        if (C4049a.d(cls2)) {
            return null;
        }
        try {
            C6496s.h(cls, "clazz");
            C6496s.h(str, "methodName");
            C6496s.h(clsArr, "args");
            try {
                return cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th2) {
            C4049a.b(th2, cls2);
            return null;
        }
    }

    public static final Method d(Class cls, String str, Class... clsArr) {
        Class<u> cls2 = u.class;
        if (C4049a.d(cls2)) {
            return null;
        }
        try {
            C6496s.h(cls, "clazz");
            C6496s.h(str, "methodName");
            C6496s.h(clsArr, "args");
            try {
                return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th2) {
            C4049a.b(th2, cls2);
            return null;
        }
    }

    public static final Object e(Class cls, Method method, Object obj, Object... objArr) {
        Class<u> cls2 = u.class;
        if (C4049a.d(cls2)) {
            return null;
        }
        try {
            C6496s.h(cls, "clazz");
            C6496s.h(method, "method");
            C6496s.h(objArr, "args");
            if (obj != null) {
                obj = cls.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th2) {
            C4049a.b(th2, cls2);
            return null;
        }
    }
}
