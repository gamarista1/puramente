package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.C4791i;

public final /* synthetic */ class O implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71168a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71169b;

    public /* synthetic */ O(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71168a = reactNativeFirebaseAuthModule;
        this.f71169b = promise;
    }

    public final void onSuccess(Object obj) {
        this.f71168a.lambda$signInAnonymously$2(this.f71169b, (C4791i) obj);
    }
}
