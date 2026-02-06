package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

final class zzlv implements Iterator {
    private int zza;
    private boolean zzb;
    private Iterator zzc;
    private final /* synthetic */ zzlm zzd;

    private final Iterator zza() {
        if (this.zzc == null) {
            this.zzc = this.zzd.zzb.entrySet().iterator();
        }
        return this.zzc;
    }

    public final boolean hasNext() {
        if (this.zza + 1 < this.zzd.zza.size() || (!this.zzd.zzb.isEmpty() && zza().hasNext())) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        this.zzb = true;
        int i10 = this.zza + 1;
        this.zza = i10;
        if (i10 < this.zzd.zza.size()) {
            return (Map.Entry) this.zzd.zza.get(this.zza);
        }
        return (Map.Entry) zza().next();
    }

    public final void remove() {
        if (this.zzb) {
            this.zzb = false;
            this.zzd.zzg();
            if (this.zza < this.zzd.zza.size()) {
                zzlm zzlm = this.zzd;
                int i10 = this.zza;
                this.zza = i10 - 1;
                Object unused = zzlm.zzb(i10);
                return;
            }
            zza().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    private zzlv(zzlm zzlm) {
        this.zzd = zzlm;
        this.zza = -1;
    }
}
