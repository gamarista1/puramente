package com.google.android.gms.internal.measurement;

final class zzki implements zzkq {
    private zzkq[] zza;

    zzki(zzkq... zzkqArr) {
        this.zza = zzkqArr;
    }

    public final zzkr zza(Class<?> cls) {
        for (zzkq zzkq : this.zza) {
            if (zzkq.zzb(cls)) {
                return zzkq.zza(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    public final boolean zzb(Class<?> cls) {
        for (zzkq zzb : this.zza) {
            if (zzb.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
