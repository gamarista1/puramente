package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

final class zzdn extends zzcv {
    private final transient zzcr zza;
    private final transient zzco zzb;

    zzdn(zzcr zzcr, zzco zzco) {
        this.zza = zzcr;
        this.zzb = zzco;
    }

    public final boolean contains(Object obj) {
        if (this.zza.get(obj) != null) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    public final int size() {
        return this.zza.size();
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i10) {
        return this.zzb.zza(objArr, 0);
    }

    public final zzco zzd() {
        return this.zzb;
    }

    public final zzdw zze() {
        return this.zzb.listIterator(0);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        throw null;
    }
}
