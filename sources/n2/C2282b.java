package n2;

import android.util.SparseArray;
import f2.C1962C;
import f2.C1963D;
import f2.C1964E;
import f2.C1978m;
import f2.H;
import f2.K;
import f2.L;
import f2.P;
import f2.r;
import f2.s;
import f2.w;
import f2.y;
import f2.z;
import h2.C2031b;
import i2.C2076a;
import java.io.IOException;
import java.util.List;
import m2.l;
import nb.k;
import o2.C2378y;
import t2.C2613A;
import t2.C2615C;
import t2.C2658x;

/* renamed from: n2.b  reason: case insensitive filesystem */
public interface C2282b {

    /* renamed from: n2.b$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f24511a;

        /* renamed from: b  reason: collision with root package name */
        public final H f24512b;

        /* renamed from: c  reason: collision with root package name */
        public final int f24513c;

        /* renamed from: d  reason: collision with root package name */
        public final C2615C.b f24514d;

        /* renamed from: e  reason: collision with root package name */
        public final long f24515e;

        /* renamed from: f  reason: collision with root package name */
        public final H f24516f;

        /* renamed from: g  reason: collision with root package name */
        public final int f24517g;

        /* renamed from: h  reason: collision with root package name */
        public final C2615C.b f24518h;

        /* renamed from: i  reason: collision with root package name */
        public final long f24519i;

        /* renamed from: j  reason: collision with root package name */
        public final long f24520j;

        public a(long j10, H h10, int i10, C2615C.b bVar, long j11, H h11, int i11, C2615C.b bVar2, long j12, long j13) {
            this.f24511a = j10;
            this.f24512b = h10;
            this.f24513c = i10;
            this.f24514d = bVar;
            this.f24515e = j11;
            this.f24516f = h11;
            this.f24517g = i11;
            this.f24518h = bVar2;
            this.f24519i = j12;
            this.f24520j = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f24511a == aVar.f24511a && this.f24513c == aVar.f24513c && this.f24515e == aVar.f24515e && this.f24517g == aVar.f24517g && this.f24519i == aVar.f24519i && this.f24520j == aVar.f24520j && k.a(this.f24512b, aVar.f24512b) && k.a(this.f24514d, aVar.f24514d) && k.a(this.f24516f, aVar.f24516f) && k.a(this.f24518h, aVar.f24518h)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return k.b(Long.valueOf(this.f24511a), this.f24512b, Integer.valueOf(this.f24513c), this.f24514d, Long.valueOf(this.f24515e), this.f24516f, Integer.valueOf(this.f24517g), this.f24518h, Long.valueOf(this.f24519i), Long.valueOf(this.f24520j));
        }
    }

    /* renamed from: n2.b$b  reason: collision with other inner class name */
    public static final class C0415b {

        /* renamed from: a  reason: collision with root package name */
        private final r f24521a;

        /* renamed from: b  reason: collision with root package name */
        private final SparseArray f24522b;

        public C0415b(r rVar, SparseArray sparseArray) {
            this.f24521a = rVar;
            SparseArray sparseArray2 = new SparseArray(rVar.d());
            for (int i10 = 0; i10 < rVar.d(); i10++) {
                int c10 = rVar.c(i10);
                sparseArray2.append(c10, (a) C2076a.e((a) sparseArray.get(c10)));
            }
            this.f24522b = sparseArray2;
        }

        public boolean a(int i10) {
            return this.f24521a.a(i10);
        }

        public int b(int i10) {
            return this.f24521a.c(i10);
        }

        public a c(int i10) {
            return (a) C2076a.e((a) this.f24522b.get(i10));
        }

        public int d() {
            return this.f24521a.d();
        }
    }

    void d(C1964E e10, C0415b bVar);

    void g0(a aVar, C2613A a10);

    void l0(a aVar, C1962C c10);

    void m0(a aVar, P p10);

    void p0(a aVar, int i10, long j10, long j11);

    void q0(a aVar, C1964E.e eVar, C1964E.e eVar2, int i10);

    void u(a aVar, m2.k kVar);

    void y(a aVar, C2658x xVar, C2613A a10, IOException iOException, boolean z10);

    void J(a aVar) {
    }

    void M(a aVar) {
    }

    void R(a aVar) {
    }

    void T(a aVar) {
    }

    void g(a aVar) {
    }

    void o0(a aVar) {
    }

    void q(a aVar) {
    }

    void C(a aVar, m2.k kVar) {
    }

    void E(a aVar, boolean z10) {
    }

    void F(a aVar, int i10) {
    }

    void H(a aVar, z zVar) {
    }

    void I(a aVar, String str) {
    }

    void K(a aVar, boolean z10) {
    }

    void L(a aVar, y yVar) {
    }

    void Q(a aVar, Exception exc) {
    }

    void S(a aVar, int i10) {
    }

    void U(a aVar, String str) {
    }

    void W(a aVar, m2.k kVar) {
    }

    void X(a aVar, boolean z10) {
    }

    void a(a aVar, m2.k kVar) {
    }

    void b(a aVar, C1978m mVar) {
    }

    void c(a aVar, boolean z10) {
    }

    void d0(a aVar, int i10) {
    }

    void e0(a aVar, int i10) {
    }

    void f(a aVar, Exception exc) {
    }

    void f0(a aVar, C1964E.b bVar) {
    }

    void h(a aVar, List list) {
    }

    void i(a aVar, K k10) {
    }

    void j(a aVar, L l10) {
    }

    void k(a aVar, Exception exc) {
    }

    void k0(a aVar, C1963D d10) {
    }

    void n(a aVar, C2378y.a aVar2) {
    }

    void n0(a aVar, int i10) {
    }

    void p(a aVar, long j10) {
    }

    void r0(a aVar, C2378y.a aVar2) {
    }

    void s(a aVar, C2031b bVar) {
    }

    void t(a aVar, boolean z10) {
    }

    void w(a aVar, int i10) {
    }

    void x(a aVar, Exception exc) {
    }

    void z(a aVar, C1962C c10) {
    }

    void B(a aVar, long j10, int i10) {
    }

    void D(a aVar, boolean z10, int i10) {
    }

    void G(a aVar, int i10, long j10) {
    }

    void N(a aVar, String str, long j10) {
    }

    void O(a aVar, C2658x xVar, C2613A a10) {
    }

    void P(a aVar, boolean z10, int i10) {
    }

    void b0(a aVar, C2658x xVar, C2613A a10) {
    }

    void e(a aVar, Object obj, long j10) {
    }

    void h0(a aVar, C2658x xVar, C2613A a10) {
    }

    void i0(a aVar, s sVar, l lVar) {
    }

    void j0(a aVar, s sVar, l lVar) {
    }

    void m(a aVar, int i10, boolean z10) {
    }

    void o(a aVar, int i10, int i11) {
    }

    void s0(a aVar, String str, long j10) {
    }

    void v(a aVar, w wVar, int i10) {
    }

    void V(a aVar, String str, long j10, long j11) {
    }

    void Y(a aVar, String str, long j10, long j11) {
    }

    void a0(a aVar, int i10, long j10, long j11) {
    }

    void Z(a aVar, int i10, int i11, int i12, float f10) {
    }
}
