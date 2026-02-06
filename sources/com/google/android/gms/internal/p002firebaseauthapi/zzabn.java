package com.google.android.gms.internal.p002firebaseauthapi;

import Db.C4258f;
import Db.k0;
import Db.y0;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C4791i;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabn  reason: invalid package */
final class zzabn extends zzacz<C4791i, k0> {
    private final zzagx zzy;

    public zzabn(String str, String str2) {
        super(2);
        C4536s.g(str, "token cannot be null or empty");
        this.zzy = new zzagx(str, str2);
    }

    public final String zza() {
        return "signInWithCustomToken";
    }

    public final void zzb() {
        C4258f zza = zzaak.zza(this.zzc, this.zzk);
        ((k0) this.zze).a(this.zzj, zza);
        zzb(new y0(zza));
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaci) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaci.zza(this.zzy, (zzacg) this.zzb);
    }
}
