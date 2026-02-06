package com.google.android.gms.internal.measurement;

import Ha.C4295b;
import android.app.Activity;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdq;

final class zzfe extends zzdq.zza {
    private final /* synthetic */ Activity zzc;
    private final /* synthetic */ zzdc zzd;
    private final /* synthetic */ zzdq.zzd zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfe(zzdq.zzd zzd2, Activity activity, zzdc zzdc) {
        super(zzdq.this);
        this.zzc = activity;
        this.zzd = zzdc;
        this.zze = zzd2;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzdb) C4536s.l(zzdq.this.zzj)).onActivitySaveInstanceState(C4295b.c(this.zzc), this.zzd, this.zzb);
    }
}
