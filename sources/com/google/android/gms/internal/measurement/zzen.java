package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdq;

final class zzen extends zzdq.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzdc zzd;
    private final /* synthetic */ zzdq zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzen(zzdq zzdq, String str, zzdc zzdc) {
        super(zzdq);
        this.zzc = str;
        this.zzd = zzdc;
        this.zze = zzdq;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzdb) C4536s.l(this.zze.zzj)).getMaxUserProperties(this.zzc, this.zzd);
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        this.zzd.zza((Bundle) null);
    }
}
