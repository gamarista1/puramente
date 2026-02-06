package com.google.android.gms.internal.play_billing;

import java.util.List;

final class zzcn extends zzco {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzco zzc;

    zzcn(zzco zzco, int i10, int i11) {
        this.zzc = zzco;
        this.zza = i10;
        this.zzb = i11;
    }

    public final Object get(int i10) {
        zzbe.zza(i10, this.zzb, "index");
        return this.zzc.get(i10 + this.zza);
    }

    public final int size() {
        return this.zzb;
    }

    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    public final zzco zzi(int i10, int i11) {
        zzbe.zze(i10, i11, this.zzb);
        int i12 = this.zza;
        return this.zzc.subList(i10 + i12, i11 + i12);
    }
}
