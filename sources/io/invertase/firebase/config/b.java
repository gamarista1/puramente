package io.invertase.firebase.config;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class b implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseConfigModule f71270a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71271b;

    public /* synthetic */ b(ReactNativeFirebaseConfigModule reactNativeFirebaseConfigModule, Promise promise) {
        this.f71270a = reactNativeFirebaseConfigModule;
        this.f71271b = promise;
    }

    public final void onComplete(Task task) {
        this.f71270a.lambda$activate$0(this.f71271b, task);
    }
}
