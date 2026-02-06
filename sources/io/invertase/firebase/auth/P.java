package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnFailureListener;

public final /* synthetic */ class P implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71170a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71171b;

    public /* synthetic */ P(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71170a = reactNativeFirebaseAuthModule;
        this.f71171b = promise;
    }

    public final void onFailure(Exception exc) {
        this.f71170a.lambda$signInAnonymously$3(this.f71171b, exc);
    }
}
