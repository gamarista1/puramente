package androidx.compose.animation;

import H0.E;
import H0.G;
import H0.H;
import H0.U;
import Y.A1;
import c1.n;
import c1.r;
import c1.s;
import c1.t;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.C6535s;
import v.C2724g;
import v.C2727j;
import v.C2732o;
import v.C2733p;
import v.C2739v;
import w.C2763G;
import w.n0;
import yf.C6787a;
import yf.C6798l;

final class h extends C2733p {

    /* renamed from: A  reason: collision with root package name */
    private final C6798l f12351A = new j(this);

    /* renamed from: n  reason: collision with root package name */
    private n0 f12352n;

    /* renamed from: o  reason: collision with root package name */
    private n0.a f12353o;

    /* renamed from: p  reason: collision with root package name */
    private n0.a f12354p;

    /* renamed from: q  reason: collision with root package name */
    private n0.a f12355q;

    /* renamed from: r  reason: collision with root package name */
    private i f12356r;

    /* renamed from: s  reason: collision with root package name */
    private k f12357s;

    /* renamed from: t  reason: collision with root package name */
    private C6787a f12358t;

    /* renamed from: u  reason: collision with root package name */
    private C2732o f12359u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f12360v;

    /* renamed from: w  reason: collision with root package name */
    private long f12361w = f.c();

    /* renamed from: x  reason: collision with root package name */
    private long f12362x = c1.c.b(0, 0, 0, 0, 15, (Object) null);

    /* renamed from: y  reason: collision with root package name */
    private k0.c f12363y;

    /* renamed from: z  reason: collision with root package name */
    private final C6798l f12364z = new i(this);

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12365a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                v.j[] r0 = v.C2727j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                v.j r1 = v.C2727j.Visible     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                v.j r1 = v.C2727j.PreEnter     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                v.j r1 = v.C2727j.PostExit     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f12365a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.h.a.<clinit>():void");
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ U f12366a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(U u10) {
            super(1);
            this.f12366a = u10;
        }

        public final void a(U.a aVar) {
            U.a.h(aVar, this.f12366a, 0, 0, 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ U f12367a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f12368b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f12369c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6798l f12370d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(U u10, long j10, long j11, C6798l lVar) {
            super(1);
            this.f12367a = u10;
            this.f12368b = j10;
            this.f12369c = j11;
            this.f12370d = lVar;
        }

        public final void a(U.a aVar) {
            U.a aVar2 = aVar;
            aVar2.u(this.f12367a, n.j(this.f12369c) + n.j(this.f12368b), n.k(this.f12369c) + n.k(this.f12368b), 0.0f, this.f12370d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ U f12371a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(U u10) {
            super(1);
            this.f12371a = u10;
        }

        public final void a(U.a aVar) {
            U.a.h(aVar, this.f12371a, 0, 0, 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    static final class e extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f12372a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f12373b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(h hVar, long j10) {
            super(1);
            this.f12372a = hVar;
            this.f12373b = j10;
        }

        public final long a(C2727j jVar) {
            return this.f12372a.x2(jVar, this.f12373b);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return r.b(a((C2727j) obj));
        }
    }

    static final class f extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final f f12374a = new f();

        f() {
            super(1);
        }

        /* renamed from: a */
        public final C2763G invoke(n0.b bVar) {
            return g.f12310c;
        }
    }

    static final class g extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f12375a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f12376b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(h hVar, long j10) {
            super(1);
            this.f12375a = hVar;
            this.f12376b = j10;
        }

        public final long a(C2727j jVar) {
            return this.f12375a.z2(jVar, this.f12376b);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n.b(a((C2727j) obj));
        }
    }

    /* renamed from: androidx.compose.animation.h$h  reason: collision with other inner class name */
    static final class C0228h extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f12377a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f12378b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0228h(h hVar, long j10) {
            super(1);
            this.f12377a = hVar;
            this.f12378b = j10;
        }

        public final long a(C2727j jVar) {
            return this.f12377a.y2(jVar, this.f12378b);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n.b(a((C2727j) obj));
        }
    }

    static final class i extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f12379a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(h hVar) {
            super(1);
            this.f12379a = hVar;
        }

        /* renamed from: a */
        public final C2763G invoke(n0.b bVar) {
            C2727j jVar = C2727j.PreEnter;
            C2727j jVar2 = C2727j.Visible;
            C2763G g10 = null;
            if (bVar.g(jVar, jVar2)) {
                C2724g a10 = this.f12379a.m2().b().a();
                if (a10 != null) {
                    g10 = a10.b();
                }
            } else if (bVar.g(jVar2, C2727j.PostExit)) {
                C2724g a11 = this.f12379a.n2().b().a();
                if (a11 != null) {
                    g10 = a11.b();
                }
            } else {
                g10 = g.f12311d;
            }
            if (g10 == null) {
                return g.f12311d;
            }
            return g10;
        }
    }

    static final class j extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f12380a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(h hVar) {
            super(1);
            this.f12380a = hVar;
        }

        /* renamed from: a */
        public final C2763G invoke(n0.b bVar) {
            C2763G a10;
            C2763G a11;
            C2727j jVar = C2727j.PreEnter;
            C2727j jVar2 = C2727j.Visible;
            if (bVar.g(jVar, jVar2)) {
                C2739v f10 = this.f12380a.m2().b().f();
                if (f10 == null || (a11 = f10.a()) == null) {
                    return g.f12310c;
                }
                return a11;
            } else if (!bVar.g(jVar2, C2727j.PostExit)) {
                return g.f12310c;
            } else {
                C2739v f11 = this.f12380a.n2().b().f();
                if (f11 == null || (a10 = f11.a()) == null) {
                    return g.f12310c;
                }
                return a10;
            }
        }
    }

