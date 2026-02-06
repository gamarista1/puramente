package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

final class Q0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth.a f56966a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f56967b;

    Q0(FirebaseAuth firebaseAuth, FirebaseAuth.a aVar) {
        this.f56966a = aVar;
        this.f56967b = firebaseAuth;
    }

    public final void run() {
        this.f56966a.a(this.f56967b);
    }
}
