package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class F implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71148a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71149b;

    public /* synthetic */ F(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71148a = reactNativeFirebaseAuthModule;
        this.f71149b = promise;
    }

    public final void onComplete(Task task) {
        this.f71148a.lambda$sendPasswordResetEmail$12(this.f71149b, task);
    }
}
