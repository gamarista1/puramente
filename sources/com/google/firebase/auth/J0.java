package com.google.firebase.auth;

import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzach;
import com.google.firebase.auth.Q;
import ub.m;

final class J0 extends Q.b {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ P f56912a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Q.b f56913b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f56914c;

    J0(FirebaseAuth firebaseAuth, P p10, Q.b bVar) {
        this.f56912a = p10;
        this.f56913b = bVar;
        this.f56914c = firebaseAuth;
    }

    public final void onCodeAutoRetrievalTimeOut(String str) {
        this.f56913b.onCodeAutoRetrievalTimeOut(str);
    }

    public final void onCodeSent(String str, Q.a aVar) {
        this.f56913b.onCodeSent(str, aVar);
    }

    public final void onVerificationCompleted(O o10) {
        this.f56913b.onVerificationCompleted(o10);
    }

    public final void onVerificationFailed(m mVar) {
        if (zzach.zza((Exception) mVar)) {
            this.f56912a.c(true);
            String j10 = this.f56912a.j();
            Log.d("FirebaseAuth", "Re-triggering phone verification with Recaptcha flow forced for phone number " + j10);
            FirebaseAuth.h0(this.f56912a);
            return;
        }
        String j11 = this.f56912a.j();
        String message = mVar.getMessage();
        Log.d("FirebaseAuth", "Invoking original failure callbacks after phone verification failure for " + j11 + ", error - " + message);
        this.f56913b.onVerificationFailed(mVar);
    }
}
