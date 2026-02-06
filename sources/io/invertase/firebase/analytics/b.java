package io.invertase.firebase.analytics;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class b implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71105a;

    public /* synthetic */ b(Promise promise) {
        this.f71105a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseAnalyticsModule.lambda$setUserProperty$6(this.f71105a, task);
    }
}
