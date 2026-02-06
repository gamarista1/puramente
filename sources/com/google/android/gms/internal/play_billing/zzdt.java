package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

final class zzdt extends zzcv {
    final transient Object zza;

    zzdt(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final /* synthetic */ Iterator iterator() {
        return new zzcz(this.zza);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return "[" + obj + "]";
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i10) {
        objArr[0] = this.zza;
        return 1;
    }

    public final zzco zzd() {
        return zzco.zzm(this.zza);
    }

    public final zzdw zze() {
        return new zzcz(this.zza);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        throw null;
    }
}
