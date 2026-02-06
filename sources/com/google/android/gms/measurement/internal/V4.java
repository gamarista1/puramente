package com.google.android.gms.measurement.internal;

import Ea.e;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.zzcz;

public final class V4 extends C4578b1 {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Handler f54910c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f54911d = true;

    /* renamed from: e  reason: collision with root package name */
    protected final C4589c5 f54912e = new C4589c5(this);

    /* renamed from: f  reason: collision with root package name */
    protected final C4575a5 f54913f = new C4575a5(this);

    /* renamed from: g  reason: collision with root package name */
    private final Z4 f54914g = new Z4(this);

    V4(E2 e22) {
        super(e22);
    }

    /* access modifiers changed from: private */
    public final void B() {
        i();
        if (this.f54910c == null) {
            this.f54910c = new zzcz(Looper.getMainLooper());
        }
    }

    static /* synthetic */ void D(V4 v42, long j10) {
        v42.i();
        v42.B();
        v42.zzj().F().b("Activity resumed, time", Long.valueOf(j10));
        if (v42.a().o(F.f54598H0)) {
            if (v42.a().O() || v42.f54911d) {
                v42.f54913f.f(j10);
            }
        } else if (v42.a().O() || v42.e().f55107u.b()) {
            v42.f54913f.f(j10);
        }
        v42.f54914g.a();
        C4589c5 c5Var = v42.f54912e;
        c5Var.f55031a.i();
        if (c5Var.f55031a.f55074a.k()) {
            c5Var.b(c5Var.f55031a.zzb().currentTimeMillis(), false);
        }
    }

    static /* synthetic */ void x(V4 v42, long j10) {
        v42.i();
        v42.B();
        v42.zzj().F().b("Activity paused, time", Long.valueOf(j10));
        v42.f54914g.b(j10);
        if (v42.a().O()) {
            v42.f54913f.e(j10);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean A() {
        i();
        return this.f54911d;
    }

    public final /* bridge */ /* synthetic */ C4618h a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ C4713w c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ R1 d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C4614g2 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ B5 f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final /* bridge */ /* synthetic */ C4731z j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ Q1 k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ P1 l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ C4643k3 m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ C4609f4 n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ C4644k4 o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ V4 p() {
        return super.p();
    }

    /* access modifiers changed from: protected */
    public final boolean v() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void y(boolean z10) {
        i();
        this.f54911d = z10;
    }

    public final boolean z(boolean z10, boolean z11, long j10) {
        return this.f54913f.d(z10, z11, j10);
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ e zzb() {
        return super.zzb();
    }

    public final /* bridge */ /* synthetic */ C4583c zzd() {
        return super.zzd();
    }

    public final /* bridge */ /* synthetic */ V1 zzj() {
        return super.zzj();
    }

    public final /* bridge */ /* synthetic */ C4734z2 zzl() {
        return super.zzl();
    }
}
