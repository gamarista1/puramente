package com.google.android.gms.measurement.internal;

import Pa.e;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4536s;

final class F4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f54690a = true;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ E5 f54691b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f54692c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C4604f f54693d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C4604f f54694e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ C4644k4 f54695f;

    F4(C4644k4 k4Var, boolean z10, E5 e52, boolean z11, C4604f fVar, C4604f fVar2) {
        this.f54691b = e52;
        this.f54692c = z11;
        this.f54693d = fVar;
        this.f54694e = fVar2;
        this.f54695f = k4Var;
    }

    public final void run() {
        C4604f fVar;
        e w10 = this.f54695f.f55206d;
        if (w10 == null) {
            this.f54695f.zzj().B().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f54690a) {
            C4536s.l(this.f54691b);
            C4644k4 k4Var = this.f54695f;
            if (this.f54692c) {
                fVar = null;
            } else {
                fVar = this.f54693d;
            }
            k4Var.y(w10, fVar, this.f54691b);
        } else {
            try {
                if (TextUtils.isEmpty(this.f54694e.f55060a)) {
                    C4536s.l(this.f54691b);
                    w10.J0(this.f54693d, this.f54691b);
                } else {
                    w10.P0(this.f54693d);
                }
            } catch (RemoteException e10) {
                this.f54695f.zzj().B().b("Failed to send conditional user property to the service", e10);
            }
        }
        this.f54695f.g0();
    }
}
