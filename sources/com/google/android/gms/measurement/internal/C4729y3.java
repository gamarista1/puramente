package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.y3  reason: case insensitive filesystem */
final class C4729y3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f55416a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C4643k3 f55417b;

    C4729y3(C4643k3 k3Var, boolean z10) {
        this.f55416a = z10;
        this.f55417b = k3Var;
    }

    public final void run() {
        boolean k10 = this.f55417b.f55074a.k();
        boolean j10 = this.f55417b.f55074a.j();
        this.f55417b.f55074a.h(this.f55416a);
        if (j10 == this.f55416a) {
            this.f55417b.f55074a.zzj().F().b("Default data collection state already set to", Boolean.valueOf(this.f55416a));
        }
        if (this.f55417b.f55074a.k() == k10 || this.f55417b.f55074a.k() != this.f55417b.f55074a.j()) {
            this.f55417b.f55074a.zzj().H().c("Default data collection is different than actual status", Boolean.valueOf(this.f55416a), Boolean.valueOf(k10));
        }
        this.f55417b.C0();
    }
}
