package wh;

import Bh.j;
import Gh.C5402c;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import rh.C;
import rh.C6703A;
import rh.C6704a;
import rh.C6708e;
import rh.C6709f;
import rh.C6710g;
import rh.E;
import rh.p;
import rh.r;
import rh.v;
import sh.C6726e;
import xh.g;

/* renamed from: wh.e  reason: case insensitive filesystem */
public final class C6775e implements C6708e {

    /* renamed from: a  reason: collision with root package name */
    private final C6703A f73805a;

    /* renamed from: b  reason: collision with root package name */
    private final C f73806b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f73807c;

    /* renamed from: d  reason: collision with root package name */
    private final C6777g f73808d;

    /* renamed from: e  reason: collision with root package name */
    private final r f73809e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final c f73810f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicBoolean f73811g = new AtomicBoolean();

    /* renamed from: h  reason: collision with root package name */
    private Object f73812h;

    /* renamed from: i  reason: collision with root package name */
    private C6774d f73813i;

    /* renamed from: j  reason: collision with root package name */
    private C6776f f73814j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f73815k;

    /* renamed from: l  reason: collision with root package name */
    private C6773c f73816l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f73817m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f73818n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f73819o = true;

    /* renamed from: p  reason: collision with root package name */
    private volatile boolean f73820p;

    /* renamed from: q  reason: collision with root package name */
    private volatile C6773c f73821q;

    /* renamed from: r  reason: collision with root package name */
    private volatile C6776f f73822r;

    /* renamed from: wh.e$a */
    public final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final C6709f f73823a;

        /* renamed from: b  reason: collision with root package name */
        private volatile AtomicInteger f73824b = new AtomicInteger(0);

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6775e f73825c;

        public a(C6775e eVar, C6709f fVar) {
            C6496s.h(fVar, "responseCallback");
            this.f73825c = eVar;
            this.f73823a = fVar;
        }

