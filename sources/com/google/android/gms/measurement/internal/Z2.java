package com.google.android.gms.measurement.internal;

final class Z2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ D f54987a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ E5 f54988b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ I2 f54989c;

    Z2(I2 i22, D d10, E5 e52) {
        this.f54987a = d10;
        this.f54988b = e52;
        this.f54989c = i22;
    }

    public final void run() {
        this.f54989c.v1(this.f54989c.s1(this.f54987a, this.f54988b), this.f54988b);
    }
}
