package U3;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

final class b {

    /* renamed from: d  reason: collision with root package name */
    private static final b f6408d = new b();

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f6409a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f6410b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f6411c;

    /* renamed from: U3.b$b  reason: collision with other inner class name */
    private static class C0151b implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private ThreadLocal f6412a;

        private C0151b() {
            this.f6412a = new ThreadLocal();
        }

        private int a() {
            Integer num = (Integer) this.f6412a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f6412a.remove();
            } else {
                this.f6412a.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        private int b() {
            Integer num = (Integer) this.f6412a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.f6412a.set(Integer.valueOf(intValue));
            return intValue;
        }

        public void execute(Runnable runnable) {
            if (b() <= 15) {
                try {
                    runnable.run();
                } finally {
                    a();
                }
            } else {
                b.a().execute(runnable);
            }
        }
    }

    private b() {
        ExecutorService executorService;
        if (!c()) {
            executorService = Executors.newCachedThreadPool();
        } else {
            executorService = a.b();
        }
        this.f6409a = executorService;
        this.f6410b = Executors.newSingleThreadScheduledExecutor();
        this.f6411c = new C0151b();
    }

    public static ExecutorService a() {
        return f6408d.f6409a;
    }

    static Executor b() {
        return f6408d.f6411c;
    }

    private static boolean c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains("android");
    }
}
