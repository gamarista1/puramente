package com.google.android.gms.internal.p002firebaseauthapi;

import Db.C4258f;
import Db.k0;
import Db.y0;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C4791i;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabv  reason: invalid package */
final class zzabv extends zzacz<C4791i, k0> {
    public zzabv() {
        super(2);
    }

    public final String zza() {
        return "unlinkEmailCredential";
    }

    public final void zzb() {
        C4258f zza = zzaak.zza(this.zzc, this.zzk);
        ((k0) this.zze).a(this.zzj, zza);
        zzb(new y0(zza));
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaci) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaci.zze(this.zzd.zze(), this.zzb);
    }
}
