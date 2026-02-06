package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnFailureListener;

public final /* synthetic */ class A implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71136a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71137b;

    public /* synthetic */ A(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71136a = reactNativeFirebaseAuthModule;
        this.f71137b = promise;
    }

    public final void onFailure(Exception exc) {
        this.f71136a.lambda$createUserWithEmailAndPassword$5(this.f71137b, exc);
    }
}
