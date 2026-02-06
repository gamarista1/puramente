package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.C4791i;

/* renamed from: io.invertase.firebase.auth.p  reason: case insensitive filesystem */
public final /* synthetic */ class C6392p implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71234a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71235b;

    public /* synthetic */ C6392p(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71234a = reactNativeFirebaseAuthModule;
        this.f71235b = promise;
    }

    public final void onSuccess(Object obj) {
        this.f71234a.lambda$reauthenticateWithProvider$41(this.f71235b, (C4791i) obj);
    }
}
