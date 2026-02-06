package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Set;

public final class zzct extends zzbi implements Serializable {
    private static final zzct zza = new zzct(zzdk.zza);
    private static final zzct zzb = new zzct(zzco.zzm(zzdh.zza()));
    private final transient zzco zzc;

    static {
        int i10 = zzco.zzd;
    }

    zzct(zzco zzco) {
        this.zzc = zzco;
    }

    static zzct zza() {
        return zzb;
    }

    public static zzct zzb() {
        return zza;
    }

    public final /* bridge */ /* synthetic */ Set zzc() {
        if (this.zzc.isEmpty()) {
            return zzdq.zza;
        }
        return new zzdr(this.zzc, zzdg.zza);
    }
}
