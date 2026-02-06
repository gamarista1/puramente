package com.google.android.gms.measurement.internal;

final class Q2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C4604f f54834a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ I2 f54835b;

    Q2(I2 i22, C4604f fVar) {
        this.f54834a = fVar;
        this.f54835b = i22;
    }

    public final void run() {
        this.f54835b.f54718a.p0();
        if (this.f54834a.f55062c.o0() == null) {
            this.f54835b.f54718a.o(this.f54834a);
        } else {
            this.f54835b.f54718a.P(this.f54834a);
        }
    }
}
