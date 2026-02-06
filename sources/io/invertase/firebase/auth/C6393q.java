package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnFailureListener;

/* renamed from: io.invertase.firebase.auth.q  reason: case insensitive filesystem */
public final /* synthetic */ class C6393q implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71236a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71237b;

    public /* synthetic */ C6393q(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71236a = reactNativeFirebaseAuthModule;
        this.f71237b = promise;
    }

    public final void onFailure(Exception exc) {
        this.f71236a.lambda$reauthenticateWithProvider$42(this.f71237b, exc);
    }
}
