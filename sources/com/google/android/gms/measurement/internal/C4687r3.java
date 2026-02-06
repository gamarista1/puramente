package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.r3  reason: case insensitive filesystem */
public final /* synthetic */ class C4687r3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ C4643k3 f55329a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Bundle f55330b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ long f55331c;

    public /* synthetic */ C4687r3(C4643k3 k3Var, Bundle bundle, long j10) {
        this.f55329a = k3Var;
        this.f55330b = bundle;
        this.f55331c = j10;
    }

    public final void run() {
        this.f55329a.K(this.f55330b, this.f55331c);
    }
}
