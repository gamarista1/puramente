package io.invertase.firebase.perf;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class f implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71446a;

    public /* synthetic */ f(Promise promise) {
        this.f71446a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebasePerfModule.lambda$startHttpMetric$5(this.f71446a, task);
    }
}
