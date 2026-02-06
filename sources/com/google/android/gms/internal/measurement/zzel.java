package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdq;

final class zzel extends zzdq.zza {
    private final /* synthetic */ zzdq.zzc zzc;
    private final /* synthetic */ zzdq zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzel(zzdq zzdq, zzdq.zzc zzc2) {
        super(zzdq);
        this.zzc = zzc2;
        this.zzd = zzdq;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzdb) C4536s.l(this.zzd.zzj)).setEventInterceptor(this.zzc);
    }
}
