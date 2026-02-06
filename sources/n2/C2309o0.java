package n2;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.exoplayer.C1810h;
import com.adjust.sdk.network.ErrorCodes;
import com.google.common.collect.B;
import com.google.common.collect.C4770v;
import com.google.common.collect.C4771w;
import f2.C1962C;
import f2.C1963D;
import f2.C1964E;
import f2.C1978m;
import f2.H;
import f2.K;
import f2.P;
import f2.r;
import f2.s;
import f2.w;
import f2.y;
import f2.z;
import h2.C2031b;
import i2.C2076a;
import i2.C2078c;
import i2.C2087l;
import i2.L;
import i2.o;
import java.io.IOException;
import java.util.List;
import m2.l;
import n2.C2282b;
import nb.k;
import o2.C2378y;
import t2.C2613A;
import t2.C2615C;
import t2.C2658x;

/* renamed from: n2.o0  reason: case insensitive filesystem */
public class C2309o0 implements C2280a {

    /* renamed from: a  reason: collision with root package name */
    private final C2078c f24576a;

    /* renamed from: b  reason: collision with root package name */
    private final H.b f24577b;

    /* renamed from: c  reason: collision with root package name */
    private final H.c f24578c = new H.c();

    /* renamed from: d  reason: collision with root package name */
    private final a f24579d;

    /* renamed from: e  reason: collision with root package name */
    private final SparseArray f24580e;

    /* renamed from: f  reason: collision with root package name */
    private o f24581f;

    /* renamed from: g  reason: collision with root package name */
    private C1964E f24582g;

    /* renamed from: h  reason: collision with root package name */
    private C2087l f24583h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f24584i;

    /* renamed from: n2.o0$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final H.b f24585a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public C4770v f24586b = C4770v.E();

        /* renamed from: c  reason: collision with root package name */
        private C4771w f24587c = C4771w.n();

        /* renamed from: d  reason: collision with root package name */
        private C2615C.b f24588d;

        /* renamed from: e  reason: collision with root package name */
        private C2615C.b f24589e;

        /* renamed from: f  reason: collision with root package name */
        private C2615C.b f24590f;

        public a(H.b bVar) {
            this.f24585a = bVar;
        }

        private void b(C4771w.a aVar, C2615C.b bVar, H h10) {
            if (bVar != null) {
                if (h10.b(bVar.f25960a) != -1) {
                    aVar.f(bVar, h10);
                    return;
                }
                H h11 = (H) this.f24587c.get(bVar);
                if (h11 != null) {
                    aVar.f(bVar, h11);
                }
            }
        }

        private static C2615C.b c(C1964E e10, C4770v vVar, C2615C.b bVar, H.b bVar2) {
            Object obj;
            int i10;
            H s10 = e10.s();
            int v10 = e10.v();
            if (s10.q()) {
                obj = null;
            } else {
                obj = s10.m(v10);
            }
            if (e10.g() || s10.q()) {
                i10 = -1;
            } else {
                i10 = s10.f(v10, bVar2).d(L.L0(e10.getCurrentPosition()) - bVar2.n());
            }
            for (int i11 = 0; i11 < vVar.size(); i11++) {
                C2615C.b bVar3 = (C2615C.b) vVar.get(i11);
                if (i(bVar3, obj, e10.g(), e10.p(), e10.x(), i10)) {
                    return bVar3;
                }
            }
            if (vVar.isEmpty() && bVar != null) {
                if (i(bVar, obj, e10.g(), e10.p(), e10.x(), i10)) {
                    return bVar;
                }
            }
            return null;
        }

        private static boolean i(C2615C.b bVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (!bVar.f25960a.equals(obj)) {
                return false;
            }
            if ((z10 && bVar.f25961b == i10 && bVar.f25962c == i11) || (!z10 && bVar.f25961b == -1 && bVar.f25964e == i12)) {
                return true;
            }
            return false;
        }

        private void m(H h10) {
            C4771w.a a10 = C4771w.a();
            if (this.f24586b.isEmpty()) {
                b(a10, this.f24589e, h10);
                if (!k.a(this.f24590f, this.f24589e)) {
                    b(a10, this.f24590f, h10);
                }
                if (!k.a(this.f24588d, this.f24589e) && !k.a(this.f24588d, this.f24590f)) {
                    b(a10, this.f24588d, h10);
                }
            } else {
                for (int i10 = 0; i10 < this.f24586b.size(); i10++) {
                    b(a10, (C2615C.b) this.f24586b.get(i10), h10);
                }
                if (!this.f24586b.contains(this.f24588d)) {
                    b(a10, this.f24588d, h10);
                }
            }
            this.f24587c = a10.c();
        }

