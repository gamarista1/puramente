package com.google.android.gms.internal.p002firebaseauthapi;

import Db.C4265m;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabu  reason: invalid package */
final class zzabu extends zzacz<zzagi, Void> {
    private final zzagp zzy;

    public zzabu(C4265m mVar, String str) {
        super(12);
        C4536s.l(mVar);
        this.zzy = zzagp.zza(C4536s.f(mVar.q0()), str);
    }

    public final String zza() {
        return "startMfaEnrollment";
    }

    public final void zzb() {
        zzb(this.zzv);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaci) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaci.zza(this.zzy, (zzacg) this.zzb);
    }
}
