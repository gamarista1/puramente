package t0;

import android.graphics.Shader;
import c1.d;
import c1.t;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import q0.C2415a;
import q0.C2421g;
import q0.C2427m;
import r0.C1;
import r0.C2468U;
import r0.C2490f0;
import r0.C2514n0;
import r0.C2520p0;
import r0.C2544x0;
import r0.C2547y0;
import r0.H1;
import r0.Q1;
import r0.R1;
import r0.S1;
import r0.T1;
import r0.i2;
import r0.j2;
import u0.C2673c;

/* renamed from: t0.a  reason: case insensitive filesystem */
public final class C2600a implements C2605f {

    /* renamed from: a  reason: collision with root package name */
    private final C0435a f25927a = new C0435a((d) null, (t) null, (C2520p0) null, 0, 15, (DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private final C2603d f25928b = new b(this);

    /* renamed from: c  reason: collision with root package name */
    private Q1 f25929c;

    /* renamed from: d  reason: collision with root package name */
    private Q1 f25930d;

    /* renamed from: t0.a$a  reason: collision with other inner class name */
    public static final class C0435a {

        /* renamed from: a  reason: collision with root package name */
        private d f25931a;

        /* renamed from: b  reason: collision with root package name */
        private t f25932b;

        /* renamed from: c  reason: collision with root package name */
        private C2520p0 f25933c;

        /* renamed from: d  reason: collision with root package name */
        private long f25934d;

        public /* synthetic */ C0435a(d dVar, t tVar, C2520p0 p0Var, long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(dVar, tVar, p0Var, j10);
        }

        public final d a() {
            return this.f25931a;
        }

        public final t b() {
            return this.f25932b;
        }

        public final C2520p0 c() {
            return this.f25933c;
        }

        public final long d() {
            return this.f25934d;
        }

        public final C2520p0 e() {
            return this.f25933c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0435a)) {
                return false;
            }
            C0435a aVar = (C0435a) obj;
            if (C6496s.c(this.f25931a, aVar.f25931a) && this.f25932b == aVar.f25932b && C6496s.c(this.f25933c, aVar.f25933c) && C2427m.h(this.f25934d, aVar.f25934d)) {
                return true;
            }
            return false;
        }

        public final d f() {
            return this.f25931a;
        }

        public final t g() {
            return this.f25932b;
        }

        public final long h() {
            return this.f25934d;
        }

        public int hashCode() {
            return (((((this.f25931a.hashCode() * 31) + this.f25932b.hashCode()) * 31) + this.f25933c.hashCode()) * 31) + C2427m.l(this.f25934d);
        }

        public final void i(C2520p0 p0Var) {
            this.f25933c = p0Var;
        }

        public final void j(d dVar) {
            this.f25931a = dVar;
        }

        public final void k(t tVar) {
            this.f25932b = tVar;
        }

        public final void l(long j10) {
            this.f25934d = j10;
        }

        public String toString() {
            return "DrawParams(density=" + this.f25931a + ", layoutDirection=" + this.f25932b + ", canvas=" + this.f25933c + ", size=" + C2427m.n(this.f25934d) + ')';
        }

        private C0435a(d dVar, t tVar, C2520p0 p0Var, long j10) {
            this.f25931a = dVar;
            this.f25932b = tVar;
            this.f25933c = p0Var;
            this.f25934d = j10;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C0435a(d dVar, t tVar, C2520p0 p0Var, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? C2604e.a() : dVar, (i10 & 2) != 0 ? t.Ltr : tVar, (i10 & 4) != 0 ? new C2608i() : p0Var, (i10 & 8) != 0 ? C2427m.f25341b.b() : j10, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: t0.a$b */
    public static final class b implements C2603d {

        /* renamed from: a  reason: collision with root package name */
        private final C2607h f25935a = C2601b.b(this);

        /* renamed from: b  reason: collision with root package name */
        private C2673c f25936b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2600a f25937c;

        b(C2600a aVar) {
            this.f25937c = aVar;
        }

        public void a(t tVar) {
            this.f25937c.D().k(tVar);
        }

        public void b(d dVar) {
            this.f25937c.D().j(dVar);
        }

        public void c(C2520p0 p0Var) {
            this.f25937c.D().i(p0Var);
        }

        public long d() {
            return this.f25937c.D().h();
        }

        public C2607h e() {
            return this.f25935a;
        }

        public C2520p0 f() {
            return this.f25937c.D().e();
        }

        public void g(C2673c cVar) {
            this.f25936b = cVar;
        }

        public d getDensity() {
            return this.f25937c.D().f();
        }

        public t getLayoutDirection() {
            return this.f25937c.D().g();
        }

        public void h(long j10) {
            this.f25937c.D().l(j10);
        }

        public C2673c i() {
            return this.f25936b;
        }
    }

    static /* synthetic */ Q1 B(C2600a aVar, C2514n0 n0Var, float f10, float f11, int i10, int i11, T1 t12, float f12, C2547y0 y0Var, int i12, int i13, int i14, Object obj) {
        int i15;
        if ((i14 & 512) != 0) {
            i15 = C2605f.f25940d0.b();
        } else {
            i15 = i13;
        }
        return aVar.x(n0Var, f10, f11, i10, i11, t12, f12, y0Var, i12, i15);
    }

    private final long G(long j10, float f10) {
        if (f10 == 1.0f) {
            return j10;
        }
        return C2544x0.o(j10, C2544x0.r(j10) * f10, 0.0f, 0.0f, 0.0f, 14, (Object) null);
    }

    private final Q1 L() {
        Q1 q12 = this.f25929c;
        if (q12 != null) {
            return q12;
        }
        Q1 a10 = C2468U.a();
        a10.v(R1.f25451a.a());
        this.f25929c = a10;
        return a10;
    }

    private final Q1 O() {
        Q1 q12 = this.f25930d;
        if (q12 != null) {
            return q12;
        }
        Q1 a10 = C2468U.a();
        a10.v(R1.f25451a.b());
        this.f25930d = a10;
        return a10;
    }

    private final Q1 T(C2606g gVar) {
        if (C6496s.c(gVar, C2609j.f25944a)) {
            return L();
        }
        if (gVar instanceof C2610k) {
            Q1 O10 = O();
            C2610k kVar = (C2610k) gVar;
            if (O10.x() != kVar.f()) {
                O10.w(kVar.f());
            }
            if (!i2.e(O10.k(), kVar.b())) {
                O10.g(kVar.b());
            }
            if (O10.p() != kVar.d()) {
                O10.t(kVar.d());
            }
            if (!j2.e(O10.o(), kVar.c())) {
                O10.l(kVar.c());
            }
            O10.n();
            kVar.e();
            if (!C6496s.c((Object) null, (Object) null)) {
                kVar.e();
                O10.j((T1) null);
            }
            return O10;
        }
        throw new C6535s();
    }

    private final Q1 a(long j10, C2606g gVar, float f10, C2547y0 y0Var, int i10, int i11) {
        Q1 T10 = T(gVar);
        long G10 = G(j10, f10);
        if (!C2544x0.q(T10.d(), G10)) {
            T10.m(G10);
        }
        if (T10.s() != null) {
            T10.r((Shader) null);
        }
        if (!C6496s.c(T10.b(), y0Var)) {
            T10.f(y0Var);
        }
        if (!C2490f0.E(T10.e(), i10)) {
            T10.h(i10);
        }
        if (!C1.d(T10.u(), i11)) {
            T10.i(i11);
        }
        return T10;
    }

    static /* synthetic */ Q1 e(C2600a aVar, long j10, C2606g gVar, float f10, C2547y0 y0Var, int i10, int i11, int i12, Object obj) {
        int i13;
        if ((i12 & 32) != 0) {
            i13 = C2605f.f25940d0.b();
        } else {
            i13 = i11;
        }
        return aVar.a(j10, gVar, f10, y0Var, i10, i13);
    }

    private final Q1 o(C2514n0 n0Var, C2606g gVar, float f10, C2547y0 y0Var, int i10, int i11) {
        Q1 T10 = T(gVar);
        if (n0Var != null) {
            n0Var.a(d(), T10, f10);
        } else {
            if (T10.s() != null) {
                T10.r((Shader) null);
            }
            long d10 = T10.d();
            C2544x0.a aVar = C2544x0.f25560b;
            if (!C2544x0.q(d10, aVar.a())) {
                T10.m(aVar.a());
            }
            if (T10.a() != f10) {
                T10.c(f10);
            }
        }
        if (!C6496s.c(T10.b(), y0Var)) {
            T10.f(y0Var);
        }
        if (!C2490f0.E(T10.e(), i10)) {
            T10.h(i10);
        }
        if (!C1.d(T10.u(), i11)) {
            T10.i(i11);
        }
        return T10;
    }

    static /* synthetic */ Q1 p(C2600a aVar, C2514n0 n0Var, C2606g gVar, float f10, C2547y0 y0Var, int i10, int i11, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            i11 = C2605f.f25940d0.b();
        }
        return aVar.o(n0Var, gVar, f10, y0Var, i10, i11);
    }

    private final Q1 s(long j10, float f10, float f11, int i10, int i11, T1 t12, float f12, C2547y0 y0Var, int i12, int i13) {
        Q1 O10 = O();
        long G10 = G(j10, f12);
        if (!C2544x0.q(O10.d(), G10)) {
            O10.m(G10);
        }
        if (O10.s() != null) {
            O10.r((Shader) null);
        }
        if (!C6496s.c(O10.b(), y0Var)) {
            O10.f(y0Var);
        }
        if (!C2490f0.E(O10.e(), i12)) {
            O10.h(i12);
        }
        if (O10.x() != f10) {
            O10.w(f10);
        }
        if (O10.p() != f11) {
            O10.t(f11);
        }
        if (!i2.e(O10.k(), i10)) {
            O10.g(i10);
        }
        if (!j2.e(O10.o(), i11)) {
            O10.l(i11);
        }
        O10.n();
        if (!C6496s.c((Object) null, t12)) {
            O10.j(t12);
        }
        if (!C1.d(O10.u(), i13)) {
            O10.i(i13);
        }
        return O10;
    }

    static /* synthetic */ Q1 u(C2600a aVar, long j10, float f10, float f11, int i10, int i11, T1 t12, float f12, C2547y0 y0Var, int i12, int i13, int i14, Object obj) {
        int i15;
        if ((i14 & 512) != 0) {
            i15 = C2605f.f25940d0.b();
        } else {
            i15 = i13;
        }
        return aVar.s(j10, f10, f11, i10, i11, t12, f12, y0Var, i12, i15);
    }

    private final Q1 x(C2514n0 n0Var, float f10, float f11, int i10, int i11, T1 t12, float f12, C2547y0 y0Var, int i12, int i13) {
        Q1 O10 = O();
        if (n0Var != null) {
            n0Var.a(d(), O10, f12);
        } else if (O10.a() != f12) {
            O10.c(f12);
        }
        if (!C6496s.c(O10.b(), y0Var)) {
            O10.f(y0Var);
        }
        if (!C2490f0.E(O10.e(), i12)) {
            O10.h(i12);
        }
        if (O10.x() != f10) {
            O10.w(f10);
        }
        if (O10.p() != f11) {
            O10.t(f11);
        }
        if (!i2.e(O10.k(), i10)) {
            O10.g(i10);
        }
        if (!j2.e(O10.o(), i11)) {
            O10.l(i11);
        }
        O10.n();
        if (!C6496s.c((Object) null, t12)) {
            O10.j(t12);
        }
        if (!C1.d(O10.u(), i13)) {
            O10.i(i13);
        }
        return O10;
    }

    public final C0435a D() {
        return this.f25927a;
    }

    public void G1(long j10, long j11, long j12, float f10, int i10, T1 t12, float f11, C2547y0 y0Var, int i11) {
        this.f25927a.e().j(j11, j12, u(this, j10, f10, 4.0f, i10, j2.f25533a.b(), t12, f11, y0Var, i11, 0, 512, (Object) null));
    }

    public void I0(C2514n0 n0Var, long j10, long j11, float f10, int i10, T1 t12, float f11, C2547y0 y0Var, int i11) {
        this.f25927a.e().j(j10, j11, B(this, n0Var, f10, 4.0f, i10, j2.f25533a.b(), t12, f11, y0Var, i11, 0, 512, (Object) null));
    }

    public void K(C2514n0 n0Var, long j10, long j11, long j12, float f10, C2606g gVar, C2547y0 y0Var, int i10) {
        this.f25927a.e().i(C2421g.m(j10), C2421g.n(j10), C2421g.m(j10) + C2427m.k(j11), C2421g.n(j10) + C2427m.i(j11), C2415a.d(j12), C2415a.e(j12), p(this, n0Var, gVar, f10, y0Var, i10, 0, 32, (Object) null));
    }

    public void X(long j10, long j11, long j12, long j13, C2606g gVar, float f10, C2547y0 y0Var, int i10) {
        this.f25927a.e().i(C2421g.m(j11), C2421g.n(j11), C2421g.m(j11) + C2427m.k(j12), C2421g.n(j11) + C2427m.i(j12), C2415a.d(j13), C2415a.e(j13), e(this, j10, gVar, f10, y0Var, i10, 0, 32, (Object) null));
    }

    public void d0(long j10, float f10, long j11, float f11, C2606g gVar, C2547y0 y0Var, int i10) {
        float f12 = f10;
        this.f25927a.e().m(j11, f10, e(this, j10, gVar, f11, y0Var, i10, 0, 32, (Object) null));
    }

    public void g1(S1 s12, long j10, float f10, C2606g gVar, C2547y0 y0Var, int i10) {
        S1 s13 = s12;
        this.f25927a.e().k(s12, e(this, j10, gVar, f10, y0Var, i10, 0, 32, (Object) null));
    }

    public float getDensity() {
        return this.f25927a.f().getDensity();
    }

    public t getLayoutDirection() {
        return this.f25927a.g();
    }

    public void h0(C2514n0 n0Var, long j10, long j11, float f10, C2606g gVar, C2547y0 y0Var, int i10) {
        this.f25927a.e().l(C2421g.m(j10), C2421g.n(j10), C2421g.m(j10) + C2427m.k(j11), C2421g.n(j10) + C2427m.i(j11), p(this, n0Var, gVar, f10, y0Var, i10, 0, 32, (Object) null));
    }

    public void h1(S1 s12, C2514n0 n0Var, float f10, C2606g gVar, C2547y0 y0Var, int i10) {
        S1 s13 = s12;
        this.f25927a.e().k(s12, p(this, n0Var, gVar, f10, y0Var, i10, 0, 32, (Object) null));
    }

    public void j0(long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, C2606g gVar, C2547y0 y0Var, int i10) {
        this.f25927a.e().v(C2421g.m(j11), C2421g.n(j11), C2421g.m(j11) + C2427m.k(j12), C2421g.n(j11) + C2427m.i(j12), f10, f11, z10, e(this, j10, gVar, f12, y0Var, i10, 0, 32, (Object) null));
    }

    public void p0(H1 h12, long j10, float f10, C2606g gVar, C2547y0 y0Var, int i10) {
        H1 h13 = h12;
        long j11 = j10;
        this.f25927a.e().u(h12, j10, p(this, (C2514n0) null, gVar, f10, y0Var, i10, 0, 32, (Object) null));
    }

    public float r1() {
        return this.f25927a.f().r1();
    }

    public void s1(H1 h12, long j10, long j11, long j12, long j13, float f10, C2606g gVar, C2547y0 y0Var, int i10, int i11) {
        this.f25927a.e().y(h12, j10, j11, j12, j13, o((C2514n0) null, gVar, f10, y0Var, i10, i11));
    }

    public void u1(long j10, long j11, long j12, float f10, C2606g gVar, C2547y0 y0Var, int i10) {
        this.f25927a.e().l(C2421g.m(j11), C2421g.n(j11), C2421g.m(j11) + C2427m.k(j12), C2421g.n(j11) + C2427m.i(j12), e(this, j10, gVar, f10, y0Var, i10, 0, 32, (Object) null));
    }

    public C2603d w1() {
        return this.f25928b;
    }
}
