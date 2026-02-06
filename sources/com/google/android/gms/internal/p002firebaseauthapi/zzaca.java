package com.google.android.gms.internal.p002firebaseauthapi;

import Db.k0;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaca  reason: invalid package */
final class zzaca extends zzacz<Void, k0> {
    private final String zzy;

    public zzaca(String str) {
        super(2);
        this.zzy = C4536s.g(str, "password cannot be null or empty");
    }

    public final String zza() {
        return "updatePassword";
    }

    public final void zzb() {
        ((k0) this.zze).a(this.zzj, zzaak.zza(this.zzc, this.zzk));
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaci) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaci.zzc(this.zzd.zze(), this.zzy, this.zzb);
    }
}
