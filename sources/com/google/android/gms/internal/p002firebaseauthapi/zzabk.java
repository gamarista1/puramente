package com.google.android.gms.internal.p002firebaseauthapi;

import Db.k0;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C4783e;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabk  reason: invalid package */
final class zzabk extends zzacz<Void, k0> {
    private final zzyb zzy;

    public zzabk(String str, C4783e eVar) {
        super(6);
        C4536s.g(str, "token cannot be null or empty");
        this.zzy = new zzyb(str, eVar);
    }

    public final String zza() {
        return "sendEmailVerification";
    }

    public final void zzb() {
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaci) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaci.zza(this.zzy, (zzacg) this.zzb);
    }
}
