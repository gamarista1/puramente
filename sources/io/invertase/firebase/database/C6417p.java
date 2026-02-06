package io.invertase.firebase.database;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.invertase.firebase.database.ReactNativeFirebaseDatabaseQueryModule;

/* renamed from: io.invertase.firebase.database.p  reason: case insensitive filesystem */
public final /* synthetic */ class C6417p implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71390a;

    public /* synthetic */ C6417p(Promise promise) {
        this.f71390a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseDatabaseQueryModule.a.f(this.f71390a, task);
    }
}
