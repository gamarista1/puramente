package Z;

import Y.C1473b1;
import Y.C1476c1;
import Y.C1477d;
import Y.C1499l0;
import Y.C1501m0;
import Y.C1502n;
import Y.C1506p;
import Y.C1508q;
import Y.T0;
import Y.W;
import Y.r;
import Y.z1;
import g0.d;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6787a;
import yf.C6798l;
import yf.p;

public final class b {

    /* renamed from: m  reason: collision with root package name */
    public static final a f10319m = new a((DefaultConstructorMarker) null);

    /* renamed from: n  reason: collision with root package name */
    public static final int f10320n = 8;

    /* renamed from: a  reason: collision with root package name */
    private final C1502n f10321a;

    /* renamed from: b  reason: collision with root package name */
    private a f10322b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10323c;

    /* renamed from: d  reason: collision with root package name */
    private final W f10324d = new W();

    /* renamed from: e  reason: collision with root package name */
    private boolean f10325e = true;

    /* renamed from: f  reason: collision with root package name */
    private int f10326f;

    /* renamed from: g  reason: collision with root package name */
    private int f10327g;

    /* renamed from: h  reason: collision with root package name */
    private z1 f10328h = new z1();

    /* renamed from: i  reason: collision with root package name */
    private int f10329i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f10330j = -1;

    /* renamed from: k  reason: collision with root package name */
    private int f10331k = -1;

    /* renamed from: l  reason: collision with root package name */
    private int f10332l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(C1502n nVar, a aVar) {
        this.f10321a = nVar;
        this.f10322b = aVar;
    }

    private final void A() {
        B();
    }

    private final void B() {
        int i10 = this.f10327g;
        if (i10 > 0) {
            this.f10322b.G(i10);
            this.f10327g = 0;
        }
        if (this.f10328h.d()) {
            this.f10322b.k(this.f10328h.i());
            this.f10328h.a();
        }
    }

    private final void C() {
        I(this, false, 1, (Object) null);
        K();
    }

    private final void D(boolean z10) {
        H(z10);
    }

    static /* synthetic */ void E(b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        bVar.D(z10);
    }

    private final void F(int i10, int i11, int i12) {
        A();
        this.f10322b.u(i10, i11, i12);
    }

    private final void G() {
        int i10 = this.f10332l;
        if (i10 > 0) {
            int i11 = this.f10329i;
            if (i11 >= 0) {
                J(i11, i10);
                this.f10329i = -1;
            } else {
                F(this.f10331k, this.f10330j, i10);
                this.f10330j = -1;
                this.f10331k = -1;
            }
            this.f10332l = 0;
        }
    }

    private final void H(boolean z10) {
        int i10;
        boolean z11;
        if (z10) {
            i10 = q().u();
        } else {
            i10 = q().k();
        }
        int i11 = i10 - this.f10326f;
        if (i11 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            C1506p.r("Tried to seek backward");
        }
        if (i11 > 0) {
            this.f10322b.e(i11);
            this.f10326f = i10;
        }
    }

    static /* synthetic */ void I(b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        bVar.H(z10);
    }

    private final void J(int i10, int i11) {
        A();
        this.f10322b.x(i10, i11);
    }

    private final void k(C1477d dVar) {
        E(this, false, 1, (Object) null);
        this.f10322b.o(dVar);
        this.f10323c = true;
    }

    private final void l() {
        if (!this.f10323c && this.f10325e) {
            E(this, false, 1, (Object) null);
            this.f10322b.p();
            this.f10323c = true;
        }
    }

