package io.invertase.firebase.database;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: io.invertase.firebase.database.c  reason: case insensitive filesystem */
public final /* synthetic */ class C6404c implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71372a;

    public /* synthetic */ C6404c(Promise promise) {
        this.f71372a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseDatabaseModule.lambda$goOffline$1(this.f71372a, task);
    }
}
