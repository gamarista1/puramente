package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class K3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Bundle f54745a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C4643k3 f54746b;

    K3(C4643k3 k3Var, Bundle bundle) {
        this.f54745a = bundle;
        this.f54746b = k3Var;
    }

    public final void run() {
        C4643k3.Q(this.f54746b, this.f54745a);
    }
}
