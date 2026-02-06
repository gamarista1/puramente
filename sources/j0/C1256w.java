package J0;

import H0.C1180a;
import H0.U;
import J0.G;
import J0.L;
import a0.C1538b;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2468U;
import r0.C2520p0;
import r0.C2544x0;
import r0.Q1;
import r0.R1;
import u0.C2673c;
import yf.C6798l;

/* renamed from: J0.w  reason: case insensitive filesystem */
public final class C1256w extends C1235c0 {

    /* renamed from: o0  reason: collision with root package name */
    public static final a f3936o0 = new a((DefaultConstructorMarker) null);

    /* renamed from: p0  reason: collision with root package name */
    private static final Q1 f3937p0;

    /* renamed from: m0  reason: collision with root package name */
    private final z0 f3938m0 = new z0();

    /* renamed from: n0  reason: collision with root package name */
    private Q f3939n0;

    /* renamed from: J0.w$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: J0.w$b */
    private final class b extends Q {
        public b() {
            super(C1256w.this);
        }

        /* access modifiers changed from: protected */
        public void c2() {
            L.a Z10 = A1().Z();
            C6496s.e(Z10);
            Z10.Q1();
        }

        public int e0(int i10) {
            return A1().c1(i10);
        }

        public int n1(C1180a aVar) {
            int i10;
            Integer num = (Integer) W1().x().get(aVar);
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = Integer.MIN_VALUE;
            }
            Y1().put(aVar, Integer.valueOf(i10));
            return i10;
        }

        public int s(int i10) {
            return A1().X0(i10);
        }

        public int s0(int i10) {
            return A1().d1(i10);
        }

        public int t0(int i10) {
            return A1().Z0(i10);
        }

        public U v0(long j10) {
            k1(j10);
            C1538b v02 = A1().v0();
            int q10 = v02.q();
            if (q10 > 0) {
                Object[] p10 = v02.p();
                int i10 = 0;
                do {
                    L.a Z10 = ((G) p10[i10]).Z();
                    C6496s.e(Z10);
                    Z10.V1(G.g.NotUsed);
                    i10++;
                } while (i10 < q10);
            }
            h2(A1().e0().j(this, A1().F(), j10));
            return this;
        }
    }

    static {
        Q1 a10 = C2468U.a();
        a10.m(C2544x0.f25560b.f());
        a10.w(1.0f);
        a10.v(R1.f25451a.b());
        f3937p0 = a10;
    }

    public C1256w(G g10) {
        super(g10);
        b bVar;
        D2().k2(this);
        if (g10.a0() != null) {
            bVar = new b();
        } else {
            bVar = null;
        }
        this.f3939n0 = bVar;
    }

    private final void y3() {
        if (!P1()) {
            X2();
            A1().c0().W1();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void N2(J0.C1235c0.f r16, long r17, J0.C1254u r19, boolean r20, boolean r21) {
        /*
            r15 = this;
            r0 = r15
            r8 = r17
            J0.G r1 = r15.A1()
            r10 = r16
            boolean r1 = r10.d(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0033
            boolean r1 = r15.w3(r8)
            if (r1 == 0) goto L_0x001b
            r11 = r21
        L_0x0019:
            r3 = r2
            goto L_0x0035
        L_0x001b:
            if (r20 == 0) goto L_0x0033
            long r4 = r15.A2()
            float r1 = r15.l2(r8, r4)
            boolean r4 = java.lang.Float.isInfinite(r1)
            if (r4 != 0) goto L_0x0033
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0033
            r11 = r3
            goto L_0x0019
        L_0x0033:
            r11 = r21
        L_0x0035:
            if (r3 == 0) goto L_0x0082
            int r12 = r19.f3925c
            J0.G r1 = r15.A1()
            a0.b r1 = r1.u0()
            int r3 = r1.q()
            if (r3 <= 0) goto L_0x0077
            int r3 = r3 - r2
            java.lang.Object[] r13 = r1.p()
            r14 = r3
        L_0x004f:
            r1 = r13[r14]
            r2 = r1
            J0.G r2 = (J0.G) r2
            boolean r1 = r2.e()
            if (r1 == 0) goto L_0x007a
            r1 = r16
            r3 = r17
            r5 = r19
            r6 = r20
            r7 = r11
            r1.c(r2, r3, r5, r6, r7)
            boolean r1 = r19.A()
            if (r1 != 0) goto L_0x006d
            goto L_0x007a
        L_0x006d:
            boolean r1 = r19.x()
            if (r1 == 0) goto L_0x0077
            r19.a()
            goto L_0x007a
        L_0x0077:
            r1 = r19
            goto L_0x007f
        L_0x007a:
            int r14 = r14 + -1
            if (r14 >= 0) goto L_0x004f
            goto L_0x0077
        L_0x007f:
            r1.f3925c = r12
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.C1256w.N2(J0.c0$f, long, J0.u, boolean, boolean):void");
    }

    public void Z2(C2520p0 p0Var, C2673c cVar) {
        m0 b10 = K.b(A1());
        C1538b u02 = A1().u0();
        int q10 = u02.q();
        if (q10 > 0) {
            Object[] p10 = u02.p();
            int i10 = 0;
            do {
                G g10 = (G) p10[i10];
                if (g10.e()) {
                    g10.B(p0Var, cVar);
                }
                i10++;
            } while (i10 < q10);
        }
        if (b10.getShowLayoutBounds()) {
            n2(p0Var, f3937p0);
        }
    }

    public int e0(int i10) {
        return A1().a1(i10);
    }

    /* access modifiers changed from: protected */
    public void e1(long j10, float f10, C2673c cVar) {
        super.e1(j10, f10, cVar);
        y3();
    }

    /* access modifiers changed from: protected */
    public void f1(long j10, float f10, C6798l lVar) {
        super.f1(j10, f10, lVar);
        y3();
    }

    public int n1(C1180a aVar) {
        Q z22 = z2();
        if (z22 != null) {
            return z22.n1(aVar);
        }
        Integer num = (Integer) u2().x().get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    public void p2() {
        if (z2() == null) {
            z3(new b());
        }
    }

    public int s(int i10) {
        return A1().V0(i10);
    }

    public int s0(int i10) {
        return A1().b1(i10);
    }

    public int t0(int i10) {
        return A1().W0(i10);
    }

    public U v0(long j10) {
        if (v2()) {
            Q z22 = z2();
            C6496s.e(z22);
            j10 = z22.Z1();
        }
        k1(j10);
        C1538b v02 = A1().v0();
        int q10 = v02.q();
        if (q10 > 0) {
            Object[] p10 = v02.p();
            int i10 = 0;
            do {
                ((G) p10[i10]).c0().c2(G.g.NotUsed);
                i10++;
            } while (i10 < q10);
        }
        g3(A1().e0().j(this, A1().G(), j10));
        W2();
        return this;
    }

    /* renamed from: x3 */
    public z0 D2() {
        return this.f3938m0;
    }

    public Q z2() {
        return this.f3939n0;
    }

    /* access modifiers changed from: protected */
    public void z3(Q q10) {
        this.f3939n0 = q10;
    }
}
