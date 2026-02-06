package retrofit2;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

abstract class H {
    H() {
    }

    static H b(G g10, Class cls, Method method) {
        E b10 = E.b(g10, cls, method);
        Type genericReturnType = method.getGenericReturnType();
        if (K.j(genericReturnType)) {
            throw K.n(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        } else if (genericReturnType != Void.TYPE) {
            return s.f(g10, method, b10);
        } else {
            throw K.n(method, "Service methods cannot return void.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract Object a(Object obj, Object[] objArr);
}
