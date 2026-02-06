package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import c7.C3189i;
import d7.C3479a;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class G {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f39813a;

    /* renamed from: b  reason: collision with root package name */
    private final d f39814b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f39815c = new a();

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f39816d = new b();

    /* renamed from: e  reason: collision with root package name */
    private final int f39817e;

    /* renamed from: f  reason: collision with root package name */
    C3189i f39818f = null;

    /* renamed from: g  reason: collision with root package name */
    int f39819g = 0;

    /* renamed from: h  reason: collision with root package name */
    f f39820h = f.IDLE;

    /* renamed from: i  reason: collision with root package name */
    long f39821i = 0;

    /* renamed from: j  reason: collision with root package name */
    long f39822j = 0;

    class a implements Runnable {
        a() {
        }

        public void run() {
            G.this.d();
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            G.this.j();
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f39825a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.facebook.imagepipeline.producers.G$f[] r0 = com.facebook.imagepipeline.producers.G.f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39825a = r0
                com.facebook.imagepipeline.producers.G$f r1 = com.facebook.imagepipeline.producers.G.f.IDLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f39825a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.imagepipeline.producers.G$f r1 = com.facebook.imagepipeline.producers.G.f.QUEUED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f39825a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.imagepipeline.producers.G$f r1 = com.facebook.imagepipeline.producers.G.f.RUNNING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f39825a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.imagepipeline.producers.G$f r1 = com.facebook.imagepipeline.producers.G.f.RUNNING_AND_PENDING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.G.c.<clinit>():void");
        }
    }

    public interface d {
        void a(C3189i iVar, int i10);
    }

    static class e {

        /* renamed from: a  reason: collision with root package name */
        private static ScheduledExecutorService f39826a;

        static ScheduledExecutorService a() {
            if (f39826a == null) {
                f39826a = Executors.newSingleThreadScheduledExecutor();
            }
            return f39826a;
        }
    }

    enum f {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    public G(Executor executor, d dVar, int i10) {
        this.f39813a = executor;
        this.f39814b = dVar;
        this.f39817e = i10;
    }

    /* access modifiers changed from: private */
    public void d() {
        C3189i iVar;
        int i10;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            iVar = this.f39818f;
            i10 = this.f39819g;
            this.f39818f = null;
            this.f39819g = 0;
            this.f39820h = f.RUNNING;
            this.f39822j = uptimeMillis;
        }
        try {
            if (i(iVar, i10)) {
                this.f39814b.a(iVar, i10);
            }
        } finally {
            C3189i.f(iVar);
            g();
        }
    }

    private void e(long j10) {
        Runnable a10 = C3479a.a(this.f39816d, "JobScheduler_enqueueJob");
        if (j10 > 0) {
            e.a().schedule(a10, j10, TimeUnit.MILLISECONDS);
        } else {
            a10.run();
        }
    }

    private void g() {
        boolean z10;
        long j10;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (this.f39820h == f.RUNNING_AND_PENDING) {
                    j10 = Math.max(this.f39822j + ((long) this.f39817e), uptimeMillis);
                    this.f39821i = uptimeMillis;
                    this.f39820h = f.QUEUED;
                    z10 = true;
                } else {
                    this.f39820h = f.IDLE;
                    j10 = 0;
                    z10 = false;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (z10) {
            e(j10 - uptimeMillis);
        }
    }

    private static boolean i(C3189i iVar, int i10) {
        if (C3297c.e(i10) || C3297c.n(i10, 4) || C3189i.h0(iVar)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void j() {
        this.f39813a.execute(C3479a.a(this.f39815c, "JobScheduler_submitJob"));
    }

    public void c() {
        C3189i iVar;
        synchronized (this) {
            iVar = this.f39818f;
            this.f39818f = null;
            this.f39819g = 0;
        }
        C3189i.f(iVar);
    }

    public synchronized long f() {
        return this.f39822j - this.f39821i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r3 == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        e(r5 - r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean h() {
        /*
            r7 = this;
            long r0 = android.os.SystemClock.uptimeMillis()
            monitor-enter(r7)
            c7.i r2 = r7.f39818f     // Catch:{ all -> 0x0012 }
            int r3 = r7.f39819g     // Catch:{ all -> 0x0012 }
            boolean r2 = i(r2, r3)     // Catch:{ all -> 0x0012 }
            r3 = 0
            if (r2 != 0) goto L_0x0014
            monitor-exit(r7)     // Catch:{ all -> 0x0012 }
            return r3
        L_0x0012:
            r0 = move-exception
            goto L_0x0045
        L_0x0014:
            int[] r2 = com.facebook.imagepipeline.producers.G.c.f39825a     // Catch:{ all -> 0x0012 }
            com.facebook.imagepipeline.producers.G$f r4 = r7.f39820h     // Catch:{ all -> 0x0012 }
            int r4 = r4.ordinal()     // Catch:{ all -> 0x0012 }
            r2 = r2[r4]     // Catch:{ all -> 0x0012 }
            r4 = 1
            if (r2 == r4) goto L_0x002c
            r5 = 3
            if (r2 == r5) goto L_0x0025
            goto L_0x0029
        L_0x0025:
            com.facebook.imagepipeline.producers.G$f r2 = com.facebook.imagepipeline.producers.G.f.RUNNING_AND_PENDING     // Catch:{ all -> 0x0012 }
            r7.f39820h = r2     // Catch:{ all -> 0x0012 }
        L_0x0029:
            r5 = 0
            goto L_0x003d
        L_0x002c:
            long r2 = r7.f39822j     // Catch:{ all -> 0x0012 }
            int r5 = r7.f39817e     // Catch:{ all -> 0x0012 }
            long r5 = (long) r5     // Catch:{ all -> 0x0012 }
            long r2 = r2 + r5
            long r5 = java.lang.Math.max(r2, r0)     // Catch:{ all -> 0x0012 }
            r7.f39821i = r0     // Catch:{ all -> 0x0012 }
            com.facebook.imagepipeline.producers.G$f r2 = com.facebook.imagepipeline.producers.G.f.QUEUED     // Catch:{ all -> 0x0012 }
            r7.f39820h = r2     // Catch:{ all -> 0x0012 }
            r3 = r4
        L_0x003d:
            monitor-exit(r7)     // Catch:{ all -> 0x0012 }
            if (r3 == 0) goto L_0x0044
            long r5 = r5 - r0
            r7.e(r5)
        L_0x0044:
            return r4
        L_0x0045:
            monitor-exit(r7)     // Catch:{ all -> 0x0012 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.G.h():boolean");
    }

    public boolean k(C3189i iVar, int i10) {
        C3189i iVar2;
        if (!i(iVar, i10)) {
            return false;
        }
        synchronized (this) {
            iVar2 = this.f39818f;
            this.f39818f = C3189i.b(iVar);
            this.f39819g = i10;
        }
        C3189i.f(iVar2);
        return true;
    }
}
