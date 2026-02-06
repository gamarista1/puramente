package io.invertase.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

/* renamed from: io.invertase.firebase.auth.k  reason: case insensitive filesystem */
public final /* synthetic */ class C6387k implements FirebaseAuth.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71223a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f71224b;

    public /* synthetic */ C6387k(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, String str) {
        this.f71223a = reactNativeFirebaseAuthModule;
        this.f71224b = str;
    }

    public final void a(FirebaseAuth firebaseAuth) {
        this.f71223a.lambda$addAuthStateListener$0(this.f71224b, firebaseAuth);
    }
}
