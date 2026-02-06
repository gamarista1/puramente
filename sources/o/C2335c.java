package o;

import java.util.concurrent.Executor;

/* renamed from: o.c  reason: case insensitive filesystem */
public class C2335c extends C2337e {

    /* renamed from: c  reason: collision with root package name */
    private static volatile C2335c f24692c;

    /* renamed from: d  reason: collision with root package name */
    private static final Executor f24693d = new C2333a();

    /* renamed from: e  reason: collision with root package name */
    private static final Executor f24694e = new C2334b();

    /* renamed from: a  reason: collision with root package name */
    private C2337e f24695a;

    /* renamed from: b  reason: collision with root package name */
    private final C2337e f24696b;

    private C2335c() {
        C2336d dVar = new C2336d();
        this.f24696b = dVar;
        this.f24695a = dVar;
    }

    public static Executor f() {
        return f24694e;
    }

    public static C2335c g() {
        if (f24692c != null) {
            return f24692c;
        }
        synchronized (C2335c.class) {
            try {
                if (f24692c == null) {
                    f24692c = new C2335c();
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return f24692c;
    }

    public void a(Runnable runnable) {
        this.f24695a.a(runnable);
    }

    public boolean b() {
        return this.f24695a.b();
    }

    public void c(Runnable runnable) {
        this.f24695a.c(runnable);
    }
}
