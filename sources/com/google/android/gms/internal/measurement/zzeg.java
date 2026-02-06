package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdq;

final class zzeg extends zzdq.zza {
    private final /* synthetic */ zzdc zzc;
    private final /* synthetic */ zzdq zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzeg(zzdq zzdq, zzdc zzdc) {
        super(zzdq);
        this.zzc = zzdc;
        this.zzd = zzdq;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzdb) C4536s.l(this.zzd.zzj)).getGmpAppId(this.zzc);
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        this.zzc.zza((Bundle) null);
    }
}
