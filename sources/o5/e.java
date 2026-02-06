package o5;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private static final Executor f47039a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final Executor f47040b = new b();

    class a implements Executor {
        a() {
        }

        public void execute(Runnable runnable) {
            l.v(runnable);
        }
    }

    class b implements Executor {
        b() {
        }

        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return f47040b;
    }

    public static Executor b() {
        return f47039a;
    }

    public static void c(ExecutorService executorService) {
        executorService.shutdownNow();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (!executorService.awaitTermination(5, timeUnit)) {
                executorService.shutdownNow();
                if (!executorService.awaitTermination(5, timeUnit)) {
                    throw new RuntimeException("Failed to shutdown");
                }
            }
        } catch (InterruptedException e10) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
            throw new RuntimeException(e10);
        }
    }
}
