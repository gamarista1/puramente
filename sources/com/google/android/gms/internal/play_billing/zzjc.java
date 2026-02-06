package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

final class zzjc implements Iterator {
    final /* synthetic */ zzjf zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    /* synthetic */ zzjc(zzjf zzjf, zzje zzje) {
        this.zza = zzjf;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }

    public final boolean hasNext() {
        int i10 = this.zzb + 1;
        zzjf zzjf = this.zza;
        if (i10 < zzjf.zzb) {
            return true;
        }
        if (zzjf.zzc.isEmpty()) {
            return false;
        }
        if (zza().hasNext()) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i10 = this.zzb + 1;
        this.zzb = i10;
        zzjf zzjf = this.zza;
        if (i10 < zzjf.zzb) {
            return (zzjb) zzjf.zza[i10];
        }
        return (Map.Entry) zza().next();
    }

    public final void remove() {
        if (this.zzc) {
            this.zzc = false;
            this.zza.zzo();
            int i10 = this.zzb;
            zzjf zzjf = this.zza;
            if (i10 < zzjf.zzb) {
                this.zzb = i10 - 1;
                Object unused = zzjf.zzm(i10);
                return;
            }
            zza().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
