package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class I3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ long f54721a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C4643k3 f54722b;

    I3(C4643k3 k3Var, long j10) {
        this.f54721a = j10;
        this.f54722b = k3Var;
    }

    public final void run() {
        this.f54722b.E0(this.f54721a);
        this.f54722b.o().L(new AtomicReference());
    }
}
