package Ab;

import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private final f f50194a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f50195b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f50196c;

    /* renamed from: d  reason: collision with root package name */
    private volatile ScheduledFuture f50197d;

    /* renamed from: e  reason: collision with root package name */
    private volatile long f50198e = -1;

    i(f fVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f50194a = (f) C4536s.l(fVar);
        this.f50195b = executor;
        this.f50196c = scheduledExecutorService;
    }

    private long d() {
        if (this.f50198e == -1) {
            return 30;
        }
        if (this.f50198e * 2 < 960) {
            return this.f50198e * 2;
        }
        return 960;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(Exception exc) {
        h();
    }

    /* access modifiers changed from: private */
    public void f() {
        this.f50194a.g().addOnFailureListener(this.f50195b, (OnFailureListener) new h(this));
    }

    private void h() {
        c();
        this.f50198e = d();
        this.f50197d = this.f50196c.schedule(new g(this), this.f50198e, TimeUnit.SECONDS);
    }

    public void c() {
        if (this.f50197d != null && !this.f50197d.isDone()) {
            this.f50197d.cancel(false);
        }
    }

    public void g(long j10) {
        c();
        this.f50198e = -1;
        this.f50197d = this.f50196c.schedule(new g(this), Math.max(0, j10), TimeUnit.MILLISECONDS);
    }
}
