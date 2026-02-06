package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.O;
import com.google.firebase.auth.Q;
import ub.m;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadv  reason: invalid package */
final class zzadv extends Q.b {
    private final /* synthetic */ Q.b zza;
    private final /* synthetic */ String zzb;

    zzadv(Q.b bVar, String str) {
        this.zza = bVar;
        this.zzb = str;
    }

    public final void onCodeAutoRetrievalTimeOut(String str) {
        zzads.zza.remove(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    public final void onCodeSent(String str, Q.a aVar) {
        this.zza.onCodeSent(str, aVar);
    }

    public final void onVerificationCompleted(O o10) {
        zzads.zza.remove(this.zzb);
        this.zza.onVerificationCompleted(o10);
    }

    public final void onVerificationFailed(m mVar) {
        zzads.zza.remove(this.zzb);
        this.zza.onVerificationFailed(mVar);
    }
}
