package Ab;

import Bb.a;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.C4491c;
import com.google.android.gms.common.internal.C4536s;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final i f50207a;

    /* renamed from: b  reason: collision with root package name */
    private final Bb.a f50208b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f50209c;

    /* renamed from: d  reason: collision with root package name */
    private volatile int f50210d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public volatile long f50211e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f50212f;

    class a implements C4491c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f50213a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Bb.a f50214b;

        a(i iVar, Bb.a aVar) {
            this.f50213a = iVar;
            this.f50214b = aVar;
        }

        public void a(boolean z10) {
            boolean unused = l.this.f50209c = z10;
            if (z10) {
                this.f50213a.c();
            } else if (l.this.e()) {
                this.f50213a.g(l.this.f50211e - this.f50214b.currentTimeMillis());
            }
        }
    }

    l(Context context, f fVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this((Context) C4536s.l(context), new i((f) C4536s.l(fVar), executor, scheduledExecutorService), new a.C0766a());
    }

    /* access modifiers changed from: private */
    public boolean e() {
        if (!this.f50212f || this.f50209c || this.f50210d <= 0 || this.f50211e == -1) {
            return false;
        }
        return true;
    }

    public void d(int i10) {
        if (this.f50210d == 0 && i10 > 0) {
            this.f50210d = i10;
            if (e()) {
                this.f50207a.g(this.f50211e - this.f50208b.currentTimeMillis());
            }
        } else if (this.f50210d > 0 && i10 == 0) {
            this.f50207a.c();
        }
        this.f50210d = i10;
    }

    l(Context context, i iVar, Bb.a aVar) {
        this.f50207a = iVar;
        this.f50208b = aVar;
        this.f50211e = -1;
        C4491c.c((Application) context.getApplicationContext());
        C4491c.b().a(new a(iVar, aVar));
    }
}
