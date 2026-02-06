package com.google.firebase.auth;

import Db.C4251a;
import com.google.firebase.auth.FirebaseAuth;
import nc.C5116b;

final class R0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f56968a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C5116b f56969b;

    R0(FirebaseAuth firebaseAuth, C5116b bVar) {
        this.f56968a = firebaseAuth;
        this.f56969b = bVar;
    }

    public final void run() {
        for (C4251a a10 : this.f56968a.f56879c) {
            a10.a(this.f56969b);
        }
        for (FirebaseAuth.b a11 : this.f56968a.f56878b) {
            a11.a(this.f56968a);
        }
    }
}
