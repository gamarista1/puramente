package com.facebook.imagepipeline.producers;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.C6496s;

public final class B implements p0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f39789a;

    public B(Executor executor) {
        if (executor != null) {
            this.f39789a = executor;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public void a(Runnable runnable) {
        C6496s.h(runnable, "runnable");
    }

    public void b(Runnable runnable) {
        C6496s.h(runnable, "runnable");
        this.f39789a.execute(runnable);
    }
}
