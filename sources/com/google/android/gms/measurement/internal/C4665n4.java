package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzdg;

/* renamed from: com.google.android.gms.measurement.internal.n4  reason: case insensitive filesystem */
final class C4665n4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzdg f55246a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f55247b;

    C4665n4(AppMeasurementDynamiteService appMeasurementDynamiteService, zzdg zzdg) {
        this.f55246a = zzdg;
        this.f55247b = appMeasurementDynamiteService;
    }

    public final void run() {
        this.f55247b.f54447a.G().P(this.f55246a, this.f55247b.f54447a.j());
    }
}
