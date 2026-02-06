package J;

import O0.t;
import O0.v;
import Q0.C;
import Q0.C1321d;
import Q0.C1326i;
import Q0.C1327j;
import Q0.M;
import Ug.K;
import Y.C1500m;
import Y.C1506p;
import Y.C1510r0;
import Y.L;
import Y.M0;
import Y.P;
import Y.Y0;
import Y.o1;
import Y.p1;
import androidx.compose.ui.platform.s1;
import c1.n;
import c1.q;
import i0.r;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.T;
import lf.C6514M;
import lf.w;
import q0.C2421g;
import q0.C2422h;
import q0.C2423i;
import qf.C6658d;
import r0.O1;
import r0.S1;
import r0.g2;
import rf.C6680b;
import yf.C6787a;
import yf.C6798l;
import yf.p;

public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    private final C1321d f3126a;

    /* renamed from: b  reason: collision with root package name */
    private final C1510r0 f3127b = u1.d((Object) null, (o1) null, 2, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    private C1321d f3128c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final r f3129d;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3130a = new a();

        a() {
            super(1);
        }

        public final void a(v vVar) {
            t.w(vVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((v) obj);
            return C6514M.f71813a;
        }
    }

    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d0 f3131a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1321d.c f3132b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ s1 f3133c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d0 d0Var, C1321d.c cVar, s1 s1Var) {
            super(0);
            this.f3131a = d0Var;
            this.f3132b = cVar;
            this.f3133c = s1Var;
        }

        public final void invoke() {
            this.f3131a.o((C1326i) this.f3132b.g(), this.f3133c);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f3134a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1229z f3135b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ B.l f3136c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C1229z zVar, B.l lVar, C6658d dVar) {
            super(2, dVar);
            this.f3135b = zVar;
            this.f3136c = lVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new c(this.f3135b, this.f3136c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((c) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f3134a;
            if (i10 == 0) {
                w.b(obj);
                C1229z zVar = this.f3135b;
                B.l lVar = this.f3136c;
                this.f3134a = 1;
                if (zVar.e(lVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d0 f3137a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1321d.c f3138b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C1229z f3139c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(d0 d0Var, C1321d.c cVar, C1229z zVar) {
            super(1);
            this.f3137a = d0Var;
            this.f3138b = cVar;
            this.f3139c = zVar;
        }

        public final void a(G g10) {
            C c10;
            C c11;
            C c12;
            M b10;
            M b11;
            M b12;
            d0 d0Var = this.f3137a;
            M b13 = ((C1326i) this.f3138b.g()).b();
            C c13 = null;
            if (b13 != null) {
                c10 = b13.d();
            } else {
                c10 = null;
            }
            if (!this.f3139c.f() || (b12 = ((C1326i) this.f3138b.g()).b()) == null) {
                c11 = null;
            } else {
                c11 = b12.a();
            }
            C g11 = d0Var.p(c10, c11);
            if (!this.f3139c.g() || (b11 = ((C1326i) this.f3138b.g()).b()) == null) {
                c12 = null;
            } else {
                c12 = b11.b();
            }
            C g12 = d0Var.p(g11, c12);
            if (this.f3139c.h() && (b10 = ((C1326i) this.f3138b.g()).b()) != null) {
                c13 = b10.c();
            }
            C g13 = d0Var.p(g12, c13);
            if (g13 != null) {
                C1321d.c cVar = this.f3138b;
                g10.a(g13, cVar.h(), cVar.f());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((G) obj);
            return C6514M.f71813a;
        }
    }

    static final class e extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d0 f3140a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f3141b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(d0 d0Var, int i10) {
            super(2);
            this.f3140a = d0Var;
            this.f3141b = i10;
        }

        public final void a(C1500m mVar, int i10) {
            this.f3140a.b(mVar, M0.a(this.f3141b | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class f extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d0 f3142a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6798l f3143b;

        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d0 f3144a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C6798l f3145b;

            public a(d0 d0Var, C6798l lVar) {
                this.f3144a = d0Var;
                this.f3145b = lVar;
            }

            public void dispose() {
                this.f3144a.f3129d.remove(this.f3145b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d0 d0Var, C6798l lVar) {
            super(1);
            this.f3142a = d0Var;
            this.f3143b = lVar;
        }

        /* renamed from: a */
        public final L invoke(Y.M m10) {
            this.f3142a.f3129d.add(this.f3143b);
            return new a(this.f3142a, this.f3143b);
        }
    }

    static final class g extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d0 f3146a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object[] f3147b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6798l f3148c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f3149d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(d0 d0Var, Object[] objArr, C6798l lVar, int i10) {
            super(2);
            this.f3146a = d0Var;
            this.f3147b = objArr;
            this.f3148c = lVar;
            this.f3149d = i10;
        }

        public final void a(C1500m mVar, int i10) {
            d0 d0Var = this.f3146a;
            Object[] objArr = this.f3147b;
            d0Var.c(Arrays.copyOf(objArr, objArr.length), this.f3148c, mVar, M0.a(this.f3149d | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class h extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d0 f3150a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1321d.c f3151b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(d0 d0Var, C1321d.c cVar) {
            super(1);
            this.f3150a = d0Var;
            this.f3151b = cVar;
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
            g2 h10 = this.f3150a.s(this.f3151b);
            if (h10 != null) {
                cVar.O0(h10);
                cVar.y(true);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((androidx.compose.ui.graphics.c) obj);
            return C6514M.f71813a;
        }
    }

    public static final class i implements g2 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ S1 f3152a;

        i(S1 s12) {
            this.f3152a = s12;
        }

        /* renamed from: createOutline-Pq9zytI  reason: not valid java name */
        public O1 m8createOutlinePq9zytI(long j10, c1.t tVar, c1.d dVar) {
            return new O1.a(this.f3152a);
        }
    }

    static final class j extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d0 f3153a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(d0 d0Var) {
            super(0);
            this.f3153a = d0Var;
        }

        /* renamed from: a */
        public final Boolean invoke() {
            C1321d dVar;
            Q0.K l10;
            C1321d m10 = this.f3153a.m();
            Q0.L n10 = this.f3153a.n();
            if (n10 == null || (l10 = n10.l()) == null) {
                dVar = null;
            } else {
                dVar = l10.j();
            }
            return Boolean.valueOf(C6496s.c(m10, dVar));
        }
    }

    static final class k extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c1.p f3154a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(c1.p pVar) {
            super(0);
            this.f3154a = pVar;
        }

        public final long a() {
            return this.f3154a.j();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return n.b(a());
        }
    }

    static final class l extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final l f3155a = new l();

        l() {
            super(0);
        }

        public final long a() {
            return n.f19226b.a();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return n.b(a());
        }
    }

    static final class m extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final m f3156a = new m();

        m() {
            super(0);
        }

        public final long a() {
            return n.f19226b.a();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return n.b(a());
        }
    }

    public d0(C1321d dVar) {
        C d10;
        this.f3126a = dVar;
        C1321d.a aVar = new C1321d.a(dVar);
        List d11 = dVar.d(0, dVar.length());
        int size = d11.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1321d.c cVar = (C1321d.c) d11.get(i10);
            M b10 = ((C1326i) cVar.g()).b();
            if (!(b10 == null || (d10 = b10.d()) == null)) {
                aVar.b(d10, cVar.h(), cVar.f());
            }
        }
        this.f3128c = aVar.n();
        this.f3129d = p1.f();
    }

    /* access modifiers changed from: private */
    public final void c(Object[] objArr, C6798l lVar, C1500m mVar, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        C1500m h10 = mVar.h(-2083052099);
        if ((i10 & 48) == 0) {
            if (h10.C(lVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 384) == 0) {
            if (h10.C(this)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        h10.E(-416630839, Integer.valueOf(objArr.length));
        for (Object C10 : objArr) {
            if (h10.C(C10)) {
                i12 = 4;
            } else {
                i12 = 0;
            }
            i11 |= i12;
        }
        h10.Q();
        if ((i11 & 14) == 0) {
            i11 |= 2;
        }
        if ((i11 & 147) != 146 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(-2083052099, i11, -1, "androidx.compose.foundation.text.TextLinkScope.StyleAnnotation (TextLinkScope.kt:298)");
            }
            T t10 = new T(2);
            t10.a(lVar);
            t10.b(objArr);
            Object[] d10 = t10.d(new Object[t10.c()]);
            boolean C11 = h10.C(this);
            if ((i11 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10 | C11;
            Object A10 = h10.A();
            if (z11 || A10 == C1500m.f10026a.a()) {
                A10 = new f(this, lVar);
                h10.r(A10);
            }
            P.d(d10, (C6798l) A10, h10, 0);
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new g(this, objArr, lVar, i10));
        }
    }

    private final C1321d.c j(C1321d.c cVar, Q0.L l10) {
        int p10 = Q0.L.p(l10, l10.n() - 1, false, 2, (Object) null);
        if (cVar.h() >= p10) {
            return null;
        }
        return C1321d.c.e(cVar, (Object) null, 0, Math.min(cVar.f(), p10), (String) null, 11, (Object) null);
    }

    private final k0.i k(k0.i iVar, C1321d.c cVar) {
        return androidx.compose.ui.graphics.b.a(iVar, new h(this, cVar));
    }

    /* access modifiers changed from: private */
    public final void o(C1326i iVar, s1 s1Var) {
        C1327j a10;
        C6514M m10;
        if (iVar instanceof C1326i.b) {
            C1327j a11 = iVar.a();
            if (a11 != null) {
                a11.a(iVar);
                m10 = C6514M.f71813a;
            } else {
                m10 = null;
            }
            if (m10 == null) {
                try {
                    s1Var.a(((C1326i.b) iVar).c());
                } catch (IllegalArgumentException unused) {
                }
            }
        } else if ((iVar instanceof C1326i.a) && (a10 = iVar.a()) != null) {
            a10.a(iVar);
        }
    }

    /* access modifiers changed from: private */
    public final C p(C c10, C c11) {
        C y10;
        if (c10 == null || (y10 = c10.y(c11)) == null) {
            return c11;
        }
        return y10;
    }

    private final S1 q(C1321d.c cVar) {
        Q0.L n10;
        float f10;
        S1 s12 = null;
        if (((Boolean) l().invoke()).booleanValue() && (n10 = n()) != null) {
            C1321d.c j10 = j(cVar, n10);
            if (j10 == null) {
                return null;
            }
            s12 = n10.z(j10.h(), j10.f());
            C2423i d10 = n10.d(j10.h());
            C2423i d11 = n10.d(j10.f() - 1);
            if (n10.q(j10.h()) == n10.q(j10.f() - 1)) {
                f10 = Math.min(d11.i(), d10.i());
            } else {
                f10 = 0.0f;
            }
            s12.i(C2421g.u(C2422h.a(f10, d10.l())));
        }
        return s12;
    }

    /* access modifiers changed from: private */
    public final g2 s(C1321d.c cVar) {
        S1 q10 = q(cVar);
        if (q10 != null) {
            return new i(q10);
        }
        return null;
    }

    private final k0.i t(k0.i iVar, C1321d.c cVar) {
        return iVar.h(new j0(new c0(this, cVar)));
    }

    /* access modifiers changed from: private */
    public static final h0 u(d0 d0Var, C1321d.c cVar, i0 i0Var) {
        Q0.L n10 = d0Var.n();
        if (n10 == null) {
            return i0Var.a(0, 0, l.f3155a);
        }
        C1321d.c j10 = d0Var.j(cVar, n10);
        if (j10 == null) {
            return i0Var.a(0, 0, m.f3156a);
        }
        c1.p b10 = q.b(n10.z(j10.h(), j10.f()).getBounds());
        return i0Var.a(b10.k(), b10.f(), new k(b10));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: yf.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(Y.C1500m r26, int r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r27
            r2 = 1154651354(0x44d294da, float:1684.6516)
            r3 = r26
            Y.m r3 = r3.h(r2)
            r4 = r1 & 6
            r5 = 2
            if (r4 != 0) goto L_0x001d
            boolean r4 = r3.C(r0)
            if (r4 == 0) goto L_0x001a
            r4 = 4
            goto L_0x001b
        L_0x001a:
            r4 = r5
        L_0x001b:
            r4 = r4 | r1
            goto L_0x001e
        L_0x001d:
            r4 = r1
        L_0x001e:
            r6 = r4 & 3
            if (r6 != r5) goto L_0x002e
            boolean r6 = r3.i()
            if (r6 != 0) goto L_0x0029
            goto L_0x002e
        L_0x0029:
            r3.I()
            goto L_0x01e4
        L_0x002e:
            boolean r6 = Y.C1506p.H()
            if (r6 == 0) goto L_0x003a
            r6 = -1
            java.lang.String r7 = "androidx.compose.foundation.text.TextLinkScope.LinksComposables (TextLinkScope.kt:200)"
            Y.C1506p.Q(r2, r4, r6, r7)
        L_0x003a:
            Y.I0 r2 = androidx.compose.ui.platform.C1644k0.q()
            java.lang.Object r2 = r3.m(r2)
            androidx.compose.ui.platform.s1 r2 = (androidx.compose.ui.platform.s1) r2
            Q0.d r6 = r0.f3128c
            int r7 = r6.length()
            r8 = 0
            java.util.List r6 = r6.d(r8, r7)
            int r7 = r6.size()
            r9 = r8
        L_0x0054:
            if (r9 >= r7) goto L_0x01db
            java.lang.Object r10 = r6.get(r9)
            Q0.d$c r10 = (Q0.C1321d.c) r10
            int r11 = r10.h()
            int r12 = r10.f()
            if (r11 == r12) goto L_0x01cd
            r11 = 1385536272(0x52959b10, float:3.21275822E11)
            r3.T(r11)
            java.lang.Object r11 = r3.A()
            Y.m$a r12 = Y.C1500m.f10026a
            java.lang.Object r13 = r12.a()
            if (r11 != r13) goto L_0x007f
            B.l r11 = B.k.a()
            r3.r(r11)
        L_0x007f:
            B.l r11 = (B.l) r11
            k0.i$a r13 = k0.i.f23074a
            k0.i r13 = r0.k(r13, r10)
            k0.i r13 = r0.t(r13, r10)
            r15 = 0
            k0.i r13 = androidx.compose.foundation.h.b(r13, r11, r8, r5, r15)
            D0.v$a r14 = D0.C1130v.f1507a
            D0.v r14 = r14.b()
            k0.i r13 = D0.C1131w.b(r13, r14, r8, r5, r15)
            J.d0$a r14 = J.d0.a.f3130a
            r5 = 1
            k0.i r13 = O0.m.d(r13, r8, r14, r5, r15)
            boolean r5 = r3.C(r0)
            boolean r14 = r3.S(r10)
            r5 = r5 | r14
            boolean r14 = r3.C(r2)
            r5 = r5 | r14
            java.lang.Object r14 = r3.A()
            if (r5 != 0) goto L_0x00bb
            java.lang.Object r5 = r12.a()
            if (r14 != r5) goto L_0x00c3
        L_0x00bb:
            J.d0$b r14 = new J.d0$b
            r14.<init>(r0, r10, r2)
            r3.r(r14)
        L_0x00c3:
            r22 = r14
            yf.a r22 = (yf.C6787a) r22
            r23 = 252(0xfc, float:3.53E-43)
            r24 = 0
            r5 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r14 = r11
            r15 = r5
            k0.i r5 = androidx.compose.foundation.d.f(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            androidx.compose.foundation.layout.d.a(r5, r3, r8)
            java.lang.Object r5 = r10.g()
            Q0.i r5 = (Q0.C1326i) r5
            Q0.M r5 = r5.b()
            boolean r5 = J.e0.b(r5)
            if (r5 != 0) goto L_0x01c0
            r5 = 1386296950(0x52a13676, float:3.46201719E11)
            r3.T(r5)
            java.lang.Object r5 = r3.A()
            java.lang.Object r13 = r12.a()
            if (r5 != r13) goto L_0x0109
            J.z r5 = new J.z
            r5.<init>()
            r3.r(r5)
        L_0x0109:
            J.z r5 = (J.C1229z) r5
            java.lang.Object r13 = r3.A()
            java.lang.Object r14 = r12.a()
            if (r13 != r14) goto L_0x011f
            J.d0$c r13 = new J.d0$c
            r14 = 0
            r13.<init>(r5, r11, r14)
            r3.r(r13)
            goto L_0x0120
        L_0x011f:
            r14 = 0
        L_0x0120:
            yf.p r13 = (yf.p) r13
            r15 = 6
            Y.P.g(r11, r13, r3, r15)
            boolean r11 = r5.g()
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r11)
            boolean r11 = r5.f()
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r11)
            boolean r11 = r5.h()
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r11)
            java.lang.Object r11 = r10.g()
            Q0.i r11 = (Q0.C1326i) r11
            Q0.M r11 = r11.b()
            if (r11 == 0) goto L_0x0151
            Q0.C r11 = r11.d()
            r19 = r11
            goto L_0x0153
        L_0x0151:
            r19 = r14
        L_0x0153:
            java.lang.Object r11 = r10.g()
            Q0.i r11 = (Q0.C1326i) r11
            Q0.M r11 = r11.b()
            if (r11 == 0) goto L_0x0166
            Q0.C r11 = r11.a()
            r20 = r11
            goto L_0x0168
        L_0x0166:
            r20 = r14
        L_0x0168:
            java.lang.Object r11 = r10.g()
            Q0.i r11 = (Q0.C1326i) r11
            Q0.M r11 = r11.b()
            if (r11 == 0) goto L_0x017b
            Q0.C r11 = r11.b()
            r21 = r11
            goto L_0x017d
        L_0x017b:
            r21 = r14
        L_0x017d:
            java.lang.Object r11 = r10.g()
            Q0.i r11 = (Q0.C1326i) r11
            Q0.M r11 = r11.b()
            if (r11 == 0) goto L_0x0190
            Q0.C r11 = r11.c()
            r22 = r11
            goto L_0x0192
        L_0x0190:
            r22 = r14
        L_0x0192:
            java.lang.Object[] r11 = new java.lang.Object[]{r16, r17, r18, r19, r20, r21, r22}
            boolean r13 = r3.C(r0)
            boolean r14 = r3.S(r10)
            r13 = r13 | r14
            java.lang.Object r14 = r3.A()
            if (r13 != 0) goto L_0x01ab
            java.lang.Object r12 = r12.a()
            if (r14 != r12) goto L_0x01b3
        L_0x01ab:
            J.d0$d r14 = new J.d0$d
            r14.<init>(r0, r10, r5)
            r3.r(r14)
        L_0x01b3:
            yf.l r14 = (yf.C6798l) r14
            int r5 = r4 << 6
            r5 = r5 & 896(0x380, float:1.256E-42)
            r0.c(r11, r14, r3, r5)
            r3.M()
            goto L_0x01c9
        L_0x01c0:
            r5 = 1388165134(0x52bdb80e, float:4.07418372E11)
            r3.T(r5)
            r3.M()
        L_0x01c9:
            r3.M()
            goto L_0x01d6
        L_0x01cd:
            r5 = 1388179022(0x52bdee4e, float:4.07873454E11)
            r3.T(r5)
            r3.M()
        L_0x01d6:
            int r9 = r9 + 1
            r5 = 2
            goto L_0x0054
        L_0x01db:
            boolean r2 = Y.C1506p.H()
            if (r2 == 0) goto L_0x01e4
            Y.C1506p.P()
        L_0x01e4:
            Y.Y0 r2 = r3.k()
            if (r2 == 0) goto L_0x01f2
            J.d0$e r3 = new J.d0$e
            r3.<init>(r0, r1)
            r2.a(r3)
        L_0x01f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J.d0.b(Y.m, int):void");
    }

    public final C1321d i() {
        C1321d dVar;
        if (this.f3129d.isEmpty()) {
            dVar = this.f3128c;
        } else {
            C1321d.a aVar = new C1321d.a(0, 1, (DefaultConstructorMarker) null);
            aVar.f(this.f3126a);
            G g10 = new G(aVar);
            r rVar = this.f3129d;
            int size = rVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((C6798l) rVar.get(i10)).invoke(g10);
            }
            dVar = aVar.n();
        }
        this.f3128c = dVar;
        return dVar;
    }

    public final C6787a l() {
        return new j(this);
    }

    public final C1321d m() {
        return this.f3128c;
    }

    public final Q0.L n() {
        return (Q0.L) this.f3127b.getValue();
    }

    public final void r(Q0.L l10) {
        this.f3127b.setValue(l10);
    }
}
