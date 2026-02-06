package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.C4791i;

/* renamed from: io.invertase.firebase.auth.w  reason: case insensitive filesystem */
public final /* synthetic */ class C6398w implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71249a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71250b;

    public /* synthetic */ C6398w(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71249a = reactNativeFirebaseAuthModule;
        this.f71250b = promise;
    }

    public final void onSuccess(Object obj) {
        this.f71249a.lambda$linkWithProvider$35(this.f71250b, (C4791i) obj);
    }
}
