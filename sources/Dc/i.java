package Dc;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.a;

public final /* synthetic */ class i implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Task f50586a;

    public /* synthetic */ i(Task task) {
        this.f50586a = task;
    }

    public final Object then(Task task) {
        return a.u(this.f50586a, task);
    }
}
