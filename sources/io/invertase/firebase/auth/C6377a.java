package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: io.invertase.firebase.auth.a  reason: case insensitive filesystem */
public final /* synthetic */ class C6377a implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71201a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f71202b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Promise f71203c;

    public /* synthetic */ C6377a(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, FirebaseAuth firebaseAuth, Promise promise) {
        this.f71201a = reactNativeFirebaseAuthModule;
        this.f71202b = firebaseAuth;
        this.f71203c = promise;
    }

    public final void onComplete(Task task) {
        this.f71201a.lambda$applyActionCode$32(this.f71202b, this.f71203c, task);
    }
}
