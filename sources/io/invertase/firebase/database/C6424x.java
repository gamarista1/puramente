package io.invertase.firebase.database;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.invertase.firebase.database.ReactNativeFirebaseDatabaseQueryModule;

/* renamed from: io.invertase.firebase.database.x  reason: case insensitive filesystem */
public final /* synthetic */ class C6424x implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71401a;

    public /* synthetic */ C6424x(Promise promise) {
        this.f71401a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseDatabaseQueryModule.b.q(this.f71401a, task);
    }
}
