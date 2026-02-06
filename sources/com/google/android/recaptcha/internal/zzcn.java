package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Objects;

public final class zzcn implements zzdd {
    public static final zzcn zza = new zzcn();

    private zzcn() {
    }

    public final void zza(int i10, zzcj zzcj, zzpq... zzpqArr) {
        Object obj;
        if (zzpqArr.length == 2) {
            Object zza2 = zzcj.zzc().zza(zzpqArr[0]);
            if (true != Objects.nonNull(zza2)) {
                zza2 = null;
            }
            if (zza2 != null) {
                Object zza3 = zzcj.zzc().zza(zzpqArr[1]);
                if (true != (zza3 instanceof Integer)) {
                    zza3 = null;
                }
                Integer num = (Integer) zza3;
                if (num != null) {
                    int intValue = num.intValue();
                    try {
                        if (zza2 instanceof String) {
                            obj = String.valueOf(((String) zza2).charAt(intValue));
                        } else if (zza2 instanceof List) {
                            obj = ((List) zza2).get(intValue);
                        } else {
                            obj = Array.get(zza2, intValue);
                        }
                        zzcj.zzc().zzf(i10, obj);
                    } catch (Exception e10) {
                        if (e10 instanceof ArrayIndexOutOfBoundsException) {
                            throw new zzae(4, 22, e10);
                        }
                        throw new zzae(4, 23, e10);
                    }
                } else {
                    throw new zzae(4, 5, (Throwable) null);
                }
            } else {
                throw new zzae(4, 5, (Throwable) null);
            }
        } else {
            throw new zzae(4, 3, (Throwable) null);
        }
    }
}
