package com.google.android.gms.internal.p002firebaseauthapi;

import Db.C4267o;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzo  reason: invalid package */
final class zzzo implements zzadm<zzagu> {
    private final /* synthetic */ zzacf zza;
    private final /* synthetic */ zzyl zzb;

    zzzo(zzyl zzyl, zzacf zzacf) {
        this.zza = zzacf;
        this.zzb = zzyl;
    }

    public final void zza(String str) {
        this.zza.zza(C4267o.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzagu zzagu = (zzagu) obj;
        if (!zzagu.zzl()) {
            zzyl.zza(this.zzb, zzagu, this.zza, (zzadn) this);
        } else {
            this.zza.zza(new zzym(zzagu.zzf(), zzagu.zzk(), zzagu.zzb()));
        }
    }
}
