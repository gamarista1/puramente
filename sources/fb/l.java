package Fb;

import Eb.D;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

class l implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f50781a;

    /* renamed from: b  reason: collision with root package name */
    private final Semaphore f50782b;

    /* renamed from: c  reason: collision with root package name */
    private final LinkedBlockingQueue f50783c = new LinkedBlockingQueue();

    l(Executor executor, int i10) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        D.a(z10, "concurrency must be positive.");
        this.f50781a = executor;
        this.f50782b = new Semaphore(i10, true);
    }

    private Runnable b(Runnable runnable) {
        return new k(this, runnable);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Runnable runnable) {
        try {
            runnable.run();
        } finally {
            this.f50782b.release();
            d();
        }
    }

    private void d() {
        while (this.f50782b.tryAcquire()) {
            Runnable runnable = (Runnable) this.f50783c.poll();
            if (runnable != null) {
                this.f50781a.execute(b(runnable));
            } else {
                this.f50782b.release();
                return;
            }
        }
    }

    public void execute(Runnable runnable) {
        this.f50783c.offer(runnable);
        d();
    }
}
