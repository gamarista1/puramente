package io.invertase.firebase.config;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class d implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseConfigModule f71274a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71275b;

    public /* synthetic */ d(ReactNativeFirebaseConfigModule reactNativeFirebaseConfigModule, Promise promise) {
        this.f71274a = reactNativeFirebaseConfigModule;
        this.f71275b = promise;
    }

    public final void onComplete(Task task) {
        this.f71274a.lambda$fetchAndActivate$2(this.f71275b, task);
    }
}
