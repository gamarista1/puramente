package com.google.android.gms.internal.fido;

import java.util.AbstractMap;

final class zzbe extends zzaz {
    final /* synthetic */ zzbf zza;

    zzbe(zzbf zzbf) {
        this.zza = zzbf;
    }

    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return new AbstractMap.SimpleImmutableEntry(this.zza.zza.zze.zzd.get(i10), this.zza.zza.zzf.get(i10));
    }

    public final int size() {
        return this.zza.zza.size();
    }
}
