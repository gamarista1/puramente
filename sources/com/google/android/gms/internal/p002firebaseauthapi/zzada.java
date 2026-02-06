package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.Q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzada  reason: invalid package */
final class zzada implements zzadh {
    private final /* synthetic */ String zza;

    zzada(zzadb zzadb, String str) {
        this.zza = str;
    }

    public final void zza(Q.b bVar, Object... objArr) {
        bVar.onCodeSent(this.zza, Q.a.o0());
    }
}
