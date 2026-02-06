package com.google.android.gms.internal.auth;

final class zzfo implements zzfv {
    private final zzfv[] zza;

    zzfo(zzfv... zzfvArr) {
        this.zza = zzfvArr;
    }

    public final zzfu zzb(Class cls) {
        zzfv[] zzfvArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            zzfv zzfv = zzfvArr[i10];
            if (zzfv.zzc(cls)) {
                return zzfv.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public final boolean zzc(Class cls) {
        zzfv[] zzfvArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            if (zzfvArr[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
