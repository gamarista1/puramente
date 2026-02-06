package L3;

import androidx.work.A;
import androidx.work.impl.N;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final A f4177a;

    /* renamed from: b  reason: collision with root package name */
    private final N f4178b;

    /* renamed from: c  reason: collision with root package name */
    private final long f4179c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f4180d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f4181e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(A a10, N n10) {
        this(a10, n10, 0, 4, (DefaultConstructorMarker) null);
        C6496s.h(a10, "runnableScheduler");
        C6496s.h(n10, MetricTracker.Object.LAUNCHER);
    }

    /* access modifiers changed from: private */
    public static final void d(d dVar, androidx.work.impl.A a10) {
        C6496s.h(dVar, "this$0");
        C6496s.h(a10, "$token");
        dVar.f4178b.d(a10, 3);
    }

    public final void b(androidx.work.impl.A a10) {
        Runnable runnable;
        C6496s.h(a10, "token");
        synchronized (this.f4180d) {
            runnable = (Runnable) this.f4181e.remove(a10);
        }
        if (runnable != null) {
            this.f4177a.a(runnable);
        }
    }

    public final void c(androidx.work.impl.A a10) {
        C6496s.h(a10, "token");
        c cVar = new c(this, a10);
        synchronized (this.f4180d) {
            Runnable runnable = (Runnable) this.f4181e.put(a10, cVar);
        }
        this.f4177a.b(this.f4179c, cVar);
    }

    public d(A a10, N n10, long j10) {
        C6496s.h(a10, "runnableScheduler");
        C6496s.h(n10, MetricTracker.Object.LAUNCHER);
        this.f4177a = a10;
        this.f4178b = n10;
        this.f4179c = j10;
        this.f4180d = new Object();
        this.f4181e = new LinkedHashMap();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(A a10, N n10, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(a10, n10, (i10 & 4) != 0 ? TimeUnit.MINUTES.toMillis(90) : j10);
    }
}
