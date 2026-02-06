package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdq;

final class zzea extends zzdq.zza {
    private final /* synthetic */ Bundle zzc;
    private final /* synthetic */ zzdq zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzea(zzdq zzdq, Bundle bundle) {
        super(zzdq);
        this.zzc = bundle;
        this.zzd = zzdq;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzdb) C4536s.l(this.zzd.zzj)).setConsentThirdParty(this.zzc, this.zza);
    }
}
