package com.google.android.gms.internal.measurement;

import Ha.C4295b;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdq;

final class zzem extends zzdq.zza {
    private final /* synthetic */ int zzc = 5;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Object zze;
    private final /* synthetic */ Object zzf;
    private final /* synthetic */ Object zzg;
    private final /* synthetic */ zzdq zzh;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzem(zzdq zzdq, boolean z10, int i10, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.zzd = str;
        this.zze = obj;
        this.zzf = null;
        this.zzg = null;
        this.zzh = zzdq;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzdb) C4536s.l(this.zzh.zzj)).logHealthData(this.zzc, this.zzd, C4295b.c(this.zze), C4295b.c((Object) null), C4295b.c((Object) null));
    }
}
