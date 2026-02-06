package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzals  reason: invalid package */
final class zzals implements Iterator {
    private int zza;
    private boolean zzb;
    private Iterator zzc;
    private final /* synthetic */ zzali zzd;

    private final Iterator zza() {
        if (this.zzc == null) {
            this.zzc = this.zzd.zzc.entrySet().iterator();
        }
        return this.zzc;
    }

    public final boolean hasNext() {
        if (this.zza + 1 < this.zzd.zzb.size() || (!this.zzd.zzc.isEmpty() && zza().hasNext())) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        this.zzb = true;
        int i10 = this.zza + 1;
        this.zza = i10;
        if (i10 < this.zzd.zzb.size()) {
            return (Map.Entry) this.zzd.zzb.get(this.zza);
        }
        return (Map.Entry) zza().next();
    }

    public final void remove() {
        if (this.zzb) {
            this.zzb = false;
            this.zzd.zzg();
            if (this.zza < this.zzd.zzb.size()) {
                zzali zzali = this.zzd;
                int i10 = this.zza;
                this.zza = i10 - 1;
                Object unused = zzali.zzc(i10);
                return;
            }
            zza().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    private zzals(zzali zzali) {
        this.zzd = zzali;
        this.zza = -1;
    }
}
