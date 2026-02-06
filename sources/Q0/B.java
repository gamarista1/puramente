package Q0;

import Q0.C1321d;
import Q0.C1326i;
import Q0.Q;
import V0.h;
import V0.n;
import V0.p;
import X0.d;
import X0.e;
import b1.C1869a;
import b1.C1876h;
import b1.j;
import b1.k;
import b1.l;
import b1.o;
import b1.q;
import b1.s;
import c1.v;
import h0.C2026j;
import h0.C2027k;
import h0.C2028l;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import mf.C6565s;
import q0.C2421g;
import q0.C2422h;
import r0.C2544x0;
import r0.C2550z0;
import r0.e2;
import t0.C2606g;
import yf.C6798l;
import yf.p;

public abstract class B {

    /* renamed from: a  reason: collision with root package name */
    private static final C2026j f5160a = C2027k.a(C1300a.f5201a, b.f5202a);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final C2026j f5161b = C2027k.a(C1301c.f5203a, C1302d.f5204a);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final C2026j f5162c = C2027k.a(C1303e.f5205a, C1304f.f5207a);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final C2026j f5163d = C2027k.a(R.f5199a, S.f5200a);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final C2026j f5164e = C2027k.a(P.f5197a, Q.f5198a);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final C2026j f5165f = C2027k.a(C1313o.f5217a, C1314p.f5218a);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final C2026j f5166g = C2027k.a(C1307i.f5211a, C1308j.f5212a);

    /* renamed from: h  reason: collision with root package name */
    private static final C2026j f5167h = C2027k.a(x.f5227a, y.f5228a);

    /* renamed from: i  reason: collision with root package name */
    private static final C2026j f5168i = C2027k.a(C0131B.f5183a, C.f5184a);

    /* renamed from: j  reason: collision with root package name */
    private static final C2026j f5169j = C2027k.a(J.f5191a, K.f5192a);

    /* renamed from: k  reason: collision with root package name */
    private static final C2026j f5170k = C2027k.a(D.f5185a, E.f5186a);

    /* renamed from: l  reason: collision with root package name */
    private static final C2026j f5171l = C2027k.a(F.f5187a, G.f5188a);

    /* renamed from: m  reason: collision with root package name */
    private static final C2026j f5172m = C2027k.a(H.f5189a, I.f5190a);

    /* renamed from: n  reason: collision with root package name */
    private static final C2026j f5173n = C2027k.a(C1311m.f5215a, C1312n.f5216a);

    /* renamed from: o  reason: collision with root package name */
    private static final C2026j f5174o = C2027k.a(C1305g.f5209a, C1306h.f5210a);

    /* renamed from: p  reason: collision with root package name */
    private static final C2026j f5175p = C2027k.a(L.f5193a, M.f5194a);

    /* renamed from: q  reason: collision with root package name */
    private static final C2026j f5176q = C2027k.a(z.f5229a, A.f5182a);

    /* renamed from: r  reason: collision with root package name */
    private static final C1332o f5177r = a(C1309k.f5213a, C1310l.f5214a);

    /* renamed from: s  reason: collision with root package name */
    private static final C1332o f5178s = a(N.f5195a, O.f5196a);

    /* renamed from: t  reason: collision with root package name */
    private static final C1332o f5179t = a(v.f5225a, w.f5226a);

    /* renamed from: u  reason: collision with root package name */
    private static final C2026j f5180u = C2027k.a(C1315q.f5219a, C1316r.f5220a);

    /* renamed from: v  reason: collision with root package name */
    private static final C2026j f5181v = C2027k.a(C1317s.f5221a, t.f5222a);

    static final class A extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final A f5182a = new A();

        A() {
            super(1);
        }

