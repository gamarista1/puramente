package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public final /* synthetic */ class L implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71161a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f71162b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Promise f71163c;

    public /* synthetic */ L(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, FirebaseAuth firebaseAuth, Promise promise) {
        this.f71161a = reactNativeFirebaseAuthModule;
        this.f71162b = firebaseAuth;
        this.f71163c = promise;
    }

    public final void onComplete(Task task) {
        this.f71161a.lambda$updateProfile$21(this.f71162b, this.f71163c, task);
    }
}
