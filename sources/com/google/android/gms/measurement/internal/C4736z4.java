package com.google.android.gms.measurement.internal;

import Pa.e;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4536s;

/* renamed from: com.google.android.gms.measurement.internal.z4  reason: case insensitive filesystem */
final class C4736z4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ E5 f55434a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f55435b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C4644k4 f55436c;

    C4736z4(C4644k4 k4Var, E5 e52, Bundle bundle) {
        this.f55434a = e52;
        this.f55435b = bundle;
        this.f55436c = k4Var;
    }

    public final void run() {
        e w10 = this.f55436c.f55206d;
        if (w10 == null) {
            this.f55436c.zzj().B().a("Failed to send default event parameters to service");
            return;
        }
        try {
            C4536s.l(this.f55434a);
            w10.z0(this.f55435b, this.f55434a);
        } catch (RemoteException e10) {
            this.f55436c.zzj().B().b("Failed to send default event parameters to service", e10);
        }
    }
}
