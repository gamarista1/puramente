package dh;

import Ug.C5582n;
import Ug.C5584o;
import Ug.C5588q;
import Ug.i1;
import Wg.i;
import Zg.C5715d;
import Zg.D;
import Zg.E;
import ch.C5811j;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import qf.C6658d;
import rf.C6680b;
import yf.C6798l;
import yf.p;

public class e implements d {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f67424c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f67425d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f67426e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f67427f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f67428g;
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a  reason: collision with root package name */
    private final int f67429a;

    /* renamed from: b  reason: collision with root package name */
    private final C6798l f67430b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* synthetic */ class a extends C6494p implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f67431a = new a();

        a() {
            super(2, f.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final g i(long j10, g gVar) {
            return f.j(j10, gVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Number) obj).longValue(), (g) obj2);
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f67432a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(1);
            this.f67432a = eVar;
        }

        public final void a(Throwable th2) {
            this.f67432a.release();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C6514M.f71813a;
        }
    }

    /* synthetic */ class c extends C6494p implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final c f67433a = new c();

        c() {
            super(2, f.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final g i(long j10, g gVar) {
            return f.j(j10, gVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Number) obj).longValue(), (g) obj2);
        }
    }

    static {
        Class<e> cls = e.class;
        Class<Object> cls2 = Object.class;
        f67424c = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "head$volatile");
        f67425d = AtomicLongFieldUpdater.newUpdater(cls, "deqIdx$volatile");
        f67426e = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "tail$volatile");
        f67427f = AtomicLongFieldUpdater.newUpdater(cls, "enqIdx$volatile");
        f67428g = AtomicIntegerFieldUpdater.newUpdater(cls, "_availablePermits$volatile");
    }

    public e(int i10, int i11) {
        this.f67429a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
        } else if (i11 < 0 || i11 > i10) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        } else {
            g gVar = new g(0, (g) null, 2);
            this.head$volatile = gVar;
            this.tail$volatile = gVar;
            this._availablePermits$volatile = i10 - i11;
            this.f67430b = new b(this);
        }
    }

    static /* synthetic */ Object h(e eVar, C6658d dVar) {
        if (eVar.l() > 0) {
            return C6514M.f71813a;
        }
        Object i10 = eVar.i(dVar);
        if (i10 == C6680b.f()) {
            return i10;
        }
        return C6514M.f71813a;
    }

    private final Object i(C6658d dVar) {
        C5584o b10 = C5588q.b(C6680b.c(dVar));
        try {
            if (!j(b10)) {
                g(b10);
            }
            Object v10 = b10.v();
            if (v10 == C6680b.f()) {
                h.c(dVar);
            }
            if (v10 == C6680b.f()) {
                return v10;
            }
            return C6514M.f71813a;
        } catch (Throwable th2) {
            b10.O();
            throw th2;
        }
    }

    /* access modifiers changed from: private */
    public final boolean j(i1 i1Var) {
        Object c10;
        g gVar = (g) f67426e.get(this);
        long andIncrement = f67427f.getAndIncrement(this);
        a aVar = a.f67431a;
        AtomicReferenceFieldUpdater q10 = f67426e;
        long h10 = andIncrement / ((long) f.f67439f);
        loop0:
        while (true) {
            c10 = C5715d.c(gVar, h10, aVar);
            if (E.c(c10)) {
                break;
            }
            D b10 = E.b(c10);
            while (true) {
                D d10 = (D) q10.get(this);
                if (d10.f66948c >= b10.f66948c) {
                    break loop0;
                } else if (b10.u()) {
                    if (androidx.concurrent.futures.b.a(q10, this, d10, b10)) {
                        if (d10.p()) {
                            d10.n();
                        }
                    } else if (b10.p()) {
                        b10.n();
                    }
                }
            }
        }
        g gVar2 = (g) E.b(c10);
        int h11 = (int) (andIncrement % ((long) f.f67439f));
        if (i.a(gVar2.v(), h11, (Object) null, i1Var)) {
            i1Var.c(gVar2, h11);
            return true;
        }
        if (!i.a(gVar2.v(), h11, f.f67435b, f.f67436c)) {
            return false;
        }
        if (i1Var instanceof C5582n) {
            C6496s.f(i1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((C5582n) i1Var).x(C6514M.f71813a, this.f67430b);
        } else if (i1Var instanceof C5811j) {
            ((C5811j) i1Var).e(C6514M.f71813a);
        } else {
            throw new IllegalStateException(("unexpected: " + i1Var).toString());
        }
        return true;
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    private final void k() {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f67428g
            int r0 = r0.get(r3)
            int r1 = r3.f67429a
            if (r0 <= r1) goto L_0x0018
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = f67428g
            int r2 = r3.f67429a
            boolean r0 = r1.compareAndSet(r3, r0, r2)
            if (r0 == 0) goto L_0x0000
        L_0x0018:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dh.e.k():void");
    }

    private final int l() {
        int andDecrement;
        do {
            andDecrement = f67428g.getAndDecrement(this);
        } while (andDecrement > this.f67429a);
        return andDecrement;
    }

    private final boolean t(Object obj) {
        if (obj instanceof C5582n) {
            C6496s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            C5582n nVar = (C5582n) obj;
            Object D10 = nVar.D(C6514M.f71813a, (Object) null, this.f67430b);
            if (D10 == null) {
                return false;
            }
            nVar.L(D10);
            return true;
        } else if (obj instanceof C5811j) {
            return ((C5811j) obj).g(this, C6514M.f71813a);
        } else {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
    }

    private final boolean u() {
        Object c10;
        g gVar = (g) f67424c.get(this);
        long andIncrement = f67425d.getAndIncrement(this);
        long h10 = andIncrement / ((long) f.f67439f);
        c cVar = c.f67433a;
        AtomicReferenceFieldUpdater p10 = f67424c;
        loop0:
        while (true) {
            c10 = C5715d.c(gVar, h10, cVar);
            if (E.c(c10)) {
                break;
            }
            D b10 = E.b(c10);
            while (true) {
                D d10 = (D) p10.get(this);
                if (d10.f66948c >= b10.f66948c) {
                    break loop0;
                } else if (b10.u()) {
                    if (androidx.concurrent.futures.b.a(p10, this, d10, b10)) {
                        if (d10.p()) {
                            d10.n();
                        }
                    } else if (b10.p()) {
                        b10.n();
                    }
                }
            }
        }
        g gVar2 = (g) E.b(c10);
        gVar2.c();
        if (gVar2.f66948c > h10) {
            return false;
        }
        int h11 = (int) (andIncrement % ((long) f.f67439f));
        Object andSet = gVar2.v().getAndSet(h11, f.f67435b);
        if (andSet == null) {
            int f10 = f.f67434a;
            for (int i10 = 0; i10 < f10; i10++) {
                if (gVar2.v().get(h11) == f.f67436c) {
                    return true;
                }
            }
            return !i.a(gVar2.v(), h11, f.f67435b, f.f67437d);
        } else if (andSet == f.f67438e) {
            return false;
        } else {
            return t(andSet);
        }
    }

    public Object b(C6658d dVar) {
        return h(this, dVar);
    }

    /* access modifiers changed from: protected */
    public final void g(C5582n nVar) {
        while (l() <= 0) {
            C6496s.f(nVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (j((i1) nVar)) {
                return;
            }
        }
        nVar.x(C6514M.f71813a, this.f67430b);
    }

    public int m() {
        return Math.max(f67428g.get(this), 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void release() {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f67428g
            int r0 = r0.getAndIncrement(r3)
            int r1 = r3.f67429a
            if (r0 >= r1) goto L_0x0016
            if (r0 < 0) goto L_0x000f
            return
        L_0x000f:
            boolean r0 = r3.u()
            if (r0 == 0) goto L_0x0000
            return
        L_0x0016:
            r3.k()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The number of released permits cannot be greater than "
            r1.append(r2)
            int r2 = r3.f67429a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dh.e.release():void");
    }

    public boolean s() {
        while (true) {
            int i10 = f67428g.get(this);
            if (i10 > this.f67429a) {
                k();
            } else if (i10 <= 0) {
                return false;
            } else {
                if (f67428g.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }
}
