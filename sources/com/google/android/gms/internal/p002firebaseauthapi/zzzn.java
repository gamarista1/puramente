package com.google.android.gms.internal.p002firebaseauthapi;

import Db.C4267o;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzn  reason: invalid package */
final class zzzn implements zzadm<zzagi> {
    private final /* synthetic */ zzagj zza;
    private final /* synthetic */ zzacf zzb;

    zzzn(zzyl zzyl, zzagj zzagj, zzacf zzacf) {
        this.zza = zzagj;
        this.zzb = zzacf;
    }

    public final void zza(String str) {
        this.zzb.zza(C4267o.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzagi zzagi = (zzagi) obj;
        zzagj zzagj = this.zza;
        if (zzagj instanceof zzagn) {
            this.zzb.zzb(zzagi.zza());
        } else if (zzagj instanceof zzagp) {
            this.zzb.zza(zzagi);
        } else {
            String name = this.zza.getClass().getName();
            throw new IllegalArgumentException("startMfaEnrollmentRequest must be an instance of either StartPhoneMfaEnrollmentRequest or StartTotpMfaEnrollmentRequest but was " + name + ".");
        }
    }
}
