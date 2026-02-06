package com.google.android.gms.measurement.internal;

import Pa.e;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4536s;

final class A4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ E5 f54438a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C4644k4 f54439b;

    A4(C4644k4 k4Var, E5 e52) {
        this.f54438a = e52;
        this.f54439b = k4Var;
    }

    public final void run() {
        e w10 = this.f54439b.f55206d;
        if (w10 == null) {
            this.f54439b.zzj().B().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            C4536s.l(this.f54438a);
            w10.f1(this.f54438a);
            this.f54439b.g0();
        } catch (RemoteException e10) {
            this.f54439b.zzj().B().b("Failed to send measurementEnabled to the service", e10);
        }
    }
}
