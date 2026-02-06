package com.google.android.gms.measurement.internal;

final class Y2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ D f54934a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f54935b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ I2 f54936c;

    Y2(I2 i22, D d10, String str) {
        this.f54934a = d10;
        this.f54935b = str;
        this.f54936c = i22;
    }

    public final void run() {
        this.f54936c.f54718a.p0();
        this.f54936c.f54718a.r(this.f54934a, this.f54935b);
    }
}
