package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: io.invertase.firebase.auth.v  reason: case insensitive filesystem */
public final /* synthetic */ class C6397v implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71246a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f71247b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Promise f71248c;

    public /* synthetic */ C6397v(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, FirebaseAuth firebaseAuth, Promise promise) {
        this.f71246a = reactNativeFirebaseAuthModule;
        this.f71247b = firebaseAuth;
        this.f71248c = promise;
    }

    public final void onComplete(Task task) {
        this.f71246a.lambda$reload$15(this.f71247b, this.f71248c, task);
    }
}
