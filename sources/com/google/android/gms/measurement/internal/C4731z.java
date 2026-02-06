package com.google.android.gms.measurement.internal;

import Ea.e;
import android.content.Context;
import android.os.Bundle;
import androidx.collection.C1587a;
import com.google.android.gms.common.internal.C4536s;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.z  reason: case insensitive filesystem */
public final class C4731z extends C1 {

    /* renamed from: b  reason: collision with root package name */
    private final Map f55420b = new C1587a();

    /* renamed from: c  reason: collision with root package name */
    private final Map f55421c = new C1587a();

    /* renamed from: d  reason: collision with root package name */
    private long f55422d;

    public C4731z(E2 e22) {
        super(e22);
    }

    private final void r(long j10, C4595d4 d4Var) {
        if (d4Var == null) {
            zzj().F().a("Not logging ad exposure. No active activity");
        } else if (j10 < 1000) {
            zzj().F().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j10);
            B5.S(d4Var, bundle, true);
            m().T0("am", "_xa", bundle);
        }
    }

    static /* synthetic */ void t(C4731z zVar, String str, long j10) {
        zVar.i();
        C4536s.f(str);
        if (zVar.f55421c.isEmpty()) {
            zVar.f55422d = j10;
        }
        Integer num = (Integer) zVar.f55421c.get(str);
        if (num != null) {
            zVar.f55421c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (zVar.f55421c.size() >= 100) {
            zVar.zzj().G().a("Too many ads visible");
        } else {
            zVar.f55421c.put(str, 1);
            zVar.f55420b.put(str, Long.valueOf(j10));
        }
    }

    private final void v(String str, long j10, C4595d4 d4Var) {
        if (d4Var == null) {
            zzj().F().a("Not logging ad unit exposure. No active activity");
        } else if (j10 < 1000) {
            zzj().F().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j10);
            B5.S(d4Var, bundle, true);
            m().T0("am", "_xu", bundle);
        }
    }

    /* access modifiers changed from: private */
    public final void w(long j10) {
        for (String put : this.f55420b.keySet()) {
            this.f55420b.put(put, Long.valueOf(j10));
        }
        if (!this.f55420b.isEmpty()) {
            this.f55422d = j10;
        }
    }

    static /* synthetic */ void x(C4731z zVar, String str, long j10) {
        zVar.i();
        C4536s.f(str);
        Integer num = (Integer) zVar.f55421c.get(str);
        if (num != null) {
            C4595d4 x10 = zVar.n().x(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                zVar.f55421c.remove(str);
                Long l10 = (Long) zVar.f55420b.get(str);
                if (l10 == null) {
                    zVar.zzj().B().a("First ad unit exposure time was never set");
                } else {
                    zVar.f55420b.remove(str);
                    zVar.v(str, j10 - l10.longValue(), x10);
                }
                if (zVar.f55421c.isEmpty()) {
                    long j11 = zVar.f55422d;
                    if (j11 == 0) {
                        zVar.zzj().B().a("First ad exposure time was never set");
                        return;
                    }
                    zVar.r(j10 - j11, x10);
                    zVar.f55422d = 0;
                    return;
                }
                return;
            }
            zVar.f55421c.put(str, Integer.valueOf(intValue));
            return;
        }
        zVar.zzj().B().b("Call to endAdUnitExposure for unknown ad unit id", str);
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

    public final void q(long j10) {
        C4595d4 x10 = n().x(false);
        for (String str : this.f55420b.keySet()) {
            v(str, j10 - ((Long) this.f55420b.get(str)).longValue(), x10);
        }
        if (!this.f55420b.isEmpty()) {
            r(j10 - this.f55422d, x10);
        }
        w(j10);
    }

    public final void u(String str, long j10) {
        if (str == null || str.length() == 0) {
            zzj().B().a("Ad unit id must be a non-empty string");
        } else {
            zzl().y(new C4569a(this, str, j10));
        }
    }

    public final void y(String str, long j10) {
        if (str == null || str.length() == 0) {
            zzj().B().a("Ad unit id must be a non-empty string");
        } else {
            zzl().y(new A0(this, str, j10));
        }
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
