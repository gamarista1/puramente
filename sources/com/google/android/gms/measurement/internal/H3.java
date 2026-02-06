package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class H3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Bundle f54710a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C4643k3 f54711b;

    H3(C4643k3 k3Var, Bundle bundle) {
        this.f54710a = bundle;
        this.f54711b = k3Var;
    }

    public final void run() {
        C4643k3.J0(this.f54711b, this.f54710a);
    }
}
