package io.invertase.firebase.database;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: io.invertase.firebase.database.e  reason: case insensitive filesystem */
public final /* synthetic */ class C6406e implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71374a;

    public /* synthetic */ C6406e(Promise promise) {
        this.f71374a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseDatabaseOnDisconnectModule.lambda$onDisconnectCancel$0(this.f71374a, task);
    }
}
