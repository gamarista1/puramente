package K4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f32333a;

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f32334b;

    /* renamed from: c  reason: collision with root package name */
    private final ExecutorService f32335c;

    /* renamed from: d  reason: collision with root package name */
    private final ExecutorService f32336d;

    /* renamed from: e  reason: collision with root package name */
    private final ExecutorService f32337e;

    /* renamed from: K4.b$b  reason: collision with other inner class name */
    public /* synthetic */ class C0527b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32340a;

        static {
            int[] iArr = new int[t.values().length];
            iArr[t.ERROR_REQUEST.ordinal()] = 1;
            iArr[t.SESSION_REQUEST.ordinal()] = 2;
            iArr[t.IO.ordinal()] = 3;
            iArr[t.INTERNAL_REPORT.ordinal()] = 4;
            iArr[t.DEFAULT.ordinal()] = 5;
            f32340a = iArr;
        }
    }

    public b() {
        this((ExecutorService) null, (ExecutorService) null, (ExecutorService) null, (ExecutorService) null, (ExecutorService) null, 31, (DefaultConstructorMarker) null);
    }

    private final void a(ExecutorService executorService) {
        try {
            executorService.awaitTermination(1500, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
        }
    }

    public final void b(t tVar, Runnable runnable) {
        int i10 = C0527b.f32340a[tVar.ordinal()];
        if (i10 == 1) {
            this.f32333a.execute(runnable);
        } else if (i10 == 2) {
            this.f32334b.execute(runnable);
        } else if (i10 == 3) {
            this.f32335c.execute(runnable);
        } else if (i10 == 4) {
            this.f32336d.execute(runnable);
        } else if (i10 == 5) {
            this.f32337e.execute(runnable);
        }
    }

    public final void c() {
        this.f32336d.shutdownNow();
        this.f32337e.shutdownNow();
        this.f32333a.shutdown();
        this.f32334b.shutdown();
        this.f32335c.shutdown();
        a(this.f32333a);
        a(this.f32334b);
        a(this.f32335c);
    }

    public final Future d(t tVar, Runnable runnable) {
        return e(tVar, Executors.callable(runnable));
    }

    public final Future e(t tVar, Callable callable) {
        FutureTask futureTask = new FutureTask(callable);
        b(tVar, futureTask);
        return new a(futureTask, tVar);
    }

    private static final class a implements Future {

        /* renamed from: a  reason: collision with root package name */
        private final FutureTask f32338a;

        /* renamed from: b  reason: collision with root package name */
        private final t f32339b;

        public a(FutureTask futureTask, t tVar) {
            this.f32338a = futureTask;
            this.f32339b = tVar;
        }

        private final void a() {
            if (!this.f32338a.isDone() && d.d(Thread.currentThread()) == this.f32339b) {
                this.f32338a.run();
            }
        }

        public boolean cancel(boolean z10) {
            return this.f32338a.cancel(z10);
        }

        public Object get() {
            a();
            return this.f32338a.get();
        }

        public boolean isCancelled() {
            return this.f32338a.isCancelled();
        }

        public boolean isDone() {
            return this.f32338a.isDone();
        }

        public Object get(long j10, TimeUnit timeUnit) {
            a();
            return this.f32338a.get(j10, timeUnit);
        }
    }

    public b(ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3, ExecutorService executorService4, ExecutorService executorService5) {
        this.f32333a = executorService;
        this.f32334b = executorService2;
        this.f32335c = executorService3;
        this.f32336d = executorService4;
        this.f32337e = executorService5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ b(java.util.concurrent.ExecutorService r4, java.util.concurrent.ExecutorService r5, java.util.concurrent.ExecutorService r6, java.util.concurrent.ExecutorService r7, java.util.concurrent.ExecutorService r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            r0 = 1
            if (r10 == 0) goto L_0x000d
            java.lang.String r4 = "Bugsnag Error thread"
            K4.t r10 = K4.t.ERROR_REQUEST
            java.util.concurrent.ExecutorService r4 = K4.d.b(r4, r10, r0)
        L_0x000d:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x0019
            java.lang.String r5 = "Bugsnag Session thread"
            K4.t r10 = K4.t.SESSION_REQUEST
            java.util.concurrent.ExecutorService r5 = K4.d.b(r5, r10, r0)
        L_0x0019:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0026
            java.lang.String r5 = "Bugsnag IO thread"
            K4.t r6 = K4.t.IO
            java.util.concurrent.ExecutorService r6 = K4.d.b(r5, r6, r0)
        L_0x0026:
            r0 = r6
            r5 = r9 & 8
            r6 = 0
            if (r5 == 0) goto L_0x0034
            java.lang.String r5 = "Bugsnag Internal Report thread"
            K4.t r7 = K4.t.INTERNAL_REPORT
            java.util.concurrent.ExecutorService r7 = K4.d.b(r5, r7, r6)
        L_0x0034:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0041
            java.lang.String r5 = "Bugsnag Default thread"
            K4.t r7 = K4.t.DEFAULT
            java.util.concurrent.ExecutorService r8 = K4.d.b(r5, r7, r6)
        L_0x0041:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K4.b.<init>(java.util.concurrent.ExecutorService, java.util.concurrent.ExecutorService, java.util.concurrent.ExecutorService, java.util.concurrent.ExecutorService, java.util.concurrent.ExecutorService, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
