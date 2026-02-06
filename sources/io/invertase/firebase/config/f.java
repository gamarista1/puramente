package io.invertase.firebase.config;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class f implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseConfigModule f71278a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71279b;

    public /* synthetic */ f(ReactNativeFirebaseConfigModule reactNativeFirebaseConfigModule, Promise promise) {
        this.f71278a = reactNativeFirebaseConfigModule;
        this.f71279b = promise;
    }

    public final void onComplete(Task task) {
        this.f71278a.lambda$setDefaults$5(this.f71279b, task);
    }
}
