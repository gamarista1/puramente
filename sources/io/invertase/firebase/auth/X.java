package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.C4791i;

public final /* synthetic */ class X implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71196a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71197b;

    public /* synthetic */ X(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71196a = reactNativeFirebaseAuthModule;
        this.f71197b = promise;
    }

    public final void onSuccess(Object obj) {
        this.f71196a.lambda$signInWithEmailLink$8(this.f71197b, (C4791i) obj);
    }
}
