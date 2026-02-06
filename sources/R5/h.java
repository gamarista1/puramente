package R5;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    protected final AtomicInteger f33702a = new AtomicInteger(0);

    public void a() {
        if (this.f33702a.compareAndSet(0, 2)) {
            d();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void b(Object obj);

    /* access modifiers changed from: protected */
    public abstract Object c();

    /* access modifiers changed from: protected */
    public abstract void d();

    /* access modifiers changed from: protected */
    public abstract void e(Exception exc);

    /* access modifiers changed from: protected */
    public abstract void f(Object obj);

    public final void run() {
        if (this.f33702a.compareAndSet(0, 1)) {
            try {
                Object c10 = c();
                this.f33702a.set(3);
                try {
                    f(c10);
                } finally {
                    b(c10);
                }
            } catch (Exception e10) {
                this.f33702a.set(4);
                e(e10);
            }
        }
    }
}
