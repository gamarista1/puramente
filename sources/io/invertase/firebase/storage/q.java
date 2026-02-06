package io.invertase.firebase.storage;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class q implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f71496a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71497b;

    public /* synthetic */ q(u uVar, Promise promise) {
        this.f71496a = uVar;
        this.f71497b = promise;
    }

    public final void onComplete(Task task) {
        this.f71496a.x(this.f71497b, task);
    }
}
