package io.invertase.firebase.analytics;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class f implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71109a;

    public /* synthetic */ f(Promise promise) {
        this.f71109a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseAnalyticsModule.lambda$getSessionId$4(this.f71109a, task);
    }
}
