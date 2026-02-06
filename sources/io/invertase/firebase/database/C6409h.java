package io.invertase.firebase.database;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: io.invertase.firebase.database.h  reason: case insensitive filesystem */
public final /* synthetic */ class C6409h implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71377a;

    public /* synthetic */ C6409h(Promise promise) {
        this.f71377a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseDatabaseOnDisconnectModule.lambda$onDisconnectRemove$1(this.f71377a, task);
    }
}
