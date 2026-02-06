package f7;

import kotlin.jvm.internal.C6496s;
import lf.C6514M;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f43439a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f43440b;

    /* renamed from: c  reason: collision with root package name */
    private static int f43441c = 384;

    /* renamed from: d  reason: collision with root package name */
    private static volatile g f43442d;

    static {
        h hVar = new h();
        f43439a = hVar;
        f43440b = hVar.b();
    }

    private h() {
    }

    public static final g a() {
        if (f43442d == null) {
            synchronized (h.class) {
                try {
                    if (f43442d == null) {
                        f43442d = new g(f43441c, f43440b);
                    }
                    C6514M m10 = C6514M.f71813a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        g gVar = f43442d;
        C6496s.e(gVar);
        return gVar;
    }

    private final int b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (((long) min) > 16777216) {
            return (min / 4) * 3;
        }
        return min / 2;
    }
}
