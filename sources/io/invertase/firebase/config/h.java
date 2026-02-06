package io.invertase.firebase.config;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class h implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseConfigModule f71282a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71283b;

    public /* synthetic */ h(ReactNativeFirebaseConfigModule reactNativeFirebaseConfigModule, Promise promise) {
        this.f71282a = reactNativeFirebaseConfigModule;
        this.f71283b = promise;
    }

    public final void onComplete(Task task) {
        this.f71282a.lambda$setDefaultsFromResource$6(this.f71283b, task);
    }
}
