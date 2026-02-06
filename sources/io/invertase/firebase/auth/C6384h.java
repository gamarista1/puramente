package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnFailureListener;

/* renamed from: io.invertase.firebase.auth.h  reason: case insensitive filesystem */
public final /* synthetic */ class C6384h implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71217a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71218b;

    public /* synthetic */ C6384h(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71217a = reactNativeFirebaseAuthModule;
        this.f71218b = promise;
    }

    public final void onFailure(Exception exc) {
        this.f71217a.lambda$signInWithProvider$24(this.f71218b, exc);
    }
}
