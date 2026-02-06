package io.invertase.firebase.analytics;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class d implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71107a;

    public /* synthetic */ d(Promise promise) {
        this.f71107a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseAnalyticsModule.lambda$setAnalyticsCollectionEnabled$1(this.f71107a, task);
    }
}
