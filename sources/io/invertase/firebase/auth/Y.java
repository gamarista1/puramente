package io.invertase.firebase.auth;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.O;
import io.invertase.firebase.auth.ReactNativeFirebaseAuthModule;

public final /* synthetic */ class Y implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseAuthModule.a f71198a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ O f71199b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Promise f71200c;

    public /* synthetic */ Y(ReactNativeFirebaseAuthModule.a aVar, O o10, Promise promise) {
        this.f71198a = aVar;
        this.f71199b = o10;
        this.f71200c = promise;
    }

    public final void onComplete(Task task) {
        this.f71198a.b(this.f71199b, this.f71200c, task);
    }
}
