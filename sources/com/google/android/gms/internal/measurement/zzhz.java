package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

final class zzhz extends zzib {
    private int zza = 0;
    private final int zzb;
    private final /* synthetic */ zzia zzc;

    zzhz(zzia zzia) {
        this.zzc = zzia;
        this.zzb = zzia.zzb();
    }

    public final boolean hasNext() {
        if (this.zza < this.zzb) {
            return true;
        }
        return false;
    }

    public final byte zza() {
        int i10 = this.zza;
        if (i10 < this.zzb) {
            this.zza = i10 + 1;
            return this.zzc.zzb(i10);
        }
        throw new NoSuchElementException();
    }
}
