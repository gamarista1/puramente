package lb;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: lb.j  reason: case insensitive filesystem */
public abstract class C5077j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final TaskCompletionSource f60972a;

    C5077j() {
        this.f60972a = null;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: package-private */
    public final TaskCompletionSource b() {
        return this.f60972a;
    }

    public final void c(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f60972a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            c(e10);
        }
    }

    public C5077j(TaskCompletionSource taskCompletionSource) {
        this.f60972a = taskCompletionSource;
    }
}
