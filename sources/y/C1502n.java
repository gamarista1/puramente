package Y;

import Y.B0;
import a0.C1537a;
import a0.C1538b;
import androidx.collection.A;
import androidx.collection.K;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import i0.C2048b;
import j0.C2116a;
import j0.C2119d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;
import lf.C6514M;
import mf.C6559l;
import mf.C6565s;
import qf.g;
import yf.C6787a;
import yf.C6798l;
import yf.p;

/* renamed from: Y.n  reason: case insensitive filesystem */
public final class C1502n implements C1500m {

    /* renamed from: A  reason: collision with root package name */
    private int f10037A = -1;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public int f10038B;

    /* renamed from: C  reason: collision with root package name */
    private int f10039C;

    /* renamed from: D  reason: collision with root package name */
    private boolean f10040D;

    /* renamed from: E  reason: collision with root package name */
    private final c f10041E;

    /* renamed from: F  reason: collision with root package name */
    private final z1 f10042F;

    /* renamed from: G  reason: collision with root package name */
    private boolean f10043G;

    /* renamed from: H  reason: collision with root package name */
    private boolean f10044H;

    /* renamed from: I  reason: collision with root package name */
    private C1473b1 f10045I;

    /* renamed from: J  reason: collision with root package name */
    private C1476c1 f10046J;

    /* renamed from: K  reason: collision with root package name */
    private C1485f1 f10047K;

    /* renamed from: L  reason: collision with root package name */
    private boolean f10048L;

    /* renamed from: M  reason: collision with root package name */
    private B0 f10049M;

    /* renamed from: N  reason: collision with root package name */
    private Z.a f10050N;
    /* access modifiers changed from: private */

    /* renamed from: O  reason: collision with root package name */
    public final Z.b f10051O;

    /* renamed from: P  reason: collision with root package name */
    private C1477d f10052P;

    /* renamed from: Q  reason: collision with root package name */
    private Z.c f10053Q;

    /* renamed from: R  reason: collision with root package name */
    private boolean f10054R;

    /* renamed from: S  reason: collision with root package name */
    private int f10055S;

    /* renamed from: b  reason: collision with root package name */
    private final C1483f f10056b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final r f10057c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C1476c1 f10058d;

    /* renamed from: e  reason: collision with root package name */
    private final Set f10059e;

    /* renamed from: f  reason: collision with root package name */
    private Z.a f10060f;

    /* renamed from: g  reason: collision with root package name */
    private Z.a f10061g;

    /* renamed from: h  reason: collision with root package name */
    private final F f10062h;

    /* renamed from: i  reason: collision with root package name */
    private final z1 f10063i = new z1();

    /* renamed from: j  reason: collision with root package name */
    private A0 f10064j;

    /* renamed from: k  reason: collision with root package name */
    private int f10065k;

    /* renamed from: l  reason: collision with root package name */
    private int f10066l;

    /* renamed from: m  reason: collision with root package name */
    private int f10067m;

    /* renamed from: n  reason: collision with root package name */
    private final W f10068n = new W();
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public int[] f10069o;

    /* renamed from: p  reason: collision with root package name */
    private A f10070p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f10071q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f10072r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f10073s;

    /* renamed from: t  reason: collision with root package name */
    private final List f10074t = new ArrayList();

    /* renamed from: u  reason: collision with root package name */
    private final W f10075u = new W();

    /* renamed from: v  reason: collision with root package name */
    private B0 f10076v = g0.f.a();
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public C1537a f10077w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f10078x;

    /* renamed from: y  reason: collision with root package name */
    private final W f10079y = new W();

    /* renamed from: z  reason: collision with root package name */
    private boolean f10080z;

    /* renamed from: Y.n$b */
    private final class b extends r {

        /* renamed from: a  reason: collision with root package name */
        private final int f10082a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f10083b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f10084c;

        /* renamed from: d  reason: collision with root package name */
        private final A f10085d;

        /* renamed from: e  reason: collision with root package name */
        private Set f10086e;

        /* renamed from: f  reason: collision with root package name */
        private final Set f10087f = new LinkedHashSet();

        /* renamed from: g  reason: collision with root package name */
        private final C1510r0 f10088g = p1.h(g0.f.a(), p1.n());

        public b(int i10, boolean z10, boolean z11, A a10) {
            this.f10082a = i10;
            this.f10083b = z10;
            this.f10084c = z11;
            this.f10085d = a10;
        }

        private final B0 u() {
            return (B0) this.f10088g.getValue();
        }

        private final void v(B0 b02) {
            this.f10088g.setValue(b02);
        }

        public void a(F f10, p pVar) {
            C1502n.this.f10057c.a(f10, pVar);
        }

        public void b() {
            C1502n nVar = C1502n.this;
            nVar.f10038B = nVar.f10038B - 1;
        }

        public boolean c() {
            return C1502n.this.f10057c.c();
        }

        public boolean d() {
            return this.f10083b;
        }

        public boolean e() {
            return this.f10084c;
        }

        public B0 f() {
            return u();
        }

        public int g() {
            return this.f10082a;
        }

        public g h() {
            return C1502n.this.f10057c.h();
        }

        public A i() {
            return this.f10085d;
        }

        public void j(C1501m0 m0Var) {
            C1502n.this.f10057c.j(m0Var);
        }

        public void k(F f10) {
            C1502n.this.f10057c.k(C1502n.this.E0());
            C1502n.this.f10057c.k(f10);
        }

        public C1499l0 l(C1501m0 m0Var) {
            return C1502n.this.f10057c.l(m0Var);
        }

        public void m(Set set) {
            Set set2 = this.f10086e;
            if (set2 == null) {
                set2 = new HashSet();
                this.f10086e = set2;
            }
            set2.add(set);
        }

        public void n(C1500m mVar) {
            C6496s.f(mVar, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
            super.n((C1502n) mVar);
            this.f10087f.add(mVar);
        }

        public void o(F f10) {
            C1502n.this.f10057c.o(f10);
        }

        public void p() {
            C1502n nVar = C1502n.this;
            nVar.f10038B = nVar.f10038B + 1;
        }

        public void q(C1500m mVar) {
            Set<Set> set = this.f10086e;
            if (set != null) {
                for (Set remove : set) {
                    C6496s.f(mVar, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                    remove.remove(((C1502n) mVar).f10058d);
                }
            }
            V.a(this.f10087f).remove(mVar);
        }

        public void r(F f10) {
            C1502n.this.f10057c.r(f10);
        }

        public final void s() {
            if (!this.f10087f.isEmpty()) {
                Set<Set> set = this.f10086e;
                if (set != null) {
                    for (C1502n nVar : this.f10087f) {
                        for (Set remove : set) {
                            remove.remove(nVar.f10058d);
                        }
                    }
                }
                this.f10087f.clear();
            }
        }

        public final Set t() {
            return this.f10087f;
        }

        public final void w(B0 b02) {
            v(b02);
        }
    }

    /* renamed from: Y.n$c */
    public static final class c implements J {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1502n f10090a;

        c(C1502n nVar) {
            this.f10090a = nVar;
        }

        public void a(I i10) {
            C1502n nVar = this.f10090a;
            nVar.f10038B = nVar.f10038B + 1;
        }

        public void b(I i10) {
            C1502n nVar = this.f10090a;
            nVar.f10038B = nVar.f10038B - 1;
        }
    }

    /* renamed from: Y.n$d */
    static final class d extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1502n f10091a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Z.a f10092b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C1473b1 f10093c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C1501m0 f10094d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C1502n nVar, Z.a aVar, C1473b1 b1Var, C1501m0 m0Var) {
            super(0);
            this.f10091a = nVar;
            this.f10092b = aVar;
            this.f10093c = b1Var;
            this.f10094d = m0Var;
        }

        public final void invoke() {
            C1473b1 I02;
            int[] Z10;
            C1537a b02;
            Z.b X10;
            boolean o10;
            Z.b X11 = this.f10091a.f10051O;
            Z.a aVar = this.f10092b;
            C1502n nVar = this.f10091a;
            C1473b1 b1Var = this.f10093c;
            C1501m0 m0Var = this.f10094d;
            Z.a n10 = X11.n();
            try {
                X11.R(aVar);
                I02 = nVar.I0();
                Z10 = nVar.f10069o;
                b02 = nVar.f10077w;
                nVar.f10069o = null;
                nVar.f10077w = null;
                nVar.h1(b1Var);
                X10 = nVar.f10051O;
                o10 = X10.o();
                X10.S(false);
                m0Var.c();
                nVar.N0((C1497k0) null, m0Var.e(), m0Var.f(), true);
                X10.S(o10);
                C6514M m10 = C6514M.f71813a;
                nVar.h1(I02);
                nVar.f10069o = Z10;
                nVar.f10077w = b02;
                X11.R(n10);
            } catch (Throwable th2) {
                X11.R(n10);
                throw th2;
            }
        }
    }

