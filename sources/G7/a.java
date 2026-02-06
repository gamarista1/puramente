package G7;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C6496s;
import rh.C6703A;
import rh.C6708e;
import rh.p;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f31625a = new a();

    private a() {
    }

    public static final void a(C6703A a10, Object obj) {
        C6496s.h(a10, "client");
        C6496s.h(obj, "tag");
        Method method = C6703A.class.getMethod("q", (Class[]) null);
        method.setAccessible(true);
        Object invoke = method.invoke(a10, (Object[]) null);
        C6496s.f(invoke, "null cannot be cast to non-null type okhttp3.Dispatcher");
        p pVar = (p) invoke;
        for (C6708e eVar : pVar.j()) {
            if (C6496s.c(obj, eVar.request().j())) {
                eVar.cancel();
                return;
            }
        }
        for (C6708e eVar2 : pVar.k()) {
            if (C6496s.c(obj, eVar2.request().j())) {
                eVar2.cancel();
                return;
            }
        }
    }
}
