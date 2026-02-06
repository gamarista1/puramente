package com.google.android.recaptcha.internal;

import java.util.Objects;
import kotlin.jvm.internal.C6496s;

public final class zzcp implements zzdd {
    public static final zzcp zza = new zzcp();

    private zzcp() {
    }

    public final void zza(int i10, zzcj zzcj, zzpq... zzpqArr) {
        if (zzpqArr.length == 3) {
            Object zza2 = zzcj.zzc().zza(zzpqArr[0]);
            if (true != (zza2 instanceof Integer)) {
                zza2 = null;
            }
            Integer num = (Integer) zza2;
            if (num != null) {
                int intValue = num.intValue();
                if (intValue != 0) {
                    Object zza3 = zzcj.zzc().zza(zzpqArr[1]);
                    if (true != Objects.nonNull(zza3)) {
                        zza3 = null;
                    }
                    if (zza3 != null) {
                        Object zza4 = zzcj.zzc().zza(zzpqArr[2]);
                        if (true != Objects.nonNull(zza4)) {
                            zza4 = null;
                        }
                        if (zza4 == null) {
                            throw new zzae(4, 5, (Throwable) null);
                        } else if (C6496s.c(zza3, zza4)) {
                            zzcj.zzg(zzcj.zza() + intValue);
                        }
                    } else {
                        throw new zzae(4, 5, (Throwable) null);
                    }
                } else {
                    throw new zzae(4, 6, (Throwable) null);
                }
            } else {
                throw new zzae(4, 5, (Throwable) null);
            }
        } else {
            throw new zzae(4, 3, (Throwable) null);
        }
    }
}
