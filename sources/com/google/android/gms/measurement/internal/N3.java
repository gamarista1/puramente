package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class N3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f54793a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C4643k3 f54794b;

    N3(C4643k3 k3Var, AtomicReference atomicReference) {
        this.f54793a = atomicReference;
        this.f54794b = k3Var;
    }

    public final void run() {
        synchronized (this.f54793a) {
            try {
                this.f54793a.set(Long.valueOf(this.f54794b.a().u(this.f54794b.k().A(), F.f54609N)));
                this.f54793a.notify();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
