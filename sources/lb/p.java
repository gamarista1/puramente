package Lb;

import Lb.n;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.database.a;
import com.google.firebase.database.h;

public final /* synthetic */ class p implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n.y f51874a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f51875b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f51876c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h f51877d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ n f51878e;

    public /* synthetic */ p(n.y yVar, TaskCompletionSource taskCompletionSource, a aVar, h hVar, n nVar) {
        this.f51874a = yVar;
        this.f51875b = taskCompletionSource;
        this.f51876c = aVar;
        this.f51877d = hVar;
        this.f51878e = nVar;
    }

    public final void onComplete(Task task) {
        this.f51874a.d(this.f51875b, this.f51876c, this.f51877d, this.f51878e, task);
    }
}
