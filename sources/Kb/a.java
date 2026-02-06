package Kb;

import Sb.c;
import Sb.d;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledExecutorService f51431a;

    /* renamed from: b  reason: collision with root package name */
    private final c f51432b;

    /* renamed from: c  reason: collision with root package name */
    private final long f51433c;

    /* renamed from: d  reason: collision with root package name */
    private final long f51434d;

    /* renamed from: e  reason: collision with root package name */
    private final double f51435e;

    /* renamed from: f  reason: collision with root package name */
    private final double f51436f;

    /* renamed from: g  reason: collision with root package name */
    private final Random f51437g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public ScheduledFuture f51438h;

    /* renamed from: i  reason: collision with root package name */
    private long f51439i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f51440j;

    /* renamed from: Kb.a$a  reason: collision with other inner class name */
    class C0790a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f51441a;

        C0790a(Runnable runnable) {
            this.f51441a = runnable;
        }

        public void run() {
            ScheduledFuture unused = a.this.f51438h = null;
            this.f51441a.run();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final ScheduledExecutorService f51443a;

        /* renamed from: b  reason: collision with root package name */
        private long f51444b = 1000;

        /* renamed from: c  reason: collision with root package name */
        private double f51445c = 0.5d;

        /* renamed from: d  reason: collision with root package name */
        private long f51446d = 30000;

        /* renamed from: e  reason: collision with root package name */
        private double f51447e = 1.3d;

        /* renamed from: f  reason: collision with root package name */
        private final c f51448f;

        public b(ScheduledExecutorService scheduledExecutorService, d dVar, String str) {
            this.f51443a = scheduledExecutorService;
            this.f51448f = new c(dVar, str);
        }

        public a a() {
            return new a(this.f51443a, this.f51448f, this.f51444b, this.f51446d, this.f51447e, this.f51445c, (C0790a) null);
        }

        public b b(double d10) {
            if (d10 < 0.0d || d10 > 1.0d) {
                throw new IllegalArgumentException("Argument out of range: " + d10);
            }
            this.f51445c = d10;
            return this;
        }

        public b c(long j10) {
            this.f51446d = j10;
            return this;
        }

        public b d(long j10) {
            this.f51444b = j10;
            return this;
        }

        public b e(double d10) {
            this.f51447e = d10;
            return this;
        }
    }

    /* synthetic */ a(ScheduledExecutorService scheduledExecutorService, c cVar, long j10, long j11, double d10, double d11, C0790a aVar) {
        this(scheduledExecutorService, cVar, j10, j11, d10, d11);
    }

    public void b() {
        if (this.f51438h != null) {
            this.f51432b.b("Cancelling existing retry attempt", new Object[0]);
            this.f51438h.cancel(false);
            this.f51438h = null;
        } else {
            this.f51432b.b("No existing retry attempt to cancel", new Object[0]);
        }
        this.f51439i = 0;
    }

    public void c(Runnable runnable) {
        C0790a aVar = new C0790a(runnable);
        if (this.f51438h != null) {
            this.f51432b.b("Cancelling previous scheduled retry", new Object[0]);
            this.f51438h.cancel(false);
            this.f51438h = null;
        }
        long j10 = 0;
        if (!this.f51440j) {
            long j11 = this.f51439i;
            if (j11 == 0) {
                this.f51439i = this.f51433c;
            } else {
                this.f51439i = Math.min((long) (((double) j11) * this.f51436f), this.f51434d);
            }
            double d10 = this.f51435e;
            long j12 = this.f51439i;
            j10 = (long) (((1.0d - d10) * ((double) j12)) + (d10 * ((double) j12) * this.f51437g.nextDouble()));
        }
        this.f51440j = false;
        this.f51432b.b("Scheduling retry in %dms", Long.valueOf(j10));
        this.f51438h = this.f51431a.schedule(aVar, j10, TimeUnit.MILLISECONDS);
    }

    public void d() {
        this.f51439i = this.f51434d;
    }

    public void e() {
        this.f51440j = true;
        this.f51439i = 0;
    }

    private a(ScheduledExecutorService scheduledExecutorService, c cVar, long j10, long j11, double d10, double d11) {
        this.f51437g = new Random();
        this.f51440j = true;
        this.f51431a = scheduledExecutorService;
        this.f51432b = cVar;
        this.f51433c = j10;
        this.f51434d = j11;
        this.f51436f = d10;
        this.f51435e = d11;
    }
}
