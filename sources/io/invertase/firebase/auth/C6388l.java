package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: io.invertase.firebase.auth.l  reason: case insensitive filesystem */
public final /* synthetic */ class C6388l implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71225a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71226b;

    public /* synthetic */ C6388l(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71225a = reactNativeFirebaseAuthModule;
        this.f71226b = promise;
    }

    public final void onComplete(Task task) {
        this.f71225a.lambda$getIdToken$45(this.f71226b, task);
    }
}
