package Ea;

import android.os.SystemClock;

public class h implements e {

    /* renamed from: a  reason: collision with root package name */
    private static final h f50652a = new h();

    private h() {
    }

    public static e c() {
        return f50652a;
    }

    public final long a() {
        return SystemClock.elapsedRealtime();
    }

    public final long b() {
        return System.nanoTime();
    }

    public final long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
