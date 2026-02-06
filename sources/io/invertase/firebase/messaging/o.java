package io.invertase.firebase.messaging;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class o implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71437a;

    public /* synthetic */ o(Promise promise) {
        this.f71437a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseMessagingModule.lambda$subscribeToTopic$10(this.f71437a, task);
    }
}
