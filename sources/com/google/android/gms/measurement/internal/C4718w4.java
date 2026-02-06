package com.google.android.gms.measurement.internal;

import Pa.e;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.w4  reason: case insensitive filesystem */
final class C4718w4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C4595d4 f55390a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C4644k4 f55391b;

    C4718w4(C4644k4 k4Var, C4595d4 d4Var) {
        this.f55390a = d4Var;
        this.f55391b = k4Var;
    }

    public final void run() {
        e w10 = this.f55391b.f55206d;
        if (w10 == null) {
            this.f55391b.zzj().B().a("Failed to send current screen to service");
            return;
        }
        try {
            C4595d4 d4Var = this.f55390a;
            if (d4Var == null) {
                w10.w(0, (String) null, (String) null, this.f55391b.zza().getPackageName());
            } else {
                w10.w(d4Var.f55045c, d4Var.f55043a, d4Var.f55044b, this.f55391b.zza().getPackageName());
            }
            this.f55391b.g0();
        } catch (RemoteException e10) {
            this.f55391b.zzj().B().b("Failed to send current screen to the service", e10);
        }
    }
}
