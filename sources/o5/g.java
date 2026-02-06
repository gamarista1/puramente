package o5;

import android.os.SystemClock;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    private static final double f47043a = (1.0d / Math.pow(10.0d, 6.0d));

    public static double a(long j10) {
        return ((double) (b() - j10)) * f47043a;
    }

    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
