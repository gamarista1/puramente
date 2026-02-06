package com.google.android.gms.internal.p002firebaseauthapi;

import Db.C4267o;
import com.google.firebase.auth.C4780c0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaae  reason: invalid package */
final class zzaae implements zzadm<zzafm> {
    private final /* synthetic */ C4780c0 zza;
    private final /* synthetic */ zzacf zzb;
    private final /* synthetic */ zzyl zzc;

    zzaae(zzyl zzyl, C4780c0 c0Var, zzacf zzacf) {
        this.zza = c0Var;
        this.zzb = zzacf;
        this.zzc = zzyl;
    }

    public final void zza(String str) {
        this.zzb.zza(C4267o.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzafm zzafm = (zzafm) obj;
        zzagf zzagf = new zzagf();
        zzagf.zzd(zzafm.zzc());
        if (this.zza.p0() || this.zza.g() != null) {
            zzagf.zzb(this.zza.g());
        }
        if (this.zza.zzc() || this.zza.o0() != null) {
            zzagf.zzg(this.zza.zza());
        }
        zzyl.zza(this.zzc, this.zzb, zzafm, zzagf, (zzadn) this);
    }
}
