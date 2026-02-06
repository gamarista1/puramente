package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdq;

final class zzdy extends zzdq.zza {
    private final /* synthetic */ Boolean zzc;
    private final /* synthetic */ zzdq zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdy(zzdq zzdq, Boolean bool) {
        super(zzdq);
        this.zzc = bool;
        this.zzd = zzdq;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        if (this.zzc != null) {
            ((zzdb) C4536s.l(this.zzd.zzj)).setMeasurementEnabled(this.zzc.booleanValue(), this.zza);
        } else {
            ((zzdb) C4536s.l(this.zzd.zzj)).clearMeasurementEnabled(this.zza);
        }
    }
}
