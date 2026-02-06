package io.invertase.firebase.storage;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class i implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71482a;

    public /* synthetic */ i(Promise promise) {
        this.f71482a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseStorageModule.lambda$getMetadata$2(this.f71482a, task);
    }
}
