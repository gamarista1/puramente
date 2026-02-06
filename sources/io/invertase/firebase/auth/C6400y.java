package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: io.invertase.firebase.auth.y  reason: case insensitive filesystem */
public final /* synthetic */ class C6400y implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71253a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71254b;

    public /* synthetic */ C6400y(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71253a = reactNativeFirebaseAuthModule;
        this.f71254b = promise;
    }

    public final void onComplete(Task task) {
        this.f71253a.lambda$sendSignInLinkToEmail$13(this.f71254b, task);
    }
}
