package com.google.android.gms.internal.auth;

final class zzfj extends zzfl {
    /* synthetic */ zzfj(zzfi zzfi) {
        super((zzfk) null);
    }

    /* access modifiers changed from: package-private */
    public final void zza(Object obj, long j10) {
        ((zzez) zzhj.zzf(obj, j10)).zzb();
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Object obj, Object obj2, long j10) {
        zzez zzez = (zzez) zzhj.zzf(obj, j10);
        zzez zzez2 = (zzez) zzhj.zzf(obj2, j10);
        int size = zzez.size();
        int size2 = zzez2.size();
        if (size > 0 && size2 > 0) {
            if (!zzez.zzc()) {
                zzez = zzez.zzd(size2 + size);
            }
            zzez.addAll(zzez2);
        }
        if (size > 0) {
            zzez2 = zzez;
        }
        zzhj.zzp(obj, j10, zzez2);
    }

    private zzfj() {
        super((zzfk) null);
    }
}
