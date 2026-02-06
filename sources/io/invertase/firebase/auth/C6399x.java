package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: io.invertase.firebase.auth.x  reason: case insensitive filesystem */
public final /* synthetic */ class C6399x implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule f71251a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71252b;

    public /* synthetic */ C6399x(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise) {
        this.f71251a = reactNativeFirebaseAuthModule;
        this.f71252b = promise;
    }

    public final void onComplete(Task task) {
        this.f71251a.lambda$getIdTokenResult$46(this.f71252b, task);
    }
}