        /* renamed from: a */
        public final e2 invoke(Object obj) {
            C2544x0 x0Var;
            C2421g gVar;
            C6496s.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            C2026j t10 = B.t(C2544x0.f25560b);
            Boolean bool = Boolean.FALSE;
            Float f10 = null;
            if ((!C6496s.c(obj2, bool) || (t10 instanceof C1332o)) && obj2 != null) {
                x0Var = (C2544x0) t10.b(obj2);
            } else {
                x0Var = null;
            }
            C6496s.e(x0Var);
            long y10 = x0Var.y();
            Object obj3 = list.get(1);
            C2026j s10 = B.s(C2421g.f25320b);
            if ((!C6496s.c(obj3, bool) || (s10 instanceof C1332o)) && obj3 != null) {
                gVar = (C2421g) s10.b(obj3);
            } else {
                gVar = null;
            }
            C6496s.e(gVar);
            long v10 = gVar.v();
            Object obj4 = list.get(2);
            if (obj4 != null) {
                f10 = (Float) obj4;
            }
            C6496s.e(f10);
            return new e2(y10, v10, f10.floatValue(), (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: Q0.B$B  reason: collision with other inner class name */
    static final class C0131B extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final C0131B f5183a = new C0131B();

        C0131B() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(C2028l lVar, C c10) {
            C2028l lVar2 = lVar;
            C2544x0 k10 = C2544x0.k(c10.g());
            C2544x0.a aVar = C2544x0.f25560b;
            Object y10 = B.y(k10, B.t(aVar), lVar2);
            c1.v b10 = c1.v.b(c10.k());
            v.a aVar2 = c1.v.f19242b;
            return C6565s.h(y10, B.y(b10, B.r(aVar2), lVar2), B.y(c10.n(), B.k(V0.p.f8210b), lVar2), B.x(c10.l()), B.x(c10.m()), B.x(-1), B.x(c10.j()), B.y(c1.v.b(c10.o()), B.r(aVar2), lVar2), B.y(c10.e(), B.n(C1869a.f19059b), lVar2), B.y(c10.u(), B.p(o.f19137c), lVar2), B.y(c10.p(), B.m(e.f9568c), lVar2), B.y(C2544x0.k(c10.d()), B.t(aVar), lVar2), B.y(c10.s(), B.o(k.f19119b), lVar2), B.y(c10.r(), B.u(e2.f25491d), lVar2));
        }
    }

    static final class C extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final C f5184a = new C();

        C() {
            super(1);
        }

        /* renamed from: a */
        public final C invoke(Object obj) {
            C2544x0 x0Var;
            c1.v vVar;
            V0.p pVar;
            n nVar;
            V0.o oVar;
            String str;
            c1.v vVar2;
            C1869a aVar;
            o oVar2;
            e eVar;
            C2544x0 x0Var2;
            k kVar;
            e2 e2Var;
            Object obj2 = obj;
            C6496s.f(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj2;
            Object obj3 = list.get(0);
            C2544x0.a aVar2 = C2544x0.f25560b;
            C2026j t10 = B.t(aVar2);
            Boolean bool = Boolean.FALSE;
            if ((!C6496s.c(obj3, bool) || (t10 instanceof C1332o)) && obj3 != null) {
                x0Var = (C2544x0) t10.b(obj3);
            } else {
                x0Var = null;
            }
            C6496s.e(x0Var);
            long y10 = x0Var.y();
            Object obj4 = list.get(1);
            v.a aVar3 = c1.v.f19242b;
            C2026j r10 = B.r(aVar3);
            if ((!C6496s.c(obj4, bool) || (r10 instanceof C1332o)) && obj4 != null) {
                vVar = (c1.v) r10.b(obj4);
            } else {
                vVar = null;
            }
            C6496s.e(vVar);
            long k10 = vVar.k();
            Object obj5 = list.get(2);
            C2026j k11 = B.k(V0.p.f8210b);
            if ((!C6496s.c(obj5, bool) || (k11 instanceof C1332o)) && obj5 != null) {
                pVar = (V0.p) k11.b(obj5);
            } else {
                pVar = null;
            }
            Object obj6 = list.get(3);
            if (obj6 != null) {
                nVar = (n) obj6;
            } else {
                nVar = null;
            }
            Object obj7 = list.get(4);
            if (obj7 != null) {
                oVar = (V0.o) obj7;
            } else {
                oVar = null;
            }
            Object obj8 = list.get(6);
            if (obj8 != null) {
                str = (String) obj8;
            } else {
                str = null;
            }
            Object obj9 = list.get(7);
            C2026j r11 = B.r(aVar3);
            if ((!C6496s.c(obj9, bool) || (r11 instanceof C1332o)) && obj9 != null) {
                vVar2 = (c1.v) r11.b(obj9);
            } else {
                vVar2 = null;
            }
            C6496s.e(vVar2);
            long k12 = vVar2.k();
            Object obj10 = list.get(8);
            C2026j n10 = B.n(C1869a.f19059b);
            if ((!C6496s.c(obj10, bool) || (n10 instanceof C1332o)) && obj10 != null) {
                aVar = (C1869a) n10.b(obj10);
            } else {
                aVar = null;
            }
            Object obj11 = list.get(9);
            C2026j p10 = B.p(o.f19137c);
            if ((!C6496s.c(obj11, bool) || (p10 instanceof C1332o)) && obj11 != null) {
                oVar2 = (o) p10.b(obj11);
            } else {
                oVar2 = null;
            }
            Object obj12 = list.get(10);
            C2026j m10 = B.m(e.f9568c);
            if ((!C6496s.c(obj12, bool) || (m10 instanceof C1332o)) && obj12 != null) {
                eVar = (e) m10.b(obj12);
            } else {
                eVar = null;
            }
            Object obj13 = list.get(11);
            C2026j t11 = B.t(aVar2);
            if ((!C6496s.c(obj13, bool) || (t11 instanceof C1332o)) && obj13 != null) {
                x0Var2 = (C2544x0) t11.b(obj13);
            } else {
                x0Var2 = null;
            }
            C6496s.e(x0Var2);
            long y11 = x0Var2.y();
            Object obj14 = list.get(12);
            C2026j o10 = B.o(k.f19119b);
            if ((!C6496s.c(obj14, bool) || (o10 instanceof C1332o)) && obj14 != null) {
                kVar = (k) o10.b(obj14);
            } else {
                kVar = null;
            }
            Object obj15 = list.get(13);
            C2026j u10 = B.u(e2.f25491d);
            if ((!C6496s.c(obj15, bool) || (u10 instanceof C1332o)) && obj15 != null) {
                e2Var = (e2) u10.b(obj15);
            } else {
                e2Var = null;
            }
            return new C(y10, k10, pVar, nVar, oVar, (h) null, str, k12, aVar, oVar2, eVar, y11, kVar, e2Var, (z) null, (C2606g) null, 49184, (DefaultConstructorMarker) null);
        }
    }

    static final class D extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final D f5185a = new D();

        D() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(C2028l lVar, k kVar) {
            return Integer.valueOf(kVar.e());
        }
    }

    static final class E extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final E f5186a = new E();

        E() {
            super(1);
        }

        /* renamed from: a */
        public final k invoke(Object obj) {
            C6496s.f(obj, "null cannot be cast to non-null type kotlin.Int");
            return new k(((Integer) obj).intValue());
        }
    }

    static final class F extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final F f5187a = new F();

