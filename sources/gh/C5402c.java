package Gh;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;

/* renamed from: Gh.c  reason: case insensitive filesystem */
public class C5402c extends X {
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final a f63271i = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final ReentrantLock f63272j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final Condition f63273k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final long f63274l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final long f63275m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static C5402c f63276n;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f63277f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public C5402c f63278g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public long f63279h;

    /* renamed from: Gh.c$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final void f(C5402c cVar, long j10, boolean z10) {
            if (C5402c.f63276n == null) {
                C5402c.f63276n = new C5402c();
                new b().start();
            }
            long nanoTime = System.nanoTime();
            int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
            if (i10 != 0 && z10) {
                cVar.f63279h = Math.min(j10, cVar.c() - nanoTime) + nanoTime;
            } else if (i10 != 0) {
                cVar.f63279h = j10 + nanoTime;
            } else if (z10) {
                cVar.f63279h = cVar.c();
            } else {
                throw new AssertionError();
            }
            long q10 = cVar.y(nanoTime);
            C5402c k10 = C5402c.f63276n;
            C6496s.e(k10);
            while (k10.f63278g != null) {
                C5402c o10 = k10.f63278g;
                C6496s.e(o10);
                if (q10 < o10.y(nanoTime)) {
                    break;
                }
                k10 = k10.f63278g;
                C6496s.e(k10);
            }
            cVar.f63278g = k10.f63278g;
            k10.f63278g = cVar;
            if (k10 == C5402c.f63276n) {
                d().signal();
            }
        }

        /* access modifiers changed from: private */
        public final void g(C5402c cVar) {
            for (C5402c k10 = C5402c.f63276n; k10 != null; k10 = k10.f63278g) {
                if (k10.f63278g == cVar) {
                    k10.f63278g = cVar.f63278g;
                    cVar.f63278g = null;
                    return;
                }
            }
            throw new IllegalStateException("node was not found in the queue");
        }

        public final C5402c c() {
            C5402c k10 = C5402c.f63276n;
            C6496s.e(k10);
            C5402c o10 = k10.f63278g;
            if (o10 == null) {
                long nanoTime = System.nanoTime();
                d().await(C5402c.f63274l, TimeUnit.MILLISECONDS);
                C5402c k11 = C5402c.f63276n;
                C6496s.e(k11);
                if (k11.f63278g != null || System.nanoTime() - nanoTime < C5402c.f63275m) {
                    return null;
                }
                return C5402c.f63276n;
            }
            long q10 = o10.y(System.nanoTime());
            if (q10 > 0) {
                d().await(q10, TimeUnit.NANOSECONDS);
                return null;
            }
            C5402c k12 = C5402c.f63276n;
            C6496s.e(k12);
            k12.f63278g = o10.f63278g;
            o10.f63278g = null;
            o10.f63277f = 2;
            return o10;
        }

        public final Condition d() {
            return C5402c.f63273k;
        }

        public final ReentrantLock e() {
            return C5402c.f63272j;
        }

