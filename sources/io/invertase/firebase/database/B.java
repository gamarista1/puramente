package io.invertase.firebase.database;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class B implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71295a;

    public /* synthetic */ B(Promise promise) {
        this.f71295a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseDatabaseReferenceModule.lambda$set$2(this.f71295a, task);
    }
}
