package com.google.android.recaptcha.internal;

final class zzjz {
    zzjz() {
    }

    public static final boolean zza(Object obj) {
        if (!((zzjy) obj).zze()) {
            return true;
        }
        return false;
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzjy zzjy = (zzjy) obj;
        zzjy zzjy2 = (zzjy) obj2;
        if (!zzjy2.isEmpty()) {
            if (!zzjy.zze()) {
                zzjy = zzjy.zzb();
            }
            zzjy.zzd(zzjy2);
        }
        return zzjy;
    }
}
