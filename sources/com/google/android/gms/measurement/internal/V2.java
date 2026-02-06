package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzdg;

final class V2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzdg f54902a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f54903b;

    V2(AppMeasurementDynamiteService appMeasurementDynamiteService, zzdg zzdg) {
        this.f54902a = zzdg;
        this.f54903b = appMeasurementDynamiteService;
    }

    public final void run() {
        this.f54903b.f54447a.E().A(this.f54902a);
    }
}
