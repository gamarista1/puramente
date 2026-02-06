package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class V implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71192a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71193b;

    public /* synthetic */ V(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71192a = reactNativeFirebaseAuthModule;
        this.f71193b = promise;
    }

    public final void onComplete(Task task) {
        this.f71192a.lambda$signInWithCredential$22(this.f71193b, task);
    }
}
