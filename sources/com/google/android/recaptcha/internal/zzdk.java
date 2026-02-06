package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;

public final class zzdk implements zzdd {
    public static final zzdk zza = new zzdk();

    private zzdk() {
    }

    public final void zza(int i10, zzcj zzcj, zzpq... zzpqArr) {
        if (zzpqArr.length == 1) {
            Object zza2 = zzcj.zzc().zza(zzpqArr[0]);
            if (true != (zza2 instanceof Field)) {
                zza2 = null;
            }
            Field field = (Field) zza2;
            if (field != null) {
                try {
                    zzcj.zzc().zzf(i10, field.get((Object) null));
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
