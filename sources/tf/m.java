package Tf;

import Uf.C5553f;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.jvm.internal.C6481c;
import kotlin.jvm.internal.C6496s;

final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f65167a = new m();

    private m() {
    }

    public final String a(Constructor constructor) {
        C6496s.h(constructor, "constructor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Iterator a10 = C6481c.a(constructor.getParameterTypes());
        while (a10.hasNext()) {
            Class cls = (Class) a10.next();
            C6496s.e(cls);
            sb2.append(C5553f.f(cls));
        }
        sb2.append(")V");
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }

    public final String b(Field field) {
        C6496s.h(field, "field");
        Class<?> type = field.getType();
        C6496s.g(type, "getType(...)");
        return C5553f.f(type);
    }

    public final String c(Method method) {
        C6496s.h(method, "method");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Iterator a10 = C6481c.a(method.getParameterTypes());
        while (a10.hasNext()) {
            Class cls = (Class) a10.next();
            C6496s.e(cls);
            sb2.append(C5553f.f(cls));
        }
        sb2.append(")");
        Class<?> returnType = method.getReturnType();
        C6496s.g(returnType, "getReturnType(...)");
        sb2.append(C5553f.f(returnType));
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }
}
