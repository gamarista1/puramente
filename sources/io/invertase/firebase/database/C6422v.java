package io.invertase.firebase.database;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.invertase.firebase.database.ReactNativeFirebaseDatabaseQueryModule;

/* renamed from: io.invertase.firebase.database.v  reason: case insensitive filesystem */
public final /* synthetic */ class C6422v implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71398a;

    public /* synthetic */ C6422v(Promise promise) {
        this.f71398a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseDatabaseQueryModule.b.s(this.f71398a, task);
    }
}
