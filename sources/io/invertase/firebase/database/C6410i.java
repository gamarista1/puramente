package io.invertase.firebase.database;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: io.invertase.firebase.database.i  reason: case insensitive filesystem */
public final /* synthetic */ class C6410i implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71378a;

    public /* synthetic */ C6410i(Promise promise) {
        this.f71378a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseDatabaseOnDisconnectModule.lambda$onDisconnectSet$2(this.f71378a, task);
    }
}
