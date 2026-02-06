package io.invertase.firebase.messaging;

import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.Callable;

public final /* synthetic */ class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f71430a;

    public /* synthetic */ h(FirebaseMessaging firebaseMessaging) {
        this.f71430a = firebaseMessaging;
    }

    public final Object call() {
        return ReactNativeFirebaseMessagingModule.lambda$getToken$2(this.f71430a);
    }
}
