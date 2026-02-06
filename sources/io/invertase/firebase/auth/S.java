package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.C4791i;

public final /* synthetic */ class S implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71186a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71187b;

    public /* synthetic */ S(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71186a = reactNativeFirebaseAuthModule;
        this.f71187b = promise;
    }

    public final void onSuccess(Object obj) {
        this.f71186a.lambda$linkWithProvider$37(this.f71187b, (C4791i) obj);
    }
}
