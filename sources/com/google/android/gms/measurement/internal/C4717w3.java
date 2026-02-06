package com.google.android.gms.measurement.internal;

import android.util.SparseArray;
import com.google.common.util.concurrent.c;

/* renamed from: com.google.android.gms.measurement.internal.w3  reason: case insensitive filesystem */
final class C4717w3 implements c {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C4624h5 f55388a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C4643k3 f55389b;

    C4717w3(C4643k3 k3Var, C4624h5 h5Var) {
        this.f55388a = h5Var;
        this.f55389b = k3Var;
    }

    public final void a(Throwable th2) {
        this.f55389b.i();
        this.f55389b.f55192i = false;
        if (!this.f55389b.a().o(F.f54596G0)) {
            this.f55389b.A0();
            this.f55389b.zzj().B().b("registerTriggerAsync failed with throwable", th2);
            return;
        }
        this.f55389b.u0().add(this.f55388a);
        if (this.f55389b.f55193j > 64) {
            this.f55389b.f55193j = 1;
            this.f55389b.zzj().G().c("registerTriggerAsync failed. May try later. App ID, throwable", V1.q(this.f55389b.k().A()), V1.q(th2.toString()));
            return;
        }
        this.f55389b.zzj().G().d("registerTriggerAsync failed. App ID, delay in seconds, throwable", V1.q(this.f55389b.k().A()), V1.q(String.valueOf(this.f55389b.f55193j)), V1.q(th2.toString()));
        C4643k3 k3Var = this.f55389b;
        C4643k3.I0(k3Var, k3Var.f55193j);
        C4643k3 k3Var2 = this.f55389b;
        k3Var2.f55193j = k3Var2.f55193j << 1;
    }

    public final void onSuccess(Object obj) {
        this.f55389b.i();
        if (this.f55389b.a().o(F.f54596G0)) {
            SparseArray F10 = this.f55389b.e().F();
            C4624h5 h5Var = this.f55388a;
            F10.put(h5Var.f55135c, Long.valueOf(h5Var.f55134b));
            this.f55389b.e().q(F10);
            this.f55389b.f55192i = false;
            this.f55389b.f55193j = 1;
            this.f55389b.zzj().A().b("Successfully registered trigger URI", this.f55388a.f55133a);
            this.f55389b.A0();
            return;
        }
        this.f55389b.f55192i = false;
        this.f55389b.A0();
        this.f55389b.zzj().A().b("registerTriggerAsync ran. uri", this.f55388a.f55133a);
    }
}
