package io.invertase.firebase.database;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: io.invertase.firebase.database.f  reason: case insensitive filesystem */
public final /* synthetic */ class C6407f implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71375a;

    public /* synthetic */ C6407f(Promise promise) {
        this.f71375a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseDatabaseOnDisconnectModule.lambda$onDisconnectSetWithPriority$3(this.f71375a, task);
    }
}
