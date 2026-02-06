package io.invertase.firebase.config;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class g implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseConfigModule f71280a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71281b;

    public /* synthetic */ g(ReactNativeFirebaseConfigModule reactNativeFirebaseConfigModule, Promise promise) {
        this.f71280a = reactNativeFirebaseConfigModule;
        this.f71281b = promise;
    }

    public final void onComplete(Task task) {
        this.f71280a.lambda$ensureInitialized$7(this.f71281b, task);
    }
}
