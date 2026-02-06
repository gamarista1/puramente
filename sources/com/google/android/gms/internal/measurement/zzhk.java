package com.google.android.gms.internal.measurement;

import com.google.common.collect.C4772x;
import nb.o;

public final class zzhk {
    private final boolean zza;

    public zzhk(zzhn zzhn) {
        o.k(zzhn, "BuildInfo must be non-null");
        this.zza = !zzhn.zza();
    }

    public final boolean zza(String str) {
        o.k(str, "flagName must not be null");
        if (!this.zza) {
            return true;
        }
        return ((C4772x) zzhm.zza.get()).c(str);
    }
}
