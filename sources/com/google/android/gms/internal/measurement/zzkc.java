package com.google.android.gms.internal.measurement;

import java.util.List;

final class zzkc implements zzkd {
    zzkc() {
    }

    private static <E> zzjt<E> zzc(Object obj, long j10) {
        return (zzjt) zzmg.zze(obj, j10);
    }

    public final <L> List<L> zza(Object obj, long j10) {
        zzjt zzc = zzc(obj, j10);
        if (zzc.zzc()) {
            return zzc;
        }
        int size = zzc.size();
        zzjt zza = zzc.zza(size == 0 ? 10 : size << 1);
        zzmg.zza(obj, j10, (Object) zza);
        return zza;
    }

    public final void zzb(Object obj, long j10) {
        zzc(obj, j10).zzb();
    }

    public final <E> void zza(Object obj, Object obj2, long j10) {
        zzjt zzc = zzc(obj, j10);
        zzjt zzc2 = zzc(obj2, j10);
        int size = zzc.size();
        int size2 = zzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzc.zzc()) {
                zzc = zzc.zza(size2 + size);
            }
            zzc.addAll(zzc2);
        }
        if (size > 0) {
            zzc2 = zzc;
        }
        zzmg.zza(obj, j10, (Object) zzc2);
    }
}
