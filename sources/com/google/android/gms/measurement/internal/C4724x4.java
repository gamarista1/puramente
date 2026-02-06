package com.google.android.gms.measurement.internal;

import Pa.e;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4536s;
import za.C5298a;

/* renamed from: com.google.android.gms.measurement.internal.x4  reason: case insensitive filesystem */
final class C4724x4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ E5 f55401a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C4644k4 f55402b;

    C4724x4(C4644k4 k4Var, E5 e52) {
        this.f55401a = e52;
        this.f55402b = k4Var;
    }

    public final void run() {
        e w10 = this.f55402b.f55206d;
        if (w10 == null) {
            this.f55402b.zzj().B().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            C4536s.l(this.f55401a);
            w10.O0(this.f55401a);
            this.f55402b.l().E();
            this.f55402b.y(w10, (C5298a) null, this.f55401a);
            this.f55402b.g0();
        } catch (RemoteException e10) {
            this.f55402b.zzj().B().b("Failed to send app launch to the service", e10);
        }
    }
}
