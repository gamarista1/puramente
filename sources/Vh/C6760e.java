package vh;

import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import sh.C6726e;

/* renamed from: vh.e  reason: case insensitive filesystem */
public final class C6760e {

    /* renamed from: h  reason: collision with root package name */
    public static final b f73694h = new b((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    public static final C6760e f73695i = new C6760e(new c(C6726e.N(C6726e.f73548i + " TaskRunner", true)));
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final Logger f73696j;

    /* renamed from: a  reason: collision with root package name */
    private final a f73697a;

    /* renamed from: b  reason: collision with root package name */
    private int f73698b = 10000;

    /* renamed from: c  reason: collision with root package name */
    private boolean f73699c;

    /* renamed from: d  reason: collision with root package name */
    private long f73700d;

    /* renamed from: e  reason: collision with root package name */
    private final List f73701e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final List f73702f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f73703g = new d(this);

    /* renamed from: vh.e$a */
    public interface a {
        void a(C6760e eVar, long j10);

        long b();

        void c(C6760e eVar);

        void execute(Runnable runnable);
    }

    /* renamed from: vh.e$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger a() {
            return C6760e.f73696j;
        }

        private b() {
        }
    }

    /* renamed from: vh.e$c */
    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        private final ThreadPoolExecutor f73704a;

        public c(ThreadFactory threadFactory) {
            C6496s.h(threadFactory, "threadFactory");
            this.f73704a = new ThreadPoolExecutor(0, a.e.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        public void a(C6760e eVar, long j10) {
            C6496s.h(eVar, "taskRunner");
            long j11 = j10 / 1000000;
            long j12 = j10 - (1000000 * j11);
            if (j11 > 0 || j10 > 0) {
                eVar.wait(j11, (int) j12);
            }
        }

        public long b() {
            return System.nanoTime();
        }

        public void c(C6760e eVar) {
            C6496s.h(eVar, "taskRunner");
            eVar.notify();
        }

        public void execute(Runnable runnable) {
            C6496s.h(runnable, "runnable");
            this.f73704a.execute(runnable);
        }
    }

    /* renamed from: vh.e$d */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6760e f73705a;

        d(C6760e eVar) {
            this.f73705a = eVar;
        }

        public void run() {
            C6756a d10;
            long j10;
            while (true) {
                C6760e eVar = this.f73705a;
                synchronized (eVar) {
                    d10 = eVar.d();
                }
                if (d10 != null) {
                    C6759d d11 = d10.d();
                    C6496s.e(d11);
                    C6760e eVar2 = this.f73705a;
                    boolean isLoggable = C6760e.f73694h.a().isLoggable(Level.FINE);
                    if (isLoggable) {
                        j10 = d11.h().g().b();
                        C6757b.c(d10, d11, "starting");
                    } else {
                        j10 = -1;
                    }
                    try {
                        eVar2.j(d10);
                        C6514M m10 = C6514M.f71813a;
                        if (isLoggable) {
                            long b10 = d11.h().g().b() - j10;
                            C6757b.c(d10, d11, "finished run in " + C6757b.b(b10));
                        }
                    } catch (Throwable th2) {
                        if (isLoggable) {
                            C6757b.c(d10, d11, "failed a run in " + C6757b.b(d11.h().g().b() - j10));
                        }
                        throw th2;
                    }
                } else {
                    return;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(C6760e.class.getName());
        C6496s.g(logger, "getLogger(TaskRunner::class.java.name)");
        f73696j = logger;
    }

    public C6760e(a aVar) {
        C6496s.h(aVar, "backend");
        this.f73697a = aVar;
    }

    private final void c(C6756a aVar, long j10) {
        if (!C6726e.f73547h || Thread.holdsLock(this)) {
            C6759d d10 = aVar.d();
            C6496s.e(d10);
            if (d10.c() == aVar) {
                boolean d11 = d10.d();
                d10.m(false);
                d10.l((C6756a) null);
                this.f73701e.remove(d10);
                if (j10 != -1 && !d11 && !d10.g()) {
                    d10.k(aVar, j10, true);
                }
                if (!d10.e().isEmpty()) {
                    this.f73702f.add(d10);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Check failed.");
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    private final void e(C6756a aVar) {
        if (!C6726e.f73547h || Thread.holdsLock(this)) {
            aVar.g(-1);
            C6759d d10 = aVar.d();
            C6496s.e(d10);
            d10.e().remove(aVar);
            this.f73702f.remove(d10);
            d10.l(aVar);
            this.f73701e.add(d10);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    /* access modifiers changed from: private */
    public final void j(C6756a aVar) {
        if (!C6726e.f73547h || !Thread.holdsLock(this)) {
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName(aVar.b());
            try {
                long f10 = aVar.f();
                synchronized (this) {
                    c(aVar, f10);
                    C6514M m10 = C6514M.f71813a;
                }
                currentThread.setName(name);
            } catch (Throwable th2) {
                synchronized (this) {
                    c(aVar, -1);
                    C6514M m11 = C6514M.f71813a;
                    currentThread.setName(name);
                    throw th2;
                }
            }
        } else {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00bf */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final vh.C6756a d() {
        /*
            r14 = this;
            boolean r0 = sh.C6726e.f73547h
            if (r0 == 0) goto L_0x0032
            boolean r0 = java.lang.Thread.holdsLock(r14)
            if (r0 == 0) goto L_0x000b
            goto L_0x0032
        L_0x000b:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Thread "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST hold lock on "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0032:
            java.util.List r0 = r14.f73702f
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x003c
            return r1
        L_0x003c:
            vh.e$a r0 = r14.f73697a
            long r2 = r0.b()
            java.util.List r0 = r14.f73702f
            java.util.Iterator r0 = r0.iterator()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = r1
        L_0x004e:
            boolean r7 = r0.hasNext()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x0080
            java.lang.Object r7 = r0.next()
            vh.d r7 = (vh.C6759d) r7
            java.util.List r7 = r7.e()
            java.lang.Object r7 = r7.get(r9)
            vh.a r7 = (vh.C6756a) r7
            long r10 = r7.c()
            long r10 = r10 - r2
            r12 = 0
            long r10 = java.lang.Math.max(r12, r10)
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 <= 0) goto L_0x007a
            long r4 = java.lang.Math.min(r10, r4)
            goto L_0x004e
        L_0x007a:
            if (r6 == 0) goto L_0x007e
            r0 = r8
            goto L_0x0081
        L_0x007e:
            r6 = r7
            goto L_0x004e
        L_0x0080:
            r0 = r9
        L_0x0081:
            if (r6 == 0) goto L_0x009e
            r14.e(r6)
            if (r0 != 0) goto L_0x0096
            boolean r0 = r14.f73699c
            if (r0 != 0) goto L_0x009d
            java.util.List r0 = r14.f73702f
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x009d
        L_0x0096:
            vh.e$a r0 = r14.f73697a
            java.lang.Runnable r1 = r14.f73703g
            r0.execute(r1)
        L_0x009d:
            return r6
        L_0x009e:
            boolean r0 = r14.f73699c
            if (r0 == 0) goto L_0x00af
            long r6 = r14.f73700d
            long r6 = r6 - r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ae
            vh.e$a r0 = r14.f73697a
            r0.c(r14)
        L_0x00ae:
            return r1
        L_0x00af:
            r14.f73699c = r8
            long r2 = r2 + r4
            r14.f73700d = r2
            vh.e$a r0 = r14.f73697a     // Catch:{ InterruptedException -> 0x00bf }
            r0.a(r14, r4)     // Catch:{ InterruptedException -> 0x00bf }
        L_0x00b9:
            r14.f73699c = r9
            goto L_0x0032
        L_0x00bd:
            r0 = move-exception
            goto L_0x00c3
        L_0x00bf:
            r14.f()     // Catch:{ all -> 0x00bd }
            goto L_0x00b9
        L_0x00c3:
            r14.f73699c = r9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vh.C6760e.d():vh.a");
    }

    public final void f() {
        int size = this.f73701e.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            }
            ((C6759d) this.f73701e.get(size)).b();
        }
        for (int size2 = this.f73702f.size() - 1; -1 < size2; size2--) {
            C6759d dVar = (C6759d) this.f73702f.get(size2);
            dVar.b();
            if (dVar.e().isEmpty()) {
                this.f73702f.remove(size2);
            }
        }
    }

    public final a g() {
        return this.f73697a;
    }

    public final void h(C6759d dVar) {
        C6496s.h(dVar, "taskQueue");
        if (!C6726e.f73547h || Thread.holdsLock(this)) {
            if (dVar.c() == null) {
                if (!dVar.e().isEmpty()) {
                    C6726e.c(this.f73702f, dVar);
                } else {
                    this.f73702f.remove(dVar);
                }
            }
            if (this.f73699c) {
                this.f73697a.c(this);
            } else {
                this.f73697a.execute(this.f73703g);
            }
        } else {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
    }

    public final C6759d i() {
        int i10;
        synchronized (this) {
            i10 = this.f73698b;
            this.f73698b = i10 + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('Q');
        sb2.append(i10);
        return new C6759d(this, sb2.toString());
    }
}
