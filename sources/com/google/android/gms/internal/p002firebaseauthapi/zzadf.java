package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.Q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadf  reason: invalid package */
final class zzadf implements zzadh {
    private final /* synthetic */ Status zza;

    zzadf(zzadb zzadb, Status status) {
        this.zza = status;
    }

    public final void zza(Q.b bVar, Object... objArr) {
        bVar.onVerificationFailed(zzach.zza(this.zza));
    }
}
