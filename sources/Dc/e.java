package Dc;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.a;

public final /* synthetic */ class e implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f50581a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Task f50582b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Task f50583c;

    public /* synthetic */ e(a aVar, Task task, Task task2) {
        this.f50581a = aVar;
        this.f50582b = task;
        this.f50583c = task2;
    }

    public final Object then(Task task) {
        return this.f50581a.t(this.f50582b, this.f50583c, task);
    }
}
