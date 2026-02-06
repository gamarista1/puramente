package com.google.android.gms.internal.p002firebaseauthapi;

import Db.C4267o;
import com.google.firebase.auth.C0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzc  reason: invalid package */
final class zzzc implements zzadm<zzaha> {
    private final /* synthetic */ zzacf zza;
    private final /* synthetic */ zzyl zzb;

    zzzc(zzyl zzyl, zzacf zzacf) {
        this.zza = zzacf;
        this.zzb = zzyl;
    }

    public final void zza(String str) {
        this.zza.zza(C4267o.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzaha zzaha = (zzaha) obj;
        this.zzb.zza(new zzafm(zzaha.zzd(), zzaha.zzb(), Long.valueOf(zzaha.zza()), "Bearer"), (String) null, (String) null, Boolean.valueOf(zzaha.zzf()), (C0) null, this.zza, this);
    }
}
