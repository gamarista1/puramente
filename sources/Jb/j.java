package Jb;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class j implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f51244a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f51245b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Task f51246c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Task f51247d;

    public /* synthetic */ j(n nVar, long j10, Task task, Task task2) {
        this.f51244a = nVar;
        this.f51245b = j10;
        this.f51246c = task;
        this.f51247d = task2;
    }

    public final void onSuccess(Object obj) {
        this.f51244a.e0(this.f51245b, this.f51246c, this.f51247d, (Void) obj);
    }
}
