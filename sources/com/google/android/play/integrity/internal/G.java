package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

final class G extends D {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f56556g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ D f56557h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ C4741d f56558i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    G(C4741d dVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, D d10) {
        super(taskCompletionSource);
        this.f56558i = dVar;
        this.f56556g = taskCompletionSource2;
        this.f56557h = d10;
    }

    public final void b() {
        synchronized (this.f56558i.f56572f) {
            try {
                C4741d.o(this.f56558i, this.f56556g);
                if (this.f56558i.f56578l.getAndIncrement() > 0) {
                    this.f56558i.f56568b.c("Already connected to the service.", new Object[0]);
                }
                C4741d.q(this.f56558i, this.f56557h);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
