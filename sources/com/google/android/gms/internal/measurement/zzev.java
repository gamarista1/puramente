package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdq;

final class zzev extends zzdq.zza {
    private final /* synthetic */ zzdq.zzb zzc;
    private final /* synthetic */ zzdq zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzev(zzdq zzdq, zzdq.zzb zzb) {
        super(zzdq);
        this.zzc = zzb;
        this.zzd = zzdq;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzdb) C4536s.l(this.zzd.zzj)).unregisterOnMeasurementEventListener(this.zzc);
    }
}
