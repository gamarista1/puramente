package io.invertase.firebase.messaging;

import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.Callable;

public final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Boolean f71427a;

    public /* synthetic */ e(Boolean bool) {
        this.f71427a = bool;
    }

    public final Object call() {
        return FirebaseMessaging.u().T(this.f71427a.booleanValue());
    }
}
