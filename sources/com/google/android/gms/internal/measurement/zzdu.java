package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdq;

final class zzdu extends zzdq.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Bundle zze;
    private final /* synthetic */ zzdq zzf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdu(zzdq zzdq, String str, String str2, Bundle bundle) {
        super(zzdq);
        this.zzc = str;
        this.zzd = str2;
        this.zze = bundle;
        this.zzf = zzdq;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzdb) C4536s.l(this.zzf.zzj)).clearConditionalUserProperty(this.zzc, this.zzd, this.zze);
    }
}
