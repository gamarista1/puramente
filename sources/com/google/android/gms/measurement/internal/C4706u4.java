package com.google.android.gms.measurement.internal;

import Pa.e;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdg;

/* renamed from: com.google.android.gms.measurement.internal.u4  reason: case insensitive filesystem */
final class C4706u4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ E5 f55365a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzdg f55366b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C4644k4 f55367c;

    C4706u4(C4644k4 k4Var, E5 e52, zzdg zzdg) {
        this.f55365a = e52;
        this.f55366b = zzdg;
        this.f55367c = k4Var;
    }

    public final void run() {
        try {
            if (!this.f55367c.e().H().B()) {
                this.f55367c.zzj().H().a("Analytics storage consent denied; will not get app instance id");
                this.f55367c.m().S0((String) null);
                this.f55367c.e().f55095i.b((String) null);
                return;
            }
            e w10 = this.f55367c.f55206d;
            if (w10 == null) {
                this.f55367c.zzj().B().a("Failed to get app instance id");
                this.f55367c.f().N(this.f55366b, (String) null);
                return;
            }
            C4536s.l(this.f55365a);
            String F02 = w10.F0(this.f55365a);
            if (F02 != null) {
                this.f55367c.m().S0(F02);
                this.f55367c.e().f55095i.b(F02);
            }
            this.f55367c.g0();
            this.f55367c.f().N(this.f55366b, F02);
        } catch (RemoteException e10) {
            this.f55367c.zzj().B().b("Failed to get app instance id", e10);
        } finally {
            this.f55367c.f().N(this.f55366b, (String) null);
        }
    }
}
