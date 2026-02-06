package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdq;

final class zzex extends zzdq.zza {
    private final /* synthetic */ Long zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ Bundle zzf;
    private final /* synthetic */ boolean zzg;
    private final /* synthetic */ boolean zzh;
    private final /* synthetic */ zzdq zzi;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzex(zzdq zzdq, Long l10, String str, String str2, Bundle bundle, boolean z10, boolean z11) {
        super(zzdq);
        this.zzc = l10;
        this.zzd = str;
        this.zze = str2;
        this.zzf = bundle;
        this.zzg = z10;
        this.zzh = z11;
        this.zzi = zzdq;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        long longValue;
        Long l10 = this.zzc;
        if (l10 == null) {
            longValue = this.zza;
        } else {
            longValue = l10.longValue();
        }
        ((zzdb) C4536s.l(this.zzi.zzj)).logEvent(this.zzd, this.zze, this.zzf, this.zzg, this.zzh, longValue);
    }
}
