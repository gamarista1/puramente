package com.android.billingclient.api;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class r implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final ThreadFactory f38340a = Executors.defaultThreadFactory();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f38341b = new AtomicInteger(1);

    r(C3195b bVar) {
    }

    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f38341b;
        Thread newThread = this.f38340a.newThread(runnable);
        int andIncrement = atomicInteger.getAndIncrement();
        newThread.setName("PlayBillingLibrary-" + andIncrement);
        return newThread;
    }
}
