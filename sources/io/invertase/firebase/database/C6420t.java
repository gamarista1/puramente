package io.invertase.firebase.database;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.invertase.firebase.database.ReactNativeFirebaseDatabaseQueryModule;

/* renamed from: io.invertase.firebase.database.t  reason: case insensitive filesystem */
public final /* synthetic */ class C6420t implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71395a;

    public /* synthetic */ C6420t(Promise promise) {
        this.f71395a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseDatabaseQueryModule.b.u(this.f71395a, task);
    }
}
