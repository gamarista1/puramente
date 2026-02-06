package com.google.android.gms.internal.play_billing;

import java.util.Objects;
import java.util.function.Function;

public final /* synthetic */ class zzbs implements Function {
    public final Object apply(Object obj) {
        zzcu zzcu = (zzcu) obj;
        int i10 = zzcu.zzb;
        if (i10 == 0) {
            return zzdq.zza;
        }
        if (i10 != 1) {
            zzcv zzj = zzcv.zzl(i10, zzcu.zza);
            zzcu.zzb = zzj.size();
            zzcu.zzc = true;
            return zzj;
        }
        Object obj2 = zzcu.zza[0];
        Objects.requireNonNull(obj2);
        return new zzdt(obj2);
    }
}
