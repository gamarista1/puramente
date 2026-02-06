package com.google.android.gms.internal.play_billing;

import java.util.List;

final class zzcm extends zzco {
    private final transient zzco zza;

    zzcm(zzco zzco) {
        this.zza = zzco;
    }

    private final int zzp(int i10) {
        return (this.zza.size() - 1) - i10;
    }

    public final boolean contains(Object obj) {
        return this.zza.contains(obj);
    }

    public final Object get(int i10) {
        zzbe.zza(i10, this.zza.size(), "index");
        return this.zza.get(zzp(i10));
    }

    public final int indexOf(Object obj) {
        int lastIndexOf = this.zza.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return zzp(lastIndexOf);
        }
        return -1;
    }

    public final int lastIndexOf(Object obj) {
        int indexOf = this.zza.indexOf(obj);
        if (indexOf >= 0) {
            return zzp(indexOf);
        }
        return -1;
    }

    public final int size() {
        return this.zza.size();
    }

    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        return this.zza.zzf();
    }

    public final zzco zzh() {
        return this.zza;
    }

    public final zzco zzi(int i10, int i11) {
        zzbe.zze(i10, i11, this.zza.size());
        zzco zzco = this.zza;
        return zzco.subList(zzco.size() - i11, this.zza.size() - i10).zzh();
    }
}
