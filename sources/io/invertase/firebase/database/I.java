package io.invertase.firebase.database;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class I implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71308a;

    public /* synthetic */ I(Promise promise) {
        this.f71308a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseDatabaseReferenceModule.lambda$setWithPriority$8(this.f71308a, task);
    }
}
