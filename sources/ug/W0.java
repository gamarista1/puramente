package Ug;

import Zg.G;
import Zg.L;

public final class W0 {

    /* renamed from: a  reason: collision with root package name */
    public static final W0 f65337a = new W0();

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal f65338b = L.a(new G("ThreadLocalEventLoop"));

    private W0() {
    }

    public final C5567f0 a() {
        return (C5567f0) f65338b.get();
    }

    public final C5567f0 b() {
        ThreadLocal threadLocal = f65338b;
        C5567f0 f0Var = (C5567f0) threadLocal.get();
        if (f0Var != null) {
            return f0Var;
        }
        C5567f0 a10 = C5573i0.a();
        threadLocal.set(a10);
        return a10;
    }

    public final void c() {
        f65338b.set((Object) null);
    }

    public final void d(C5567f0 f0Var) {
        f65338b.set(f0Var);
    }
}
