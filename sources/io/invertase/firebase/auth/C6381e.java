package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: io.invertase.firebase.auth.e  reason: case insensitive filesystem */
public final /* synthetic */ class C6381e implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71210a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f71211b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Promise f71212c;

    public /* synthetic */ C6381e(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, FirebaseAuth firebaseAuth, Promise promise) {
        this.f71210a = reactNativeFirebaseAuthModule;
        this.f71211b = firebaseAuth;
        this.f71212c = promise;
    }

    public final void onComplete(Task task) {
        this.f71210a.lambda$updatePhoneNumber$20(this.f71211b, this.f71212c, task);
    }
}
