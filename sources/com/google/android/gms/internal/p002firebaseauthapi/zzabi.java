package com.google.android.gms.internal.p002firebaseauthapi;

import Db.k0;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabi  reason: invalid package */
final class zzabi extends zzacz<Void, k0> {
    public zzabi() {
        super(2);
    }

    public final String zza() {
        return "reload";
    }

    public final void zzb() {
        ((k0) this.zze).a(this.zzj, zzaak.zza(this.zzc, this.zzk));
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaci) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaci.zzc(this.zzd.zze(), this.zzb);
    }
}
