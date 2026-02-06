package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;
import java.util.Objects;

public final class zzco implements zzdd {
    public static final zzco zza = new zzco();

    private zzco() {
    }

    public final void zza(int i10, zzcj zzcj, zzpq... zzpqArr) {
        if (zzpqArr.length == 3) {
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
                    Object zza4 = zzcj.zzc().zza(zzpqArr[2]);
                    if (true != Objects.nonNull(zza4)) {
                        zza4 = null;
                    }
                    if (zza4 != null) {
                        try {
                            Array.set(zza2, intValue, zza4);
                        } catch (Exception e10) {
                            if (e10 instanceof ArrayIndexOutOfBoundsException) {
                                throw new zzae(4, 22, e10);
                            }
                            throw new zzae(4, 25, e10);
                        }
                    } else {
                        throw new zzae(4, 5, (Throwable) null);
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
