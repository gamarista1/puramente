package t5;

import F5.h;
import kotlin.jvm.internal.C6496s;
import t7.C4049a;

/* renamed from: t5.o  reason: case insensitive filesystem */
public final class C4038o {

    /* renamed from: a  reason: collision with root package name */
    public static final C4038o f48253a = new C4038o();

    /* renamed from: b  reason: collision with root package name */
    private static final String f48254b = C4038o.class.getName();

    private C4038o() {
    }

    public static final synchronized void a(C4024a aVar, T t10) {
        synchronized (C4038o.class) {
            if (!C4049a.d(C4038o.class)) {
                try {
                    C6496s.h(aVar, "accessTokenAppIdPair");
                    C6496s.h(t10, "appEvents");
                    h.b();
                    S a10 = C4030g.a();
                    a10.a(aVar, t10.d());
                    C4030g.b(a10);
                } catch (Throwable th2) {
                    C4049a.b(th2, C4038o.class);
                }
            }
        }
    }

    public static final synchronized void b(C4029f fVar) {
        synchronized (C4038o.class) {
            if (!C4049a.d(C4038o.class)) {
                try {
                    C6496s.h(fVar, "eventsToPersist");
                    h.b();
                    S a10 = C4030g.a();
                    for (C4024a aVar : fVar.f()) {
                        T c10 = fVar.c(aVar);
                        if (c10 != null) {
                            a10.a(aVar, c10.d());
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    C4030g.b(a10);
                } catch (Throwable th2) {
                    C4049a.b(th2, C4038o.class);
                }
            }
        }
    }
}
