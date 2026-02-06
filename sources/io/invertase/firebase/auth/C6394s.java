package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnFailureListener;

/* renamed from: io.invertase.firebase.auth.s  reason: case insensitive filesystem */
public final /* synthetic */ class C6394s implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71240a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71241b;

    public /* synthetic */ C6394s(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71240a = reactNativeFirebaseAuthModule;
        this.f71241b = promise;
    }

    public final void onFailure(Exception exc) {
        this.f71240a.lambda$reauthenticateWithProvider$44(this.f71241b, exc);
    }
}
