package j7;

import kotlin.jvm.internal.C6496s;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f44841a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final a f44842b = new C0685b();

    /* renamed from: c  reason: collision with root package name */
    private static c f44843c;

    public interface a {
    }

    /* renamed from: j7.b$b  reason: collision with other inner class name */
    private static final class C0685b implements a {
    }

    public interface c {
        void a(String str);

        void b();

        boolean isTracing();
    }

    private b() {
    }

    public static final void a(String str) {
        C6496s.h(str, "name");
        f44841a.c().a(str);
    }

    public static final void b() {
        f44841a.c().b();
    }

    private final c c() {
        C3642a aVar;
        c cVar = f44843c;
        if (cVar != null) {
            return cVar;
        }
        synchronized (b.class) {
            aVar = new C3642a();
            f44843c = aVar;
        }
        return aVar;
    }

    public static final boolean d() {
        return f44841a.c().isTracing();
    }
}
