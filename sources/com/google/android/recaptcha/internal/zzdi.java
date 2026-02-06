package com.google.android.recaptcha.internal;

import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;

public final class zzdi implements zzdd {
    public static final zzdi zza = new zzdi();

    private zzdi() {
    }

    public final void zza(int i10, zzcj zzcj, zzpq... zzpqArr) {
        Class<?> cls;
        int length = zzpqArr.length;
        if (length >= 2) {
            Object zza2 = zzcj.zzc().zza(zzpqArr[0]);
            if (true != Objects.nonNull(zza2)) {
                zza2 = null;
            }
            if (zza2 != null) {
                if (zza2 instanceof Class) {
                    cls = (Class) zza2;
                } else {
                    cls = zza2.getClass();
                }
                Object zza3 = zzcj.zzc().zza(zzpqArr[1]);
                if (true != (zza3 instanceof String)) {
                    zza3 = null;
                }
                String str = (String) zza3;
                if (str != null) {
                    String zza4 = zzcj.zzh().zza(str);
                    if (!C6496s.c(zza4, "forName")) {
                        Class[] zzg = zzcj.zzc().zzg(C6559l.n1(zzpqArr).subList(2, length));
                        try {
                            zzcj.zzc().zzf(i10, cls.getMethod(zza4, (Class[]) Arrays.copyOf(zzg, zzg.length)));
                        } catch (Exception e10) {
                            throw new zzae(6, 13, e10);
                        }
                    } else {
                        throw new zzae(6, 48, (Throwable) null);
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
