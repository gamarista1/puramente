package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.C4791i;

public final /* synthetic */ class J implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71157a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71158b;

    public /* synthetic */ J(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71157a = reactNativeFirebaseAuthModule;
        this.f71158b = promise;
    }

    public final void onSuccess(Object obj) {
        this.f71157a.lambda$signInWithEmailAndPassword$6(this.f71158b, (C4791i) obj);
    }
}
