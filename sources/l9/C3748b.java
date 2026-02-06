package l9;

import N9.C3065n;
import N9.C3068q;
import N9.C3070t;
import W9.e;
import android.util.SparseArray;
import ja.C3645a;
import ja.C3656l;
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
import n9.C3869e;
import n9.C3873i;
import nb.k;

/* renamed from: l9.b  reason: case insensitive filesystem */
public interface C3748b {

    /* renamed from: l9.b$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f46202a;

        /* renamed from: b  reason: collision with root package name */
        public final n1 f46203b;

        /* renamed from: c  reason: collision with root package name */
        public final int f46204c;

        /* renamed from: d  reason: collision with root package name */
        public final C3070t.b f46205d;

        /* renamed from: e  reason: collision with root package name */
        public final long f46206e;

        /* renamed from: f  reason: collision with root package name */
        public final n1 f46207f;

        /* renamed from: g  reason: collision with root package name */
        public final int f46208g;

        /* renamed from: h  reason: collision with root package name */
        public final C3070t.b f46209h;

        /* renamed from: i  reason: collision with root package name */
        public final long f46210i;

        /* renamed from: j  reason: collision with root package name */
        public final long f46211j;

        public a(long j10, n1 n1Var, int i10, C3070t.b bVar, long j11, n1 n1Var2, int i11, C3070t.b bVar2, long j12, long j13) {
            this.f46202a = j10;
            this.f46203b = n1Var;
            this.f46204c = i10;
            this.f46205d = bVar;
            this.f46206e = j11;
            this.f46207f = n1Var2;
            this.f46208g = i11;
            this.f46209h = bVar2;
            this.f46210i = j12;
            this.f46211j = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f46202a == aVar.f46202a && this.f46204c == aVar.f46204c && this.f46206e == aVar.f46206e && this.f46208g == aVar.f46208g && this.f46210i == aVar.f46210i && this.f46211j == aVar.f46211j && k.a(this.f46203b, aVar.f46203b) && k.a(this.f46205d, aVar.f46205d) && k.a(this.f46207f, aVar.f46207f) && k.a(this.f46209h, aVar.f46209h)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return k.b(Long.valueOf(this.f46202a), this.f46203b, Integer.valueOf(this.f46204c), this.f46205d, Long.valueOf(this.f46206e), this.f46207f, Integer.valueOf(this.f46208g), this.f46209h, Long.valueOf(this.f46210i), Long.valueOf(this.f46211j));
        }
    }

    /* renamed from: l9.b$b  reason: collision with other inner class name */
    public static final class C0694b {

        /* renamed from: a  reason: collision with root package name */
        private final C3656l f46212a;

        /* renamed from: b  reason: collision with root package name */
        private final SparseArray f46213b;

        public C0694b(C3656l lVar, SparseArray sparseArray) {
            this.f46212a = lVar;
            SparseArray sparseArray2 = new SparseArray(lVar.c());
            for (int i10 = 0; i10 < lVar.c(); i10++) {
                int b10 = lVar.b(i10);
                sparseArray2.append(b10, (a) C3645a.e((a) sparseArray.get(b10)));
            }
            this.f46213b = sparseArray2;
        }

        public boolean a(int i10) {
            return this.f46212a.a(i10);
        }

        public int b(int i10) {
            return this.f46212a.b(i10);
        }

        public a c(int i10) {
            return (a) C3645a.e((a) this.f46213b.get(i10));
        }

        public int d() {
            return this.f46212a.c();
        }
    }

    void M(a aVar, y yVar);

    void R(a aVar, P0 p02);

    void b0(a aVar, C3065n nVar, C3068q qVar, IOException iOException, boolean z10);

    void o0(a aVar, int i10, long j10, long j11);

    void r0(a aVar, C3869e eVar);

    void s0(a aVar, T0.e eVar, T0.e eVar2, int i10);

    void u(T0 t02, C0694b bVar);

    void v0(a aVar, C3068q qVar);

    void G(a aVar) {
    }

    void S(a aVar) {
    }

    void X(a aVar) {
    }

    void Z(a aVar) {
    }

    void b(a aVar) {
    }

    void h(a aVar) {
    }

    void i(a aVar) {
    }

    void j0(a aVar) {
    }

    void A(a aVar, Exception exc) {
    }

    void B(a aVar, boolean z10) {
    }

    void D(a aVar, Exception exc) {
    }

    void H(a aVar, int i10) {
    }

    void I(a aVar, float f10) {
    }

    void K(a aVar, String str) {
    }

    void L(a aVar, Exception exc) {
    }

    void N(a aVar, int i10) {
    }

    void P(a aVar, String str) {
    }

    void V(a aVar, D9.a aVar2) {
    }

    void W(a aVar, C3869e eVar) {
    }

    void Y(a aVar, int i10) {
    }

    void a(a aVar, long j10) {
    }

    void a0(a aVar, T0.b bVar) {
    }

    void c(a aVar, P0 p02) {
    }

    void d0(a aVar, D0 d02) {
    }

    void e(a aVar, C3869e eVar) {
    }

    void e0(a aVar, C3717q0 q0Var) {
    }

    void f(a aVar, Exception exc) {
    }

    void g0(a aVar, C3717q0 q0Var) {
    }

    void h0(a aVar, int i10) {
    }

    void j(a aVar, List list) {
    }

    void k(a aVar, boolean z10) {
    }

    void n(a aVar, boolean z10) {
    }

    void n0(a aVar, S0 s02) {
    }

    void p(a aVar, C3068q qVar) {
    }

    void q(a aVar, e eVar) {
    }

    void q0(a aVar, int i10) {
    }

    void r(a aVar, C3869e eVar) {
    }

    void t(a aVar, C3714p pVar) {
    }

    void u0(a aVar, s1 s1Var) {
    }

    void y(a aVar, int i10) {
    }

    void z(a aVar, boolean z10) {
    }

    void C(a aVar, C3717q0 q0Var, C3873i iVar) {
    }

    void E(a aVar, int i10, C3869e eVar) {
    }

    void Q(a aVar, Object obj, long j10) {
    }

    void T(a aVar, int i10, boolean z10) {
    }

    void f0(a aVar, C3065n nVar, C3068q qVar) {
    }

    void g(a aVar, C3717q0 q0Var, C3873i iVar) {
    }

    void i0(a aVar, boolean z10, int i10) {
    }

    void l(a aVar, String str, long j10) {
    }

    void l0(a aVar, C3065n nVar, C3068q qVar) {
    }

    void m(a aVar, long j10, int i10) {
    }

    void m0(a aVar, int i10, C3869e eVar) {
    }

    void o(a aVar, String str, long j10) {
    }

    void p0(a aVar, int i10, int i11) {
    }

    void s(a aVar, boolean z10, int i10) {
    }

    void t0(a aVar, C3732y0 y0Var, int i10) {
    }

    void v(a aVar, int i10, long j10) {
    }

    void x(a aVar, int i10, C3717q0 q0Var) {
    }

    void x0(a aVar, C3065n nVar, C3068q qVar) {
    }

    void J(a aVar, int i10, String str, long j10) {
    }

    void O(a aVar, String str, long j10, long j11) {
    }

    void c0(a aVar, int i10, long j10, long j11) {
    }

    void w0(a aVar, String str, long j10, long j11) {
    }

    void d(a aVar, int i10, int i11, int i12, float f10) {
    }
}
