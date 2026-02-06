package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class G3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f54698a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C4643k3 f54699b;

    G3(C4643k3 k3Var, AtomicReference atomicReference) {
        this.f54698a = atomicReference;
        this.f54699b = k3Var;
    }

    public final void run() {
        synchronized (this.f54698a) {
            try {
                this.f54698a.set(this.f54699b.a().A(this.f54699b.k().A()));
                this.f54698a.notify();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
