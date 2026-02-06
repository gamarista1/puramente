package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class Q implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71172a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71173b;

    public /* synthetic */ Q(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71172a = reactNativeFirebaseAuthModule;
        this.f71173b = promise;
    }

    public final void onComplete(Task task) {
        this.f71172a.lambda$resolveMultiFactorCredential$29(this.f71173b, task);
    }
}
