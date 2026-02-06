package Fb;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public enum n implements Executor {
    INSTANCE;
    

    /* renamed from: b  reason: collision with root package name */
    private static final Handler f50800b = null;

    static {
        f50800b = new Handler(Looper.getMainLooper());
    }

    public void execute(Runnable runnable) {
        f50800b.post(runnable);
    }
}
