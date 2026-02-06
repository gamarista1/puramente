package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajz  reason: invalid package */
final class zzajz extends zzaju {
    private static <E> zzajl<E> zzc(Object obj, long j10) {
        return (zzajl) zzamm.zze(obj, j10);
    }

    /* access modifiers changed from: package-private */
    public final <L> List<L> zza(Object obj, long j10) {
        zzajl zzc = zzc(obj, j10);
        if (zzc.zzc()) {
            return zzc;
        }
        int size = zzc.size();
        zzajl zza = zzc.zza(size == 0 ? 10 : size << 1);
        zzamm.zza(obj, j10, (Object) zza);
        return zza;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Object obj, long j10) {
        zzc(obj, j10).zzb();
    }

    private zzajz() {
        super();
    }

    /* access modifiers changed from: package-private */
    public final <E> void zza(Object obj, Object obj2, long j10) {
        zzajl zzc = zzc(obj, j10);
        zzajl zzc2 = zzc(obj2, j10);
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
        zzamm.zza(obj, j10, (Object) zzc2);
    }
}
