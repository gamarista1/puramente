package io.invertase.firebase.messaging;

import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.Callable;

public final /* synthetic */ class m implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Boolean f71435a;

    public /* synthetic */ m(Boolean bool) {
        this.f71435a = bool;
    }

    public final Object call() {
        return FirebaseMessaging.u().U(this.f71435a.booleanValue());
    }
}
