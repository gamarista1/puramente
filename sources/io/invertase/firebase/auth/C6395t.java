package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: io.invertase.firebase.auth.t  reason: case insensitive filesystem */
public final /* synthetic */ class C6395t implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71242a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71243b;

    public /* synthetic */ C6395t(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71242a = reactNativeFirebaseAuthModule;
        this.f71243b = promise;
    }

    public final void onComplete(Task task) {
        this.f71242a.lambda$fetchSignInMethodsForEmail$47(this.f71243b, task);
    }
}
