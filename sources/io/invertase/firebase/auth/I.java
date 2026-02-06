package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class I implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71155a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71156b;

    public /* synthetic */ I(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71155a = reactNativeFirebaseAuthModule;
        this.f71156b = promise;
    }

    public final void onComplete(Task task) {
        this.f71155a.lambda$unlink$39(this.f71156b, task);
    }
}
