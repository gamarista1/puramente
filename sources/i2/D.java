package i2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

public class D implements C2078c {
    protected D() {
    }

    public long a() {
        return SystemClock.elapsedRealtime();
    }

    public long b() {
        return System.nanoTime();
    }

    public long c() {
        return SystemClock.uptimeMillis();
    }

    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    public C2087l d(Looper looper, Handler.Callback callback) {
        return new E(new Handler(looper, callback));
    }

    public void e() {
    }
}
