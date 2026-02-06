package com.google.android.gms.measurement.internal;

final class A3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ long f54436a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C4643k3 f54437b;

    A3(C4643k3 k3Var, long j10) {
        this.f54436a = j10;
        this.f54437b = k3Var;
    }

    public final void run() {
        this.f54437b.e().f55099m.b(this.f54436a);
        this.f54437b.zzj().A().b("Session timeout duration set", Long.valueOf(this.f54436a));
    }
}
