package Uf;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C6496s;

/* renamed from: Uf.a  reason: case insensitive filesystem */
final class C5548a {

    /* renamed from: a  reason: collision with root package name */
    public static final C5548a f65226a = new C5548a();

    /* renamed from: b  reason: collision with root package name */
    private static C0957a f65227b;

    /* renamed from: Uf.a$a  reason: collision with other inner class name */
    public static final class C0957a {

        /* renamed from: a  reason: collision with root package name */
        private final Method f65228a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f65229b;

        public C0957a(Method method, Method method2) {
            this.f65228a = method;
            this.f65229b = method2;
        }

        public final Method a() {
            return this.f65229b;
        }

        public final Method b() {
            return this.f65228a;
        }
    }

    private C5548a() {
    }

    private final C0957a a(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new C0957a(cls.getMethod("getType", (Class[]) null), cls.getMethod("getAccessor", (Class[]) null));
        } catch (NoSuchMethodException unused) {
            return new C0957a((Method) null, (Method) null);
        }
    }

    private final C0957a b(Object obj) {
        C0957a aVar = f65227b;
        if (aVar != null) {
            return aVar;
        }
        C0957a a10 = a(obj);
        f65227b = a10;
        return a10;
    }

    public final Method c(Object obj) {
        C6496s.h(obj, "recordComponent");
        Method a10 = b(obj).a();
        if (a10 == null) {
            return null;
        }
        Object invoke = a10.invoke(obj, (Object[]) null);
        C6496s.f(invoke, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (Method) invoke;
    }

    public final Class d(Object obj) {
        C6496s.h(obj, "recordComponent");
        Method b10 = b(obj).b();
        if (b10 == null) {
            return null;
        }
        Object invoke = b10.invoke(obj, (Object[]) null);
        C6496s.f(invoke, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) invoke;
    }
}
