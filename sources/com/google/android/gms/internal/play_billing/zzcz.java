package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

final class zzcz extends zzdw {
    private final Object zza;
    private boolean zzb;

    zzcz(Object obj) {
        this.zza = obj;
    }

    public final boolean hasNext() {
        return !this.zzb;
    }

    public final Object next() {
        if (!this.zzb) {
            this.zzb = true;
            return this.zza;
        }
        throw new NoSuchElementException();
    }
}
