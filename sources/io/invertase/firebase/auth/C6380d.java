package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: io.invertase.firebase.auth.d  reason: case insensitive filesystem */
public final /* synthetic */ class C6380d implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71208a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71209b;

    public /* synthetic */ C6380d(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71208a = reactNativeFirebaseAuthModule;
        this.f71209b = promise;
    }

    public final void onComplete(Task task) {
        this.f71208a.lambda$verifyPasswordResetCode$48(this.f71209b, task);
    }
}
