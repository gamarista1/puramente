package Ab;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class d implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f50178a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f50179b;

    public /* synthetic */ d(f fVar, boolean z10) {
        this.f50178a = fVar;
        this.f50179b = z10;
    }

    public final Object then(Task task) {
        return this.f50178a.k(this.f50179b, task);
    }
}
