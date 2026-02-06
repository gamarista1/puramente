package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: io.invertase.firebase.auth.n  reason: case insensitive filesystem */
public final /* synthetic */ class C6390n implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71230a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71231b;

    public /* synthetic */ C6390n(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71230a = reactNativeFirebaseAuthModule;
        this.f71231b = promise;
    }

    public final void onComplete(Task task) {
        this.f71230a.lambda$delete$14(this.f71231b, task);
    }
}
