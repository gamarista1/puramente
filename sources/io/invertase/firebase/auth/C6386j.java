package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnFailureListener;

/* renamed from: io.invertase.firebase.auth.j  reason: case insensitive filesystem */
public final /* synthetic */ class C6386j implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71221a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71222b;

    public /* synthetic */ C6386j(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71221a = reactNativeFirebaseAuthModule;
        this.f71222b = promise;
    }

    public final void onFailure(Exception exc) {
        this.f71221a.lambda$signInWithProvider$26(this.f71222b, exc);
    }
}
