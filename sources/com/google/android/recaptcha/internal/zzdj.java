package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;

public final class zzdj implements zzdd {
    public static final zzdj zza = new zzdj();

    private zzdj() {
    }

    public final void zza(int i10, zzcj zzcj, zzpq... zzpqArr) {
        if (zzpqArr.length == 2) {
            Object zza2 = zzcj.zzc().zza(zzpqArr[0]);
            if (true != (zza2 instanceof Field)) {
                zza2 = null;
            }
            Field field = (Field) zza2;
            if (field != null) {
                try {
                    zzcj.zzc().zzf(i10, field.get(zzcj.zzc().zza(zzpqArr[1])));
                } catch (Exception e10) {
                    throw new zzae(6, 16, e10);
                }
            } else {
                throw new zzae(4, 5, (Throwable) null);
            }
        } else {
            throw new zzae(4, 3, (Throwable) null);
        }
    }
}