        private a() {
        }
    }

    /* renamed from: Gh.c$b */
    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|(5:5|6|7|19|8)(5:10|11|12|13|(2:15|23)(1:22))|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
            r0.unlock();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:18:0x0000, LOOP_START, MTH_ENTER_BLOCK, SYNTHETIC, Splitter:B:0:0x0000] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                Gh.c$a r0 = Gh.C5402c.f63271i     // Catch:{ InterruptedException -> 0x0000 }
                java.util.concurrent.locks.ReentrantLock r0 = r0.e()     // Catch:{ InterruptedException -> 0x0000 }
                r0.lock()     // Catch:{ InterruptedException -> 0x0000 }
                Gh.c$a r1 = Gh.C5402c.f63271i     // Catch:{ all -> 0x0024 }
                Gh.c r1 = r1.c()     // Catch:{ all -> 0x0024 }
                Gh.c r2 = Gh.C5402c.f63276n     // Catch:{ all -> 0x0024 }
                if (r1 != r2) goto L_0x0026
                Gh.C5402c.a unused = Gh.C5402c.f63271i     // Catch:{ all -> 0x0024 }
                r1 = 0
                Gh.C5402c.f63276n = r1     // Catch:{ all -> 0x0024 }
                r0.unlock()     // Catch:{ InterruptedException -> 0x0000 }
                return
            L_0x0024:
                r1 = move-exception
                goto L_0x0031
            L_0x0026:
                lf.M r2 = lf.C6514M.f71813a     // Catch:{ all -> 0x0024 }
                r0.unlock()     // Catch:{ InterruptedException -> 0x0000 }
                if (r1 == 0) goto L_0x0000
                r1.B()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0031:
                r0.unlock()     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: Gh.C5402c.b.run():void");
        }
    }

    /* renamed from: Gh.c$c  reason: collision with other inner class name */
    public static final class C0938c implements U {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5402c f63280a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ U f63281b;

        C0938c(C5402c cVar, U u10) {
            this.f63280a = cVar;
            this.f63281b = u10;
        }

        public void P(C5404e eVar, long j10) {
            C6496s.h(eVar, "source");
            C5401b.b(eVar.B0(), 0, j10);
            while (true) {
                long j11 = 0;
                if (j10 > 0) {
                    Q q10 = eVar.f63284a;
                    C6496s.e(q10);
                    while (true) {
                        if (j11 >= 65536) {
                            break;
                        }
                        j11 += (long) (q10.f63243c - q10.f63242b);
                        if (j11 >= j10) {
                            j11 = j10;
                            break;
                        } else {
                            q10 = q10.f63246f;
                            C6496s.e(q10);
                        }
                    }
                    C5402c cVar = this.f63280a;
                    U u10 = this.f63281b;
                    cVar.v();
                    try {
                        u10.P(eVar, j11);
                        C6514M m10 = C6514M.f71813a;
                        if (!cVar.w()) {
                            j10 -= j11;
                        } else {
                            throw cVar.p((IOException) null);
                        }
                    } catch (IOException e10) {
                        e = e10;
                        if (cVar.w()) {
                            e = cVar.p(e);
                        }
                        throw e;
                    } finally {
                        cVar.w();
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        public C5402c timeout() {
            return this.f63280a;
        }

        public void close() {
            C5402c cVar = this.f63280a;
            U u10 = this.f63281b;
            cVar.v();
            try {
                u10.close();
                C6514M m10 = C6514M.f71813a;
                if (cVar.w()) {
                    throw cVar.p((IOException) null);
                }
            } catch (IOException e10) {
                e = e10;
                if (cVar.w()) {
                    e = cVar.p(e);
                }
                throw e;
            } finally {
                cVar.w();
            }
        }

        public void flush() {
            C5402c cVar = this.f63280a;
            U u10 = this.f63281b;
            cVar.v();
            try {
                u10.flush();
                C6514M m10 = C6514M.f71813a;
                if (cVar.w()) {
                    throw cVar.p((IOException) null);
                }
            } catch (IOException e10) {
                e = e10;
                if (cVar.w()) {
                    e = cVar.p(e);
                }
                throw e;
            } finally {
                cVar.w();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f63281b + ')';
        }
    }

    /* renamed from: Gh.c$d */
    public static final class d implements W {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5402c f63282a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ W f63283b;

        d(C5402c cVar, W w10) {
            this.f63282a = cVar;
            this.f63283b = w10;
        }

        /* renamed from: a */
        public C5402c timeout() {
            return this.f63282a;
        }

        public void close() {
            C5402c cVar = this.f63282a;
            W w10 = this.f63283b;
            cVar.v();
            try {
                w10.close();
                C6514M m10 = C6514M.f71813a;
                if (cVar.w()) {
                    throw cVar.p((IOException) null);
                }
            } catch (IOException e10) {
                e = e10;
                if (cVar.w()) {
                    e = cVar.p(e);
                }
                throw e;
            } finally {
                cVar.w();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f63283b + ')';
        }

        public long y1(C5404e eVar, long j10) {
            C6496s.h(eVar, "sink");
            C5402c cVar = this.f63282a;
            W w10 = this.f63283b;
            cVar.v();
            try {
                long y12 = w10.y1(eVar, j10);
                if (!cVar.w()) {
                    return y12;
                }
                throw cVar.p((IOException) null);
            } catch (IOException e10) {
                e = e10;
                if (cVar.w()) {
                    e = cVar.p(e);
                }
                throw e;
            } finally {
                cVar.w();
            }
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f63272j = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        C6496s.g(newCondition, "newCondition(...)");
        f63273k = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60);
        f63274l = millis;
        f63275m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* access modifiers changed from: private */
    public final long y(long j10) {
        return this.f63279h - j10;
    }

    public final W A(W w10) {
        C6496s.h(w10, "source");
        return new d(this, w10);
    }

    public final IOException p(IOException iOException) {
        return x(iOException);
    }

    public final void v() {
        long h10 = h();
        boolean e10 = e();
        if (h10 != 0 || e10) {
            ReentrantLock reentrantLock = f63272j;
            reentrantLock.lock();
            try {
                if (this.f63277f == 0) {
                    this.f63277f = 1;
                    f63271i.f(this, h10, e10);
                    C6514M m10 = C6514M.f71813a;
                    return;
                }
                throw new IllegalStateException("Unbalanced enter/exit");
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean w() {
        ReentrantLock reentrantLock = f63272j;
        reentrantLock.lock();
        try {
            int i10 = this.f63277f;
            boolean z10 = false;
            this.f63277f = 0;
            if (i10 == 1) {
                f63271i.g(this);
                return false;
            }
            if (i10 == 2) {
                z10 = true;
            }
            reentrantLock.unlock();
            return z10;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public IOException x(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final U z(U u10) {
        C6496s.h(u10, "sink");
        return new C0938c(this, u10);
    }

    /* access modifiers changed from: protected */
    public void B() {
    }
}
