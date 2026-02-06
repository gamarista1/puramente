package io.invertase.firebase.messaging;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class g implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71429a;

    public /* synthetic */ g(Promise promise) {
        this.f71429a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseMessagingModule.lambda$hasPermission$7(this.f71429a, task);
    }
}
