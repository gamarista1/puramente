package ja;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

public class F implements C3648d {
    protected F() {
    }

    public long a() {
        return SystemClock.elapsedRealtime();
    }

    public long c() {
        return SystemClock.uptimeMillis();
    }

    public o d(Looper looper, Handler.Callback callback) {
        return new G(new Handler(looper, callback));
    }

    public void e() {
    }
}
