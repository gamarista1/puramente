package io.invertase.firebase.config;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class e implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseConfigModule f71276a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71277b;

    public /* synthetic */ e(ReactNativeFirebaseConfigModule reactNativeFirebaseConfigModule, Promise promise) {
        this.f71276a = reactNativeFirebaseConfigModule;
        this.f71277b = promise;
    }

    public final void onComplete(Task task) {
        this.f71276a.lambda$fetch$1(this.f71277b, task);
    }
}
