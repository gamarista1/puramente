package io.invertase.firebase.database;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: io.invertase.firebase.database.g  reason: case insensitive filesystem */
public final /* synthetic */ class C6408g implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71376a;

    public /* synthetic */ C6408g(Promise promise) {
        this.f71376a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseDatabaseOnDisconnectModule.lambda$onDisconnectUpdate$4(this.f71376a, task);
    }
}
