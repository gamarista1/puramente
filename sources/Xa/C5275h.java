package xa;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledFuture;

/* renamed from: xa.h  reason: case insensitive filesystem */
public final /* synthetic */ class C5275h implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C5270c f62170a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f62171b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ScheduledFuture f62172c;

    public /* synthetic */ C5275h(C5270c cVar, String str, ScheduledFuture scheduledFuture) {
        this.f62170a = cVar;
        this.f62171b = str;
        this.f62172c = scheduledFuture;
    }

    public final void onComplete(Task task) {
        this.f62170a.h(this.f62171b, this.f62172c, task);
    }
}
