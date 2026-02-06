package io.invertase.firebase.database;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: io.invertase.firebase.database.n  reason: case insensitive filesystem */
public final /* synthetic */ class C6415n implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71388a;

    public /* synthetic */ C6415n(Promise promise) {
        this.f71388a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseDatabaseQueryModule.lambda$get$2(this.f71388a, task);
    }
}
