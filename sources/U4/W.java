package u4;

import H4.f;
import H4.g;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class W {

    /* renamed from: e  reason: collision with root package name */
    public static Executor f48433e = Executors.newCachedThreadPool(new g());

    /* renamed from: a  reason: collision with root package name */
    private final Set f48434a;

    /* renamed from: b  reason: collision with root package name */
    private final Set f48435b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f48436c;

    /* renamed from: d  reason: collision with root package name */
    private volatile U f48437d;

    private static class a extends FutureTask {

        /* renamed from: a  reason: collision with root package name */
        private W f48438a;

        a(W w10, Callable callable) {
            super(callable);
            this.f48438a = w10;
        }

        /* access modifiers changed from: protected */
        public void done() {
            try {
                if (isCancelled()) {
                    this.f48438a = null;
                    return;
                }
                this.f48438a.l((U) get());
                this.f48438a = null;
            } catch (InterruptedException | ExecutionException e10) {
                this.f48438a.l(new U(e10));
            } catch (Throwable th2) {
                this.f48438a = null;
                throw th2;
            }
        }
    }

    public W(Callable callable) {
        this(callable, false);
    }

    private synchronized void f(Throwable th2) {
        ArrayList<P> arrayList = new ArrayList<>(this.f48435b);
        if (arrayList.isEmpty()) {
            f.d("Lottie encountered an error but no failure listener was added:", th2);
            return;
        }
        for (P onResult : arrayList) {
            onResult.onResult(th2);
        }
    }

    private void g() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            h();
        } else {
            this.f48436c.post(new V(this));
        }
    }

    /* access modifiers changed from: private */
    public void h() {
        U u10 = this.f48437d;
        if (u10 != null) {
            if (u10.b() != null) {
                i(u10.b());
            } else {
                f(u10.a());
            }
        }
    }

    private synchronized void i(Object obj) {
        for (P onResult : new ArrayList(this.f48434a)) {
            onResult.onResult(obj);
        }
    }

    /* access modifiers changed from: private */
    public void l(U u10) {
        if (this.f48437d == null) {
            this.f48437d = u10;
            g();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public synchronized W c(P p10) {
        try {
            U u10 = this.f48437d;
            if (!(u10 == null || u10.a() == null)) {
                p10.onResult(u10.a());
            }
            this.f48435b.add(p10);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this;
    }

    public synchronized W d(P p10) {
        try {
            U u10 = this.f48437d;
            if (!(u10 == null || u10.b() == null)) {
                p10.onResult(u10.b());
            }
            this.f48434a.add(p10);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this;
    }

    public U e() {
        return this.f48437d;
    }

    public synchronized W j(P p10) {
        this.f48435b.remove(p10);
        return this;
    }

    public synchronized W k(P p10) {
        this.f48434a.remove(p10);
        return this;
    }

    public W(Object obj) {
        this.f48434a = new LinkedHashSet(1);
        this.f48435b = new LinkedHashSet(1);
        this.f48436c = new Handler(Looper.getMainLooper());
        this.f48437d = null;
        l(new U(obj));
    }

    W(Callable callable, boolean z10) {
        this.f48434a = new LinkedHashSet(1);
        this.f48435b = new LinkedHashSet(1);
        this.f48436c = new Handler(Looper.getMainLooper());
        this.f48437d = null;
        if (z10) {
            try {
                l((U) callable.call());
            } catch (Throwable th2) {
                l(new U(th2));
            }
        } else {
            f48433e.execute(new a(this, callable));
        }
    }
}
