package com.google.android.gms.measurement.internal;

final class F2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C4636j3 f54687a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ E2 f54688b;

    F2(E2 e22, C4636j3 j3Var) {
        this.f54687a = j3Var;
        this.f54688b = e22;
    }

    public final void run() {
        E2.d(this.f54688b, this.f54687a);
        this.f54688b.b(this.f54687a.f55160g);
    }
}
