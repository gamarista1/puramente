package Y4;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.a;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class a implements ExecutorService {

    /* renamed from: b  reason: collision with root package name */
    private static final long f35645b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c  reason: collision with root package name */
    private static volatile int f35646c;

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f35647a;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f35648a;

        /* renamed from: b  reason: collision with root package name */
        private int f35649b;

        /* renamed from: c  reason: collision with root package name */
        private int f35650c;

        /* renamed from: d  reason: collision with root package name */
        private ThreadFactory f35651d = new c();

        /* renamed from: e  reason: collision with root package name */
        private e f35652e = e.f35666d;

        /* renamed from: f  reason: collision with root package name */
        private String f35653f;

        /* renamed from: g  reason: collision with root package name */
        private long f35654g;

        b(boolean z10) {
            this.f35648a = z10;
        }

        public a a() {
            if (!TextUtils.isEmpty(this.f35653f)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f35649b, this.f35650c, this.f35654g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f35651d, this.f35653f, this.f35652e, this.f35648a));
                if (this.f35654g != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new a(threadPoolExecutor);
            }
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f35653f);
        }

        public b b(String str) {
            this.f35653f = str;
            return this;
        }

        public b c(int i10) {
            this.f35649b = i10;
            this.f35650c = i10;
            return this;
        }
    }

    private static final class c implements ThreadFactory {

        /* renamed from: Y4.a$c$a  reason: collision with other inner class name */
        class C0575a extends Thread {
            C0575a(Runnable runnable) {
                super(runnable);
            }

            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private c() {
        }

        public Thread newThread(Runnable runnable) {
            return new C0575a(runnable);
        }
    }

    private static final class d implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final ThreadFactory f35656a;

        /* renamed from: b  reason: collision with root package name */
        private final String f35657b;

        /* renamed from: c  reason: collision with root package name */
        final e f35658c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f35659d;

        /* renamed from: e  reason: collision with root package name */
        private final AtomicInteger f35660e = new AtomicInteger();

        /* renamed from: Y4.a$d$a  reason: collision with other inner class name */
        class C0576a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Runnable f35661a;

            C0576a(Runnable runnable) {
                this.f35661a = runnable;
            }

            public void run() {
                if (d.this.f35659d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f35661a.run();
                } catch (Throwable th2) {
                    d.this.f35658c.a(th2);
                }
            }
        }

        d(ThreadFactory threadFactory, String str, e eVar, boolean z10) {
            this.f35656a = threadFactory;
            this.f35657b = str;
            this.f35658c = eVar;
            this.f35659d = z10;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f35656a.newThread(new C0576a(runnable));
            newThread.setName("glide-" + this.f35657b + "-thread-" + this.f35660e.getAndIncrement());
            return newThread;
        }
    }

    a(ExecutorService executorService) {
        this.f35647a = executorService;
    }

    static int a() {
        if (b() >= 4) {
            return 2;
        }
        return 1;
    }

    public static int b() {
        if (f35646c == 0) {
            f35646c = Math.min(4, b.a());
        }
        return f35646c;
    }

    public static b c() {
        return new b(true).c(a()).b("animation");
    }

    public static a d() {
        return c().a();
    }

    public static b e() {
        return new b(true).c(1).b("disk-cache");
    }

    public static a f() {
        return e().a();
    }

    public static b g() {
        return new b(false).c(b()).b("source");
    }

    public static a h() {
        return g().a();
    }

    public static a i() {
        return new a(new ThreadPoolExecutor(0, a.e.API_PRIORITY_OTHER, f35645b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), "source-unlimited", e.f35666d, false)));
    }

    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f35647a.awaitTermination(j10, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f35647a.execute(runnable);
    }

    public List invokeAll(Collection collection) {
        return this.f35647a.invokeAll(collection);
    }

    public Object invokeAny(Collection collection) {
        return this.f35647a.invokeAny(collection);
    }

    public boolean isShutdown() {
        return this.f35647a.isShutdown();
    }

    public boolean isTerminated() {
        return this.f35647a.isTerminated();
    }

    public void shutdown() {
        this.f35647a.shutdown();
    }

    public List shutdownNow() {
        return this.f35647a.shutdownNow();
    }

    public Future submit(Runnable runnable) {
        return this.f35647a.submit(runnable);
    }

    public String toString() {
        return this.f35647a.toString();
    }

    public List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f35647a.invokeAll(collection, j10, timeUnit);
    }

    public Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f35647a.invokeAny(collection, j10, timeUnit);
    }

    public Future submit(Runnable runnable, Object obj) {
        return this.f35647a.submit(runnable, obj);
    }

    public Future submit(Callable callable) {
        return this.f35647a.submit(callable);
    }

    public interface e {

        /* renamed from: a  reason: collision with root package name */
        public static final e f35663a = new C0577a();

        /* renamed from: b  reason: collision with root package name */
        public static final e f35664b;

        /* renamed from: c  reason: collision with root package name */
        public static final e f35665c = new c();

        /* renamed from: d  reason: collision with root package name */
        public static final e f35666d;

        class b implements e {
            b() {
            }

            public void a(Throwable th2) {
                if (th2 != null && Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
                }
            }
        }

        class c implements e {
            c() {
            }

            public void a(Throwable th2) {
                if (th2 != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th2);
                }
            }
        }

        static {
            b bVar = new b();
            f35664b = bVar;
            f35666d = bVar;
        }

        void a(Throwable th2);

        /* renamed from: Y4.a$e$a  reason: collision with other inner class name */
        class C0577a implements e {
            C0577a() {
            }

            public void a(Throwable th2) {
            }
        }
    }
}
