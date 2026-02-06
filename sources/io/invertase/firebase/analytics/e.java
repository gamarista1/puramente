package io.invertase.firebase.analytics;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class e implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71108a;

    public /* synthetic */ e(Promise promise) {
        this.f71108a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseAnalyticsModule.lambda$logEvent$0(this.f71108a, task);
    }
}
