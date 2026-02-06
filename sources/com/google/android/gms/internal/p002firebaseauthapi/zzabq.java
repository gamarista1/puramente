package com.google.android.gms.internal.p002firebaseauthapi;

import Db.C4258f;
import Db.k0;
import Db.y0;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C4791i;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabq  reason: invalid package */
final class zzabq extends zzacz<C4791i, k0> {
    private final String zzaa;
    private final String zzab;
    private final String zzy;
    private final String zzz;

    public zzabq(String str, String str2, String str3, String str4) {
        super(2);
        C4536s.g(str, "email cannot be null or empty");
        C4536s.g(str2, "password cannot be null or empty");
        this.zzy = str;
        this.zzz = str2;
        this.zzaa = str3;
        this.zzab = str4;
    }

    public final String zza() {
        return "signInWithEmailAndPassword";
    }

    public final void zzb() {
        C4258f zza = zzaak.zza(this.zzc, this.zzk);
        ((k0) this.zze).a(this.zzj, zza);
        zzb(new y0(zza));
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaci) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaci.zzb(this.zzy, this.zzz, this.zzaa, this.zzab, this.zzb);
    }
}
