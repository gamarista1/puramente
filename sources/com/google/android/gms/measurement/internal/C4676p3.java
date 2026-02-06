package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: com.google.android.gms.measurement.internal.p3  reason: case insensitive filesystem */
final class C4676p3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService.b f55261a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f55262b;

    C4676p3(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService.b bVar) {
        this.f55261a = bVar;
        this.f55262b = appMeasurementDynamiteService;
    }

    public final void run() {
        this.f55262b.f54447a.C().E(this.f55261a);
    }
}
