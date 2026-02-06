package w;

import Ug.C5600w0;
import Ug.K;
import Ug.L;
import Y.A1;
import Y.B;
import Y.C1495j0;
import Y.C1500m;
import Y.C1503n0;
import Y.C1506p;
import Y.C1507p0;
import Y.C1510r0;
import Y.D0;
import Y.M;
import Y.M0;
import Y.P;
import Y.Y0;
import Y.i1;
import Y.o1;
import Y.p1;
import i0.r;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import qf.h;
import rf.C6680b;
import w.C2787c0;
import yf.C6787a;
import yf.C6798l;
import yf.p;

public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    private final p0 f27483a;

    /* renamed from: b  reason: collision with root package name */
    private final n0 f27484b;

    /* renamed from: c  reason: collision with root package name */
    private final String f27485c;

    /* renamed from: d  reason: collision with root package name */
    private final C1510r0 f27486d;

    /* renamed from: e  reason: collision with root package name */
    private final C1510r0 f27487e;

    /* renamed from: f  reason: collision with root package name */
    private final C1507p0 f27488f;

    /* renamed from: g  reason: collision with root package name */
    private final C1507p0 f27489g;

    /* renamed from: h  reason: collision with root package name */
    private final C1510r0 f27490h;

    /* renamed from: i  reason: collision with root package name */
    private final r f27491i;

    /* renamed from: j  reason: collision with root package name */
    private final r f27492j;

    /* renamed from: k  reason: collision with root package name */
    private final C1510r0 f27493k;

    /* renamed from: l  reason: collision with root package name */
    private long f27494l;

    /* renamed from: m  reason: collision with root package name */
    private final A1 f27495m;

    public final class a {

        /* renamed from: a  reason: collision with root package name */
        private final r0 f27496a;

        /* renamed from: b  reason: collision with root package name */
        private final String f27497b;

        /* renamed from: c  reason: collision with root package name */
        private final C1510r0 f27498c = u1.d((Object) null, (o1) null, 2, (Object) null);

        /* renamed from: w.n0$a$a  reason: collision with other inner class name */
        public final class C0455a implements A1 {

            /* renamed from: a  reason: collision with root package name */
            private final d f27500a;

            /* renamed from: b  reason: collision with root package name */
            private C6798l f27501b;

            /* renamed from: c  reason: collision with root package name */
            private C6798l f27502c;

            public C0455a(d dVar, C6798l lVar, C6798l lVar2) {
                this.f27500a = dVar;
                this.f27501b = lVar;
                this.f27502c = lVar2;
            }

            public final d g() {
                return this.f27500a;
            }

            public Object getValue() {
                r(n0.this.n());
                return this.f27500a.getValue();
            }

            public final C6798l k() {
                return this.f27502c;
            }

            public final C6798l m() {
                return this.f27501b;
            }

            public final void n(C6798l lVar) {
                this.f27502c = lVar;
            }

            public final void q(C6798l lVar) {
                this.f27501b = lVar;
            }

            public final void r(b bVar) {
                Object invoke = this.f27502c.invoke(bVar.d());
                if (n0.this.u()) {
                    this.f27500a.I(this.f27502c.invoke(bVar.e()), invoke, (C2763G) this.f27501b.invoke(bVar));
                    return;
                }
                this.f27500a.K(invoke, (C2763G) this.f27501b.invoke(bVar));
            }
        }

        public a(r0 r0Var, String str) {
            this.f27496a = r0Var;
            this.f27497b = str;
        }

        public final A1 a(C6798l lVar, C6798l lVar2) {
            C0455a b10 = b();
            if (b10 == null) {
                n0 n0Var = n0.this;
                b10 = new C0455a(new d(lVar2.invoke(n0Var.i()), C2800l.i(this.f27496a, lVar2.invoke(n0.this.i())), this.f27496a, this.f27497b), lVar, lVar2);
                n0 n0Var2 = n0.this;
                c(b10);
                n0Var2.c(b10.g());
            }
            n0 n0Var3 = n0.this;
            b10.n(lVar2);
            b10.q(lVar);
            b10.r(n0Var3.n());
            return b10;
        }

        public final C0455a b() {
            return (C0455a) this.f27498c.getValue();
        }

        public final void c(C0455a aVar) {
            this.f27498c.setValue(aVar);
        }

        public final void d() {
            C0455a b10 = b();
            if (b10 != null) {
                n0 n0Var = n0.this;
                b10.g().I(b10.k().invoke(n0Var.n().e()), b10.k().invoke(n0Var.n().d()), (C2763G) b10.m().invoke(n0Var.n()));
            }
        }
    }

    public interface b {
        Object d();

        Object e();

        boolean g(Object obj, Object obj2) {
            if (!C6496s.c(obj, e()) || !C6496s.c(obj2, d())) {
                return false;
            }
            return true;
        }
    }

    private static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final Object f27504a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f27505b;

        public c(Object obj, Object obj2) {
            this.f27504a = obj;
            this.f27505b = obj2;
        }

        public Object d() {
            return this.f27505b;
        }

        public Object e() {
            return this.f27504a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (!C6496s.c(e(), bVar.e()) || !C6496s.c(d(), bVar.d())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10;
            Object e10 = e();
            int i11 = 0;
            if (e10 != null) {
                i10 = e10.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = i10 * 31;
            Object d10 = d();
            if (d10 != null) {
                i11 = d10.hashCode();
            }
            return i12 + i11;
        }
    }

    public final class d implements A1 {

        /* renamed from: a  reason: collision with root package name */
        private final r0 f27506a;

        /* renamed from: b  reason: collision with root package name */
        private final String f27507b;

        /* renamed from: c  reason: collision with root package name */
        private final C1510r0 f27508c;

        /* renamed from: d  reason: collision with root package name */
        private final C2795g0 f27509d;

        /* renamed from: e  reason: collision with root package name */
        private final C1510r0 f27510e;

        /* renamed from: f  reason: collision with root package name */
        private final C1510r0 f27511f;

        /* renamed from: g  reason: collision with root package name */
        private C2787c0.b f27512g;

        /* renamed from: h  reason: collision with root package name */
        private m0 f27513h;

        /* renamed from: i  reason: collision with root package name */
        private final C1510r0 f27514i = u1.d(Boolean.TRUE, (o1) null, 2, (Object) null);

        /* renamed from: j  reason: collision with root package name */
        private final C1503n0 f27515j = D0.a(-1.0f);

        /* renamed from: k  reason: collision with root package name */
        private boolean f27516k;

        /* renamed from: l  reason: collision with root package name */
        private final C1510r0 f27517l;

        /* renamed from: m  reason: collision with root package name */
        private C2805q f27518m;

        /* renamed from: n  reason: collision with root package name */
        private final C1507p0 f27519n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f27520o;

        /* renamed from: p  reason: collision with root package name */
        private final C2763G f27521p;

        public d(Object obj, C2805q qVar, r0 r0Var, String str) {
            Object obj2;
            this.f27506a = r0Var;
            this.f27507b = str;
            this.f27508c = u1.d(obj, (o1) null, 2, (Object) null);
            C2795g0 h10 = C2798j.h(0.0f, 0.0f, (Object) null, 7, (Object) null);
            this.f27509d = h10;
            this.f27510e = u1.d(h10, (o1) null, 2, (Object) null);
            this.f27511f = u1.d(new m0((C2797i) m(), r0Var, obj, s(), qVar), (o1) null, 2, (Object) null);
            this.f27517l = u1.d(obj, (o1) null, 2, (Object) null);
            this.f27518m = qVar;
            this.f27519n = i1.a(k().d());
            Float f10 = (Float) G0.h().get(r0Var);
            if (f10 != null) {
                float floatValue = f10.floatValue();
                C2805q qVar2 = (C2805q) r0Var.a().invoke(obj);
                int b10 = qVar2.b();
                for (int i10 = 0; i10 < b10; i10++) {
                    qVar2.e(i10, floatValue);
                }
                obj2 = this.f27506a.b().invoke(qVar2);
            } else {
                obj2 = null;
            }
            this.f27521p = C2798j.h(0.0f, 0.0f, obj2, 3, (Object) null);
        }

        private final void E(Object obj) {
            this.f27508c.setValue(obj);
        }

        private final void G(Object obj, boolean z10) {
            Object obj2;
            C2797i iVar;
            m0 m0Var = this.f27513h;
            if (m0Var != null) {
                obj2 = m0Var.g();
            } else {
                obj2 = null;
            }
            if (C6496s.c(obj2, s())) {
                y(new m0((C2797i) this.f27521p, this.f27506a, obj, obj, C2806r.g(this.f27518m)));
                this.f27516k = true;
                A(k().d());
                return;
            }
            if (!z10 || this.f27520o) {
                iVar = m();
            } else if (m() instanceof C2795g0) {
                iVar = m();
            } else {
                iVar = this.f27521p;
            }
            if (n0.this.m() > 0) {
                iVar = C2798j.c(iVar, n0.this.m());
            }
            y(new m0(iVar, this.f27506a, obj, s(), this.f27518m));
            A(k().d());
            this.f27516k = false;
            n0.this.v();
        }

        static /* synthetic */ void H(d dVar, Object obj, boolean z10, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = dVar.getValue();
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            dVar.G(obj, z10);
        }

        private final Object s() {
            return this.f27508c.getValue();
        }

        private final void y(m0 m0Var) {
            this.f27511f.setValue(m0Var);
        }

        private final void z(C2763G g10) {
            this.f27510e.setValue(g10);
        }

        public final void A(long j10) {
            this.f27519n.o(j10);
        }

        public final void B(boolean z10) {
            this.f27514i.setValue(Boolean.valueOf(z10));
        }

        public final void C(C2787c0.b bVar) {
            if (!C6496s.c(k().g(), k().i())) {
                this.f27513h = k();
                this.f27512g = bVar;
            }
            y(new m0((C2797i) this.f27521p, this.f27506a, getValue(), getValue(), C2806r.g(this.f27518m)));
            A(k().d());
            this.f27516k = true;
        }

        public final void D(float f10) {
            this.f27515j.l(f10);
        }

        public void F(Object obj) {
            this.f27517l.setValue(obj);
        }

        public final void I(Object obj, Object obj2, C2763G g10) {
            E(obj2);
            z(g10);
            if (!C6496s.c(k().i(), obj) || !C6496s.c(k().g(), obj2)) {
                H(this, obj, false, 2, (Object) null);
            }
        }

        public final void J() {
            m0 m0Var;
            C2787c0.b bVar = this.f27512g;
            if (bVar != null && (m0Var = this.f27513h) != null) {
                long e10 = Af.a.e(((double) bVar.c()) * ((double) bVar.g()));
                Object f10 = m0Var.f(e10);
                if (this.f27516k) {
                    k().k(f10);
                }
                k().j(f10);
                A(k().d());
                if (r() != -2.0f && !this.f27516k) {
                    x(n0.this.m());
                } else {
                    F(f10);
                }
                if (e10 >= bVar.c()) {
                    this.f27512g = null;
                    this.f27513h = null;
                    return;
                }
                bVar.k(false);
            }
        }

        public final void K(Object obj, C2763G g10) {
            Object obj2;
            Object obj3;
            if (this.f27516k) {
                m0 m0Var = this.f27513h;
                if (m0Var != null) {
                    obj3 = m0Var.g();
                } else {
                    obj3 = null;
                }
                if (C6496s.c(obj, obj3)) {
                    return;
                }
            }
            if (!C6496s.c(s(), obj) || r() != -1.0f) {
                E(obj);
                z(g10);
                if (r() == -3.0f) {
                    obj2 = obj;
                } else {
                    obj2 = getValue();
                }
                boolean z10 = true;
                G(obj2, !t());
                if (r() != -3.0f) {
                    z10 = false;
                }
                B(z10);
                if (r() >= 0.0f) {
                    F(k().f((long) (((float) k().d()) * r())));
                } else if (r() == -3.0f) {
                    F(obj);
                }
                this.f27516k = false;
                D(-1.0f);
            }
        }

        public final void g() {
            this.f27513h = null;
            this.f27512g = null;
            this.f27516k = false;
        }

        public Object getValue() {
            return this.f27517l.getValue();
        }

        public final m0 k() {
            return (m0) this.f27511f.getValue();
        }

        public final C2763G m() {
            return (C2763G) this.f27510e.getValue();
        }

        public final long n() {
            return this.f27519n.a();
        }

        public final C2787c0.b q() {
            return this.f27512g;
        }

        public final float r() {
            return this.f27515j.c();
        }

        public final boolean t() {
            return ((Boolean) this.f27514i.getValue()).booleanValue();
        }

        public String toString() {
            return "current value: " + getValue() + ", target: " + s() + ", spec: " + m();
        }

        public final void u(long j10, boolean z10) {
            if (z10) {
                j10 = k().d();
            }
            F(k().f(j10));
            this.f27518m = k().b(j10);
            if (k().c(j10)) {
                B(true);
            }
        }

        public final void v() {
            D(-2.0f);
        }

        public final void w(float f10) {
            Object obj;
            int i10 = (f10 > -4.0f ? 1 : (f10 == -4.0f ? 0 : -1));
            if (i10 == 0 || f10 == -5.0f) {
                m0 m0Var = this.f27513h;
                if (m0Var != null) {
                    k().j(m0Var.g());
                    this.f27512g = null;
                    this.f27513h = null;
                }
                if (i10 == 0) {
                    obj = k().i();
                } else {
                    obj = k().g();
                }
                k().j(obj);
                k().k(obj);
                F(obj);
                A(k().d());
                return;
            }
            D(f10);
        }

        public final void x(long j10) {
            if (r() == -1.0f) {
                this.f27520o = true;
                if (C6496s.c(k().g(), k().i())) {
                    F(k().g());
                    return;
                }
                F(k().f(j10));
                this.f27518m = k().b(j10);
            }
        }
    }

    static final class f extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n0 f27531a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f27532b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f27533c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(n0 n0Var, Object obj, int i10) {
            super(2);
            this.f27531a = n0Var;
            this.f27532b = obj;
            this.f27533c = i10;
        }

        public final void a(C1500m mVar, int i10) {
            this.f27531a.e(this.f27532b, mVar, M0.a(this.f27533c | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class g extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n0 f27534a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(n0 n0Var) {
            super(0);
            this.f27534a = n0Var;
        }

        /* renamed from: a */
        public final Long invoke() {
            return Long.valueOf(this.f27534a.f());
        }
    }

    public n0(p0 p0Var, n0 n0Var, String str) {
        this.f27483a = p0Var;
        this.f27484b = n0Var;
        this.f27485c = str;
        this.f27486d = u1.d(i(), (o1) null, 2, (Object) null);
        this.f27487e = u1.d(new c(i(), i()), (o1) null, 2, (Object) null);
        this.f27488f = i1.a(0);
        this.f27489g = i1.a(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.f27490h = u1.d(bool, (o1) null, 2, (Object) null);
        this.f27491i = p1.f();
        this.f27492j = p1.f();
        this.f27493k = u1.d(bool, (o1) null, 2, (Object) null);
        this.f27495m = p1.e(new g(this));
        p0Var.f(this);
    }

    private final void F() {
        r rVar = this.f27491i;
        int size = rVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) rVar.get(i10)).v();
        }
        r rVar2 = this.f27492j;
        int size2 = rVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((n0) rVar2.get(i11)).F();
        }
    }

    private final void L(b bVar) {
        this.f27487e.setValue(bVar);
    }

    private final void O(boolean z10) {
        this.f27490h.setValue(Boolean.valueOf(z10));
    }

    private final void P(long j10) {
        this.f27488f.o(j10);
    }

    /* access modifiers changed from: private */
    public final long f() {
        r rVar = this.f27491i;
        int size = rVar.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            j10 = Math.max(j10, ((d) rVar.get(i10)).n());
        }
        r rVar2 = this.f27492j;
        int size2 = rVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            j10 = Math.max(j10, ((n0) rVar2.get(i11)).f());
        }
        return j10;
    }

    private final boolean r() {
        return ((Boolean) this.f27490h.getValue()).booleanValue();
    }

    private final long s() {
        return this.f27488f.a();
    }

    /* access modifiers changed from: private */
    public final void v() {
        O(true);
        if (u()) {
            r rVar = this.f27491i;
            int size = rVar.size();
            long j10 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) rVar.get(i10);
                j10 = Math.max(j10, dVar.n());
                dVar.x(this.f27494l);
            }
            O(false);
        }
    }

    public final void A(long j10) {
        M(j10);
        this.f27483a.e(true);
    }

    public final void B(a aVar) {
        d g10;
        a.C0455a b10 = aVar.b();
        if (b10 != null && (g10 = b10.g()) != null) {
            C(g10);
        }
    }

    public final void C(d dVar) {
        this.f27491i.remove((Object) dVar);
    }

    public final boolean D(n0 n0Var) {
        return this.f27492j.remove((Object) n0Var);
    }

    public final void E(float f10) {
        r rVar = this.f27491i;
        int size = rVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) rVar.get(i10)).w(f10);
        }
        r rVar2 = this.f27492j;
        int size2 = rVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((n0) rVar2.get(i11)).E(f10);
        }
    }

    public final void G(Object obj, Object obj2, long j10) {
        M(Long.MIN_VALUE);
        this.f27483a.e(false);
        if (!u() || !C6496s.c(i(), obj) || !C6496s.c(p(), obj2)) {
            if (!C6496s.c(i(), obj)) {
                p0 p0Var = this.f27483a;
                if (p0Var instanceof C2777V) {
                    p0Var.d(obj);
                }
            }
            N(obj2);
            K(true);
            L(new c(obj, obj2));
        }
        r rVar = this.f27492j;
        int size = rVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            n0 n0Var = (n0) rVar.get(i10);
            C6496s.f(n0Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (n0Var.u()) {
                n0Var.G(n0Var.i(), n0Var.p(), j10);
            }
        }
        r rVar2 = this.f27491i;
        int size2 = rVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((d) rVar2.get(i11)).x(j10);
        }
        this.f27494l = j10;
    }

    public final void H(long j10) {
        if (o() == Long.MIN_VALUE) {
            M(j10);
        }
        J(j10);
        O(false);
        r rVar = this.f27491i;
        int size = rVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) rVar.get(i10)).x(j10);
        }
        r rVar2 = this.f27492j;
        int size2 = rVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            n0 n0Var = (n0) rVar2.get(i11);
            if (!C6496s.c(n0Var.p(), n0Var.i())) {
                n0Var.H(j10);
            }
        }
    }

    public final void I(C2787c0.b bVar) {
        r rVar = this.f27491i;
        int size = rVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) rVar.get(i10)).C(bVar);
        }
        r rVar2 = this.f27492j;
        int size2 = rVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((n0) rVar2.get(i11)).I(bVar);
        }
    }

    public final void J(long j10) {
        if (this.f27484b == null) {
            P(j10);
        }
    }

    public final void K(boolean z10) {
        this.f27493k.setValue(Boolean.valueOf(z10));
    }

    public final void M(long j10) {
        this.f27489g.o(j10);
    }

    public final void N(Object obj) {
        this.f27486d.setValue(obj);
    }

    public final void Q() {
        r rVar = this.f27491i;
        int size = rVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) rVar.get(i10)).J();
        }
        r rVar2 = this.f27492j;
        int size2 = rVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((n0) rVar2.get(i11)).Q();
        }
    }

    public final void R(Object obj) {
        if (!C6496s.c(p(), obj)) {
            L(new c(p(), obj));
            if (!C6496s.c(i(), p())) {
                this.f27483a.d(p());
            }
            N(obj);
            if (!t()) {
                O(true);
            }
            F();
        }
    }

    public final boolean c(d dVar) {
        return this.f27491i.add(dVar);
    }

    public final boolean d(n0 n0Var) {
        return this.f27492j.add(n0Var);
    }

    public final void e(Object obj, C1500m mVar, int i10) {
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        C1500m h10 = mVar.h(-1493585151);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                z11 = h10.S(obj);
            } else {
                z11 = h10.C(obj);
            }
            if (z11) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (h10.S(this)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(-1493585151, i11, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:1211)");
            }
            if (!u()) {
                h10.T(1822507602);
                R(obj);
                if (!C6496s.c(obj, i()) || t() || r()) {
                    h10.T(1822738893);
                    Object A10 = h10.A();
                    C1500m.a aVar = C1500m.f10026a;
                    if (A10 == aVar.a()) {
                        B b10 = new B(P.j(h.f72645a, h10));
                        h10.r(b10);
                        A10 = b10;
                    }
                    K a10 = ((B) A10).a();
                    boolean C10 = h10.C(a10);
                    int i14 = i11 & 112;
                    if (i14 == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z12 = z10 | C10;
                    Object A11 = h10.A();
                    if (z12 || A11 == aVar.a()) {
                        A11 = new e(a10, this);
                        h10.r(A11);
                    }
                    P.b(a10, this, (C6798l) A11, h10, i14);
                    h10.M();
                } else {
                    h10.T(1823982427);
                    h10.M();
                }
                h10.M();
            } else {
                h10.T(1823992347);
                h10.M();
            }
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new f(this, obj, i10));
        }
    }

    public final void g() {
        r rVar = this.f27491i;
        int size = rVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) rVar.get(i10)).g();
        }
        r rVar2 = this.f27492j;
        int size2 = rVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((n0) rVar2.get(i11)).g();
        }
    }

    public final List h() {
        return this.f27491i;
    }

    public final Object i() {
        return this.f27483a.a();
    }

    public final boolean j() {
        r rVar = this.f27491i;
        int size = rVar.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                r rVar2 = this.f27492j;
                int size2 = rVar2.size();
                int i11 = 0;
                while (i11 < size2) {
                    if (!((n0) rVar2.get(i11)).j()) {
                        i11++;
                    }
                }
                return false;
            } else if (((d) rVar.get(i10)).q() != null) {
                break;
            } else {
                i10++;
            }
        }
        return true;
    }

    public final String k() {
        return this.f27485c;
    }

    public final long l() {
        return this.f27494l;
    }

    public final long m() {
        n0 n0Var = this.f27484b;
        if (n0Var != null) {
            return n0Var.m();
        }
        return s();
    }

    public final b n() {
        return (b) this.f27487e.getValue();
    }

    public final long o() {
        return this.f27489g.a();
    }

    public final Object p() {
        return this.f27486d.getValue();
    }

    public final long q() {
        return ((Number) this.f27495m.getValue()).longValue();
    }

    public final boolean t() {
        if (o() != Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public String toString() {
        List h10 = h();
        String str = "Transition animation values: ";
        for (int i10 = 0; i10 < h10.size(); i10++) {
            str = str + ((d) h10.get(i10)) + ", ";
        }
        return str;
    }

    public final boolean u() {
        return ((Boolean) this.f27493k.getValue()).booleanValue();
    }

    public final void w() {
        z();
        this.f27483a.g();
    }

    public final void x(long j10, float f10) {
        boolean z10;
        if (o() == Long.MIN_VALUE) {
            A(j10);
        }
        long o10 = j10 - o();
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i10 != 0) {
            o10 = Af.a.e(((double) o10) / ((double) f10));
        }
        J(o10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        y(o10, z10);
    }

    public final void y(long j10, boolean z10) {
        boolean z11 = true;
        if (o() == Long.MIN_VALUE) {
            A(j10);
        } else if (!this.f27483a.c()) {
            this.f27483a.e(true);
        }
        O(false);
        r rVar = this.f27491i;
        int size = rVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) rVar.get(i10);
            if (!dVar.t()) {
                dVar.u(j10, z10);
            }
            if (!dVar.t()) {
                z11 = false;
            }
        }
        r rVar2 = this.f27492j;
        int size2 = rVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            n0 n0Var = (n0) rVar2.get(i11);
            if (!C6496s.c(n0Var.p(), n0Var.i())) {
                n0Var.y(j10, z10);
            }
            if (!C6496s.c(n0Var.p(), n0Var.i())) {
                z11 = false;
            }
        }
        if (z11) {
            z();
        }
    }

    public final void z() {
        M(Long.MIN_VALUE);
        p0 p0Var = this.f27483a;
        if (p0Var instanceof C2777V) {
            p0Var.d(p());
        }
        J(0);
        this.f27483a.e(false);
        r rVar = this.f27492j;
        int size = rVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((n0) rVar.get(i10)).z();
        }
    }

    public n0(p0 p0Var, String str) {
        this(p0Var, (n0) null, str);
    }

    public n0(Object obj, String str) {
        this(new C2777V(obj), (n0) null, str);
    }

    static final class e extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ K f27523a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n0 f27524b;

        static final class a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            float f27525a;

            /* renamed from: b  reason: collision with root package name */
            int f27526b;

            /* renamed from: c  reason: collision with root package name */
            private /* synthetic */ Object f27527c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ n0 f27528d;

            /* renamed from: w.n0$e$a$a  reason: collision with other inner class name */
            static final class C0456a extends C6498u implements C6798l {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ n0 f27529a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ float f27530b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0456a(n0 n0Var, float f10) {
                    super(1);
                    this.f27529a = n0Var;
                    this.f27530b = f10;
                }

                public final void a(long j10) {
                    if (!this.f27529a.u()) {
                        this.f27529a.x(j10, this.f27530b);
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((Number) obj).longValue());
                    return C6514M.f71813a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(n0 n0Var, C6658d dVar) {
                super(2, dVar);
                this.f27528d = n0Var;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                a aVar = new a(this.f27528d, dVar);
                aVar.f27527c = obj;
                return aVar;
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                K k10;
                float f10;
                Object f11 = C6680b.f();
                int i10 = this.f27526b;
                if (i10 == 0) {
                    w.b(obj);
                    K k11 = (K) this.f27527c;
                    f10 = l0.n(k11.getCoroutineContext());
                    k10 = k11;
                } else if (i10 == 1) {
                    f10 = this.f27525a;
                    k10 = (K) this.f27527c;
                    w.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                while (L.g(k10)) {
                    C0456a aVar = new C0456a(this.f27528d, f10);
                    this.f27527c = k10;
                    this.f27525a = f10;
                    this.f27526b = 1;
                    if (C1495j0.c(aVar, this) == f11) {
                        return f11;
                    }
                }
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(K k10, n0 n0Var) {
            super(1);
            this.f27523a = k10;
            this.f27524b = n0Var;
        }

        /* renamed from: a */
        public final Y.L invoke(M m10) {
            C5600w0 unused = C5576k.d(this.f27523a, (qf.g) null, Ug.M.UNDISPATCHED, new a(this.f27524b, (C6658d) null), 1, (Object) null);
            return new b();
        }

        public static final class b implements Y.L {
            public void dispose() {
            }
        }
    }
}
