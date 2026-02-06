package com.google.android.gms.internal.measurement;

import Ha.C4295b;
import android.app.Activity;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdq;

final class zzdv extends zzdq.zza {
    private final /* synthetic */ Activity zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ zzdq zzf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdv(zzdq zzdq, Activity activity, String str, String str2) {
        super(zzdq);
        this.zzc = activity;
        this.zzd = str;
        this.zze = str2;
        this.zzf = zzdq;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzdb) C4536s.l(this.zzf.zzj)).setCurrentScreen(C4295b.c(this.zzc), this.zzd, this.zze, this.zza);
    }
}
