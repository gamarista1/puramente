package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

public final class zzba {
    private final String zza;
    private final zzaz zzb;
    private zzaz zzc;

    /* synthetic */ zzba(String str, zzbb zzbb) {
        zzaz zzaz = new zzaz();
        this.zzb = zzaz;
        this.zzc = zzaz;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzaz zzaz = this.zzb.zzb;
        String str = "";
        while (zzaz != null) {
            Object obj = zzaz.zza;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append(deepToString, 1, deepToString.length() - 1);
            }
            zzaz = zzaz.zzb;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzba zza(Object obj) {
        zzaz zzaz = new zzaz();
        this.zzc.zzb = zzaz;
        this.zzc = zzaz;
        zzaz.zza = obj;
        return this;
    }
}
