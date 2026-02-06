package com.google.android.gms.internal.p002firebaseauthapi;

import Db.C4267o;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaag  reason: invalid package */
final class zzaag implements zzadm<zzafm> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzacf zzb;
    private final /* synthetic */ zzyl zzc;

    zzaag(zzyl zzyl, String str, zzacf zzacf) {
        this.zza = str;
        this.zzb = zzacf;
        this.zzc = zzyl;
    }

    public final void zza(String str) {
        this.zzb.zza(C4267o.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzafm zzafm = (zzafm) obj;
        String zzc2 = zzafm.zzc();
        zzagf zzagf = new zzagf();
        zzagf.zzd(zzc2).zzf(this.zza);
        zzyl.zza(this.zzc, this.zzb, zzafm, zzagf, (zzadn) this);
    }
}
