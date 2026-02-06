package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbv  reason: invalid package */
public final class zzbv {
    private final zzvc zza = null;
    private final zzci zzb;

    private zzbv(zzci zzci) {
        this.zzb = zzci;
    }

    public static zzbv zza(zzci zzci) {
        return new zzbv(zzci);
    }

    /* access modifiers changed from: package-private */
    public final zzvc zza() {
        zzci zzci = this.zzb;
        if (zzci instanceof zznc) {
            return ((zznc) zzci).zzb().zza();
        }
        return ((zzot) zzns.zza().zza(this.zzb, zzot.class)).zza();
    }
}
