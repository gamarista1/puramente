package com.google.android.gms.internal.fido;

import java.util.List;

final class zzax extends zzaz {
    private final transient zzaz zza;

    zzax(zzaz zzaz) {
        this.zza = zzaz;
    }

    private final int zzl(int i10) {
        return (this.zza.size() - 1) - i10;
    }

    public final boolean contains(Object obj) {
        return this.zza.contains(obj);
    }

    public final Object get(int i10) {
        zzap.zza(i10, this.zza.size(), "index");
        return this.zza.get(zzl(i10));
    }

    public final int indexOf(Object obj) {
        int lastIndexOf = this.zza.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return zzl(lastIndexOf);
        }
        return -1;
    }

    public final int lastIndexOf(Object obj) {
        int indexOf = this.zza.indexOf(obj);
        if (indexOf >= 0) {
            return zzl(indexOf);
        }
        return -1;
    }

    public final int size() {
        return this.zza.size();
    }

    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    public final zzaz zzf() {
        return this.zza;
    }

    public final zzaz zzg(int i10, int i11) {
        zzap.zze(i10, i11, this.zza.size());
        zzaz zzaz = this.zza;
        return zzaz.subList(zzaz.size() - i11, this.zza.size() - i10).zzf();
    }
}
