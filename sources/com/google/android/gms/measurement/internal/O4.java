package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

final class O4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ J4 f54809a;

    O4(J4 j42) {
        this.f54809a = j42;
    }

    public final void run() {
        C4644k4.I(this.f54809a.f54737c, new ComponentName(this.f54809a.f54737c.zza(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
