package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzw extends zzal {
    private zzaa zzk;

    public zzw(zzaa zzaa) {
        super("internal.registerCallback");
        this.zzk = zzaa;
    }

    public final zzaq zza(zzh zzh, List<zzaq> list) {
        int i10;
        zzg.zza(this.zza, 3, list);
        String zzf = zzh.zza(list.get(0)).zzf();
        zzaq zza = zzh.zza(list.get(1));
        if (zza instanceof zzar) {
            zzaq zza2 = zzh.zza(list.get(2));
            if (zza2 instanceof zzap) {
                zzap zzap = (zzap) zza2;
                if (zzap.zzc("type")) {
                    String zzf2 = zzap.zza("type").zzf();
                    if (zzap.zzc("priority")) {
                        i10 = zzg.zzb(zzap.zza("priority").zze().doubleValue());
                    } else {
                        i10 = 1000;
                    }
                    this.zzk.zza(zzf, i10, (zzar) zza, zzf2);
                    return zzaq.zzc;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
