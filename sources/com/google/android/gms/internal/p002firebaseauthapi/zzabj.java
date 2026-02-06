package com.google.android.gms.internal.p002firebaseauthapi;

import Db.k0;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C4783e;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabj  reason: invalid package */
final class zzabj extends zzacz<Void, k0> {
    private final zzye zzy;
    private final String zzz;

    public zzabj(String str, C4783e eVar, String str2, String str3, String str4) {
        super(4);
        C4536s.g(str, "email cannot be null or empty");
        this.zzy = new zzye(str, eVar, str2, str3);
        this.zzz = str4;
    }

    public final String zza() {
        return this.zzz;
    }

    public final void zzb() {
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaci) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaci.zza(this.zzy, (zzacg) this.zzb);
    }
}
