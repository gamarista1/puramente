package androidx.compose.animation;

import H0.E;
import H0.G;
import H0.H;
import H0.Q;
import H0.U;
import Y.A1;
import Y.C1500m;
import Y.C1506p;
import Y.C1510r0;
import Y.o1;
import Y.p1;
import androidx.collection.K;
import androidx.collection.V;
import androidx.compose.animation.d;
import c1.n;
import c1.r;
import c1.s;
import c1.t;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import o0.C2342e;
import v.C2726i;
import v.C2734q;
import v.C2738u;
import w.C2763G;
import w.C2798j;
import w.n0;
import w.o0;
import w.t0;
import yf.C6798l;

public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final n0 f12275a;

    /* renamed from: b  reason: collision with root package name */
    private k0.c f12276b;

    /* renamed from: c  reason: collision with root package name */
    private t f12277c;

    /* renamed from: d  reason: collision with root package name */
    private final C1510r0 f12278d = u1.d(r.b(r.f19235b.a()), (o1) null, 2, (Object) null);

    /* renamed from: e  reason: collision with root package name */
    private final K f12279e = V.d();

    /* renamed from: f  reason: collision with root package name */
    private A1 f12280f;

    private final class b extends C2734q {

        /* renamed from: b  reason: collision with root package name */
        private final n0.a f12282b;

        /* renamed from: c  reason: collision with root package name */
        private final A1 f12283c;

        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f12285a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ U f12286b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ long f12287c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(e eVar, U u10, long j10) {
                super(1);
                this.f12285a = eVar;
                this.f12286b = u10;
                this.f12287c = j10;
            }

            public final void a(U.a aVar) {
                U.a aVar2 = aVar;
                U.a.j(aVar2, this.f12286b, this.f12285a.n().a(s.a(this.f12286b.X0(), this.f12286b.R0()), this.f12287c, t.Ltr), 0.0f, 2, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((U.a) obj);
                return C6514M.f71813a;
            }
        }

        /* renamed from: androidx.compose.animation.e$b$b  reason: collision with other inner class name */
        static final class C0225b extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f12288a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f12289b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0225b(e eVar, b bVar) {
                super(1);
                this.f12288a = eVar;
                this.f12289b = bVar;
            }

            /* renamed from: a */
            public final C2763G invoke(n0.b bVar) {
                long j10;
                long j11;
                C2763G b10;
                A1 a12 = (A1) this.f12288a.q().b(bVar.e());
                if (a12 != null) {
                    j10 = ((r) a12.getValue()).j();
                } else {
                    j10 = r.f19235b.a();
                }
                A1 a13 = (A1) this.f12288a.q().b(bVar.d());
                if (a13 != null) {
                    j11 = ((r) a13.getValue()).j();
                } else {
                    j11 = r.f19235b.a();
                }
                C2738u uVar = (C2738u) this.f12289b.a().getValue();
                if (uVar == null || (b10 = uVar.b(j10, j11)) == null) {
                    return C2798j.h(0.0f, 0.0f, (Object) null, 7, (Object) null);
                }
                return b10;
            }
        }

        static final class c extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f12290a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(e eVar) {
                super(1);
                this.f12290a = eVar;
            }

            public final long a(Object obj) {
                A1 a12 = (A1) this.f12290a.q().b(obj);
                if (a12 != null) {
                    return ((r) a12.getValue()).j();
                }
                return r.f19235b.a();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return r.b(a(obj));
            }
        }

        public b(n0.a aVar, A1 a12) {
            this.f12282b = aVar;
            this.f12283c = a12;
        }

        public final A1 a() {
            return this.f12283c;
        }

        public G o(H h10, E e10, long j10) {
            long j11;
            U v02 = e10.v0(j10);
            A1 a10 = this.f12282b.a(new C0225b(e.this, this), new c(e.this));
            e.this.u(a10);
            if (h10.r0()) {
                j11 = s.a(v02.X0(), v02.R0());
            } else {
                j11 = ((r) a10.getValue()).j();
            }
            return H.N(h10, r.g(j11), r.f(j11), (Map) null, new a(e.this, v02, j11), 4, (Object) null);
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f12291a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f12292b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C6798l lVar, e eVar) {
            super(1);
            this.f12291a = lVar;
            this.f12292b = eVar;
        }

        public final Integer a(int i10) {
            return (Integer) this.f12291a.invoke(Integer.valueOf(r.g(this.f12292b.o()) - n.j(this.f12292b.j(s.a(i10, i10), this.f12292b.o()))));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f12293a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f12294b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C6798l lVar, e eVar) {
            super(1);
            this.f12293a = lVar;
            this.f12294b = eVar;
        }

        public final Integer a(int i10) {
            return (Integer) this.f12293a.invoke(Integer.valueOf((-n.j(this.f12294b.j(s.a(i10, i10), this.f12294b.o()))) - i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* renamed from: androidx.compose.animation.e$e  reason: collision with other inner class name */
    static final class C0226e extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f12295a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f12296b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0226e(C6798l lVar, e eVar) {
            super(1);
            this.f12295a = lVar;
            this.f12296b = eVar;
        }

        public final Integer a(int i10) {
            return (Integer) this.f12295a.invoke(Integer.valueOf(r.f(this.f12296b.o()) - n.k(this.f12296b.j(s.a(i10, i10), this.f12296b.o()))));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static final class f extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f12297a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f12298b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C6798l lVar, e eVar) {
            super(1);
            this.f12297a = lVar;
            this.f12298b = eVar;
        }

        public final Integer a(int i10) {
            return (Integer) this.f12297a.invoke(Integer.valueOf((-n.k(this.f12298b.j(s.a(i10, i10), this.f12298b.o()))) - i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static final class g extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f12299a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6798l f12300b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(e eVar, C6798l lVar) {
            super(1);
            this.f12299a = eVar;
            this.f12300b = lVar;
        }

        public final Integer a(int i10) {
            long j10;
            A1 a12 = (A1) this.f12299a.q().b(this.f12299a.r().p());
            if (a12 != null) {
                j10 = ((r) a12.getValue()).j();
            } else {
                j10 = r.f19235b.a();
            }
            return (Integer) this.f12300b.invoke(Integer.valueOf((-n.j(this.f12299a.j(s.a(i10, i10), j10))) - i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static final class h extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f12301a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6798l f12302b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(e eVar, C6798l lVar) {
            super(1);
            this.f12301a = eVar;
            this.f12302b = lVar;
        }

        public final Integer a(int i10) {
            long j10;
            A1 a12 = (A1) this.f12301a.q().b(this.f12301a.r().p());
            if (a12 != null) {
                j10 = ((r) a12.getValue()).j();
            } else {
                j10 = r.f19235b.a();
            }
            return (Integer) this.f12302b.invoke(Integer.valueOf((-n.j(this.f12301a.j(s.a(i10, i10), j10))) + r.g(j10)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static final class i extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f12303a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6798l f12304b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(e eVar, C6798l lVar) {
            super(1);
            this.f12303a = eVar;
            this.f12304b = lVar;
        }

        public final Integer a(int i10) {
            long j10;
            A1 a12 = (A1) this.f12303a.q().b(this.f12303a.r().p());
            if (a12 != null) {
                j10 = ((r) a12.getValue()).j();
            } else {
                j10 = r.f19235b.a();
            }
            return (Integer) this.f12304b.invoke(Integer.valueOf((-n.k(this.f12303a.j(s.a(i10, i10), j10))) - i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static final class j extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f12305a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6798l f12306b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(e eVar, C6798l lVar) {
            super(1);
            this.f12305a = eVar;
            this.f12306b = lVar;
        }

        public final Integer a(int i10) {
            long j10;
            A1 a12 = (A1) this.f12305a.q().b(this.f12305a.r().p());
            if (a12 != null) {
                j10 = ((r) a12.getValue()).j();
            } else {
                j10 = r.f19235b.a();
            }
            return (Integer) this.f12306b.invoke(Integer.valueOf((-n.k(this.f12305a.j(s.a(i10, i10), j10))) + r.f(j10)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public e(n0 n0Var, k0.c cVar, t tVar) {
        this.f12275a = n0Var;
        this.f12276b = cVar;
        this.f12277c = tVar;
    }

    /* access modifiers changed from: private */
    public final long j(long j10, long j11) {
        return n().a(j10, j11, t.Ltr);
    }

    private static final boolean l(C1510r0 r0Var) {
        return ((Boolean) r0Var.getValue()).booleanValue();
    }

    private static final void m(C1510r0 r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public final long o() {
        A1 a12 = this.f12280f;
        if (a12 != null) {
            return ((r) a12.getValue()).j();
        }
        return p();
    }

    private final boolean s(int i10) {
        d.a.C0224a aVar = d.a.f12266a;
        if (d.a.h(i10, aVar.c()) || ((d.a.h(i10, aVar.e()) && this.f12277c == t.Ltr) || (d.a.h(i10, aVar.b()) && this.f12277c == t.Rtl))) {
            return true;
        }
        return false;
    }

    private final boolean t(int i10) {
        d.a.C0224a aVar = d.a.f12266a;
        if (d.a.h(i10, aVar.d()) || ((d.a.h(i10, aVar.e()) && this.f12277c == t.Rtl) || (d.a.h(i10, aVar.b()) && this.f12277c == t.Ltr))) {
            return true;
        }
        return false;
    }

    public i a(int i10, C2763G g10, C6798l lVar) {
        if (s(i10)) {
            return g.A(g10, new c(lVar, this));
        }
        if (t(i10)) {
            return g.A(g10, new d(lVar, this));
        }
        d.a.C0224a aVar = d.a.f12266a;
        if (d.a.h(i10, aVar.f())) {
            return g.B(g10, new C0226e(lVar, this));
        }
        if (d.a.h(i10, aVar.a())) {
            return g.B(g10, new f(lVar, this));
        }
        return i.f12381a.a();
    }

    public k b(int i10, C2763G g10, C6798l lVar) {
        if (s(i10)) {
            return g.E(g10, new g(this, lVar));
        }
        if (t(i10)) {
            return g.E(g10, new h(this, lVar));
        }
        d.a.C0224a aVar = d.a.f12266a;
        if (d.a.h(i10, aVar.f())) {
            return g.F(g10, new i(this, lVar));
        }
        if (d.a.h(i10, aVar.a())) {
            return g.F(g10, new j(this, lVar));
        }
        return k.f12384a.a();
    }

    public Object d() {
        return this.f12275a.n().d();
    }

    public Object e() {
        return this.f12275a.n().e();
    }

    public final k0.i k(C2726i iVar, C1500m mVar, int i10) {
        k0.i iVar2;
        k0.i iVar3;
        if (C1506p.H()) {
            C1506p.Q(93755870, i10, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:573)");
        }
        boolean S10 = mVar.S(this);
        Object A10 = mVar.A();
        if (S10 || A10 == C1500m.f10026a.a()) {
            A10 = u1.d(Boolean.FALSE, (o1) null, 2, (Object) null);
            mVar.r(A10);
        }
        C1510r0 r0Var = (C1510r0) A10;
        A1 o10 = p1.o(iVar.b(), mVar, 0);
        if (C6496s.c(this.f12275a.i(), this.f12275a.p())) {
            m(r0Var, false);
        } else if (o10.getValue() != null) {
            m(r0Var, true);
        }
        if (l(r0Var)) {
            mVar.T(249037309);
            n0.a c10 = o0.c(this.f12275a, t0.e(r.f19235b), (String) null, mVar, 0, 2);
            boolean S11 = mVar.S(c10);
            Object A11 = mVar.A();
            if (S11 || A11 == C1500m.f10026a.a()) {
                C2738u uVar = (C2738u) o10.getValue();
                if (uVar == null || uVar.a()) {
                    iVar3 = C2342e.b(k0.i.f23074a);
                } else {
                    iVar3 = k0.i.f23074a;
                }
                A11 = iVar3.h(new b(c10, o10));
                mVar.r(A11);
            }
            iVar2 = (k0.i) A11;
            mVar.M();
        } else {
            mVar.T(249353726);
            mVar.M();
            this.f12280f = null;
            iVar2 = k0.i.f23074a;
        }
        if (C1506p.H()) {
            C1506p.P();
        }
        return iVar2;
    }

    public k0.c n() {
        return this.f12276b;
    }

    public final long p() {
        return ((r) this.f12278d.getValue()).j();
    }

    public final K q() {
        return this.f12279e;
    }

    public final n0 r() {
        return this.f12275a;
    }

    public final void u(A1 a12) {
        this.f12280f = a12;
    }

    public void v(k0.c cVar) {
        this.f12276b = cVar;
    }

    public final void w(t tVar) {
        this.f12277c = tVar;
    }

    public final void x(long j10) {
        this.f12278d.setValue(r.b(j10));
    }

    public static final class a implements Q {

        /* renamed from: b  reason: collision with root package name */
        private final C1510r0 f12281b;

        public a(boolean z10) {
            this.f12281b = u1.d(Boolean.valueOf(z10), (o1) null, 2, (Object) null);
        }

        public final boolean a() {
            return ((Boolean) this.f12281b.getValue()).booleanValue();
        }

        public final void b(boolean z10) {
            this.f12281b.setValue(Boolean.valueOf(z10));
        }

        public Object s(c1.d dVar, Object obj) {
            return this;
        }
    }
}
