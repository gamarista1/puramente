package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdq;

final class zzeo extends zzdq.zza {
    private final /* synthetic */ Bundle zzc;
    private final /* synthetic */ zzdc zzd;
    private final /* synthetic */ zzdq zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzeo(zzdq zzdq, Bundle bundle, zzdc zzdc) {
        super(zzdq);
        this.zzc = bundle;
        this.zzd = zzdc;
        this.zze = zzdq;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzdb) C4536s.l(this.zze.zzj)).performAction(this.zzc, this.zzd, this.zza);
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        this.zzd.zza((Bundle) null);
    }
}
