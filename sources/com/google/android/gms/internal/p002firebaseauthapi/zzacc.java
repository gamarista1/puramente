package com.google.android.gms.internal.p002firebaseauthapi;

import Db.k0;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C4780c0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacc  reason: invalid package */
final class zzacc extends zzacz<Void, k0> {
    private final C4780c0 zzy;

    public zzacc(C4780c0 c0Var) {
        super(2);
        this.zzy = (C4780c0) C4536s.m(c0Var, "request cannot be null");
    }

    public final String zza() {
        return "updateProfile";
    }

    public final void zzb() {
        ((k0) this.zze).a(this.zzj, zzaak.zza(this.zzc, this.zzk));
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaci) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaci.zza(this.zzd.zze(), this.zzy, (zzacg) this.zzb);
    }
}
