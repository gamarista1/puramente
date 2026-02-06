package com.facebook.imagepipeline.producers;

import i7.C3593b;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C6496s;

/* renamed from: com.facebook.imagepipeline.producers.s  reason: case insensitive filesystem */
public final class C3312s implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f40067a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f40068b;

    public C3312s(d0 d0Var, ScheduledExecutorService scheduledExecutorService) {
        C6496s.h(d0Var, "inputProducer");
        this.f40067a = d0Var;
        this.f40068b = scheduledExecutorService;
    }

    /* access modifiers changed from: private */
    public static final void d(C3312s sVar, C3308n nVar, e0 e0Var) {
        C6496s.h(sVar, "this$0");
        C6496s.h(nVar, "$consumer");
        C6496s.h(e0Var, "$context");
        sVar.f40067a.b(nVar, e0Var);
    }

    public void b(C3308n nVar, e0 e0Var) {
        C6496s.h(nVar, "consumer");
        C6496s.h(e0Var, "context");
        C3593b F10 = e0Var.F();
        ScheduledExecutorService scheduledExecutorService = this.f40068b;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.schedule(new r(this, nVar, e0Var), (long) F10.e(), TimeUnit.MILLISECONDS);
        } else {
            this.f40067a.b(nVar, e0Var);
        }
    }
}
