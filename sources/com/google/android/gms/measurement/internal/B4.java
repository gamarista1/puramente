package com.google.android.gms.measurement.internal;

import Pa.e;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzdg;

final class B4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ D f54460a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f54461b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzdg f54462c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C4644k4 f54463d;

    B4(C4644k4 k4Var, D d10, String str, zzdg zzdg) {
        this.f54460a = d10;
        this.f54461b = str;
        this.f54462c = zzdg;
        this.f54463d = k4Var;
    }

    public final void run() {
        byte[] bArr = null;
        try {
            e w10 = this.f54463d.f55206d;
            if (w10 == null) {
                this.f54463d.zzj().B().a("Discarding data. Failed to send event to service to bundle");
                return;
            }
            bArr = w10.T(this.f54460a, this.f54461b);
            this.f54463d.g0();
            this.f54463d.f().Q(this.f54462c, bArr);
        } catch (RemoteException e10) {
            this.f54463d.zzj().B().b("Failed to send event to the service to bundle", e10);
        } finally {
            this.f54463d.f().Q(this.f54462c, bArr);
        }
    }
}
