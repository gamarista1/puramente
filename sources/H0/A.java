package H0;

import H0.e0;
import H0.g0;
import J0.C0;
import J0.C1231a0;
import J0.G;
import J0.K;
import J0.L;
import J0.Q;
import Y.C1496k;
import Y.C1500m;
import Y.C1506p;
import Y.C1510r0;
import Y.V0;
import Y.o1;
import Y.r;
import a0.C1538b;
import androidx.compose.ui.platform.M1;
import c1.t;
import i0.C2057k;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import yf.C6798l;
import yf.p;

public final class A implements C1496k {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final G f2481a;

    /* renamed from: b  reason: collision with root package name */
    private r f2482b;

    /* renamed from: c  reason: collision with root package name */
    private g0 f2483c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f2484d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f2485e;

    /* renamed from: f  reason: collision with root package name */
    private final HashMap f2486f = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f2487g = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final c f2488h = new c();
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final b f2489i = new b();
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final HashMap f2490j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    private final g0.a f2491k = new g0.a((Set) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: l  reason: collision with root package name */
    private final Map f2492l = new LinkedHashMap();
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final C1538b f2493m = new C1538b(new Object[16], 0);
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public int f2494n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public int f2495o;

    /* renamed from: p  reason: collision with root package name */
    private final String f2496p = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    private final class b implements f0, H {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ c f2503a;

        public b() {
            this.f2503a = A.this.f2488h;
        }

        public long B1(long j10) {
            return this.f2503a.B1(j10);
        }

        public float E(int i10) {
            return this.f2503a.E(i10);
        }

        public int E0(float f10) {
            return this.f2503a.E0(f10);
        }

        public float N0(long j10) {
            return this.f2503a.N0(j10);
        }

        public long P(float f10) {
            return this.f2503a.P(f10);
        }

        public long Q(long j10) {
            return this.f2503a.Q(j10);
        }

        public float V(long j10) {
            return this.f2503a.V(j10);
        }

        public G d1(int i10, int i11, Map map, C6798l lVar) {
            return this.f2503a.d1(i10, i11, map, lVar);
        }

        public long f0(int i10) {
            return this.f2503a.f0(i10);
        }

        public long g0(float f10) {
            return this.f2503a.g0(f10);
        }

        public float getDensity() {
            return this.f2503a.getDensity();
        }

        public t getLayoutDirection() {
            return this.f2503a.getLayoutDirection();
        }

        public G i0(int i10, int i11, Map map, C6798l lVar, C6798l lVar2) {
            return this.f2503a.i0(i10, i11, map, lVar, lVar2);
        }

        public float m1(float f10) {
            return this.f2503a.m1(f10);
        }

        public boolean r0() {
            return this.f2503a.r0();
        }

        public float r1() {
            return this.f2503a.r1();
        }

        public float t1(float f10) {
            return this.f2503a.t1(f10);
        }

        public List x1(Object obj, p pVar) {
            List list;
            G g10 = (G) A.this.f2487g.get(obj);
            if (g10 != null) {
                list = g10.G();
            } else {
                list = null;
            }
            if (list != null) {
                return list;
            }
            return A.this.F(obj, pVar);
        }
    }

    private final class c implements f0 {

        /* renamed from: a  reason: collision with root package name */
        private t f2505a = t.Rtl;

        /* renamed from: b  reason: collision with root package name */
        private float f2506b;

        /* renamed from: c  reason: collision with root package name */
        private float f2507c;

        public static final class a implements G {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f2509a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f2510b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Map f2511c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C6798l f2512d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ c f2513e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ A f2514f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C6798l f2515g;

            a(int i10, int i11, Map map, C6798l lVar, c cVar, A a10, C6798l lVar2) {
                this.f2509a = i10;
                this.f2510b = i11;
                this.f2511c = map;
                this.f2512d = lVar;
                this.f2513e = cVar;
                this.f2514f = a10;
                this.f2515g = lVar2;
            }

            public int d() {
                return this.f2510b;
            }

            public int e() {
                return this.f2509a;
            }

            public Map p() {
                return this.f2511c;
            }

            public void q() {
                Q z22;
                if (!this.f2513e.r0() || (z22 = this.f2514f.f2481a.P().z2()) == null) {
                    this.f2515g.invoke(this.f2514f.f2481a.P().I1());
                } else {
                    this.f2515g.invoke(z22.I1());
                }
            }

            public C6798l r() {
                return this.f2512d;
            }
        }

        public c() {
        }

        public void a(float f10) {
            this.f2506b = f10;
        }

        public void e(float f10) {
            this.f2507c = f10;
        }

        public float getDensity() {
            return this.f2506b;
        }

        public t getLayoutDirection() {
            return this.f2505a;
        }

        public G i0(int i10, int i11, Map map, C6798l lVar, C6798l lVar2) {
            boolean z10;
            if ((i10 & -16777216) == 0 && (-16777216 & i11) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                G0.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
            }
            return new a(i10, i11, map, lVar, this, A.this, lVar2);
        }

        public void o(t tVar) {
            this.f2505a = tVar;
        }

        public boolean r0() {
            if (A.this.f2481a.W() == G.e.LookaheadLayingOut || A.this.f2481a.W() == G.e.LookaheadMeasuring) {
                return true;
            }
            return false;
        }

        public float r1() {
            return this.f2507c;
        }

        public List x1(Object obj, p pVar) {
            return A.this.K(obj, pVar);
        }
    }

    public static final class d extends G.f {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ A f2516b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f2517c;

        public static final class a implements G {

            /* renamed from: a  reason: collision with root package name */
            private final /* synthetic */ G f2518a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ A f2519b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f2520c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ G f2521d;

            public a(G g10, A a10, int i10, G g11) {
                this.f2519b = a10;
                this.f2520c = i10;
                this.f2521d = g11;
                this.f2518a = g10;
            }

            public int d() {
                return this.f2518a.d();
            }

            public int e() {
                return this.f2518a.e();
            }

            public Map p() {
                return this.f2518a.p();
            }

            public void q() {
                this.f2519b.f2485e = this.f2520c;
                this.f2521d.q();
                this.f2519b.y();
            }

            public C6798l r() {
                return this.f2518a.r();
            }
        }

        public static final class b implements G {

            /* renamed from: a  reason: collision with root package name */
            private final /* synthetic */ G f2522a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ A f2523b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f2524c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ G f2525d;

            public b(G g10, A a10, int i10, G g11) {
                this.f2523b = a10;
                this.f2524c = i10;
                this.f2525d = g11;
                this.f2522a = g10;
            }

            public int d() {
                return this.f2522a.d();
            }

            public int e() {
                return this.f2522a.e();
            }

            public Map p() {
                return this.f2522a.p();
            }

            public void q() {
                this.f2523b.f2484d = this.f2524c;
                this.f2525d.q();
                A a10 = this.f2523b;
                a10.x(a10.f2484d);
            }

            public C6798l r() {
                return this.f2522a.r();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(A a10, p pVar, String str) {
            super(str);
            this.f2516b = a10;
            this.f2517c = pVar;
        }

        public G j(H h10, List list, long j10) {
            this.f2516b.f2488h.o(h10.getLayoutDirection());
            this.f2516b.f2488h.a(h10.getDensity());
            this.f2516b.f2488h.e(h10.r1());
            if (h10.r0() || this.f2516b.f2481a.a0() == null) {
                this.f2516b.f2484d = 0;
                G g10 = (G) this.f2517c.invoke(this.f2516b.f2488h, c1.b.a(j10));
                return new b(g10, this.f2516b, this.f2516b.f2484d, g10);
            }
            this.f2516b.f2485e = 0;
            G g11 = (G) this.f2517c.invoke(this.f2516b.f2489i, c1.b.a(j10));
            return new a(g11, this.f2516b, this.f2516b.f2485e, g11);
        }
    }

    static final class e extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A f2526a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(A a10) {
            super(1);
            this.f2526a = a10;
        }

        /* renamed from: a */
        public final Boolean invoke(Map.Entry entry) {
            boolean z10;
            Object key = entry.getKey();
            e0.a aVar = (e0.a) entry.getValue();
            int r10 = this.f2526a.f2493m.r(key);
            if (r10 < 0 || r10 >= this.f2526a.f2485e) {
                aVar.dispose();
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    public static final class g implements e0.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A f2527a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f2528b;

        g(A a10, Object obj) {
            this.f2527a = a10;
            this.f2528b = obj;
        }

        public void a(Object obj, C6798l lVar) {
            C1231a0 j02;
            i.c k10;
            G g10 = (G) this.f2527a.f2490j.get(this.f2528b);
            if (g10 != null && (j02 = g10.j0()) != null && (k10 = j02.k()) != null) {
                C0.e(k10, obj, lVar);
            }
        }

        public void b(int i10, long j10) {
            G g10 = (G) this.f2527a.f2490j.get(this.f2528b);
            if (g10 != null && g10.J0()) {
                int size = g10.H().size();
                if (i10 < 0 || i10 >= size) {
                    throw new IndexOutOfBoundsException("Index (" + i10 + ") is out of bound of [0, " + size + ')');
                } else if (!g10.e()) {
                    G k10 = this.f2527a.f2481a;
                    k10.f3574n = true;
                    K.b(g10).m((G) g10.H().get(i10), j10);
                    k10.f3574n = false;
                } else {
                    throw new IllegalArgumentException("Pre-measure called on node that is not placed");
                }
            }
        }

        public int d() {
            List H10;
            G g10 = (G) this.f2527a.f2490j.get(this.f2528b);
            if (g10 == null || (H10 = g10.H()) == null) {
                return 0;
            }
            return H10.size();
        }

        public void dispose() {
            this.f2527a.B();
            G g10 = (G) this.f2527a.f2490j.remove(this.f2528b);
            if (g10 == null) {
                return;
            }
            if (this.f2527a.f2495o > 0) {
                int indexOf = this.f2527a.f2481a.M().indexOf(g10);
                if (indexOf >= this.f2527a.f2481a.M().size() - this.f2527a.f2495o) {
                    A a10 = this.f2527a;
                    a10.f2494n = a10.f2494n + 1;
                    A a11 = this.f2527a;
                    a11.f2495o = a11.f2495o - 1;
                    int size = (this.f2527a.f2481a.M().size() - this.f2527a.f2495o) - this.f2527a.f2494n;
                    this.f2527a.D(indexOf, size, 1);
                    this.f2527a.x(size);
                    return;
                }
                throw new IllegalStateException("Item is not in pre-composed item range");
            }
            throw new IllegalStateException("No pre-composed items to dispose");
        }
    }

    static final class h extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f2529a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f2530b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar, p pVar) {
            super(2);
            this.f2529a = aVar;
            this.f2530b = pVar;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(-1750409193, i10, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:493)");
                }
                boolean a10 = this.f2529a.a();
                p pVar = this.f2530b;
                mVar.H(207, Boolean.valueOf(a10));
                boolean b10 = mVar.b(a10);
                mVar.T(-869707859);
                if (a10) {
                    pVar.invoke(mVar, 0);
                } else {
                    mVar.g(b10);
                }
                mVar.M();
                mVar.y();
                if (C1506p.H()) {
                    C1506p.P();
                    return;
                }
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public A(G g10, g0 g0Var) {
        this.f2481a = g10;
        this.f2483c = g0Var;
    }

    private final Object A(int i10) {
        Object obj = this.f2486f.get((G) this.f2481a.M().get(i10));
        C6496s.e(obj);
        return ((a) obj).f();
    }

    private final void C(boolean z10) {
        C6798l lVar;
        this.f2495o = 0;
        this.f2490j.clear();
        int size = this.f2481a.M().size();
        if (this.f2494n != size) {
            this.f2494n = size;
            C2057k.a aVar = C2057k.f21728e;
            C2057k d10 = aVar.d();
            if (d10 != null) {
                lVar = d10.h();
            } else {
                lVar = null;
            }
            C2057k f10 = aVar.f(d10);
            int i10 = 0;
            while (i10 < size) {
                try {
                    G g10 = (G) this.f2481a.M().get(i10);
                    a aVar2 = (a) this.f2486f.get(g10);
                    if (aVar2 != null && aVar2.a()) {
                        H(g10);
                        if (z10) {
                            V0 b10 = aVar2.b();
                            if (b10 != null) {
                                b10.deactivate();
                            }
                            aVar2.h(u1.d(Boolean.FALSE, (o1) null, 2, (Object) null));
                        } else {
                            aVar2.g(false);
                        }
                        aVar2.m(d0.f2576a);
                    }
                    i10++;
                } catch (Throwable th2) {
                    aVar.m(d10, f10, lVar);
                    throw th2;
                }
            }
            C6514M m10 = C6514M.f71813a;
            aVar.m(d10, f10, lVar);
            this.f2487g.clear();
        }
        B();
    }

    /* access modifiers changed from: private */
    public final void D(int i10, int i11, int i12) {
        G g10 = this.f2481a;
        g10.f3574n = true;
        this.f2481a.e1(i10, i11, i12);
        g10.f3574n = false;
    }

    static /* synthetic */ void E(A a10, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = 1;
        }
        a10.D(i10, i11, i12);
    }

    /* access modifiers changed from: private */
    public final List F(Object obj, p pVar) {
        if (this.f2493m.q() >= this.f2485e) {
            int q10 = this.f2493m.q();
            int i10 = this.f2485e;
            if (q10 == i10) {
                this.f2493m.b(obj);
            } else {
                this.f2493m.B(i10, obj);
            }
            this.f2485e++;
            if (!this.f2490j.containsKey(obj)) {
                this.f2492l.put(obj, G(obj, pVar));
                if (this.f2481a.W() == G.e.LayingOut) {
                    this.f2481a.p1(true);
                } else {
                    G.s1(this.f2481a, true, false, false, 6, (Object) null);
                }
            }
            G g10 = (G) this.f2490j.get(obj);
            if (g10 == null) {
                return C6565s.n();
            }
            List E12 = g10.c0().E1();
            int size = E12.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((L.b) E12.get(i11)).P1();
            }
            return E12;
        }
        throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.");
    }

    private final void H(G g10) {
        L.b c02 = g10.c0();
        G.g gVar = G.g.NotUsed;
        c02.c2(gVar);
        L.a Z10 = g10.Z();
        if (Z10 != null) {
            Z10.V1(gVar);
        }
    }

    private final void L(G g10, a aVar) {
        C6798l lVar;
        C2057k.a aVar2 = C2057k.f21728e;
        C2057k d10 = aVar2.d();
        if (d10 != null) {
            lVar = d10.h();
        } else {
            lVar = null;
        }
        C2057k f10 = aVar2.f(d10);
        try {
            G g11 = this.f2481a;
            g11.f3574n = true;
            p c10 = aVar.c();
            V0 b10 = aVar.b();
            r rVar = this.f2482b;
            if (rVar != null) {
                aVar.i(N(b10, g10, aVar.e(), rVar, g0.c.c(-1750409193, true, new h(aVar, c10))));
                aVar.l(false);
                g11.f3574n = false;
                C6514M m10 = C6514M.f71813a;
                return;
            }
            throw new IllegalStateException("parent composition reference not set");
        } finally {
            aVar2.m(d10, f10, lVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: H0.A$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: H0.A$a} */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void M(J0.G r9, java.lang.Object r10, yf.p r11) {
        /*
            r8 = this;
            java.util.HashMap r0 = r8.f2486f
            java.lang.Object r1 = r0.get(r9)
            if (r1 != 0) goto L_0x001b
            H0.A$a r1 = new H0.A$a
            H0.g r2 = H0.C1186g.f2605a
            yf.p r4 = r2.a()
            r6 = 4
            r7 = 0
            r5 = 0
            r2 = r1
            r3 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r0.put(r9, r1)
        L_0x001b:
            H0.A$a r1 = (H0.A.a) r1
            Y.V0 r10 = r1.b()
            if (r10 == 0) goto L_0x0028
            boolean r10 = r10.r()
            goto L_0x0029
        L_0x0028:
            r10 = 1
        L_0x0029:
            yf.p r0 = r1.c()
            if (r0 != r11) goto L_0x0037
            if (r10 != 0) goto L_0x0037
            boolean r10 = r1.d()
            if (r10 == 0) goto L_0x0041
        L_0x0037:
            r1.j(r11)
            r8.L(r9, r1)
            r9 = 0
            r1.k(r9)
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.A.M(J0.G, java.lang.Object, yf.p):void");
    }

    private final V0 N(V0 v02, G g10, boolean z10, r rVar, p pVar) {
        if (v02 == null || v02.c()) {
            v02 = M1.a(g10, rVar);
        }
        if (!z10) {
            v02.d(pVar);
        } else {
            v02.j(pVar);
        }
        return v02;
    }

    private final G O(Object obj) {
        int i10;
        if (this.f2494n == 0) {
            return null;
        }
        int size = this.f2481a.M().size() - this.f2495o;
        int i11 = size - this.f2494n;
        int i12 = size - 1;
        int i13 = i12;
        while (true) {
            if (i13 < i11) {
                i10 = -1;
                break;
            } else if (C6496s.c(A(i13), obj)) {
                i10 = i13;
                break;
            } else {
                i13--;
            }
        }
        if (i10 == -1) {
            while (true) {
                if (i12 < i11) {
                    i13 = i12;
                    break;
                }
                Object obj2 = this.f2486f.get((G) this.f2481a.M().get(i12));
                C6496s.e(obj2);
                a aVar = (a) obj2;
                if (aVar.f() == d0.f2576a || this.f2483c.b(obj, aVar.f())) {
                    aVar.m(obj);
                    i13 = i12;
                    i10 = i13;
                } else {
                    i12--;
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        if (i13 != i11) {
            D(i13, i11, 1);
        }
        this.f2494n--;
        G g10 = (G) this.f2481a.M().get(i11);
        Object obj3 = this.f2486f.get(g10);
        C6496s.e(obj3);
        a aVar2 = (a) obj3;
        aVar2.h(u1.d(Boolean.TRUE, (o1) null, 2, (Object) null));
        aVar2.l(true);
        aVar2.k(true);
        return g10;
    }

    private final G v(int i10) {
        G g10 = new G(true, 0, 2, (DefaultConstructorMarker) null);
        G g11 = this.f2481a;
        g11.f3574n = true;
        this.f2481a.A0(i10, g10);
        g11.f3574n = false;
        return g10;
    }

    private final void w() {
        G g10 = this.f2481a;
        g10.f3574n = true;
        for (a b10 : this.f2486f.values()) {
            V0 b11 = b10.b();
            if (b11 != null) {
                b11.dispose();
            }
        }
        this.f2481a.m1();
        g10.f3574n = false;
        this.f2486f.clear();
        this.f2487g.clear();
        this.f2495o = 0;
        this.f2494n = 0;
        this.f2490j.clear();
        B();
    }

    /* access modifiers changed from: private */
    public final void y() {
        C6565s.I(this.f2492l.entrySet(), new e(this));
    }

    public final void B() {
        int size = this.f2481a.M().size();
        if (this.f2486f.size() != size) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.f2486f.size() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        } else if ((size - this.f2494n) - this.f2495o < 0) {
            throw new IllegalArgumentException(("Incorrect state. Total children " + size + ". Reusable children " + this.f2494n + ". Precomposed children " + this.f2495o).toString());
        } else if (this.f2490j.size() != this.f2495o) {
            throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.f2495o + ". Map size " + this.f2490j.size()).toString());
        }
    }

    public final e0.a G(Object obj, p pVar) {
        if (!this.f2481a.J0()) {
            return new f();
        }
        B();
        if (!this.f2487g.containsKey(obj)) {
            this.f2492l.remove(obj);
            HashMap hashMap = this.f2490j;
            Object obj2 = hashMap.get(obj);
            if (obj2 == null) {
                obj2 = O(obj);
                if (obj2 != null) {
                    D(this.f2481a.M().indexOf(obj2), this.f2481a.M().size(), 1);
                    this.f2495o++;
                } else {
                    obj2 = v(this.f2481a.M().size());
                    this.f2495o++;
                }
                hashMap.put(obj, obj2);
            }
            M((G) obj2, obj, pVar);
        }
        return new g(this, obj);
    }

    public final void I(r rVar) {
        this.f2482b = rVar;
    }

    public final void J(g0 g0Var) {
        if (this.f2483c != g0Var) {
            this.f2483c = g0Var;
            C(false);
            G.w1(this.f2481a, false, false, false, 7, (Object) null);
        }
    }

    public final List K(Object obj, p pVar) {
        boolean z10;
        B();
        G.e W10 = this.f2481a.W();
        G.e eVar = G.e.Measuring;
        boolean z11 = false;
        if (W10 == eVar || W10 == G.e.LayingOut || W10 == G.e.LookaheadMeasuring || W10 == G.e.LookaheadLayingOut) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            G0.a.b("subcompose can only be used inside the measure or layout blocks");
        }
        HashMap hashMap = this.f2487g;
        Object obj2 = hashMap.get(obj);
        if (obj2 == null) {
            obj2 = (G) this.f2490j.remove(obj);
            if (obj2 != null) {
                if (this.f2495o > 0) {
                    z11 = true;
                }
                if (!z11) {
                    G0.a.b("Check failed.");
                }
                this.f2495o--;
            } else {
                G O10 = O(obj);
                if (O10 == null) {
                    O10 = v(this.f2484d);
                }
                obj2 = O10;
            }
            hashMap.put(obj, obj2);
        }
        G g10 = (G) obj2;
        if (C6565s.r0(this.f2481a.M(), this.f2484d) != g10) {
            int indexOf = this.f2481a.M().indexOf(g10);
            int i10 = this.f2484d;
            if (indexOf < i10) {
                throw new IllegalArgumentException(("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
            } else if (i10 != indexOf) {
                E(this, indexOf, i10, 0, 4, (Object) null);
            }
        }
        this.f2484d++;
        M(g10, obj, pVar);
        if (W10 == eVar || W10 == G.e.LayingOut) {
            return g10.G();
        }
        return g10.F();
    }

    public void c() {
        w();
    }

    public void f() {
        C(true);
    }

    public void l() {
        C(false);
    }

    public final F u(p pVar) {
        return new d(this, pVar, this.f2496p);
    }

    public final void x(int i10) {
        C6798l lVar;
        boolean z10 = false;
        this.f2494n = 0;
        int size = (this.f2481a.M().size() - this.f2495o) - 1;
        if (i10 <= size) {
            this.f2491k.clear();
            if (i10 <= size) {
                int i11 = i10;
                while (true) {
                    this.f2491k.add(A(i11));
                    if (i11 == size) {
                        break;
                    }
                    i11++;
                }
            }
            this.f2483c.a(this.f2491k);
            C2057k.a aVar = C2057k.f21728e;
            C2057k d10 = aVar.d();
            if (d10 != null) {
                lVar = d10.h();
            } else {
                lVar = null;
            }
            C2057k f10 = aVar.f(d10);
            boolean z11 = false;
            while (size >= i10) {
                try {
                    G g10 = (G) this.f2481a.M().get(size);
                    Object obj = this.f2486f.get(g10);
                    C6496s.e(obj);
                    a aVar2 = (a) obj;
                    Object f11 = aVar2.f();
                    if (this.f2491k.contains(f11)) {
                        this.f2494n++;
                        if (aVar2.a()) {
                            H(g10);
                            aVar2.g(false);
                            z11 = true;
                        }
                    } else {
                        G g11 = this.f2481a;
                        g11.f3574n = true;
                        this.f2486f.remove(g10);
                        V0 b10 = aVar2.b();
                        if (b10 != null) {
                            b10.dispose();
                        }
                        this.f2481a.n1(size, 1);
                        g11.f3574n = false;
                    }
                    this.f2487g.remove(f11);
                    size--;
                } catch (Throwable th2) {
                    aVar.m(d10, f10, lVar);
                    throw th2;
                }
            }
            C6514M m10 = C6514M.f71813a;
            aVar.m(d10, f10, lVar);
            z10 = z11;
        }
        if (z10) {
            C2057k.f21728e.n();
        }
        B();
    }

    public final void z() {
        if (this.f2494n != this.f2481a.M().size()) {
            for (Map.Entry value : this.f2486f.entrySet()) {
                ((a) value.getValue()).k(true);
            }
            if (!this.f2481a.d0()) {
                G.w1(this.f2481a, false, false, false, 7, (Object) null);
            }
        }
    }

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Object f2497a;

        /* renamed from: b  reason: collision with root package name */
        private p f2498b;

        /* renamed from: c  reason: collision with root package name */
        private V0 f2499c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f2500d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f2501e;

        /* renamed from: f  reason: collision with root package name */
        private C1510r0 f2502f;

        public a(Object obj, p pVar, V0 v02) {
            this.f2497a = obj;
            this.f2498b = pVar;
            this.f2499c = v02;
            this.f2502f = u1.d(Boolean.TRUE, (o1) null, 2, (Object) null);
        }

        public final boolean a() {
            return ((Boolean) this.f2502f.getValue()).booleanValue();
        }

        public final V0 b() {
            return this.f2499c;
        }

        public final p c() {
            return this.f2498b;
        }

        public final boolean d() {
            return this.f2500d;
        }

        public final boolean e() {
            return this.f2501e;
        }

        public final Object f() {
            return this.f2497a;
        }

        public final void g(boolean z10) {
            this.f2502f.setValue(Boolean.valueOf(z10));
        }

        public final void h(C1510r0 r0Var) {
            this.f2502f = r0Var;
        }

        public final void i(V0 v02) {
            this.f2499c = v02;
        }

        public final void j(p pVar) {
            this.f2498b = pVar;
        }

        public final void k(boolean z10) {
            this.f2500d = z10;
        }

        public final void l(boolean z10) {
            this.f2501e = z10;
        }

        public final void m(Object obj) {
            this.f2497a = obj;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(Object obj, p pVar, V0 v02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, pVar, (i10 & 4) != 0 ? null : v02);
        }
    }

    public static final class f implements e0.a {
        f() {
        }

        public void dispose() {
        }
    }
}
