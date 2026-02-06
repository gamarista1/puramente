package io.invertase.firebase.database;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class C implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71296a;

    public /* synthetic */ C(Promise promise) {
        this.f71296a = promise;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseDatabaseReferenceModule.lambda$setPriority$10(this.f71296a, task);
    }
}
