package Zg;

import Ug.M0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import qf.g;

public abstract class D extends C5716e implements M0 {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f66947d = AtomicIntegerFieldUpdater.newUpdater(D.class, "cleanedAndPointers$volatile");

    /* renamed from: c  reason: collision with root package name */
    public final long f66948c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public D(long j10, D d10, int i10) {
        super(d10);
        this.f66948c = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    public boolean k() {
        if (f66947d.get(this) != r() || l()) {
            return false;
        }
        return true;
    }

    public final boolean p() {
        if (f66947d.addAndGet(this, -65536) != r() || l()) {
            return false;
        }
        return true;
    }

    public abstract int r();

    public abstract void s(int i10, Throwable th2, g gVar);

    public final void t() {
        if (f66947d.incrementAndGet(this) == r()) {
            n();
        }
    }

    public final boolean u() {
        int i10;
        AtomicIntegerFieldUpdater q10 = f66947d;
        do {
            i10 = q10.get(this);
            if (i10 == r() && !l()) {
                return false;
            }
        } while (!q10.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
