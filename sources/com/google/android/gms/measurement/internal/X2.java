package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4536s;

final class X2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ E5 f54929a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ I2 f54930b;

    X2(I2 i22, E5 e52) {
        this.f54929a = e52;
        this.f54930b = i22;
    }

    public final void run() {
        this.f54930b.f54718a.p0();
        q5 a10 = this.f54930b.f54718a;
        E5 e52 = this.f54929a;
        a10.zzl().i();
        a10.q0();
        C4536s.f(e52.f54557a);
        a10.d0(e52);
        a10.b0(e52);
    }
}
