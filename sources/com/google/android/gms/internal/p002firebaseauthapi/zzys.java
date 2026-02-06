package com.google.android.gms.internal.p002firebaseauthapi;

import Db.C4267o;
import com.google.firebase.auth.C0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzys  reason: invalid package */
final class zzys implements zzadm<zzaer> {
    private final /* synthetic */ zzacf zza;
    private final /* synthetic */ zzyl zzb;

    zzys(zzyl zzyl, zzacf zzacf) {
        this.zza = zzacf;
        this.zzb = zzyl;
    }

    public final void zza(String str) {
        this.zza.zza(C4267o.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzaer zzaer = (zzaer) obj;
        if (zzaer.zzf()) {
            this.zza.zza(new zzym(zzaer.zzc(), zzaer.zze(), (C0) null));
            return;
        }
        this.zzb.zza(new zzafm(zzaer.zzd(), zzaer.zzb(), Long.valueOf(zzaer.zza()), "Bearer"), (String) null, (String) null, Boolean.valueOf(zzaer.zzg()), (C0) null, this.zza, this);
    }
}
