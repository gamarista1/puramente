package io.invertase.firebase.messaging;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class l implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71434a;

    public /* synthetic */ l(Promise promise) {
        this.f71434a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseMessagingModule.lambda$unsubscribeFromTopic$11(this.f71434a, task);
    }
}
