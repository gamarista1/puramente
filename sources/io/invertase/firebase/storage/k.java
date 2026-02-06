package io.invertase.firebase.storage;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class k implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71487a;

    public /* synthetic */ k(Promise promise) {
        this.f71487a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseStorageModule.lambda$listAll$4(this.f71487a, task);
    }
}
