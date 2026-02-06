package retrofit2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

abstract class q {

    /* renamed from: a  reason: collision with root package name */
    private static Constructor f72904a;

    static Object a(Method method, Class cls, Object obj, Object[] objArr) {
        Constructor constructor = f72904a;
        if (constructor == null) {
            constructor = l.a().getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
            constructor.setAccessible(true);
            f72904a = constructor;
        }
        return m.a(constructor.newInstance(new Object[]{cls, -1})).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
