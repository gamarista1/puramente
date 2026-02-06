package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnFailureListener;

/* renamed from: io.invertase.firebase.auth.b  reason: case insensitive filesystem */
public final /* synthetic */ class C6378b implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71204a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71205b;

    public /* synthetic */ C6378b(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71204a = reactNativeFirebaseAuthModule;
        this.f71205b = promise;
    }

    public final void onFailure(Exception exc) {
        this.f71204a.lambda$signInWithEmailLink$9(this.f71205b, exc);
    }
}
