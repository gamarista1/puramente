package lb;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: lb.k  reason: case insensitive filesystem */
public final /* synthetic */ class C5078k implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C5087t f60973a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f60974b;

    public /* synthetic */ C5078k(C5087t tVar, TaskCompletionSource taskCompletionSource) {
        this.f60973a = tVar;
        this.f60974b = taskCompletionSource;
    }

    public final void onComplete(Task task) {
        this.f60973a.q(this.f60974b, task);
    }
}
