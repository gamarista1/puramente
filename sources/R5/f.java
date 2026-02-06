package R5;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class f implements RunnableFuture, ScheduledFuture {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f33700a;

    /* renamed from: b  reason: collision with root package name */
    private final FutureTask f33701b;

    public f(Handler handler, Callable callable) {
        this.f33700a = handler;
        this.f33701b = new FutureTask(callable);
    }

    /* renamed from: a */
    public int compareTo(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    public boolean cancel(boolean z10) {
        return this.f33701b.cancel(z10);
    }

    public Object get() {
        return this.f33701b.get();
    }

    public long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public boolean isCancelled() {
        return this.f33701b.isCancelled();
    }

    public boolean isDone() {
        return this.f33701b.isDone();
    }

    public void run() {
        this.f33701b.run();
    }

    public Object get(long j10, TimeUnit timeUnit) {
        return this.f33701b.get(j10, timeUnit);
    }

    public f(Handler handler, Runnable runnable, Object obj) {
        this.f33700a = handler;
        this.f33701b = new FutureTask(runnable, obj);
    }
}
