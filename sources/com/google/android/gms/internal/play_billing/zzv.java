package com.google.android.gms.internal.play_billing;

import com.android.billingclient.api.F;

public final class zzv {
    public static zzeu zza(F f10) {
        zzr zzr = new zzr();
        zzu zzu = new zzu(zzr);
        zzr.zzb = zzu;
        zzr.zza = f10.getClass();
        try {
            zzr.zza = f10.a(zzr);
        } catch (Exception e10) {
            zzu.zzc(e10);
        }
        return zzu;
    }
}
