package com.google.android.gms.measurement.internal;

import java.util.Objects;

public final /* synthetic */ class H5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ E2 f54717a;

    public /* synthetic */ H5(E2 e22) {
        this.f54717a = e22;
    }

    public final void run() {
        E2 e22 = this.f54717a;
        if (!e22.G().S0()) {
            e22.zzj().G().a("registerTrigger called but app not eligible");
            return;
        }
        C4643k3 C10 = e22.C();
        Objects.requireNonNull(C10);
        new Thread(new F5(C10)).start();
    }
}
