package com.google.android.gms.internal.p002firebaseauthapi;

import Ba.C4246a;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzady  reason: invalid package */
final class zzady extends zzacf {
    private final String zza;
    private final /* synthetic */ zzadx zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzady(zzadx zzadx, zzacf zzacf, String str) {
        super(zzacf);
        this.zzb = zzadx;
        this.zza = str;
    }

    public final void zza(Status status) {
        C4246a zza2 = zzadx.zza;
        String a10 = c.a(status.p0());
        String q02 = status.q0();
        zza2.c("SMS verification code request failed: " + a10 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + q02, new Object[0]);
        zzaea zzaea = (zzaea) this.zzb.zzd.get(this.zza);
        if (zzaea != null) {
            for (zzacf zza3 : zzaea.zzb) {
                zza3.zza(status);
            }
            this.zzb.zzc(this.zza);
        }
    }

    public final void zzb(String str) {
        zzadx.zza.a("onCodeSent", new Object[0]);
        zzaea zzaea = (zzaea) this.zzb.zzd.get(this.zza);
        if (zzaea != null) {
            for (zzacf zzb2 : zzaea.zzb) {
                zzb2.zzb(str);
            }
            zzaea.zzg = true;
            zzaea.zzd = str;
            if (zzaea.zza <= 0) {
                this.zzb.zzb(this.zza);
            } else if (!zzaea.zzc) {
                this.zzb.zze(this.zza);
            } else if (!zzah.zzc(zzaea.zze)) {
                zzadx.zza(this.zzb, this.zza);
            }
        }
    }
}
