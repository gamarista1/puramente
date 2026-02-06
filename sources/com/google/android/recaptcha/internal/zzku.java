package com.google.android.recaptcha.internal;

import java.util.Map;

final class zzku extends zzle {
    zzku(int i10) {
        super(i10, (zzld) null);
    }

    public final void zza() {
        if (!zzj()) {
            for (int i10 = 0; i10 < zzb(); i10++) {
                ((zzii) zzg(i10).getKey()).zzg();
            }
            for (Map.Entry key : zzc()) {
                ((zzii) key.getKey()).zzg();
            }
        }
        super.zza();
    }
}
