package io.invertase.firebase.storage;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class h implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71481a;

    public /* synthetic */ h(Promise promise) {
        this.f71481a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseStorageModule.lambda$delete$0(this.f71481a, task);
    }
}
