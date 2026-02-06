package Ug;

import Ef.m;
import Ug.C5569g0;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.C6496s;
import qf.g;

public final class P extends C5569g0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: i  reason: collision with root package name */
    public static final P f65329i;

    /* renamed from: j  reason: collision with root package name */
    private static final long f65330j;

    static {
        Long l10;
        P p10 = new P();
        f65329i = p10;
        C5567f0.J1(p10, false, 1, (Object) null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f65330j = timeUnit.toNanos(l10.longValue());
    }

    private P() {
    }

    private final synchronized void i2() {
        if (l2()) {
            debugStatus = 3;
            c2();
            C6496s.f(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread j2() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(P.class.getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean k2() {
        if (debugStatus == 4) {
            return true;
        }
        return false;
    }

    private final boolean l2() {
        int i10 = debugStatus;
        if (i10 == 2 || i10 == 3) {
            return true;
        }
        return false;
    }

    private final synchronized boolean m2() {
        if (l2()) {
            return false;
        }
        debugStatus = 1;
        C6496s.f(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void n2() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public C5559b0 I0(long j10, Runnable runnable, g gVar) {
        return f2(j10, runnable);
    }

    /* access modifiers changed from: protected */
    public Thread P1() {
        Thread thread = _thread;
        if (thread == null) {
            return j2();
        }
        return thread;
    }

    /* access modifiers changed from: protected */
    public void Q1(long j10, C5569g0.c cVar) {
        n2();
    }

    public void V1(Runnable runnable) {
        if (k2()) {
            n2();
        }
        super.V1(runnable);
    }

    public void run() {
        W0.f65337a.d(this);
        C5560c.a();
        try {
            if (m2()) {
                long j10 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long M12 = M1();
                    if (M12 == Long.MAX_VALUE) {
                        C5560c.a();
                        long nanoTime = System.nanoTime();
                        if (j10 == Long.MAX_VALUE) {
                            j10 = f65330j + nanoTime;
                        }
                        long j11 = j10 - nanoTime;
                        if (j11 <= 0) {
                            _thread = null;
                            i2();
                            C5560c.a();
                            if (!a2()) {
                                P1();
                                return;
                            }
                            return;
                        }
                        M12 = m.i(M12, j11);
                    } else {
                        j10 = Long.MAX_VALUE;
                    }
                    if (M12 > 0) {
                        if (l2()) {
                            _thread = null;
                            i2();
                            C5560c.a();
                            if (!a2()) {
                                P1();
                                return;
                            }
                            return;
                        }
                        C5560c.a();
                        LockSupport.parkNanos(this, M12);
                    }
                }
            }
        } finally {
            _thread = null;
            i2();
            C5560c.a();
            if (!a2()) {
                P1();
            }
        }
    }

    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
