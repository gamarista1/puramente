package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.C4791i;

/* renamed from: io.invertase.firebase.auth.i  reason: case insensitive filesystem */
public final /* synthetic */ class C6385i implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71219a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71220b;

    public /* synthetic */ C6385i(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71219a = reactNativeFirebaseAuthModule;
        this.f71220b = promise;
    }

    public final void onSuccess(Object obj) {
        this.f71219a.lambda$signInWithProvider$25(this.f71220b, (C4791i) obj);
    }
}
