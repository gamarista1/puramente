package l9;

import N9.C3065n;
import N9.C3068q;
import N9.C3069s;
import N9.C3070t;
import W9.e;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.adjust.sdk.network.ErrorCodes;
import com.google.common.collect.B;
import com.google.common.collect.C4770v;
import com.google.common.collect.C4771w;
import ja.C3645a;
import ja.C3648d;
import ja.C3656l;
import ja.M;
import ja.o;
import ja.r;
import java.io.IOException;
import java.util.List;
import k9.C3714p;
import k9.C3717q0;
import k9.C3732y0;
import k9.D0;
import k9.P0;
import k9.S0;
import k9.T0;
import k9.n1;
import k9.s1;
import ka.y;
import l9.C3748b;
import n9.C3869e;
import n9.C3873i;
import nb.k;

public class n0 implements C3747a {

    /* renamed from: a  reason: collision with root package name */
    private final C3648d f46266a;

    /* renamed from: b  reason: collision with root package name */
    private final n1.b f46267b;

    /* renamed from: c  reason: collision with root package name */
    private final n1.d f46268c = new n1.d();

    /* renamed from: d  reason: collision with root package name */
    private final a f46269d;

    /* renamed from: e  reason: collision with root package name */
    private final SparseArray f46270e;

    /* renamed from: f  reason: collision with root package name */
    private r f46271f;

    /* renamed from: g  reason: collision with root package name */
    private T0 f46272g;

    /* renamed from: h  reason: collision with root package name */
    private o f46273h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f46274i;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final n1.b f46275a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public C4770v f46276b = C4770v.E();

        /* renamed from: c  reason: collision with root package name */
        private C4771w f46277c = C4771w.n();

        /* renamed from: d  reason: collision with root package name */
        private C3070t.b f46278d;

        /* renamed from: e  reason: collision with root package name */
        private C3070t.b f46279e;

        /* renamed from: f  reason: collision with root package name */
        private C3070t.b f46280f;

        public a(n1.b bVar) {
            this.f46275a = bVar;
        }

        private void b(C4771w.a aVar, C3070t.b bVar, n1 n1Var) {
            if (bVar != null) {
                if (n1Var.f(bVar.f33285a) != -1) {
                    aVar.f(bVar, n1Var);
                    return;
                }
                n1 n1Var2 = (n1) this.f46277c.get(bVar);
                if (n1Var2 != null) {
                    aVar.f(bVar, n1Var2);
                }
            }
        }

        private static C3070t.b c(T0 t02, C4770v vVar, C3070t.b bVar, n1.b bVar2) {
            Object obj;
            int i10;
            n1 s10 = t02.s();
            int v10 = t02.v();
            if (s10.u()) {
                obj = null;
            } else {
                obj = s10.q(v10);
            }
            if (t02.g() || s10.u()) {
                i10 = -1;
            } else {
                i10 = s10.j(v10, bVar2).g(M.C0(t02.getCurrentPosition()) - bVar2.q());
            }
            for (int i11 = 0; i11 < vVar.size(); i11++) {
                C3070t.b bVar3 = (C3070t.b) vVar.get(i11);
                if (i(bVar3, obj, t02.g(), t02.p(), t02.x(), i10)) {
                    return bVar3;
                }
            }
            if (vVar.isEmpty() && bVar != null) {
                if (i(bVar, obj, t02.g(), t02.p(), t02.x(), i10)) {
                    return bVar;
                }
            }
            return null;
        }

        private static boolean i(C3070t.b bVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (!bVar.f33285a.equals(obj)) {
                return false;
            }
            if ((z10 && bVar.f33286b == i10 && bVar.f33287c == i11) || (!z10 && bVar.f33286b == -1 && bVar.f33289e == i12)) {
                return true;
            }
            return false;
        }

        private void m(n1 n1Var) {
            C4771w.a a10 = C4771w.a();
            if (this.f46276b.isEmpty()) {
                b(a10, this.f46279e, n1Var);
                if (!k.a(this.f46280f, this.f46279e)) {
                    b(a10, this.f46280f, n1Var);
                }
                if (!k.a(this.f46278d, this.f46279e) && !k.a(this.f46278d, this.f46280f)) {
                    b(a10, this.f46278d, n1Var);
                }
            } else {
                for (int i10 = 0; i10 < this.f46276b.size(); i10++) {
                    b(a10, (C3070t.b) this.f46276b.get(i10), n1Var);
                }
                if (!this.f46276b.contains(this.f46278d)) {
                    b(a10, this.f46278d, n1Var);
                }
            }
            this.f46277c = a10.c();
        }

