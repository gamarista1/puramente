package R5;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

public class a extends AbstractExecutorService {

    /* renamed from: a  reason: collision with root package name */
    private static final a f33689a = new a();

    private a() {
    }

    public static a a() {
        return f33689a;
    }

    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return true;
    }

    public void execute(Runnable runnable) {
        runnable.run();
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public List shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }

    public void shutdown() {
    }
}
