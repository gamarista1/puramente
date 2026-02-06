package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C4783e;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacb  reason: invalid package */
final class zzacb extends zzacz<Void, Void> {
    private final zzyk zzy;

    public zzacb(String str, String str2, C4783e eVar) {
        super(6);
        C4536s.f(str);
        C4536s.f(str2);
        C4536s.l(eVar);
        this.zzy = new zzyk(str, str2, eVar);
    }

    public final String zza() {
        return "verifyBeforeUpdateEmail";
    }

    public final void zzb() {
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaci) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaci.zza(this.zzy, (zzacg) this.zzb);
    }
}
