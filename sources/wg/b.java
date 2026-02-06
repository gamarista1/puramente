package Wg;

import Ug.C5582n;
import Ug.C5584o;
import Ug.C5588q;
import Ug.i1;
import Zg.C5715d;
import Zg.C5716e;
import Zg.C5724m;
import Zg.D;
import Zg.E;
import Zg.F;
import Zg.G;
import Zg.P;
import Zg.y;
import ch.C5807f;
import ch.C5808g;
import ch.C5810i;
import ch.C5811j;
import ch.C5813l;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;
import lf.C6514M;
import lf.C6523g;
import lf.v;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.C6798l;
import yf.p;
import yf.q;

public class b implements d {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f65975d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f65976e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f65977f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f65978g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f65979h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f65980i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f65981j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f65982k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f65983l;
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: a  reason: collision with root package name */
    private final int f65984a;

    /* renamed from: b  reason: collision with root package name */
    public final C6798l f65985b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* renamed from: c  reason: collision with root package name */
    private final q f65986c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    private final class a implements f, i1 {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public Object f65987a = c.f66023p;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public C5584o f65988b;

        public a() {
        }

        private final Object f(j jVar, int i10, long j10, C6658d dVar) {
            Boolean a10;
            b bVar = b.this;
            C5584o b10 = C5588q.b(C6680b.c(dVar));
            try {
                this.f65988b = b10;
                Object D10 = bVar.b1(jVar, i10, j10, this);
                if (D10 == c.f66020m) {
                    bVar.G0(this, jVar, i10);
                } else {
                    C6798l lVar = null;
                    if (D10 == c.f66022o) {
                        if (j10 < bVar.f0()) {
                            jVar.c();
                        }
                        j jVar2 = (j) b.f65980i.get(bVar);
                        while (true) {
                            if (bVar.o0()) {
                                h();
                                break;
                            }
                            long andIncrement = b.f65976e.getAndIncrement(bVar);
                            int i11 = c.f66009b;
                            long j11 = andIncrement / ((long) i11);
                            int i12 = (int) (andIncrement % ((long) i11));
                            if (jVar2.f66948c != j11) {
                                j a11 = bVar.Q(j11, jVar2);
                                if (a11 != null) {
                                    jVar2 = a11;
                                }
                            }
                            Object D11 = bVar.b1(jVar2, i12, andIncrement, this);
                            if (D11 == c.f66020m) {
                                bVar.G0(this, jVar2, i12);
                                break;
                            } else if (D11 == c.f66022o) {
                                if (andIncrement < bVar.f0()) {
                                    jVar2.c();
                                }
                            } else if (D11 != c.f66021n) {
                                jVar2.c();
                                this.f65987a = D11;
                                this.f65988b = null;
                                a10 = kotlin.coroutines.jvm.internal.b.a(true);
                                C6798l lVar2 = bVar.f65985b;
                                if (lVar2 != null) {
                                    lVar = y.a(lVar2, D11, b10.getContext());
                                }
                            } else {
                                throw new IllegalStateException("unexpected");
                            }
                        }
                    } else {
                        jVar.c();
                        this.f65987a = D10;
                        this.f65988b = null;
                        a10 = kotlin.coroutines.jvm.internal.b.a(true);
                        C6798l lVar3 = bVar.f65985b;
                        if (lVar3 != null) {
                            lVar = y.a(lVar3, D10, b10.getContext());
                        }
                    }
                    b10.x(a10, lVar);
                }
                Object v10 = b10.v();
                if (v10 == C6680b.f()) {
                    kotlin.coroutines.jvm.internal.h.c(dVar);
                }
                return v10;
            } catch (Throwable th2) {
                b10.O();
                throw th2;
            }
        }

        private final boolean g() {
            this.f65987a = c.z();
            Throwable V10 = b.this.V();
            if (V10 == null) {
                return false;
            }
            throw F.a(V10);
        }

        /* access modifiers changed from: private */
        public final void h() {
            C5584o oVar = this.f65988b;
            C6496s.e(oVar);
            this.f65988b = null;
            this.f65987a = c.z();
            Throwable V10 = b.this.V();
            if (V10 == null) {
                v.a aVar = v.f71841b;
                oVar.resumeWith(v.b(Boolean.FALSE));
                return;
            }
            v.a aVar2 = v.f71841b;
            oVar.resumeWith(v.b(w.a(V10)));
        }

        public Object a(C6658d dVar) {
            j jVar;
            b bVar = b.this;
            j jVar2 = (j) b.f65980i.get(bVar);
            while (!bVar.o0()) {
                long andIncrement = b.f65976e.getAndIncrement(bVar);
                int i10 = c.f66009b;
                long j10 = andIncrement / ((long) i10);
                int i11 = (int) (andIncrement % ((long) i10));
                if (jVar2.f66948c != j10) {
                    j a10 = bVar.Q(j10, jVar2);
                    if (a10 == null) {
                        continue;
                    } else {
                        jVar = a10;
                    }
                } else {
                    jVar = jVar2;
                }
                Object D10 = bVar.b1(jVar, i11, andIncrement, (Object) null);
                if (D10 == c.f66020m) {
                    throw new IllegalStateException("unreachable");
                } else if (D10 == c.f66022o) {
                    if (andIncrement < bVar.f0()) {
                        jVar.c();
                    }
                    jVar2 = jVar;
                } else if (D10 == c.f66021n) {
                    return f(jVar, i11, andIncrement, dVar);
                } else {
                    jVar.c();
                    this.f65987a = D10;
                    return kotlin.coroutines.jvm.internal.b.a(true);
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(g());
        }

        public void c(D d10, int i10) {
            C5584o oVar = this.f65988b;
            if (oVar != null) {
                oVar.c(d10, i10);
            }
        }

        public final boolean i(Object obj) {
            C5584o oVar = this.f65988b;
            C6496s.e(oVar);
            C6798l lVar = null;
            this.f65988b = null;
            this.f65987a = obj;
            Boolean bool = Boolean.TRUE;
            C6798l lVar2 = b.this.f65985b;
            if (lVar2 != null) {
                lVar = y.a(lVar2, obj, oVar.getContext());
            }
            return c.B(oVar, bool, lVar);
        }

        public final void j() {
            C5584o oVar = this.f65988b;
            C6496s.e(oVar);
            this.f65988b = null;
            this.f65987a = c.z();
            Throwable V10 = b.this.V();
            if (V10 == null) {
                v.a aVar = v.f71841b;
                oVar.resumeWith(v.b(Boolean.FALSE));
                return;
            }
            v.a aVar2 = v.f71841b;
            oVar.resumeWith(v.b(w.a(V10)));
        }

        public Object next() {
            Object obj = this.f65987a;
            if (obj != c.f66023p) {
                this.f65987a = c.f66023p;
                if (obj != c.z()) {
                    return obj;
                }
                throw F.a(b.this.Y());
            }
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
    }

    /* renamed from: Wg.b$b  reason: collision with other inner class name */
    /* synthetic */ class C0962b extends C6494p implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final C0962b f65990a = new C0962b();

        C0962b() {
            super(3, b.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void i(b bVar, C5811j jVar, Object obj) {
            bVar.O0(jVar, obj);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            i((b) obj, (C5811j) obj2, obj3);
            return C6514M.f71813a;
        }
    }

    /* synthetic */ class c extends C6494p implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final c f65991a = new c();

        c() {
            super(3, b.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        /* renamed from: i */
        public final Object invoke(b bVar, Object obj, Object obj2) {
            return bVar.I0(obj, obj2);
        }
    }

    /* synthetic */ class d extends C6494p implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final d f65992a = new d();

        d() {
            super(3, b.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void i(b bVar, C5811j jVar, Object obj) {
            bVar.O0(jVar, obj);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            i((b) obj, (C5811j) obj2, obj3);
            return C6514M.f71813a;
        }
    }

    /* synthetic */ class e extends C6494p implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final e f65993a = new e();

        e() {
            super(3, b.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        /* renamed from: i */
        public final Object invoke(b bVar, Object obj, Object obj2) {
            return bVar.J0(obj, obj2);
        }
    }

    static final class f extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f65994a;

        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Object f65995a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f65996b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5811j f65997c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Object obj, b bVar, C5811j jVar) {
                super(1);
                this.f65995a = obj;
                this.f65996b = bVar;
                this.f65997c = jVar;
            }

            public final void a(Throwable th2) {
                if (this.f65995a != c.z()) {
                    y.b(this.f65996b.f65985b, this.f65995a, this.f65997c.getContext());
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(3);
            this.f65994a = bVar;
        }

        /* renamed from: a */
        public final C6798l invoke(C5811j jVar, Object obj, Object obj2) {
            return new a(obj2, this.f65994a, jVar);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f65998a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f65999b;

        /* renamed from: c  reason: collision with root package name */
        int f66000c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar, C6658d dVar) {
            super(dVar);
            this.f65999b = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f65998a = obj;
            this.f66000c |= Integer.MIN_VALUE;
            Object L02 = b.L0(this.f65999b, this);
            if (L02 == C6680b.f()) {
                return L02;
            }
            return h.b(L02);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f66001a;

        /* renamed from: b  reason: collision with root package name */
        Object f66002b;

        /* renamed from: c  reason: collision with root package name */
        int f66003c;

        /* renamed from: d  reason: collision with root package name */
        long f66004d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f66005e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f66006f;

        /* renamed from: g  reason: collision with root package name */
        int f66007g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar, C6658d dVar) {
            super(dVar);
            this.f66006f = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f66005e = obj;
            this.f66007g |= Integer.MIN_VALUE;
            Object B10 = this.f66006f.M0((j) null, 0, 0, this);
            if (B10 == C6680b.f()) {
                return B10;
            }
            return h.b(B10);
        }
    }

    static {
        Class<b> cls = b.class;
        f65975d = AtomicLongFieldUpdater.newUpdater(cls, "sendersAndCloseStatus$volatile");
        f65976e = AtomicLongFieldUpdater.newUpdater(cls, "receivers$volatile");
        f65977f = AtomicLongFieldUpdater.newUpdater(cls, "bufferEnd$volatile");
        f65978g = AtomicLongFieldUpdater.newUpdater(cls, "completedExpandBuffersAndPauseFlag$volatile");
        Class<Object> cls2 = Object.class;
        f65979h = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "sendSegment$volatile");
        f65980i = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "receiveSegment$volatile");
        f65981j = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "bufferEndSegment$volatile");
        f65982k = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_closeCause$volatile");
        f65983l = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "closeHandler$volatile");
    }

    public b(int i10, C6798l lVar) {
        f fVar;
        this.f65984a = i10;
        this.f65985b = lVar;
        if (i10 >= 0) {
            this.bufferEnd$volatile = c.A(i10);
            this.completedExpandBuffersAndPauseFlag$volatile = T();
            j jVar = new j(0, (j) null, this, 3);
            this.sendSegment$volatile = jVar;
            this.receiveSegment$volatile = jVar;
            if (s0()) {
                jVar = c.f66008a;
                C6496s.f(jVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = jVar;
            if (lVar != null) {
                fVar = new f(this);
            } else {
                fVar = null;
            }
            this.f65986c = fVar;
            this._closeCause$volatile = c.f66026s;
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
    }

    /* access modifiers changed from: private */
    public final void A0(C5582n nVar) {
        v.a aVar = v.f71841b;
        nVar.resumeWith(v.b(w.a(Y())));
    }

    private final void B0(C5811j jVar) {
        jVar.e(c.z());
    }

    private final Object C0(Object obj, C6658d dVar) {
        P d10;
        C5584o oVar = new C5584o(C6680b.c(dVar), 1);
        oVar.E();
        C6798l lVar = this.f65985b;
        if (lVar == null || (d10 = y.d(lVar, obj, (P) null, 2, (Object) null)) == null) {
            Throwable c02 = c0();
            v.a aVar = v.f71841b;
            oVar.resumeWith(v.b(w.a(c02)));
        } else {
            C6523g.a(d10, c0());
            v.a aVar2 = v.f71841b;
            oVar.resumeWith(v.b(w.a(d10)));
        }
        Object v10 = oVar.v();
        if (v10 == C6680b.f()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (v10 == C6680b.f()) {
            return v10;
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public final void D0(Object obj, C5582n nVar) {
        C6798l lVar = this.f65985b;
        if (lVar != null) {
            y.b(lVar, obj, nVar.getContext());
        }
        Throwable c02 = c0();
        v.a aVar = v.f71841b;
        nVar.resumeWith(v.b(w.a(c02)));
    }

    private final boolean F(long j10) {
        if (j10 < T() || j10 < b0() + ((long) this.f65984a)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final void G0(i1 i1Var, j jVar, int i10) {
        F0();
        i1Var.c(jVar, i10);
    }

    private final void H(j jVar, long j10) {
        Object b10 = C5724m.b((Object) null, 1, (DefaultConstructorMarker) null);
        loop0:
        while (jVar != null) {
            for (int i10 = c.f66009b - 1; -1 < i10; i10--) {
                if ((jVar.f66948c * ((long) c.f66009b)) + ((long) i10) < j10) {
                    break loop0;
                }
                while (true) {
                    Object B10 = jVar.B(i10);
                    if (B10 == null || B10 == c.f66012e) {
                        if (jVar.v(i10, B10, c.z())) {
                            jVar.t();
                            break;
                        }
                    } else if (B10 instanceof v) {
                        if (jVar.v(i10, B10, c.z())) {
                            b10 = C5724m.c(b10, ((v) B10).f66046a);
                            jVar.C(i10, true);
                            break;
                        }
                    } else if (!(B10 instanceof i1)) {
                        break;
                    } else if (jVar.v(i10, B10, c.z())) {
                        b10 = C5724m.c(b10, B10);
                        jVar.C(i10, true);
                        break;
                    }
                }
            }
            jVar = (j) jVar.h();
        }
        if (b10 == null) {
            return;
        }
        if (!(b10 instanceof ArrayList)) {
            Q0((i1) b10);
            return;
        }
        C6496s.f(b10, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
        ArrayList arrayList = (ArrayList) b10;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            Q0((i1) arrayList.get(size));
        }
    }

    /* access modifiers changed from: private */
    public final void H0(i1 i1Var, j jVar, int i10) {
        i1Var.c(jVar, i10 + c.f66009b);
    }

    private final j I() {
        j jVar = f65981j.get(this);
        j jVar2 = (j) f65979h.get(this);
        if (jVar2.f66948c > ((j) jVar).f66948c) {
            jVar = jVar2;
        }
        j jVar3 = (j) f65980i.get(this);
        if (jVar3.f66948c > ((j) jVar).f66948c) {
            jVar = jVar3;
        }
        return (j) C5715d.b((C5716e) jVar);
    }

    /* access modifiers changed from: private */
    public final Object I0(Object obj, Object obj2) {
        if (obj2 != c.z()) {
            return obj2;
        }
        throw Y();
    }

    /* access modifiers changed from: private */
    public final Object J0(Object obj, Object obj2) {
        Object obj3;
        if (obj2 == c.z()) {
            obj3 = h.f66032b.a(V());
        } else {
            obj3 = h.f66032b.c(obj2);
        }
        return h.b(obj3);
    }

    private final void K(long j10) {
        P0(L(j10));
    }

    static /* synthetic */ Object K0(b bVar, C6658d dVar) {
        j jVar = (j) f65980i.get(bVar);
        while (!bVar.o0()) {
            long andIncrement = f65976e.getAndIncrement(bVar);
            int i10 = c.f66009b;
            long j10 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (jVar.f66948c != j10) {
                j a10 = bVar.Q(j10, jVar);
                if (a10 == null) {
                    continue;
                } else {
                    jVar = a10;
                }
            }
            Object D10 = bVar.b1(jVar, i11, andIncrement, (Object) null);
            if (D10 == c.f66020m) {
                throw new IllegalStateException("unexpected");
            } else if (D10 == c.f66022o) {
                if (andIncrement < bVar.f0()) {
                    jVar.c();
                }
            } else if (D10 == c.f66021n) {
                return bVar.N0(jVar, i11, andIncrement, dVar);
            } else {
                jVar.c();
                return D10;
            }
        }
        throw F.a(bVar.Y());
    }

    private final j L(long j10) {
        j I10 = I();
        if (r0()) {
            long t02 = t0(I10);
            if (t02 != -1) {
                N(t02);
            }
        }
        H(I10, j10);
        return I10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object L0(Wg.b r13, qf.C6658d r14) {
        /*
            boolean r0 = r14 instanceof Wg.b.g
            if (r0 == 0) goto L_0x0014
            r0 = r14
            Wg.b$g r0 = (Wg.b.g) r0
            int r1 = r0.f66000c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f66000c = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            Wg.b$g r0 = new Wg.b$g
            r0.<init>(r13, r14)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r14 = r6.f65998a
            java.lang.Object r0 = rf.C6680b.f()
            int r1 = r6.f66000c
            r2 = 1
            if (r1 == 0) goto L_0x003a
            if (r1 != r2) goto L_0x0032
            lf.w.b(r14)
            Wg.h r14 = (Wg.h) r14
            java.lang.Object r13 = r14.k()
            goto L_0x00b2
        L_0x0032:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003a:
            lf.w.b(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = f65980i
            java.lang.Object r14 = r14.get(r13)
            Wg.j r14 = (Wg.j) r14
        L_0x0047:
            boolean r1 = r13.o0()
            if (r1 == 0) goto L_0x0058
            Wg.h$b r14 = Wg.h.f66032b
            java.lang.Throwable r13 = r13.V()
            java.lang.Object r13 = r14.a(r13)
            goto L_0x00b2
        L_0x0058:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f65976e
            long r4 = r1.getAndIncrement(r13)
            int r1 = Wg.c.f66009b
            long r7 = (long) r1
            long r7 = r4 / r7
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.f66948c
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0077
            Wg.j r1 = r13.Q(r7, r14)
            if (r1 != 0) goto L_0x0076
            goto L_0x0047
        L_0x0076:
            r14 = r1
        L_0x0077:
            r12 = 0
            r7 = r13
            r8 = r14
            r9 = r3
            r10 = r4
            java.lang.Object r1 = r7.b1(r8, r9, r10, r12)
            Zg.G r7 = Wg.c.f66020m
            if (r1 == r7) goto L_0x00b3
            Zg.G r7 = Wg.c.f66022o
            if (r1 != r7) goto L_0x0098
            long r7 = r13.f0()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0047
            r14.c()
            goto L_0x0047
        L_0x0098:
            Zg.G r7 = Wg.c.f66021n
            if (r1 != r7) goto L_0x00a9
            r6.f66000c = r2
            r1 = r13
            r2 = r14
            java.lang.Object r13 = r1.M0(r2, r3, r4, r6)
            if (r13 != r0) goto L_0x00b2
            return r0
        L_0x00a9:
            r14.c()
            Wg.h$b r13 = Wg.h.f66032b
            java.lang.Object r13 = r13.c(r1)
        L_0x00b2:
            return r13
        L_0x00b3:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: Wg.b.L0(Wg.b, qf.d):java.lang.Object");
    }

    private final void M() {
        m();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object M0(Wg.j r11, int r12, long r13, qf.C6658d r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof Wg.b.h
            if (r0 == 0) goto L_0x0013
            r0 = r15
            Wg.b$h r0 = (Wg.b.h) r0
            int r1 = r0.f66007g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f66007g = r1
            goto L_0x0018
        L_0x0013:
            Wg.b$h r0 = new Wg.b$h
            r0.<init>(r10, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f66005e
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f66007g
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r11 = r0.f66002b
            Wg.j r11 = (Wg.j) r11
            java.lang.Object r11 = r0.f66001a
            Wg.b r11 = (Wg.b) r11
            lf.w.b(r15)
            goto L_0x0130
        L_0x0032:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003a:
            lf.w.b(r15)
            r0.f66001a = r10
            r0.f66002b = r11
            r0.f66003c = r12
            r0.f66004d = r13
            r0.f66007g = r3
            qf.d r15 = rf.C6680b.c(r0)
            Ug.o r15 = Ug.C5588q.b(r15)
            Wg.s r8 = new Wg.s     // Catch:{ all -> 0x006d }
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel.receiveCatchingOnNoWaiterSuspend_GKJJFZk$lambda$38>>"
            kotlin.jvm.internal.C6496s.f(r15, r2)     // Catch:{ all -> 0x006d }
            r8.<init>(r15)     // Catch:{ all -> 0x006d }
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r7 = r8
            java.lang.Object r2 = r2.b1(r3, r4, r5, r7)     // Catch:{ all -> 0x006d }
            Zg.G r3 = Wg.c.f66020m     // Catch:{ all -> 0x006d }
            if (r2 != r3) goto L_0x0070
            r10.G0(r8, r11, r12)     // Catch:{ all -> 0x006d }
            goto L_0x0120
        L_0x006d:
            r11 = move-exception
            goto L_0x0137
        L_0x0070:
            Zg.G r12 = Wg.c.f66022o     // Catch:{ all -> 0x006d }
            r9 = 0
            if (r2 != r12) goto L_0x0106
            long r2 = r10.f0()     // Catch:{ all -> 0x006d }
            int r12 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r12 >= 0) goto L_0x0082
            r11.c()     // Catch:{ all -> 0x006d }
        L_0x0082:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = f65980i     // Catch:{ all -> 0x006d }
            java.lang.Object r11 = r11.get(r10)     // Catch:{ all -> 0x006d }
            Wg.j r11 = (Wg.j) r11     // Catch:{ all -> 0x006d }
        L_0x008c:
            boolean r12 = r10.o0()     // Catch:{ all -> 0x006d }
            if (r12 == 0) goto L_0x0097
            r10.z0(r15)     // Catch:{ all -> 0x006d }
            goto L_0x0120
        L_0x0097:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r12 = f65976e     // Catch:{ all -> 0x006d }
            long r12 = r12.getAndIncrement(r10)     // Catch:{ all -> 0x006d }
            int r14 = Wg.c.f66009b     // Catch:{ all -> 0x006d }
            long r2 = (long) r14     // Catch:{ all -> 0x006d }
            long r2 = r12 / r2
            long r4 = (long) r14     // Catch:{ all -> 0x006d }
            long r4 = r12 % r4
            int r14 = (int) r4     // Catch:{ all -> 0x006d }
            long r4 = r11.f66948c     // Catch:{ all -> 0x006d }
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00b6
            Wg.j r2 = r10.Q(r2, r11)     // Catch:{ all -> 0x006d }
            if (r2 != 0) goto L_0x00b5
            goto L_0x008c
        L_0x00b5:
            r11 = r2
        L_0x00b6:
            r2 = r10
            r3 = r11
            r4 = r14
            r5 = r12
            r7 = r8
            java.lang.Object r2 = r2.b1(r3, r4, r5, r7)     // Catch:{ all -> 0x006d }
            Zg.G r3 = Wg.c.f66020m     // Catch:{ all -> 0x006d }
            if (r2 != r3) goto L_0x00c9
            r10.G0(r8, r11, r14)     // Catch:{ all -> 0x006d }
            goto L_0x0120
        L_0x00c9:
            Zg.G r14 = Wg.c.f66022o     // Catch:{ all -> 0x006d }
            if (r2 != r14) goto L_0x00db
            long r2 = r10.f0()     // Catch:{ all -> 0x006d }
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 >= 0) goto L_0x008c
            r11.c()     // Catch:{ all -> 0x006d }
            goto L_0x008c
        L_0x00db:
            Zg.G r12 = Wg.c.f66021n     // Catch:{ all -> 0x006d }
            if (r2 == r12) goto L_0x00fe
            r11.c()     // Catch:{ all -> 0x006d }
            Wg.h$b r11 = Wg.h.f66032b     // Catch:{ all -> 0x006d }
            java.lang.Object r11 = r11.c(r2)     // Catch:{ all -> 0x006d }
            Wg.h r11 = Wg.h.b(r11)     // Catch:{ all -> 0x006d }
            yf.l r12 = r10.f65985b     // Catch:{ all -> 0x006d }
            if (r12 == 0) goto L_0x00fa
            qf.g r13 = r15.getContext()     // Catch:{ all -> 0x006d }
            yf.l r9 = Zg.y.a(r12, r2, r13)     // Catch:{ all -> 0x006d }
        L_0x00fa:
            r15.x(r11, r9)     // Catch:{ all -> 0x006d }
            goto L_0x0120
        L_0x00fe:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006d }
            java.lang.String r12 = "unexpected"
            r11.<init>(r12)     // Catch:{ all -> 0x006d }
            throw r11     // Catch:{ all -> 0x006d }
        L_0x0106:
            r11.c()     // Catch:{ all -> 0x006d }
            Wg.h$b r11 = Wg.h.f66032b     // Catch:{ all -> 0x006d }
            java.lang.Object r11 = r11.c(r2)     // Catch:{ all -> 0x006d }
            Wg.h r11 = Wg.h.b(r11)     // Catch:{ all -> 0x006d }
            yf.l r12 = r10.f65985b     // Catch:{ all -> 0x006d }
            if (r12 == 0) goto L_0x00fa
            qf.g r13 = r15.getContext()     // Catch:{ all -> 0x006d }
            yf.l r9 = Zg.y.a(r12, r2, r13)     // Catch:{ all -> 0x006d }
            goto L_0x00fa
        L_0x0120:
            java.lang.Object r15 = r15.v()
            java.lang.Object r11 = rf.C6680b.f()
            if (r15 != r11) goto L_0x012d
            kotlin.coroutines.jvm.internal.h.c(r0)
        L_0x012d:
            if (r15 != r1) goto L_0x0130
            return r1
        L_0x0130:
            Wg.h r15 = (Wg.h) r15
            java.lang.Object r11 = r15.k()
            return r11
        L_0x0137:
            r15.O()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Wg.b.M0(Wg.j, int, long, qf.d):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v2, types: [yf.l] */
    /* JADX WARNING: type inference failed for: r7v3, types: [Ug.i1] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object N0(Wg.j r9, int r10, long r11, qf.C6658d r13) {
        /*
            r8 = this;
            qf.d r0 = rf.C6680b.c(r13)
            Ug.o r0 = Ug.C5588q.b(r0)
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r0
            java.lang.Object r1 = r1.b1(r2, r3, r4, r6)     // Catch:{ all -> 0x001c }
            Zg.G r2 = Wg.c.f66020m     // Catch:{ all -> 0x001c }
            if (r1 != r2) goto L_0x001f
            r8.G0(r0, r9, r10)     // Catch:{ all -> 0x001c }
            goto L_0x00c0
        L_0x001c:
            r9 = move-exception
            goto L_0x00ce
        L_0x001f:
            Zg.G r10 = Wg.c.f66022o     // Catch:{ all -> 0x001c }
            r7 = 0
            if (r1 != r10) goto L_0x00b0
            long r1 = r8.f0()     // Catch:{ all -> 0x001c }
            int r10 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r10 >= 0) goto L_0x0031
            r9.c()     // Catch:{ all -> 0x001c }
        L_0x0031:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = f65980i     // Catch:{ all -> 0x001c }
            java.lang.Object r9 = r9.get(r8)     // Catch:{ all -> 0x001c }
            Wg.j r9 = (Wg.j) r9     // Catch:{ all -> 0x001c }
        L_0x003b:
            boolean r10 = r8.o0()     // Catch:{ all -> 0x001c }
            if (r10 == 0) goto L_0x0046
            r8.A0(r0)     // Catch:{ all -> 0x001c }
            goto L_0x00c0
        L_0x0046:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = f65976e     // Catch:{ all -> 0x001c }
            long r10 = r10.getAndIncrement(r8)     // Catch:{ all -> 0x001c }
            int r12 = Wg.c.f66009b     // Catch:{ all -> 0x001c }
            long r1 = (long) r12     // Catch:{ all -> 0x001c }
            long r1 = r10 / r1
            long r3 = (long) r12     // Catch:{ all -> 0x001c }
            long r3 = r10 % r3
            int r12 = (int) r3     // Catch:{ all -> 0x001c }
            long r3 = r9.f66948c     // Catch:{ all -> 0x001c }
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0065
            Wg.j r1 = r8.Q(r1, r9)     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x0064
            goto L_0x003b
        L_0x0064:
            r9 = r1
        L_0x0065:
            r1 = r8
            r2 = r9
            r3 = r12
            r4 = r10
            r6 = r0
            java.lang.Object r1 = r1.b1(r2, r3, r4, r6)     // Catch:{ all -> 0x001c }
            Zg.G r2 = Wg.c.f66020m     // Catch:{ all -> 0x001c }
            if (r1 != r2) goto L_0x007d
            if (r0 == 0) goto L_0x0077
            r7 = r0
        L_0x0077:
            if (r7 == 0) goto L_0x00c0
            r8.G0(r7, r9, r12)     // Catch:{ all -> 0x001c }
            goto L_0x00c0
        L_0x007d:
            Zg.G r12 = Wg.c.f66022o     // Catch:{ all -> 0x001c }
            if (r1 != r12) goto L_0x008f
            long r1 = r8.f0()     // Catch:{ all -> 0x001c }
            int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r10 >= 0) goto L_0x003b
            r9.c()     // Catch:{ all -> 0x001c }
            goto L_0x003b
        L_0x008f:
            Zg.G r10 = Wg.c.f66021n     // Catch:{ all -> 0x001c }
            if (r1 == r10) goto L_0x00a8
            r9.c()     // Catch:{ all -> 0x001c }
            yf.l r9 = r8.f65985b     // Catch:{ all -> 0x001c }
            if (r9 == 0) goto L_0x00a4
            qf.g r10 = r0.getContext()     // Catch:{ all -> 0x001c }
            yf.l r7 = Zg.y.a(r9, r1, r10)     // Catch:{ all -> 0x001c }
        L_0x00a4:
            r0.x(r1, r7)     // Catch:{ all -> 0x001c }
            goto L_0x00c0
        L_0x00a8:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x001c }
            java.lang.String r10 = "unexpected"
            r9.<init>(r10)     // Catch:{ all -> 0x001c }
            throw r9     // Catch:{ all -> 0x001c }
        L_0x00b0:
            r9.c()     // Catch:{ all -> 0x001c }
            yf.l r9 = r8.f65985b     // Catch:{ all -> 0x001c }
            if (r9 == 0) goto L_0x00a4
            qf.g r10 = r0.getContext()     // Catch:{ all -> 0x001c }
            yf.l r7 = Zg.y.a(r9, r1, r10)     // Catch:{ all -> 0x001c }
            goto L_0x00a4
        L_0x00c0:
            java.lang.Object r9 = r0.v()
            java.lang.Object r10 = rf.C6680b.f()
            if (r9 != r10) goto L_0x00cd
            kotlin.coroutines.jvm.internal.h.c(r13)
        L_0x00cd:
            return r9
        L_0x00ce:
            r0.O()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Wg.b.N0(Wg.j, int, long, qf.d):java.lang.Object");
    }

    private final void O() {
        if (!s0()) {
            j jVar = (j) f65981j.get(this);
            while (true) {
                long andIncrement = f65977f.getAndIncrement(this);
                int i10 = c.f66009b;
                long j10 = andIncrement / ((long) i10);
                if (f0() <= andIncrement) {
                    if (jVar.f66948c < j10 && jVar.f() != null) {
                        x0(j10, jVar);
                    }
                    k0(this, 0, 1, (Object) null);
                    return;
                }
                if (jVar.f66948c != j10) {
                    j P10 = P(j10, jVar, andIncrement);
                    if (P10 == null) {
                        continue;
                    } else {
                        jVar = P10;
                    }
                }
                if (Z0(jVar, (int) (andIncrement % ((long) i10)), andIncrement)) {
                    k0(this, 0, 1, (Object) null);
                    return;
                }
                k0(this, 0, 1, (Object) null);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void O0(C5811j jVar, Object obj) {
        i1 i1Var;
        j jVar2 = (j) f65980i.get(this);
        while (!o0()) {
            long andIncrement = f65976e.getAndIncrement(this);
            int i10 = c.f66009b;
            long j10 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (jVar2.f66948c != j10) {
                j a10 = Q(j10, jVar2);
                if (a10 == null) {
                    continue;
                } else {
                    jVar2 = a10;
                }
            }
            Object D10 = b1(jVar2, i11, andIncrement, jVar);
            if (D10 == c.f66020m) {
                if (jVar instanceof i1) {
                    i1Var = (i1) jVar;
                } else {
                    i1Var = null;
                }
                if (i1Var != null) {
                    G0(i1Var, jVar2, i11);
                    return;
                }
                return;
            } else if (D10 == c.f66022o) {
                if (andIncrement < f0()) {
                    jVar2.c();
                }
            } else if (D10 != c.f66021n) {
                jVar2.c();
                jVar.e(D10);
                return;
            } else {
                throw new IllegalStateException("unexpected");
            }
        }
        B0(jVar);
    }

    private final j P(long j10, j jVar, long j11) {
        Object c10;
        long j12 = j10;
        AtomicReferenceFieldUpdater U10 = f65981j;
        p pVar = (p) c.y();
        j jVar2 = jVar;
        loop0:
        while (true) {
            c10 = C5715d.c(jVar2, j12, pVar);
            if (E.c(c10)) {
                break;
            }
            D b10 = E.b(c10);
            while (true) {
                D d10 = (D) U10.get(this);
                if (d10.f66948c >= b10.f66948c) {
                    break loop0;
                } else if (b10.u()) {
                    if (androidx.concurrent.futures.b.a(U10, this, d10, b10)) {
                        if (d10.p()) {
                            d10.n();
                        }
                    } else if (b10.p()) {
                        b10.n();
                    }
                }
            }
        }
        if (E.c(c10)) {
            M();
            x0(j10, jVar);
            k0(this, 0, 1, (Object) null);
            return null;
        }
        j jVar3 = (j) E.b(c10);
        if (jVar3.f66948c <= j12) {
            return jVar3;
        }
        long j13 = jVar3.f66948c;
        int i10 = c.f66009b;
        if (f65977f.compareAndSet(this, j11 + 1, j13 * ((long) i10))) {
            j0((jVar3.f66948c * ((long) i10)) - j11);
            return null;
        }
        k0(this, 0, 1, (Object) null);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b3, code lost:
        r12 = (Wg.j) r12.h();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void P0(Wg.j r12) {
        /*
            r11 = this;
            yf.l r0 = r11.f65985b
            r1 = 0
            r2 = 1
            java.lang.Object r3 = Zg.C5724m.b(r1, r2, r1)
        L_0x0008:
            int r4 = Wg.c.f66009b
            int r4 = r4 - r2
        L_0x000b:
            r5 = -1
            if (r5 >= r4) goto L_0x00b3
            long r6 = r12.f66948c
            int r8 = Wg.c.f66009b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L_0x0016:
            java.lang.Object r8 = r12.B(r4)
            Zg.G r9 = Wg.c.f66016i
            if (r8 == r9) goto L_0x00bb
            Zg.G r9 = Wg.c.f66011d
            if (r8 != r9) goto L_0x0048
            long r9 = r11.b0()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x00bb
            Zg.G r9 = Wg.c.z()
            boolean r8 = r12.v(r4, r8, r9)
            if (r8 == 0) goto L_0x0016
            if (r0 == 0) goto L_0x0040
            java.lang.Object r5 = r12.A(r4)
            Zg.P r1 = Zg.y.c(r0, r5, r1)
        L_0x0040:
            r12.w(r4)
            r12.t()
            goto L_0x00af
        L_0x0048:
            Zg.G r9 = Wg.c.f66012e
            if (r8 == r9) goto L_0x00a2
            if (r8 != 0) goto L_0x0051
            goto L_0x00a2
        L_0x0051:
            boolean r9 = r8 instanceof Ug.i1
            if (r9 != 0) goto L_0x006e
            boolean r9 = r8 instanceof Wg.v
            if (r9 == 0) goto L_0x005a
            goto L_0x006e
        L_0x005a:
            Zg.G r9 = Wg.c.f66014g
            if (r8 == r9) goto L_0x00bb
            Zg.G r9 = Wg.c.f66013f
            if (r8 != r9) goto L_0x0067
            goto L_0x00bb
        L_0x0067:
            Zg.G r9 = Wg.c.f66014g
            if (r8 == r9) goto L_0x0016
            goto L_0x00af
        L_0x006e:
            long r9 = r11.b0()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x00bb
            boolean r9 = r8 instanceof Wg.v
            if (r9 == 0) goto L_0x0080
            r9 = r8
            Wg.v r9 = (Wg.v) r9
            Ug.i1 r9 = r9.f66046a
            goto L_0x0083
        L_0x0080:
            r9 = r8
            Ug.i1 r9 = (Ug.i1) r9
        L_0x0083:
            Zg.G r10 = Wg.c.z()
            boolean r8 = r12.v(r4, r8, r10)
            if (r8 == 0) goto L_0x0016
            if (r0 == 0) goto L_0x0097
            java.lang.Object r5 = r12.A(r4)
            Zg.P r1 = Zg.y.c(r0, r5, r1)
        L_0x0097:
            java.lang.Object r3 = Zg.C5724m.c(r3, r9)
            r12.w(r4)
            r12.t()
            goto L_0x00af
        L_0x00a2:
            Zg.G r9 = Wg.c.z()
            boolean r8 = r12.v(r4, r8, r9)
            if (r8 == 0) goto L_0x0016
            r12.t()
        L_0x00af:
            int r4 = r4 + -1
            goto L_0x000b
        L_0x00b3:
            Zg.e r12 = r12.h()
            Wg.j r12 = (Wg.j) r12
            if (r12 != 0) goto L_0x0008
        L_0x00bb:
            if (r3 == 0) goto L_0x00e1
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto L_0x00c7
            Ug.i1 r3 = (Ug.i1) r3
            r11.R0(r3)
            goto L_0x00e1
        L_0x00c7:
            java.lang.String r12 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.C6496s.f(r3, r12)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        L_0x00d3:
            if (r5 >= r12) goto L_0x00e1
            java.lang.Object r0 = r3.get(r12)
            Ug.i1 r0 = (Ug.i1) r0
            r11.R0(r0)
            int r12 = r12 + -1
            goto L_0x00d3
        L_0x00e1:
            if (r1 != 0) goto L_0x00e4
            return
        L_0x00e4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Wg.b.P0(Wg.j):void");
    }

    /* access modifiers changed from: private */
    public final j Q(long j10, j jVar) {
        Object c10;
        AtomicReferenceFieldUpdater Z10 = f65980i;
        p pVar = (p) c.y();
        loop0:
        while (true) {
            c10 = C5715d.c(jVar, j10, pVar);
            if (E.c(c10)) {
                break;
            }
            D b10 = E.b(c10);
            while (true) {
                D d10 = (D) Z10.get(this);
                if (d10.f66948c >= b10.f66948c) {
                    break loop0;
                } else if (b10.u()) {
                    if (androidx.concurrent.futures.b.a(Z10, this, d10, b10)) {
                        if (d10.p()) {
                            d10.n();
                        }
                    } else if (b10.p()) {
                        b10.n();
                    }
                }
            }
        }
        if (E.c(c10)) {
            M();
            if (jVar.f66948c * ((long) c.f66009b) >= f0()) {
                return null;
            }
            jVar.c();
            return null;
        }
        j jVar2 = (j) E.b(c10);
        if (!s0() && j10 <= T() / ((long) c.f66009b)) {
            AtomicReferenceFieldUpdater U10 = f65981j;
            while (true) {
                D d11 = (D) U10.get(this);
                if (d11.f66948c >= jVar2.f66948c || !jVar2.u()) {
                    break;
                } else if (androidx.concurrent.futures.b.a(U10, this, d11, jVar2)) {
                    if (d11.p()) {
                        d11.n();
                    }
                } else if (jVar2.p()) {
                    jVar2.n();
                }
            }
        }
        long j11 = jVar2.f66948c;
        if (j11 <= j10) {
            return jVar2;
        }
        int i10 = c.f66009b;
        f1(j11 * ((long) i10));
        if (jVar2.f66948c * ((long) i10) >= f0()) {
            return null;
        }
        jVar2.c();
        return null;
    }

    private final void Q0(i1 i1Var) {
        S0(i1Var, true);
    }

    /* access modifiers changed from: private */
    public final j R(long j10, j jVar) {
        Object c10;
        AtomicReferenceFieldUpdater d02 = f65979h;
        p pVar = (p) c.y();
        loop0:
        while (true) {
            c10 = C5715d.c(jVar, j10, pVar);
            if (E.c(c10)) {
                break;
            }
            D b10 = E.b(c10);
            while (true) {
                D d10 = (D) d02.get(this);
                if (d10.f66948c >= b10.f66948c) {
                    break loop0;
                } else if (b10.u()) {
                    if (androidx.concurrent.futures.b.a(d02, this, d10, b10)) {
                        if (d10.p()) {
                            d10.n();
                        }
                    } else if (b10.p()) {
                        b10.n();
                    }
                }
            }
        }
        if (E.c(c10)) {
            M();
            if (jVar.f66948c * ((long) c.f66009b) >= b0()) {
                return null;
            }
            jVar.c();
            return null;
        }
        j jVar2 = (j) E.b(c10);
        long j11 = jVar2.f66948c;
        if (j11 <= j10) {
            return jVar2;
        }
        int i10 = c.f66009b;
        g1(j11 * ((long) i10));
        if (jVar2.f66948c * ((long) i10) >= b0()) {
            return null;
        }
        jVar2.c();
        return null;
    }

    private final void R0(i1 i1Var) {
        S0(i1Var, false);
    }

    private final void S0(i1 i1Var, boolean z10) {
        Throwable th2;
        if (i1Var instanceof C5582n) {
            C6658d dVar = (C6658d) i1Var;
            v.a aVar = v.f71841b;
            if (z10) {
                th2 = Y();
            } else {
                th2 = c0();
            }
            dVar.resumeWith(v.b(w.a(th2)));
        } else if (i1Var instanceof s) {
            C5584o oVar = ((s) i1Var).f66045a;
            v.a aVar2 = v.f71841b;
            oVar.resumeWith(v.b(h.b(h.f66032b.a(V()))));
        } else if (i1Var instanceof a) {
            ((a) i1Var).j();
        } else if (i1Var instanceof C5811j) {
            ((C5811j) i1Var).g(this, c.z());
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + i1Var).toString());
        }
    }

    private final long T() {
        return f65977f.get(this);
    }

    static /* synthetic */ Object T0(b bVar, Object obj, C6658d dVar) {
        j jVar = (j) f65979h.get(bVar);
        while (true) {
            long andIncrement = f65975d.getAndIncrement(bVar);
            long j10 = 1152921504606846975L & andIncrement;
            boolean s10 = bVar.q0(andIncrement);
            int i10 = c.f66009b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (jVar.f66948c != j11) {
                j b10 = bVar.R(j11, jVar);
                if (b10 != null) {
                    jVar = b10;
                } else if (s10) {
                    Object C02 = bVar.C0(obj, dVar);
                    if (C02 == C6680b.f()) {
                        return C02;
                    }
                }
            }
            int E10 = bVar.d1(jVar, i11, obj, j10, (Object) null, s10);
            if (E10 == 0) {
                jVar.c();
                break;
            } else if (E10 == 1) {
                break;
            } else if (E10 != 2) {
                if (E10 == 3) {
                    Object U02 = bVar.U0(jVar, i11, obj, j10, dVar);
                    if (U02 == C6680b.f()) {
                        return U02;
                    }
                } else if (E10 == 4) {
                    if (j10 < bVar.b0()) {
                        jVar.c();
                    }
                    Object C03 = bVar.C0(obj, dVar);
                    if (C03 == C6680b.f()) {
                        return C03;
                    }
                } else if (E10 == 5) {
                    jVar.c();
                }
            } else if (s10) {
                jVar.t();
                Object C04 = bVar.C0(obj, dVar);
                if (C04 == C6680b.f()) {
                    return C04;
                }
            }
        }
        return C6514M.f71813a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object U0(Wg.j r21, int r22, java.lang.Object r23, long r24, qf.C6658d r26) {
        /*
            r20 = this;
            r9 = r20
            r0 = r23
            qf.d r1 = rf.C6680b.c(r26)
            Ug.o r10 = Ug.C5588q.b(r1)
            r8 = 0
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r7 = r10
            int r1 = r1.d1(r2, r3, r4, r5, r7, r8)     // Catch:{ all -> 0x0068 }
            if (r1 == 0) goto L_0x00fa
            r11 = 1
            if (r1 == r11) goto L_0x00f1
            r12 = 2
            if (r1 == r12) goto L_0x00e9
            r13 = 4
            if (r1 == r13) goto L_0x00dc
            java.lang.String r14 = "unexpected"
            r15 = 5
            if (r1 != r15) goto L_0x00d6
            r21.c()     // Catch:{ all -> 0x0068 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f65979h     // Catch:{ all -> 0x0068 }
            java.lang.Object r1 = r1.get(r9)     // Catch:{ all -> 0x0068 }
            Wg.j r1 = (Wg.j) r1     // Catch:{ all -> 0x0068 }
        L_0x0039:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f65975d     // Catch:{ all -> 0x0068 }
            long r2 = r2.getAndIncrement(r9)     // Catch:{ all -> 0x0068 }
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r16 = r2 & r4
            boolean r18 = r9.q0(r2)     // Catch:{ all -> 0x0068 }
            int r2 = Wg.c.f66009b     // Catch:{ all -> 0x0068 }
            long r3 = (long) r2     // Catch:{ all -> 0x0068 }
            long r3 = r16 / r3
            long r5 = (long) r2     // Catch:{ all -> 0x0068 }
            long r5 = r16 % r5
            int r8 = (int) r5     // Catch:{ all -> 0x0068 }
            long r5 = r1.f66948c     // Catch:{ all -> 0x0068 }
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x006d
            Wg.j r2 = r9.R(r3, r1)     // Catch:{ all -> 0x0068 }
            if (r2 != 0) goto L_0x006b
            if (r18 == 0) goto L_0x0039
        L_0x0063:
            r9.D0(r0, r10)     // Catch:{ all -> 0x0068 }
            goto L_0x0108
        L_0x0068:
            r0 = move-exception
            goto L_0x011f
        L_0x006b:
            r7 = r2
            goto L_0x006e
        L_0x006d:
            r7 = r1
        L_0x006e:
            r1 = r20
            r2 = r7
            r3 = r8
            r4 = r23
            r5 = r16
            r21 = r7
            r7 = r10
            r19 = r8
            r8 = r18
            int r1 = r1.d1(r2, r3, r4, r5, r7, r8)     // Catch:{ all -> 0x0068 }
            if (r1 == 0) goto L_0x00c8
            if (r1 == r11) goto L_0x00bc
            if (r1 == r12) goto L_0x00a7
            r2 = 3
            if (r1 == r2) goto L_0x00a1
            if (r1 == r13) goto L_0x0095
            if (r1 == r15) goto L_0x008f
            goto L_0x0092
        L_0x008f:
            r21.c()     // Catch:{ all -> 0x0068 }
        L_0x0092:
            r1 = r21
            goto L_0x0039
        L_0x0095:
            long r1 = r20.b0()     // Catch:{ all -> 0x0068 }
            int r1 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0063
            r21.c()     // Catch:{ all -> 0x0068 }
            goto L_0x0063
        L_0x00a1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0068 }
            r0.<init>(r14)     // Catch:{ all -> 0x0068 }
            throw r0     // Catch:{ all -> 0x0068 }
        L_0x00a7:
            if (r18 == 0) goto L_0x00ad
            r21.t()     // Catch:{ all -> 0x0068 }
            goto L_0x0063
        L_0x00ad:
            if (r10 == 0) goto L_0x00b1
            r0 = r10
            goto L_0x00b2
        L_0x00b1:
            r0 = 0
        L_0x00b2:
            if (r0 == 0) goto L_0x0108
            r2 = r21
            r1 = r19
            r9.H0(r0, r2, r1)     // Catch:{ all -> 0x0068 }
            goto L_0x0108
        L_0x00bc:
            lf.v$a r0 = lf.v.f71841b     // Catch:{ all -> 0x0068 }
            lf.M r0 = lf.C6514M.f71813a     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = lf.v.b(r0)     // Catch:{ all -> 0x0068 }
        L_0x00c4:
            r10.resumeWith(r0)     // Catch:{ all -> 0x0068 }
            goto L_0x0108
        L_0x00c8:
            r2 = r21
            r2.c()     // Catch:{ all -> 0x0068 }
            lf.v$a r0 = lf.v.f71841b     // Catch:{ all -> 0x0068 }
            lf.M r0 = lf.C6514M.f71813a     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = lf.v.b(r0)     // Catch:{ all -> 0x0068 }
            goto L_0x00c4
        L_0x00d6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0068 }
            r0.<init>(r14)     // Catch:{ all -> 0x0068 }
            throw r0     // Catch:{ all -> 0x0068 }
        L_0x00dc:
            long r1 = r20.b0()     // Catch:{ all -> 0x0068 }
            int r1 = (r24 > r1 ? 1 : (r24 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0063
            r21.c()     // Catch:{ all -> 0x0068 }
            goto L_0x0063
        L_0x00e9:
            r0 = r21
            r1 = r22
            r9.H0(r10, r0, r1)     // Catch:{ all -> 0x0068 }
            goto L_0x0108
        L_0x00f1:
            lf.v$a r0 = lf.v.f71841b     // Catch:{ all -> 0x0068 }
            lf.M r0 = lf.C6514M.f71813a     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = lf.v.b(r0)     // Catch:{ all -> 0x0068 }
            goto L_0x00c4
        L_0x00fa:
            r0 = r21
            r21.c()     // Catch:{ all -> 0x0068 }
            lf.v$a r0 = lf.v.f71841b     // Catch:{ all -> 0x0068 }
            lf.M r0 = lf.C6514M.f71813a     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = lf.v.b(r0)     // Catch:{ all -> 0x0068 }
            goto L_0x00c4
        L_0x0108:
            java.lang.Object r0 = r10.v()
            java.lang.Object r1 = rf.C6680b.f()
            if (r0 != r1) goto L_0x0115
            kotlin.coroutines.jvm.internal.h.c(r26)
        L_0x0115:
            java.lang.Object r1 = rf.C6680b.f()
            if (r0 != r1) goto L_0x011c
            return r0
        L_0x011c:
            lf.M r0 = lf.C6514M.f71813a
            return r0
        L_0x011f:
            r10.O()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Wg.b.U0(Wg.j, int, java.lang.Object, long, qf.d):java.lang.Object");
    }

    private final boolean V0(long j10) {
        if (q0(j10)) {
            return false;
        }
        return !F(j10 & 1152921504606846975L);
    }

    private final boolean W0(Object obj, Object obj2) {
        if (obj instanceof C5811j) {
            return ((C5811j) obj).g(this, obj2);
        }
        C6798l lVar = null;
        if (obj instanceof s) {
            C6496s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            s sVar = (s) obj;
            C5584o oVar = sVar.f66045a;
            h b10 = h.b(h.f66032b.c(obj2));
            C6798l lVar2 = this.f65985b;
            if (lVar2 != null) {
                lVar = y.a(lVar2, obj2, sVar.f66045a.getContext());
            }
            return c.B(oVar, b10, lVar);
        } else if (obj instanceof a) {
            C6496s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(obj2);
        } else if (obj instanceof C5582n) {
            C6496s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            C5582n nVar = (C5582n) obj;
            C6798l lVar3 = this.f65985b;
            if (lVar3 != null) {
                lVar = y.a(lVar3, obj2, nVar.getContext());
            }
            return c.B(nVar, obj2, lVar);
        } else {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
    }

    private final boolean X0(Object obj, j jVar, int i10) {
        if (obj instanceof C5582n) {
            C6496s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return c.C((C5582n) obj, C6514M.f71813a, (C6798l) null, 2, (Object) null);
        } else if (obj instanceof C5811j) {
            C6496s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            C5813l x10 = ((C5810i) obj).x(this, C6514M.f71813a);
            if (x10 == C5813l.REREGISTER) {
                jVar.w(i10);
            }
            if (x10 == C5813l.SUCCESSFUL) {
                return true;
            }
            return false;
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
    }

    /* access modifiers changed from: private */
    public final Throwable Y() {
        Throwable V10 = V();
        if (V10 == null) {
            return new m("Channel was closed");
        }
        return V10;
    }

    private final boolean Z0(j jVar, int i10, long j10) {
        Object B10 = jVar.B(i10);
        if (!(B10 instanceof i1) || j10 < f65976e.get(this) || !jVar.v(i10, B10, c.f66014g)) {
            return a1(jVar, i10, j10);
        }
        if (X0(B10, jVar, i10)) {
            jVar.F(i10, c.f66011d);
            return true;
        }
        jVar.F(i10, c.f66017j);
        jVar.C(i10, false);
        return false;
    }

    private final boolean a1(j jVar, int i10, long j10) {
        while (true) {
            Object B10 = jVar.B(i10);
            if (B10 instanceof i1) {
                if (j10 < f65976e.get(this)) {
                    if (jVar.v(i10, B10, new v((i1) B10))) {
                        return true;
                    }
                } else if (jVar.v(i10, B10, c.f66014g)) {
                    if (X0(B10, jVar, i10)) {
                        jVar.F(i10, c.f66011d);
                        return true;
                    }
                    jVar.F(i10, c.f66017j);
                    jVar.C(i10, false);
                    return false;
                }
            } else if (B10 == c.f66017j) {
                return false;
            } else {
                if (B10 == null) {
                    if (jVar.v(i10, B10, c.f66012e)) {
                        return true;
                    }
                } else if (B10 == c.f66011d || B10 == c.f66015h || B10 == c.f66016i || B10 == c.f66018k || B10 == c.z()) {
                    return true;
                } else {
                    if (B10 != c.f66013f) {
                        throw new IllegalStateException(("Unexpected cell state: " + B10).toString());
                    }
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public final Object b1(j jVar, int i10, long j10, Object obj) {
        Object B10 = jVar.B(i10);
        if (B10 == null) {
            if (j10 >= (f65975d.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return c.f66021n;
                }
                if (jVar.v(i10, B10, obj)) {
                    O();
                    return c.f66020m;
                }
            }
        } else if (B10 == c.f66011d && jVar.v(i10, B10, c.f66016i)) {
            O();
            return jVar.D(i10);
        }
        return c1(jVar, i10, j10, obj);
    }

    private final Object c1(j jVar, int i10, long j10, Object obj) {
        while (true) {
            Object B10 = jVar.B(i10);
            if (B10 == null || B10 == c.f66012e) {
                if (j10 < (f65975d.get(this) & 1152921504606846975L)) {
                    if (jVar.v(i10, B10, c.f66015h)) {
                        O();
                        return c.f66022o;
                    }
                } else if (obj == null) {
                    return c.f66021n;
                } else {
                    if (jVar.v(i10, B10, obj)) {
                        O();
                        return c.f66020m;
                    }
                }
            } else if (B10 == c.f66011d) {
                if (jVar.v(i10, B10, c.f66016i)) {
                    O();
                    return jVar.D(i10);
                }
            } else if (B10 == c.f66017j) {
                return c.f66022o;
            } else {
                if (B10 == c.f66015h) {
                    return c.f66022o;
                }
                if (B10 == c.z()) {
                    O();
                    return c.f66022o;
                } else if (B10 != c.f66014g && jVar.v(i10, B10, c.f66013f)) {
                    boolean z10 = B10 instanceof v;
                    if (z10) {
                        B10 = ((v) B10).f66046a;
                    }
                    if (X0(B10, jVar, i10)) {
                        jVar.F(i10, c.f66016i);
                        O();
                        return jVar.D(i10);
                    }
                    jVar.F(i10, c.f66017j);
                    jVar.C(i10, false);
                    if (z10) {
                        O();
                    }
                    return c.f66022o;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final int d1(j jVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        jVar.G(i10, obj);
        if (z10) {
            return e1(jVar, i10, obj, j10, obj2, z10);
        }
        Object B10 = jVar.B(i10);
        if (B10 == null) {
            if (F(j10)) {
                if (jVar.v(i10, (Object) null, c.f66011d)) {
                    return 1;
                }
            } else if (obj2 == null) {
                return 3;
            } else {
                if (jVar.v(i10, (Object) null, obj2)) {
                    return 2;
                }
            }
        } else if (B10 instanceof i1) {
            jVar.w(i10);
            if (W0(B10, obj)) {
                jVar.F(i10, c.f66016i);
                E0();
                return 0;
            }
            if (jVar.x(i10, c.f66018k) != c.f66018k) {
                jVar.C(i10, true);
            }
            return 5;
        }
        return e1(jVar, i10, obj, j10, obj2, z10);
    }

    private final int e1(j jVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        while (true) {
            Object B10 = jVar.B(i10);
            if (B10 == null) {
                if (!F(j10) || z10) {
                    if (z10) {
                        if (jVar.v(i10, (Object) null, c.f66017j)) {
                            jVar.C(i10, false);
                            return 4;
                        }
                    } else if (obj2 == null) {
                        return 3;
                    } else {
                        if (jVar.v(i10, (Object) null, obj2)) {
                            return 2;
                        }
                    }
                } else if (jVar.v(i10, (Object) null, c.f66011d)) {
                    return 1;
                }
            } else if (B10 == c.f66012e) {
                if (jVar.v(i10, B10, c.f66011d)) {
                    return 1;
                }
            } else if (B10 == c.f66018k) {
                jVar.w(i10);
                return 5;
            } else if (B10 == c.f66015h) {
                jVar.w(i10);
                return 5;
            } else if (B10 == c.z()) {
                jVar.w(i10);
                M();
                return 4;
            } else {
                jVar.w(i10);
                if (B10 instanceof v) {
                    B10 = ((v) B10).f66046a;
                }
                if (W0(B10, obj)) {
                    jVar.F(i10, c.f66016i);
                    E0();
                    return 0;
                }
                if (jVar.x(i10, c.f66018k) != c.f66018k) {
                    jVar.C(i10, true);
                }
                return 5;
            }
        }
    }

    private final void f1(long j10) {
        long j11;
        AtomicLongFieldUpdater a02 = f65976e;
        do {
            j11 = a02.get(this);
            if (j11 >= j10 || f65976e.compareAndSet(this, j11, j10)) {
            }
            j11 = a02.get(this);
            return;
        } while (f65976e.compareAndSet(this, j11, j10));
    }

    private final void g1(long j10) {
        long j11;
        long j12;
        AtomicLongFieldUpdater e02 = f65975d;
        do {
            j11 = e02.get(this);
            j12 = 1152921504606846975L & j11;
            if (j12 < j10) {
            } else {
                return;
            }
        } while (!f65975d.compareAndSet(this, j11, c.w(j12, (int) (j11 >> 60))));
    }

    private final void j0(long j10) {
        if ((f65978g.addAndGet(this, j10) & 4611686018427387904L) != 0) {
            do {
            } while ((f65978g.get(this) & 4611686018427387904L) != 0);
        }
    }

    static /* synthetic */ void k0(b bVar, long j10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                j10 = 1;
            }
            bVar.j0(j10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
    }

    private final void l0() {
        Object obj;
        G g10;
        AtomicReferenceFieldUpdater W10 = f65983l;
        do {
            obj = W10.get(this);
            if (obj == null) {
                g10 = c.f66024q;
            } else {
                g10 = c.f66025r;
            }
        } while (!androidx.concurrent.futures.b.a(W10, this, obj, g10));
        if (obj != null) {
            C6798l lVar = (C6798l) V.f(obj, 1);
            ((C6798l) obj).invoke(V());
        }
    }

    private final boolean m0(j jVar, int i10, long j10) {
        Object B10;
        do {
            B10 = jVar.B(i10);
            if (B10 != null && B10 != c.f66012e) {
                if (B10 == c.f66011d) {
                    return true;
                }
                if (B10 == c.f66017j || B10 == c.z() || B10 == c.f66016i || B10 == c.f66015h) {
                    return false;
                }
                if (B10 == c.f66014g) {
                    return true;
                }
                if (B10 != c.f66013f && j10 == b0()) {
                    return true;
                }
                return false;
            }
        } while (!jVar.v(i10, B10, c.f66015h));
        O();
        return false;
    }

    private final boolean n0(long j10, boolean z10) {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            L(j10 & 1152921504606846975L);
            if (z10 && i0()) {
                return false;
            }
        } else if (i10 == 3) {
            K(j10 & 1152921504606846975L);
        } else {
            throw new IllegalStateException(("unexpected close status: " + i10).toString());
        }
        return true;
    }

    private final boolean p0(long j10) {
        return n0(j10, true);
    }

    /* access modifiers changed from: private */
    public final boolean q0(long j10) {
        return n0(j10, false);
    }

    private final boolean s0() {
        long T10 = T();
        if (T10 == 0 || T10 == Long.MAX_VALUE) {
            return true;
        }
        return false;
    }

    private final long t0(j jVar) {
        do {
            int i10 = c.f66009b;
            while (true) {
                i10--;
                if (-1 < i10) {
                    long j10 = (jVar.f66948c * ((long) c.f66009b)) + ((long) i10);
                    if (j10 < b0()) {
                        return -1;
                    }
                    while (true) {
                        Object B10 = jVar.B(i10);
                        if (B10 == null || B10 == c.f66012e) {
                            if (jVar.v(i10, B10, c.z())) {
                                jVar.t();
                                break;
                            }
                        } else if (B10 == c.f66011d) {
                            return j10;
                        }
                    }
                } else {
                    jVar = (j) jVar.h();
                }
            }
        } while (jVar != null);
        return -1;
    }

    private final void u0() {
        long j10;
        AtomicLongFieldUpdater e02 = f65975d;
        do {
            j10 = e02.get(this);
            if (((int) (j10 >> 60)) == 0) {
            } else {
                return;
            }
        } while (!e02.compareAndSet(this, j10, c.w(1152921504606846975L & j10, 1)));
    }

    private final void v0() {
        long j10;
        AtomicLongFieldUpdater e02 = f65975d;
        do {
            j10 = e02.get(this);
        } while (!e02.compareAndSet(this, j10, c.w(1152921504606846975L & j10, 3)));
    }

    private final void w0() {
        long j10;
        long b10;
        AtomicLongFieldUpdater e02 = f65975d;
        do {
            j10 = e02.get(this);
            int i10 = (int) (j10 >> 60);
            if (i10 == 0) {
                b10 = c.w(j10 & 1152921504606846975L, 2);
            } else if (i10 == 1) {
                b10 = c.w(j10 & 1152921504606846975L, 3);
            } else {
                return;
            }
        } while (!e02.compareAndSet(this, j10, b10));
    }

    private final void x0(long j10, j jVar) {
        j jVar2;
        j jVar3;
        while (jVar.f66948c < j10 && (jVar3 = (j) jVar.f()) != null) {
            jVar = jVar3;
        }
        while (true) {
            if (!jVar.k() || (jVar2 = (j) jVar.f()) == null) {
                AtomicReferenceFieldUpdater U10 = f65981j;
                while (true) {
                    D d10 = (D) U10.get(this);
                    if (d10.f66948c < jVar.f66948c) {
                        if (!jVar.u()) {
                            continue;
                            break;
                        } else if (androidx.concurrent.futures.b.a(U10, this, d10, jVar)) {
                            if (d10.p()) {
                                d10.n();
                                return;
                            }
                            return;
                        } else if (jVar.p()) {
                            jVar.n();
                        }
                    } else {
                        return;
                    }
                }
            } else {
                jVar = jVar2;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void z0(C5582n nVar) {
        v.a aVar = v.f71841b;
        nVar.resumeWith(v.b(h.b(h.f66032b.a(V()))));
    }

    public boolean G(Throwable th2) {
        if (th2 == null) {
            th2 = new CancellationException("Channel was cancelled");
        }
        return J(th2, true);
    }

    /* access modifiers changed from: protected */
    public boolean J(Throwable th2, boolean z10) {
        if (z10) {
            u0();
        }
        boolean a10 = androidx.concurrent.futures.b.a(f65982k, this, c.f66026s, th2);
        if (z10) {
            v0();
        } else {
            w0();
        }
        M();
        y0();
        if (a10) {
            l0();
        }
        return a10;
    }

    /* access modifiers changed from: protected */
    public final void N(long j10) {
        P d10;
        j jVar = (j) f65980i.get(this);
        while (true) {
            long j11 = f65976e.get(this);
            if (j10 >= Math.max(((long) this.f65984a) + j11, T())) {
                if (f65976e.compareAndSet(this, j11, j11 + 1)) {
                    int i10 = c.f66009b;
                    long j12 = j11 / ((long) i10);
                    int i11 = (int) (j11 % ((long) i10));
                    if (jVar.f66948c != j12) {
                        j Q10 = Q(j12, jVar);
                        if (Q10 == null) {
                            continue;
                        } else {
                            jVar = Q10;
                        }
                    }
                    Object b12 = b1(jVar, i11, j11, (Object) null);
                    if (b12 != c.f66022o) {
                        jVar.c();
                        C6798l lVar = this.f65985b;
                        if (!(lVar == null || (d10 = y.d(lVar, b12, (P) null, 2, (Object) null)) == null)) {
                            throw d10;
                        }
                    } else if (j11 < f0()) {
                        jVar.c();
                    }
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final Throwable V() {
        return (Throwable) f65982k.get(this);
    }

    /* access modifiers changed from: protected */
    public final Object Y0(Object obj) {
        j jVar;
        i1 i1Var;
        G g10 = c.f66011d;
        j jVar2 = (j) f65979h.get(this);
        while (true) {
            long andIncrement = f65975d.getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean s10 = q0(andIncrement);
            int i10 = c.f66009b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (jVar2.f66948c != j11) {
                j b10 = R(j11, jVar2);
                if (b10 != null) {
                    jVar = b10;
                } else if (s10) {
                    return h.f66032b.a(c0());
                }
            } else {
                jVar = jVar2;
            }
            int E10 = d1(jVar, i11, obj, j10, g10, s10);
            if (E10 == 0) {
                jVar.c();
                return h.f66032b.c(C6514M.f71813a);
            } else if (E10 == 1) {
                return h.f66032b.c(C6514M.f71813a);
            } else {
                if (E10 != 2) {
                    if (E10 == 3) {
                        throw new IllegalStateException("unexpected");
                    } else if (E10 != 4) {
                        if (E10 == 5) {
                            jVar.c();
                        }
                        jVar2 = jVar;
                    } else {
                        if (j10 < b0()) {
                            jVar.c();
                        }
                        return h.f66032b.a(c0());
                    }
                } else if (s10) {
                    jVar.t();
                    return h.f66032b.a(c0());
                } else {
                    if (g10 instanceof i1) {
                        i1Var = (i1) g10;
                    } else {
                        i1Var = null;
                    }
                    if (i1Var != null) {
                        H0(i1Var, jVar, i11);
                    }
                    N((jVar.f66948c * ((long) i10)) + ((long) i11));
                    return h.f66032b.c(C6514M.f71813a);
                }
            }
        }
    }

    public final long b0() {
        return f65976e.get(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return Wg.h.f66032b.c(lf.C6514M.f71813a);
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b8 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(java.lang.Object r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f65975d
            long r0 = r0.get(r14)
            boolean r0 = r14.V0(r0)
            if (r0 == 0) goto L_0x0015
            Wg.h$b r15 = Wg.h.f66032b
            java.lang.Object r15 = r15.b()
            return r15
        L_0x0015:
            Zg.G r8 = Wg.c.f66017j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f65979h
            java.lang.Object r0 = r0.get(r14)
            Wg.j r0 = (Wg.j) r0
        L_0x0023:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f65975d
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = r14.q0(r1)
            int r1 = Wg.c.f66009b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.f66948c
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x005b
            Wg.j r1 = r14.R(r2, r0)
            if (r1 != 0) goto L_0x0059
            if (r11 == 0) goto L_0x0023
        L_0x004d:
            Wg.h$b r15 = Wg.h.f66032b
            java.lang.Throwable r0 = r14.c0()
            java.lang.Object r15 = r15.a(r0)
            goto L_0x00bc
        L_0x0059:
            r13 = r1
            goto L_0x005c
        L_0x005b:
            r13 = r0
        L_0x005c:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = r0.d1(r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto L_0x00b8
            r1 = 1
            if (r0 == r1) goto L_0x00af
            r1 = 2
            if (r0 == r1) goto L_0x0092
            r1 = 3
            if (r0 == r1) goto L_0x008a
            r1 = 4
            if (r0 == r1) goto L_0x007e
            r1 = 5
            if (r0 == r1) goto L_0x0079
            goto L_0x007c
        L_0x0079:
            r13.c()
        L_0x007c:
            r0 = r13
            goto L_0x0023
        L_0x007e:
            long r0 = r14.b0()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L_0x004d
            r13.c()
            goto L_0x004d
        L_0x008a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            r15.<init>(r0)
            throw r15
        L_0x0092:
            if (r11 == 0) goto L_0x0098
            r13.t()
            goto L_0x004d
        L_0x0098:
            boolean r15 = r8 instanceof Ug.i1
            if (r15 == 0) goto L_0x009f
            Ug.i1 r8 = (Ug.i1) r8
            goto L_0x00a0
        L_0x009f:
            r8 = 0
        L_0x00a0:
            if (r8 == 0) goto L_0x00a5
            r14.H0(r8, r13, r12)
        L_0x00a5:
            r13.t()
            Wg.h$b r15 = Wg.h.f66032b
            java.lang.Object r15 = r15.b()
            goto L_0x00bc
        L_0x00af:
            Wg.h$b r15 = Wg.h.f66032b
            lf.M r0 = lf.C6514M.f71813a
            java.lang.Object r15 = r15.c(r0)
            goto L_0x00bc
        L_0x00b8:
            r13.c()
            goto L_0x00af
        L_0x00bc:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: Wg.b.c(java.lang.Object):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public final Throwable c0() {
        Throwable V10 = V();
        if (V10 == null) {
            return new n("Channel was closed");
        }
        return V10;
    }

    public Object d(C6658d dVar) {
        return L0(this, dVar);
    }

    public void e(C6798l lVar) {
        if (!androidx.concurrent.futures.b.a(f65983l, this, (Object) null, lVar)) {
            AtomicReferenceFieldUpdater W10 = f65983l;
            do {
                Object obj = W10.get(this);
                if (obj != c.f66024q) {
                    if (obj == c.f66025r) {
                        throw new IllegalStateException("Another handler was already registered and successfully invoked");
                    }
                    throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                }
            } while (!androidx.concurrent.futures.b.a(f65983l, this, c.f66024q, c.f66025r));
            lVar.invoke(V());
        }
    }

    public final long f0() {
        return f65975d.get(this) & 1152921504606846975L;
    }

    public C5807f g() {
        C0962b bVar = C0962b.f65990a;
        C6496s.f(bVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        c cVar = c.f65991a;
        C6496s.f(cVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new C5808g(this, (q) V.f(bVar, 3), (q) V.f(cVar, 3), this.f65986c);
    }

    public C5807f h() {
        d dVar = d.f65992a;
        C6496s.f(dVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        e eVar = e.f65993a;
        C6496s.f(eVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new C5808g(this, (q) V.f(dVar, 3), (q) V.f(eVar, 3), this.f65986c);
    }

    public final void h1(long j10) {
        long j11;
        boolean z10;
        long j12;
        if (!s0()) {
            do {
            } while (T() <= j10);
            int g10 = c.f66010c;
            int i10 = 0;
            while (i10 < g10) {
                long T10 = T();
                if (T10 != (f65978g.get(this) & 4611686018427387903L) || T10 != T()) {
                    i10++;
                } else {
                    return;
                }
            }
            AtomicLongFieldUpdater X10 = f65978g;
            do {
                j11 = X10.get(this);
            } while (!X10.compareAndSet(this, j11, c.v(j11 & 4611686018427387903L, true)));
            while (true) {
                long T11 = T();
                long j13 = f65978g.get(this);
                long j14 = j13 & 4611686018427387903L;
                if ((4611686018427387904L & j13) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (T11 == j14 && T11 == T()) {
                    break;
                } else if (!z10) {
                    f65978g.compareAndSet(this, j13, c.v(j14, true));
                }
            }
            AtomicLongFieldUpdater X11 = f65978g;
            do {
                j12 = X11.get(this);
            } while (!X11.compareAndSet(this, j12, c.v(j12 & 4611686018427387903L, false)));
        }
    }

    public Object i() {
        j jVar;
        i1 i1Var;
        long j10 = f65976e.get(this);
        long j11 = f65975d.get(this);
        if (p0(j11)) {
            return h.f66032b.a(V());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return h.f66032b.b();
        }
        G i10 = c.f66018k;
        j jVar2 = (j) f65980i.get(this);
        while (!o0()) {
            long andIncrement = f65976e.getAndIncrement(this);
            int i11 = c.f66009b;
            long j12 = andIncrement / ((long) i11);
            int i12 = (int) (andIncrement % ((long) i11));
            if (jVar2.f66948c != j12) {
                j a10 = Q(j12, jVar2);
                if (a10 == null) {
                    continue;
                } else {
                    jVar = a10;
                }
            } else {
                jVar = jVar2;
            }
            Object D10 = b1(jVar, i12, andIncrement, i10);
            if (D10 == c.f66020m) {
                if (i10 instanceof i1) {
                    i1Var = (i1) i10;
                } else {
                    i1Var = null;
                }
                if (i1Var != null) {
                    G0(i1Var, jVar, i12);
                }
                h1(andIncrement);
                jVar.t();
                return h.f66032b.b();
            } else if (D10 == c.f66022o) {
                if (andIncrement < f0()) {
                    jVar.c();
                }
                jVar2 = jVar;
            } else if (D10 != c.f66021n) {
                jVar.c();
                return h.f66032b.c(D10);
            } else {
                throw new IllegalStateException("unexpected");
            }
        }
        return h.f66032b.a(V());
    }

    public final boolean i0() {
        while (true) {
            j jVar = (j) f65980i.get(this);
            long b02 = b0();
            if (f0() <= b02) {
                return false;
            }
            int i10 = c.f66009b;
            long j10 = b02 / ((long) i10);
            if (jVar.f66948c == j10 || (jVar = Q(j10, jVar)) != null) {
                jVar.c();
                if (m0(jVar, (int) (b02 % ((long) i10)), b02)) {
                    return true;
                }
                f65976e.compareAndSet(this, b02, 1 + b02);
            } else if (((j) f65980i.get(this)).f66948c < j10) {
                return false;
            }
        }
    }

    public f iterator() {
        return new a();
    }

    public boolean j(Throwable th2) {
        return J(th2, false);
    }

    public Object k(Object obj, C6658d dVar) {
        return T0(this, obj, dVar);
    }

    public Object l(C6658d dVar) {
        return K0(this, dVar);
    }

    public boolean m() {
        return q0(f65975d.get(this));
    }

    public final void n(CancellationException cancellationException) {
        G(cancellationException);
    }

    public boolean o0() {
        return p0(f65975d.get(this));
    }

    /* access modifiers changed from: protected */
    public boolean r0() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v13, types: [Zg.e] */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01dc, code lost:
        r3 = r3.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e3, code lost:
        if (r3 != null) goto L_0x0204;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r16 = this;
            r0 = r16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f65975d
            long r2 = r2.get(r0)
            r4 = 60
            long r2 = r2 >> r4
            int r2 = (int) r2
            r3 = 3
            r4 = 2
            if (r2 == r4) goto L_0x0020
            if (r2 == r3) goto L_0x001a
            goto L_0x0025
        L_0x001a:
            java.lang.String r2 = "cancelled,"
            r1.append(r2)
            goto L_0x0025
        L_0x0020:
            java.lang.String r2 = "closed,"
            r1.append(r2)
        L_0x0025:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "capacity="
            r2.append(r5)
            int r5 = r0.f65984a
            r2.append(r5)
            r5 = 44
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r2 = "data=["
            r1.append(r2)
            Wg.j[] r2 = new Wg.j[r3]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f65980i
            java.lang.Object r3 = r3.get(r0)
            r6 = 0
            r2[r6] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f65979h
            java.lang.Object r3 = r3.get(r0)
            r7 = 1
            r2[r7] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f65981j
            java.lang.Object r3 = r3.get(r0)
            r2[r4] = r3
            java.util.List r2 = mf.C6565s.q(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0076:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x008d
            java.lang.Object r4 = r2.next()
            r8 = r4
            Wg.j r8 = (Wg.j) r8
            Wg.j r9 = Wg.c.f66008a
            if (r8 == r9) goto L_0x0076
            r3.add(r4)
            goto L_0x0076
        L_0x008d:
            java.util.Iterator r2 = r3.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0208
            java.lang.Object r3 = r2.next()
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x00a2
            goto L_0x00bc
        L_0x00a2:
            r4 = r3
            Wg.j r4 = (Wg.j) r4
            long r8 = r4.f66948c
        L_0x00a7:
            java.lang.Object r4 = r2.next()
            r10 = r4
            Wg.j r10 = (Wg.j) r10
            long r10 = r10.f66948c
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x00b6
            r3 = r4
            r8 = r10
        L_0x00b6:
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x00a7
        L_0x00bc:
            Wg.j r3 = (Wg.j) r3
            long r10 = r16.b0()
            long r12 = r16.f0()
        L_0x00c6:
            int r2 = Wg.c.f66009b
            r4 = r6
        L_0x00c9:
            if (r4 >= r2) goto L_0x01dc
            long r8 = r3.f66948c
            int r14 = Wg.c.f66009b
            long r14 = (long) r14
            long r8 = r8 * r14
            long r14 = (long) r4
            long r8 = r8 + r14
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x00db
            int r15 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r15 >= 0) goto L_0x01e5
        L_0x00db:
            java.lang.Object r15 = r3.B(r4)
            java.lang.Object r6 = r3.A(r4)
            boolean r7 = r15 instanceof Ug.C5582n
            if (r7 == 0) goto L_0x00fd
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x00f1
            if (r14 < 0) goto L_0x00f1
            java.lang.String r7 = "receive"
            goto L_0x01a2
        L_0x00f1:
            if (r14 >= 0) goto L_0x00f9
            if (r7 < 0) goto L_0x00f9
            java.lang.String r7 = "send"
            goto L_0x01a2
        L_0x00f9:
            java.lang.String r7 = "cont"
            goto L_0x01a2
        L_0x00fd:
            boolean r7 = r15 instanceof ch.C5811j
            if (r7 == 0) goto L_0x0117
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x010b
            if (r14 < 0) goto L_0x010b
            java.lang.String r7 = "onReceive"
            goto L_0x01a2
        L_0x010b:
            if (r14 >= 0) goto L_0x0113
            if (r7 < 0) goto L_0x0113
            java.lang.String r7 = "onSend"
            goto L_0x01a2
        L_0x0113:
            java.lang.String r7 = "select"
            goto L_0x01a2
        L_0x0117:
            boolean r7 = r15 instanceof Wg.s
            if (r7 == 0) goto L_0x011f
            java.lang.String r7 = "receiveCatching"
            goto L_0x01a2
        L_0x011f:
            boolean r7 = r15 instanceof Wg.v
            if (r7 == 0) goto L_0x013b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "EB("
            r7.append(r8)
            r7.append(r15)
            r8 = 41
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto L_0x01a2
        L_0x013b:
            Zg.G r7 = Wg.c.f66013f
            boolean r7 = kotlin.jvm.internal.C6496s.c(r15, r7)
            if (r7 == 0) goto L_0x0147
            r7 = 1
            goto L_0x014f
        L_0x0147:
            Zg.G r7 = Wg.c.f66014g
            boolean r7 = kotlin.jvm.internal.C6496s.c(r15, r7)
        L_0x014f:
            if (r7 == 0) goto L_0x0154
            java.lang.String r7 = "resuming_sender"
            goto L_0x01a2
        L_0x0154:
            if (r15 != 0) goto L_0x0158
            r7 = 1
            goto L_0x0160
        L_0x0158:
            Zg.G r7 = Wg.c.f66012e
            boolean r7 = kotlin.jvm.internal.C6496s.c(r15, r7)
        L_0x0160:
            if (r7 == 0) goto L_0x0164
            r7 = 1
            goto L_0x016c
        L_0x0164:
            Zg.G r7 = Wg.c.f66016i
            boolean r7 = kotlin.jvm.internal.C6496s.c(r15, r7)
        L_0x016c:
            if (r7 == 0) goto L_0x0170
            r7 = 1
            goto L_0x0178
        L_0x0170:
            Zg.G r7 = Wg.c.f66015h
            boolean r7 = kotlin.jvm.internal.C6496s.c(r15, r7)
        L_0x0178:
            if (r7 == 0) goto L_0x017c
            r7 = 1
            goto L_0x0184
        L_0x017c:
            Zg.G r7 = Wg.c.f66018k
            boolean r7 = kotlin.jvm.internal.C6496s.c(r15, r7)
        L_0x0184:
            if (r7 == 0) goto L_0x0188
            r7 = 1
            goto L_0x0190
        L_0x0188:
            Zg.G r7 = Wg.c.f66017j
            boolean r7 = kotlin.jvm.internal.C6496s.c(r15, r7)
        L_0x0190:
            if (r7 == 0) goto L_0x0194
            r7 = 1
            goto L_0x019c
        L_0x0194:
            Zg.G r7 = Wg.c.z()
            boolean r7 = kotlin.jvm.internal.C6496s.c(r15, r7)
        L_0x019c:
            if (r7 != 0) goto L_0x01d6
            java.lang.String r7 = r15.toString()
        L_0x01a2:
            if (r6 == 0) goto L_0x01c4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = 40
            r8.append(r9)
            r8.append(r7)
            r8.append(r5)
            r8.append(r6)
            java.lang.String r6 = "),"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r1.append(r6)
            goto L_0x01d6
        L_0x01c4:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            r1.append(r6)
        L_0x01d6:
            int r4 = r4 + 1
            r6 = 0
            r7 = 1
            goto L_0x00c9
        L_0x01dc:
            Zg.e r2 = r3.f()
            r3 = r2
            Wg.j r3 = (Wg.j) r3
            if (r3 != 0) goto L_0x0204
        L_0x01e5:
            char r2 = Sg.p.k1(r1)
            if (r2 != r5) goto L_0x01fa
            int r2 = r1.length()
            r4 = 1
            int r2 = r2 - r4
            java.lang.StringBuilder r2 = r1.deleteCharAt(r2)
            java.lang.String r3 = "deleteCharAt(...)"
            kotlin.jvm.internal.C6496s.g(r2, r3)
        L_0x01fa:
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
        L_0x0204:
            r6 = 0
            r7 = 1
            goto L_0x00c6
        L_0x0208:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Wg.b.toString():java.lang.String");
    }

    /* access modifiers changed from: protected */
    public void E0() {
    }

    /* access modifiers changed from: protected */
    public void F0() {
    }

    /* access modifiers changed from: protected */
    public void y0() {
    }
}
