package com.google.android.gms.measurement.internal;

final class N2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C4604f f54790a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ E5 f54791b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ I2 f54792c;

    N2(I2 i22, C4604f fVar, E5 e52) {
        this.f54790a = fVar;
        this.f54791b = e52;
        this.f54792c = i22;
    }

    public final void run() {
        this.f54792c.f54718a.p0();
        if (this.f54790a.f55062c.o0() == null) {
            this.f54792c.f54718a.p(this.f54790a, this.f54791b);
        } else {
            this.f54792c.f54718a.Q(this.f54790a, this.f54791b);
        }
    }
}
