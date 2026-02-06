package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnFailureListener;

public final /* synthetic */ class H implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71153a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71154b;

    public /* synthetic */ H(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71153a = reactNativeFirebaseAuthModule;
        this.f71154b = promise;
    }

    public final void onFailure(Exception exc) {
        this.f71153a.lambda$linkWithProvider$36(this.f71154b, exc);
    }
}
