package androidx.work;

import android.content.Context;
import androidx.work.impl.utils.futures.c;
import androidx.work.r;
import com.google.common.util.concurrent.g;

public abstract class Worker extends r {

    /* renamed from: a  reason: collision with root package name */
    c f18661a;

    class a implements Runnable {
        a() {
        }

        public void run() {
            try {
                Worker.this.f18661a.p(Worker.this.a());
            } catch (Throwable th2) {
                Worker.this.f18661a.q(th2);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f18663a;

        b(c cVar) {
            this.f18663a = cVar;
        }

        public void run() {
            try {
                this.f18663a.p(Worker.this.b());
            } catch (Throwable th2) {
                this.f18663a.q(th2);
            }
        }
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract r.a a();

    public j b() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }

    public g getForegroundInfoAsync() {
        c t10 = c.t();
        getBackgroundExecutor().execute(new b(t10));
        return t10;
    }

    public final g startWork() {
        this.f18661a = c.t();
        getBackgroundExecutor().execute(new a());
        return this.f18661a;
    }
}
