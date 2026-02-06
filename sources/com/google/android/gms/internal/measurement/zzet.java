package com.google.android.gms.internal.measurement;

import android.content.Intent;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdq;

final class zzet extends zzdq.zza {
    private final /* synthetic */ Intent zzc;
    private final /* synthetic */ zzdq zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzet(zzdq zzdq, Intent intent) {
        super(zzdq);
        this.zzc = intent;
        this.zzd = zzdq;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzdb) C4536s.l(this.zzd.zzj)).setSgtmDebugInfo(this.zzc);
    }
}
