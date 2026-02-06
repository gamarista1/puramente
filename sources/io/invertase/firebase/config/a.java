package io.invertase.firebase.config;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class a implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseConfigModule f71268a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71269b;

    public /* synthetic */ a(ReactNativeFirebaseConfigModule reactNativeFirebaseConfigModule, Promise promise) {
        this.f71268a = reactNativeFirebaseConfigModule;
        this.f71269b = promise;
    }

    public final void onComplete(Task task) {
        this.f71268a.lambda$reset$3(this.f71269b, task);
    }
}
