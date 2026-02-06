package Ug;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import lf.C6527k;

final class b1 implements C5592s0 {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f65349d = AtomicIntegerFieldUpdater.newUpdater(b1.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* renamed from: a  reason: collision with root package name */
    private final C5600w0 f65350a;

    /* renamed from: b  reason: collision with root package name */
    private final Thread f65351b = Thread.currentThread();

    /* renamed from: c  reason: collision with root package name */
    private C5559b0 f65352c;

    public b1(C5600w0 w0Var) {
        this.f65350a = w0Var;
    }

    private final Void d(int i10) {
        throw new IllegalStateException(("Illegal state " + i10).toString());
    }

    public final void a() {
        AtomicIntegerFieldUpdater c10 = f65349d;
        while (true) {
            int i10 = c10.get(this);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        d(i10);
                        throw new C6527k();
                    }
                }
            } else if (f65349d.compareAndSet(this, i10, 1)) {
                C5559b0 b0Var = this.f65352c;
                if (b0Var != null) {
                    b0Var.dispose();
                    return;
                }
                return;
            }
        }
    }

    public void b(Throwable th2) {
        int i10;
        AtomicIntegerFieldUpdater c10 = f65349d;
        do {
            i10 = c10.get(this);
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2 && i10 != 3) {
                    d(i10);
                    throw new C6527k();
                }
                return;
            }
        } while (!f65349d.compareAndSet(this, i10, 2));
        this.f65351b.interrupt();
        f65349d.set(this, 3);
    }

    public final void e() {
        int i10;
        this.f65352c = A0.o(this.f65350a, true, true, this);
        AtomicIntegerFieldUpdater c10 = f65349d;
        do {
            i10 = c10.get(this);
            if (i10 != 0) {
                if (i10 != 2 && i10 != 3) {
                    d(i10);
                    throw new C6527k();
                }
                return;
            }
        } while (!f65349d.compareAndSet(this, i10, 0));
    }
}
