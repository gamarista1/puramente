package io.invertase.firebase.database;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.invertase.firebase.database.ReactNativeFirebaseDatabaseQueryModule;

public final /* synthetic */ class r implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71393a;

    public /* synthetic */ r(Promise promise) {
        this.f71393a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseDatabaseQueryModule.b.o(this.f71393a, task);
    }
}
