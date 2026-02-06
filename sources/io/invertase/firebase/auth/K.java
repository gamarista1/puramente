package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnFailureListener;

public final /* synthetic */ class K implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71159a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71160b;

    public /* synthetic */ K(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71159a = reactNativeFirebaseAuthModule;
        this.f71160b = promise;
    }

    public final void onFailure(Exception exc) {
        this.f71159a.lambda$signInWithEmailAndPassword$7(this.f71160b, exc);
    }
}
