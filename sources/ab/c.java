package Ab;

import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f50176a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f50177b;

    public /* synthetic */ c(f fVar, TaskCompletionSource taskCompletionSource) {
        this.f50176a = fVar;
        this.f50177b = taskCompletionSource;
    }

    public final void run() {
        this.f50176a.l(this.f50177b);
    }
}
