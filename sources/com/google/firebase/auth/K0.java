package com.google.firebase.auth;

import com.google.android.gms.common.internal.C4536s;
import com.google.firebase.auth.Q;
import ub.m;

final class K0 extends Q.b {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Q.b f56915a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f56916b;

    K0(FirebaseAuth firebaseAuth, Q.b bVar) {
        this.f56915a = bVar;
        this.f56916b = firebaseAuth;
    }

    public final void onCodeAutoRetrievalTimeOut(String str) {
    }

    public final void onCodeSent(String str, Q.a aVar) {
        this.f56915a.onVerificationCompleted(Q.a(str, (String) C4536s.l(this.f56916b.f56883g.e())));
    }

    public final void onVerificationCompleted(O o10) {
        this.f56915a.onVerificationCompleted(o10);
    }

    public final void onVerificationFailed(m mVar) {
        this.f56915a.onVerificationFailed(mVar);
    }
}
