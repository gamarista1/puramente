package retrofit2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: retrofit2.a  reason: case insensitive filesystem */
final class C6668a implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f72876a = new Handler(Looper.getMainLooper());

    C6668a() {
    }

    public void execute(Runnable runnable) {
        this.f72876a.post(runnable);
    }
}
