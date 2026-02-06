package We;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public final class A0 implements C5662y {

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledExecutorService f65543a;

    /* renamed from: b  reason: collision with root package name */
    private final p003if.a f65544b;

    private static final class b implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private int f65545a;

        private b() {
        }

        public Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryExecutorServiceThreadFactory-");
            int i10 = this.f65545a;
            this.f65545a = i10 + 1;
            sb2.append(i10);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    A0(ScheduledExecutorService scheduledExecutorService) {
        this.f65544b = new p003if.a();
        this.f65543a = scheduledExecutorService;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r3.f65543a.shutdownNow();
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(long r4) {
        /*
            r3 = this;
            if.a r0 = r3.f65544b
            We.z r0 = r0.a()
            java.util.concurrent.ScheduledExecutorService r1 = r3.f65543a     // Catch:{ all -> 0x0023 }
            boolean r1 = r1.isShutdown()     // Catch:{ all -> 0x0023 }
            if (r1 != 0) goto L_0x0031
            java.util.concurrent.ScheduledExecutorService r1 = r3.f65543a     // Catch:{ all -> 0x0023 }
            r1.shutdown()     // Catch:{ all -> 0x0023 }
            java.util.concurrent.ScheduledExecutorService r1 = r3.f65543a     // Catch:{ InterruptedException -> 0x0025 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0025 }
            boolean r4 = r1.awaitTermination(r4, r2)     // Catch:{ InterruptedException -> 0x0025 }
            if (r4 != 0) goto L_0x0031
            java.util.concurrent.ScheduledExecutorService r4 = r3.f65543a     // Catch:{ InterruptedException -> 0x0025 }
            r4.shutdownNow()     // Catch:{ InterruptedException -> 0x0025 }
            goto L_0x0031
        L_0x0023:
            r4 = move-exception
            goto L_0x0037
        L_0x0025:
            java.util.concurrent.ScheduledExecutorService r4 = r3.f65543a     // Catch:{ all -> 0x0023 }
            r4.shutdownNow()     // Catch:{ all -> 0x0023 }
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0023 }
            r4.interrupt()     // Catch:{ all -> 0x0023 }
        L_0x0031:
            if (r0 == 0) goto L_0x0036
            r0.close()
        L_0x0036:
            return
        L_0x0037:
            if (r0 == 0) goto L_0x0041
            r0.close()     // Catch:{ all -> 0x003d }
            goto L_0x0041
        L_0x003d:
            r5 = move-exception
            r4.addSuppressed(r5)
        L_0x0041:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: We.A0.a(long):void");
    }

    public Future submit(Runnable runnable) {
        return this.f65543a.submit(runnable);
    }

    public A0() {
        this(Executors.newSingleThreadScheduledExecutor(new b()));
    }
}
