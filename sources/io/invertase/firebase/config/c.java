package io.invertase.firebase.config;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class c implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseConfigModule f71272a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71273b;

    public /* synthetic */ c(ReactNativeFirebaseConfigModule reactNativeFirebaseConfigModule, Promise promise) {
        this.f71272a = reactNativeFirebaseConfigModule;
        this.f71273b = promise;
    }

    public final void onComplete(Task task) {
        this.f71272a.lambda$setConfigSettings$4(this.f71273b, task);
    }
}
