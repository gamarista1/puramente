package com.google.android.gms.internal.p002firebaseauthapi;

import Db.C4267o;
import com.google.firebase.auth.C0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyx  reason: invalid package */
final class zzyx implements zzadm<zzagw> {
    private final /* synthetic */ zzacf zza;
    private final /* synthetic */ zzyl zzb;

    zzyx(zzyl zzyl, zzacf zzacf) {
        this.zza = zzacf;
        this.zzb = zzyl;
    }

    public final void zza(String str) {
        this.zza.zza(C4267o.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzagw zzagw = (zzagw) obj;
        this.zzb.zza(new zzafm(zzagw.zzc(), zzagw.zzb(), Long.valueOf(zzagw.zza()), "Bearer"), (String) null, (String) null, Boolean.valueOf(zzagw.zzd()), (C0) null, this.zza, this);
    }
}
