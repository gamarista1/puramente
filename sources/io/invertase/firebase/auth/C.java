package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public final /* synthetic */ class C implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71140a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f71141b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Promise f71142c;

    public /* synthetic */ C(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, FirebaseAuth firebaseAuth, Promise promise) {
        this.f71140a = reactNativeFirebaseAuthModule;
        this.f71141b = firebaseAuth;
        this.f71142c = promise;
    }

    public final void onComplete(Task task) {
        this.f71140a.lambda$sendEmailVerification$16(this.f71141b, this.f71142c, task);
    }
}
