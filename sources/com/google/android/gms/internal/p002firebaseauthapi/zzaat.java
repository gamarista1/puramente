package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaat  reason: invalid package */
final class zzaat extends zzacz<zzafn, Void> {
    private final zzxz zzy;

    public zzaat(String str, String str2) {
        super(10);
        C4536s.f(str2);
        this.zzy = new zzxz(str, str2);
    }

    public final String zza() {
        return "getRecaptchaConfig";
    }

    public final void zzb() {
        zzb(this.zzt);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaci) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaci.zza(this.zzy, (zzacg) this.zzb);
    }
}
