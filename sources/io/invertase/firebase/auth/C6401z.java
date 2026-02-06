package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.C4791i;

/* renamed from: io.invertase.firebase.auth.z  reason: case insensitive filesystem */
public final /* synthetic */ class C6401z implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71255a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71256b;

    public /* synthetic */ C6401z(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71255a = reactNativeFirebaseAuthModule;
        this.f71256b = promise;
    }

    public final void onSuccess(Object obj) {
        this.f71255a.lambda$createUserWithEmailAndPassword$4(this.f71256b, (C4791i) obj);
    }
}
