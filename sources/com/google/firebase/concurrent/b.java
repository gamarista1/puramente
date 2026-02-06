package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

class b implements ThreadFactory {

    /* renamed from: e  reason: collision with root package name */
    private static final ThreadFactory f57068e = Executors.defaultThreadFactory();

    /* renamed from: a  reason: collision with root package name */
    private final AtomicLong f57069a = new AtomicLong();

    /* renamed from: b  reason: collision with root package name */
    private final String f57070b;

    /* renamed from: c  reason: collision with root package name */
    private final int f57071c;

    /* renamed from: d  reason: collision with root package name */
    private final StrictMode.ThreadPolicy f57072d;

    b(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f57070b = str;
        this.f57071c = i10;
        this.f57072d = threadPolicy;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Runnable runnable) {
        Process.setThreadPriority(this.f57071c);
        StrictMode.ThreadPolicy threadPolicy = this.f57072d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = f57068e.newThread(new a(this, runnable));
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", new Object[]{this.f57070b, Long.valueOf(this.f57069a.getAndIncrement())}));
        return newThread;
    }
}
