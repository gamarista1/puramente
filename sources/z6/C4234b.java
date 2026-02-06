package z6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.C6496s;

/* renamed from: z6.b  reason: case insensitive filesystem */
public final class C4234b {

    /* renamed from: a  reason: collision with root package name */
    public static final C4234b f50079a = new C4234b();

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadFactory f50080b;

    /* renamed from: c  reason: collision with root package name */
    private static final ExecutorService f50081c;

    static {
        C4233a aVar = new C4233a();
        f50080b = aVar;
        f50081c = Executors.newCachedThreadPool(aVar);
    }

    private C4234b() {
    }

    /* access modifiers changed from: private */
    public static final Thread c(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(1);
        return thread;
    }

    public final void b(Runnable runnable) {
        C6496s.h(runnable, "task");
        f50081c.execute(runnable);
    }
}
