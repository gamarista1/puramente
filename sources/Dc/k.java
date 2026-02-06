package Dc;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.a;

public final /* synthetic */ class k implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f50588a;

    public /* synthetic */ k(a aVar) {
        this.f50588a = aVar;
    }

    public final Object then(Task task) {
        return Boolean.valueOf(this.f50588a.B(task));
    }
}
