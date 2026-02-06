package Ug;

import Ef.m;
import Ug.U;
import Zg.M;
import Zg.N;
import Zg.t;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import qf.g;

/* renamed from: Ug.g0  reason: case insensitive filesystem */
public abstract class C5569g0 extends C5571h0 implements U {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f65376f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f65377g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f65378h;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* renamed from: Ug.g0$a */
    private final class a extends c {

        /* renamed from: c  reason: collision with root package name */
        private final C5582n f65379c;

        public a(long j10, C5582n nVar) {
            super(j10);
            this.f65379c = nVar;
        }

        public void run() {
            this.f65379c.G(C5569g0.this, C6514M.f71813a);
        }

        public String toString() {
            return super.toString() + this.f65379c;
        }
    }

    /* renamed from: Ug.g0$b */
    private static final class b extends c {

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f65381c;

        public b(long j10, Runnable runnable) {
            super(j10);
            this.f65381c = runnable;
        }

        public void run() {
            this.f65381c.run();
        }

        public String toString() {
            return super.toString() + this.f65381c;
        }
    }

    /* renamed from: Ug.g0$c */
    public static abstract class c implements Runnable, Comparable, C5559b0, N {
        private volatile Object _heap;

        /* renamed from: a  reason: collision with root package name */
        public long f65382a;

        /* renamed from: b  reason: collision with root package name */
        private int f65383b = -1;

        public c(long j10) {
            this.f65382a = j10;
        }

        public M a() {
            Object obj = this._heap;
            if (obj instanceof M) {
                return (M) obj;
            }
            return null;
        }

