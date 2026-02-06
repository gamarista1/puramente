package xa;

import android.os.Bundle;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class H implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C5270c f62151a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bundle f62152b;

    public /* synthetic */ H(C5270c cVar, Bundle bundle) {
        this.f62151a = cVar;
        this.f62152b = bundle;
    }

    public final Object then(Task task) {
        return this.f62151a.f(this.f62152b, task);
    }
}
