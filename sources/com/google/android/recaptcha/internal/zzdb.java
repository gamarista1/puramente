package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Objects;

public final class zzdb implements zzdd {
    public static final zzdb zza = new zzdb();

    private zzdb() {
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
                        if (zza2 instanceof Integer) {
                            obj = Integer.valueOf(((Number) zza2).intValue() / intValue);
                        } else if (zza2 instanceof int[]) {
                            ArrayList arrayList = new ArrayList(r4);
                            for (int i11 : (int[]) zza2) {
                                arrayList.add(Integer.valueOf(i11 / intValue));
                            }
                            obj = arrayList.toArray(new Integer[0]);
                        } else {
                            throw new zzae(4, 5, (Throwable) null);
                        }
                        zzcj.zzc().zzf(i10, obj);
                    } catch (ArithmeticException e10) {
                        throw new zzae(4, 6, e10);
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
