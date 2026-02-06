package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

final class F0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth.b f56875a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f56876b;

    F0(FirebaseAuth firebaseAuth, FirebaseAuth.b bVar) {
        this.f56875a = bVar;
        this.f56876b = firebaseAuth;
    }

    public final void run() {
        this.f56875a.a(this.f56876b);
    }
}
