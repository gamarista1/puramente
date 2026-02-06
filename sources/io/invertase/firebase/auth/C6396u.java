package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: io.invertase.firebase.auth.u  reason: case insensitive filesystem */
public final /* synthetic */ class C6396u implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71244a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71245b;

    public /* synthetic */ C6396u(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71244a = reactNativeFirebaseAuthModule;
        this.f71245b = promise;
    }

    public final void onComplete(Task task) {
        this.f71244a.lambda$finalizeMultiFactorEnrollment$28(this.f71245b, task);
    }
}
