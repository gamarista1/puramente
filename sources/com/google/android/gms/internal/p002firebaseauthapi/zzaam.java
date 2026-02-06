package com.google.android.gms.internal.p002firebaseauthapi;

import Db.k0;
import Db.t0;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C4781d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaam  reason: invalid package */
final class zzaam extends zzacz<C4781d, k0> {
    private final String zzy;
    private final String zzz;

    public zzaam(String str, String str2) {
        super(4);
        C4536s.g(str, "code cannot be null or empty");
        this.zzy = str;
        this.zzz = str2;
    }

    public final String zza() {
        return "checkActionCode";
    }

    public final void zzb() {
        zzb(new t0(this.zzm));
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaci) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaci.zzd(this.zzy, this.zzz, this.zzb);
    }
}
