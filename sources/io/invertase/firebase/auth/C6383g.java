package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.C4791i;

/* renamed from: io.invertase.firebase.auth.g  reason: case insensitive filesystem */
public final /* synthetic */ class C6383g implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71215a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71216b;

    public /* synthetic */ C6383g(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71215a = reactNativeFirebaseAuthModule;
        this.f71216b = promise;
    }

    public final void onSuccess(Object obj) {
        this.f71215a.lambda$signInWithProvider$23(this.f71216b, (C4791i) obj);
    }
}