    public h(n0 n0Var, n0.a aVar, n0.a aVar2, n0.a aVar3, i iVar, k kVar, C6787a aVar4, C2732o oVar) {
        this.f12352n = n0Var;
        this.f12353o = aVar;
        this.f12354p = aVar2;
        this.f12355q = aVar3;
        this.f12356r = iVar;
        this.f12357s = kVar;
        this.f12358t = aVar4;
        this.f12359u = oVar;
    }

    private final void s2(long j10) {
        this.f12360v = true;
        this.f12362x = j10;
    }

    public void V1() {
        super.V1();
        this.f12360v = false;
        this.f12361w = f.c();
    }

    public final k0.c l2() {
        k0.c a10;
        if (this.f12352n.n().g(C2727j.PreEnter, C2727j.Visible)) {
            C2724g a11 = this.f12356r.b().a();
            if (a11 == null || (a10 = a11.a()) == null) {
                C2724g a12 = this.f12357s.b().a();
                if (a12 != null) {
                    return a12.a();
                }
                return null;
            }
        } else {
            C2724g a13 = this.f12357s.b().a();
            if (a13 == null || (a10 = a13.a()) == null) {
                C2724g a14 = this.f12356r.b().a();
                if (a14 != null) {
                    return a14.a();
                }
                return null;
            }
        }
        return a10;
    }

    public final i m2() {
        return this.f12356r;
    }

    public final k n2() {
        return this.f12357s;
    }

    public G o(H h10, E e10, long j10) {
        long j11;
        long a10;
        long j12;
        long j13;
        A1 a11;
        A1 a12;
        long j14 = j10;
        A1 a13 = null;
        if (this.f12352n.i() == this.f12352n.p()) {
            this.f12363y = null;
        } else if (this.f12363y == null) {
            k0.c l22 = l2();
            if (l22 == null) {
                l22 = k0.c.f23044a.o();
            }
            this.f12363y = l22;
        }
        if (h10.r0()) {
            U v02 = e10.v0(j10);
            long a14 = s.a(v02.X0(), v02.R0());
            this.f12361w = a14;
            s2(j14);
            return H.N(h10, r.g(a14), r.f(a14), (Map) null, new b(v02), 4, (Object) null);
        } else if (((Boolean) this.f12358t.invoke()).booleanValue()) {
            C6798l a15 = this.f12359u.a();
            U v03 = e10.v0(j10);
            long a16 = s.a(v03.X0(), v03.R0());
            if (f.d(this.f12361w)) {
                j11 = this.f12361w;
            } else {
                j11 = a16;
            }
            n0.a aVar = this.f12353o;
            if (aVar != null) {
                a13 = aVar.a(this.f12364z, new e(this, j11));
            }
            if (a13 != null) {
                a16 = ((r) a13.getValue()).j();
            }
            long f10 = c1.c.f(j14, a16);
            n0.a aVar2 = this.f12354p;
            if (aVar2 == null || (a12 = aVar2.a(f.f12374a, new g(this, j11))) == null) {
                a10 = n.f19226b.a();
            } else {
                a10 = ((n) a12.getValue()).p();
            }
            long j15 = a10;
            n0.a aVar3 = this.f12355q;
            if (aVar3 == null || (a11 = aVar3.a(this.f12351A, new C0228h(this, j11))) == null) {
                j12 = n.f19226b.a();
            } else {
                j12 = ((n) a11.getValue()).p();
            }
            k0.c cVar = this.f12363y;
            if (cVar != null) {
                j13 = cVar.a(j11, f10, t.Ltr);
            } else {
                j13 = n.f19226b.a();
            }
            return H.N(h10, r.g(f10), r.f(f10), (Map) null, new c(v03, n.n(j13, j12), j15, a15), 4, (Object) null);
        } else {
            U v04 = e10.v0(j10);
            return H.N(h10, v04.X0(), v04.R0(), (Map) null, new d(v04), 4, (Object) null);
        }
    }

