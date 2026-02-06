package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.s3  reason: case insensitive filesystem */
public final /* synthetic */ class C4693s3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ C4643k3 f55343a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Bundle f55344b;

    public /* synthetic */ C4693s3(C4643k3 k3Var, Bundle bundle) {
        this.f55343a = k3Var;
        this.f55344b = bundle;
    }

    public final void run() {
        this.f55343a.I(this.f55344b);
    }
}
