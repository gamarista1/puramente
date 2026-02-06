package io.invertase.firebase.messaging;

import com.facebook.react.bridge.ReadableMap;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.Callable;

public final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReadableMap f71432a;

    public /* synthetic */ j(ReadableMap readableMap) {
        this.f71432a = readableMap;
    }

    public final Object call() {
        return FirebaseMessaging.u().S(q.e(this.f71432a));
    }
}
