package Ob;

import Lb.A;
import Lb.s;
import java.lang.Thread;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public abstract class c implements s {

    /* renamed from: a  reason: collision with root package name */
    private ScheduledThreadPoolExecutor f52100a;

    class a extends ScheduledThreadPoolExecutor {
        a(int i10, ThreadFactory threadFactory) {
            super(i10, threadFactory);
        }

        /* access modifiers changed from: protected */
        public void afterExecute(Runnable runnable, Throwable th2) {
            super.afterExecute(runnable, th2);
            if (th2 == null && (runnable instanceof Future)) {
                Future future = (Future) runnable;
                try {
                    if (future.isDone()) {
                        future.get();
                    }
                } catch (CancellationException unused) {
                } catch (ExecutionException e10) {
                    th2 = e10.getCause();
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                }
            }
            if (th2 != null) {
                c.this.f(th2);
            }
        }
    }

    private class b implements ThreadFactory {

        class a implements Thread.UncaughtExceptionHandler {
            a() {
            }

            public void uncaughtException(Thread thread, Throwable th2) {
                c.this.f(th2);
            }
        }

        private b() {
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = c.this.d().newThread(runnable);
            A e10 = c.this.e();
            e10.a(newThread, "FirebaseDatabaseWorker");
            e10.b(newThread, true);
            e10.c(newThread, new a());
            return newThread;
        }

        /* synthetic */ b(c cVar, a aVar) {
            this();
        }
    }

    public c() {
        a aVar = new a(1, new b(this, (a) null));
        this.f52100a = aVar;
        aVar.setKeepAliveTime(3, TimeUnit.SECONDS);
    }

    public static String g(Throwable th2) {
        if (th2 instanceof OutOfMemoryError) {
            return "Firebase Database encountered an OutOfMemoryError. You may need to reduce the amount of data you are syncing to the client (e.g. by using queries or syncing a deeper path). See https://firebase.google.com/docs/database/ios/structure-data#best_practices_for_data_structure and https://firebase.google.com/docs/database/android/retrieve-data#filtering_data";
        }
        if (th2 instanceof NoClassDefFoundError) {
            return "A symbol that the Firebase Database SDK depends on failed to load. This usually indicates that your project includes an incompatible version of another Firebase dependency. If updating your dependencies to the latest version does not resolve this issue, please file a report at https://github.com/firebase/firebase-android-sdk";
        }
        if (th2 instanceof Gb.c) {
            return "";
        }
        return "Uncaught exception in Firebase Database runloop (" + com.google.firebase.database.c.g() + "). If you are not already on the latest version of the Firebase SDKs, try updating your dependencies. Should this problem persist, please file a report at https://github.com/firebase/firebase-android-sdk";
    }

    public void a() {
        this.f52100a.setCorePoolSize(1);
    }

    public void b(Runnable runnable) {
        this.f52100a.execute(runnable);
    }

    public ScheduledExecutorService c() {
        return this.f52100a;
    }

    /* access modifiers changed from: protected */
    public ThreadFactory d() {
        return Executors.defaultThreadFactory();
    }

    /* access modifiers changed from: protected */
    public A e() {
        return A.f51688a;
    }

    public abstract void f(Throwable th2);

    public ScheduledFuture schedule(Runnable runnable, long j10) {
        return this.f52100a.schedule(runnable, j10, TimeUnit.MILLISECONDS);
    }
}
