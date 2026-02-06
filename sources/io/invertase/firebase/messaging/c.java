package io.invertase.firebase.messaging;

import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.Callable;

public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f71425a;

    public /* synthetic */ c(FirebaseMessaging firebaseMessaging) {
        this.f71425a = firebaseMessaging;
    }

    public final Object call() {
        return Tasks.await(this.f71425a.q());
    }
}
