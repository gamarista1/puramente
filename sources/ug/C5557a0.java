package Ug;

import java.util.concurrent.Future;

/* renamed from: Ug.a0  reason: case insensitive filesystem */
final class C5557a0 implements C5559b0 {

    /* renamed from: a  reason: collision with root package name */
    private final Future f65348a;

    public C5557a0(Future future) {
        this.f65348a = future;
    }

    public void dispose() {
        this.f65348a.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f65348a + ']';
    }
}
