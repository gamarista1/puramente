package R5;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class b extends AbstractExecutorService {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final Class f33690h = b.class;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final String f33691a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f33692b;

    /* renamed from: c  reason: collision with root package name */
    private volatile int f33693c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final BlockingQueue f33694d;

    /* renamed from: e  reason: collision with root package name */
    private final a f33695e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final AtomicInteger f33696f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicInteger f33697g;

    private class a implements Runnable {
        public void run() {
            AtomicInteger b10;
            boolean isEmpty;
            try {
                Runnable runnable = (Runnable) b.this.f33694d.poll();
                if (runnable != null) {
                    runnable.run();
                } else {
                    U5.a.y(b.f33690h, "%s: Worker has nothing to run", b.this.f33691a);
                }
                if (isEmpty) {
                    U5.a.z(b.f33690h, "%s: worker finished; %d workers left", b.this.f33691a, Integer.valueOf(b10.decrementAndGet()));
                }
            } finally {
                int decrementAndGet = b.this.f33696f.decrementAndGet();
                if (!b.this.f33694d.isEmpty()) {
                    b.this.f();
                } else {
                    U5.a.z(b.f33690h, "%s: worker finished; %d workers left", b.this.f33691a, Integer.valueOf(decrementAndGet));
                }
            }
        }

        private a() {
        }
    }

    public b(String str, int i10, Executor executor, BlockingQueue blockingQueue) {
        if (i10 > 0) {
            this.f33691a = str;
            this.f33692b = executor;
            this.f33693c = i10;
            this.f33694d = blockingQueue;
            this.f33695e = new a();
            this.f33696f = new AtomicInteger(0);
            this.f33697g = new AtomicInteger(0);
            return;
        }
        throw new IllegalArgumentException("max concurrency must be > 0");
    }

    /* access modifiers changed from: private */
    public void f() {
        int i10 = this.f33696f.get();
        while (i10 < this.f33693c) {
            int i11 = i10 + 1;
            if (this.f33696f.compareAndSet(i10, i11)) {
                U5.a.A(f33690h, "%s: starting worker %d of %d", this.f33691a, Integer.valueOf(i11), Integer.valueOf(this.f33693c));
                this.f33692b.execute(this.f33695e);
                return;
            }
            U5.a.y(f33690h, "%s: race in startWorkerIfNeeded; retrying", this.f33691a);
            i10 = this.f33696f.get();
        }
    }

    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("runnable parameter is null");
        } else if (this.f33694d.offer(runnable)) {
            int size = this.f33694d.size();
            int i10 = this.f33697g.get();
            if (size > i10 && this.f33697g.compareAndSet(i10, size)) {
                U5.a.z(f33690h, "%s: max pending work in queue = %d", this.f33691a, Integer.valueOf(size));
            }
            f();
        } else {
            throw new RejectedExecutionException(this.f33691a + " queue is full, size=" + this.f33694d.size());
        }
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    public List shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
