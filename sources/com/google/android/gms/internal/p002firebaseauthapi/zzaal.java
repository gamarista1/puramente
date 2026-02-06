package com.google.android.gms.internal.p002firebaseauthapi;

import Db.k0;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaal  reason: invalid package */
final class zzaal extends zzacz<Void, k0> {
    private final zzxx zzy;

    public zzaal(String str, String str2, String str3) {
        super(4);
        C4536s.g(str, "code cannot be null or empty");
        C4536s.g(str2, "new password cannot be null or empty");
        this.zzy = new zzxx(str, str2, str3);
    }

    public final String zza() {
        return "confirmPasswordReset";
    }

    public final void zzb() {
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaci) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaci.zza(this.zzy, (zzacg) this.zzb);
    }
}
