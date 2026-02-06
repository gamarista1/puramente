package io.invertase.firebase.perf;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class b implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71442a;

    public /* synthetic */ b(Promise promise) {
        this.f71442a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebasePerfModule.lambda$startTrace$1(this.f71442a, task);
    }
}
