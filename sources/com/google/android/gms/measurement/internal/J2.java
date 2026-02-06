package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final /* synthetic */ class J2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ I2 f54727a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ String f54728b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Bundle f54729c;

    public /* synthetic */ J2(I2 i22, String str, Bundle bundle) {
        this.f54727a = i22;
        this.f54728b = str;
        this.f54729c = bundle;
    }

    public final void run() {
        this.f54727a.c(this.f54728b, this.f54729c);
    }
}
