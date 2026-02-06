package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class B implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71138a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71139b;

    public /* synthetic */ B(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71138a = reactNativeFirebaseAuthModule;
        this.f71139b = promise;
    }

    public final void onComplete(Task task) {
        this.f71138a.lambda$getSession$27(this.f71139b, task);
    }
}
