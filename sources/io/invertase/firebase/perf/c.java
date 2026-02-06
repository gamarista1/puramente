package io.invertase.firebase.perf;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class c implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71443a;

    public /* synthetic */ c(Promise promise) {
        this.f71443a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebasePerfModule.lambda$stopHttpMetric$6(this.f71443a, task);
    }
}
