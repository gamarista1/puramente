package io.invertase.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

public final /* synthetic */ class W implements FirebaseAuth.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71194a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f71195b;

    public /* synthetic */ W(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, String str) {
        this.f71194a = reactNativeFirebaseAuthModule;
        this.f71195b = str;
    }

    public final void a(FirebaseAuth firebaseAuth) {
        this.f71194a.lambda$addIdTokenListener$1(this.f71195b, firebaseAuth);
    }
}
