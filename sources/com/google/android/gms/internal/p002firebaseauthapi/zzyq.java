package com.google.android.gms.internal.p002firebaseauthapi;

import Db.C4267o;
import com.google.firebase.auth.C0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyq  reason: invalid package */
final class zzyq implements zzadm<zzagy> {
    private final /* synthetic */ zzacf zza;
    private final /* synthetic */ zzyl zzb;

    zzyq(zzyl zzyl, zzacf zzacf) {
        this.zza = zzacf;
        this.zzb = zzyl;
    }

    public final void zza(String str) {
        this.zza.zza(C4267o.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzagy zzagy = (zzagy) obj;
        if (zzagy.zzf()) {
            this.zza.zza(new zzym(zzagy.zzc(), zzagy.zze(), (C0) null));
            return;
        }
        this.zzb.zza(new zzafm(zzagy.zzd(), zzagy.zzb(), Long.valueOf(zzagy.zza()), "Bearer"), (String) null, (String) null, Boolean.FALSE, (C0) null, this.zza, this);
    }
}
