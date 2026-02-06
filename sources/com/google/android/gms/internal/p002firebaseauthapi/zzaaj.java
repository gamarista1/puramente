package com.google.android.gms.internal.p002firebaseauthapi;

import Db.k0;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaaj  reason: invalid package */
final class zzaaj extends zzacz<Void, k0> {
    private final String zzy;
    private final String zzz;

    public zzaaj(String str, String str2) {
        super(7);
        C4536s.g(str, "code cannot be null or empty");
        this.zzy = str;
        this.zzz = str2;
    }

    public final String zza() {
        return "applyActionCode";
    }

    public final void zzb() {
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaci) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaci.zza(this.zzy, this.zzz, (zzacg) this.zzb);
    }
}
