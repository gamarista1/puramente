package tf;

import Cf.b;
import Cf.c;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;

/* renamed from: tf.a  reason: case insensitive filesystem */
public abstract class C6727a {

    /* renamed from: tf.a$a  reason: collision with other inner class name */
    private static final class C1068a {

        /* renamed from: a  reason: collision with root package name */
        public static final C1068a f73549a = new C1068a();

        /* renamed from: b  reason: collision with root package name */
        public static final Method f73550b;

        /* renamed from: c  reason: collision with root package name */
        public static final Method f73551c;

        static {
            Method method;
            Method method2;
            Class<Throwable> cls = Throwable.class;
            Method[] methods = cls.getMethods();
            C6496s.e(methods);
            int length = methods.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                method = null;
                if (i11 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i11];
                if (C6496s.c(method2.getName(), "addSuppressed")) {
                    Class[] parameterTypes = method2.getParameterTypes();
                    C6496s.g(parameterTypes, "getParameterTypes(...)");
                    if (C6496s.c(C6559l.a1(parameterTypes), cls)) {
                        break;
                    }
                }
                i11++;
            }
            f73550b = method2;
            int length2 = methods.length;
            while (true) {
                if (i10 >= length2) {
                    break;
                }
                Method method3 = methods[i10];
                if (C6496s.c(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i10++;
            }
            f73551c = method;
        }

        private C1068a() {
        }
    }

    public void a(Throwable th2, Throwable th3) {
        C6496s.h(th2, "cause");
        C6496s.h(th3, "exception");
        Method method = C1068a.f73550b;
        if (method != null) {
            method.invoke(th2, new Object[]{th3});
        }
    }

    public c b() {
        return new b();
    }
}
