package Ug;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: Ug.u0  reason: case insensitive filesystem */
final class C5596u0 extends C5604y0 {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f65413f = AtomicIntegerFieldUpdater.newUpdater(C5596u0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: e  reason: collision with root package name */
    private final C5592s0 f65414e;

    public C5596u0(C5592s0 s0Var) {
        this.f65414e = s0Var;
    }

    public void b(Throwable th2) {
        if (f65413f.compareAndSet(this, 0, 1)) {
            this.f65414e.b(th2);
        }
    }
}
