package com.facebook.common.time;

import T5.d;
import a6.C3136b;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

@d
public class RealtimeSinceBootClock implements C3136b {

    /* renamed from: a  reason: collision with root package name */
    private static final RealtimeSinceBootClock f39439a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @d
    public static RealtimeSinceBootClock get() {
        return f39439a;
    }

    public long now() {
        return SystemClock.elapsedRealtime();
    }

    public long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(now());
    }
}
