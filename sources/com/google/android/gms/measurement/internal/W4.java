package com.google.android.gms.measurement.internal;

final class W4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ long f54923a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ V4 f54924b;

    W4(V4 v42, long j10) {
        this.f54923a = j10;
        this.f54924b = v42;
    }

    public final void run() {
        V4.x(this.f54924b, this.f54923a);
    }
}
