package com.google.android.gms.internal.p002firebaseauthapi;

import Db.k0;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabm  reason: invalid package */
final class zzabm extends zzacz<Void, k0> {
    private final zzyg zzy;

    public zzabm(String str) {
        super(9);
        this.zzy = new zzyg(str);
    }

    public final String zza() {
        return "setFirebaseUIVersion";
    }

    public final void zzb() {
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaci) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaci.zza(this.zzy, (zzacg) this.zzb);
    }
}
