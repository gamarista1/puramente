package com.google.android.gms.internal.p002firebaseauthapi;

import Db.C4267o;
import com.google.firebase.auth.C0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaac  reason: invalid package */
final class zzaac implements zzadm<zzagg> {
    private final /* synthetic */ zzacf zza;
    private final /* synthetic */ zzyl zzb;

    zzaac(zzyl zzyl, zzacf zzacf) {
        this.zza = zzacf;
        this.zzb = zzyl;
    }

    public final void zza(String str) {
        this.zza.zza(C4267o.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzagg zzagg = (zzagg) obj;
        this.zzb.zza(new zzafm(zzagg.zzc(), zzagg.zzb(), Long.valueOf(zzagg.zza()), "Bearer"), (String) null, (String) null, Boolean.TRUE, (C0) null, this.zza, this);
    }
}
