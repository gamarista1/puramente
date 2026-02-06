package com.google.android.gms.measurement.internal;

import Pa.e;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4536s;

final class D4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ E5 f54503a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C4644k4 f54504b;

    D4(C4644k4 k4Var, E5 e52) {
        this.f54503a = e52;
        this.f54504b = k4Var;
    }

    public final void run() {
        e w10 = this.f54504b.f55206d;
        if (w10 == null) {
            this.f54504b.zzj().B().a("Failed to send consent settings to service");
            return;
        }
        try {
            C4536s.l(this.f54503a);
            w10.y0(this.f54503a);
            this.f54504b.g0();
        } catch (RemoteException e10) {
            this.f54504b.zzj().B().b("Failed to send consent settings to the service", e10);
        }
    }
}
