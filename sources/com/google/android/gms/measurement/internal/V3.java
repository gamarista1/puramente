package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zznk;

final class V3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C4622h3 f54904a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f54905b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f54906c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ boolean f54907d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C4622h3 f54908e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ C4643k3 f54909f;

    V3(C4643k3 k3Var, C4622h3 h3Var, long j10, long j11, boolean z10, C4622h3 h3Var2) {
        this.f54904a = h3Var;
        this.f54905b = j10;
        this.f54906c = j11;
        this.f54907d = z10;
        this.f54908e = h3Var2;
        this.f54909f = k3Var;
    }

    public final void run() {
        this.f54909f.N(this.f54904a);
        if (!zznk.zza() || !this.f54909f.a().o(F.f54626V0)) {
            this.f54909f.D(this.f54905b, false);
        }
        C4643k3.R(this.f54909f, this.f54904a, this.f54906c, true, this.f54907d);
        C4643k3.S(this.f54909f, this.f54904a, this.f54908e);
    }
}
