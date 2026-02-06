package io.invertase.firebase.analytics;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class j implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71113a;

    public /* synthetic */ j(Promise promise) {
        this.f71113a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseAnalyticsModule.lambda$setSessionTimeoutDuration$2(this.f71113a, task);
    }
}
