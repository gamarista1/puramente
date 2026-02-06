package com.amazon.a.a.o;

import com.amazon.a.a.o.a.a;
import java.lang.reflect.Method;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final c f37560a = new c("Reflection");

    public static Class<?> a(String str) {
        a.a((Object) str, "String className");
        try {
            return Thread.currentThread().getContextClassLoader().loadClass(str);
        } catch (ClassNotFoundException unused) {
            if (c.f37534a) {
                c cVar = f37560a;
                cVar.a("ClassNoFound: " + str);
            }
            return null;
        }
    }

    public static boolean b(Method method) {
        a.a((Object) method, "Method m");
        return method.getReturnType().equals(Void.TYPE);
    }

    public static boolean c(Method method) {
        a.a((Object) method, "Method m");
        if ((method.getModifiers() & 8) != 0) {
            return true;
        }
        return false;
    }

    public static boolean a(Method method) {
        a.a((Object) method, "Method m");
        return method.getParameterTypes().length > 0;
    }
}
