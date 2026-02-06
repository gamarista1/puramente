package com.google.android.gms.internal.measurement;

import Ha.C4295b;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdq;

final class zzds extends zzdq.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Object zze;
    private final /* synthetic */ boolean zzf;
    private final /* synthetic */ zzdq zzg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzds(zzdq zzdq, String str, String str2, Object obj, boolean z10) {
        super(zzdq);
        this.zzc = str;
        this.zzd = str2;
        this.zze = obj;
        this.zzf = z10;
        this.zzg = zzdq;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzdb) C4536s.l(this.zzg.zzj)).setUserProperty(this.zzc, this.zzd, C4295b.c(this.zze), this.zzf, this.zza);
    }
}
