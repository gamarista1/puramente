package Uf;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C6496s;

/* renamed from: Uf.b  reason: case insensitive filesystem */
final class C5549b {

    /* renamed from: a  reason: collision with root package name */
    public static final C5549b f65230a = new C5549b();

    /* renamed from: b  reason: collision with root package name */
    private static a f65231b;

    /* renamed from: Uf.b$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Method f65232a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f65233b;

        /* renamed from: c  reason: collision with root package name */
        private final Method f65234c;

        /* renamed from: d  reason: collision with root package name */
        private final Method f65235d;

        public a(Method method, Method method2, Method method3, Method method4) {
            this.f65232a = method;
            this.f65233b = method2;
            this.f65234c = method3;
            this.f65235d = method4;
        }

        public final Method a() {
            return this.f65233b;
        }

        public final Method b() {
            return this.f65235d;
        }

        public final Method c() {
            return this.f65234c;
        }

        public final Method d() {
            return this.f65232a;
        }
    }

    private C5549b() {
    }

    private final a a() {
        Class<Class> cls = Class.class;
        try {
            return new a(cls.getMethod("isSealed", (Class[]) null), cls.getMethod("getPermittedSubclasses", (Class[]) null), cls.getMethod("isRecord", (Class[]) null), cls.getMethod("getRecordComponents", (Class[]) null));
        } catch (NoSuchMethodException unused) {
            return new a((Method) null, (Method) null, (Method) null, (Method) null);
        }
    }

    private final a b() {
        a aVar = f65231b;
        if (aVar != null) {
            return aVar;
        }
        a a10 = a();
        f65231b = a10;
        return a10;
    }

    public final Class[] c(Class cls) {
        C6496s.h(cls, "clazz");
        Method a10 = b().a();
        if (a10 == null) {
            return null;
        }
        Object invoke = a10.invoke(cls, (Object[]) null);
        C6496s.f(invoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
        return (Class[]) invoke;
    }

    public final Object[] d(Class cls) {
        C6496s.h(cls, "clazz");
        Method b10 = b().b();
        if (b10 == null) {
            return null;
        }
        return (Object[]) b10.invoke(cls, (Object[]) null);
    }

    public final Boolean e(Class cls) {
        C6496s.h(cls, "clazz");
        Method c10 = b().c();
        if (c10 == null) {
            return null;
        }
        Object invoke = c10.invoke(cls, (Object[]) null);
        C6496s.f(invoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) invoke;
    }

    public final Boolean f(Class cls) {
        C6496s.h(cls, "clazz");
        Method d10 = b().d();
        if (d10 == null) {
            return null;
        }
        Object invoke = d10.invoke(cls, (Object[]) null);
        C6496s.f(invoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) invoke;
    }
}
