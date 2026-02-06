package com.google.android.gms.internal.p002firebaseauthapi;

import Db.C4267o;
import com.google.firebase.auth.C0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzp  reason: invalid package */
final class zzzp implements zzadm<zzaet> {
    private final /* synthetic */ zzzq zza;

    zzzp(zzzq zzzq) {
        this.zza = zzzq;
    }

    public final void zza(String str) {
        this.zza.zza.zza(C4267o.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzaet zzaet = (zzaet) obj;
        zzafm zzafm = new zzafm(zzaet.zzb(), zzaet.zza(), Long.valueOf(zzafo.zza(zzaet.zza())), "Bearer");
        zzzq zzzq = this.zza;
        zzzq.zzb.zza(zzafm, (String) null, (String) null, Boolean.FALSE, (C0) null, zzzq.zza, this);
    }
}
