package m3;

import Ug.C5572i;
import Ug.K;
import Xg.C5694f;
import Xg.C5695g;
import Xg.D;
import Xg.L;
import Xg.N;
import Xg.w;
import Xg.x;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import m3.C2198C;
import m3.C2224x;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.C6787a;
import yf.C6798l;
import yf.p;

public abstract class H {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final g f23800a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public C2216o f23801b;

    /* renamed from: c  reason: collision with root package name */
    private X f23802c = new b();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public C2198C f23803d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C2222v f23804e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final CopyOnWriteArrayList f23805f;

    /* renamed from: g  reason: collision with root package name */
    private final V f23806g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f23807h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public volatile int f23808i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final x f23809j;

    /* renamed from: k  reason: collision with root package name */
    private final L f23810k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final w f23811l;

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ H f23812a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(H h10) {
            super(0);
            this.f23812a = h10;
        }

        public final void invoke() {
            this.f23812a.f23811l.b(C6514M.f71813a);
        }
    }

    private static final class b implements X {

        /* renamed from: a  reason: collision with root package name */
        private boolean f23813a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f23814b;

        public void a() {
            this.f23813a = true;
        }

        public void b() {
            this.f23814b = true;
        }

        public final boolean c() {
            return this.f23814b;
        }

        public final boolean d() {
            return this.f23813a;
        }
    }

    static final class c extends l implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        int f23815a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ H f23816b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2201F f23817c;

        static final class a implements C5695g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ H f23818a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C2201F f23819b;

            /* renamed from: m3.H$c$a$a  reason: collision with other inner class name */
            static final class C0380a extends l implements p {

                /* renamed from: a  reason: collision with root package name */
                int f23820a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C2224x f23821b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ H f23822c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ C2201F f23823d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0380a(C2224x xVar, H h10, C2201F f10, C6658d dVar) {
                    super(2, dVar);
                    this.f23821b = xVar;
                    this.f23822c = h10;
                    this.f23823d = f10;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    return new C0380a(this.f23821b, this.f23822c, this.f23823d, dVar);
                }

                public final Object invoke(K k10, C6658d dVar) {
                    return ((C0380a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                }

                /* JADX WARNING: Code restructure failed: missing block: B:101:0x02a5, code lost:
                    return lf.C6514M.f71813a;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ee, code lost:
                    r14 = r13.f23822c;
                    r1 = m3.H.h(r14).p(r13.f23821b);
                    r13.f23820a = 4;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:35:0x0101, code lost:
                    if (r14.r(r1, r13) != r0) goto L_0x0104;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:36:0x0103, code lost:
                    return r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:37:0x0104, code lost:
                    m3.H.a(r13.f23822c).f(((m3.C2224x.b) r13.f23821b).k(), ((m3.C2224x.b) r13.f23821b).g());
                    r14 = (m3.C2208g) m3.H.a(r13.f23822c).e().getValue();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:38:0x012d, code lost:
                    if (r14 == null) goto L_0x0134;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:39:0x012f, code lost:
                    r14 = r14.e();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:40:0x0134, code lost:
                    r14 = null;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:41:0x0135, code lost:
                    if (r14 == null) goto L_0x0203;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:42:0x0137, code lost:
                    r0 = r14.e().a();
                    r14 = r14.d().a();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:43:0x0151, code lost:
                    if (((m3.C2224x.b) r13.f23821b).f() != m3.C2220t.PREPEND) goto L_0x0155;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:44:0x0153, code lost:
                    if (r0 != false) goto L_0x0164;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:46:0x015f, code lost:
                    if (((m3.C2224x.b) r13.f23821b).f() != m3.C2220t.APPEND) goto L_0x0166;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:47:0x0161, code lost:
                    if (r14 != false) goto L_0x0164;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:48:0x0164, code lost:
                    r14 = false;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:49:0x0166, code lost:
                    r14 = true;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:50:0x0167, code lost:
                    r0 = ((m3.C2224x.b) r13.f23821b).h();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:51:0x0173, code lost:
                    if ((r0 instanceof java.util.Collection) == false) goto L_0x017f;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:53:0x017c, code lost:
                    if (((java.util.Collection) r0).isEmpty() == false) goto L_0x017f;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:54:0x017f, code lost:
                    r0 = r0.iterator();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:56:0x0187, code lost:
                    if (r0.hasNext() == false) goto L_0x019a;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:58:0x0197, code lost:
                    if (((m3.W) r0.next()).b().isEmpty() != false) goto L_0x0183;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:59:0x0199, code lost:
                    r2 = false;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:60:0x019a, code lost:
                    if (r14 != false) goto L_0x01a3;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:61:0x019c, code lost:
                    m3.H.k(r13.f23822c, false);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:63:0x01a9, code lost:
                    if (m3.H.e(r13.f23822c) != false) goto L_0x01ad;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:64:0x01ab, code lost:
                    if (r2 == false) goto L_0x027b;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:65:0x01ad, code lost:
                    if (r2 != false) goto L_0x01e6;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:67:0x01bf, code lost:
                    if (m3.H.d(r13.f23822c) < m3.H.h(r13.f23822c).b()) goto L_0x01e6;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:69:0x01dc, code lost:
                    if (m3.H.d(r13.f23822c) <= (m3.H.h(r13.f23822c).b() + m3.H.h(r13.f23822c).a())) goto L_0x01df;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:70:0x01df, code lost:
                    m3.H.k(r13.f23822c, false);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:71:0x01e6, code lost:
                    r14 = m3.H.b(r13.f23822c);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ec, code lost:
                    if (r14 == null) goto L_0x027b;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ee, code lost:
                    r14.a(m3.H.h(r13.f23822c).e(m3.H.d(r13.f23822c)));
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:75:0x020a, code lost:
                    throw new java.lang.IllegalStateException("PagingDataPresenter.combinedLoadStatesCollection.stateFlow should not hold null CombinedLoadStates after Insert event.");
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:83:0x022b, code lost:
                    r14 = r13.f23822c;
                    r1 = m3.H.h(r14).p(r13.f23821b);
                    r13.f23820a = 6;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:84:0x023e, code lost:
                    if (r14.r(r1, r13) != r0) goto L_0x0241;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:85:0x0240, code lost:
                    return r0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:86:0x0241, code lost:
                    m3.H.a(r13.f23822c).g(((m3.C2224x.a) r13.f23821b).c(), false, m3.r.c.f24097b.b());
                    m3.H.k(r13.f23822c, false);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:90:0x027b, code lost:
                    r14 = r13.f23821b;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:91:0x027f, code lost:
                    if ((r14 instanceof m3.C2224x.b) != false) goto L_0x0289;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:93:0x0283, code lost:
                    if ((r14 instanceof m3.C2224x.a) != false) goto L_0x0289;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:95:0x0287, code lost:
                    if ((r14 instanceof m3.C2224x.d) == false) goto L_0x02a3;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:96:0x0289, code lost:
                    r14 = m3.H.g(r13.f23822c).iterator();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:98:0x0297, code lost:
                    if (r14.hasNext() == false) goto L_0x02a3;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:99:0x0299, code lost:
                    ((yf.C6787a) r14.next()).invoke();
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                    /*
                        r13 = this;
                        java.lang.Object r0 = rf.C6680b.f()
                        int r1 = r13.f23820a
                        r2 = 1
                        r3 = 0
                        switch(r1) {
                            case 0: goto L_0x002c;
                            case 1: goto L_0x0027;
                            case 2: goto L_0x0027;
                            case 3: goto L_0x0022;
                            case 4: goto L_0x001d;
                            case 5: goto L_0x0018;
                            case 6: goto L_0x0013;
                            default: goto L_0x000b;
                        }
                    L_0x000b:
                        java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r14.<init>(r0)
                        throw r14
                    L_0x0013:
                        lf.w.b(r14)
                        goto L_0x0241
                    L_0x0018:
                        lf.w.b(r14)
                        goto L_0x022b
                    L_0x001d:
                        lf.w.b(r14)
                        goto L_0x0104
                    L_0x0022:
                        lf.w.b(r14)
                        goto L_0x00ee
                    L_0x0027:
                        lf.w.b(r14)
                        goto L_0x027b
                    L_0x002c:
                        lf.w.b(r14)
                        m3.x r14 = r13.f23821b
                        boolean r1 = r14 instanceof m3.C2224x.d
                        if (r1 == 0) goto L_0x0082
                        m3.H r4 = r13.f23822c
                        m3.W r14 = new m3.W
                        m3.x r1 = r13.f23821b
                        m3.x$d r1 = (m3.C2224x.d) r1
                        java.util.List r1 = r1.c()
                        r14.<init>(r3, r1)
                        java.util.List r5 = mf.C6565s.e(r14)
                        m3.x r14 = r13.f23821b
                        m3.x$d r14 = (m3.C2224x.d) r14
                        m3.s r14 = r14.e()
                        if (r14 != 0) goto L_0x005f
                        m3.x r14 = r13.f23821b
                        m3.x$d r14 = (m3.C2224x.d) r14
                        m3.s r14 = r14.d()
                        if (r14 == 0) goto L_0x005d
                        goto L_0x005f
                    L_0x005d:
                        r8 = r3
                        goto L_0x0060
                    L_0x005f:
                        r8 = r2
                    L_0x0060:
                        m3.x r14 = r13.f23821b
                        m3.x$d r14 = (m3.C2224x.d) r14
                        m3.s r9 = r14.e()
                        m3.x r14 = r13.f23821b
                        m3.x$d r14 = (m3.C2224x.d) r14
                        m3.s r10 = r14.d()
                        m3.F r14 = r13.f23823d
                        m3.o r11 = r14.e()
                        r13.f23820a = r2
                        r6 = 0
                        r7 = 0
                        r12 = r13
                        java.lang.Object r14 = r4.q(r5, r6, r7, r8, r9, r10, r11, r12)
                        if (r14 != r0) goto L_0x027b
                        return r0
                    L_0x0082:
                        boolean r1 = r14 instanceof m3.C2224x.b
                        if (r1 == 0) goto L_0x00cc
                        m3.x$b r14 = (m3.C2224x.b) r14
                        m3.t r14 = r14.f()
                        m3.t r1 = m3.C2220t.REFRESH
                        if (r14 != r1) goto L_0x00cc
                        m3.H r4 = r13.f23822c
                        m3.x r14 = r13.f23821b
                        m3.x$b r14 = (m3.C2224x.b) r14
                        java.util.List r5 = r14.h()
                        m3.x r14 = r13.f23821b
                        m3.x$b r14 = (m3.C2224x.b) r14
                        int r6 = r14.j()
                        m3.x r14 = r13.f23821b
                        m3.x$b r14 = (m3.C2224x.b) r14
                        int r7 = r14.i()
                        m3.x r14 = r13.f23821b
                        m3.x$b r14 = (m3.C2224x.b) r14
                        m3.s r9 = r14.k()
                        m3.x r14 = r13.f23821b
                        m3.x$b r14 = (m3.C2224x.b) r14
                        m3.s r10 = r14.g()
                        m3.F r14 = r13.f23823d
                        m3.o r11 = r14.e()
                        r14 = 2
                        r13.f23820a = r14
                        r8 = 1
                        r12 = r13
                        java.lang.Object r14 = r4.q(r5, r6, r7, r8, r9, r10, r11, r12)
                        if (r14 != r0) goto L_0x027b
                        return r0
                    L_0x00cc:
                        m3.x r14 = r13.f23821b
                        boolean r1 = r14 instanceof m3.C2224x.b
                        if (r1 == 0) goto L_0x020b
                        m3.H r14 = r13.f23822c
                        Xg.x r14 = r14.f23809j
                        java.lang.Object r14 = r14.getValue()
                        java.lang.Boolean r14 = (java.lang.Boolean) r14
                        boolean r14 = r14.booleanValue()
                        if (r14 == 0) goto L_0x00ee
                        r14 = 3
                        r13.f23820a = r14
                        java.lang.Object r14 = Ug.k1.a(r13)
                        if (r14 != r0) goto L_0x00ee
                        return r0
                    L_0x00ee:
                        m3.H r14 = r13.f23822c
                        m3.C r1 = r14.f23803d
                        m3.x r4 = r13.f23821b
                        m3.G r1 = r1.p(r4)
                        r4 = 4
                        r13.f23820a = r4
                        java.lang.Object r14 = r14.r(r1, r13)
                        if (r14 != r0) goto L_0x0104
                        return r0
                    L_0x0104:
                        m3.H r14 = r13.f23822c
                        m3.v r14 = r14.f23804e
                        m3.x r0 = r13.f23821b
                        m3.x$b r0 = (m3.C2224x.b) r0
                        m3.s r0 = r0.k()
                        m3.x r1 = r13.f23821b
                        m3.x$b r1 = (m3.C2224x.b) r1
                        m3.s r1 = r1.g()
                        r14.f(r0, r1)
                        m3.H r14 = r13.f23822c
                        m3.v r14 = r14.f23804e
                        Xg.L r14 = r14.e()
                        java.lang.Object r14 = r14.getValue()
                        m3.g r14 = (m3.C2208g) r14
                        if (r14 == 0) goto L_0x0134
                        m3.s r14 = r14.e()
                        goto L_0x0135
                    L_0x0134:
                        r14 = 0
                    L_0x0135:
                        if (r14 == 0) goto L_0x0203
                        m3.r r0 = r14.e()
                        boolean r0 = r0.a()
                        m3.r r14 = r14.d()
                        boolean r14 = r14.a()
                        m3.x r1 = r13.f23821b
                        m3.x$b r1 = (m3.C2224x.b) r1
                        m3.t r1 = r1.f()
                        m3.t r4 = m3.C2220t.PREPEND
                        if (r1 != r4) goto L_0x0155
                        if (r0 != 0) goto L_0x0164
                    L_0x0155:
                        m3.x r0 = r13.f23821b
                        m3.x$b r0 = (m3.C2224x.b) r0
                        m3.t r0 = r0.f()
                        m3.t r1 = m3.C2220t.APPEND
                        if (r0 != r1) goto L_0x0166
                        if (r14 != 0) goto L_0x0164
                        goto L_0x0166
                    L_0x0164:
                        r14 = r3
                        goto L_0x0167
                    L_0x0166:
                        r14 = r2
                    L_0x0167:
                        m3.x r0 = r13.f23821b
                        m3.x$b r0 = (m3.C2224x.b) r0
                        java.util.List r0 = r0.h()
                        java.lang.Iterable r0 = (java.lang.Iterable) r0
                        boolean r1 = r0 instanceof java.util.Collection
                        if (r1 == 0) goto L_0x017f
                        r1 = r0
                        java.util.Collection r1 = (java.util.Collection) r1
                        boolean r1 = r1.isEmpty()
                        if (r1 == 0) goto L_0x017f
                        goto L_0x019a
                    L_0x017f:
                        java.util.Iterator r0 = r0.iterator()
                    L_0x0183:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L_0x019a
                        java.lang.Object r1 = r0.next()
                        m3.W r1 = (m3.W) r1
                        java.util.List r1 = r1.b()
                        boolean r1 = r1.isEmpty()
                        if (r1 != 0) goto L_0x0183
                        r2 = r3
                    L_0x019a:
                        if (r14 != 0) goto L_0x01a3
                        m3.H r14 = r13.f23822c
                        r14.f23807h = r3
                        goto L_0x027b
                    L_0x01a3:
                        m3.H r14 = r13.f23822c
                        boolean r14 = r14.f23807h
                        if (r14 != 0) goto L_0x01ad
                        if (r2 == 0) goto L_0x027b
                    L_0x01ad:
                        if (r2 != 0) goto L_0x01e6
                        m3.H r14 = r13.f23822c
                        int r14 = r14.f23808i
                        m3.H r0 = r13.f23822c
                        m3.C r0 = r0.f23803d
                        int r0 = r0.b()
                        if (r14 < r0) goto L_0x01e6
                        m3.H r14 = r13.f23822c
                        int r14 = r14.f23808i
                        m3.H r0 = r13.f23822c
                        m3.C r0 = r0.f23803d
                        int r0 = r0.b()
                        m3.H r1 = r13.f23822c
                        m3.C r1 = r1.f23803d
                        int r1 = r1.a()
                        int r0 = r0 + r1
                        if (r14 <= r0) goto L_0x01df
                        goto L_0x01e6
                    L_0x01df:
                        m3.H r14 = r13.f23822c
                        r14.f23807h = r3
                        goto L_0x027b
                    L_0x01e6:
                        m3.H r14 = r13.f23822c
                        m3.o r14 = r14.f23801b
                        if (r14 == 0) goto L_0x027b
                        m3.H r0 = r13.f23822c
                        m3.C r0 = r0.f23803d
                        m3.H r1 = r13.f23822c
                        int r1 = r1.f23808i
                        m3.Z$a r0 = r0.e(r1)
                        r14.a(r0)
                        goto L_0x027b
                    L_0x0203:
                        java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                        java.lang.String r0 = "PagingDataPresenter.combinedLoadStatesCollection.stateFlow should not hold null CombinedLoadStates after Insert event."
                        r14.<init>(r0)
                        throw r14
                    L_0x020b:
                        boolean r1 = r14 instanceof m3.C2224x.a
                        if (r1 == 0) goto L_0x025e
                        m3.H r14 = r13.f23822c
                        Xg.x r14 = r14.f23809j
                        java.lang.Object r14 = r14.getValue()
                        java.lang.Boolean r14 = (java.lang.Boolean) r14
                        boolean r14 = r14.booleanValue()
                        if (r14 == 0) goto L_0x022b
                        r14 = 5
                        r13.f23820a = r14
                        java.lang.Object r14 = Ug.k1.a(r13)
                        if (r14 != r0) goto L_0x022b
                        return r0
                    L_0x022b:
                        m3.H r14 = r13.f23822c
                        m3.C r1 = r14.f23803d
                        m3.x r2 = r13.f23821b
                        m3.G r1 = r1.p(r2)
                        r2 = 6
                        r13.f23820a = r2
                        java.lang.Object r14 = r14.r(r1, r13)
                        if (r14 != r0) goto L_0x0241
                        return r0
                    L_0x0241:
                        m3.H r14 = r13.f23822c
                        m3.v r14 = r14.f23804e
                        m3.x r0 = r13.f23821b
                        m3.x$a r0 = (m3.C2224x.a) r0
                        m3.t r0 = r0.c()
                        m3.r$c$a r1 = m3.r.c.f24097b
                        m3.r$c r1 = r1.b()
                        r14.g(r0, r3, r1)
                        m3.H r14 = r13.f23822c
                        r14.f23807h = r3
                        goto L_0x027b
                    L_0x025e:
                        boolean r14 = r14 instanceof m3.C2224x.c
                        if (r14 == 0) goto L_0x027b
                        m3.H r14 = r13.f23822c
                        m3.v r14 = r14.f23804e
                        m3.x r0 = r13.f23821b
                        m3.x$c r0 = (m3.C2224x.c) r0
                        m3.s r0 = r0.d()
                        m3.x r1 = r13.f23821b
                        m3.x$c r1 = (m3.C2224x.c) r1
                        m3.s r1 = r1.c()
                        r14.f(r0, r1)
                    L_0x027b:
                        m3.x r14 = r13.f23821b
                        boolean r0 = r14 instanceof m3.C2224x.b
                        if (r0 != 0) goto L_0x0289
                        boolean r0 = r14 instanceof m3.C2224x.a
                        if (r0 != 0) goto L_0x0289
                        boolean r14 = r14 instanceof m3.C2224x.d
                        if (r14 == 0) goto L_0x02a3
                    L_0x0289:
                        m3.H r14 = r13.f23822c
                        java.util.concurrent.CopyOnWriteArrayList r14 = r14.f23805f
                        java.util.Iterator r14 = r14.iterator()
                    L_0x0293:
                        boolean r0 = r14.hasNext()
                        if (r0 == 0) goto L_0x02a3
                        java.lang.Object r0 = r14.next()
                        yf.a r0 = (yf.C6787a) r0
                        r0.invoke()
                        goto L_0x0293
                    L_0x02a3:
                        lf.M r14 = lf.C6514M.f71813a
                        return r14
                    */
                    throw new UnsupportedOperationException("Method not decompiled: m3.H.c.a.C0380a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            a(H h10, C2201F f10) {
                this.f23818a = h10;
                this.f23819b = f10;
            }

            /* renamed from: a */
            public final Object emit(C2224x xVar, C6658d dVar) {
                K k10 = K.f23844a;
                if (k10.a(2)) {
                    k10.b(2, "Collected " + xVar, (Throwable) null);
                }
                Object g10 = C5572i.g(this.f23818a.f23800a, new C0380a(xVar, this.f23818a, this.f23819b, (C6658d) null), dVar);
                if (g10 == C6680b.f()) {
                    return g10;
                }
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(H h10, C2201F f10, C6658d dVar) {
            super(1, dVar);
            this.f23816b = h10;
            this.f23817c = f10;
        }

        public final C6658d create(C6658d dVar) {
            return new c(this.f23816b, this.f23817c, dVar);
        }

        /* renamed from: i */
        public final Object invoke(C6658d dVar) {
            return ((c) create(dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f23815a;
            if (i10 == 0) {
                lf.w.b(obj);
                this.f23816b.u(this.f23817c.f());
                C5694f d10 = this.f23817c.d();
                a aVar = new a(this.f23816b, this.f23817c);
                this.f23815a = 1;
                if (d10.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                lf.w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f23824a;

        /* renamed from: b  reason: collision with root package name */
        Object f23825b;

        /* renamed from: c  reason: collision with root package name */
        Object f23826c;

        /* renamed from: d  reason: collision with root package name */
        Object f23827d;

        /* renamed from: e  reason: collision with root package name */
        Object f23828e;

        /* renamed from: f  reason: collision with root package name */
        Object f23829f;

        /* renamed from: g  reason: collision with root package name */
        int f23830g;

        /* renamed from: h  reason: collision with root package name */
        int f23831h;

        /* renamed from: i  reason: collision with root package name */
        boolean f23832i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f23833j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ H f23834k;

        /* renamed from: l  reason: collision with root package name */
        int f23835l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(H h10, C6658d dVar) {
            super(dVar);
            this.f23834k = h10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f23833j = obj;
            this.f23835l |= Integer.MIN_VALUE;
            return this.f23834k.q((List) null, 0, 0, false, (C2219s) null, (C2219s) null, (C2216o) null, this);
        }
    }

    public H(g gVar, C2201F f10) {
        C2224x.b bVar;
        C2224x.b c10;
        C6496s.h(gVar, "mainContext");
        this.f23800a = gVar;
        C2198C.a aVar = C2198C.f23758e;
        if (f10 != null) {
            bVar = f10.c();
        } else {
            bVar = null;
        }
        this.f23803d = aVar.a(bVar);
        C2222v vVar = new C2222v();
        if (!(f10 == null || (c10 = f10.c()) == null)) {
            vVar.f(c10.k(), c10.g());
        }
        this.f23804e = vVar;
        this.f23805f = new CopyOnWriteArrayList();
        this.f23806g = new V(false, 1, (DefaultConstructorMarker) null);
        this.f23809j = N.a(Boolean.FALSE);
        this.f23810k = vVar.e();
        this.f23811l = D.a(0, 64, Wg.a.DROP_OLDEST);
        m(new a(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: m3.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: m3.s} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object q(java.util.List r8, int r9, int r10, boolean r11, m3.C2219s r12, m3.C2219s r13, m3.C2216o r14, qf.C6658d r15) {
        /*
            r7 = this;
            boolean r0 = r15 instanceof m3.H.d
            if (r0 == 0) goto L_0x0013
            r0 = r15
            m3.H$d r0 = (m3.H.d) r0
            int r1 = r0.f23835l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f23835l = r1
            goto L_0x0018
        L_0x0013:
            m3.H$d r0 = new m3.H$d
            r0.<init>(r7, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f23833j
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f23835l
            r3 = 1
            if (r2 == 0) goto L_0x0053
            if (r2 != r3) goto L_0x004b
            boolean r11 = r0.f23832i
            int r10 = r0.f23831h
            int r9 = r0.f23830g
            java.lang.Object r8 = r0.f23829f
            m3.C r8 = (m3.C2198C) r8
            java.lang.Object r12 = r0.f23828e
            r14 = r12
            m3.o r14 = (m3.C2216o) r14
            java.lang.Object r12 = r0.f23827d
            r13 = r12
            m3.s r13 = (m3.C2219s) r13
            java.lang.Object r12 = r0.f23826c
            m3.s r12 = (m3.C2219s) r12
            java.lang.Object r1 = r0.f23825b
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.f23824a
            m3.H r0 = (m3.H) r0
            lf.w.b(r15)
            r15 = r8
            r8 = r1
            goto L_0x0097
        L_0x004b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0053:
            lf.w.b(r15)
            if (r11 == 0) goto L_0x0063
            if (r12 == 0) goto L_0x005b
            goto L_0x0063
        L_0x005b:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Cannot dispatch LoadStates in PagingDataPresenter without source LoadStates set."
            r8.<init>(r9)
            throw r8
        L_0x0063:
            r15 = 0
            r7.f23807h = r15
            m3.C r15 = new m3.C
            r15.<init>(r8, r9, r10)
            m3.C r2 = r7.f23803d
            java.lang.String r4 = "null cannot be cast to non-null type androidx.paging.PlaceholderPaddedList<T of androidx.paging.PagingDataPresenter>"
            kotlin.jvm.internal.C6496s.f(r2, r4)
            r7.f23803d = r15
            r7.f23801b = r14
            m3.G$e r4 = new m3.G$e
            r4.<init>(r15, r2)
            r0.f23824a = r7
            r0.f23825b = r8
            r0.f23826c = r12
            r0.f23827d = r13
            r0.f23828e = r14
            r0.f23829f = r15
            r0.f23830g = r9
            r0.f23831h = r10
            r0.f23832i = r11
            r0.f23835l = r3
            java.lang.Object r0 = r7.r(r4, r0)
            if (r0 != r1) goto L_0x0096
            return r1
        L_0x0096:
            r0 = r7
        L_0x0097:
            m3.K r1 = m3.K.f23844a
            r2 = 3
            boolean r4 = r1.a(r2)
            if (r4 == 0) goto L_0x013a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Presenting data (\n                            |   first item: "
            r4.append(r5)
            java.lang.Object r5 = mf.C6565s.q0(r8)
            m3.W r5 = (m3.W) r5
            r6 = 0
            if (r5 == 0) goto L_0x00be
            java.util.List r5 = r5.b()
            if (r5 == 0) goto L_0x00be
            java.lang.Object r5 = mf.C6565s.q0(r5)
            goto L_0x00bf
        L_0x00be:
            r5 = r6
        L_0x00bf:
            r4.append(r5)
            java.lang.String r5 = "\n                            |   last item: "
            r4.append(r5)
            java.lang.Object r8 = mf.C6565s.B0(r8)
            m3.W r8 = (m3.W) r8
            if (r8 == 0) goto L_0x00da
            java.util.List r8 = r8.b()
            if (r8 == 0) goto L_0x00da
            java.lang.Object r8 = mf.C6565s.B0(r8)
            goto L_0x00db
        L_0x00da:
            r8 = r6
        L_0x00db:
            r4.append(r8)
            java.lang.String r8 = "\n                            |   placeholdersBefore: "
            r4.append(r8)
            r4.append(r9)
            java.lang.String r8 = "\n                            |   placeholdersAfter: "
            r4.append(r8)
            r4.append(r10)
            java.lang.String r8 = "\n                            |   hintReceiver: "
            r4.append(r8)
            r4.append(r14)
            java.lang.String r8 = "\n                            |   sourceLoadStates: "
            r4.append(r8)
            r4.append(r12)
            java.lang.String r8 = "\n                        "
            r4.append(r8)
            java.lang.String r8 = r4.toString()
            if (r13 == 0) goto L_0x0122
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = "|   mediatorLoadStates: "
            r9.append(r8)
            r9.append(r13)
            r8 = 10
            r9.append(r8)
            java.lang.String r8 = r9.toString()
        L_0x0122:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = "|)"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.String r8 = Sg.p.h(r8, r6, r3, r6)
            r1.b(r2, r8, r6)
        L_0x013a:
            if (r11 == 0) goto L_0x0144
            m3.v r8 = r0.f23804e
            kotlin.jvm.internal.C6496s.e(r12)
            r8.f(r12, r13)
        L_0x0144:
            int r8 = r15.getSize()
            if (r8 != 0) goto L_0x0155
            m3.o r8 = r0.f23801b
            if (r8 == 0) goto L_0x0155
            m3.Z$b r9 = r15.n()
            r8.a(r9)
        L_0x0155:
            lf.M r8 = lf.C6514M.f71813a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.H.q(java.util.List, int, int, boolean, m3.s, m3.s, m3.o, qf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void u(X x10) {
        X x11 = this.f23802c;
        this.f23802c = x10;
        if (x11 instanceof b) {
            b bVar = (b) x11;
            if (bVar.d()) {
                x10.a();
            }
            if (bVar.c()) {
                x10.b();
            }
        }
    }

    public final void m(C6787a aVar) {
        C6496s.h(aVar, "listener");
        this.f23805f.add(aVar);
    }

    public final Object n(C2201F f10, C6658d dVar) {
        Object c10 = V.c(this.f23806g, 0, new c(this, f10, (C6658d) null), dVar, 1, (Object) null);
        if (c10 == C6680b.f()) {
            return c10;
        }
        return C6514M.f71813a;
    }

    public final Object o(int i10) {
        Object value;
        Object value2;
        x xVar = this.f23809j;
        do {
            value = xVar.getValue();
            ((Boolean) value).booleanValue();
        } while (!xVar.e(value, Boolean.TRUE));
        this.f23807h = true;
        this.f23808i = i10;
        K k10 = K.f23844a;
        if (k10.a(2)) {
            k10.b(2, "Accessing item index[" + i10 + ']', (Throwable) null);
        }
        C2216o oVar = this.f23801b;
        if (oVar != null) {
            oVar.a(this.f23803d.e(i10));
        }
        Object j10 = this.f23803d.j(i10);
        x xVar2 = this.f23809j;
        do {
            value2 = xVar2.getValue();
            ((Boolean) value2).booleanValue();
        } while (!xVar2.e(value2, Boolean.FALSE));
        return j10;
    }

    public final L p() {
        return this.f23810k;
    }

    public abstract Object r(G g10, C6658d dVar);

    public final void s() {
        K k10 = K.f23844a;
        if (k10.a(3)) {
            k10.b(3, "Refresh signal received", (Throwable) null);
        }
        this.f23802c.b();
    }

    public final void t() {
        K k10 = K.f23844a;
        if (k10.a(3)) {
            k10.b(3, "Retry signal received", (Throwable) null);
        }
        this.f23802c.a();
    }

    public final C2218q v() {
        return this.f23803d.q();
    }
}