        public C2615C.b d() {
            return this.f24588d;
        }

        public C2615C.b e() {
            if (this.f24586b.isEmpty()) {
                return null;
            }
            return (C2615C.b) B.d(this.f24586b);
        }

        public H f(C2615C.b bVar) {
            return (H) this.f24587c.get(bVar);
        }

        public C2615C.b g() {
            return this.f24589e;
        }

        public C2615C.b h() {
            return this.f24590f;
        }

        public void j(C1964E e10) {
            this.f24588d = c(e10, this.f24586b, this.f24589e, this.f24585a);
        }

        public void k(List list, C2615C.b bVar, C1964E e10) {
            this.f24586b = C4770v.z(list);
            if (!list.isEmpty()) {
                this.f24589e = (C2615C.b) list.get(0);
                this.f24590f = (C2615C.b) C2076a.e(bVar);
            }
            if (this.f24588d == null) {
                this.f24588d = c(e10, this.f24586b, this.f24589e, this.f24585a);
            }
            m(e10.s());
        }

        public void l(C1964E e10) {
            this.f24588d = c(e10, this.f24586b, this.f24589e, this.f24585a);
            m(e10.s());
        }
    }

    public C2309o0(C2078c cVar) {
        this.f24576a = (C2078c) C2076a.e(cVar);
        this.f24581f = new o(L.R(), cVar, new C2317t());
        H.b bVar = new H.b();
        this.f24577b = bVar;
        this.f24579d = new a(bVar);
        this.f24580e = new SparseArray();
    }

    private C2282b.a C1(C2615C.b bVar) {
        H h10;
        C2076a.e(this.f24582g);
        if (bVar == null) {
            h10 = null;
        } else {
            h10 = this.f24579d.f(bVar);
        }
        if (bVar != null && h10 != null) {
            return B1(h10, h10.h(bVar.f25960a, this.f24577b).f19746c, bVar);
        }
        int B10 = this.f24582g.B();
        H s10 = this.f24582g.s();
        if (B10 >= s10.p()) {
            s10 = H.f19735a;
        }
        return B1(s10, B10, (C2615C.b) null);
    }

    private C2282b.a D1() {
        return C1(this.f24579d.e());
    }

    private C2282b.a E1(int i10, C2615C.b bVar) {
        C2076a.e(this.f24582g);
        if (bVar == null) {
            H s10 = this.f24582g.s();
            if (i10 >= s10.p()) {
                s10 = H.f19735a;
            }
            return B1(s10, i10, (C2615C.b) null);
        } else if (this.f24579d.f(bVar) != null) {
            return C1(bVar);
        } else {
            return B1(H.f19735a, i10, bVar);
        }
    }

    private C2282b.a F1() {
        return C1(this.f24579d.g());
    }

    private C2282b.a G1() {
        return C1(this.f24579d.h());
    }

    private C2282b.a H1(C1962C c10) {
        C2615C.b bVar;
        if (!(c10 instanceof C1810h) || (bVar = ((C1810h) c10).f17708o) == null) {
            return A1();
        }
        return C1(bVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void J2(C2282b.a aVar, String str, long j10, long j11, C2282b bVar) {
        bVar.s0(aVar, str, j10);
        bVar.Y(aVar, str, j11, j10);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void L1(C2282b.a aVar, String str, long j10, long j11, C2282b bVar) {
        bVar.N(aVar, str, j10);
        bVar.V(aVar, str, j11, j10);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void P2(C2282b.a aVar, P p10, C2282b bVar) {
        bVar.m0(aVar, p10);
        bVar.Z(aVar, p10.f19911a, p10.f19912b, p10.f19913c, p10.f19914d);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void R2(C1964E e10, C2282b bVar, r rVar) {
        bVar.d(e10, new C2282b.C0415b(rVar, this.f24580e));
    }

    /* access modifiers changed from: private */
    public void S2() {
        C2282b.a A12 = A1();
        T2(A12, 1028, new P(A12));
        this.f24581f.j();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void f2(C2282b.a aVar, int i10, C2282b bVar) {
        bVar.J(aVar);
        bVar.w(aVar, i10);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void j2(C2282b.a aVar, boolean z10, C2282b bVar) {
        bVar.E(aVar, z10);
        bVar.K(aVar, z10);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void z2(C2282b.a aVar, int i10, C1964E.e eVar, C1964E.e eVar2, C2282b bVar) {
        bVar.n0(aVar, i10);
        bVar.q0(aVar, eVar, eVar2, i10);
    }

    public final void A(s sVar, l lVar) {
        C2282b.a G12 = G1();
        T2(G12, 1009, new C2267C(G12, sVar, lVar));
    }

    /* access modifiers changed from: protected */
    public final C2282b.a A1() {
        return C1(this.f24579d.d());
    }

    public final void B(C1963D d10) {
        C2282b.a A12 = A1();
        T2(A12, 12, new C2284c(A12, d10));
    }

    /* access modifiers changed from: protected */
    public final C2282b.a B1(H h10, int i10, C2615C.b bVar) {
        C2615C.b bVar2;
        boolean z10;
        H h11 = h10;
        int i11 = i10;
        if (h10.q()) {
            bVar2 = null;
        } else {
            bVar2 = bVar;
        }
        long a10 = this.f24576a.a();
        if (!h11.equals(this.f24582g.s()) || i11 != this.f24582g.B()) {
            z10 = false;
        } else {
            z10 = true;
        }
        long j10 = 0;
        if (bVar2 == null || !bVar2.b()) {
            if (z10) {
                j10 = this.f24582g.z();
            } else if (!h10.q()) {
                j10 = h11.n(i11, this.f24578c).b();
            }
        } else if (z10 && this.f24582g.p() == bVar2.f25961b && this.f24582g.x() == bVar2.f25962c) {
            j10 = this.f24582g.getCurrentPosition();
        }
        return new C2282b.a(a10, h10, i10, bVar2, j10, this.f24582g.s(), this.f24582g.B(), this.f24579d.d(), this.f24582g.getCurrentPosition(), this.f24582g.h());
    }

    public final void C(int i10, int i11) {
        C2282b.a G12 = G1();
        T2(G12, 24, new C2277M(G12, i10, i11));
    }

    public final void D(m2.k kVar) {
        C2282b.a G12 = G1();
        T2(G12, 1015, new C2269E(G12, kVar));
    }

    public final void F(boolean z10) {
        C2282b.a A12 = A1();
        T2(A12, 3, new C2301k0(A12, z10));
    }

    public final void G(m2.k kVar) {
        C2282b.a F12 = F1();
        T2(F12, 1013, new C2323w(F12, kVar));
    }

    public final void H(boolean z10, int i10) {
        C2282b.a A12 = A1();
        T2(A12, -1, new C2292g(A12, z10, i10));
    }

    public final void I(z zVar) {
        C2282b.a A12 = A1();
        T2(A12, 28, new C2294h(A12, zVar));
    }

    public final void J(m2.k kVar) {
        C2282b.a G12 = G1();
        T2(G12, ErrorCodes.IO_EXCEPTION, new C2293g0(G12, kVar));
    }

    public void K(C2031b bVar) {
        C2282b.a A12 = A1();
        T2(A12, 27, new C2274J(A12, bVar));
    }

    public final void L(boolean z10, int i10) {
        C2282b.a A12 = A1();
        T2(A12, 5, new r(A12, z10, i10));
    }

    public final void M(m2.k kVar) {
        C2282b.a F12 = F1();
        T2(F12, 1020, new C2327y(F12, kVar));
    }

    public void N(boolean z10) {
        C2282b.a A12 = A1();
        T2(A12, 7, new C2298j(A12, z10));
    }

    public final void O(int i10, C2615C.b bVar) {
        C2282b.a E12 = E1(i10, bVar);
        T2(E12, 1023, new C2299j0(E12));
    }

    public final void P(C1962C c10) {
        C2282b.a H12 = H1(c10);
        T2(H12, 10, new C2321v(H12, c10));
    }

    public final void Q(boolean z10) {
        C2282b.a A12 = A1();
        T2(A12, 9, new C2276L(A12, z10));
    }

    public void R(y yVar) {
        C2282b.a A12 = A1();
        T2(A12, 14, new V(A12, yVar));
    }

    public final void S(List list, C2615C.b bVar) {
        this.f24579d.k(list, bVar, (C1964E) C2076a.e(this.f24582g));
    }

    public final void T(int i10, C2615C.b bVar, Exception exc) {
        C2282b.a E12 = E1(i10, bVar);
        T2(E12, 1024, new C2285c0(E12, exc));
    }

    /* access modifiers changed from: protected */
    public final void T2(C2282b.a aVar, int i10, o.a aVar2) {
        this.f24580e.put(i10, aVar);
        this.f24581f.l(i10, aVar2);
    }

    public final void U(C1964E.e eVar, C1964E.e eVar2, int i10) {
        if (i10 == 1) {
            this.f24584i = false;
        }
        this.f24579d.j((C1964E) C2076a.e(this.f24582g));
        C2282b.a A12 = A1();
        T2(A12, 11, new C2268D(A12, i10, eVar, eVar2));
    }

    public final void V(int i10, C2615C.b bVar, int i11) {
        C2282b.a E12 = E1(i10, bVar);
        T2(E12, 1022, new C2283b0(E12, i11));
    }

    public final void W(w wVar, int i10) {
        C2282b.a A12 = A1();
        T2(A12, 1, new C2286d(A12, wVar, i10));
    }

    public final void X(int i10, C2615C.b bVar, C2658x xVar, C2613A a10) {
        C2282b.a E12 = E1(i10, bVar);
        T2(E12, ErrorCodes.SERVER_RETRY_IN, new W(E12, xVar, a10));
    }

    public void Y(f2.L l10) {
        C2282b.a A12 = A1();
        T2(A12, 2, new C2306n(A12, l10));
    }

    public final void Z(int i10, C2615C.b bVar) {
        C2282b.a E12 = E1(i10, bVar);
        T2(E12, 1026, new C2295h0(E12));
    }

    public final void a(boolean z10) {
        C2282b.a G12 = G1();
        T2(G12, 23, new C2281a0(G12, z10));
    }

    public final void b(Exception exc) {
        C2282b.a G12 = G1();
        T2(G12, 1014, new C2275K(G12, exc));
    }

    public final void b0(int i10, C2615C.b bVar, C2658x xVar, C2613A a10) {
        C2282b.a E12 = E1(i10, bVar);
        T2(E12, 1000, new Q(E12, xVar, a10));
    }

    public final void c(String str) {
        C2282b.a G12 = G1();
        T2(G12, 1019, new C2304m(G12, str));
    }

    public void c0(C1978m mVar) {
        C2282b.a A12 = A1();
        T2(A12, 29, new C2329z(A12, mVar));
    }

    public final void d(String str, long j10, long j11) {
        C2282b.a G12 = G1();
        T2(G12, 1016, new C2273I(G12, str, j11, j10));
    }

    public void d0(C1962C c10) {
        C2282b.a H12 = H1(c10);
        T2(H12, 10, new C2310p(H12, c10));
    }

    public final void e(String str) {
        C2282b.a G12 = G1();
        T2(G12, 1012, new C2303l0(G12, str));
    }

    public final void e0(H h10, int i10) {
        this.f24579d.l((C1964E) C2076a.e(this.f24582g));
        C2282b.a A12 = A1();
        T2(A12, 0, new C2307n0(A12, i10));
    }

    public final void f(String str, long j10, long j11) {
        C2282b.a G12 = G1();
        T2(G12, 1008, new C2300k(G12, str, j11, j10));
    }

    public void f0(K k10) {
        C2282b.a A12 = A1();
        T2(A12, 19, new C2279O(A12, k10));
    }

    public void g(List list) {
        C2282b.a A12 = A1();
        T2(A12, 27, new C2315s(A12, list));
    }

    public final void g0(int i10, C2615C.b bVar, C2658x xVar, C2613A a10, IOException iOException, boolean z10) {
        C2282b.a E12 = E1(i10, bVar);
        T2(E12, ErrorCodes.MALFORMED_URL_EXCEPTION, new T(E12, xVar, a10, iOException, z10));
    }

    public final void h(long j10) {
        C2282b.a G12 = G1();
        T2(G12, 1010, new C2296i(G12, j10));
    }

    public final void i(Exception exc) {
        C2282b.a G12 = G1();
        T2(G12, 1030, new C2288e(G12, exc));
    }

    public final void i0(int i10, C2615C.b bVar, C2658x xVar, C2613A a10) {
        C2282b.a E12 = E1(i10, bVar);
        T2(E12, ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION, new U(E12, xVar, a10));
    }

    public final void j(int i10, long j10) {
        C2282b.a F12 = F1();
        T2(F12, 1018, new C2308o(F12, i10, j10));
    }

    public final void j0(int i10, C2615C.b bVar, C2613A a10) {
        C2282b.a E12 = E1(i10, bVar);
        T2(E12, ErrorCodes.PROTOCOL_EXCEPTION, new C2278N(E12, a10));
    }

    public final void k(Object obj, long j10) {
        C2282b.a G12 = G1();
        T2(G12, 26, new Y(G12, obj, j10));
    }

    public void k0(C1964E e10, Looper looper) {
        boolean z10;
        if (this.f24582g == null || this.f24579d.f24586b.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        this.f24582g = (C1964E) C2076a.e(e10);
        this.f24583h = this.f24576a.d(looper, (Handler.Callback) null);
        this.f24581f = this.f24581f.e(looper, new C2290f(this, e10));
    }

    public final void l(Exception exc) {
        C2282b.a G12 = G1();
        T2(G12, 1029, new C2272H(G12, exc));
    }

    public final void l0(int i10, C2615C.b bVar) {
        C2282b.a E12 = E1(i10, bVar);
        T2(E12, 1025, new C2297i0(E12));
    }

    public final void m(int i10, long j10, long j11) {
        C2282b.a G12 = G1();
        T2(G12, 1011, new S(G12, i10, j10, j11));
    }

    public final void m0(int i10, C2615C.b bVar) {
        C2282b.a E12 = E1(i10, bVar);
        T2(E12, 1027, new C2291f0(E12));
    }

    public final void n(long j10, int i10) {
        C2282b.a F12 = F1();
        T2(F12, 1021, new C2319u(F12, j10, i10));
    }

    public void n0(C1964E.b bVar) {
        C2282b.a A12 = A1();
        T2(A12, 13, new C2305m0(A12, bVar));
    }

    public void o(C2378y.a aVar) {
        C2282b.a G12 = G1();
        T2(G12, 1032, new C2289e0(G12, aVar));
    }

    public void o0(C2282b bVar) {
        C2076a.e(bVar);
        this.f24581f.c(bVar);
    }

    public final void p(P p10) {
        C2282b.a G12 = G1();
        T2(G12, 25, new X(G12, p10));
    }

    public void q(C2378y.a aVar) {
        C2282b.a G12 = G1();
        T2(G12, 1031, new C2287d0(G12, aVar));
    }

    public final void r(int i10) {
        C2282b.a A12 = A1();
        T2(A12, 8, new C2271G(A12, i10));
    }

    public void release() {
        ((C2087l) C2076a.i(this.f24583h)).f(new C2270F(this));
    }

    public final void s(int i10) {
        C2282b.a A12 = A1();
        T2(A12, 6, new C2302l(A12, i10));
    }

    public final void u(s sVar, l lVar) {
        C2282b.a G12 = G1();
        T2(G12, 1017, new C2265A(G12, sVar, lVar));
    }

    public final void v(int i10) {
        C2282b.a A12 = A1();
        T2(A12, 4, new C2325x(A12, i10));
    }

    public final void w(int i10, long j10, long j11) {
        C2282b.a D12 = D1();
        T2(D12, ErrorCodes.SSL_HANDSHAKE_EXCEPTION, new Z(D12, i10, j10, j11));
    }

    public final void x() {
        if (!this.f24584i) {
            C2282b.a A12 = A1();
            this.f24584i = true;
            T2(A12, -1, new C2266B(A12));
        }
    }

    public void y(int i10, boolean z10) {
        C2282b.a A12 = A1();
        T2(A12, 30, new C2312q(A12, i10, z10));
    }

    public void z() {
    }

    public void E(int i10) {
    }

    public void t(boolean z10) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void I1(C2282b bVar, r rVar) {
    }

    public void h0(C1964E e10, C1964E.c cVar) {
    }
}
