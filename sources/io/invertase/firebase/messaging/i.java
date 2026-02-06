package io.invertase.firebase.messaging;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class i implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71431a;

    public /* synthetic */ i(Promise promise) {
        this.f71431a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseMessagingModule.lambda$getToken$3(this.f71431a, task);
    }
}
