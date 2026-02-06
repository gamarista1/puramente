package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.C4791i;

public final /* synthetic */ class r implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71238a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71239b;

    public /* synthetic */ r(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71238a = reactNativeFirebaseAuthModule;
        this.f71239b = promise;
    }

    public final void onSuccess(Object obj) {
        this.f71238a.lambda$reauthenticateWithProvider$43(this.f71239b, (C4791i) obj);
    }
}
