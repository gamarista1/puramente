package com.google.android.gms.internal.measurement;

import Ha.C4295b;
import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdq;

final class zzey extends zzdq.zza {
    private final /* synthetic */ Bundle zzc;
    private final /* synthetic */ Activity zzd;
    private final /* synthetic */ zzdq.zzd zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzey(zzdq.zzd zzd2, Bundle bundle, Activity activity) {
        super(zzdq.this);
        this.zzc = bundle;
        this.zzd = activity;
        this.zze = zzd2;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        Bundle bundle;
        if (this.zzc != null) {
            bundle = new Bundle();
            if (this.zzc.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.zzc.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((zzdb) C4536s.l(zzdq.this.zzj)).onActivityCreated(C4295b.c(this.zzd), bundle, this.zzb);
    }
}
