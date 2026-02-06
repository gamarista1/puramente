package We;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

final class U implements C5662y {

    /* renamed from: a  reason: collision with root package name */
    private static final U f65739a = new U();

    private U() {
    }

    public static C5662y c() {
        return f65739a;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object d() {
        return null;
    }

    public Future submit(Runnable runnable) {
        return new FutureTask(new T());
    }

    public void a(long j10) {
    }
}
