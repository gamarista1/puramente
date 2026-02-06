package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzdg;

/* renamed from: com.google.android.gms.measurement.internal.w2  reason: case insensitive filesystem */
final class C4716w2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzdg f55384a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ D f55385b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f55386c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f55387d;

    C4716w2(AppMeasurementDynamiteService appMeasurementDynamiteService, zzdg zzdg, D d10, String str) {
        this.f55384a = zzdg;
        this.f55385b = d10;
        this.f55386c = str;
        this.f55387d = appMeasurementDynamiteService;
    }

    public final void run() {
        this.f55387d.f54447a.E().B(this.f55384a, this.f55385b, this.f55386c);
    }
}
