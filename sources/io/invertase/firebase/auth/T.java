package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnFailureListener;

public final /* synthetic */ class T implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71188a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71189b;

    public /* synthetic */ T(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71188a = reactNativeFirebaseAuthModule;
        this.f71189b = promise;
    }

    public final void onFailure(Exception exc) {
        this.f71188a.lambda$linkWithProvider$38(this.f71189b, exc);
    }
}
