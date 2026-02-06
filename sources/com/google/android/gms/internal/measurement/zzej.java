package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdq;

final class zzej extends zzdq.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ boolean zze;
    private final /* synthetic */ zzdc zzf;
    private final /* synthetic */ zzdq zzg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzej(zzdq zzdq, String str, String str2, boolean z10, zzdc zzdc) {
        super(zzdq);
        this.zzc = str;
        this.zzd = str2;
        this.zze = z10;
        this.zzf = zzdc;
        this.zzg = zzdq;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzdb) C4536s.l(this.zzg.zzj)).getUserProperties(this.zzc, this.zzd, this.zze, this.zzf);
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        this.zzf.zza((Bundle) null);
    }
}
