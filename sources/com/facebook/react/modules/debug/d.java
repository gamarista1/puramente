package com.facebook.react.modules.debug;

import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import g8.C3540a;
import java.util.ArrayList;

public final class d implements NotThreadSafeBridgeIdleDebugListener, C3540a {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f41014a = new ArrayList(20);

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList f41015b = new ArrayList(20);

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList f41016c = new ArrayList(20);

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f41017d = new ArrayList(20);

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f41018e = true;

    private final boolean c(long j10, long j11) {
        long b10 = e.e(this.f41014a, j10, j11);
        long b11 = e.e(this.f41015b, j10, j11);
        if (b10 == -1 && b11 == -1) {
            return this.f41018e;
        }
        if (b10 > b11) {
            return true;
        }
        return false;
    }

    public synchronized void a() {
        this.f41017d.add(Long.valueOf(System.nanoTime()));
    }

    public synchronized void b() {
        this.f41016c.add(Long.valueOf(System.nanoTime()));
    }

    public final synchronized boolean d(long j10, long j11) {
        boolean z10;
        try {
            boolean c10 = e.f(this.f41017d, j10, j11);
            boolean c11 = c(j10, j11);
            z10 = true;
            if (!c10) {
                if (!c11 || e.f(this.f41016c, j10, j11)) {
                    z10 = false;
                }
            }
            e.d(this.f41014a, j11);
            e.d(this.f41015b, j11);
            e.d(this.f41016c, j11);
            e.d(this.f41017d, j11);
            this.f41018e = c11;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return z10;
    }

    public synchronized void onBridgeDestroyed() {
    }

    public synchronized void onTransitionToBridgeBusy() {
        this.f41015b.add(Long.valueOf(System.nanoTime()));
    }

    public synchronized void onTransitionToBridgeIdle() {
        this.f41014a.add(Long.valueOf(System.nanoTime()));
    }
}
