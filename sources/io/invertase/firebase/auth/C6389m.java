package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: io.invertase.firebase.auth.m  reason: case insensitive filesystem */
public final /* synthetic */ class C6389m implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71227a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f71228b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Promise f71229c;

    public /* synthetic */ C6389m(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, FirebaseAuth firebaseAuth, Promise promise) {
        this.f71227a = reactNativeFirebaseAuthModule;
        this.f71228b = firebaseAuth;
        this.f71229c = promise;
    }

    public final void onComplete(Task task) {
        this.f71227a.lambda$updatePassword$19(this.f71228b, this.f71229c, task);
    }
}
