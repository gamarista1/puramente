package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public final /* synthetic */ class G implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71150a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f71151b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Promise f71152c;

    public /* synthetic */ G(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, FirebaseAuth firebaseAuth, Promise promise) {
        this.f71150a = reactNativeFirebaseAuthModule;
        this.f71151b = firebaseAuth;
        this.f71152c = promise;
    }

    public final void onComplete(Task task) {
        this.f71150a.lambda$verifyBeforeUpdateEmail$17(this.f71151b, this.f71152c, task);
    }
}
