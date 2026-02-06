package Uf;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;

/* renamed from: Uf.c  reason: case insensitive filesystem */
final class C5550c {

    /* renamed from: a  reason: collision with root package name */
    public static final C5550c f65236a = new C5550c();

    /* renamed from: b  reason: collision with root package name */
    private static a f65237b;

    /* renamed from: Uf.c$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Method f65238a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f65239b;

        public a(Method method, Method method2) {
            this.f65238a = method;
            this.f65239b = method2;
        }

        public final Method a() {
            return this.f65239b;
        }

        public final Method b() {
            return this.f65238a;
        }
    }

    private C5550c() {
    }

    public final a a(Member member) {
        C6496s.h(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new a(cls.getMethod("getParameters", (Class[]) null), C5553f.j(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", (Class[]) null));
        } catch (NoSuchMethodException unused) {
            return new a((Method) null, (Method) null);
        }
    }

    public final List b(Member member) {
        Method a10;
        C6496s.h(member, "member");
        a aVar = f65237b;
        if (aVar == null) {
            synchronized (this) {
                aVar = f65237b;
                if (aVar == null) {
                    aVar = f65236a.a(member);
                    f65237b = aVar;
                }
            }
        }
        Method b10 = aVar.b();
        if (b10 == null || (a10 = aVar.a()) == null) {
            return null;
        }
        Object invoke = b10.invoke(member, (Object[]) null);
        C6496s.f(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) invoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object invoke2 : objArr) {
            Object invoke3 = a10.invoke(invoke2, (Object[]) null);
            C6496s.f(invoke3, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) invoke3);
        }
        return arrayList;
    }
}
