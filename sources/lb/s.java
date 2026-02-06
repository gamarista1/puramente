package Lb;

import java.util.concurrent.ScheduledFuture;

public interface s {
    void a();

    void b(Runnable runnable);

    ScheduledFuture schedule(Runnable runnable, long j10);
}
