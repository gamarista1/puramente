package com.google.android.recaptcha.internal;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Objects;
import mf.C6559l;

public final class zzdp implements zzdd {
    public static final zzdp zza = new zzdp();

    private zzdp() {
    }

    public final void zza(int i10, zzcj zzcj, zzpq... zzpqArr) {
        Constructor<?> constructor;
        int length = zzpqArr.length;
        if (length != 0) {
            Object zza2 = zzcj.zzc().zza(zzpqArr[0]);
            if (true != Objects.nonNull(zza2)) {
                zza2 = null;
            }
            if (zza2 != null) {
                if (zza2 instanceof Constructor) {
                    constructor = (Constructor) zza2;
                } else {
                    constructor = zza2.getClass().getConstructor((Class[]) null);
                }
                Object[] zzh = zzcj.zzc().zzh(C6559l.n1(zzpqArr).subList(1, length));
                try {
                    zzcj.zzc().zzf(i10, constructor.newInstance(Arrays.copyOf(zzh, zzh.length)));
                } catch (Exception e10) {
                    throw new zzae(6, 14, e10);
                }
            } else {
                throw new zzae(4, 5, (Throwable) null);
            }
        } else {
            throw new zzae(4, 3, (Throwable) null);
        }
    }
}
