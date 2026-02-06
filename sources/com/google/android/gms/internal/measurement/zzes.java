package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdq;

final class zzes extends zzdq.zza {
    private final /* synthetic */ zzdc zzc;
    private final /* synthetic */ int zzd;
    private final /* synthetic */ zzdq zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzes(zzdq zzdq, zzdc zzdc, int i10) {
        super(zzdq);
        this.zzc = zzdc;
        this.zzd = i10;
        this.zze = zzdq;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzdb) C4536s.l(this.zze.zzj)).getTestFlag(this.zzc, this.zzd);
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        this.zzc.zza((Bundle) null);
    }
}
