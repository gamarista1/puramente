package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.Q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadc  reason: invalid package */
final class zzadc implements zzadh {
    private final /* synthetic */ String zza;

    zzadc(zzadb zzadb, String str) {
        this.zza = str;
    }

    public final void zza(Q.b bVar, Object... objArr) {
        bVar.onCodeAutoRetrievalTimeOut(this.zza);
    }
}
