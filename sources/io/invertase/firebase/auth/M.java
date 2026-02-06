package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.C4791i;

public final /* synthetic */ class M implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71164a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71165b;

    public /* synthetic */ M(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71164a = reactNativeFirebaseAuthModule;
        this.f71165b = promise;
    }

    public final void onSuccess(Object obj) {
        this.f71164a.lambda$signInWithCustomToken$10(this.f71165b, (C4791i) obj);
    }
}
