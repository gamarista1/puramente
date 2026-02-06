package V4;

import T4.f;
import V4.p;
import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import o5.e;
import o5.k;

final class a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f34435a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f34436b;

    /* renamed from: c  reason: collision with root package name */
    final Map f34437c;

    /* renamed from: d  reason: collision with root package name */
    private final ReferenceQueue f34438d;

    /* renamed from: e  reason: collision with root package name */
    private p.a f34439e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f34440f;

    /* renamed from: V4.a$a  reason: collision with other inner class name */
    class C0559a implements ThreadFactory {

        /* renamed from: V4.a$a$a  reason: collision with other inner class name */
        class C0560a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Runnable f34441a;

            C0560a(Runnable runnable) {
                this.f34441a = runnable;
            }

            public void run() {
                Process.setThreadPriority(10);
                this.f34441a.run();
            }
        }

        C0559a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(new C0560a(runnable), "glide-active-resources");
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            a.this.b();
        }
    }

    static final class c extends WeakReference {

        /* renamed from: a  reason: collision with root package name */
        final f f34444a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f34445b;

        /* renamed from: c  reason: collision with root package name */
        v f34446c;

        c(f fVar, p pVar, ReferenceQueue referenceQueue, boolean z10) {
            super(pVar, referenceQueue);
            v vVar;
            this.f34444a = (f) k.d(fVar);
            if (!pVar.d() || !z10) {
                vVar = null;
            } else {
                vVar = (v) k.d(pVar.c());
            }
            this.f34446c = vVar;
            this.f34445b = pVar.d();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f34446c = null;
            clear();
        }
    }

    a(boolean z10) {
        this(z10, Executors.newSingleThreadExecutor(new C0559a()));
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(f fVar, p pVar) {
        c cVar = (c) this.f34437c.put(fVar, new c(fVar, pVar, this.f34438d, this.f34435a));
        if (cVar != null) {
            cVar.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        while (!this.f34440f) {
            try {
                c((c) this.f34438d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(c cVar) {
        synchronized (this) {
            this.f34437c.remove(cVar.f34444a);
            if (cVar.f34445b) {
                v vVar = cVar.f34446c;
                if (vVar != null) {
                    this.f34439e.d(cVar.f34444a, new p(vVar, true, false, cVar.f34444a, this.f34439e));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void d(f fVar) {
        c cVar = (c) this.f34437c.remove(fVar);
        if (cVar != null) {
            cVar.a();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized V4.p e(T4.f r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map r0 = r1.f34437c     // Catch:{ all -> 0x001a }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001a }
            V4.a$c r2 = (V4.a.c) r2     // Catch:{ all -> 0x001a }
            if (r2 != 0) goto L_0x000e
            monitor-exit(r1)
            r2 = 0
            return r2
        L_0x000e:
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x001a }
            V4.p r0 = (V4.p) r0     // Catch:{ all -> 0x001a }
            if (r0 != 0) goto L_0x001c
            r1.c(r2)     // Catch:{ all -> 0x001a }
            goto L_0x001c
        L_0x001a:
            r2 = move-exception
            goto L_0x001e
        L_0x001c:
            monitor-exit(r1)
            return r0
        L_0x001e:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: V4.a.e(T4.f):V4.p");
    }

    /* access modifiers changed from: package-private */
    public void f(p.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f34439e = aVar;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        this.f34440f = true;
        Executor executor = this.f34436b;
        if (executor instanceof ExecutorService) {
            e.c((ExecutorService) executor);
        }
    }

    a(boolean z10, Executor executor) {
        this.f34437c = new HashMap();
        this.f34438d = new ReferenceQueue();
        this.f34435a = z10;
        this.f34436b = executor;
        executor.execute(new b());
    }
}
