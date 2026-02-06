package Ug;

import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

abstract /* synthetic */ class a1 {
    public static final C5579l0 b(int i10, String str) {
        if (i10 >= 1) {
            return C5583n0.b(Executors.newScheduledThreadPool(i10, new Z0(i10, str, new AtomicInteger())));
        }
        throw new IllegalArgumentException(("Expected at least one thread, but " + i10 + " specified").toString());
    }

    /* access modifiers changed from: private */
    public static final Thread c(int i10, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i10 != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }
}
