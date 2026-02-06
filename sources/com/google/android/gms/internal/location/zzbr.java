package com.google.android.gms.internal.location;

import java.util.List;

final class zzbr extends zzbs {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzbs zzc;

    zzbr(zzbs zzbs, int i10, int i11) {
        this.zzc = zzbs;
        this.zza = i10;
        this.zzb = i11;
    }

    public final Object get(int i10) {
        zzbm.zza(i10, this.zzb, "index");
        return this.zzc.get(i10 + this.zza);
    }

    public final int size() {
        return this.zzb;
    }

    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzb() {
        return this.zzc.zzb();
    }

    /* access modifiers changed from: package-private */
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    /* access modifiers changed from: package-private */
    public final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        return true;
    }

    public final zzbs zzh(int i10, int i11) {
        zzbm.zzc(i10, i11, this.zzb);
        zzbs zzbs = this.zzc;
        int i12 = this.zza;
        return zzbs.subList(i10 + i12, i11 + i12);
    }
}