    /* renamed from: Y.n$e */
    static final class e extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1502n f10095a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1501m0 f10096b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C1502n nVar, C1501m0 m0Var) {
            super(0);
            this.f10095a = nVar;
            this.f10096b = m0Var;
        }

        public final void invoke() {
            C1502n nVar = this.f10095a;
            this.f10096b.c();
            nVar.N0((C1497k0) null, this.f10096b.e(), this.f10096b.f(), true);
        }
    }

    /* renamed from: Y.n$f */
    static final class f extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f10097a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C1497k0 k0Var, Object obj) {
            super(2);
            this.f10097a = obj;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(316014703, i10, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:3293)");
                }
                throw null;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* JADX INFO: finally extract failed */
    public C1502n(C1483f fVar, r rVar, C1476c1 c1Var, Set set, Z.a aVar, Z.a aVar2, F f10) {
        boolean z10;
        this.f10056b = fVar;
        this.f10057c = rVar;
        this.f10058d = c1Var;
        this.f10059e = set;
        this.f10060f = aVar;
        this.f10061g = aVar2;
        this.f10062h = f10;
        if (rVar.e() || rVar.c()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10040D = z10;
        this.f10041E = new c(this);
        this.f10042F = new z1();
        C1473b1 P10 = c1Var.P();
        P10.d();
        this.f10045I = P10;
        C1476c1 c1Var2 = new C1476c1();
        if (rVar.e()) {
            c1Var2.r();
        }
        if (rVar.c()) {
            c1Var2.n();
        }
        this.f10046J = c1Var2;
        C1485f1 Q10 = c1Var2.Q();
        Q10.L(true);
        this.f10047K = Q10;
        this.f10051O = new Z.b(this, this.f10060f);
        C1473b1 P11 = this.f10046J.P();
        try {
            C1477d a10 = P11.a(0);
            P11.d();
            this.f10052P = a10;
            this.f10053Q = new Z.c();
        } catch (Throwable th2) {
            P11.d();
            throw th2;
        }
    }

    private final void A0(int i10, boolean z10) {
        A0 a02 = (A0) this.f10063i.g();
        if (a02 != null && !z10) {
            a02.l(a02.a() + 1);
        }
        this.f10064j = a02;
        this.f10065k = this.f10068n.i() + i10;
        this.f10067m = this.f10068n.i();
        this.f10066l = this.f10068n.i() + i10;
    }

    private final void A1() {
        if (this.f10073s) {
            C1506p.r("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    private final void B0() {
        this.f10051O.m();
        if (!this.f10063i.c()) {
            C1506p.r("Start/end imbalance");
        }
        j0();
    }

    private final void C0() {
        C1476c1 c1Var = new C1476c1();
        if (this.f10040D) {
            c1Var.r();
        }
        if (this.f10057c.c()) {
            c1Var.n();
        }
        this.f10046J = c1Var;
        C1485f1 Q10 = c1Var.Q();
        Q10.L(true);
        this.f10047K = Q10;
    }

    private final Object H0(C1473b1 b1Var) {
        return b1Var.L(b1Var.u());
    }

    private final int J0(C1473b1 b1Var, int i10) {
        Object z10;
        if (b1Var.G(i10)) {
            Object D10 = b1Var.D(i10);
            if (D10 == null) {
                return 0;
            }
            if (D10 instanceof Enum) {
                return ((Enum) D10).ordinal();
            }
            return D10.hashCode();
        }
        int C10 = b1Var.C(i10);
        if (C10 == 207 && (z10 = b1Var.z(i10)) != null && !C6496s.c(z10, C1500m.f10026a.a())) {
            C10 = z10.hashCode();
        }
        return C10;
    }

    private final void K0(List list) {
        Z.a aVar;
        Z.b bVar;
        Z.b bVar2;
        Z.a aVar2;
        int i10;
        int i11;
        C1473b1 b1Var;
        int[] iArr;
        C1537a aVar3;
        Z.a aVar4;
        Z.b bVar3;
        C1473b1 b1Var2;
        int i12 = 1;
        Z.b bVar4 = this.f10051O;
        Z.a aVar5 = this.f10061g;
        Z.a n10 = bVar4.n();
        try {
            bVar4.R(aVar5);
            this.f10051O.P();
            int size = list.size();
            int i13 = 0;
            int i14 = 0;
            while (i14 < size) {
                try {
                    Pair pair = (Pair) list.get(i14);
                    C1501m0 m0Var = (C1501m0) pair.a();
                    C1501m0 m0Var2 = (C1501m0) pair.b();
                    C1477d a10 = m0Var.a();
                    int b10 = m0Var.g().b(a10);
                    g0.d dVar = new g0.d(i13, i12, (DefaultConstructorMarker) null);
                    this.f10051O.e(dVar, a10);
                    if (m0Var2 == null) {
                        if (C6496s.c(m0Var.g(), this.f10046J)) {
                            n0();
                        }
                        C1473b1 P10 = m0Var.g().P();
                        try {
                            P10.Q(b10);
                            this.f10051O.y(b10);
                            Z.a aVar6 = new Z.a();
                            Z.a aVar7 = aVar6;
                            b1Var2 = P10;
                            g0.d dVar2 = dVar;
                            X0(this, (F) null, (F) null, (Integer) null, (List) null, new d(this, aVar6, P10, m0Var), 15, (Object) null);
                            this.f10051O.r(aVar7, dVar2);
                            C6514M m10 = C6514M.f71813a;
                            b1Var2.d();
                            bVar2 = bVar4;
                            aVar2 = n10;
                            i11 = size;
                            i10 = i14;
                        } catch (Throwable th2) {
                            th = th2;
                            b1Var2 = P10;
                            b1Var2.d();
                            throw th;
                        }
                    } else {
                        g0.d dVar3 = dVar;
                        C1499l0 l10 = this.f10057c.l(m0Var2);
                        C1476c1 g10 = m0Var2.g();
                        C1477d a11 = m0Var2.a();
                        List e10 = C1506p.p(g10, a11);
                        if (!e10.isEmpty()) {
                            this.f10051O.b(e10, dVar3);
                            if (C6496s.c(m0Var.g(), this.f10058d)) {
                                int b11 = this.f10058d.b(a10);
                                t1(b11, y1(b11) + e10.size());
                            }
                        }
                        this.f10051O.c(l10, this.f10057c, m0Var2, m0Var);
                        C1473b1 P11 = g10.P();
                        try {
                            C1473b1 I02 = I0();
                            int[] Z10 = this.f10069o;
                            C1537a b02 = this.f10077w;
                            this.f10069o = null;
                            this.f10077w = null;
                            try {
                                h1(P11);
                                int b12 = g10.b(a11);
                                P11.Q(b12);
                                this.f10051O.y(b12);
                                Z.a aVar8 = new Z.a();
                                Z.b bVar5 = this.f10051O;
                                Z.a n11 = bVar5.n();
                                try {
                                    bVar5.R(aVar8);
                                    i11 = size;
                                    Z.b bVar6 = this.f10051O;
                                    boolean o10 = bVar6.o();
                                    C1537a aVar9 = b02;
                                    try {
                                        bVar6.S(false);
                                        F b13 = m0Var2.b();
                                        F b14 = m0Var.b();
                                        Integer valueOf = Integer.valueOf(P11.k());
                                        List d10 = m0Var2.d();
                                        e eVar = new e(this, m0Var);
                                        F f10 = b13;
                                        bVar2 = bVar4;
                                        aVar3 = aVar9;
                                        F f11 = b14;
                                        aVar2 = n10;
                                        aVar4 = n11;
                                        Integer num = valueOf;
                                        i10 = i14;
                                        iArr = Z10;
                                        b1Var = P11;
                                        bVar3 = bVar5;
                                        try {
                                            W0(f10, f11, num, d10, eVar);
                                            try {
                                                bVar6.S(o10);
                                            } catch (Throwable th3) {
                                                th = th3;
                                                bVar3.R(aVar4);
                                                throw th;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            bVar6.S(o10);
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        iArr = Z10;
                                        b1Var = P11;
                                        bVar2 = bVar4;
                                        aVar3 = aVar9;
                                        bVar3 = bVar5;
                                        aVar2 = n10;
                                        aVar4 = n11;
                                        bVar6.S(o10);
                                        throw th;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    iArr = Z10;
                                    b1Var = P11;
                                    bVar2 = bVar4;
                                    aVar2 = n10;
                                    aVar3 = b02;
                                    aVar4 = n11;
                                    bVar3 = bVar5;
                                    bVar3.R(aVar4);
                                    throw th;
                                }
                                try {
                                    bVar3.R(aVar4);
                                    this.f10051O.r(aVar8, dVar3);
                                    C6514M m11 = C6514M.f71813a;
                                    try {
                                        h1(I02);
                                        this.f10069o = iArr;
                                        this.f10077w = aVar3;
                                        b1Var.d();
                                    } catch (Throwable th7) {
                                        th = th7;
                                        b1Var.d();
                                        throw th;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    h1(I02);
                                    this.f10069o = iArr;
                                    this.f10077w = aVar3;
                                    throw th;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                iArr = Z10;
                                b1Var = P11;
                                bVar2 = bVar4;
                                aVar2 = n10;
                                aVar3 = b02;
                                h1(I02);
                                this.f10069o = iArr;
                                this.f10077w = aVar3;
                                throw th;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            b1Var = P11;
                            bVar2 = bVar4;
                            aVar2 = n10;
                            b1Var.d();
                            throw th;
                        }
                    }
                    this.f10051O.U();
                    i12 = 1;
                    i14 = i10 + 1;
                    size = i11;
                    n10 = aVar2;
                    bVar4 = bVar2;
                    i13 = 0;
                } catch (Throwable th11) {
                    th = th11;
                    aVar = aVar2;
                    bVar = bVar2;
                    bVar.R(aVar);
                    throw th;
                }
            }
            Z.b bVar7 = bVar4;
            Z.a aVar10 = n10;
            this.f10051O.h();
            this.f10051O.y(0);
            bVar7.R(aVar10);
        } catch (Throwable th12) {
            th = th12;
            bVar = bVar4;
            aVar = n10;
            bVar.R(aVar);
            throw th;
        }
    }

    private final int M0(int i10) {
        return -2 - i10;
    }

    /* access modifiers changed from: private */
    public final void N0(C1497k0 k0Var, B0 b02, Object obj, boolean z10) {
        E(126665345, k0Var);
        w1(obj);
        int O10 = O();
        try {
            this.f10055S = 126665345;
            boolean z11 = false;
            if (f()) {
                C1485f1.t0(this.f10047K, 0, 1, (Object) null);
            }
            if (!f()) {
                if (!C6496s.c(this.f10045I.l(), b02)) {
                    z11 = true;
                }
            }
            if (z11) {
                b1(b02);
            }
            l1(202, C1506p.y(), U.f9903a.a(), b02);
            this.f10049M = null;
            if (!f() || z10) {
                boolean z12 = this.f10078x;
                this.f10078x = z11;
                C1474c.d(this, g0.c.c(316014703, true, new f(k0Var, obj)));
                this.f10078x = z12;
            } else {
                this.f10048L = true;
                C1485f1 f1Var = this.f10047K;
                this.f10057c.j(new C1501m0(k0Var, obj, E0(), this.f10046J, f1Var.E(f1Var.E0(f1Var.c0())), C6565s.n(), o0()));
            }
        } finally {
            v0();
            this.f10049M = null;
            this.f10055S = O10;
            Q();
        }
    }

    private final Object R0(C1473b1 b1Var, int i10) {
        return b1Var.L(i10);
    }

    private final int S0(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int P10 = this.f10045I.P(i11);
        while (i14 != i12 && !this.f10045I.J(i14)) {
            P10 = this.f10045I.P(i14);
        }
        if (this.f10045I.J(i14)) {
            i13 = 0;
        }
        if (i14 == i11) {
            return i13;
        }
        int y12 = (y1(i14) - this.f10045I.N(i11)) + i13;
        loop1:
        while (i13 < y12 && i14 != i10) {
            i14++;
            while (true) {
                if (i14 >= i10) {
                    break loop1;
                }
                int E10 = this.f10045I.E(i14) + i14;
                if (i10 >= E10) {
                    if (this.f10045I.J(i14)) {
                        i15 = 1;
                    } else {
                        i15 = y1(i14);
                    }
                    i13 += i15;
                    i14 = E10;
                }
            }
        }
        return i13;
    }

    private final int U0(int i10) {
        int P10 = this.f10045I.P(i10) + 1;
        int i11 = 0;
        while (P10 < i10) {
            if (!this.f10045I.G(P10)) {
                i11++;
            }
            P10 += this.f10045I.E(P10);
        }
        return i11;
    }

    private final void W() {
        j0();
        this.f10063i.a();
        this.f10068n.a();
        this.f10075u.a();
        this.f10079y.a();
        this.f10077w = null;
        this.f10053Q.a();
        this.f10055S = 0;
        this.f10038B = 0;
        this.f10073s = false;
        this.f10054R = false;
        this.f10080z = false;
        this.f10043G = false;
        this.f10072r = false;
        this.f10037A = -1;
        if (!this.f10045I.i()) {
            this.f10045I.d();
        }
        if (!this.f10047K.Z()) {
            C0();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r7 == null) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object W0(Y.F r7, Y.F r8, java.lang.Integer r9, java.util.List r10, yf.C6787a r11) {
        /*
            r6 = this;
            boolean r0 = r6.f10043G
            int r1 = r6.f10065k
            r2 = 1
            r6.f10043G = r2     // Catch:{ all -> 0x0026 }
            r2 = 0
            r6.f10065k = r2     // Catch:{ all -> 0x0026 }
            int r3 = r10.size()     // Catch:{ all -> 0x0026 }
        L_0x000e:
            if (r2 >= r3) goto L_0x002f
            java.lang.Object r4 = r10.get(r2)     // Catch:{ all -> 0x0026 }
            kotlin.Pair r4 = (kotlin.Pair) r4     // Catch:{ all -> 0x0026 }
            java.lang.Object r5 = r4.a()     // Catch:{ all -> 0x0026 }
            Y.L0 r5 = (Y.L0) r5     // Catch:{ all -> 0x0026 }
            java.lang.Object r4 = r4.b()     // Catch:{ all -> 0x0026 }
            if (r4 == 0) goto L_0x0028
            r6.r1(r5, r4)     // Catch:{ all -> 0x0026 }
            goto L_0x002c
        L_0x0026:
            r7 = move-exception
            goto L_0x0048
        L_0x0028:
            r4 = 0
            r6.r1(r5, r4)     // Catch:{ all -> 0x0026 }
        L_0x002c:
            int r2 = r2 + 1
            goto L_0x000e
        L_0x002f:
            if (r7 == 0) goto L_0x003f
            if (r9 == 0) goto L_0x0038
            int r9 = r9.intValue()     // Catch:{ all -> 0x0026 }
            goto L_0x0039
        L_0x0038:
            r9 = -1
        L_0x0039:
            java.lang.Object r7 = r7.u(r8, r9, r11)     // Catch:{ all -> 0x0026 }
            if (r7 != 0) goto L_0x0043
        L_0x003f:
            java.lang.Object r7 = r11.invoke()     // Catch:{ all -> 0x0026 }
        L_0x0043:
            r6.f10043G = r0
            r6.f10065k = r1
            return r7
        L_0x0048:
            r6.f10043G = r0
            r6.f10065k = r1
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.C1502n.W0(Y.F, Y.F, java.lang.Integer, java.util.List, yf.a):java.lang.Object");
    }

    static /* synthetic */ Object X0(C1502n nVar, F f10, F f11, Integer num, List list, C6787a aVar, int i10, Object obj) {
        F f12;
        F f13;
        Integer num2;
        if ((i10 & 1) != 0) {
            f12 = null;
        } else {
            f12 = f10;
        }
        if ((i10 & 2) != 0) {
            f13 = null;
        } else {
            f13 = f11;
        }
        if ((i10 & 4) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i10 & 8) != 0) {
            list = C6565s.n();
        }
        return nVar.W0(f12, f13, num2, list, aVar);
    }

    private final void Y0() {
        boolean z10 = this.f10043G;
        this.f10043G = true;
        int u10 = this.f10045I.u();
        int E10 = this.f10045I.E(u10) + u10;
        int i10 = this.f10065k;
        int O10 = O();
        int i11 = this.f10066l;
        int i12 = this.f10067m;
        Y f10 = C1506p.x(this.f10074t, this.f10045I.k(), E10);
        boolean z11 = false;
        int i13 = u10;
        while (f10 != null) {
            int b10 = f10.b();
            Y unused = C1506p.M(this.f10074t, b10);
            if (f10.d()) {
                this.f10045I.Q(b10);
                int k10 = this.f10045I.k();
                c1(i13, k10, u10);
                this.f10065k = S0(b10, k10, u10, i10);
                this.f10067m = U0(k10);
                int P10 = this.f10045I.P(k10);
                this.f10055S = m0(P10, U0(P10), u10, O10);
                this.f10049M = null;
                f10.c().g(this);
                this.f10049M = null;
                this.f10045I.R(u10);
                i13 = k10;
                z11 = true;
            } else {
                this.f10042F.h(f10.c());
                f10.c().y();
                this.f10042F.g();
            }
            f10 = C1506p.x(this.f10074t, this.f10045I.k(), E10);
        }
        if (z11) {
            c1(i13, u10, u10);
            this.f10045I.T();
            int y12 = y1(u10);
            this.f10065k = i10 + y12;
            this.f10066l = i11 + y12;
            this.f10067m = i12;
        } else {
            k1();
        }
        this.f10055S = O10;
        this.f10043G = z10;
    }

    private final void Z0() {
        f1(this.f10045I.k());
        this.f10051O.N();
    }

    private final void a1(C1477d dVar) {
        if (this.f10053Q.e()) {
            this.f10051O.s(dVar, this.f10046J);
            return;
        }
        this.f10051O.t(dVar, this.f10046J, this.f10053Q);
        this.f10053Q = new Z.c();
    }

    private final void b1(B0 b02) {
        C1537a aVar = this.f10077w;
        if (aVar == null) {
            aVar = new C1537a(0, 1, (DefaultConstructorMarker) null);
            this.f10077w = aVar;
        }
        aVar.b(this.f10045I.k(), b02);
    }

    private final void c1(int i10, int i11, int i12) {
        C1473b1 b1Var = this.f10045I;
        int k10 = C1506p.J(b1Var, i10, i11, i12);
        while (i10 > 0 && i10 != k10) {
            if (b1Var.J(i10)) {
                this.f10051O.z();
            }
            i10 = b1Var.P(i10);
        }
        t0(i11, k10);
    }

    private final C1477d d1() {
        int i10;
        int i11;
        if (f()) {
            if (!C1506p.G(this.f10047K)) {
                return null;
            }
            int a02 = this.f10047K.a0() - 1;
            int E02 = this.f10047K.E0(a02);
            while (true) {
                int i12 = E02;
                i11 = a02;
                a02 = i12;
                if (a02 != this.f10047K.c0() && a02 >= 0) {
                    E02 = this.f10047K.E0(a02);
                }
            }
            return this.f10047K.E(i11);
        } else if (!C1506p.F(this.f10045I)) {
            return null;
        } else {
            int k10 = this.f10045I.k() - 1;
            int P10 = this.f10045I.P(k10);
            while (true) {
                int i13 = P10;
                i10 = k10;
                k10 = i13;
                if (k10 != this.f10045I.u() && k10 >= 0) {
                    P10 = this.f10045I.P(k10);
                }
            }
            return this.f10045I.a(i10);
        }
    }

    private final void e1() {
        Z.b bVar;
        Z.a n10;
        if (this.f10058d.t()) {
            Z.a aVar = new Z.a();
            this.f10050N = aVar;
            C1473b1 P10 = this.f10058d.P();
            try {
                this.f10045I = P10;
                bVar = this.f10051O;
                n10 = bVar.n();
                bVar.R(aVar);
                f1(0);
                this.f10051O.L();
                bVar.R(n10);
                C6514M m10 = C6514M.f71813a;
                P10.d();
            } catch (Throwable th2) {
                P10.d();
                throw th2;
            }
        }
    }

    private final void f1(int i10) {
        g1(this, i10, false, 0);
        this.f10051O.i();
    }

    private static final int g1(C1502n nVar, int i10, boolean z10, int i11) {
        boolean z11;
        int i12;
        a aVar;
        C1473b1 b1Var = nVar.f10045I;
        if (b1Var.F(i10)) {
            int C10 = b1Var.C(i10);
            Object D10 = b1Var.D(i10);
            if (C10 == 206 && C6496s.c(D10, C1506p.D())) {
                Object B10 = b1Var.B(i10, 0);
                if (B10 instanceof a) {
                    aVar = (a) B10;
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    for (C1502n nVar2 : aVar.a().t()) {
                        nVar2.e1();
                        nVar.f10057c.o(nVar2.E0());
                    }
                }
                return b1Var.N(i10);
            } else if (b1Var.J(i10)) {
                return 1;
            } else {
                return b1Var.N(i10);
            }
        } else if (b1Var.e(i10)) {
            int E10 = b1Var.E(i10) + i10;
            int i13 = 0;
            for (int i14 = i10 + 1; i14 < E10; i14 += b1Var.E(i14)) {
                boolean J10 = b1Var.J(i14);
                if (J10) {
                    nVar.f10051O.i();
                    nVar.f10051O.v(b1Var.L(i14));
                }
                if (J10 || z10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (J10) {
                    i12 = 0;
                } else {
                    i12 = i11 + i13;
                }
                i13 += g1(nVar, i14, z11, i12);
                if (J10) {
                    nVar.f10051O.i();
                    nVar.f10051O.z();
                }
            }
            if (b1Var.J(i10)) {
                return 1;
            }
            return i13;
        } else if (b1Var.J(i10)) {
            return 1;
        } else {
            return b1Var.N(i10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0067, code lost:
        if (r0 != false) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void h0() {
        /*
            r4 = this;
            boolean r0 = r4.f()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl"
            if (r0 == 0) goto L_0x0024
            Y.L0 r0 = new Y.L0
            Y.F r2 = r4.E0()
            kotlin.jvm.internal.C6496s.f(r2, r1)
            Y.t r2 = (Y.C1513t) r2
            r0.<init>(r2)
            Y.z1 r1 = r4.f10042F
            r1.h(r0)
            r4.x1(r0)
            int r1 = r4.f10039C
            r0.I(r1)
            goto L_0x0077
        L_0x0024:
            java.util.List r0 = r4.f10074t
            Y.b1 r2 = r4.f10045I
            int r2 = r2.u()
            Y.Y r0 = Y.C1506p.M(r0, r2)
            Y.b1 r2 = r4.f10045I
            java.lang.Object r2 = r2.K()
            Y.m$a r3 = Y.C1500m.f10026a
            java.lang.Object r3 = r3.a()
            boolean r3 = kotlin.jvm.internal.C6496s.c(r2, r3)
            if (r3 == 0) goto L_0x0054
            Y.L0 r2 = new Y.L0
            Y.F r3 = r4.E0()
            kotlin.jvm.internal.C6496s.f(r3, r1)
            Y.t r3 = (Y.C1513t) r3
            r2.<init>(r3)
            r4.x1(r2)
            goto L_0x005b
        L_0x0054:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            kotlin.jvm.internal.C6496s.f(r2, r1)
            Y.L0 r2 = (Y.L0) r2
        L_0x005b:
            if (r0 != 0) goto L_0x0069
            boolean r0 = r2.m()
            r1 = 0
            if (r0 == 0) goto L_0x0067
            r2.D(r1)
        L_0x0067:
            if (r0 == 0) goto L_0x006a
        L_0x0069:
            r1 = 1
        L_0x006a:
            r2.E(r1)
            Y.z1 r0 = r4.f10042F
            r0.h(r2)
            int r0 = r4.f10039C
            r2.I(r0)
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.C1502n.h0():void");
    }

    private final void j0() {
        this.f10064j = null;
        this.f10065k = 0;
        this.f10066l = 0;
        this.f10055S = 0;
        this.f10073s = false;
        this.f10051O.Q();
        this.f10042F.a();
        k0();
    }

    private final void j1() {
        this.f10066l += this.f10045I.S();
    }

    private final void k0() {
        this.f10069o = null;
        this.f10070p = null;
    }

    private final void k1() {
        this.f10066l = this.f10045I.v();
        this.f10045I.T();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void l1(int r14, java.lang.Object r15, int r16, java.lang.Object r17) {
        /*
            r13 = this;
            r0 = r13
            r2 = r14
            r1 = r15
            r3 = r16
            r4 = r17
            r13.A1()
            int r5 = r0.f10067m
            r6 = 3
            if (r1 != 0) goto L_0x0047
            if (r4 == 0) goto L_0x0036
            r7 = 207(0xcf, float:2.9E-43)
            if (r2 != r7) goto L_0x0036
            Y.m$a r7 = Y.C1500m.f10026a
            java.lang.Object r7 = r7.a()
            boolean r7 = kotlin.jvm.internal.C6496s.c(r4, r7)
            if (r7 != 0) goto L_0x0036
            int r7 = r17.hashCode()
            int r8 = r13.O()
            int r8 = java.lang.Integer.rotateLeft(r8, r6)
            r7 = r7 ^ r8
            int r6 = java.lang.Integer.rotateLeft(r7, r6)
            r5 = r5 ^ r6
            r0.f10055S = r5
            goto L_0x0065
        L_0x0036:
            int r7 = r13.O()
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            r7 = r7 ^ r2
            int r6 = java.lang.Integer.rotateLeft(r7, r6)
            r5 = r5 ^ r6
        L_0x0044:
            r0.f10055S = r5
            goto L_0x0065
        L_0x0047:
            boolean r5 = r1 instanceof java.lang.Enum
            if (r5 == 0) goto L_0x0060
            r5 = r1
            java.lang.Enum r5 = (java.lang.Enum) r5
            int r5 = r5.ordinal()
        L_0x0052:
            int r7 = r13.O()
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            r5 = r5 ^ r7
            int r5 = java.lang.Integer.rotateLeft(r5, r6)
            goto L_0x0044
        L_0x0060:
            int r5 = r15.hashCode()
            goto L_0x0052
        L_0x0065:
            r5 = 1
            if (r1 != 0) goto L_0x006d
            int r6 = r0.f10067m
            int r6 = r6 + r5
            r0.f10067m = r6
        L_0x006d:
            Y.U$a r6 = Y.U.f9903a
            int r7 = r6.a()
            r8 = 0
            if (r3 == r7) goto L_0x0078
            r7 = r5
            goto L_0x0079
        L_0x0078:
            r7 = r8
        L_0x0079:
            boolean r9 = r13.f()
            r10 = -1
            r11 = 0
            if (r9 == 0) goto L_0x00e1
            Y.b1 r3 = r0.f10045I
            r3.c()
            Y.f1 r3 = r0.f10047K
            int r3 = r3.a0()
            if (r7 == 0) goto L_0x009a
            Y.f1 r1 = r0.f10047K
            Y.m$a r4 = Y.C1500m.f10026a
            java.lang.Object r4 = r4.a()
            r1.j1(r14, r4)
            goto L_0x00b7
        L_0x009a:
            if (r4 == 0) goto L_0x00aa
            Y.f1 r5 = r0.f10047K
            if (r1 != 0) goto L_0x00a6
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
        L_0x00a6:
            r5.f1(r14, r1, r4)
            goto L_0x00b7
        L_0x00aa:
            Y.f1 r4 = r0.f10047K
            if (r1 != 0) goto L_0x00b4
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
        L_0x00b4:
            r4.h1(r14, r1)
        L_0x00b7:
            Y.A0 r8 = r0.f10064j
            if (r8 == 0) goto L_0x00dd
            Y.b0 r9 = new Y.b0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            int r5 = r13.M0(r3)
            r6 = -1
            r10 = 0
            r1 = r9
            r2 = r14
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            int r1 = r0.f10065k
            int r2 = r8.e()
            int r1 = r1 - r2
            r8.i(r9, r1)
            r8.h(r9)
        L_0x00dd:
            r13.z0(r7, r11)
            return
        L_0x00e1:
            int r6 = r6.b()
            if (r3 == r6) goto L_0x00e8
            goto L_0x00ee
        L_0x00e8:
            boolean r3 = r0.f10080z
            if (r3 == 0) goto L_0x00ee
            r3 = r5
            goto L_0x00ef
        L_0x00ee:
            r3 = r8
        L_0x00ef:
            Y.A0 r6 = r0.f10064j
            if (r6 != 0) goto L_0x011c
            Y.b1 r6 = r0.f10045I
            int r6 = r6.n()
            if (r3 != 0) goto L_0x010d
            if (r6 != r2) goto L_0x010d
            Y.b1 r6 = r0.f10045I
            java.lang.Object r6 = r6.o()
            boolean r6 = kotlin.jvm.internal.C6496s.c(r15, r6)
            if (r6 == 0) goto L_0x010d
            r13.o1(r7, r4)
            goto L_0x011c
        L_0x010d:
            Y.A0 r6 = new Y.A0
            Y.b1 r9 = r0.f10045I
            java.util.List r9 = r9.h()
            int r12 = r0.f10065k
            r6.<init>(r9, r12)
            r0.f10064j = r6
        L_0x011c:
            Y.A0 r9 = r0.f10064j
            if (r9 == 0) goto L_0x01dc
            Y.b0 r6 = r9.d(r14, r15)
            if (r3 != 0) goto L_0x0161
            if (r6 == 0) goto L_0x0161
            r9.h(r6)
            int r1 = r6.b()
            int r2 = r9.g(r6)
            int r3 = r9.e()
            int r2 = r2 + r3
            r0.f10065k = r2
            int r2 = r9.m(r6)
            int r3 = r9.a()
            int r3 = r2 - r3
            int r5 = r9.a()
            r9.k(r2, r5)
            Z.b r2 = r0.f10051O
            r2.x(r1)
            Y.b1 r2 = r0.f10045I
            r2.Q(r1)
            if (r3 <= 0) goto L_0x015c
            Z.b r1 = r0.f10051O
            r1.u(r3)
        L_0x015c:
            r13.o1(r7, r4)
            goto L_0x01dc
        L_0x0161:
            Y.b1 r3 = r0.f10045I
            r3.c()
            r0.f10054R = r5
            r0.f10049M = r11
            r13.y0()
            Y.f1 r3 = r0.f10047K
            r3.I()
            Y.f1 r3 = r0.f10047K
            int r3 = r3.a0()
            if (r7 == 0) goto L_0x0186
            Y.f1 r1 = r0.f10047K
            Y.m$a r4 = Y.C1500m.f10026a
            java.lang.Object r4 = r4.a()
            r1.j1(r14, r4)
            goto L_0x01a3
        L_0x0186:
            if (r4 == 0) goto L_0x0196
            Y.f1 r5 = r0.f10047K
            if (r1 != 0) goto L_0x0192
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
        L_0x0192:
            r5.f1(r14, r1, r4)
            goto L_0x01a3
        L_0x0196:
            Y.f1 r4 = r0.f10047K
            if (r1 != 0) goto L_0x01a0
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
        L_0x01a0:
            r4.h1(r14, r1)
        L_0x01a3:
            Y.f1 r1 = r0.f10047K
            Y.d r1 = r1.E(r3)
            r0.f10052P = r1
            Y.b0 r11 = new Y.b0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            int r5 = r13.M0(r3)
            r6 = -1
            r10 = 0
            r1 = r11
            r2 = r14
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            int r1 = r0.f10065k
            int r2 = r9.e()
            int r1 = r1 - r2
            r9.i(r11, r1)
            r9.h(r11)
            Y.A0 r11 = new Y.A0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r7 == 0) goto L_0x01d7
            goto L_0x01d9
        L_0x01d7:
            int r8 = r0.f10065k
        L_0x01d9:
            r11.<init>(r1, r8)
        L_0x01dc:
            r13.z0(r7, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.C1502n.l1(int, java.lang.Object, int, java.lang.Object):void");
    }

    private final int m0(int i10, int i11, int i12, int i13) {
        if (i10 == i12) {
            return i13;
        }
        int J02 = J0(this.f10045I, i10);
        if (J02 == 126665345) {
            return J02;
        }
        int P10 = this.f10045I.P(i10);
        if (P10 != i12) {
            i13 = m0(P10, U0(P10), i12, i13);
        }
        if (this.f10045I.G(i10)) {
            i11 = 0;
        }
        return Integer.rotateLeft(Integer.rotateLeft(i13, 3) ^ J02, 3) ^ i11;
    }

    private final void m1(int i10) {
        l1(i10, (Object) null, U.f9903a.a(), (Object) null);
    }

    private final void n0() {
        C1506p.O(this.f10047K.Z());
        C0();
    }

    private final void n1(int i10, Object obj) {
        l1(i10, obj, U.f9903a.a(), (Object) null);
    }

    private final B0 o0() {
        B0 b02 = this.f10049M;
        if (b02 != null) {
            return b02;
        }
        return p0(this.f10045I.u());
    }

    private final void o1(boolean z10, Object obj) {
        if (z10) {
            this.f10045I.V();
            return;
        }
        if (!(obj == null || this.f10045I.l() == obj)) {
            this.f10051O.X(obj);
        }
        this.f10045I.U();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: Y.B0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final Y.B0 p0(int r6) {
        /*
            r5 = this;
            boolean r0 = r5.f()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"
            r2 = 202(0xca, float:2.83E-43)
            if (r0 == 0) goto L_0x0043
            boolean r0 = r5.f10048L
            if (r0 == 0) goto L_0x0043
            Y.f1 r0 = r5.f10047K
            int r0 = r0.c0()
        L_0x0014:
            if (r0 <= 0) goto L_0x0043
            Y.f1 r3 = r5.f10047K
            int r3 = r3.i0(r0)
            if (r3 != r2) goto L_0x003c
            Y.f1 r3 = r5.f10047K
            java.lang.Object r3 = r3.j0(r0)
            java.lang.Object r4 = Y.C1506p.y()
            boolean r3 = kotlin.jvm.internal.C6496s.c(r3, r4)
            if (r3 == 0) goto L_0x003c
            Y.f1 r6 = r5.f10047K
            java.lang.Object r6 = r6.g0(r0)
            kotlin.jvm.internal.C6496s.f(r6, r1)
            Y.B0 r6 = (Y.B0) r6
            r5.f10049M = r6
            return r6
        L_0x003c:
            Y.f1 r3 = r5.f10047K
            int r0 = r3.E0(r0)
            goto L_0x0014
        L_0x0043:
            Y.b1 r0 = r5.f10045I
            int r0 = r0.x()
            if (r0 <= 0) goto L_0x0087
        L_0x004b:
            if (r6 <= 0) goto L_0x0087
            Y.b1 r0 = r5.f10045I
            int r0 = r0.C(r6)
            if (r0 != r2) goto L_0x0080
            Y.b1 r0 = r5.f10045I
            java.lang.Object r0 = r0.D(r6)
            java.lang.Object r3 = Y.C1506p.y()
            boolean r0 = kotlin.jvm.internal.C6496s.c(r0, r3)
            if (r0 == 0) goto L_0x0080
            a0.a r0 = r5.f10077w
            if (r0 == 0) goto L_0x0071
            java.lang.Object r0 = r0.a(r6)
            Y.B0 r0 = (Y.B0) r0
            if (r0 != 0) goto L_0x007d
        L_0x0071:
            Y.b1 r0 = r5.f10045I
            java.lang.Object r6 = r0.z(r6)
            kotlin.jvm.internal.C6496s.f(r6, r1)
            r0 = r6
            Y.B0 r0 = (Y.B0) r0
        L_0x007d:
            r5.f10049M = r0
            return r0
        L_0x0080:
            Y.b1 r0 = r5.f10045I
            int r6 = r0.P(r6)
            goto L_0x004b
        L_0x0087:
            Y.B0 r6 = r5.f10076v
            r5.f10049M = r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.C1502n.p0(int):Y.B0");
    }

    private final void q1() {
        this.f10067m = 0;
        this.f10045I = this.f10058d.P();
        m1(100);
        this.f10057c.p();
        this.f10076v = this.f10057c.f();
        this.f10079y.j(C1506p.o(this.f10078x));
        this.f10078x = S(this.f10076v);
        this.f10049M = null;
        if (!this.f10071q) {
            this.f10071q = this.f10057c.d();
        }
        if (!this.f10040D) {
            this.f10040D = this.f10057c.e();
        }
        Set set = (Set) C1525z.b(this.f10076v, C2119d.a());
        if (set != null) {
            set.add(this.f10058d);
            this.f10057c.m(set);
        }
        m1(this.f10057c.g());
    }

    private final void s0(a0.f fVar, p pVar) {
        C1538b c10;
        long[] jArr;
        int i10;
        long[] jArr2;
        int i11;
        p pVar2 = pVar;
        if (this.f10043G) {
            C1506p.r("Reentrant composition is not supported");
        }
        Object a10 = E1.f9759a.a("Compose:recompose");
        try {
            this.f10039C = i0.p.H().f();
            this.f10077w = null;
            K d10 = fVar.d();
            Object[] objArr = d10.f12124b;
            Object[] objArr2 = d10.f12125c;
            long[] jArr3 = d10.f12123a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i12 = 0;
                while (true) {
                    long j10 = jArr3[i12];
                    if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                        int i13 = 8;
                        int i14 = 8 - ((~(i12 - length)) >>> 31);
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j10 & 255) < 128) {
                                int i16 = (i12 << 3) + i15;
                                Object obj = objArr[i16];
                                Object obj2 = objArr2[i16];
                                C6496s.f(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                                L0 l02 = (L0) obj;
                                C1477d i17 = ((L0) obj).i();
                                if (i17 != null) {
                                    int a11 = i17.a();
                                    List list = this.f10074t;
                                    L0 l03 = (L0) obj;
                                    jArr2 = jArr3;
                                    if (obj2 == X0.f9911a) {
                                        obj2 = null;
                                    }
                                    list.add(new Y(l03, a11, obj2));
                                } else {
                                    jArr2 = jArr3;
                                }
                                i11 = 8;
                            } else {
                                jArr2 = jArr3;
                                i11 = i13;
                            }
                            j10 >>= i11;
                            i15++;
                            i13 = i11;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        i10 = 1;
                        if (i14 != i13) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i10 = 1;
                    }
                    if (i12 == length) {
                        break;
                    }
                    i12 += i10;
                    jArr3 = jArr;
                }
            }
            C6565s.C(this.f10074t, C1506p.f10107g);
            this.f10065k = 0;
            this.f10043G = true;
            q1();
            Object P02 = P0();
            if (!(P02 == pVar2 || pVar2 == null)) {
                x1(pVar2);
            }
            c cVar = this.f10041E;
            c10 = p1.c();
            c10.b(cVar);
            if (pVar2 != null) {
                n1(200, C1506p.z());
                C1474c.d(this, pVar2);
                v0();
            } else if ((this.f10072r || this.f10078x) && P02 != null && !C6496s.c(P02, C1500m.f10026a.a())) {
                n1(200, C1506p.z());
                C1474c.d(this, (p) V.f(P02, 2));
                v0();
            } else {
                i1();
            }
            c10.y(c10.q() - 1);
            x0();
            this.f10043G = false;
            this.f10074t.clear();
            n0();
            C6514M m10 = C6514M.f71813a;
            E1.f9759a.b(a10);
        } catch (Throwable th2) {
            E1.f9759a.b(a10);
            throw th2;
        }
    }

    private final void t0(int i10, int i11) {
        if (i10 > 0 && i10 != i11) {
            t0(this.f10045I.P(i10), i11);
            if (this.f10045I.J(i10)) {
                this.f10051O.v(R0(this.f10045I, i10));
            }
        }
    }

    private final void t1(int i10, int i11) {
        if (y1(i10) == i11) {
            return;
        }
        if (i10 < 0) {
            A a10 = this.f10070p;
            if (a10 == null) {
                a10 = new A(0, 1, (DefaultConstructorMarker) null);
                this.f10070p = a10;
            }
            a10.q(i10, i11);
            return;
        }
        int[] iArr = this.f10069o;
        if (iArr == null) {
            iArr = new int[this.f10045I.x()];
            C6559l.y(iArr, -1, 0, 0, 6, (Object) null);
            this.f10069o = iArr;
        }
        iArr[i10] = i11;
    }

    private final void u0(boolean z10) {
        Set set;
        List list;
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int g10 = this.f10068n.g() - 1;
        if (f()) {
            int c02 = this.f10047K.c0();
            int i02 = this.f10047K.i0(c02);
            Object j02 = this.f10047K.j0(c02);
            Object g02 = this.f10047K.g0(c02);
            if (j02 != null) {
                if (j02 instanceof Enum) {
                    hashCode3 = ((Enum) j02).ordinal();
                } else {
                    hashCode3 = j02.hashCode();
                }
                hashCode4 = Integer.hashCode(hashCode3) ^ Integer.rotateRight(O(), 3);
            } else if (g02 == null || i02 != 207 || C6496s.c(g02, C1500m.f10026a.a())) {
                hashCode4 = Integer.rotateRight(g10 ^ O(), 3) ^ Integer.hashCode(i02);
            } else {
                this.f10055S = Integer.rotateRight(Integer.rotateRight(g10 ^ O(), 3) ^ Integer.hashCode(g02.hashCode()), 3);
            }
            this.f10055S = Integer.rotateRight(hashCode4, 3);
        } else {
            int u10 = this.f10045I.u();
            int C10 = this.f10045I.C(u10);
            Object D10 = this.f10045I.D(u10);
            Object z11 = this.f10045I.z(u10);
            if (D10 != null) {
                if (D10 instanceof Enum) {
                    hashCode = ((Enum) D10).ordinal();
                } else {
                    hashCode = D10.hashCode();
                }
                hashCode2 = Integer.hashCode(hashCode) ^ Integer.rotateRight(O(), 3);
            } else if (z11 == null || C10 != 207 || C6496s.c(z11, C1500m.f10026a.a())) {
                hashCode2 = Integer.rotateRight(g10 ^ O(), 3) ^ Integer.hashCode(C10);
            } else {
                this.f10055S = Integer.rotateRight(Integer.rotateRight(g10 ^ O(), 3) ^ Integer.hashCode(z11.hashCode()), 3);
            }
            this.f10055S = Integer.rotateRight(hashCode2, 3);
        }
        int i10 = this.f10066l;
        A0 a02 = this.f10064j;
        if (a02 != null && a02.b().size() > 0) {
            List b10 = a02.b();
            List f10 = a02.f();
            Set e10 = C2048b.e(f10);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = f10.size();
            int size2 = b10.size();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i11 < size2) {
                C1472b0 b0Var = (C1472b0) b10.get(i11);
                if (!e10.contains(b0Var)) {
                    this.f10051O.O(a02.g(b0Var) + a02.e(), b0Var.c());
                    a02.n(b0Var.b(), 0);
                    this.f10051O.x(b0Var.b());
                    this.f10045I.Q(b0Var.b());
                    Z0();
                    this.f10045I.S();
                    set = e10;
                    C1506p.N(this.f10074t, b0Var.b(), b0Var.b() + this.f10045I.E(b0Var.b()));
                } else {
                    set = e10;
                    if (!linkedHashSet.contains(b0Var)) {
                        if (i12 < size) {
                            C1472b0 b0Var2 = (C1472b0) f10.get(i12);
                            if (b0Var2 != b0Var) {
                                int g11 = a02.g(b0Var2);
                                linkedHashSet.add(b0Var2);
                                if (g11 != i13) {
                                    int o10 = a02.o(b0Var2);
                                    list = f10;
                                    this.f10051O.w(a02.e() + g11, i13 + a02.e(), o10);
                                    a02.j(g11, i13, o10);
                                } else {
                                    list = f10;
                                }
                            } else {
                                list = f10;
                                i11++;
                            }
                            i12++;
                            i13 += a02.o(b0Var2);
                            e10 = set;
                            f10 = list;
                        }
                        e10 = set;
                    }
                }
                i11++;
                e10 = set;
            }
            this.f10051O.i();
            if (b10.size() > 0) {
                this.f10051O.x(this.f10045I.m());
                this.f10045I.T();
            }
        }
        int i14 = this.f10065k;
        while (!this.f10045I.H()) {
            int k10 = this.f10045I.k();
            Z0();
            this.f10051O.O(i14, this.f10045I.S());
            C1506p.N(this.f10074t, k10, this.f10045I.k());
        }
        boolean f11 = f();
        if (f11) {
            if (z10) {
                this.f10053Q.c();
                i10 = 1;
            }
            this.f10045I.f();
            int c03 = this.f10047K.c0();
            this.f10047K.T();
            if (!this.f10045I.t()) {
                int M02 = M0(c03);
                this.f10047K.U();
                this.f10047K.L(true);
                a1(this.f10052P);
                this.f10054R = false;
                if (!this.f10058d.isEmpty()) {
                    t1(M02, 0);
                    u1(M02, i10);
                }
            }
        } else {
            if (z10) {
                this.f10051O.z();
            }
            int w10 = this.f10045I.w();
            if (w10 > 0) {
                this.f10051O.V(w10);
            }
            this.f10051O.g();
            int u11 = this.f10045I.u();
            if (i10 != y1(u11)) {
                u1(u11, i10);
            }
            if (z10) {
                i10 = 1;
            }
            this.f10045I.g();
            this.f10051O.i();
        }
        A0(i10, f11);
    }

    private final void u1(int i10, int i11) {
        int y12 = y1(i10);
        if (y12 != i11) {
            int i12 = i11 - y12;
            int b10 = this.f10063i.b() - 1;
            while (i10 != -1) {
                int y13 = y1(i10) + i12;
                t1(i10, y13);
                int i13 = b10;
                while (true) {
                    if (-1 < i13) {
                        A0 a02 = (A0) this.f10063i.f(i13);
                        if (a02 != null && a02.n(i10, y13)) {
                            b10 = i13 - 1;
                            break;
                        }
                        i13--;
                    } else {
                        break;
                    }
                }
                if (i10 < 0) {
                    i10 = this.f10045I.u();
                } else if (!this.f10045I.J(i10)) {
                    i10 = this.f10045I.P(i10);
                } else {
                    return;
                }
            }
        }
    }

    private final void v0() {
        u0(false);
    }

    private final B0 v1(B0 b02, B0 b03) {
        B0.a builder = b02.builder();
        builder.putAll(b03);
        B0 f10 = builder.f();
        n1(204, C1506p.C());
        w1(f10);
        w1(b03);
        v0();
        return f10;
    }

    private final void w1(Object obj) {
        P0();
        x1(obj);
    }

    private final void x0() {
        v0();
        this.f10057c.b();
        v0();
        this.f10051O.j();
        B0();
        this.f10045I.d();
        this.f10072r = false;
        this.f10078x = C1506p.n(this.f10079y.i());
    }

    private final void y0() {
        if (this.f10047K.Z()) {
            C1485f1 Q10 = this.f10046J.Q();
            this.f10047K = Q10;
            Q10.W0();
            this.f10048L = false;
            this.f10049M = null;
        }
    }

    private final int y1(int i10) {
        int i11;
        if (i10 < 0) {
            A a10 = this.f10070p;
            if (a10 == null || !a10.a(i10)) {
                return 0;
            }
            return a10.c(i10);
        }
        int[] iArr = this.f10069o;
        if (iArr == null || (i11 = iArr[i10]) < 0) {
            return this.f10045I.N(i10);
        }
        return i11;
    }

    private final void z0(boolean z10, A0 a02) {
        this.f10063i.h(this.f10064j);
        this.f10064j = a02;
        this.f10068n.j(this.f10066l);
        this.f10068n.j(this.f10067m);
        this.f10068n.j(this.f10065k);
        if (z10) {
            this.f10065k = 0;
        }
        this.f10066l = 0;
        this.f10067m = 0;
    }

    private final void z1() {
        if (!this.f10073s) {
            C1506p.r("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f10073s = false;
    }

    public Object A() {
        return Q0();
    }

    public C2116a B() {
        return this.f10058d;
    }

    public boolean C(Object obj) {
        if (P0() == obj) {
            return false;
        }
        x1(obj);
        return true;
    }

    public void D() {
        l1(-127, (Object) null, U.f9903a.a(), (Object) null);
    }

    public final boolean D0() {
        if (this.f10038B > 0) {
            return true;
        }
        return false;
    }

    public void E(int i10, Object obj) {
        l1(i10, obj, U.f9903a.a(), (Object) null);
    }

    public F E0() {
        return this.f10062h;
    }

    public void F() {
        l1(125, (Object) null, U.f9903a.c(), (Object) null);
        this.f10073s = true;
    }

    public final L0 F0() {
        z1 z1Var = this.f10042F;
        if (this.f10038B != 0 || !z1Var.d()) {
            return null;
        }
        return (L0) z1Var.e();
    }

    public void G(C6787a aVar) {
        this.f10051O.T(aVar);
    }

    public final Z.a G0() {
        return this.f10050N;
    }

    public void H(int i10, Object obj) {
        if (!f() && this.f10045I.n() == i10 && !C6496s.c(this.f10045I.l(), obj) && this.f10037A < 0) {
            this.f10037A = this.f10045I.k();
            this.f10080z = true;
        }
        l1(i10, (Object) null, U.f9903a.a(), obj);
    }

    public void I() {
        boolean z10;
        if (this.f10066l == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C1506p.r("No nodes can be emitted before calling skipAndEndGroup");
        }
        L0 F02 = F0();
        if (F02 != null) {
            F02.z();
        }
        if (this.f10074t.isEmpty()) {
            k1();
        } else {
            Y0();
        }
    }

    public final C1473b1 I0() {
        return this.f10045I;
    }

    public void J(J0[] j0Arr) {
        B0 b02;
        B0 o02 = o0();
        n1(RCHTTPStatusCodes.CREATED, C1506p.B());
        boolean z10 = true;
        boolean z11 = false;
        if (f()) {
            b02 = v1(o02, C1525z.d(j0Arr, o02, (B0) null, 4, (Object) null));
            this.f10048L = true;
        } else {
            Object A10 = this.f10045I.A(0);
            C6496s.f(A10, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            B0 b03 = (B0) A10;
            Object A11 = this.f10045I.A(1);
            C6496s.f(A11, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            B0 b04 = (B0) A11;
            B0 c10 = C1525z.c(j0Arr, o02, b04);
            if (!i() || this.f10080z || !C6496s.c(b04, c10)) {
                b02 = v1(o02, c10);
                if (!this.f10080z && C6496s.c(b02, b03)) {
                    z10 = false;
                }
                z11 = z10;
            } else {
                j1();
                b02 = b03;
            }
        }
        if (z11 && !f()) {
            b1(b02);
        }
        this.f10079y.j(C1506p.o(this.f10078x));
        this.f10078x = z11;
        this.f10049M = b02;
        l1(202, C1506p.y(), U.f9903a.a(), b02);
    }

    public void K() {
        v0();
        v0();
        this.f10078x = C1506p.n(this.f10079y.i());
        this.f10049M = null;
    }

    public boolean L() {
        if (!i() || this.f10078x) {
            return true;
        }
        L0 F02 = F0();
        if (F02 == null || !F02.l()) {
            return false;
        }
        return true;
    }

    public void L0(List list) {
        try {
            K0(list);
            j0();
        } catch (Throwable th2) {
            W();
            throw th2;
        }
    }

    public void M() {
        v0();
    }

    public void N(J0 j02) {
        G1 g12;
        B0 b02;
        B0 o02 = o0();
        n1(RCHTTPStatusCodes.CREATED, C1506p.B());
        Object A10 = A();
        if (C6496s.c(A10, C1500m.f10026a.a())) {
            g12 = null;
        } else {
            C6496s.f(A10, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            g12 = (G1) A10;
        }
        C1517v b10 = j02.b();
        C6496s.f(b10, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        C6496s.f(j02, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
        G1 b11 = b10.b(j02, g12);
        boolean c10 = C6496s.c(b11, g12);
        if (!c10) {
            r(b11);
        }
        boolean z10 = true;
        boolean z11 = false;
        if (f()) {
            if (j02.a() || !C1525z.a(o02, b10)) {
                o02 = o02.m(b10, b11);
            }
            this.f10048L = true;
        } else {
            C1473b1 b1Var = this.f10045I;
            Object z12 = b1Var.z(b1Var.k());
            C6496s.f(z12, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            B0 b03 = (B0) z12;
            if ((!i() || !c10) && (j02.a() || !C1525z.a(o02, b10))) {
                b02 = o02.m(b10, b11);
            } else {
                b02 = b03;
            }
            if (!this.f10080z && b03 == b02) {
                z10 = false;
            }
            z11 = z10;
        }
        if (z11 && !f()) {
            b1(b02);
        }
        this.f10079y.j(C1506p.o(this.f10078x));
        this.f10078x = z11;
        this.f10049M = b02;
        l1(202, C1506p.y(), U.f9903a.a(), b02);
    }

    public int O() {
        return this.f10055S;
    }

    public final boolean O0() {
        return this.f10043G;
    }

    public r P() {
        a aVar;
        C1513t tVar;
        n1(206, C1506p.D());
        A a10 = null;
        if (f()) {
            C1485f1.t0(this.f10047K, 0, 1, (Object) null);
        }
        Object P02 = P0();
        if (P02 instanceof a) {
            aVar = (a) P02;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            int O10 = O();
            boolean z10 = this.f10071q;
            boolean z11 = this.f10040D;
            F E02 = E0();
            if (E02 instanceof C1513t) {
                tVar = (C1513t) E02;
            } else {
                tVar = null;
            }
            if (tVar != null) {
                a10 = tVar.F();
            }
            aVar = new a(new b(O10, z10, z11, a10));
            x1(aVar);
        }
        aVar.a().w(o0());
        v0();
        return aVar.a();
    }

    public final Object P0() {
        if (f()) {
            A1();
            return C1500m.f10026a.a();
        }
        Object K10 = this.f10045I.K();
        if (!this.f10080z || (K10 instanceof W0)) {
            return K10;
        }
        return C1500m.f10026a.a();
    }

    public void Q() {
        v0();
    }

    public final Object Q0() {
        if (f()) {
            A1();
            return C1500m.f10026a.a();
        }
        Object K10 = this.f10045I.K();
        if (this.f10080z && !(K10 instanceof W0)) {
            return C1500m.f10026a.a();
        }
        if (K10 instanceof U0) {
            return ((U0) K10).b();
        }
        return K10;
    }

    public void R() {
        v0();
    }

    public boolean S(Object obj) {
        if (C6496s.c(P0(), obj)) {
            return false;
        }
        x1(obj);
        return true;
    }

    public void T(int i10) {
        if (this.f10064j != null) {
            l1(i10, (Object) null, U.f9903a.a(), (Object) null);
            return;
        }
        A1();
        this.f10055S = this.f10067m ^ Integer.rotateLeft(Integer.rotateLeft(O(), 3) ^ i10, 3);
        this.f10067m++;
        C1473b1 b1Var = this.f10045I;
        if (f()) {
            b1Var.c();
            this.f10047K.h1(i10, C1500m.f10026a.a());
            z0(false, (A0) null);
        } else if (b1Var.n() != i10 || b1Var.s()) {
            if (!b1Var.H()) {
                int i11 = this.f10065k;
                int k10 = b1Var.k();
                Z0();
                this.f10051O.O(i11, b1Var.S());
                C1506p.N(this.f10074t, k10, b1Var.k());
            }
            b1Var.c();
            this.f10054R = true;
            this.f10049M = null;
            y0();
            C1485f1 f1Var = this.f10047K;
            f1Var.I();
            int a02 = f1Var.a0();
            f1Var.h1(i10, C1500m.f10026a.a());
            this.f10052P = f1Var.E(a02);
            z0(false, (A0) null);
        } else {
            b1Var.U();
            z0(false, (A0) null);
        }
    }

    public final void T0(C6787a aVar) {
        if (this.f10043G) {
            C1506p.r("Preparing a composition while composing is not supported");
        }
        this.f10043G = true;
        try {
            aVar.invoke();
        } finally {
            this.f10043G = false;
        }
    }

    public void U(C6787a aVar) {
        z1();
        if (!f()) {
            C1506p.r("createNode() can only be called when inserting");
        }
        int e10 = this.f10068n.e();
        C1485f1 f1Var = this.f10047K;
        C1477d E10 = f1Var.E(f1Var.c0());
        this.f10066l++;
        this.f10053Q.b(aVar, e10, E10);
    }

    public void V(Object obj, p pVar) {
        if (f()) {
            this.f10053Q.f(obj, pVar);
        } else {
            this.f10051O.Y(obj, pVar);
        }
    }

    public final boolean V0(a0.f fVar) {
        if (!this.f10060f.c()) {
            C1506p.r("Expected applyChanges() to have been called");
        }
        if (fVar.e() <= 0 && this.f10074t.isEmpty() && !this.f10072r) {
            return false;
        }
        s0(fVar, (p) null);
        return this.f10060f.d();
    }

    public int a() {
        if (f()) {
            return -this.f10047K.c0();
        }
        return this.f10045I.u();
    }

    public boolean b(boolean z10) {
        Object P02 = P0();
        if ((P02 instanceof Boolean) && z10 == ((Boolean) P02).booleanValue()) {
            return false;
        }
        x1(Boolean.valueOf(z10));
        return true;
    }

    public boolean c(float f10) {
        Object P02 = P0();
        if ((P02 instanceof Float) && f10 == ((Number) P02).floatValue()) {
            return false;
        }
        x1(Float.valueOf(f10));
        return true;
    }

    public boolean d(int i10) {
        Object P02 = P0();
        if ((P02 instanceof Integer) && i10 == ((Number) P02).intValue()) {
            return false;
        }
        x1(Integer.valueOf(i10));
        return true;
    }

    public boolean e(long j10) {
        Object P02 = P0();
        if ((P02 instanceof Long) && j10 == ((Number) P02).longValue()) {
            return false;
        }
        x1(Long.valueOf(j10));
        return true;
    }

    public boolean f() {
        return this.f10054R;
    }

    public void g(boolean z10) {
        boolean z11;
        if (this.f10066l == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            C1506p.r("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (f()) {
            return;
        }
        if (!z10) {
            k1();
            return;
        }
        int k10 = this.f10045I.k();
        int j10 = this.f10045I.j();
        this.f10051O.d();
        C1506p.N(this.f10074t, k10, j10);
        this.f10045I.T();
    }

    public C1500m h(int i10) {
        T(i10);
        h0();
        return this;
    }

    public final void h1(C1473b1 b1Var) {
        this.f10045I = b1Var;
    }

    public boolean i() {
        L0 F02;
        if (f() || this.f10080z || this.f10078x || (F02 = F0()) == null || F02.n() || this.f10072r) {
            return false;
        }
        return true;
    }

    public final void i0() {
        this.f10077w = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i1() {
        /*
            r9 = this;
            java.util.List r0 = r9.f10074t
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000d
            r9.j1()
            goto L_0x00e1
        L_0x000d:
            Y.b1 r0 = r9.f10045I
            int r1 = r0.n()
            java.lang.Object r2 = r0.o()
            java.lang.Object r3 = r0.l()
            int r4 = r9.f10067m
            r5 = 207(0xcf, float:2.9E-43)
            r6 = 3
            if (r2 != 0) goto L_0x0058
            if (r3 == 0) goto L_0x0047
            if (r1 != r5) goto L_0x0047
            Y.m$a r7 = Y.C1500m.f10026a
            java.lang.Object r7 = r7.a()
            boolean r7 = kotlin.jvm.internal.C6496s.c(r3, r7)
            if (r7 != 0) goto L_0x0047
            int r7 = r3.hashCode()
            int r8 = r9.O()
            int r8 = java.lang.Integer.rotateLeft(r8, r6)
            r7 = r7 ^ r8
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            r7 = r7 ^ r4
            r9.f10055S = r7
            goto L_0x0076
        L_0x0047:
            int r7 = r9.O()
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            r7 = r7 ^ r1
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            r7 = r7 ^ r4
        L_0x0055:
            r9.f10055S = r7
            goto L_0x0076
        L_0x0058:
            boolean r7 = r2 instanceof java.lang.Enum
            if (r7 == 0) goto L_0x0071
            r7 = r2
            java.lang.Enum r7 = (java.lang.Enum) r7
            int r7 = r7.ordinal()
        L_0x0063:
            int r8 = r9.O()
            int r8 = java.lang.Integer.rotateLeft(r8, r6)
            r7 = r7 ^ r8
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            goto L_0x0055
        L_0x0071:
            int r7 = r2.hashCode()
            goto L_0x0063
        L_0x0076:
            boolean r7 = r0.I()
            r8 = 0
            r9.o1(r7, r8)
            r9.Y0()
            r0.g()
            if (r2 != 0) goto L_0x00c4
            if (r3 == 0) goto L_0x00af
            if (r1 != r5) goto L_0x00af
            Y.m$a r0 = Y.C1500m.f10026a
            java.lang.Object r0 = r0.a()
            boolean r0 = kotlin.jvm.internal.C6496s.c(r3, r0)
            if (r0 != 0) goto L_0x00af
            int r0 = r3.hashCode()
            int r1 = r9.O()
            r1 = r1 ^ r4
            int r1 = java.lang.Integer.rotateRight(r1, r6)
            int r0 = java.lang.Integer.hashCode(r0)
            r0 = r0 ^ r1
            int r0 = java.lang.Integer.rotateRight(r0, r6)
            r9.f10055S = r0
            goto L_0x00e1
        L_0x00af:
            int r0 = r9.O()
            r0 = r0 ^ r4
            int r0 = java.lang.Integer.rotateRight(r0, r6)
            int r1 = java.lang.Integer.hashCode(r1)
            r0 = r0 ^ r1
        L_0x00bd:
            int r0 = java.lang.Integer.rotateRight(r0, r6)
            r9.f10055S = r0
            goto L_0x00e1
        L_0x00c4:
            boolean r0 = r2 instanceof java.lang.Enum
            if (r0 == 0) goto L_0x00dc
            java.lang.Enum r2 = (java.lang.Enum) r2
            int r0 = r2.ordinal()
        L_0x00ce:
            int r1 = r9.O()
            int r1 = java.lang.Integer.rotateRight(r1, r6)
            int r0 = java.lang.Integer.hashCode(r0)
            r0 = r0 ^ r1
            goto L_0x00bd
        L_0x00dc:
            int r0 = r2.hashCode()
            goto L_0x00ce
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.C1502n.i1():void");
    }

    public C1483f j() {
        return this.f10056b;
    }

    public Y0 k() {
        L0 l02;
        C1477d dVar;
        C6798l h10;
        L0 l03 = null;
        if (this.f10042F.d()) {
            l02 = (L0) this.f10042F.g();
        } else {
            l02 = null;
        }
        if (l02 != null) {
            l02.E(false);
        }
        if (!(l02 == null || (h10 = l02.h(this.f10039C)) == null)) {
            this.f10051O.f(h10, E0());
        }
        if (l02 != null && !l02.p() && (l02.q() || this.f10071q)) {
            if (l02.i() == null) {
                if (f()) {
                    C1485f1 f1Var = this.f10047K;
                    dVar = f1Var.E(f1Var.c0());
                } else {
                    C1473b1 b1Var = this.f10045I;
                    dVar = b1Var.a(b1Var.u());
                }
                l02.A(dVar);
            }
            l02.C(false);
            l03 = l02;
        }
        u0(false);
        return l03;
    }

    public void l() {
        l1(125, (Object) null, U.f9903a.b(), (Object) null);
        this.f10073s = true;
    }

    public final void l0(a0.f fVar, p pVar) {
        if (!this.f10060f.c()) {
            C1506p.r("Expected applyChanges() to have been called");
        }
        s0(fVar, pVar);
    }

    public Object m(C1517v vVar) {
        return C1525z.b(o0(), vVar);
    }

    public void n(int i10) {
        if (i10 < 0) {
            int i11 = -i10;
            C1485f1 f1Var = this.f10047K;
            while (true) {
                int c02 = f1Var.c0();
                if (c02 > i11) {
                    u0(f1Var.r0(c02));
                } else {
                    return;
                }
            }
        } else {
            if (f()) {
                C1485f1 f1Var2 = this.f10047K;
                while (f()) {
                    u0(f1Var2.r0(f1Var2.c0()));
                }
            }
            C1473b1 b1Var = this.f10045I;
            while (true) {
                int u10 = b1Var.u();
                if (u10 > i10) {
                    u0(b1Var.J(u10));
                } else {
                    return;
                }
            }
        }
    }

    public g o() {
        return this.f10057c.h();
    }

    public C1523y p() {
        return o0();
    }

    public final void p1() {
        this.f10037A = 100;
        this.f10080z = true;
    }

    public void q() {
        z1();
        if (f()) {
            C1506p.r("useNode() called while inserting");
        }
        Object H02 = H0(this.f10045I);
        this.f10051O.v(H02);
        if (this.f10080z && (H02 instanceof C1496k)) {
            this.f10051O.a0(H02);
        }
    }

    public final void q0() {
        this.f10042F.a();
        this.f10074t.clear();
        this.f10060f.a();
        this.f10077w = null;
    }

    public void r(Object obj) {
        s1(obj);
    }

    public final void r0() {
        E1 e12 = E1.f9759a;
        Object a10 = e12.a("Compose:Composer.dispose");
        try {
            this.f10057c.q(this);
            q0();
            j().clear();
            this.f10044H = true;
            C6514M m10 = C6514M.f71813a;
            e12.b(a10);
        } catch (Throwable th2) {
            E1.f9759a.b(a10);
            throw th2;
        }
    }

    public final boolean r1(L0 l02, Object obj) {
        C1477d i10 = l02.i();
        if (i10 == null) {
            return false;
        }
        int d10 = i10.d(this.f10045I.y());
        if (!this.f10043G || d10 < this.f10045I.k()) {
            return false;
        }
        C1506p.E(this.f10074t, d10, l02, obj);
        return true;
    }

    public void s(K0 k02) {
        L0 l02;
        if (k02 instanceof L0) {
            l02 = (L0) k02;
        } else {
            l02 = null;
        }
        if (l02 != null) {
            l02.H(true);
        }
    }

    public final void s1(Object obj) {
        if (obj instanceof T0) {
            if (f()) {
                this.f10051O.M((T0) obj);
            }
            this.f10059e.add(obj);
            obj = new U0((T0) obj, d1());
        }
        x1(obj);
    }

    public void t() {
        v0();
        v0();
        this.f10078x = C1506p.n(this.f10079y.i());
        this.f10049M = null;
    }

    public void u() {
        u0(true);
    }

    public void v() {
        v0();
        L0 F02 = F0();
        if (F02 != null && F02.q()) {
            F02.B(true);
        }
    }

    public void w() {
        this.f10071q = true;
        this.f10040D = true;
        this.f10058d.r();
        this.f10046J.r();
        this.f10047K.v1();
    }

    public final void w0() {
        boolean z10;
        if (this.f10043G || this.f10037A != 100) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            C0.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.f10037A = -1;
        this.f10080z = false;
    }

    public K0 x() {
        return F0();
    }

    public final void x1(Object obj) {
        if (f()) {
            this.f10047K.m1(obj);
        } else if (this.f10045I.r()) {
            int q10 = this.f10045I.q() - 1;
            if (this.f10051O.p()) {
                Z.b bVar = this.f10051O;
                C1473b1 b1Var = this.f10045I;
                bVar.W(obj, b1Var.a(b1Var.u()), q10);
                return;
            }
            this.f10051O.Z(obj, q10);
        } else {
            Z.b bVar2 = this.f10051O;
            C1473b1 b1Var2 = this.f10045I;
            bVar2.a(b1Var2.a(b1Var2.u()), obj);
        }
    }

    public void y() {
        if (this.f10080z && this.f10045I.u() == this.f10037A) {
            this.f10037A = -1;
            this.f10080z = false;
        }
        u0(false);
    }

    public void z(int i10) {
        l1(i10, (Object) null, U.f9903a.a(), (Object) null);
    }

    /* renamed from: Y.n$a */
    private static final class a implements W0 {

        /* renamed from: a  reason: collision with root package name */
        private final b f10081a;

        public a(b bVar) {
            this.f10081a = bVar;
        }

        public final b a() {
            return this.f10081a;
        }

        public void c() {
            this.f10081a.s();
        }

        public void d() {
            this.f10081a.s();
        }

        public void b() {
        }
    }
}
