package zh;

import Gh.C5402c;
import Gh.C5404e;
import Gh.C5406g;
import Gh.U;
import Gh.W;
import Gh.X;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import rh.u;
import sh.C6726e;

public final class i {

    /* renamed from: o  reason: collision with root package name */
    public static final a f74159o = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f74160a;

    /* renamed from: b  reason: collision with root package name */
    private final f f74161b;

    /* renamed from: c  reason: collision with root package name */
    private long f74162c;

    /* renamed from: d  reason: collision with root package name */
    private long f74163d;

    /* renamed from: e  reason: collision with root package name */
    private long f74164e;

    /* renamed from: f  reason: collision with root package name */
    private long f74165f;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayDeque f74166g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f74167h;

    /* renamed from: i  reason: collision with root package name */
    private final c f74168i;

    /* renamed from: j  reason: collision with root package name */
    private final b f74169j;

    /* renamed from: k  reason: collision with root package name */
    private final d f74170k = new d();

    /* renamed from: l  reason: collision with root package name */
    private final d f74171l = new d();

    /* renamed from: m  reason: collision with root package name */
    private C6844b f74172m;

    /* renamed from: n  reason: collision with root package name */
    private IOException f74173n;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final class b implements U {

        /* renamed from: a  reason: collision with root package name */
        private boolean f74174a;

        /* renamed from: b  reason: collision with root package name */
        private final C5404e f74175b = new C5404e();

        /* renamed from: c  reason: collision with root package name */
        private u f74176c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f74177d;

        public b(boolean z10) {
            this.f74174a = z10;
        }

        private final void a(boolean z10) {
            long min;
            boolean z11;
            boolean z12;
            i iVar = i.this;
            synchronized (iVar) {
                try {
                    iVar.s().v();
                    while (iVar.r() >= iVar.q() && !this.f74174a && !this.f74177d && iVar.h() == null) {
                        iVar.D();
                    }
                    iVar.s().C();
                    iVar.c();
                    min = Math.min(iVar.q() - iVar.r(), this.f74175b.B0());
                    iVar.B(iVar.r() + min);
                    if (!z10 || min != this.f74175b.B0()) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    z12 = z11;
                    C6514M m10 = C6514M.f71813a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i.this.s().v();
            try {
                i.this.g().O1(i.this.j(), z12, this.f74175b, min);
            } finally {
                i.this.s().C();
            }
        }

        public void P(C5404e eVar, long j10) {
            C6496s.h(eVar, "source");
            i iVar = i.this;
            if (!C6726e.f73547h || !Thread.holdsLock(iVar)) {
                this.f74175b.P(eVar, j10);
                while (this.f74175b.B0() >= 16384) {
                    a(false);
                }
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
        }

        public final boolean b() {
            return this.f74177d;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
            if (r10.f74178e.o().f74174a != false) goto L_0x00b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
            if (r10.f74175b.B0() <= 0) goto L_0x0063;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0066, code lost:
            if (r10.f74176c == null) goto L_0x008f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0070, code lost:
            if (r10.f74175b.B0() <= 0) goto L_0x0076;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0072, code lost:
            a(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0076, code lost:
            r0 = r10.f74178e.g();
            r2 = r10.f74178e.j();
            r4 = r10.f74176c;
            kotlin.jvm.internal.C6496s.e(r4);
            r0.P1(r2, r1, sh.C6726e.P(r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x008f, code lost:
            if (r0 == false) goto L_0x009f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0099, code lost:
            if (r10.f74175b.B0() <= 0) goto L_0x00b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x009b, code lost:
            a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x009f, code lost:
            if (r1 == false) goto L_0x00b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a1, code lost:
            r10.f74178e.g().O1(r10.f74178e.j(), true, (Gh.C5404e) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b4, code lost:
            r0 = r10.f74178e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b6, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
            r10.f74177d = true;
            r1 = lf.C6514M.f71813a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bb, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bc, code lost:
            r10.f74178e.g().flush();
            r10.f74178e.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ca, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r10 = this;
                zh.i r0 = zh.i.this
                boolean r1 = sh.C6726e.f73547h
                if (r1 == 0) goto L_0x0034
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto L_0x000d
                goto L_0x0034
            L_0x000d:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Thread "
                r2.append(r3)
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                java.lang.String r3 = r3.getName()
                r2.append(r3)
                java.lang.String r3 = " MUST NOT hold lock on "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L_0x0034:
                zh.i r0 = zh.i.this
                monitor-enter(r0)
                boolean r1 = r10.f74177d     // Catch:{ all -> 0x00ce }
                if (r1 == 0) goto L_0x003d
                monitor-exit(r0)
                return
            L_0x003d:
                zh.b r1 = r0.h()     // Catch:{ all -> 0x00ce }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x0047
                r1 = r3
                goto L_0x0048
            L_0x0047:
                r1 = r2
            L_0x0048:
                lf.M r4 = lf.C6514M.f71813a     // Catch:{ all -> 0x00ce }
                monitor-exit(r0)
                zh.i r0 = zh.i.this
                zh.i$b r0 = r0.o()
                boolean r0 = r0.f74174a
                if (r0 != 0) goto L_0x00b4
                Gh.e r0 = r10.f74175b
                long r4 = r0.B0()
                r6 = 0
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x0063
                r0 = r3
                goto L_0x0064
            L_0x0063:
                r0 = r2
            L_0x0064:
                rh.u r4 = r10.f74176c
                if (r4 == 0) goto L_0x008f
            L_0x0068:
                Gh.e r0 = r10.f74175b
                long r4 = r0.B0()
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x0076
                r10.a(r2)
                goto L_0x0068
            L_0x0076:
                zh.i r0 = zh.i.this
                zh.f r0 = r0.g()
                zh.i r2 = zh.i.this
                int r2 = r2.j()
                rh.u r4 = r10.f74176c
                kotlin.jvm.internal.C6496s.e(r4)
                java.util.List r4 = sh.C6726e.P(r4)
                r0.P1(r2, r1, r4)
                goto L_0x00b4
            L_0x008f:
                if (r0 == 0) goto L_0x009f
            L_0x0091:
                Gh.e r0 = r10.f74175b
                long r0 = r0.B0()
                int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x00b4
                r10.a(r3)
                goto L_0x0091
            L_0x009f:
                if (r1 == 0) goto L_0x00b4
                zh.i r0 = zh.i.this
                zh.f r4 = r0.g()
                zh.i r0 = zh.i.this
                int r5 = r0.j()
                r7 = 0
                r8 = 0
                r6 = 1
                r4.O1(r5, r6, r7, r8)
            L_0x00b4:
                zh.i r0 = zh.i.this
                monitor-enter(r0)
                r10.f74177d = r3     // Catch:{ all -> 0x00cb }
                lf.M r1 = lf.C6514M.f71813a     // Catch:{ all -> 0x00cb }
                monitor-exit(r0)
                zh.i r0 = zh.i.this
                zh.f r0 = r0.g()
                r0.flush()
                zh.i r0 = zh.i.this
                r0.b()
                return
            L_0x00cb:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x00ce:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: zh.i.b.close():void");
        }

        public final boolean f() {
            return this.f74174a;
        }

        public void flush() {
            i iVar = i.this;
            if (!C6726e.f73547h || !Thread.holdsLock(iVar)) {
                i iVar2 = i.this;
                synchronized (iVar2) {
                    iVar2.c();
                    C6514M m10 = C6514M.f71813a;
                }
                while (this.f74175b.B0() > 0) {
                    a(false);
                    i.this.g().flush();
                }
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
        }

        public X timeout() {
            return i.this.s();
        }
    }

    public final class c implements W {

        /* renamed from: a  reason: collision with root package name */
        private final long f74179a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f74180b;

        /* renamed from: c  reason: collision with root package name */
        private final C5404e f74181c = new C5404e();

        /* renamed from: d  reason: collision with root package name */
        private final C5404e f74182d = new C5404e();

        /* renamed from: e  reason: collision with root package name */
        private u f74183e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f74184f;

        public c(long j10, boolean z10) {
            this.f74179a = j10;
            this.f74180b = z10;
        }

        private final void q(long j10) {
            i iVar = i.this;
            if (!C6726e.f73547h || !Thread.holdsLock(iVar)) {
                i.this.g().N1(j10);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
        }

        public final boolean a() {
            return this.f74184f;
        }

        public final boolean b() {
            return this.f74180b;
        }

        public void close() {
            long B02;
            i iVar = i.this;
            synchronized (iVar) {
                this.f74184f = true;
                B02 = this.f74182d.B0();
                this.f74182d.a();
                C6496s.f(iVar, "null cannot be cast to non-null type java.lang.Object");
                iVar.notifyAll();
                C6514M m10 = C6514M.f71813a;
            }
            if (B02 > 0) {
                q(B02);
            }
            i.this.b();
        }

        public final void f(C5406g gVar, long j10) {
            boolean z10;
            boolean z11;
            boolean z12;
            C6496s.h(gVar, "source");
            i iVar = i.this;
            if (!C6726e.f73547h || !Thread.holdsLock(iVar)) {
                long j11 = j10;
                while (j11 > 0) {
                    synchronized (i.this) {
                        z10 = this.f74180b;
                        z11 = false;
                        if (this.f74182d.B0() + j11 > this.f74179a) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        C6514M m10 = C6514M.f71813a;
                    }
                    if (z12) {
                        gVar.skip(j11);
                        i.this.f(C6844b.FLOW_CONTROL_ERROR);
                        return;
                    } else if (z10) {
                        gVar.skip(j11);
                        return;
                    } else {
                        long y12 = gVar.y1(this.f74181c, j11);
                        if (y12 != -1) {
                            j11 -= y12;
                            i iVar2 = i.this;
                            synchronized (iVar2) {
                                try {
                                    if (this.f74184f) {
                                        this.f74181c.a();
                                    } else {
                                        if (this.f74182d.B0() == 0) {
                                            z11 = true;
                                        }
                                        this.f74182d.K(this.f74181c);
                                        if (z11) {
                                            C6496s.f(iVar2, "null cannot be cast to non-null type java.lang.Object");
                                            iVar2.notifyAll();
                                        }
                                    }
                                } finally {
                                }
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                }
                q(j10);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
        }

        public final void n(boolean z10) {
            this.f74180b = z10;
        }

        public final void o(u uVar) {
            this.f74183e = uVar;
        }

        public X timeout() {
            return i.this.m();
        }

        /* JADX INFO: finally extract failed */
        public long y1(C5404e eVar, long j10) {
            Throwable th2;
            boolean z10;
            long j11;
            C5404e eVar2 = eVar;
            long j12 = j10;
            C6496s.h(eVar2, "sink");
            long j13 = 0;
            if (j12 >= 0) {
                while (true) {
                    i iVar = i.this;
                    synchronized (iVar) {
                        iVar.m().v();
                        try {
                            if (iVar.h() == null || this.f74180b) {
                                th2 = null;
                            } else {
                                th2 = iVar.i();
                                if (th2 == null) {
                                    C6844b h10 = iVar.h();
                                    C6496s.e(h10);
                                    th2 = new n(h10);
                                }
                            }
                            if (!this.f74184f) {
                                z10 = false;
                                if (this.f74182d.B0() > j13) {
                                    C5404e eVar3 = this.f74182d;
                                    j11 = eVar3.y1(eVar2, Math.min(j12, eVar3.B0()));
                                    iVar.A(iVar.l() + j11);
                                    long l10 = iVar.l() - iVar.k();
                                    if (th2 == null && l10 >= ((long) (iVar.g().E0().c() / 2))) {
                                        iVar.g().T1(iVar.j(), l10);
                                        iVar.z(iVar.l());
                                    }
                                } else {
                                    if (!this.f74180b && th2 == null) {
                                        iVar.D();
                                        z10 = true;
                                    }
                                    j11 = -1;
                                }
                                iVar.m().C();
                                C6514M m10 = C6514M.f71813a;
                            } else {
                                throw new IOException("stream closed");
                            }
                        } catch (Throwable th3) {
                            iVar.m().C();
                            throw th3;
                        }
                    }
                    if (z10) {
                        j13 = 0;
                    } else if (j11 != -1) {
                        return j11;
                    } else {
                        if (th2 == null) {
                            return -1;
                        }
                        throw th2;
                    }
                }
            } else {
                throw new IllegalArgumentException(("byteCount < 0: " + j12).toString());
            }
        }
    }

    public final class d extends C5402c {
        public d() {
        }

        /* access modifiers changed from: protected */
        public void B() {
            i.this.f(C6844b.CANCEL);
            i.this.g().H1();
        }

        public final void C() {
            if (w()) {
                throw x((IOException) null);
            }
        }

        /* access modifiers changed from: protected */
        public IOException x(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    public i(int i10, f fVar, boolean z10, boolean z11, u uVar) {
        C6496s.h(fVar, "connection");
        this.f74160a = i10;
        this.f74161b = fVar;
        this.f74165f = (long) fVar.I0().c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f74166g = arrayDeque;
        this.f74168i = new c((long) fVar.E0().c(), z11);
        this.f74169j = new b(z10);
        if (uVar != null) {
            if (!t()) {
                arrayDeque.add(uVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        } else if (!t()) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    private final boolean e(C6844b bVar, IOException iOException) {
        if (!C6726e.f73547h || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.f74172m != null) {
                    return false;
                }
                this.f74172m = bVar;
                this.f74173n = iOException;
                C6496s.f(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                if (this.f74168i.b() && this.f74169j.f()) {
                    return false;
                }
                C6514M m10 = C6514M.f71813a;
                this.f74161b.G1(this.f74160a);
                return true;
            }
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final void A(long j10) {
        this.f74162c = j10;
    }

    public final void B(long j10) {
        this.f74164e = j10;
    }

    /* JADX INFO: finally extract failed */
    public final synchronized u C() {
        Object removeFirst;
        this.f74170k.v();
        while (this.f74166g.isEmpty() && this.f74172m == null) {
            try {
                D();
            } catch (Throwable th2) {
                this.f74170k.C();
                throw th2;
            }
        }
        this.f74170k.C();
        if (!this.f74166g.isEmpty()) {
            removeFirst = this.f74166g.removeFirst();
            C6496s.g(removeFirst, "headersQueue.removeFirst()");
        } else {
            Throwable th3 = this.f74173n;
            if (th3 == null) {
                C6844b bVar = this.f74172m;
                C6496s.e(bVar);
                th3 = new n(bVar);
            }
            throw th3;
        }
        return (u) removeFirst;
    }

    public final void D() {
        try {
            C6496s.f(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final X E() {
        return this.f74171l;
    }

    public final void a(long j10) {
        this.f74165f += j10;
        if (j10 > 0) {
            C6496s.f(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void b() {
        boolean z10;
        boolean u10;
        if (!C6726e.f73547h || !Thread.holdsLock(this)) {
            synchronized (this) {
                try {
                    if (!this.f74168i.b() && this.f74168i.a()) {
                        if (!this.f74169j.f()) {
                            if (this.f74169j.b()) {
                            }
                        }
                        z10 = true;
                        u10 = u();
                        C6514M m10 = C6514M.f71813a;
                    }
                    z10 = false;
                    u10 = u();
                    C6514M m102 = C6514M.f71813a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                d(C6844b.CANCEL, (IOException) null);
            } else if (!u10) {
                this.f74161b.G1(this.f74160a);
            }
        } else {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
    }

    public final void c() {
        if (this.f74169j.b()) {
            throw new IOException("stream closed");
        } else if (this.f74169j.f()) {
            throw new IOException("stream finished");
        } else if (this.f74172m != null) {
            Throwable th2 = this.f74173n;
            if (th2 == null) {
                C6844b bVar = this.f74172m;
                C6496s.e(bVar);
                th2 = new n(bVar);
            }
            throw th2;
        }
    }

    public final void d(C6844b bVar, IOException iOException) {
        C6496s.h(bVar, "rstStatusCode");
        if (e(bVar, iOException)) {
            this.f74161b.R1(this.f74160a, bVar);
        }
    }

    public final void f(C6844b bVar) {
        C6496s.h(bVar, "errorCode");
        if (e(bVar, (IOException) null)) {
            this.f74161b.S1(this.f74160a, bVar);
        }
    }

    public final f g() {
        return this.f74161b;
    }

    public final synchronized C6844b h() {
        return this.f74172m;
    }

    public final IOException i() {
        return this.f74173n;
    }

    public final int j() {
        return this.f74160a;
    }

    public final long k() {
        return this.f74163d;
    }

    public final long l() {
        return this.f74162c;
    }

    public final d m() {
        return this.f74170k;
    }

    public final U n() {
        synchronized (this) {
            try {
                if (!this.f74167h) {
                    if (!t()) {
                        throw new IllegalStateException("reply before requesting the sink");
                    }
                }
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f74169j;
    }

    public final b o() {
        return this.f74169j;
    }

    public final c p() {
        return this.f74168i;
    }

    public final long q() {
        return this.f74165f;
    }

    public final long r() {
        return this.f74164e;
    }

    public final d s() {
        return this.f74171l;
    }

    public final boolean t() {
        boolean z10;
        if ((this.f74160a & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f74161b.j0() == z10) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0032, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean u() {
        /*
            r2 = this;
            monitor-enter(r2)
            zh.b r0 = r2.f74172m     // Catch:{ all -> 0x0019 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r2)
            return r1
        L_0x0008:
            zh.i$c r0 = r2.f74168i     // Catch:{ all -> 0x0019 }
            boolean r0 = r0.b()     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x001b
            zh.i$c r0 = r2.f74168i     // Catch:{ all -> 0x0019 }
            boolean r0 = r0.a()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0031
            goto L_0x001b
        L_0x0019:
            r0 = move-exception
            goto L_0x0034
        L_0x001b:
            zh.i$b r0 = r2.f74169j     // Catch:{ all -> 0x0019 }
            boolean r0 = r0.f()     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x002b
            zh.i$b r0 = r2.f74169j     // Catch:{ all -> 0x0019 }
            boolean r0 = r0.b()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0031
        L_0x002b:
            boolean r0 = r2.f74167h     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0031
            monitor-exit(r2)
            return r1
        L_0x0031:
            monitor-exit(r2)
            r0 = 1
            return r0
        L_0x0034:
            monitor-exit(r2)     // Catch:{ all -> 0x0019 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zh.i.u():boolean");
    }

    public final X v() {
        return this.f74170k;
    }

    public final void w(C5406g gVar, int i10) {
        C6496s.h(gVar, "source");
        if (!C6726e.f73547h || !Thread.holdsLock(this)) {
            this.f74168i.f(gVar, (long) i10);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051 A[Catch:{ all -> 0x0046 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(rh.u r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.C6496s.h(r3, r0)
            boolean r0 = sh.C6726e.f73547h
            if (r0 == 0) goto L_0x0037
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L_0x0010
            goto L_0x0037
        L_0x0010:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Thread "
            r4.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x0037:
            monitor-enter(r2)
            boolean r0 = r2.f74167h     // Catch:{ all -> 0x0046 }
            r1 = 1
            if (r0 == 0) goto L_0x0048
            if (r4 != 0) goto L_0x0040
            goto L_0x0048
        L_0x0040:
            zh.i$c r0 = r2.f74168i     // Catch:{ all -> 0x0046 }
            r0.o(r3)     // Catch:{ all -> 0x0046 }
            goto L_0x004f
        L_0x0046:
            r3 = move-exception
            goto L_0x006f
        L_0x0048:
            r2.f74167h = r1     // Catch:{ all -> 0x0046 }
            java.util.ArrayDeque r0 = r2.f74166g     // Catch:{ all -> 0x0046 }
            r0.add(r3)     // Catch:{ all -> 0x0046 }
        L_0x004f:
            if (r4 == 0) goto L_0x0056
            zh.i$c r3 = r2.f74168i     // Catch:{ all -> 0x0046 }
            r3.n(r1)     // Catch:{ all -> 0x0046 }
        L_0x0056:
            boolean r3 = r2.u()     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.C6496s.f(r2, r4)     // Catch:{ all -> 0x0046 }
            r2.notifyAll()     // Catch:{ all -> 0x0046 }
            lf.M r4 = lf.C6514M.f71813a     // Catch:{ all -> 0x0046 }
            monitor-exit(r2)
            if (r3 != 0) goto L_0x006e
            zh.f r3 = r2.f74161b
            int r4 = r2.f74160a
            r3.G1(r4)
        L_0x006e:
            return
        L_0x006f:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: zh.i.x(rh.u, boolean):void");
    }

    public final synchronized void y(C6844b bVar) {
        C6496s.h(bVar, "errorCode");
        if (this.f74172m == null) {
            this.f74172m = bVar;
            C6496s.f(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void z(long j10) {
        this.f74163d = j10;
    }
}