    public final void o2(C6787a aVar) {
        this.f12358t = aVar;
    }

    public final void p2(i iVar) {
        this.f12356r = iVar;
    }

    public final void q2(k kVar) {
        this.f12357s = kVar;
    }

    public final void r2(C2732o oVar) {
        this.f12359u = oVar;
    }

    public final void t2(n0.a aVar) {
        this.f12354p = aVar;
    }

    public final void u2(n0.a aVar) {
        this.f12353o = aVar;
    }

    public final void v2(n0.a aVar) {
        this.f12355q = aVar;
    }

    public final void w2(n0 n0Var) {
        this.f12352n = n0Var;
    }

    public final long x2(C2727j jVar, long j10) {
        C6798l d10;
        C6798l d11;
        int i10 = a.f12365a[jVar.ordinal()];
        if (i10 == 1) {
            return j10;
        }
        if (i10 == 2) {
            C2724g a10 = this.f12356r.b().a();
            if (a10 == null || (d10 = a10.d()) == null) {
                return j10;
            }
            return ((r) d10.invoke(r.b(j10))).j();
        } else if (i10 == 3) {
            C2724g a11 = this.f12357s.b().a();
            if (a11 == null || (d11 = a11.d()) == null) {
                return j10;
            }
            return ((r) d11.invoke(r.b(j10))).j();
        } else {
            throw new C6535s();
        }
    }

    public final long y2(C2727j jVar, long j10) {
        long j11;
        long j12;
        C6798l b10;
        C6798l b11;
        C2739v f10 = this.f12356r.b().f();
        if (f10 == null || (b11 = f10.b()) == null) {
            j11 = n.f19226b.a();
        } else {
            j11 = ((n) b11.invoke(r.b(j10))).p();
        }
        C2739v f11 = this.f12357s.b().f();
        if (f11 == null || (b10 = f11.b()) == null) {
            j12 = n.f19226b.a();
        } else {
            j12 = ((n) b10.invoke(r.b(j10))).p();
        }
        int i10 = a.f12365a[jVar.ordinal()];
        if (i10 == 1) {
            return n.f19226b.a();
        }
        if (i10 == 2) {
            return j11;
        }
        if (i10 == 3) {
            return j12;
        }
        throw new C6535s();
    }

    public final long z2(C2727j jVar, long j10) {
        if (this.f12363y == null) {
            return n.f19226b.a();
        }
        if (l2() == null) {
            return n.f19226b.a();
        }
        if (C6496s.c(this.f12363y, l2())) {
            return n.f19226b.a();
        }
        int i10 = a.f12365a[jVar.ordinal()];
        if (i10 == 1) {
            return n.f19226b.a();
        }
        if (i10 == 2) {
            return n.f19226b.a();
        }
        if (i10 == 3) {
            C2724g a10 = this.f12357s.b().a();
            if (a10 == null) {
                return n.f19226b.a();
            }
            long j11 = ((r) a10.d().invoke(r.b(j10))).j();
            k0.c l22 = l2();
            C6496s.e(l22);
            long j12 = j10;
            long j13 = j11;
            t tVar = t.Ltr;
            long a11 = l22.a(j12, j13, tVar);
            k0.c cVar = this.f12363y;
            C6496s.e(cVar);
            return n.m(a11, cVar.a(j12, j13, tVar));
        }
        throw new C6535s();
    }
}
