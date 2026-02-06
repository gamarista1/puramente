package io.invertase.firebase.database;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: io.invertase.firebase.database.d  reason: case insensitive filesystem */
public final /* synthetic */ class C6405d implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71373a;

    public /* synthetic */ C6405d(Promise promise) {
        this.f71373a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseDatabaseModule.lambda$goOnline$0(this.f71373a, task);
    }
}
