package com.google.android.gms.measurement.internal;

final class p5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ y5 f55269a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ q5 f55270b;

    p5(q5 q5Var, y5 y5Var) {
        this.f55269a = y5Var;
        this.f55270b = q5Var;
    }

    public final void run() {
        q5.t(this.f55270b, this.f55269a);
        this.f55270b.t0();
    }
}
