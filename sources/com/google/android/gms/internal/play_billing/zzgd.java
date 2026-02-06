package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

final class zzgd extends zzge {
    final /* synthetic */ zzgk zza;
    private int zzb = 0;
    private final int zzc;

    zzgd(zzgk zzgk) {
        this.zza = zzgk;
        this.zzc = zzgk.zzd();
    }

    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    public final byte zza() {
        int i10 = this.zzb;
        if (i10 < this.zzc) {
            this.zzb = i10 + 1;
            return this.zza.zzb(i10);
        }
        throw new NoSuchElementException();
    }
}
