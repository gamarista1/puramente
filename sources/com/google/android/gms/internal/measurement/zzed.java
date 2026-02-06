package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdq;

final class zzed extends zzdq.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzdq zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzed(zzdq zzdq, String str) {
        super(zzdq);
        this.zzc = str;
        this.zzd = zzdq;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzdb) C4536s.l(this.zzd.zzj)).endAdUnitExposure(this.zzc, this.zzb);
    }
}
