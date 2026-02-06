package io.invertase.firebase.perf;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class a implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71441a;

    public /* synthetic */ a(Promise promise) {
        this.f71441a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebasePerfModule.lambda$stopTrace$2(this.f71441a, task);
    }
}
