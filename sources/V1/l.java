package v1;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import x1.C2896a;
import x1.g;

abstract class l {

    private static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private String f26953a;

        /* renamed from: b  reason: collision with root package name */
        private int f26954b;

        /* renamed from: v1.l$a$a  reason: collision with other inner class name */
        private static class C0449a extends Thread {

            /* renamed from: a  reason: collision with root package name */
            private final int f26955a;

            C0449a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f26955a = i10;
            }

            public void run() {
                Process.setThreadPriority(this.f26955a);
                super.run();
            }
        }

        a(String str, int i10) {
            this.f26953a = str;
            this.f26954b = i10;
        }

        public Thread newThread(Runnable runnable) {
            return new C0449a(runnable, this.f26953a, this.f26954b);
        }
    }

    private static class b implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f26956a;

        b(Handler handler) {
            this.f26956a = (Handler) g.f(handler);
        }

        public void execute(Runnable runnable) {
            if (!this.f26956a.post((Runnable) g.f(runnable))) {
                throw new RejectedExecutionException(this.f26956a + " is shutting down");
            }
        }
    }

    private static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private Callable f26957a;

        /* renamed from: b  reason: collision with root package name */
        private C2896a f26958b;

        /* renamed from: c  reason: collision with root package name */
        private Handler f26959c;

        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C2896a f26960a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Object f26961b;

            a(C2896a aVar, Object obj) {
                this.f26960a = aVar;
                this.f26961b = obj;
            }

            public void run() {
                this.f26960a.accept(this.f26961b);
            }
        }

        c(Handler handler, Callable callable, C2896a aVar) {
            this.f26957a = callable;
            this.f26958b = aVar;
            this.f26959c = handler;
        }

        public void run() {
            Object obj;
            try {
                obj = this.f26957a.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f26959c.post(new a(this.f26958b, obj));
        }
    }

    static ThreadPoolExecutor a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static Executor b(Handler handler) {
        return new b(handler);
    }

    static void c(Executor executor, Callable callable, C2896a aVar) {
        executor.execute(new c(C2747b.a(), callable, aVar));
    }

    static Object d(ExecutorService executorService, Callable callable, int i10) {
        try {
            return executorService.submit(callable).get((long) i10, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e10) {
            throw new RuntimeException(e10);
        } catch (InterruptedException e11) {
            throw e11;
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
