package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class Q3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f54836a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C4643k3 f54837b;

    Q3(C4643k3 k3Var, AtomicReference atomicReference) {
        this.f54836a = atomicReference;
        this.f54837b = k3Var;
    }

    public final void run() {
        synchronized (this.f54836a) {
            try {
                this.f54836a.set(Double.valueOf(this.f54837b.a().j(this.f54837b.k().A(), F.f54613P)));
                this.f54836a.notify();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
