package Ug;

import java.util.concurrent.Future;

/* renamed from: Ug.l  reason: case insensitive filesystem */
final class C5578l implements C5580m {

    /* renamed from: a  reason: collision with root package name */
    private final Future f65392a;

    public C5578l(Future future) {
        this.f65392a = future;
    }

    public void b(Throwable th2) {
        if (th2 != null) {
            this.f65392a.cancel(false);
        }
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f65392a + ']';
    }
}
