package ub;

import android.os.SystemClock;

public abstract class r {
    public static r a(long j10, long j11, long j12) {
        return new C5224a(j10, j11, j12);
    }

    public static r e() {
        return a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}
