package v6;

import a6.C3136b;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: v6.c  reason: case insensitive filesystem */
public class C4108c extends C4107b {

    /* renamed from: e  reason: collision with root package name */
    private final C3136b f48859e;

    /* renamed from: f  reason: collision with root package name */
    private final ScheduledExecutorService f48860f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f48861g = false;

    /* renamed from: h  reason: collision with root package name */
    private long f48862h;

    /* renamed from: i  reason: collision with root package name */
    private long f48863i = 2000;

    /* renamed from: j  reason: collision with root package name */
    private long f48864j = 1000;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public b f48865k;

    /* renamed from: l  reason: collision with root package name */
    private final Runnable f48866l = new a();

    /* renamed from: v6.c$a */
    class a implements Runnable {
        a() {
        }

        public void run() {
            synchronized (C4108c.this) {
                try {
                    C4108c.this.f48861g = false;
                    if (!C4108c.this.t()) {
                        C4108c.this.u();
                    } else if (C4108c.this.f48865k != null) {
                        C4108c.this.f48865k.j();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: v6.c$b */
    public interface b {
        void j();
    }

    private C4108c(C4106a aVar, b bVar, C3136b bVar2, ScheduledExecutorService scheduledExecutorService) {
        super(aVar);
        this.f48865k = bVar;
        this.f48859e = bVar2;
        this.f48860f = scheduledExecutorService;
    }

    public static C4107b r(C4106a aVar, C3136b bVar, ScheduledExecutorService scheduledExecutorService) {
        return s(aVar, (b) aVar, bVar, scheduledExecutorService);
    }

    public static C4107b s(C4106a aVar, b bVar, C3136b bVar2, ScheduledExecutorService scheduledExecutorService) {
        return new C4108c(aVar, bVar, bVar2, scheduledExecutorService);
    }

    /* access modifiers changed from: private */
    public boolean t() {
        if (this.f48859e.now() - this.f48862h > this.f48863i) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public synchronized void u() {
        if (!this.f48861g) {
            this.f48861g = true;
            this.f48860f.schedule(this.f48866l, this.f48864j, TimeUnit.MILLISECONDS);
        }
    }

    public boolean h(Drawable drawable, Canvas canvas, int i10) {
        this.f48862h = this.f48859e.now();
        boolean h10 = super.h(drawable, canvas, i10);
        u();
        return h10;
    }
}
