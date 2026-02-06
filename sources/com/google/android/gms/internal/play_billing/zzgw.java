package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzgw {
    static final zzgw zza = new zzgw(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzgw zzd;
    private final Map zze;

    zzgw() {
        this.zze = new HashMap();
    }

    public static zzgw zza() {
        zzgw zzgw = zzd;
        if (zzgw != null) {
            return zzgw;
        }
        synchronized (zzgw.class) {
            try {
                zzgw zzgw2 = zzd;
                if (zzgw2 != null) {
                    return zzgw2;
                }
                int i10 = zziu.zza;
                zzgw zzb2 = zzhe.zzb(zzgw.class);
                zzd = zzb2;
                return zzb2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final zzhj zzb(zzim zzim, int i10) {
        return (zzhj) this.zze.get(new zzgv(zzim, i10));
    }

    zzgw(boolean z10) {
        this.zze = Collections.emptyMap();
    }
}
