package io.invertase.firebase.database;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class F implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71302a;

    public /* synthetic */ F(Promise promise) {
        this.f71302a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseDatabaseReferenceModule.lambda$update$5(this.f71302a, task);
    }
}
