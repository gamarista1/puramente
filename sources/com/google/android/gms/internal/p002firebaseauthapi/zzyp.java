package com.google.android.gms.internal.p002firebaseauthapi;

import Db.C4267o;
import com.google.firebase.auth.C4793j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyp  reason: invalid package */
final class zzyp implements zzadm<zzafm> {
    private final /* synthetic */ C4793j zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzacf zzc;
    private final /* synthetic */ zzyl zzd;

    zzyp(zzyl zzyl, C4793j jVar, String str, zzacf zzacf) {
        this.zza = jVar;
        this.zzb = str;
        this.zzc = zzacf;
        this.zzd = zzyl;
    }

    public final void zza(String str) {
        this.zzc.zza(C4267o.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        this.zzd.zza(new zzaeo(this.zza, ((zzafm) obj).zzc(), this.zzb), this.zzc);
    }
}
