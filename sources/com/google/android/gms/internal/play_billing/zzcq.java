package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

public final class zzcq {
    Object[] zza = new Object[8];
    int zzb = 0;
    zzcp zzc;

    public final zzcq zza(Object obj, Object obj2) {
        int i10 = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.zza = Arrays.copyOf(objArr, zzci.zzc(length, i11));
        }
        zzbw.zzb(obj, obj2);
        Object[] objArr2 = this.zza;
        int i12 = this.zzb;
        int i13 = i12 + i12;
        objArr2[i13] = obj;
        objArr2[i13 + 1] = obj2;
        this.zzb = i12 + 1;
        return this;
    }

    public final zzcr zzb() {
        zzcp zzcp = this.zzc;
        if (zzcp == null) {
            zzdp zzg = zzdp.zzg(this.zzb, this.zza, this);
            zzcp zzcp2 = this.zzc;
            if (zzcp2 == null) {
                return zzg;
            }
            throw zzcp2.zza();
        }
        throw zzcp.zza();
    }
}
