package io.invertase.firebase.messaging;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class k implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71433a;

    public /* synthetic */ k(Promise promise) {
        this.f71433a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseMessagingModule.lambda$sendMessage$9(this.f71433a, task);
    }
}
