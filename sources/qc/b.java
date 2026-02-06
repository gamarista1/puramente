package qc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final C5150a f61374a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile C5150a f61375b;

    /* renamed from: qc.b$b  reason: collision with other inner class name */
    private static class C0903b implements C5150a {
        private C0903b() {
        }

        public ExecutorService a(ThreadFactory threadFactory, c cVar) {
            return b(1, threadFactory, cVar);
        }

        public ExecutorService b(int i10, ThreadFactory threadFactory, c cVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C0903b bVar = new C0903b();
        f61374a = bVar;
        f61375b = bVar;
    }

    public static C5150a a() {
        return f61375b;
    }
}
