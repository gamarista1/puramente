package com.google.android.gms.internal.p002firebaseauthapi;

import Db.k0;
import Db.t0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzace  reason: invalid package */
final class zzace extends zzacz<String, k0> {
    private final String zzy;
    private final String zzz;

    public zzace(String str, String str2) {
        super(4);
        C4536s.g(str, "code cannot be null or empty");
        this.zzy = str;
        this.zzz = str2;
    }

    public final String zza() {
        return "verifyPasswordResetCode";
    }

    public final void zzb() {
        if (new t0(this.zzm).b() != 0) {
            zza(new Status(17499));
        } else {
            zzb(this.zzm.zzb());
        }
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaci) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaci.zzd(this.zzy, this.zzz, this.zzb);
    }
}
