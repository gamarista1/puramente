package O;

import H0.C1181b;
import H0.C1193n;
import H0.C1194o;
import H0.G;
import H0.H;
import H0.U;
import J0.B;
import J0.C1252s;
import J0.E;
import J0.r;
import J0.w0;
import J0.x0;
import O0.t;
import O0.v;
import Q0.A;
import Q0.C1321d;
import Q0.C1333p;
import Q0.L;
import Q0.T;
import V0.h;
import V0.n;
import V0.o;
import V0.p;
import b1.C1869a;
import b1.C1876h;
import b1.k;
import b1.q;
import b1.s;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import r0.C2443E0;
import r0.C2514n0;
import r0.C2520p0;
import r0.C2544x0;
import r0.e2;
import t0.C2602c;
import t0.C2606g;
import t0.C2609j;
import yf.C6787a;
import yf.C6798l;

public final class i extends i.c implements B, r, w0 {

    /* renamed from: n  reason: collision with root package name */
    private String f4502n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public T f4503o;

    /* renamed from: p  reason: collision with root package name */
    private h.b f4504p;

    /* renamed from: q  reason: collision with root package name */
    private int f4505q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f4506r;

    /* renamed from: s  reason: collision with root package name */
    private int f4507s;

    /* renamed from: t  reason: collision with root package name */
    private int f4508t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public C2443E0 f4509u;

    /* renamed from: v  reason: collision with root package name */
    private Map f4510v;

    /* renamed from: w  reason: collision with root package name */
    private f f4511w;

