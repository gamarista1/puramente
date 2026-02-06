package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.C4643k3;
import com.google.android.gms.measurement.internal.E2;
import java.util.List;
import java.util.Map;

final class b extends AppMeasurement.a {

    /* renamed from: a  reason: collision with root package name */
    private final E2 f54423a;

    /* renamed from: b  reason: collision with root package name */
    private final C4643k3 f54424b;

    public b(E2 e22) {
        super();
        C4536s.l(e22);
        this.f54423a = e22;
        this.f54424b = e22.C();
    }

    public final void a(String str, String str2, Bundle bundle) {
        this.f54423a.C().b0(str, str2, bundle);
    }

    public final List b(String str, String str2) {
        return this.f54424b.A(str, str2);
    }

    public final void c(String str, String str2, Bundle bundle) {
        this.f54424b.M0(str, str2, bundle);
    }

    public final Map d(String str, String str2, boolean z10) {
        return this.f54424b.B(str, str2, z10);
    }

    public final int zza(String str) {
        return C4643k3.y(str);
    }

    public final void zzb(String str) {
        this.f54423a.t().u(str, this.f54423a.zzb().a());
    }

    public final void zzc(String str) {
        this.f54423a.t().y(str, this.f54423a.zzb().a());
    }

    public final long zzf() {
        return this.f54423a.G().M0();
    }

    public final String zzg() {
        return this.f54424b.p0();
    }

    public final String zzh() {
        return this.f54424b.q0();
    }

    public final String zzi() {
        return this.f54424b.r0();
    }

    public final String zzj() {
        return this.f54424b.p0();
    }

    public final void zza(Bundle bundle) {
        this.f54424b.G0(bundle);
    }
}