        public void b(M m10) {
            if (this._heap != C5575j0.f65388a) {
                this._heap = m10;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.");
        }

        public final void dispose() {
            d dVar;
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj != C5575j0.f65388a) {
                        if (obj instanceof d) {
                            dVar = (d) obj;
                        } else {
                            dVar = null;
                        }
                        if (dVar != null) {
                            dVar.h(this);
                        }
                        this._heap = C5575j0.f65388a;
                        C6514M m10 = C6514M.f71813a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: e */
        public int compareTo(c cVar) {
            int i10 = ((this.f65382a - cVar.f65382a) > 0 ? 1 : ((this.f65382a - cVar.f65382a) == 0 ? 0 : -1));
            if (i10 > 0) {
                return 1;
            }
            if (i10 < 0) {
                return -1;
            }
            return 0;
        }

        public final int f(long j10, d dVar, C5569g0 g0Var) {
            synchronized (this) {
                if (this._heap == C5575j0.f65388a) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        c cVar = (c) dVar.b();
                        if (g0Var.o()) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.f65384c = j10;
                        } else {
                            long j11 = cVar.f65382a;
                            if (j11 - j10 < 0) {
                                j10 = j11;
                            }
                            if (j10 - dVar.f65384c > 0) {
                                dVar.f65384c = j10;
                            }
                        }
                        long j12 = this.f65382a;
                        long j13 = dVar.f65384c;
                        if (j12 - j13 < 0) {
                            this.f65382a = j13;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public int getIndex() {
            return this.f65383b;
        }

        public final boolean i(long j10) {
            if (j10 - this.f65382a >= 0) {
                return true;
            }
            return false;
        }

        public void setIndex(int i10) {
            this.f65383b = i10;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f65382a + ']';
        }
    }

    /* renamed from: Ug.g0$d */
    public static final class d extends M {

        /* renamed from: c  reason: collision with root package name */
        public long f65384c;

        public d(long j10) {
            this.f65384c = j10;
        }
    }

    static {
        Class<C5569g0> cls = C5569g0.class;
        Class<Object> cls2 = Object.class;
        f65376f = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_queue$volatile");
        f65377g = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_delayed$volatile");
        f65378h = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleted$volatile");
    }

    private final void T1() {
        AtomicReferenceFieldUpdater Z12 = f65376f;
        while (true) {
            Object obj = Z12.get(this);
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f65376f, this, (Object) null, C5575j0.f65389b)) {
                    return;
                }
            } else if (obj instanceof t) {
                ((t) obj).d();
                return;
            } else if (obj != C5575j0.f65389b) {
                t tVar = new t(8, true);
                C6496s.f(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                tVar.a((Runnable) obj);
                if (androidx.concurrent.futures.b.a(f65376f, this, obj, tVar)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private final Runnable U1() {
        AtomicReferenceFieldUpdater Z12 = f65376f;
        while (true) {
            Object obj = Z12.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof t) {
                C6496s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                t tVar = (t) obj;
                Object m10 = tVar.m();
                if (m10 != t.f67001h) {
                    return (Runnable) m10;
                }
                androidx.concurrent.futures.b.a(f65376f, this, obj, tVar.l());
            } else if (obj == C5575j0.f65389b) {
                return null;
            } else {
                if (androidx.concurrent.futures.b.a(f65376f, this, obj, (Object) null)) {
                    C6496s.f(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final boolean W1(Runnable runnable) {
        AtomicReferenceFieldUpdater Z12 = f65376f;
        while (true) {
            Object obj = Z12.get(this);
            if (o()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f65376f, this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof t) {
                C6496s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                t tVar = (t) obj;
                int a10 = tVar.a(runnable);
                if (a10 == 0) {
                    return true;
                }
                if (a10 == 1) {
                    androidx.concurrent.futures.b.a(f65376f, this, obj, tVar.l());
                } else if (a10 == 2) {
                    return false;
                }
            } else if (obj == C5575j0.f65389b) {
                return false;
            } else {
                t tVar2 = new t(8, true);
                C6496s.f(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                tVar2.a((Runnable) obj);
                tVar2.a(runnable);
                if (androidx.concurrent.futures.b.a(f65376f, this, obj, tVar2)) {
                    return true;
                }
            }
        }
    }

    private final void b2() {
        c cVar;
        C5560c.a();
        long nanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f65377g.get(this);
            if (dVar != null && (cVar = (c) dVar.j()) != null) {
                Q1(nanoTime, cVar);
            } else {
                return;
            }
        }
    }

    private final int e2(long j10, c cVar) {
        if (o()) {
            return 1;
        }
        d dVar = (d) f65377g.get(this);
        if (dVar == null) {
            androidx.concurrent.futures.b.a(f65377g, this, (Object) null, new d(j10));
            Object obj = f65377g.get(this);
            C6496s.e(obj);
            dVar = (d) obj;
        }
        return cVar.f(j10, dVar, this);
    }

    private final void g2(boolean z10) {
        f65378h.set(this, z10 ? 1 : 0);
    }

    private final boolean h2(c cVar) {
        c cVar2;
        d dVar = (d) f65377g.get(this);
        if (dVar != null) {
            cVar2 = (c) dVar.f();
        } else {
            cVar2 = null;
        }
        if (cVar2 == cVar) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final boolean o() {
        if (f65378h.get(this) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public long H1() {
        c cVar;
        if (super.H1() == 0) {
            return 0;
        }
        Object obj = f65376f.get(this);
        if (obj != null) {
            if (obj instanceof t) {
                if (!((t) obj).j()) {
                    return 0;
                }
            } else if (obj == C5575j0.f65389b) {
                return Long.MAX_VALUE;
            } else {
                return 0;
            }
        }
        d dVar = (d) f65377g.get(this);
        if (dVar == null || (cVar = (c) dVar.f()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = cVar.f65382a;
        C5560c.a();
        return m.e(j10 - System.nanoTime(), 0);
    }

    public C5559b0 I0(long j10, Runnable runnable, g gVar) {
        return U.a.a(this, j10, runnable, gVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long M1() {
        /*
            r9 = this;
            boolean r0 = r9.N1()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f65377g
            java.lang.Object r0 = r0.get(r9)
            Ug.g0$d r0 = (Ug.C5569g0.d) r0
            if (r0 == 0) goto L_0x004b
            boolean r3 = r0.e()
            if (r3 != 0) goto L_0x004b
            Ug.C5560c.a()
            long r3 = java.lang.System.nanoTime()
        L_0x0022:
            monitor-enter(r0)
            Zg.N r5 = r0.b()     // Catch:{ all -> 0x003a }
            r6 = 0
            if (r5 != 0) goto L_0x002c
            monitor-exit(r0)
            goto L_0x0044
        L_0x002c:
            Ug.g0$c r5 = (Ug.C5569g0.c) r5     // Catch:{ all -> 0x003a }
            boolean r7 = r5.i(r3)     // Catch:{ all -> 0x003a }
            r8 = 0
            if (r7 == 0) goto L_0x003c
            boolean r5 = r9.W1(r5)     // Catch:{ all -> 0x003a }
            goto L_0x003d
        L_0x003a:
            r1 = move-exception
            goto L_0x0049
        L_0x003c:
            r5 = r8
        L_0x003d:
            if (r5 == 0) goto L_0x0043
            Zg.N r6 = r0.i(r8)     // Catch:{ all -> 0x003a }
        L_0x0043:
            monitor-exit(r0)
        L_0x0044:
            Ug.g0$c r6 = (Ug.C5569g0.c) r6
            if (r6 != 0) goto L_0x0022
            goto L_0x004b
        L_0x0049:
            monitor-exit(r0)
            throw r1
        L_0x004b:
            java.lang.Runnable r0 = r9.U1()
            if (r0 == 0) goto L_0x0055
            r0.run()
            return r1
        L_0x0055:
            long r0 = r9.H1()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ug.C5569g0.M1():long");
    }

    public void V1(Runnable runnable) {
        if (W1(runnable)) {
            R1();
        } else {
            P.f65329i.V1(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public boolean a2() {
        if (!L1()) {
            return false;
        }
        d dVar = (d) f65377g.get(this);
        if (dVar != null && !dVar.e()) {
            return false;
        }
        Object obj = f65376f.get(this);
        if (obj != null) {
            if (obj instanceof t) {
                return ((t) obj).j();
            }
            if (obj != C5575j0.f65389b) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void c2() {
        f65376f.set(this, (Object) null);
        f65377g.set(this, (Object) null);
    }

    public final void d2(long j10, c cVar) {
        int e22 = e2(j10, cVar);
        if (e22 != 0) {
            if (e22 == 1) {
                Q1(j10, cVar);
            } else if (e22 != 2) {
                throw new IllegalStateException("unexpected result");
            }
        } else if (h2(cVar)) {
            R1();
        }
    }

    /* access modifiers changed from: protected */
    public final C5559b0 f2(long j10, Runnable runnable) {
        long c10 = C5575j0.c(j10);
        if (c10 >= 4611686018427387903L) {
            return L0.f65320a;
        }
        C5560c.a();
        long nanoTime = System.nanoTime();
        b bVar = new b(c10 + nanoTime, runnable);
        d2(nanoTime, bVar);
        return bVar;
    }

    public void g0(long j10, C5582n nVar) {
        long c10 = C5575j0.c(j10);
        if (c10 < 4611686018427387903L) {
            C5560c.a();
            long nanoTime = System.nanoTime();
            a aVar = new a(c10 + nanoTime, nVar);
            d2(nanoTime, aVar);
            C5588q.a(nVar, aVar);
        }
    }

    public void shutdown() {
        W0.f65337a.c();
        g2(true);
        T1();
        do {
        } while (M1() <= 0);
        b2();
    }

    public final void z1(g gVar, Runnable runnable) {
        V1(runnable);
    }
}
