package com.google.android.gms.internal.p002firebaseauthapi;

import Db.C4267o;
import android.text.TextUtils;
import com.google.firebase.auth.C0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzl  reason: invalid package */
final class zzzl implements zzadm<zzahc> {
    private final /* synthetic */ zzzm zza;

    zzzl(zzzm zzzm) {
        this.zza = zzzm;
    }

    public final void zza(String str) {
        this.zza.zza.zza(C4267o.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzahc zzahc = (zzahc) obj;
        if (TextUtils.isEmpty(zzahc.zza()) || TextUtils.isEmpty(zzahc.zzb())) {
            this.zza.zza.zza(C4267o.a("INTERNAL_SUCCESS_SIGN_OUT"));
            return;
        }
        zzafm zzafm = new zzafm(zzahc.zzb(), zzahc.zza(), Long.valueOf(zzafo.zza(zzahc.zza())), "Bearer");
        zzzm zzzm = this.zza;
        zzzm.zzb.zza(zzafm, (String) null, (String) null, Boolean.FALSE, (C0) null, zzzm.zza, this);
    }
}
