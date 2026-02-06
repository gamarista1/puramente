package Lb;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.database.a;

public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f51872a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f51873b;

    public /* synthetic */ o(TaskCompletionSource taskCompletionSource, a aVar) {
        this.f51872a = taskCompletionSource;
        this.f51873b = aVar;
    }

    public final void run() {
        this.f51872a.trySetResult(this.f51873b);
    }
}
