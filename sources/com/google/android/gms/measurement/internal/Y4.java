package com.google.android.gms.measurement.internal;

final class Y4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    long f54937a;

    /* renamed from: b  reason: collision with root package name */
    long f54938b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Z4 f54939c;

    Y4(Z4 z42, long j10, long j11) {
        this.f54939c = z42;
        this.f54937a = j10;
        this.f54938b = j11;
    }

    public final void run() {
        this.f54939c.f54996b.zzl().y(new C4582b5(this));
    }
}
