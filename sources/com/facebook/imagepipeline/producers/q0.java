package com.facebook.imagepipeline.producers;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C6496s;

public final class q0 implements p0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f40053a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f40054b;

    /* renamed from: c  reason: collision with root package name */
    private final Deque f40055c = new ArrayDeque();

    public q0(Executor executor) {
        C6496s.h(executor, "executor");
        this.f40053a = executor;
    }

    public synchronized void a(Runnable runnable) {
        C6496s.h(runnable, "runnable");
        this.f40055c.remove(runnable);
    }

    public synchronized void b(Runnable runnable) {
        try {
            C6496s.h(runnable, "runnable");
            if (this.f40054b) {
                this.f40055c.add(runnable);
            } else {
                this.f40053a.execute(runnable);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }
}
