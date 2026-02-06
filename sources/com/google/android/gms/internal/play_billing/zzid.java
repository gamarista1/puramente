package com.google.android.gms.internal.play_billing;

final class zzid implements zzik {
    private final zzik[] zza;

    zzid(zzik... zzikArr) {
        this.zza = zzikArr;
    }

    public final zzij zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            zzik zzik = this.zza[i10];
            if (zzik.zzc(cls)) {
                return zzik.zzb(cls);
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
