package io.invertase.firebase.database;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: io.invertase.firebase.database.z  reason: case insensitive filesystem */
public final /* synthetic */ class C6426z implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71403a;

    public /* synthetic */ C6426z(Promise promise) {
        this.f71403a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseDatabaseReferenceModule.lambda$remove$9(this.f71403a, task);
    }
}
