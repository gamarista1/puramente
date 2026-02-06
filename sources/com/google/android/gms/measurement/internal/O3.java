package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzdg;

final class O3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzdg f54804a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f54805b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f54806c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ boolean f54807d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f54808e;

    O3(AppMeasurementDynamiteService appMeasurementDynamiteService, zzdg zzdg, String str, String str2, boolean z10) {
        this.f54804a = zzdg;
        this.f54805b = str;
        this.f54806c = str2;
        this.f54807d = z10;
        this.f54808e = appMeasurementDynamiteService;
    }

    public final void run() {
        this.f54808e.f54447a.E().D(this.f54804a, this.f54805b, this.f54806c, this.f54807d);
    }
}
