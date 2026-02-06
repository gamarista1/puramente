package wh;

import Bh.j;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import rh.C6704a;
import sh.C6726e;
import vh.C6756a;
import vh.C6759d;
import vh.C6760e;
import wh.C6775e;

/* renamed from: wh.g  reason: case insensitive filesystem */
public final class C6777g {

    /* renamed from: f  reason: collision with root package name */
    public static final a f73852f = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f73853a;

    /* renamed from: b  reason: collision with root package name */
    private final long f73854b;

    /* renamed from: c  reason: collision with root package name */
    private final C6759d f73855c;

    /* renamed from: d  reason: collision with root package name */
    private final b f73856d = new b(this, C6726e.f73548i + " ConnectionPool");

    /* renamed from: e  reason: collision with root package name */
    private final ConcurrentLinkedQueue f73857e = new ConcurrentLinkedQueue();

    /* renamed from: wh.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: wh.g$b */
    public static final class b extends C6756a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6777g f73858e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C6777g gVar, String str) {
            super(str, false, 2, (DefaultConstructorMarker) null);
            this.f73858e = gVar;
        }

        public long f() {
            return this.f73858e.b(System.nanoTime());
        }
    }

    public C6777g(C6760e eVar, int i10, long j10, TimeUnit timeUnit) {
        C6496s.h(eVar, "taskRunner");
        C6496s.h(timeUnit, "timeUnit");
        this.f73853a = i10;
        this.f73854b = timeUnit.toNanos(j10);
        this.f73855c = eVar.i();
        if (j10 <= 0) {
            throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j10).toString());
        }
    }

    private final int d(C6776f fVar, long j10) {
        if (!C6726e.f73547h || Thread.holdsLock(fVar)) {
            List n10 = fVar.n();
            int i10 = 0;
            while (i10 < n10.size()) {
                Reference reference = (Reference) n10.get(i10);
                if (reference.get() != null) {
                    i10++;
                } else {
                    C6496s.f(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                    j.f62626a.g().m("A connection to " + fVar.A().a().l() + " was leaked. Did you forget to close a response body?", ((C6775e.b) reference).a());
                    n10.remove(i10);
                    fVar.D(true);
                    if (n10.isEmpty()) {
                        fVar.C(j10 - this.f73854b);
                        return 0;
                    }
                }
            }
            return n10.size();
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
    }

    public final boolean a(C6704a aVar, C6775e eVar, List list, boolean z10) {
        C6496s.h(aVar, "address");
        C6496s.h(eVar, "call");
        Iterator it = this.f73857e.iterator();
        while (it.hasNext()) {
            C6776f fVar = (C6776f) it.next();
            C6496s.g(fVar, "connection");
            synchronized (fVar) {
                if (z10) {
                    try {
                        if (fVar.v()) {
                        }
                        C6514M m10 = C6514M.f71813a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (fVar.t(aVar, list)) {
                    eVar.d(fVar);
                    return true;
                }
                C6514M m102 = C6514M.f71813a;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0079, code lost:
        sh.C6726e.n(r4.E());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0086, code lost:
        if (r11.f73857e.isEmpty() == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0088, code lost:
        r11.f73855c.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008d, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long b(long r12) {
        /*
            r11 = this;
            r0 = 1
            java.util.concurrent.ConcurrentLinkedQueue r1 = r11.f73857e
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = 0
            r4 = -9223372036854775808
            r5 = r4
            r4 = r3
            r3 = r2
        L_0x000e:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x003c
            java.lang.Object r7 = r1.next()
            wh.f r7 = (wh.C6776f) r7
            java.lang.String r8 = "connection"
            kotlin.jvm.internal.C6496s.g(r7, r8)
            monitor-enter(r7)
            int r8 = r11.d(r7, r12)     // Catch:{ all -> 0x0039 }
            if (r8 <= 0) goto L_0x0028
            int r3 = r3 + r0
            goto L_0x0037
        L_0x0028:
            int r2 = r2 + r0
            long r8 = r7.o()     // Catch:{ all -> 0x0039 }
            long r8 = r12 - r8
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 <= 0) goto L_0x0035
            r4 = r7
            r5 = r8
        L_0x0035:
            lf.M r8 = lf.C6514M.f71813a     // Catch:{ all -> 0x0039 }
        L_0x0037:
            monitor-exit(r7)
            goto L_0x000e
        L_0x0039:
            r12 = move-exception
            monitor-exit(r7)
            throw r12
        L_0x003c:
            long r7 = r11.f73854b
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0051
            int r1 = r11.f73853a
            if (r2 <= r1) goto L_0x0047
            goto L_0x0051
        L_0x0047:
            if (r2 <= 0) goto L_0x004b
            long r7 = r7 - r5
            return r7
        L_0x004b:
            if (r3 <= 0) goto L_0x004e
            return r7
        L_0x004e:
            r12 = -1
            return r12
        L_0x0051:
            kotlin.jvm.internal.C6496s.e(r4)
            monitor-enter(r4)
            java.util.List r1 = r4.n()     // Catch:{ all -> 0x008e }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x008e }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x008e }
            r2 = 0
            if (r1 != 0) goto L_0x0065
            monitor-exit(r4)
            return r2
        L_0x0065:
            long r7 = r4.o()     // Catch:{ all -> 0x008e }
            long r7 = r7 + r5
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 == 0) goto L_0x0070
            monitor-exit(r4)
            return r2
        L_0x0070:
            r4.D(r0)     // Catch:{ all -> 0x008e }
            java.util.concurrent.ConcurrentLinkedQueue r12 = r11.f73857e     // Catch:{ all -> 0x008e }
            r12.remove(r4)     // Catch:{ all -> 0x008e }
            monitor-exit(r4)
            java.net.Socket r12 = r4.E()
            sh.C6726e.n(r12)
            java.util.concurrent.ConcurrentLinkedQueue r12 = r11.f73857e
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x008d
            vh.d r12 = r11.f73855c
            r12.a()
        L_0x008d:
            return r2
        L_0x008e:
            r12 = move-exception
            monitor-exit(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.C6777g.b(long):long");
    }

    public final boolean c(C6776f fVar) {
        C6496s.h(fVar, "connection");
        if (C6726e.f73547h && !Thread.holdsLock(fVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
        } else if (fVar.p() || this.f73853a == 0) {
            fVar.D(true);
            this.f73857e.remove(fVar);
            if (this.f73857e.isEmpty()) {
                this.f73855c.a();
            }
            return true;
        } else {
            C6759d.j(this.f73855c, this.f73856d, 0, 2, (Object) null);
            return false;
        }
    }

    public final void e(C6776f fVar) {
        C6496s.h(fVar, "connection");
        if (!C6726e.f73547h || Thread.holdsLock(fVar)) {
            this.f73857e.add(fVar);
            C6759d.j(this.f73855c, this.f73856d, 0, 2, (Object) null);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
    }
}
