package io.invertase.firebase.storage;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class l implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71488a;

    public /* synthetic */ l(Promise promise) {
        this.f71488a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseStorageModule.lambda$list$3(this.f71488a, task);
    }
}
