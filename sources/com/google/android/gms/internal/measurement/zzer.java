package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdq;

final class zzer extends zzdq.zza {
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ zzdq zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzer(zzdq zzdq, boolean z10) {
        super(zzdq);
        this.zzc = z10;
        this.zzd = zzdq;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzdb) C4536s.l(this.zzd.zzj)).setDataCollectionEnabled(this.zzc);
    }
}
