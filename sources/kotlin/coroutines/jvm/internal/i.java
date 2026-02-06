package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C6496s;

final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f71745a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final a f71746b = new a((Method) null, (Method) null, (Method) null);

    /* renamed from: c  reason: collision with root package name */
    private static a f71747c;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Method f71748a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f71749b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f71750c;

        public a(Method method, Method method2, Method method3) {
            this.f71748a = method;
            this.f71749b = method2;
            this.f71750c = method3;
        }
    }

    private i() {
    }

    private final a a(a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", (Class[]) null), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", (Class[]) null), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", (Class[]) null));
            f71747c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f71746b;
            f71747c = aVar3;
            return aVar3;
        }
    }

    public final String b(a aVar) {
        Object obj;
        Object obj2;
        Object obj3;
        C6496s.h(aVar, "continuation");
        a aVar2 = f71747c;
        if (aVar2 == null) {
            aVar2 = a(aVar);
        }
        if (aVar2 == f71746b) {
            return null;
        }
        Method method = aVar2.f71748a;
        if (method != null) {
            obj = method.invoke(aVar.getClass(), (Object[]) null);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        Method method2 = aVar2.f71749b;
        if (method2 != null) {
            obj2 = method2.invoke(obj, (Object[]) null);
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return null;
        }
        Method method3 = aVar2.f71750c;
        if (method3 != null) {
            obj3 = method3.invoke(obj2, (Object[]) null);
        } else {
            obj3 = null;
        }
        if (obj3 instanceof String) {
            return (String) obj3;
        }
        return null;
    }
}
