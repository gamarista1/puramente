package com.google.android.gms.internal.p002firebaseauthapi;

import Db.k0;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.O;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabz  reason: invalid package */
final class zzabz extends zzacz<Void, k0> {
    private final O zzy;

    public zzabz(O o10) {
        super(2);
        this.zzy = (O) C4536s.l(o10);
    }

    public final String zza() {
        return "updatePhoneNumber";
    }

    public final void zzb() {
        ((k0) this.zze).a(this.zzj, zzaak.zza(this.zzc, this.zzk));
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaci) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaci.zza(new zzyc(this.zzd.zze(), this.zzy), (zzacg) this.zzb);
    }
}
