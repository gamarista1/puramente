package io.invertase.firebase.perf;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class d implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71444a;

    public /* synthetic */ d(Promise promise) {
        this.f71444a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebasePerfModule.lambda$setPerformanceCollectionEnabled$0(this.f71444a, task);
    }
}
