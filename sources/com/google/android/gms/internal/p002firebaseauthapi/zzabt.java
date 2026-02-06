package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.Q;
import com.google.firebase.auth.U;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabt  reason: invalid package */
final class zzabt extends zzacz<Void, Q.b> {
    private final zzyh zzy;

    public zzabt(U u10, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, boolean z12) {
        super(8);
        C4536s.l(u10);
        C4536s.f(str);
        this.zzy = new zzyh(u10, str, str2, j10, z10, z11, str3, str4, z12);
    }

    public final String zza() {
        return "startMfaSignInWithPhoneNumber";
    }

    public final void zzb() {
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaci) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaci.zza(this.zzy, (zzacg) this.zzb);
    }
}
