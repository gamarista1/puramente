package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: io.invertase.firebase.auth.o  reason: case insensitive filesystem */
public final /* synthetic */ class C6391o implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71232a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71233b;

    public /* synthetic */ C6391o(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71232a = reactNativeFirebaseAuthModule;
        this.f71233b = promise;
    }

    public final void onComplete(Task task) {
        this.f71232a.lambda$checkActionCode$33(this.f71233b, task);
    }
}
