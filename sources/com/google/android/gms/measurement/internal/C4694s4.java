package com.google.android.gms.measurement.internal;

import Pa.e;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4536s;

/* renamed from: com.google.android.gms.measurement.internal.s4  reason: case insensitive filesystem */
final class C4694s4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ E5 f55345a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C4644k4 f55346b;

    C4694s4(C4644k4 k4Var, E5 e52) {
        this.f55345a = e52;
        this.f55346b = k4Var;
    }

    public final void run() {
        e w10 = this.f55346b.f55206d;
        if (w10 == null) {
            this.f55346b.zzj().B().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            C4536s.l(this.f55345a);
            w10.q0(this.f55345a);
        } catch (RemoteException e10) {
            this.f55346b.zzj().B().b("Failed to reset data on the service: remote exception", e10);
        }
        this.f55346b.g0();
    }
}
