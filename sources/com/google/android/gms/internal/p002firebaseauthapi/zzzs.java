package com.google.android.gms.internal.p002firebaseauthapi;

import Db.C4267o;
import com.google.firebase.auth.C0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzs  reason: invalid package */
final class zzzs implements zzadm<zzaev> {
    private final /* synthetic */ zzacf zza;
    private final /* synthetic */ zzyl zzb;

    zzzs(zzyl zzyl, zzacf zzacf) {
        this.zza = zzacf;
        this.zzb = zzyl;
    }

    public final void zza(String str) {
        this.zza.zza(C4267o.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzaev zzaev = (zzaev) obj;
        this.zzb.zza(new zzafm(zzaev.zzb(), zzaev.zza(), Long.valueOf(zzafo.zza(zzaev.zza())), "Bearer"), (String) null, (String) null, Boolean.FALSE, (C0) null, this.zza, this);
    }
}
