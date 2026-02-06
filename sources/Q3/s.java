package Q3;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public class s implements R3.a {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayDeque f5469a = new ArrayDeque();

    /* renamed from: b  reason: collision with root package name */
    private final Executor f5470b;

    /* renamed from: c  reason: collision with root package name */
    private Runnable f5471c;

    /* renamed from: d  reason: collision with root package name */
    final Object f5472d = new Object();

    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final s f5473a;

        /* renamed from: b  reason: collision with root package name */
        final Runnable f5474b;

        a(s sVar, Runnable runnable) {
            this.f5473a = sVar;
            this.f5474b = runnable;
        }

        public void run() {
            try {
                this.f5474b.run();
                synchronized (this.f5473a.f5472d) {
                    this.f5473a.a();
                }
            } catch (Throwable th2) {
                synchronized (this.f5473a.f5472d) {
                    this.f5473a.a();
                    throw th2;
                }
            }
        }
    }

    public s(Executor executor) {
        this.f5470b = executor;
    }

    public boolean W0() {
        boolean z10;
        synchronized (this.f5472d) {
            z10 = !this.f5469a.isEmpty();
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Runnable runnable = (Runnable) this.f5469a.poll();
        this.f5471c = runnable;
        if (runnable != null) {
            this.f5470b.execute(runnable);
        }
    }

    public void execute(Runnable runnable) {
        synchronized (this.f5472d) {
            try {
                this.f5469a.add(new a(this, runnable));
                if (this.f5471c == null) {
                    a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
