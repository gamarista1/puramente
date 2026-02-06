package com.facebook.common.time;

import T5.d;
import a6.C3137c;

@d
public class AwakeTimeSinceBootClock implements C3137c {
    @d
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @d
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @d
    public /* bridge */ /* synthetic */ long now() {
        return super.now();
    }

    @d
    public long nowNanos() {
        return System.nanoTime();
    }
}
