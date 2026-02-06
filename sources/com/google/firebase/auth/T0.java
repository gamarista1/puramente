package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

final class T0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f56972a;

    T0(FirebaseAuth firebaseAuth) {
        this.f56972a = firebaseAuth;
    }

    public final void run() {
        for (FirebaseAuth.a a10 : this.f56972a.f56880d) {
            a10.a(this.f56972a);
        }
    }
}
