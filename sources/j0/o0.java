package J0;

import i0.u;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;

public final class o0 {

    /* renamed from: i  reason: collision with root package name */
    public static final int f3904i = u.f21781k;

    /* renamed from: a  reason: collision with root package name */
    private final u f3905a;

    /* renamed from: b  reason: collision with root package name */
    private final C6798l f3906b = f.f3918a;

    /* renamed from: c  reason: collision with root package name */
    private final C6798l f3907c = g.f3919a;

    /* renamed from: d  reason: collision with root package name */
    private final C6798l f3908d = h.f3920a;

    /* renamed from: e  reason: collision with root package name */
    private final C6798l f3909e = b.f3914a;

    /* renamed from: f  reason: collision with root package name */
    private final C6798l f3910f = c.f3915a;

    /* renamed from: g  reason: collision with root package name */
    private final C6798l f3911g = d.f3916a;

    /* renamed from: h  reason: collision with root package name */
    private final C6798l f3912h = e.f3917a;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3913a = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            C6496s.f(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
            return Boolean.valueOf(!((n0) obj).Y0());
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f3914a = new b();

        b() {
            super(1);
        }

        public final void a(G g10) {
            if (g10.Y0()) {
                G.u1(g10, false, 1, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((G) obj);
            return C6514M.f71813a;
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final c f3915a = new c();

        c() {
            super(1);
        }

        public final void a(G g10) {
            if (g10.Y0()) {
                G.u1(g10, false, 1, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((G) obj);
            return C6514M.f71813a;
        }
    }

    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final d f3916a = new d();

        d() {
            super(1);
        }

        public final void a(G g10) {
            if (g10.Y0()) {
                G.q1(g10, false, 1, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((G) obj);
            return C6514M.f71813a;
        }
    }

    static final class e extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final e f3917a = new e();

        e() {
            super(1);
        }

        public final void a(G g10) {
            if (g10.Y0()) {
                G.q1(g10, false, 1, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((G) obj);
            return C6514M.f71813a;
        }
    }

    static final class f extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final f f3918a = new f();

        f() {
            super(1);
        }

        public final void a(G g10) {
            if (g10.Y0()) {
                G.s1(g10, false, false, false, 7, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((G) obj);
            return C6514M.f71813a;
        }
    }

    static final class g extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final g f3919a = new g();

        g() {
            super(1);
        }

        public final void a(G g10) {
            if (g10.Y0()) {
                G.w1(g10, false, false, false, 7, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((G) obj);
            return C6514M.f71813a;
        }
    }

    static final class h extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final h f3920a = new h();

        h() {
            super(1);
        }

        public final void a(G g10) {
            if (g10.Y0()) {
                g10.H0();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((G) obj);
            return C6514M.f71813a;
        }
    }

    public o0(C6798l lVar) {
        this.f3905a = new u(lVar);
    }

    public static /* synthetic */ void d(o0 o0Var, G g10, boolean z10, C6787a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        o0Var.c(g10, z10, aVar);
    }

    public static /* synthetic */ void f(o0 o0Var, G g10, boolean z10, C6787a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        o0Var.e(g10, z10, aVar);
    }

    public static /* synthetic */ void h(o0 o0Var, G g10, boolean z10, C6787a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        o0Var.g(g10, z10, aVar);
    }

    public final void a(Object obj) {
        this.f3905a.k(obj);
    }

    public final void b() {
        this.f3905a.l(a.f3913a);
    }

    public final void c(G g10, boolean z10, C6787a aVar) {
        if (!z10 || g10.a0() == null) {
            i(g10, this.f3910f, aVar);
        } else {
            i(g10, this.f3911g, aVar);
        }
    }

    public final void e(G g10, boolean z10, C6787a aVar) {
        if (!z10 || g10.a0() == null) {
            i(g10, this.f3909e, aVar);
        } else {
            i(g10, this.f3912h, aVar);
        }
    }

    public final void g(G g10, boolean z10, C6787a aVar) {
        if (!z10 || g10.a0() == null) {
            i(g10, this.f3907c, aVar);
        } else {
            i(g10, this.f3906b, aVar);
        }
    }

    public final void i(n0 n0Var, C6798l lVar, C6787a aVar) {
        this.f3905a.o(n0Var, lVar, aVar);
    }

    public final void j(G g10, C6787a aVar) {
        i(g10, this.f3908d, aVar);
    }

    public final void k() {
        this.f3905a.s();
    }

    public final void l() {
        this.f3905a.t();
        this.f3905a.j();
    }
}
