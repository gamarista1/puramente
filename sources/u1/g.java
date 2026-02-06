package u1;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public abstract class g {

    private static class a implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f26545a;

        a(Handler handler) {
            this.f26545a = (Handler) x1.g.f(handler);
        }

        public void execute(Runnable runnable) {
            if (!this.f26545a.post((Runnable) x1.g.f(runnable))) {
                throw new RejectedExecutionException(this.f26545a + " is shutting down");
            }
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
