package io.invertase.firebase.storage;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class n implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71490a;

    public /* synthetic */ n(Promise promise) {
        this.f71490a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseStorageModule.lambda$updateMetadata$5(this.f71490a, task);
    }
}
