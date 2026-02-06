package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.u3  reason: case insensitive filesystem */
final class C4705u3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f55363a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C4643k3 f55364b;

    C4705u3(C4643k3 k3Var, AtomicReference atomicReference) {
        this.f55363a = atomicReference;
        this.f55364b = k3Var;
    }

    public final void run() {
        synchronized (this.f55363a) {
            try {
                this.f55363a.set(Boolean.valueOf(this.f55364b.a().G(this.f55364b.k().A())));
                this.f55363a.notify();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
