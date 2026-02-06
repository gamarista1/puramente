package J0;

import H0.C1180a;
import H0.C1182c;
import H0.C1183d;
import H0.U;
import android.support.v4.media.session.c;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2468U;
import r0.C2520p0;
import r0.C2544x0;
import r0.Q1;
import r0.R1;
import u0.C2673c;
import yf.C6798l;

public final class C extends C1235c0 {

    /* renamed from: q0  reason: collision with root package name */
    public static final a f3537q0 = new a((DefaultConstructorMarker) null);

    /* renamed from: r0  reason: collision with root package name */
    private static final Q1 f3538r0;

    /* renamed from: m0  reason: collision with root package name */
    private B f3539m0;

    /* renamed from: n0  reason: collision with root package name */
    private c1.b f3540n0;

    /* renamed from: o0  reason: collision with root package name */
    private Q f3541o0;
    /* access modifiers changed from: private */

    /* renamed from: p0  reason: collision with root package name */
    public C1183d f3542p0;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final class b extends Q {
        public b() {
            super(C.this);
        }

        public int e0(int i10) {
            B y32 = C.this.y3();
            Q z22 = C.this.z3().z2();
            C6496s.e(z22);
            return y32.D(this, z22, i10);
        }

        public int n1(C1180a aVar) {
            int a10 = D.b(this, aVar);
            Y1().put(aVar, Integer.valueOf(a10));
            return a10;
        }

        public int s(int i10) {
            B y32 = C.this.y3();
            Q z22 = C.this.z3().z2();
            C6496s.e(z22);
            return y32.B(this, z22, i10);
        }

        public int s0(int i10) {
            B y32 = C.this.y3();
            Q z22 = C.this.z3().z2();
            C6496s.e(z22);
            return y32.x(this, z22, i10);
        }

        public int t0(int i10) {
            B y32 = C.this.y3();
            Q z22 = C.this.z3().z2();
            C6496s.e(z22);
            return y32.G(this, z22, i10);
        }

        public U v0(long j10) {
            C c10 = C.this;
            k1(j10);
            c10.C3(c1.b.a(j10));
            B y32 = c10.y3();
            Q z22 = c10.z3().z2();
            C6496s.e(z22);
            h2(y32.o(this, z22, j10));
            return this;
        }
    }

    static {
        Q1 a10 = C2468U.a();
        a10.m(C2544x0.f25560b.b());
        a10.w(1.0f);
        a10.v(R1.f25451a.b());
        f3538r0 = a10;
    }

    public C(G g10, B b10) {
        super(g10);
        b bVar;
        this.f3539m0 = b10;
        C1183d dVar = null;
        if (g10.a0() != null) {
            bVar = new b();
        } else {
            bVar = null;
        }
        this.f3541o0 = bVar;
        if ((b10.v0().N1() & C1239e0.a(512)) != 0) {
            C6496s.f(b10, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
            c.a(b10);
            dVar = new C1183d(this, (C1182c) null);
        }
        this.f3542p0 = dVar;
    }

    private final void A3() {
        if (!P1()) {
            X2();
            C1183d dVar = this.f3542p0;
            if (dVar == null) {
                E1().q();
                z3().f3(false);
                return;
            }
            dVar.a();
            I1();
            Q z22 = z2();
            C6496s.e(z22);
            z22.b2();
            throw null;
        }
    }

    public final void B3(B b10) {
        if (!C6496s.c(b10, this.f3539m0)) {
            i.c v02 = b10.v0();
            if ((v02.N1() & C1239e0.a(512)) != 0) {
                C6496s.f(b10, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
                c.a(b10);
                C1183d dVar = this.f3542p0;
                if (dVar != null) {
                    c.a(b10);
                    dVar.p((C1182c) null);
                } else {
                    c.a(b10);
                    dVar = new C1183d(this, (C1182c) null);
                }
                this.f3542p0 = dVar;
            } else {
                this.f3542p0 = null;
            }
        }
        this.f3539m0 = b10;
    }

    public final void C3(c1.b bVar) {
        this.f3540n0 = bVar;
    }

    public i.c D2() {
        return this.f3539m0.v0();
    }

    /* access modifiers changed from: protected */
    public void D3(Q q10) {
        this.f3541o0 = q10;
    }

    public void Z2(C2520p0 p0Var, C2673c cVar) {
        z3().m2(p0Var, cVar);
        if (K.b(A1()).getShowLayoutBounds()) {
            n2(p0Var, f3538r0);
        }
    }

    public int e0(int i10) {
        C1183d dVar = this.f3542p0;
        if (dVar == null) {
            return this.f3539m0.D(this, z3(), i10);
        }
        dVar.a();
        z3();
        throw null;
    }

    /* access modifiers changed from: protected */
    public void e1(long j10, float f10, C2673c cVar) {
        super.e1(j10, f10, cVar);
        A3();
    }

    /* access modifiers changed from: protected */
    public void f1(long j10, float f10, C6798l lVar) {
        super.f1(j10, f10, lVar);
        A3();
    }

    public int n1(C1180a aVar) {
        Q z22 = z2();
        if (z22 != null) {
            return z22.X1(aVar);
        }
        return D.b(this, aVar);
    }

    public void p2() {
        if (z2() == null) {
            D3(new b());
        }
    }

    public int s(int i10) {
        C1183d dVar = this.f3542p0;
        if (dVar == null) {
            return this.f3539m0.B(this, z3(), i10);
        }
        dVar.a();
        z3();
        throw null;
    }

    public int s0(int i10) {
        C1183d dVar = this.f3542p0;
        if (dVar == null) {
            return this.f3539m0.x(this, z3(), i10);
        }
        dVar.a();
        z3();
        throw null;
    }

    public int t0(int i10) {
        C1183d dVar = this.f3542p0;
        if (dVar == null) {
            return this.f3539m0.G(this, z3(), i10);
        }
        dVar.a();
        z3();
        throw null;
    }

    public U v0(long j10) {
        if (v2()) {
            c1.b bVar = this.f3540n0;
            if (bVar != null) {
                j10 = bVar.r();
            } else {
                throw new IllegalArgumentException("Lookahead constraints cannot be null in approach pass.");
            }
        }
        k1(j10);
        C1183d x32 = this.f3542p0;
        if (x32 == null) {
            g3(y3().o(this, z3(), j10));
            W2();
            return this;
        }
        x32.a();
        x32.o();
        throw null;
    }

    public final B y3() {
        return this.f3539m0;
    }

    public Q z2() {
        return this.f3541o0;
    }

    public final C1235c0 z3() {
        C1235c0 E22 = E2();
        C6496s.e(E22);
        return E22;
    }
}
