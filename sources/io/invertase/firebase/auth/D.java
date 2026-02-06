package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public final /* synthetic */ class D implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71143a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f71144b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Promise f71145c;

    public /* synthetic */ D(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, FirebaseAuth firebaseAuth, Promise promise) {
        this.f71143a = reactNativeFirebaseAuthModule;
        this.f71144b = firebaseAuth;
        this.f71145c = promise;
    }

    public final void onComplete(Task task) {
        this.f71143a.lambda$updateEmail$18(this.f71144b, this.f71145c, task);
    }
}
