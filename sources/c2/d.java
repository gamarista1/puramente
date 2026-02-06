package c2;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

abstract class d {

    /* renamed from: e  reason: collision with root package name */
    private static Handler f19279e;

    /* renamed from: a  reason: collision with root package name */
    private final FutureTask f19280a = new b(new a());

    /* renamed from: b  reason: collision with root package name */
    private volatile e f19281b = e.PENDING;

    /* renamed from: c  reason: collision with root package name */
    final AtomicBoolean f19282c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    final AtomicBoolean f19283d = new AtomicBoolean();

    class a implements Callable {
        a() {
        }

        public Object call() {
            d.this.f19283d.set(true);
            Object obj = null;
            try {
                Process.setThreadPriority(10);
                obj = d.this.b();
                Binder.flushPendingCommands();
                d.this.i(obj);
                return obj;
            } catch (Throwable th2) {
                d.this.i(obj);
                throw th2;
            }
        }
    }

    class b extends FutureTask {
        b(Callable callable) {
            super(callable);
        }

        /* access modifiers changed from: protected */
        public void done() {
            try {
                d.this.j(get());
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (CancellationException unused) {
                d.this.j((Object) null);
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f19286a;

        c(Object obj) {
            this.f19286a = obj;
        }

        public void run() {
            d.this.d(this.f19286a);
        }
    }

    /* renamed from: c2.d$d  reason: collision with other inner class name */
    static /* synthetic */ class C0334d {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f19288a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                c2.d$e[] r0 = c2.d.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19288a = r0
                c2.d$e r1 = c2.d.e.RUNNING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19288a     // Catch:{ NoSuchFieldError -> 0x001d }
                c2.d$e r1 = c2.d.e.FINISHED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: c2.d.C0334d.<clinit>():void");
        }
    }

    public enum e {
        PENDING,
        RUNNING,
        FINISHED
    }

    d() {
    }

    private static Handler e() {
        Handler handler;
        synchronized (d.class) {
            try {
                if (f19279e == null) {
                    f19279e = new Handler(Looper.getMainLooper());
                }
                handler = f19279e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final boolean a(boolean z10) {
        this.f19282c.set(true);
        return this.f19280a.cancel(z10);
    }

    /* access modifiers changed from: protected */
    public abstract Object b();

    public final void c(Executor executor) {
        if (this.f19281b != e.PENDING) {
            int i10 = C0334d.f19288a[this.f19281b.ordinal()];
            if (i10 == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i10 != 2) {
                throw new IllegalStateException("We should never reach this state");
            } else {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        } else {
            this.f19281b = e.RUNNING;
            executor.execute(this.f19280a);
        }
    }

    /* access modifiers changed from: package-private */
    public void d(Object obj) {
        if (f()) {
            g(obj);
        } else {
            h(obj);
        }
        this.f19281b = e.FINISHED;
    }

    public final boolean f() {
        return this.f19282c.get();
    }

    /* access modifiers changed from: protected */
    public abstract void g(Object obj);

    /* access modifiers changed from: protected */
    public abstract void h(Object obj);

    /* access modifiers changed from: package-private */
    public void i(Object obj) {
        e().post(new c(obj));
    }

    /* access modifiers changed from: package-private */
    public void j(Object obj) {
        if (!this.f19283d.get()) {
            i(obj);
        }
    }
}
