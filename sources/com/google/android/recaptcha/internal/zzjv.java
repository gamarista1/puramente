package com.google.android.recaptcha.internal;

final class zzjv implements zzkc {
    private final zzkc[] zza;

    zzjv(zzkc... zzkcArr) {
        this.zza = zzkcArr;
    }

    public final zzkb zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            zzkc zzkc = this.zza[i10];
            if (zzkc.zzc(cls)) {
                return zzkc.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public final boolean zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.zza[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
