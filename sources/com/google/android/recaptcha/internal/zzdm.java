package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.Arrays;
import mf.C6559l;

public final class zzdm implements zzdd {
    public static final zzdm zza = new zzdm();

    private zzdm() {
    }

    public final void zza(int i10, zzcj zzcj, zzpq... zzpqArr) {
        int length = zzpqArr.length;
        if (length != 0) {
            Object zza2 = zzcj.zzc().zza(zzpqArr[0]);
            if (true != (zza2 instanceof Method)) {
                zza2 = null;
            }
            Method method = (Method) zza2;
            if (method != null) {
                Object[] zzh = zzcj.zzc().zzh(C6559l.n1(zzpqArr).subList(1, length));
                try {
                    zzcj.zzc().zzf(i10, method.invoke((Object) null, Arrays.copyOf(zzh, zzh.length)));
                } catch (Exception e10) {
                    throw new zzae(6, 15, e10);
                }
            } else {
                throw new zzae(4, 5, (Throwable) null);
            }
        } else {
            throw new zzae(4, 3, (Throwable) null);
        }
    }
}
