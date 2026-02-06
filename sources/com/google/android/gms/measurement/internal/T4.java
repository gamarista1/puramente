package com.google.android.gms.measurement.internal;

final class T4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ q5 f54869a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Runnable f54870b;

    T4(S4 s42, q5 q5Var, Runnable runnable) {
        this.f54869a = q5Var;
        this.f54870b = runnable;
    }

    public final void run() {
        this.f54869a.p0();
        this.f54869a.v(this.f54870b);
        this.f54869a.u0();
    }
}