        F() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(C2028l lVar, o oVar) {
            return C6565s.h(Float.valueOf(oVar.b()), Float.valueOf(oVar.c()));
        }
    }

    static final class G extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final G f5188a = new G();

        G() {
            super(1);
        }

        /* renamed from: a */
        public final o invoke(Object obj) {
            C6496s.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
            List list = (List) obj;
            return new o(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
        }
    }

    static final class H extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final H f5189a = new H();

        H() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(C2028l lVar, q qVar) {
            c1.v b10 = c1.v.b(qVar.b());
            v.a aVar = c1.v.f19242b;
            return C6565s.h(B.y(b10, B.r(aVar), lVar), B.y(c1.v.b(qVar.c()), B.r(aVar), lVar));
        }
    }

    static final class I extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final I f5190a = new I();

        I() {
            super(1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: c1.v} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final b1.q invoke(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>"
                kotlin.jvm.internal.C6496s.f(r10, r0)
                java.util.List r10 = (java.util.List) r10
                b1.q r6 = new b1.q
                r0 = 0
                java.lang.Object r0 = r10.get(r0)
                c1.v$a r1 = c1.v.f19242b
                h0.j r2 = Q0.B.r(r1)
                java.lang.Boolean r3 = java.lang.Boolean.FALSE
                boolean r4 = kotlin.jvm.internal.C6496s.c(r0, r3)
                r5 = 0
                if (r4 == 0) goto L_0x0023
                boolean r4 = r2 instanceof Q0.C1332o
                if (r4 != 0) goto L_0x0023
            L_0x0021:
                r0 = r5
                goto L_0x002b
            L_0x0023:
                if (r0 == 0) goto L_0x0021
                java.lang.Object r0 = r2.b(r0)
                c1.v r0 = (c1.v) r0
            L_0x002b:
                kotlin.jvm.internal.C6496s.e(r0)
                long r7 = r0.k()
                r0 = 1
                java.lang.Object r10 = r10.get(r0)
                h0.j r0 = Q0.B.r(r1)
                boolean r1 = kotlin.jvm.internal.C6496s.c(r10, r3)
                if (r1 == 0) goto L_0x0046
                boolean r1 = r0 instanceof Q0.C1332o
                if (r1 != 0) goto L_0x0046
                goto L_0x004f
            L_0x0046:
                if (r10 == 0) goto L_0x004f
                java.lang.Object r10 = r0.b(r10)
                r5 = r10
                c1.v r5 = (c1.v) r5
            L_0x004f:
                kotlin.jvm.internal.C6496s.e(r5)
                long r3 = r5.k()
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r3, r5)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Q0.B.I.invoke(java.lang.Object):b1.q");
        }
    }

    static final class J extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final J f5191a = new J();

        J() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(C2028l lVar, M m10) {
            return C6565s.h(B.y(m10.d(), B.v(), lVar), B.y(m10.a(), B.v(), lVar), B.y(m10.b(), B.v(), lVar), B.y(m10.c(), B.v(), lVar));
        }
    }

    static final class K extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final K f5192a = new K();

        K() {
            super(1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: Q0.C} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final Q0.M invoke(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"
                kotlin.jvm.internal.C6496s.f(r8, r0)
                java.util.List r8 = (java.util.List) r8
                r0 = 0
                java.lang.Object r0 = r8.get(r0)
                h0.j r1 = Q0.B.v()
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                boolean r3 = kotlin.jvm.internal.C6496s.c(r0, r2)
                r4 = 0
                if (r3 == 0) goto L_0x001f
                boolean r3 = r1 instanceof Q0.C1332o
                if (r3 != 0) goto L_0x001f
            L_0x001d:
                r0 = r4
                goto L_0x0027
            L_0x001f:
                if (r0 == 0) goto L_0x001d
                java.lang.Object r0 = r1.b(r0)
                Q0.C r0 = (Q0.C) r0
            L_0x0027:
                r1 = 1
                java.lang.Object r1 = r8.get(r1)
                h0.j r3 = Q0.B.v()
                boolean r5 = kotlin.jvm.internal.C6496s.c(r1, r2)
                if (r5 == 0) goto L_0x003c
                boolean r5 = r3 instanceof Q0.C1332o
                if (r5 != 0) goto L_0x003c
            L_0x003a:
                r1 = r4
                goto L_0x0044
            L_0x003c:
                if (r1 == 0) goto L_0x003a
                java.lang.Object r1 = r3.b(r1)
                Q0.C r1 = (Q0.C) r1
            L_0x0044:
                r3 = 2
                java.lang.Object r3 = r8.get(r3)
                h0.j r5 = Q0.B.v()
                boolean r6 = kotlin.jvm.internal.C6496s.c(r3, r2)
                if (r6 == 0) goto L_0x0059
                boolean r6 = r5 instanceof Q0.C1332o
                if (r6 != 0) goto L_0x0059
            L_0x0057:
                r3 = r4
                goto L_0x0061
            L_0x0059:
                if (r3 == 0) goto L_0x0057
                java.lang.Object r3 = r5.b(r3)
                Q0.C r3 = (Q0.C) r3
            L_0x0061:
                r5 = 3
                java.lang.Object r8 = r8.get(r5)
                h0.j r5 = Q0.B.v()
                boolean r2 = kotlin.jvm.internal.C6496s.c(r8, r2)
                if (r2 == 0) goto L_0x0075
                boolean r2 = r5 instanceof Q0.C1332o
                if (r2 != 0) goto L_0x0075
                goto L_0x007e
            L_0x0075:
                if (r8 == 0) goto L_0x007e
                java.lang.Object r8 = r5.b(r8)
                r4 = r8
                Q0.C r4 = (Q0.C) r4
            L_0x007e:
                Q0.M r8 = new Q0.M
                r8.<init>(r0, r1, r3, r4)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: Q0.B.K.invoke(java.lang.Object):Q0.M");
        }
    }

    static final class L extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final L f5193a = new L();

        L() {
            super(2);
        }

        public final Object a(C2028l lVar, long j10) {
            return C6565s.h(B.x(Integer.valueOf(Q.n(j10))), B.x(Integer.valueOf(Q.i(j10))));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((C2028l) obj, ((Q) obj2).r());
        }
    }

    static final class M extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final M f5194a = new M();

        M() {
            super(1);
        }

        /* renamed from: a */
        public final Q invoke(Object obj) {
            Integer num;
            C6496s.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Integer num2 = null;
            if (obj2 != null) {
                num = (Integer) obj2;
            } else {
                num = null;
            }
            C6496s.e(num);
            int intValue = num.intValue();
            Object obj3 = list.get(1);
            if (obj3 != null) {
                num2 = (Integer) obj3;
            }
            C6496s.e(num2);
            return Q.b(S.b(intValue, num2.intValue()));
        }
    }

    static final class N extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final N f5195a = new N();

        N() {
            super(2);
        }

        public final Object a(C2028l lVar, long j10) {
            if (c1.v.e(j10, c1.v.f19242b.a())) {
                return Boolean.FALSE;
            }
            return C6565s.h(B.x(Float.valueOf(c1.v.h(j10))), B.x(c1.x.d(c1.v.g(j10))));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((C2028l) obj, ((c1.v) obj2).k());
        }
    }

    static final class O extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final O f5196a = new O();

        O() {
            super(1);
        }

        /* renamed from: a */
        public final c1.v invoke(Object obj) {
            Float f10;
            if (C6496s.c(obj, Boolean.FALSE)) {
                return c1.v.b(c1.v.f19242b.a());
            }
            C6496s.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            c1.x xVar = null;
            if (obj2 != null) {
                f10 = (Float) obj2;
            } else {
                f10 = null;
            }
            C6496s.e(f10);
            float floatValue = f10.floatValue();
            Object obj3 = list.get(1);
            if (obj3 != null) {
                xVar = (c1.x) obj3;
            }
            C6496s.e(xVar);
            return c1.v.b(c1.w.a(floatValue, xVar.j()));
        }
    }

    static final class P extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final P f5197a = new P();

        P() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(C2028l lVar, W w10) {
            return B.x(w10.a());
        }
    }

    static final class Q extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final Q f5198a = new Q();

        Q() {
            super(1);
        }

        /* renamed from: a */
        public final W invoke(Object obj) {
            String str;
            if (obj != null) {
                str = (String) obj;
            } else {
                str = null;
            }
            C6496s.e(str);
            return new W(str);
        }
    }

    static final class R extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final R f5199a = new R();

        R() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(C2028l lVar, X x10) {
            return B.x(x10.a());
        }
    }

    static final class S extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final S f5200a = new S();

        S() {
            super(1);
        }

        /* renamed from: a */
        public final X invoke(Object obj) {
            String str;
            if (obj != null) {
                str = (String) obj;
            } else {
                str = null;
            }
            C6496s.e(str);
            return new X(str);
        }
    }

    /* renamed from: Q0.B$a  reason: case insensitive filesystem */
    static final class C1300a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final C1300a f5201a = new C1300a();

        C1300a() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(C2028l lVar, C1321d dVar) {
            return C6565s.h(B.x(dVar.j()), B.y(dVar.g(), B.f5161b, lVar), B.y(dVar.e(), B.f5161b, lVar), B.y(dVar.b(), B.f5161b, lVar));
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f5202a = new b();

        b() {
            super(1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.util.List} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final Q0.C1321d invoke(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"
                kotlin.jvm.internal.C6496s.f(r7, r0)
                java.util.List r7 = (java.util.List) r7
                r0 = 1
                java.lang.Object r0 = r7.get(r0)
                h0.j r1 = Q0.B.f5161b
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                boolean r3 = kotlin.jvm.internal.C6496s.c(r0, r2)
                r4 = 0
                if (r3 == 0) goto L_0x001f
                boolean r3 = r1 instanceof Q0.C1332o
                if (r3 != 0) goto L_0x001f
            L_0x001d:
                r0 = r4
                goto L_0x0027
            L_0x001f:
                if (r0 == 0) goto L_0x001d
                java.lang.Object r0 = r1.b(r0)
                java.util.List r0 = (java.util.List) r0
            L_0x0027:
                r1 = 2
                java.lang.Object r1 = r7.get(r1)
                h0.j r3 = Q0.B.f5161b
                boolean r5 = kotlin.jvm.internal.C6496s.c(r1, r2)
                if (r5 == 0) goto L_0x003c
                boolean r5 = r3 instanceof Q0.C1332o
                if (r5 != 0) goto L_0x003c
            L_0x003a:
                r1 = r4
                goto L_0x0044
            L_0x003c:
                if (r1 == 0) goto L_0x003a
                java.lang.Object r1 = r3.b(r1)
                java.util.List r1 = (java.util.List) r1
            L_0x0044:
                r3 = 0
                java.lang.Object r3 = r7.get(r3)
                if (r3 == 0) goto L_0x004e
                java.lang.String r3 = (java.lang.String) r3
                goto L_0x004f
            L_0x004e:
                r3 = r4
            L_0x004f:
                kotlin.jvm.internal.C6496s.e(r3)
                if (r0 == 0) goto L_0x0060
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r5 = r0.isEmpty()
                if (r5 == 0) goto L_0x005d
                r0 = r4
            L_0x005d:
                java.util.List r0 = (java.util.List) r0
                goto L_0x0061
            L_0x0060:
                r0 = r4
            L_0x0061:
                if (r1 == 0) goto L_0x006f
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r5 = r1.isEmpty()
                if (r5 == 0) goto L_0x006c
                r1 = r4
            L_0x006c:
                java.util.List r1 = (java.util.List) r1
                goto L_0x0070
            L_0x006f:
                r1 = r4
            L_0x0070:
                r5 = 3
                java.lang.Object r7 = r7.get(r5)
                h0.j r5 = Q0.B.f5161b
                boolean r2 = kotlin.jvm.internal.C6496s.c(r7, r2)
                if (r2 == 0) goto L_0x0084
                boolean r2 = r5 instanceof Q0.C1332o
                if (r2 != 0) goto L_0x0084
                goto L_0x008d
            L_0x0084:
                if (r7 == 0) goto L_0x008d
                java.lang.Object r7 = r5.b(r7)
                r4 = r7
                java.util.List r4 = (java.util.List) r4
            L_0x008d:
                Q0.d r7 = new Q0.d
                r7.<init>(r3, r0, r1, r4)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: Q0.B.b.invoke(java.lang.Object):Q0.d");
        }
    }

    /* renamed from: Q0.B$c  reason: case insensitive filesystem */
    static final class C1301c extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final C1301c f5203a = new C1301c();

        C1301c() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(C2028l lVar, List list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(B.y((C1321d.c) list.get(i10), B.f5162c, lVar));
            }
            return arrayList;
        }
    }

    /* renamed from: Q0.B$d  reason: case insensitive filesystem */
    static final class C1302d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final C1302d f5204a = new C1302d();

        C1302d() {
            super(1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: Q0.d$c} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List invoke(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>"
                kotlin.jvm.internal.C6496s.f(r8, r0)
                java.util.List r8 = (java.util.List) r8
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r8.size()
                r0.<init>(r1)
                int r1 = r8.size()
                r2 = 0
            L_0x0015:
                if (r2 >= r1) goto L_0x003f
                java.lang.Object r3 = r8.get(r2)
                h0.j r4 = Q0.B.f5162c
                java.lang.Boolean r5 = java.lang.Boolean.FALSE
                boolean r5 = kotlin.jvm.internal.C6496s.c(r3, r5)
                r6 = 0
                if (r5 == 0) goto L_0x002d
                boolean r5 = r4 instanceof Q0.C1332o
                if (r5 != 0) goto L_0x002d
                goto L_0x0036
            L_0x002d:
                if (r3 == 0) goto L_0x0036
                java.lang.Object r3 = r4.b(r3)
                r6 = r3
                Q0.d$c r6 = (Q0.C1321d.c) r6
            L_0x0036:
                kotlin.jvm.internal.C6496s.e(r6)
                r0.add(r6)
                int r2 = r2 + 1
                goto L_0x0015
            L_0x003f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Q0.B.C1302d.invoke(java.lang.Object):java.util.List");
        }
    }

    /* renamed from: Q0.B$e  reason: case insensitive filesystem */
    static final class C1303e extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final C1303e f5205a = new C1303e();

        /* renamed from: Q0.B$e$a */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f5206a;

            /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    Q0.f[] r0 = Q0.C1323f.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    Q0.f r1 = Q0.C1323f.Paragraph     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    Q0.f r1 = Q0.C1323f.Span     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    Q0.f r1 = Q0.C1323f.VerbatimTts     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    Q0.f r1 = Q0.C1323f.Url     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    Q0.f r1 = Q0.C1323f.Link     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    Q0.f r1 = Q0.C1323f.Clickable     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    Q0.f r1 = Q0.C1323f.String     // Catch:{ NoSuchFieldError -> 0x0046 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                    r2 = 7
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                L_0x0046:
                    f5206a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: Q0.B.C1303e.a.<clinit>():void");
            }
        }

        C1303e() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(C2028l lVar, C1321d.c cVar) {
            C1323f fVar;
            Object obj;
            Object g10 = cVar.g();
            if (g10 instanceof C1338v) {
                fVar = C1323f.Paragraph;
            } else if (g10 instanceof C) {
                fVar = C1323f.Span;
            } else if (g10 instanceof X) {
                fVar = C1323f.VerbatimTts;
            } else if (g10 instanceof W) {
                fVar = C1323f.Url;
            } else if (g10 instanceof C1326i.b) {
                fVar = C1323f.Link;
            } else if (g10 instanceof C1326i.a) {
                fVar = C1323f.Clickable;
            } else {
                fVar = C1323f.String;
            }
            switch (a.f5206a[fVar.ordinal()]) {
                case 1:
                    Object g11 = cVar.g();
                    C6496s.f(g11, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                    obj = B.y((C1338v) g11, B.i(), lVar);
                    break;
                case 2:
                    Object g12 = cVar.g();
                    C6496s.f(g12, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                    obj = B.y((C) g12, B.v(), lVar);
                    break;
                case 3:
                    Object g13 = cVar.g();
                    C6496s.f(g13, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                    obj = B.y((X) g13, B.f5163d, lVar);
                    break;
                case 4:
                    Object g14 = cVar.g();
                    C6496s.f(g14, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                    obj = B.y((W) g14, B.f5164e, lVar);
                    break;
                case 5:
                    Object g15 = cVar.g();
                    C6496s.f(g15, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                    obj = B.y((C1326i.b) g15, B.f5165f, lVar);
                    break;
                case 6:
                    Object g16 = cVar.g();
                    C6496s.f(g16, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                    obj = B.y((C1326i.a) g16, B.f5166g, lVar);
                    break;
                case 7:
                    obj = B.x(cVar.g());
                    break;
                default:
                    throw new C6535s();
            }
            return C6565s.h(B.x(fVar), obj, B.x(Integer.valueOf(cVar.h())), B.x(Integer.valueOf(cVar.f())), B.x(cVar.i()));
        }
    }

    /* renamed from: Q0.B$f  reason: case insensitive filesystem */
    static final class C1304f extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final C1304f f5207a = new C1304f();

        /* renamed from: Q0.B$f$a */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f5208a;

            /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    Q0.f[] r0 = Q0.C1323f.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    Q0.f r1 = Q0.C1323f.Paragraph     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    Q0.f r1 = Q0.C1323f.Span     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    Q0.f r1 = Q0.C1323f.VerbatimTts     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    Q0.f r1 = Q0.C1323f.Url     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    Q0.f r1 = Q0.C1323f.Link     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    Q0.f r1 = Q0.C1323f.Clickable     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    Q0.f r1 = Q0.C1323f.String     // Catch:{ NoSuchFieldError -> 0x0046 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                    r2 = 7
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                L_0x0046:
                    f5208a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: Q0.B.C1304f.a.<clinit>():void");
            }
        }

        C1304f() {
            super(1);
        }

        /* renamed from: a */
        public final C1321d.c invoke(Object obj) {
            C1323f fVar;
            Integer num;
            Integer num2;
            String str;
            C6496s.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Object obj3 = null;
            if (obj2 != null) {
                fVar = (C1323f) obj2;
            } else {
                fVar = null;
            }
            C6496s.e(fVar);
            Object obj4 = list.get(2);
            if (obj4 != null) {
                num = (Integer) obj4;
            } else {
                num = null;
            }
            C6496s.e(num);
            int intValue = num.intValue();
            Object obj5 = list.get(3);
            if (obj5 != null) {
                num2 = (Integer) obj5;
            } else {
                num2 = null;
            }
            C6496s.e(num2);
            int intValue2 = num2.intValue();
            Object obj6 = list.get(4);
            if (obj6 != null) {
                str = (String) obj6;
            } else {
                str = null;
            }
            C6496s.e(str);
            switch (a.f5208a[fVar.ordinal()]) {
                case 1:
                    Object obj7 = list.get(1);
                    C2026j i10 = B.i();
                    if ((!C6496s.c(obj7, Boolean.FALSE) || (i10 instanceof C1332o)) && obj7 != null) {
                        obj3 = (C1338v) i10.b(obj7);
                    }
                    C6496s.e(obj3);
                    return new C1321d.c(obj3, intValue, intValue2, str);
                case 2:
                    Object obj8 = list.get(1);
                    C2026j v10 = B.v();
                    if ((!C6496s.c(obj8, Boolean.FALSE) || (v10 instanceof C1332o)) && obj8 != null) {
                        obj3 = (C) v10.b(obj8);
                    }
                    C6496s.e(obj3);
                    return new C1321d.c(obj3, intValue, intValue2, str);
                case 3:
                    Object obj9 = list.get(1);
                    C2026j g10 = B.f5163d;
                    if ((!C6496s.c(obj9, Boolean.FALSE) || (g10 instanceof C1332o)) && obj9 != null) {
                        obj3 = (X) g10.b(obj9);
                    }
                    C6496s.e(obj3);
                    return new C1321d.c(obj3, intValue, intValue2, str);
                case 4:
                    Object obj10 = list.get(1);
                    C2026j f10 = B.f5164e;
                    if ((!C6496s.c(obj10, Boolean.FALSE) || (f10 instanceof C1332o)) && obj10 != null) {
                        obj3 = (W) f10.b(obj10);
                    }
                    C6496s.e(obj3);
                    return new C1321d.c(obj3, intValue, intValue2, str);
                case 5:
                    Object obj11 = list.get(1);
                    C2026j e10 = B.f5165f;
                    if ((!C6496s.c(obj11, Boolean.FALSE) || (e10 instanceof C1332o)) && obj11 != null) {
                        obj3 = (C1326i.b) e10.b(obj11);
                    }
                    C6496s.e(obj3);
                    return new C1321d.c(obj3, intValue, intValue2, str);
                case 6:
                    Object obj12 = list.get(1);
                    C2026j d10 = B.f5166g;
                    if ((!C6496s.c(obj12, Boolean.FALSE) || (d10 instanceof C1332o)) && obj12 != null) {
                        obj3 = (C1326i.a) d10.b(obj12);
                    }
                    C6496s.e(obj3);
                    return new C1321d.c(obj3, intValue, intValue2, str);
                case 7:
                    Object obj13 = list.get(1);
                    if (obj13 != null) {
                        obj3 = (String) obj13;
                    }
                    C6496s.e(obj3);
                    return new C1321d.c(obj3, intValue, intValue2, str);
                default:
                    throw new C6535s();
            }
        }
    }

    /* renamed from: Q0.B$g  reason: case insensitive filesystem */
    static final class C1305g extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final C1305g f5209a = new C1305g();

        C1305g() {
            super(2);
        }

        public final Object a(C2028l lVar, float f10) {
            return Float.valueOf(f10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((C2028l) obj, ((C1869a) obj2).h());
        }
    }

    /* renamed from: Q0.B$h  reason: case insensitive filesystem */
    static final class C1306h extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final C1306h f5210a = new C1306h();

        C1306h() {
            super(1);
        }

        /* renamed from: a */
        public final C1869a invoke(Object obj) {
            C6496s.f(obj, "null cannot be cast to non-null type kotlin.Float");
            return C1869a.b(C1869a.c(((Float) obj).floatValue()));
        }
    }

    /* renamed from: Q0.B$i  reason: case insensitive filesystem */
    static final class C1307i extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final C1307i f5211a = new C1307i();

        C1307i() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(C2028l lVar, C1326i.a aVar) {
            return C6565s.h(B.x(aVar.c()), B.y(aVar.b(), B.w(), lVar));
        }
    }

    /* renamed from: Q0.B$j  reason: case insensitive filesystem */
    static final class C1308j extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final C1308j f5212a = new C1308j();

        C1308j() {
            super(1);
        }

        /* renamed from: a */
        public final C1326i.a invoke(Object obj) {
            String str;
            M m10;
            C6496s.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            if (obj2 != null) {
                str = (String) obj2;
            } else {
                str = null;
            }
            C6496s.e(str);
            Object obj3 = list.get(1);
            C2026j w10 = B.w();
            if ((!C6496s.c(obj3, Boolean.FALSE) || (w10 instanceof C1332o)) && obj3 != null) {
                m10 = (M) w10.b(obj3);
            } else {
                m10 = null;
            }
            return new C1326i.a(str, m10, (C1327j) null);
        }
    }

    /* renamed from: Q0.B$k  reason: case insensitive filesystem */
    static final class C1309k extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final C1309k f5213a = new C1309k();

        C1309k() {
            super(2);
        }

        public final Object a(C2028l lVar, long j10) {
            if (j10 == 16) {
                return Boolean.FALSE;
            }
            return Integer.valueOf(C2550z0.k(j10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((C2028l) obj, ((C2544x0) obj2).y());
        }
    }

    /* renamed from: Q0.B$l  reason: case insensitive filesystem */
    static final class C1310l extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final C1310l f5214a = new C1310l();

        C1310l() {
            super(1);
        }

        /* renamed from: a */
        public final C2544x0 invoke(Object obj) {
            long b10;
            if (C6496s.c(obj, Boolean.FALSE)) {
                b10 = C2544x0.f25560b.h();
            } else {
                C6496s.f(obj, "null cannot be cast to non-null type kotlin.Int");
                b10 = C2550z0.b(((Integer) obj).intValue());
            }
            return C2544x0.k(b10);
        }
    }

    /* renamed from: Q0.B$m  reason: case insensitive filesystem */
    static final class C1311m extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final C1311m f5215a = new C1311m();

        C1311m() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(C2028l lVar, V0.p pVar) {
            return Integer.valueOf(pVar.m());
        }
    }

    /* renamed from: Q0.B$n  reason: case insensitive filesystem */
    static final class C1312n extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final C1312n f5216a = new C1312n();

        C1312n() {
            super(1);
        }

        /* renamed from: a */
        public final V0.p invoke(Object obj) {
            C6496s.f(obj, "null cannot be cast to non-null type kotlin.Int");
            return new V0.p(((Integer) obj).intValue());
        }
    }

    /* renamed from: Q0.B$o  reason: case insensitive filesystem */
    static final class C1313o extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final C1313o f5217a = new C1313o();

        C1313o() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(C2028l lVar, C1326i.b bVar) {
            return C6565s.h(B.x(bVar.c()), B.y(bVar.b(), B.w(), lVar));
        }
    }

    /* renamed from: Q0.B$p  reason: case insensitive filesystem */
    static final class C1314p extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final C1314p f5218a = new C1314p();

        C1314p() {
            super(1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: Q0.M} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final Q0.C1326i.b invoke(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"
                kotlin.jvm.internal.C6496s.f(r9, r0)
                java.util.List r9 = (java.util.List) r9
                r0 = 0
                java.lang.Object r0 = r9.get(r0)
                r1 = 0
                if (r0 == 0) goto L_0x0013
                java.lang.String r0 = (java.lang.String) r0
                r3 = r0
                goto L_0x0014
            L_0x0013:
                r3 = r1
            L_0x0014:
                kotlin.jvm.internal.C6496s.e(r3)
                r0 = 1
                java.lang.Object r9 = r9.get(r0)
                h0.j r0 = Q0.B.w()
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                boolean r2 = kotlin.jvm.internal.C6496s.c(r9, r2)
                if (r2 == 0) goto L_0x002e
                boolean r2 = r0 instanceof Q0.C1332o
                if (r2 != 0) goto L_0x002e
            L_0x002c:
                r4 = r1
                goto L_0x0038
            L_0x002e:
                if (r9 == 0) goto L_0x002c
                java.lang.Object r9 = r0.b(r9)
                r1 = r9
                Q0.M r1 = (Q0.M) r1
                goto L_0x002c
            L_0x0038:
                Q0.i$b r9 = new Q0.i$b
                r6 = 4
                r7 = 0
                r5 = 0
                r2 = r9
                r2.<init>(r3, r4, r5, r6, r7)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: Q0.B.C1314p.invoke(java.lang.Object):Q0.i$b");
        }
    }

    /* renamed from: Q0.B$q  reason: case insensitive filesystem */
    static final class C1315q extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final C1315q f5219a = new C1315q();

        C1315q() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(C2028l lVar, e eVar) {
            List k10 = eVar.k();
            ArrayList arrayList = new ArrayList(k10.size());
            int size = k10.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(B.y((d) k10.get(i10), B.l(d.f9566b), lVar));
            }
            return arrayList;
        }
    }

    /* renamed from: Q0.B$r  reason: case insensitive filesystem */
    static final class C1316r extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final C1316r f5220a = new C1316r();

        C1316r() {
            super(1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: X0.d} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final X0.e invoke(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>"
                kotlin.jvm.internal.C6496s.f(r8, r0)
                java.util.List r8 = (java.util.List) r8
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r8.size()
                r0.<init>(r1)
                int r1 = r8.size()
                r2 = 0
            L_0x0015:
                if (r2 >= r1) goto L_0x0041
                java.lang.Object r3 = r8.get(r2)
                X0.d$a r4 = X0.d.f9566b
                h0.j r4 = Q0.B.l(r4)
                java.lang.Boolean r5 = java.lang.Boolean.FALSE
                boolean r5 = kotlin.jvm.internal.C6496s.c(r3, r5)
                r6 = 0
                if (r5 == 0) goto L_0x002f
                boolean r5 = r4 instanceof Q0.C1332o
                if (r5 != 0) goto L_0x002f
                goto L_0x0038
            L_0x002f:
                if (r3 == 0) goto L_0x0038
                java.lang.Object r3 = r4.b(r3)
                r6 = r3
                X0.d r6 = (X0.d) r6
            L_0x0038:
                kotlin.jvm.internal.C6496s.e(r6)
                r0.add(r6)
                int r2 = r2 + 1
                goto L_0x0015
            L_0x0041:
                X0.e r8 = new X0.e
                r8.<init>(r0)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: Q0.B.C1316r.invoke(java.lang.Object):X0.e");
        }
    }

    /* renamed from: Q0.B$s  reason: case insensitive filesystem */
    static final class C1317s extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final C1317s f5221a = new C1317s();

        C1317s() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(C2028l lVar, d dVar) {
            return dVar.b();
        }
    }

    static final class t extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final t f5222a = new t();

        t() {
            super(1);
        }

        /* renamed from: a */
        public final d invoke(Object obj) {
            C6496s.f(obj, "null cannot be cast to non-null type kotlin.String");
            return new d((String) obj);
        }
    }

    public static final class u implements C1332o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f5223a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6798l f5224b;

        u(p pVar, C6798l lVar) {
            this.f5223a = pVar;
            this.f5224b = lVar;
        }

        public Object a(C2028l lVar, Object obj) {
            return this.f5223a.invoke(lVar, obj);
        }

        public Object b(Object obj) {
            return this.f5224b.invoke(obj);
        }
    }

    static final class v extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final v f5225a = new v();

        v() {
            super(2);
        }

        public final Object a(C2028l lVar, long j10) {
            if (C2421g.j(j10, C2421g.f25320b.b())) {
                return Boolean.FALSE;
            }
            return C6565s.h(B.x(Float.valueOf(C2421g.m(j10))), B.x(Float.valueOf(C2421g.n(j10))));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((C2028l) obj, ((C2421g) obj2).v());
        }
    }

    static final class w extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final w f5226a = new w();

        w() {
            super(1);
        }

        /* renamed from: a */
        public final C2421g invoke(Object obj) {
            Float f10;
            if (C6496s.c(obj, Boolean.FALSE)) {
                return C2421g.d(C2421g.f25320b.b());
            }
            C6496s.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f11 = null;
            if (obj2 != null) {
                f10 = (Float) obj2;
            } else {
                f10 = null;
            }
            C6496s.e(f10);
            float floatValue = f10.floatValue();
            Object obj3 = list.get(1);
            if (obj3 != null) {
                f11 = (Float) obj3;
            }
            C6496s.e(f11);
            return C2421g.d(C2422h.a(floatValue, f11.floatValue()));
        }
    }

    static final class x extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final x f5227a = new x();

        x() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(C2028l lVar, C1338v vVar) {
            return C6565s.h(B.x(j.h(vVar.h())), B.x(l.g(vVar.i())), B.y(c1.v.b(vVar.e()), B.r(c1.v.f19242b), lVar), B.y(vVar.j(), B.q(q.f19141c), lVar));
        }
    }

    static final class y extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final y f5228a = new y();

        y() {
            super(1);
        }

        /* renamed from: a */
        public final C1338v invoke(Object obj) {
            j jVar;
            l lVar;
            c1.v vVar;
            q qVar;
            Object obj2 = obj;
            C6496s.f(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj2;
            Object obj3 = list.get(0);
            if (obj3 != null) {
                jVar = (j) obj3;
            } else {
                jVar = null;
            }
            C6496s.e(jVar);
            int n10 = jVar.n();
            Object obj4 = list.get(1);
            if (obj4 != null) {
                lVar = (l) obj4;
            } else {
                lVar = null;
            }
            C6496s.e(lVar);
            int m10 = lVar.m();
            Object obj5 = list.get(2);
            C2026j r10 = B.r(c1.v.f19242b);
            Boolean bool = Boolean.FALSE;
            if ((!C6496s.c(obj5, bool) || (r10 instanceof C1332o)) && obj5 != null) {
                vVar = (c1.v) r10.b(obj5);
            } else {
                vVar = null;
            }
            C6496s.e(vVar);
            long k10 = vVar.k();
            Object obj6 = list.get(3);
            C2026j q10 = B.q(q.f19141c);
            if ((!C6496s.c(obj6, bool) || (q10 instanceof C1332o)) && obj6 != null) {
                qVar = (q) q10.b(obj6);
            } else {
                qVar = null;
            }
            return new C1338v(n10, m10, k10, qVar, (y) null, (C1876h) null, 0, 0, (s) null, 496, (DefaultConstructorMarker) null);
        }
    }

    static final class z extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final z f5229a = new z();

        z() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(C2028l lVar, e2 e2Var) {
            return C6565s.h(B.y(C2544x0.k(e2Var.c()), B.t(C2544x0.f25560b), lVar), B.y(C2421g.d(e2Var.d()), B.s(C2421g.f25320b), lVar), B.x(Float.valueOf(e2Var.b())));
        }
    }

    private static final C1332o a(p pVar, C6798l lVar) {
        return new u(pVar, lVar);
    }

    public static final C2026j h() {
        return f5160a;
    }

    public static final C2026j i() {
        return f5167h;
    }

    public static final C2026j j(Q.a aVar) {
        return f5175p;
    }

    public static final C2026j k(p.a aVar) {
        return f5173n;
    }

    public static final C2026j l(d.a aVar) {
        return f5181v;
    }

    public static final C2026j m(e.a aVar) {
        return f5180u;
    }

    public static final C2026j n(C1869a.C0329a aVar) {
        return f5174o;
    }

    public static final C2026j o(k.a aVar) {
        return f5170k;
    }

    public static final C2026j p(o.a aVar) {
        return f5171l;
    }

    public static final C2026j q(q.a aVar) {
        return f5172m;
    }

    public static final C2026j r(v.a aVar) {
        return f5178s;
    }

    public static final C2026j s(C2421g.a aVar) {
        return f5179t;
    }

    public static final C2026j t(C2544x0.a aVar) {
        return f5177r;
    }

    public static final C2026j u(e2.a aVar) {
        return f5176q;
    }

    public static final C2026j v() {
        return f5168i;
    }

    public static final C2026j w() {
        return f5169j;
    }

    public static final Object y(Object obj, C2026j jVar, C2028l lVar) {
        Object a10;
        if (obj == null || (a10 = jVar.a(lVar, obj)) == null) {
            return Boolean.FALSE;
        }
        return a10;
    }

    public static final Object x(Object obj) {
        return obj;
    }
}
