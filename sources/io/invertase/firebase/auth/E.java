package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class E implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71146a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71147b;

    public /* synthetic */ E(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71146a = reactNativeFirebaseAuthModule;
        this.f71147b = promise;
    }

    public final void onComplete(Task task) {
        this.f71146a.lambda$reauthenticateWithCredential$40(this.f71147b, task);
    }
}
