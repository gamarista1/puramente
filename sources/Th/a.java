package Th;

import android.os.Build;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

public abstract class a {

    /* renamed from: Th.a$a  reason: collision with other inner class name */
    private static class C0956a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private final Object f65185a;

        public C0956a(Object obj) {
            this.f65185a = obj;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                return a.d(method, this.f65185a.getClass().getClassLoader()).invoke(this.f65185a, objArr);
            } catch (InvocationTargetException e10) {
                throw e10.getTargetException();
            } catch (ReflectiveOperationException e11) {
                throw new RuntimeException("Reflection failed for method " + method, e11);
            }
        }
    }

    public static Object a(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static boolean b(Collection collection, String str) {
        if (!collection.contains(str)) {
            if (e()) {
                if (collection.contains(str + ":dev")) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static InvocationHandler c(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0956a(obj);
    }

    public static Method d(Method method, ClassLoader classLoader) {
        return Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
    }

    private static boolean e() {
        String str = Build.TYPE;
        if ("eng".equals(str) || "userdebug".equals(str)) {
            return true;
        }
        return false;
    }
}
