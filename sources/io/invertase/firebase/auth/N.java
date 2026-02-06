package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnFailureListener;

public final /* synthetic */ class N implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71166a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71167b;

    public /* synthetic */ N(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71166a = reactNativeFirebaseAuthModule;
        this.f71167b = promise;
    }

    public final void onFailure(Exception exc) {
        this.f71166a.lambda$signInWithCustomToken$11(this.f71167b, exc);
    }
}
