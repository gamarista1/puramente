package com.google.android.gms.internal.measurement;

import Ha.C4295b;
import android.app.Activity;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdq;

final class zzfc extends zzdq.zza {
    private final /* synthetic */ Activity zzc;
    private final /* synthetic */ zzdq.zzd zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfc(zzdq.zzd zzd2, Activity activity) {
        super(zzdq.this);
        this.zzc = activity;
        this.zzd = zzd2;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzdb) C4536s.l(zzdq.this.zzj)).onActivityPaused(C4295b.c(this.zzc), this.zzb);
    }
}
