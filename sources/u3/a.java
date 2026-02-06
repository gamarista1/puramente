package U3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final a f6403b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final int f6404c;

    /* renamed from: d  reason: collision with root package name */
    static final int f6405d;

    /* renamed from: e  reason: collision with root package name */
    static final int f6406e;

    /* renamed from: a  reason: collision with root package name */
    private final Executor f6407a = new b();

    private static class b implements Executor {
        private b() {
        }

        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f6404c = availableProcessors;
        f6405d = availableProcessors + 1;
        f6406e = (availableProcessors * 2) + 1;
    }

    private a() {
    }

    public static void a(ThreadPoolExecutor threadPoolExecutor, boolean z10) {
        threadPoolExecutor.allowCoreThreadTimeOut(z10);
    }

    public static ExecutorService b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f6405d, f6406e, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    public static Executor c() {
        return f6403b.f6407a;
    }
}
