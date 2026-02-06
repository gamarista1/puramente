package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: io.invertase.firebase.auth.c  reason: case insensitive filesystem */
public final /* synthetic */ class C6379c implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71206a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71207b;

    public /* synthetic */ C6379c(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71206a = reactNativeFirebaseAuthModule;
        this.f71207b = promise;
    }

    public final void onComplete(Task task) {
        this.f71206a.lambda$confirmationResultConfirm$30(this.f71207b, task);
    }
}
