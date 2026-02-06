package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.Q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacd  reason: invalid package */
final class zzacd extends zzacz<Void, Q.b> {
    private final zzyd zzy;

    public zzacd(zzagd zzagd) {
        super(8);
        C4536s.l(zzagd);
        this.zzy = new zzyd(zzagd);
    }

    public final String zza() {
        return "verifyPhoneNumber";
    }

    public final void zzb() {
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaci) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaci.zza(this.zzy, (zzacg) this.zzb);
    }
}
