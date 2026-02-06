package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class U implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71190a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71191b;

    public /* synthetic */ U(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71190a = reactNativeFirebaseAuthModule;
        this.f71191b = promise;
    }

    public final void onComplete(Task task) {
        this.f71190a.lambda$confirmPasswordReset$31(this.f71191b, task);
    }
}