    private final C1473b1 q() {
        return this.f10321a.I0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = q();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void K() {
        /*
            r4 = this;
            Y.b1 r0 = r4.q()
            int r0 = r0.x()
            if (r0 <= 0) goto L_0x002c
            Y.b1 r0 = r4.q()
            int r1 = r0.u()
            Y.W r2 = r4.f10324d
            r3 = -2
            int r2 = r2.h(r3)
            if (r2 == r1) goto L_0x002c
            r4.l()
            if (r1 <= 0) goto L_0x002c
            Y.d r0 = r0.a(r1)
            Y.W r2 = r4.f10324d
            r2.j(r1)
            r4.k(r0)
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.b.K():void");
    }

    public final void L() {
        B();
        if (this.f10323c) {
            U();
            j();
        }
    }

    public final void M(T0 t02) {
        this.f10322b.v(t02);
    }

    public final void N() {
        C();
        this.f10322b.w();
        this.f10326f += q().p();
    }

    public final void O(int i10, int i11) {
        boolean z10;
        if (i11 > 0) {
            if (i10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                C1506p.r("Invalid remove index " + i10);
            }
            if (this.f10329i == i10) {
                this.f10332l += i11;
                return;
            }
            G();
            this.f10329i = i10;
            this.f10332l = i11;
        }
    }

    public final void P() {
        this.f10322b.y();
    }

    public final void Q() {
        this.f10323c = false;
        this.f10324d.a();
        this.f10326f = 0;
    }

    public final void R(a aVar) {
        this.f10322b = aVar;
    }

    public final void S(boolean z10) {
        this.f10325e = z10;
    }

    public final void T(C6787a aVar) {
        this.f10322b.z(aVar);
    }

    public final void U() {
        this.f10322b.A();
    }

    public final void V(int i10) {
        if (i10 > 0) {
            C();
            this.f10322b.B(i10);
        }
    }

    public final void W(Object obj, C1477d dVar, int i10) {
        this.f10322b.C(obj, dVar, i10);
    }

    public final void X(Object obj) {
        E(this, false, 1, (Object) null);
        this.f10322b.D(obj);
    }

    public final void Y(Object obj, p pVar) {
        A();
        this.f10322b.E(obj, pVar);
    }

    public final void Z(Object obj, int i10) {
        D(true);
        this.f10322b.F(obj, i10);
    }

    public final void a(C1477d dVar, Object obj) {
        this.f10322b.f(dVar, obj);
    }

    public final void a0(Object obj) {
        A();
        this.f10322b.H(obj);
    }

    public final void b(List list, d dVar) {
        this.f10322b.g(list, dVar);
    }

    public final void c(C1499l0 l0Var, r rVar, C1501m0 m0Var, C1501m0 m0Var2) {
        this.f10322b.h(l0Var, rVar, m0Var, m0Var2);
    }

    public final void d() {
        E(this, false, 1, (Object) null);
        this.f10322b.i();
    }

    public final void e(d dVar, C1477d dVar2) {
        B();
        this.f10322b.j(dVar, dVar2);
    }

    public final void f(C6798l lVar, C1508q qVar) {
        this.f10322b.l(lVar, qVar);
    }

    public final void g() {
        boolean z10;
        int u10 = q().u();
        if (this.f10324d.h(-1) <= u10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C1506p.r("Missed recording an endGroup");
        }
        if (this.f10324d.h(-1) == u10) {
            E(this, false, 1, (Object) null);
            this.f10324d.i();
            this.f10322b.m();
        }
    }

    public final void h() {
        this.f10322b.n();
        this.f10326f = 0;
    }

    public final void i() {
        G();
    }

    public final void j() {
        if (this.f10323c) {
            E(this, false, 1, (Object) null);
            E(this, false, 1, (Object) null);
            this.f10322b.m();
            this.f10323c = false;
        }
    }

    public final void m() {
        B();
        if (!this.f10324d.d()) {
            C1506p.r("Missed recording an endGroup()");
        }
    }

    public final a n() {
        return this.f10322b;
    }

    public final boolean o() {
        return this.f10325e;
    }

    public final boolean p() {
        if (q().u() - this.f10326f < 0) {
            return true;
        }
        return false;
    }

    public final void r(a aVar, d dVar) {
        this.f10322b.q(aVar, dVar);
    }

    public final void s(C1477d dVar, C1476c1 c1Var) {
        B();
        C();
        G();
        this.f10322b.r(dVar, c1Var);
    }

    public final void t(C1477d dVar, C1476c1 c1Var, c cVar) {
        B();
        C();
        G();
        this.f10322b.s(dVar, c1Var, cVar);
    }

    public final void u(int i10) {
        C();
        this.f10322b.t(i10);
    }

    public final void v(Object obj) {
        G();
        this.f10328h.h(obj);
    }

    public final void w(int i10, int i11, int i12) {
        if (i12 > 0) {
            int i13 = this.f10332l;
            if (i13 > 0 && this.f10330j == i10 - i13 && this.f10331k == i11 - i13) {
                this.f10332l = i13 + i12;
                return;
            }
            G();
            this.f10330j = i10;
            this.f10331k = i11;
            this.f10332l = i12;
        }
    }

    public final void x(int i10) {
        this.f10326f += i10 - q().k();
    }

    public final void y(int i10) {
        this.f10326f = i10;
    }

    public final void z() {
        G();
        if (this.f10328h.d()) {
            this.f10328h.g();
        } else {
            this.f10327g++;
        }
    }
}