        public final void a(ExecutorService executorService) {
            C6496s.h(executorService, "executorService");
            p q10 = this.f73825c.l().q();
            if (!C6726e.f73547h || !Thread.holdsLock(q10)) {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    this.f73825c.w(interruptedIOException);
                    this.f73823a.onFailure(this.f73825c, interruptedIOException);
                    this.f73825c.l().q().f(this);
                } catch (Throwable th2) {
                    this.f73825c.l().q().f(this);
                    throw th2;
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + q10);
            }
        }

        public final C6775e b() {
            return this.f73825c;
        }

        public final AtomicInteger c() {
            return this.f73824b;
        }

        public final String d() {
            return this.f73825c.r().l().i();
        }

        public final void e(a aVar) {
            C6496s.h(aVar, "other");
            this.f73824b = aVar.f73824b;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0053 A[Catch:{ all -> 0x0072, all -> 0x0043 }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x007b A[Catch:{ all -> 0x0072, all -> 0x0043 }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x009b A[Catch:{ all -> 0x0072, all -> 0x0043 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r8 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "OkHttp "
                r0.append(r1)
                wh.e r1 = r8.f73825c
                java.lang.String r1 = r1.x()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                wh.e r1 = r8.f73825c
                java.lang.Thread r2 = java.lang.Thread.currentThread()
                java.lang.String r3 = r2.getName()
                r2.setName(r0)
                wh.e$c r0 = r1.f73810f     // Catch:{ all -> 0x0043 }
                r0.v()     // Catch:{ all -> 0x0043 }
                r0 = 0
                rh.E r0 = r1.s()     // Catch:{ IOException -> 0x0075, all -> 0x004a }
                r4 = 1
                rh.f r5 = r8.f73823a     // Catch:{ IOException -> 0x0048, all -> 0x0046 }
                r5.onResponse(r1, r0)     // Catch:{ IOException -> 0x0048, all -> 0x0046 }
                rh.A r0 = r1.l()     // Catch:{ all -> 0x0043 }
                rh.p r0 = r0.q()     // Catch:{ all -> 0x0043 }
            L_0x003e:
                r0.f(r8)     // Catch:{ all -> 0x0043 }
                goto L_0x00a9
            L_0x0043:
                r0 = move-exception
                goto L_0x00b9
            L_0x0046:
                r0 = move-exception
                goto L_0x004e
            L_0x0048:
                r0 = move-exception
                goto L_0x0079
            L_0x004a:
                r4 = move-exception
                r7 = r4
                r4 = r0
                r0 = r7
            L_0x004e:
                r1.cancel()     // Catch:{ all -> 0x0072 }
                if (r4 != 0) goto L_0x0074
                java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0072 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0072 }
                r5.<init>()     // Catch:{ all -> 0x0072 }
                java.lang.String r6 = "canceled due to "
                r5.append(r6)     // Catch:{ all -> 0x0072 }
                r5.append(r0)     // Catch:{ all -> 0x0072 }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0072 }
                r4.<init>(r5)     // Catch:{ all -> 0x0072 }
                lf.C6523g.a(r4, r0)     // Catch:{ all -> 0x0072 }
                rh.f r5 = r8.f73823a     // Catch:{ all -> 0x0072 }
                r5.onFailure(r1, r4)     // Catch:{ all -> 0x0072 }
                goto L_0x0074
            L_0x0072:
                r0 = move-exception
                goto L_0x00ad
            L_0x0074:
                throw r0     // Catch:{ all -> 0x0072 }
            L_0x0075:
                r4 = move-exception
                r7 = r4
                r4 = r0
                r0 = r7
            L_0x0079:
                if (r4 == 0) goto L_0x009b
                Bh.j$a r4 = Bh.j.f62626a     // Catch:{ all -> 0x0072 }
                Bh.j r4 = r4.g()     // Catch:{ all -> 0x0072 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0072 }
                r5.<init>()     // Catch:{ all -> 0x0072 }
                java.lang.String r6 = "Callback failure for "
                r5.append(r6)     // Catch:{ all -> 0x0072 }
                java.lang.String r6 = r1.E()     // Catch:{ all -> 0x0072 }
                r5.append(r6)     // Catch:{ all -> 0x0072 }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0072 }
                r6 = 4
                r4.k(r5, r6, r0)     // Catch:{ all -> 0x0072 }
                goto L_0x00a0
            L_0x009b:
                rh.f r4 = r8.f73823a     // Catch:{ all -> 0x0072 }
                r4.onFailure(r1, r0)     // Catch:{ all -> 0x0072 }
            L_0x00a0:
                rh.A r0 = r1.l()     // Catch:{ all -> 0x0043 }
                rh.p r0 = r0.q()     // Catch:{ all -> 0x0043 }
                goto L_0x003e
            L_0x00a9:
                r2.setName(r3)
                return
            L_0x00ad:
                rh.A r1 = r1.l()     // Catch:{ all -> 0x0043 }
                rh.p r1 = r1.q()     // Catch:{ all -> 0x0043 }
                r1.f(r8)     // Catch:{ all -> 0x0043 }
                throw r0     // Catch:{ all -> 0x0043 }
            L_0x00b9:
                r2.setName(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: wh.C6775e.a.run():void");
        }
    }

    /* renamed from: wh.e$b */
    public static final class b extends WeakReference {

        /* renamed from: a  reason: collision with root package name */
        private final Object f73826a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C6775e eVar, Object obj) {
            super(eVar);
            C6496s.h(eVar, "referent");
            this.f73826a = obj;
        }

        public final Object a() {
            return this.f73826a;
        }
    }

    /* renamed from: wh.e$c */
    public static final class c extends C5402c {

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ C6775e f73827o;

        c(C6775e eVar) {
            this.f73827o = eVar;
        }

        /* access modifiers changed from: protected */
        public void B() {
            this.f73827o.cancel();
        }
    }

    public C6775e(C6703A a10, C c10, boolean z10) {
        C6496s.h(a10, "client");
        C6496s.h(c10, "originalRequest");
        this.f73805a = a10;
        this.f73806b = c10;
        this.f73807c = z10;
        this.f73808d = a10.m().a();
        this.f73809e = a10.s().a(this);
        c cVar = new c(this);
        cVar.g((long) a10.i(), TimeUnit.MILLISECONDS);
        this.f73810f = cVar;
    }

    private final IOException D(IOException iOException) {
        if (this.f73815k || !this.f73810f.w()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* access modifiers changed from: private */
    public final String E() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (isCanceled()) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb2.append(str);
        if (this.f73807c) {
            str2 = "web socket";
        } else {
            str2 = "call";
        }
        sb2.append(str2);
        sb2.append(" to ");
        sb2.append(x());
        return sb2.toString();
    }

    private final IOException e(IOException iOException) {
        Socket y10;
        boolean z10 = C6726e.f73547h;
        if (!z10 || !Thread.holdsLock(this)) {
            C6776f fVar = this.f73814j;
            if (fVar != null) {
                if (!z10 || !Thread.holdsLock(fVar)) {
                    synchronized (fVar) {
                        y10 = y();
                    }
                    if (this.f73814j == null) {
                        if (y10 != null) {
                            C6726e.n(y10);
                        }
                        this.f73809e.l(this, fVar);
                    } else if (y10 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                } else {
                    throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + fVar);
                }
            }
            IOException D10 = D(iOException);
            if (iOException != null) {
                r rVar = this.f73809e;
                C6496s.e(D10);
                rVar.e(this, D10);
            } else {
                this.f73809e.d(this);
            }
            return D10;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    private final void g() {
        this.f73812h = j.f62626a.g().i("response.body().close()");
        this.f73809e.f(this);
    }

    private final C6704a i(v vVar) {
        C6710g gVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (vVar.j()) {
            sSLSocketFactory = this.f73805a.L();
            hostnameVerifier = this.f73805a.x();
            gVar = this.f73805a.k();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        return new C6704a(vVar.i(), vVar.o(), this.f73805a.r(), this.f73805a.K(), sSLSocketFactory, hostnameVerifier, gVar, this.f73805a.G(), this.f73805a.F(), this.f73805a.E(), this.f73805a.o(), this.f73805a.H());
    }

    public final void A(C6776f fVar) {
        this.f73822r = fVar;
    }

    /* renamed from: B */
    public C5402c timeout() {
        return this.f73810f;
    }

    public final void C() {
        if (!this.f73815k) {
            this.f73815k = true;
            this.f73810f.w();
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public E b() {
        if (this.f73811g.compareAndSet(false, true)) {
            this.f73810f.v();
            g();
            try {
                this.f73805a.q().b(this);
                return s();
            } finally {
                this.f73805a.q().g(this);
            }
        } else {
            throw new IllegalStateException("Already Executed");
        }
    }

    public void cancel() {
        if (!this.f73820p) {
            this.f73820p = true;
            C6773c cVar = this.f73821q;
            if (cVar != null) {
                cVar.b();
            }
            C6776f fVar = this.f73822r;
            if (fVar != null) {
                fVar.d();
            }
            this.f73809e.g(this);
        }
    }

    public final void d(C6776f fVar) {
        C6496s.h(fVar, "connection");
        if (C6726e.f73547h && !Thread.holdsLock(fVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
        } else if (this.f73814j == null) {
            this.f73814j = fVar;
            fVar.n().add(new b(this, this.f73812h));
        } else {
            throw new IllegalStateException("Check failed.");
        }
    }

    public void f0(C6709f fVar) {
        C6496s.h(fVar, "responseCallback");
        if (this.f73811g.compareAndSet(false, true)) {
            g();
            this.f73805a.q().a(new a(this, fVar));
            return;
        }
        throw new IllegalStateException("Already Executed");
    }

    /* renamed from: h */
    public C6775e clone() {
        return new C6775e(this.f73805a, this.f73806b, this.f73807c);
    }

    public boolean isCanceled() {
        return this.f73820p;
    }

    public final void j(C c10, boolean z10) {
        C6496s.h(c10, "request");
        if (this.f73816l == null) {
            synchronized (this) {
                if (this.f73818n) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                } else if (!this.f73817m) {
                    C6514M m10 = C6514M.f71813a;
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            }
            if (z10) {
                this.f73813i = new C6774d(this.f73808d, i(c10.l()), this, this.f73809e);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void k(boolean z10) {
        C6773c cVar;
        synchronized (this) {
            if (this.f73819o) {
                C6514M m10 = C6514M.f71813a;
            } else {
                throw new IllegalStateException("released");
            }
        }
        if (z10 && (cVar = this.f73821q) != null) {
            cVar.d();
        }
        this.f73816l = null;
    }

    public final C6703A l() {
        return this.f73805a;
    }

    public final C6776f m() {
        return this.f73814j;
    }

    public final r o() {
        return this.f73809e;
    }

    public final boolean p() {
        return this.f73807c;
    }

    public final C6773c q() {
        return this.f73816l;
    }

    public final C r() {
        return this.f73806b;
    }

    public C request() {
        return this.f73806b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final rh.E s() {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            rh.A r0 = r11.f73805a
            java.util.List r0 = r0.y()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            mf.C6565s.D(r2, r0)
            xh.j r0 = new xh.j
            rh.A r1 = r11.f73805a
            r0.<init>(r1)
            r2.add(r0)
            xh.a r0 = new xh.a
            rh.A r1 = r11.f73805a
            rh.n r1 = r1.p()
            r0.<init>(r1)
            r2.add(r0)
            uh.a r0 = new uh.a
            rh.A r1 = r11.f73805a
            rh.c r1 = r1.h()
            r0.<init>(r1)
            r2.add(r0)
            wh.a r0 = wh.C6771a.f73772a
            r2.add(r0)
            boolean r0 = r11.f73807c
            if (r0 != 0) goto L_0x004a
            rh.A r0 = r11.f73805a
            java.util.List r0 = r0.A()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            mf.C6565s.D(r2, r0)
        L_0x004a:
            xh.b r0 = new xh.b
            boolean r1 = r11.f73807c
            r0.<init>(r1)
            r2.add(r0)
            xh.g r9 = new xh.g
            rh.C r5 = r11.f73806b
            rh.A r0 = r11.f73805a
            int r6 = r0.l()
            rh.A r0 = r11.f73805a
            int r7 = r0.I()
            rh.A r0 = r11.f73805a
            int r8 = r0.N()
            r3 = 0
            r4 = 0
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            rh.C r2 = r11.f73806b     // Catch:{ IOException -> 0x0090, all -> 0x008e }
            rh.E r2 = r9.a(r2)     // Catch:{ IOException -> 0x0090, all -> 0x008e }
            boolean r3 = r11.isCanceled()     // Catch:{ IOException -> 0x0090, all -> 0x008e }
            if (r3 != 0) goto L_0x0083
            r11.w(r0)
            return r2
        L_0x0083:
            sh.C6726e.m(r2)     // Catch:{ IOException -> 0x0090, all -> 0x008e }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0090, all -> 0x008e }
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0090, all -> 0x008e }
            throw r2     // Catch:{ IOException -> 0x0090, all -> 0x008e }
        L_0x008e:
            r2 = move-exception
            goto L_0x00a0
        L_0x0090:
            r1 = move-exception
            r2 = 1
            java.io.IOException r1 = r11.w(r1)     // Catch:{ all -> 0x009c }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            kotlin.jvm.internal.C6496s.f(r1, r3)     // Catch:{ all -> 0x009c }
            throw r1     // Catch:{ all -> 0x009c }
        L_0x009c:
            r1 = move-exception
            r10 = r2
            r2 = r1
            r1 = r10
        L_0x00a0:
            if (r1 != 0) goto L_0x00a5
            r11.w(r0)
        L_0x00a5:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.C6775e.s():rh.E");
    }

    public final C6773c t(g gVar) {
        C6496s.h(gVar, "chain");
        synchronized (this) {
            if (!this.f73819o) {
                throw new IllegalStateException("released");
            } else if (this.f73818n) {
                throw new IllegalStateException("Check failed.");
            } else if (!this.f73817m) {
                C6514M m10 = C6514M.f71813a;
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
        C6774d dVar = this.f73813i;
        C6496s.e(dVar);
        C6773c cVar = new C6773c(this, this.f73809e, dVar, dVar.a(this.f73805a, gVar));
        this.f73816l = cVar;
        this.f73821q = cVar;
        synchronized (this) {
            this.f73817m = true;
            this.f73818n = true;
        }
        if (!this.f73820p) {
            return cVar;
        }
        throw new IOException("Canceled");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0021 A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0025 A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0030 A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0032 A[Catch:{ all -> 0x0017 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.IOException u(wh.C6773c r2, boolean r3, boolean r4, java.io.IOException r5) {
        /*
            r1 = this;
            java.lang.String r0 = "exchange"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            wh.c r0 = r1.f73821q
            boolean r2 = kotlin.jvm.internal.C6496s.c(r2, r0)
            if (r2 != 0) goto L_0x000e
            return r5
        L_0x000e:
            monitor-enter(r1)
            r2 = 0
            if (r3 == 0) goto L_0x0019
            boolean r0 = r1.f73817m     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x001f
            goto L_0x0019
        L_0x0017:
            r2 = move-exception
            goto L_0x0059
        L_0x0019:
            if (r4 == 0) goto L_0x0041
            boolean r0 = r1.f73818n     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0041
        L_0x001f:
            if (r3 == 0) goto L_0x0023
            r1.f73817m = r2     // Catch:{ all -> 0x0017 }
        L_0x0023:
            if (r4 == 0) goto L_0x0027
            r1.f73818n = r2     // Catch:{ all -> 0x0017 }
        L_0x0027:
            boolean r3 = r1.f73817m     // Catch:{ all -> 0x0017 }
            r4 = 1
            if (r3 != 0) goto L_0x0032
            boolean r0 = r1.f73818n     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0032
            r0 = r4
            goto L_0x0033
        L_0x0032:
            r0 = r2
        L_0x0033:
            if (r3 != 0) goto L_0x003e
            boolean r3 = r1.f73818n     // Catch:{ all -> 0x0017 }
            if (r3 != 0) goto L_0x003e
            boolean r3 = r1.f73819o     // Catch:{ all -> 0x0017 }
            if (r3 != 0) goto L_0x003e
            r2 = r4
        L_0x003e:
            r3 = r2
            r2 = r0
            goto L_0x0042
        L_0x0041:
            r3 = r2
        L_0x0042:
            lf.M r4 = lf.C6514M.f71813a     // Catch:{ all -> 0x0017 }
            monitor-exit(r1)
            if (r2 == 0) goto L_0x0051
            r2 = 0
            r1.f73821q = r2
            wh.f r2 = r1.f73814j
            if (r2 == 0) goto L_0x0051
            r2.s()
        L_0x0051:
            if (r3 == 0) goto L_0x0058
            java.io.IOException r2 = r1.e(r5)
            return r2
        L_0x0058:
            return r5
        L_0x0059:
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.C6775e.u(wh.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException w(IOException iOException) {
        boolean z10;
        synchronized (this) {
            try {
                z10 = false;
                if (this.f73819o) {
                    this.f73819o = false;
                    if (!this.f73817m && !this.f73818n) {
                        z10 = true;
                    }
                }
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            return e(iOException);
        }
        return iOException;
    }

    public final String x() {
        return this.f73806b.l().q();
    }

    public final Socket y() {
        C6776f fVar = this.f73814j;
        C6496s.e(fVar);
        if (!C6726e.f73547h || Thread.holdsLock(fVar)) {
            List n10 = fVar.n();
            Iterator it = n10.iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                } else if (C6496s.c(((Reference) it.next()).get(), this)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 != -1) {
                n10.remove(i10);
                this.f73814j = null;
                if (n10.isEmpty()) {
                    fVar.C(System.nanoTime());
                    if (this.f73808d.c(fVar)) {
                        return fVar.E();
                    }
                }
                return null;
            }
            throw new IllegalStateException("Check failed.");
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
    }

    public final boolean z() {
        C6774d dVar = this.f73813i;
        C6496s.e(dVar);
        return dVar.e();
    }
}