        public C3070t.b d() {
            return this.f46278d;
        }

        public C3070t.b e() {
            if (this.f46276b.isEmpty()) {
                return null;
            }
            return (C3070t.b) B.d(this.f46276b);
        }

        public n1 f(C3070t.b bVar) {
            return (n1) this.f46277c.get(bVar);
        }

        public C3070t.b g() {
            return this.f46279e;
        }

        public C3070t.b h() {
            return this.f46280f;
        }

        public void j(T0 t02) {
            this.f46278d = c(t02, this.f46276b, this.f46279e, this.f46275a);
        }

        public void k(List list, C3070t.b bVar, T0 t02) {
            this.f46276b = C4770v.z(list);
            if (!list.isEmpty()) {
                this.f46279e = (C3070t.b) list.get(0);
                this.f46280f = (C3070t.b) C3645a.e(bVar);
            }
            if (this.f46278d == null) {
                this.f46278d = c(t02, this.f46276b, this.f46279e, this.f46275a);
            }
            m(t02.s());
        }

        public void l(T0 t02) {
            this.f46278d = c(t02, this.f46276b, this.f46279e, this.f46275a);
            m(t02.s());
        }
    }

    public n0(C3648d dVar) {
        this.f46266a = (C3648d) C3645a.e(dVar);
        this.f46271f = new r(M.Q(), dVar, new C3771z());
        n1.b bVar = new n1.b();
        this.f46267b = bVar;
        this.f46269d = new a(bVar);
        this.f46270e = new SparseArray();
    }

    private C3748b.a B1() {
        return z1(this.f46269d.e());
    }

    private C3748b.a C1(int i10, C3070t.b bVar) {
        C3645a.e(this.f46272g);
        if (bVar == null) {
            n1 s10 = this.f46272g.s();
            if (i10 >= s10.t()) {
                s10 = n1.f45710a;
            }
            return A1(s10, i10, (C3070t.b) null);
        } else if (this.f46269d.f(bVar) != null) {
            return z1(bVar);
        } else {
            return A1(n1.f45710a, i10, bVar);
        }
    }

    private C3748b.a D1() {
        return z1(this.f46269d.g());
    }

    private C3748b.a E1() {
        return z1(this.f46269d.h());
    }

    private C3748b.a F1(P0 p02) {
        C3069s sVar;
        if (!(p02 instanceof k9.r) || (sVar = ((k9.r) p02).f45821i) == null) {
            return y1();
        }
        return z1(new C3070t.b(sVar));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void F2(C3748b.a aVar, String str, long j10, long j11, C3748b bVar) {
        bVar.l(aVar, str, j10);
        long j12 = j10;
        bVar.w0(aVar, str, j11, j12);
        bVar.J(aVar, 2, str, j12);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void H2(C3748b.a aVar, C3869e eVar, C3748b bVar) {
        bVar.r0(aVar, eVar);
        bVar.m0(aVar, 2, eVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void I2(C3748b.a aVar, C3869e eVar, C3748b bVar) {
        bVar.r(aVar, eVar);
        bVar.E(aVar, 2, eVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void J1(C3748b.a aVar, String str, long j10, long j11, C3748b bVar) {
        bVar.o(aVar, str, j10);
        long j12 = j10;
        bVar.O(aVar, str, j11, j12);
        bVar.J(aVar, 1, str, j12);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void K2(C3748b.a aVar, C3717q0 q0Var, C3873i iVar, C3748b bVar) {
        bVar.g0(aVar, q0Var);
        bVar.C(aVar, q0Var, iVar);
        bVar.x(aVar, 2, q0Var);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void L1(C3748b.a aVar, C3869e eVar, C3748b bVar) {
        bVar.e(aVar, eVar);
        bVar.m0(aVar, 1, eVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void L2(C3748b.a aVar, y yVar, C3748b bVar) {
        bVar.M(aVar, yVar);
        bVar.d(aVar, yVar.f46097a, yVar.f46098b, yVar.f46099c, yVar.f46100d);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void M1(C3748b.a aVar, C3869e eVar, C3748b bVar) {
        bVar.W(aVar, eVar);
        bVar.E(aVar, 1, eVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void N1(C3748b.a aVar, C3717q0 q0Var, C3873i iVar, C3748b bVar) {
        bVar.e0(aVar, q0Var);
        bVar.g(aVar, q0Var, iVar);
        bVar.x(aVar, 1, q0Var);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void O2(T0 t02, C3748b bVar, C3656l lVar) {
        bVar.u(t02, new C3748b.C0694b(lVar, this.f46270e));
    }

    /* access modifiers changed from: private */
    public void P2() {
        C3748b.a y12 = y1();
        Q2(y12, 1028, new e0(y12));
        this.f46271f.j();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b2(C3748b.a aVar, int i10, C3748b bVar) {
        bVar.i(aVar);
        bVar.N(aVar, i10);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void f2(C3748b.a aVar, boolean z10, C3748b bVar) {
        bVar.z(aVar, z10);
        bVar.B(aVar, z10);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void v2(C3748b.a aVar, int i10, T0.e eVar, T0.e eVar2, C3748b bVar) {
        bVar.q0(aVar, i10);
        bVar.s0(aVar, eVar, eVar2, i10);
    }

    private C3748b.a z1(C3070t.b bVar) {
        n1 n1Var;
        C3645a.e(this.f46272g);
        if (bVar == null) {
            n1Var = null;
        } else {
            n1Var = this.f46269d.f(bVar);
        }
        if (bVar != null && n1Var != null) {
            return A1(n1Var, n1Var.l(bVar.f33285a, this.f46267b).f45715c, bVar);
        }
        int B10 = this.f46272g.B();
        n1 s10 = this.f46272g.s();
        if (B10 >= s10.t()) {
            s10 = n1.f45710a;
        }
        return A1(s10, B10, (C3070t.b) null);
    }

    public final void A(C3869e eVar) {
        C3748b.a D12 = D1();
        Q2(D12, 1020, new J(D12, eVar));
    }

    /* access modifiers changed from: protected */
    public final C3748b.a A1(n1 n1Var, int i10, C3070t.b bVar) {
        C3070t.b bVar2;
        boolean z10;
        n1 n1Var2 = n1Var;
        int i11 = i10;
        if (n1Var.u()) {
            bVar2 = null;
        } else {
            bVar2 = bVar;
        }
        long a10 = this.f46266a.a();
        if (!n1Var2.equals(this.f46272g.s()) || i11 != this.f46272g.B()) {
            z10 = false;
        } else {
            z10 = true;
        }
        long j10 = 0;
        if (bVar2 == null || !bVar2.b()) {
            if (z10) {
                j10 = this.f46272g.z();
            } else if (!n1Var.u()) {
                j10 = n1Var2.r(i11, this.f46268c).d();
            }
        } else if (z10 && this.f46272g.p() == bVar2.f33286b && this.f46272g.x() == bVar2.f33287c) {
            j10 = this.f46272g.getCurrentPosition();
        }
        return new C3748b.a(a10, n1Var, i10, bVar2, j10, this.f46272g.s(), this.f46272g.B(), this.f46269d.d(), this.f46272g.getCurrentPosition(), this.f46272g.h());
    }

    public final void B(C3869e eVar) {
        C3748b.a E12 = E1();
        Q2(E12, ErrorCodes.IO_EXCEPTION, new Q(E12, eVar));
    }

    public final void C(int i10, int i11) {
        C3748b.a E12 = E1();
        Q2(E12, 24, new C3761o(E12, i10, i11));
    }

    public final void D(C3869e eVar) {
        C3748b.a D12 = D1();
        Q2(D12, 1013, new C3746A(D12, eVar));
    }

    public final void F(boolean z10) {
        C3748b.a y12 = y1();
        Q2(y12, 3, new g0(y12, z10));
    }

    public final void G(C3717q0 q0Var, C3873i iVar) {
        C3748b.a E12 = E1();
        Q2(E12, 1009, new C3750d(E12, q0Var, iVar));
    }

    public final void H(boolean z10, int i10) {
        C3748b.a y12 = y1();
        Q2(y12, -1, new C3755i(y12, z10, i10));
    }

    public final void I(C3869e eVar) {
        C3748b.a E12 = E1();
        Q2(E12, 1015, new C3767v(E12, eVar));
    }

    public void J(e eVar) {
        C3748b.a y12 = y1();
        Q2(y12, 27, new C3764s(y12, eVar));
    }

    public void K(C3714p pVar) {
        C3748b.a y12 = y1();
        Q2(y12, 29, new W(y12, pVar));
    }

    public final void L(boolean z10, int i10) {
        C3748b.a y12 = y1();
        Q2(y12, 5, new C3760n(y12, z10, i10));
    }

    public final void M(int i10, C3070t.b bVar) {
        C3748b.a C12 = C1(i10, bVar);
        Q2(C12, 1027, new E(C12));
    }

    public void N(boolean z10) {
        C3748b.a y12 = y1();
        Q2(y12, 7, new k0(y12, z10));
    }

    public void O(C3748b bVar) {
        C3645a.e(bVar);
        this.f46271f.c(bVar);
    }

    public final void P(int i10, C3070t.b bVar, C3068q qVar) {
        C3748b.a C12 = C1(i10, bVar);
        Q2(C12, ErrorCodes.PROTOCOL_EXCEPTION, new C3759m(C12, qVar));
    }

    public final void Q(T0.e eVar, T0.e eVar2, int i10) {
        if (i10 == 1) {
            this.f46274i = false;
        }
        this.f46269d.j((T0) C3645a.e(this.f46272g));
        C3748b.a y12 = y1();
        Q2(y12, 11, new P(y12, i10, eVar, eVar2));
    }

    /* access modifiers changed from: protected */
    public final void Q2(C3748b.a aVar, int i10, r.a aVar2) {
        this.f46270e.put(i10, aVar);
        this.f46271f.k(i10, aVar2);
    }

    public final void R(C3732y0 y0Var, int i10) {
        C3748b.a y12 = y1();
        Q2(y12, 1, new r(y12, y0Var, i10));
    }

    public final void S(n1 n1Var, int i10) {
        this.f46269d.l((T0) C3645a.e(this.f46272g));
        C3748b.a y12 = y1();
        Q2(y12, 0, new S(y12, i10));
    }

    public void U(T0 t02, Looper looper) {
        boolean z10;
        if (this.f46272g == null || this.f46269d.f46276b.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.f(z10);
        this.f46272g = (T0) C3645a.e(t02);
        this.f46273h = this.f46266a.d(looper, (Handler.Callback) null);
        this.f46271f = this.f46271f.e(looper, new C3757k(this, t02));
    }

    public final void V(int i10, C3070t.b bVar, C3065n nVar, C3068q qVar) {
        C3748b.a C12 = C1(i10, bVar);
        Q2(C12, ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION, new j0(C12, nVar, qVar));
    }

    public final void W(int i10, C3070t.b bVar) {
        C3748b.a C12 = C1(i10, bVar);
        Q2(C12, 1026, new a0(C12));
    }

    public final void X() {
        C3748b.a y12 = y1();
        Q2(y12, -1, new C3758l(y12));
    }

    public final void Y(float f10) {
        C3748b.a E12 = E1();
        Q2(E12, 22, new U(E12, f10));
    }

    public void Z(D0 d02) {
        C3748b.a y12 = y1();
        Q2(y12, 14, new C3751e(y12, d02));
    }

    public final void a(boolean z10) {
        C3748b.a E12 = E1();
        Q2(E12, 23, new i0(E12, z10));
    }

    public final void a0(P0 p02) {
        C3748b.a F12 = F1(p02);
        Q2(F12, 10, new C3763q(F12, p02));
    }

    public final void b(Exception exc) {
        C3748b.a E12 = E1();
        Q2(E12, 1014, new L(E12, exc));
    }

    public final void b0(int i10, C3070t.b bVar) {
        C3748b.a C12 = C1(i10, bVar);
        Q2(C12, 1025, new h0(C12));
    }

    public final void c(String str) {
        C3748b.a E12 = E1();
        Q2(E12, 1019, new Z(E12, str));
    }

    public final void c0(int i10, C3070t.b bVar, C3065n nVar, C3068q qVar) {
        C3748b.a C12 = C1(i10, bVar);
        Q2(C12, ErrorCodes.SERVER_RETRY_IN, new C3754h(C12, nVar, qVar));
    }

    public final void d(String str, long j10, long j11) {
        C3748b.a E12 = E1();
        Q2(E12, 1016, new C3769x(E12, str, j11, j10));
    }

    public final void d0(int i10, C3070t.b bVar, Exception exc) {
        C3748b.a C12 = C1(i10, bVar);
        Q2(C12, 1024, new O(C12, exc));
    }

    public final void e(String str) {
        C3748b.a E12 = E1();
        Q2(E12, 1012, new B(E12, str));
    }

    public final void e0(int i10, C3070t.b bVar, int i11) {
        C3748b.a C12 = C1(i10, bVar);
        Q2(C12, 1022, new T(C12, i11));
    }

    public final void f(String str, long j10, long j11) {
        C3748b.a E12 = E1();
        Q2(E12, 1008, new C3749c(E12, str, j11, j10));
    }

    public void g(List list) {
        C3748b.a y12 = y1();
        Q2(y12, 27, new F(y12, list));
    }

    public final void g0(int i10, C3070t.b bVar, C3065n nVar, C3068q qVar) {
        C3748b.a C12 = C1(i10, bVar);
        Q2(C12, 1000, new V(C12, nVar, qVar));
    }

    public final void h(long j10) {
        C3748b.a E12 = E1();
        Q2(E12, 1010, new D(E12, j10));
    }

    public final void h0(int i10, C3070t.b bVar, C3065n nVar, C3068q qVar, IOException iOException, boolean z10) {
        C3748b.a C12 = C1(i10, bVar);
        Q2(C12, ErrorCodes.MALFORMED_URL_EXCEPTION, new C3762p(C12, nVar, qVar, iOException, z10));
    }

    public final void i(Exception exc) {
        C3748b.a E12 = E1();
        Q2(E12, 1030, new l0(E12, exc));
    }

    public final void i0(List list, C3070t.b bVar) {
        this.f46269d.k(list, bVar, (T0) C3645a.e(this.f46272g));
    }

    public final void j(int i10, long j10) {
        C3748b.a D12 = D1();
        Q2(D12, 1018, new H(D12, i10, j10));
    }

    public void j0(P0 p02) {
        C3748b.a F12 = F1(p02);
        Q2(F12, 10, new I(F12, p02));
    }

    public final void k(Object obj, long j10) {
        C3748b.a E12 = E1();
        Q2(E12, 26, new c0(E12, obj, j10));
    }

    public void k0(s1 s1Var) {
        C3748b.a y12 = y1();
        Q2(y12, 2, new G(y12, s1Var));
    }

    public final void l(Exception exc) {
        C3748b.a E12 = E1();
        Q2(E12, 1029, new m0(E12, exc));
    }

    public void l0(T0.b bVar) {
        C3748b.a y12 = y1();
        Q2(y12, 13, new C3765t(y12, bVar));
    }

    public final void m(int i10, long j10, long j11) {
        C3748b.a E12 = E1();
        Q2(E12, 1011, new d0(E12, i10, j10, j11));
    }

    public final void m0(int i10, C3070t.b bVar) {
        C3748b.a C12 = C1(i10, bVar);
        Q2(C12, 1023, new f0(C12));
    }

    public final void n(long j10, int i10) {
        C3748b.a D12 = D1();
        Q2(D12, 1021, new M(D12, j10, i10));
    }

    public final void n0(int i10, C3070t.b bVar, C3068q qVar) {
        C3748b.a C12 = C1(i10, bVar);
        Q2(C12, ErrorCodes.SOCKET_TIMEOUT_EXCEPTION, new N(C12, qVar));
    }

    public final void o(S0 s02) {
        C3748b.a y12 = y1();
        Q2(y12, 12, new C3753g(y12, s02));
    }

    public final void p(y yVar) {
        C3748b.a E12 = E1();
        Q2(E12, 25, new b0(E12, yVar));
    }

    public final void q(C3717q0 q0Var, C3873i iVar) {
        C3748b.a E12 = E1();
        Q2(E12, 1017, new C3766u(E12, q0Var, iVar));
    }

    public final void r(int i10) {
        C3748b.a y12 = y1();
        Q2(y12, 8, new C(y12, i10));
    }

    public void release() {
        ((o) C3645a.h(this.f46273h)).f(new C3752f(this));
    }

    public final void s(int i10) {
        C3748b.a y12 = y1();
        Q2(y12, 6, new K(y12, i10));
    }

    public final void u(D9.a aVar) {
        C3748b.a y12 = y1();
        Q2(y12, 28, new Y(y12, aVar));
    }

    public final void v(int i10) {
        C3748b.a y12 = y1();
        Q2(y12, 4, new C3768w(y12, i10));
    }

    public final void w(int i10, long j10, long j11) {
        C3748b.a B12 = B1();
        Q2(B12, ErrorCodes.SSL_HANDSHAKE_EXCEPTION, new C3770y(B12, i10, j10, j11));
    }

    public final void x() {
        if (!this.f46274i) {
            C3748b.a y12 = y1();
            this.f46274i = true;
            Q2(y12, -1, new C3756j(y12));
        }
    }

    public void y(int i10, boolean z10) {
        C3748b.a y12 = y1();
        Q2(y12, 30, new X(y12, i10, z10));
    }

    /* access modifiers changed from: protected */
    public final C3748b.a y1() {
        return z1(this.f46269d.d());
    }

    public void z() {
    }

    public void E(int i10) {
    }

    public void t(boolean z10) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void G1(C3748b bVar, C3656l lVar) {
    }

    public void T(T0 t02, T0.c cVar) {
    }
}
