package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzdg;

final class N4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzdg f54795a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f54796b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f54797c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f54798d;

    N4(AppMeasurementDynamiteService appMeasurementDynamiteService, zzdg zzdg, String str, String str2) {
        this.f54795a = zzdg;
        this.f54796b = str;
        this.f54797c = str2;
        this.f54798d = appMeasurementDynamiteService;
    }

    public final void run() {
        this.f54798d.f54447a.E().C(this.f54795a, this.f54796b, this.f54797c);
    }
}
