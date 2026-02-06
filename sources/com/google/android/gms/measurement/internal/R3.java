package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class R3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f54852a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C4643k3 f54853b;

    R3(C4643k3 k3Var, AtomicReference atomicReference) {
        this.f54852a = atomicReference;
        this.f54853b = k3Var;
    }

    public final void run() {
        synchronized (this.f54852a) {
            try {
                this.f54852a.set(Integer.valueOf(this.f54853b.a().q(this.f54853b.k().A(), F.f54611O)));
                this.f54852a.notify();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
