package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: io.invertase.firebase.auth.f  reason: case insensitive filesystem */
public final /* synthetic */ class C6382f implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71213a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71214b;

    public /* synthetic */ C6382f(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71213a = reactNativeFirebaseAuthModule;
        this.f71214b = promise;
    }

    public final void onComplete(Task task) {
        this.f71213a.lambda$linkWithCredential$34(this.f71214b, task);
    }
}