    /* renamed from: x  reason: collision with root package name */
    private C6798l f4512x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public a f4513y;

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f4518a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar) {
            super(1);
            this.f4518a = iVar;
        }

        /* renamed from: a */
        public final Boolean invoke(List list) {
            long j10;
            boolean z10;
            f m22 = this.f4518a.u2();
            T o22 = this.f4518a.f4503o;
            C2443E0 n22 = this.f4518a.f4509u;
            if (n22 != null) {
                j10 = n22.a();
            } else {
                j10 = C2544x0.f25560b.h();
            }
            L o10 = m22.o(T.L(o22, j10, 0, (p) null, (n) null, (o) null, (h) null, (String) null, 0, (C1869a) null, (b1.o) null, (X0.e) null, 0, (k) null, (e2) null, (C2606g) null, 0, 0, 0, (q) null, (C1876h) null, 0, 0, (A) null, (s) null, 16777214, (Object) null));
            if (o10 != null) {
                list.add(o10);
            } else {
                o10 = null;
            }
            if (o10 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f4519a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(i iVar) {
            super(1);
            this.f4519a = iVar;
        }

        /* renamed from: a */
        public final Boolean invoke(C1321d dVar) {
            boolean unused = this.f4519a.x2(dVar.j());
            this.f4519a.w2();
            return Boolean.TRUE;
        }
    }

    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f4520a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(i iVar) {
            super(1);
            this.f4520a = iVar;
        }

        public final Boolean a(boolean z10) {
            if (this.f4520a.f4513y == null) {
                return Boolean.FALSE;
            }
            a p22 = this.f4520a.f4513y;
            if (p22 != null) {
                p22.e(z10);
            }
            this.f4520a.w2();
            return Boolean.TRUE;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    static final class e extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f4521a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(i iVar) {
            super(0);
            this.f4521a = iVar;
        }

        /* renamed from: a */
        public final Boolean invoke() {
            this.f4521a.s2();
            this.f4521a.w2();
            return Boolean.TRUE;
        }
    }

    static final class f extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ U f4522a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(U u10) {
            super(1);
            this.f4522a = u10;
        }

        public final void a(U.a aVar) {
            U.a.h(aVar, this.f4522a, 0, 0, 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    public /* synthetic */ i(String str, T t10, h.b bVar, int i10, boolean z10, int i11, int i12, C2443E0 e02, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, t10, bVar, i10, z10, i11, i12, e02);
    }

    /* access modifiers changed from: private */
    public final void s2() {
        this.f4513y = null;
    }

    /* access modifiers changed from: private */
    public final f u2() {
        if (this.f4511w == null) {
            this.f4511w = new f(this.f4502n, this.f4503o, this.f4504p, this.f4505q, this.f4506r, this.f4507s, this.f4508t, (DefaultConstructorMarker) null);
        }
        f fVar = this.f4511w;
        C6496s.e(fVar);
        return fVar;
    }

    private final f v2(c1.d dVar) {
        f a10;
        a aVar = this.f4513y;
        if (aVar == null || !aVar.c() || (a10 = aVar.a()) == null) {
            f u22 = u2();
            u22.m(dVar);
            return u22;
        }
        a10.m(dVar);
        return a10;
    }

    /* access modifiers changed from: private */
    public final void w2() {
        x0.b(this);
        E.b(this);
        C1252s.a(this);
    }

    /* access modifiers changed from: private */
    public final boolean x2(String str) {
        C6514M m10;
        a aVar = this.f4513y;
        if (aVar == null) {
            a aVar2 = new a(this.f4502n, str, false, (f) null, 12, (DefaultConstructorMarker) null);
            f fVar = new f(str, this.f4503o, this.f4504p, this.f4505q, this.f4506r, this.f4507s, this.f4508t, (DefaultConstructorMarker) null);
            fVar.m(u2().a());
            aVar2.d(fVar);
            this.f4513y = aVar2;
            return true;
        } else if (C6496s.c(str, aVar.b())) {
            return false;
        } else {
            aVar.f(str);
            f a10 = aVar.a();
            if (a10 != null) {
                a10.p(str, this.f4503o, this.f4504p, this.f4505q, this.f4506r, this.f4507s, this.f4508t);
                m10 = C6514M.f71813a;
            } else {
                m10 = null;
            }
            if (m10 == null) {
                return false;
            }
            return true;
        }
    }

    public final boolean A2(String str) {
        if (C6496s.c(this.f4502n, str)) {
            return false;
        }
        this.f4502n = str;
        s2();
        return true;
    }

    public int B(C1194o oVar, C1193n nVar, int i10) {
        return v2(oVar).f(i10, oVar.getLayoutDirection());
    }

    public int D(C1194o oVar, C1193n nVar, int i10) {
        return v2(oVar).f(i10, oVar.getLayoutDirection());
    }

    public int G(C1194o oVar, C1193n nVar, int i10) {
        return v2(oVar).j(oVar.getLayoutDirection());
    }

    public void W(v vVar) {
        C6798l lVar = this.f4512x;
        if (lVar == null) {
            lVar = new b(this);
            this.f4512x = lVar;
        }
        t.m0(vVar, new C1321d(this.f4502n, (List) null, (List) null, 6, (DefaultConstructorMarker) null));
        a aVar = this.f4513y;
        if (aVar != null) {
            t.j0(vVar, aVar.c());
            t.q0(vVar, new C1321d(aVar.b(), (List) null, (List) null, 6, (DefaultConstructorMarker) null));
        }
        t.s0(vVar, (String) null, new c(this), 1, (Object) null);
        t.x0(vVar, (String) null, new d(this), 1, (Object) null);
        t.d(vVar, (String) null, new e(this), 1, (Object) null);
        t.s(vVar, (String) null, lVar, 1, (Object) null);
    }

    public G o(H h10, H0.E e10, long j10) {
        f v22 = v2(h10);
        boolean h11 = v22.h(j10, h10.getLayoutDirection());
        v22.d();
        C1333p e11 = v22.e();
        C6496s.e(e11);
        long c10 = v22.c();
        if (h11) {
            E.a(this);
            Map map = this.f4510v;
            if (map == null) {
                map = new LinkedHashMap(2);
            }
            map.put(C1181b.a(), Integer.valueOf(Math.round(e11.j())));
            map.put(C1181b.b(), Integer.valueOf(Math.round(e11.x())));
            this.f4510v = map;
        }
        U v02 = e10.v0(c1.b.f19206b.b(c1.r.g(c10), c1.r.g(c10), c1.r.f(c10), c1.r.f(c10)));
        int g10 = c1.r.g(c10);
        int f10 = c1.r.f(c10);
        Map map2 = this.f4510v;
        C6496s.e(map2);
        return h10.d1(g10, f10, map2, new f(v02));
    }

    public final void t2(boolean z10, boolean z11, boolean z12) {
        if (z11 || z12) {
            u2().p(this.f4502n, this.f4503o, this.f4504p, this.f4505q, this.f4506r, this.f4507s, this.f4508t);
        }
        if (S1()) {
            if (z11 || (z10 && this.f4512x != null)) {
                x0.b(this);
            }
            if (z11 || z12) {
                E.b(this);
                C1252s.a(this);
            }
            if (z10) {
                C1252s.a(this);
            }
        }
    }

    public void u(C2602c cVar) {
        long j10;
        if (S1()) {
            f v22 = v2(cVar);
            C1333p e10 = v22.e();
            if (e10 != null) {
                C2520p0 f10 = cVar.w1().f();
                boolean b10 = v22.b();
                if (b10) {
                    f10.q();
                    C2520p0.w(f10, 0.0f, 0.0f, (float) c1.r.g(v22.c()), (float) c1.r.f(v22.c()), 0, 16, (Object) null);
                }
                try {
                    k A10 = this.f4503o.A();
                    if (A10 == null) {
                        A10 = k.f19119b.c();
                    }
                    k kVar = A10;
                    e2 x10 = this.f4503o.x();
                    if (x10 == null) {
                        x10 = e2.f25491d.a();
                    }
                    e2 e2Var = x10;
                    C2606g i10 = this.f4503o.i();
                    if (i10 == null) {
                        i10 = C2609j.f25944a;
                    }
                    C2606g gVar = i10;
                    C2514n0 g10 = this.f4503o.g();
                    if (g10 != null) {
                        C1333p.C(e10, f10, g10, this.f4503o.d(), e2Var, kVar, gVar, 0, 64, (Object) null);
                    } else {
                        C2443E0 e02 = this.f4509u;
                        if (e02 != null) {
                            j10 = e02.a();
                        } else {
                            j10 = C2544x0.f25560b.h();
                        }
                        if (j10 == 16) {
                            if (this.f4503o.h() != 16) {
                                j10 = this.f4503o.h();
                            } else {
                                j10 = C2544x0.f25560b.a();
                            }
                        }
                        C1333p.B(e10, f10, j10, e2Var, kVar, gVar, 0, 32, (Object) null);
                    }
                } finally {
                    if (b10) {
                        f10.h();
                    }
                }
            } else {
                throw new IllegalArgumentException(("no paragraph (layoutCache=" + this.f4511w + ", textSubstitution=" + this.f4513y + ')').toString());
            }
        }
    }

    public int x(C1194o oVar, C1193n nVar, int i10) {
        return v2(oVar).k(oVar.getLayoutDirection());
    }

    public final boolean y2(C2443E0 e02, T t10) {
        boolean c10 = C6496s.c(e02, this.f4509u);
        this.f4509u = e02;
        if (!c10 || !t10.F(this.f4503o)) {
            return true;
        }
        return false;
    }

    public final boolean z2(T t10, int i10, int i11, boolean z10, h.b bVar, int i12) {
        boolean z11 = !this.f4503o.G(t10);
        this.f4503o = t10;
        if (this.f4508t != i10) {
            this.f4508t = i10;
            z11 = true;
        }
        if (this.f4507s != i11) {
            this.f4507s = i11;
            z11 = true;
        }
        if (this.f4506r != z10) {
            this.f4506r = z10;
            z11 = true;
        }
        if (!C6496s.c(this.f4504p, bVar)) {
            this.f4504p = bVar;
            z11 = true;
        }
        if (b1.t.e(this.f4505q, i12)) {
            return z11;
        }
        this.f4505q = i12;
        return true;
    }

    private i(String str, T t10, h.b bVar, int i10, boolean z10, int i11, int i12, C2443E0 e02) {
        this.f4502n = str;
        this.f4503o = t10;
        this.f4504p = bVar;
        this.f4505q = i10;
        this.f4506r = z10;
        this.f4507s = i11;
        this.f4508t = i12;
        this.f4509u = e02;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f4514a;

        /* renamed from: b  reason: collision with root package name */
        private String f4515b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f4516c;

        /* renamed from: d  reason: collision with root package name */
        private f f4517d;

        public a(String str, String str2, boolean z10, f fVar) {
            this.f4514a = str;
            this.f4515b = str2;
            this.f4516c = z10;
            this.f4517d = fVar;
        }

        public final f a() {
            return this.f4517d;
        }

        public final String b() {
            return this.f4515b;
        }

        public final boolean c() {
            return this.f4516c;
        }

        public final void d(f fVar) {
            this.f4517d = fVar;
        }

        public final void e(boolean z10) {
            this.f4516c = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (C6496s.c(this.f4514a, aVar.f4514a) && C6496s.c(this.f4515b, aVar.f4515b) && this.f4516c == aVar.f4516c && C6496s.c(this.f4517d, aVar.f4517d)) {
                return true;
            }
            return false;
        }

        public final void f(String str) {
            this.f4515b = str;
        }

        public int hashCode() {
            int i10;
            int hashCode = ((((this.f4514a.hashCode() * 31) + this.f4515b.hashCode()) * 31) + Boolean.hashCode(this.f4516c)) * 31;
            f fVar = this.f4517d;
            if (fVar == null) {
                i10 = 0;
            } else {
                i10 = fVar.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            return "TextSubstitution(layoutCache=" + this.f4517d + ", isShowingSubstitution=" + this.f4516c + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(String str, String str2, boolean z10, f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : fVar);
        }
    }
}
