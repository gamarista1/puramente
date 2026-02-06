package qg;

import Fg.B0;
import Fg.C5359a;
import Fg.C5366d0;
import Fg.C5374h0;
import Fg.C5397y;
import Fg.I;
import Fg.J0;
import Fg.M0;
import Fg.N0;
import Fg.O0;
import Fg.Q;
import Fg.S;
import Fg.W;
import Fg.v0;
import Hg.i;
import Hg.j;
import Hg.l;
import Kg.d;
import Lf.o;
import Of.C5483a;
import Of.C5484b;
import Of.C5486d;
import Of.C5487e;
import Of.C5488f;
import Of.C5490h;
import Of.C5491i;
import Of.C5494l;
import Of.C5495m;
import Of.C5497o;
import Of.C5498p;
import Of.C5501t;
import Of.C5502u;
import Of.C5504w;
import Of.C5507z;
import Of.D;
import Of.E;
import Of.H;
import Of.M;
import Of.N;
import Of.V;
import Of.X;
import Of.Y;
import Of.Z;
import Of.a0;
import Of.b0;
import Of.c0;
import Of.l0;
import Of.m0;
import Of.q0;
import Of.t0;
import Of.u0;
import Pf.c;
import Pf.e;
import Sg.C5538a;
import Sg.p;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6531o;
import lf.C6535s;
import mf.C6565s;
import ng.f;
import ng.h;
import qg.n;
import rg.C6691i;
import tg.C6735a;
import tg.C6736b;
import tg.g;
import tg.s;
import vg.C6755e;
import yf.C6798l;

public final class u extends n implements w {

    /* renamed from: m  reason: collision with root package name */
    private final z f72712m;

    /* renamed from: n  reason: collision with root package name */
    private final Lazy f72713n = C6531o.b(new o(this));

    private final class a implements C5497o {

        /* renamed from: qg.u$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C1055a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f72715a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    qg.E[] r0 = qg.E.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    qg.E r1 = qg.E.PRETTY     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    qg.E r1 = qg.E.DEBUG     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    qg.E r1 = qg.E.NONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f72715a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: qg.u.a.C1055a.<clinit>():void");
            }
        }

        public a() {
        }

        private final void t(Y y10, StringBuilder sb2, String str) {
            int i10 = C1055a.f72715a[u.this.P0().ordinal()];
            if (i10 == 1) {
                u.this.w1(y10, sb2);
                sb2.append(str + " for ");
                u uVar = u.this;
                Z X10 = y10.X();
                C6496s.g(X10, "getCorrespondingProperty(...)");
                uVar.h2(X10, sb2);
            } else if (i10 == 2) {
                p(y10, sb2);
            } else if (i10 != 3) {
                throw new C6535s();
            }
        }

        public void A(t0 t0Var, StringBuilder sb2) {
            C6496s.h(t0Var, "descriptor");
            C6496s.h(sb2, "builder");
            u.this.B2(t0Var, true, sb2, true);
        }

        public /* bridge */ /* synthetic */ Object a(C5494l lVar, Object obj) {
            o(lVar, (StringBuilder) obj);
            return C6514M.f71813a;
        }

        public /* bridge */ /* synthetic */ Object b(t0 t0Var, Object obj) {
            A(t0Var, (StringBuilder) obj);
            return C6514M.f71813a;
        }

        public /* bridge */ /* synthetic */ Object c(C5487e eVar, Object obj) {
            n(eVar, (StringBuilder) obj);
            return C6514M.f71813a;
        }

        public /* bridge */ /* synthetic */ Object d(c0 c0Var, Object obj) {
            x(c0Var, (StringBuilder) obj);
            return C6514M.f71813a;
        }

        public /* bridge */ /* synthetic */ Object e(H h10, Object obj) {
            q(h10, (StringBuilder) obj);
            return C6514M.f71813a;
        }

        public /* bridge */ /* synthetic */ Object f(C5507z zVar, Object obj) {
            p(zVar, (StringBuilder) obj);
            return C6514M.f71813a;
        }

        public /* bridge */ /* synthetic */ Object g(a0 a0Var, Object obj) {
            v(a0Var, (StringBuilder) obj);
            return C6514M.f71813a;
        }

        public /* bridge */ /* synthetic */ Object h(N n10, Object obj) {
            r(n10, (StringBuilder) obj);
            return C6514M.f71813a;
        }

        public /* bridge */ /* synthetic */ Object i(l0 l0Var, Object obj) {
            y(l0Var, (StringBuilder) obj);
            return C6514M.f71813a;
        }

        public /* bridge */ /* synthetic */ Object j(b0 b0Var, Object obj) {
            w(b0Var, (StringBuilder) obj);
            return C6514M.f71813a;
        }

        public /* bridge */ /* synthetic */ Object k(m0 m0Var, Object obj) {
            z(m0Var, (StringBuilder) obj);
            return C6514M.f71813a;
        }

        public /* bridge */ /* synthetic */ Object l(Z z10, Object obj) {
            u(z10, (StringBuilder) obj);
            return C6514M.f71813a;
        }

        public /* bridge */ /* synthetic */ Object m(V v10, Object obj) {
            s(v10, (StringBuilder) obj);
            return C6514M.f71813a;
        }

        public void n(C5487e eVar, StringBuilder sb2) {
            C6496s.h(eVar, "descriptor");
            C6496s.h(sb2, "builder");
            u.this.C1(eVar, sb2);
        }

        public void o(C5494l lVar, StringBuilder sb2) {
            C6496s.h(lVar, "constructorDescriptor");
            C6496s.h(sb2, "builder");
            u.this.H1(lVar, sb2);
        }

        public void p(C5507z zVar, StringBuilder sb2) {
            C6496s.h(zVar, "descriptor");
            C6496s.h(sb2, "builder");
            u.this.P1(zVar, sb2);
        }

        public void q(H h10, StringBuilder sb2) {
            C6496s.h(h10, "descriptor");
            C6496s.h(sb2, "builder");
            u.this.Z1(h10, sb2, true);
        }

        public void r(N n10, StringBuilder sb2) {
            C6496s.h(n10, "descriptor");
            C6496s.h(sb2, "builder");
            u.this.d2(n10, sb2);
        }

        public void s(V v10, StringBuilder sb2) {
            C6496s.h(v10, "descriptor");
            C6496s.h(sb2, "builder");
            u.this.f2(v10, sb2);
        }

        public void u(Z z10, StringBuilder sb2) {
            C6496s.h(z10, "descriptor");
            C6496s.h(sb2, "builder");
            u.this.h2(z10, sb2);
        }

        public void v(a0 a0Var, StringBuilder sb2) {
            C6496s.h(a0Var, "descriptor");
            C6496s.h(sb2, "builder");
            t(a0Var, sb2, "getter");
        }

        public void w(b0 b0Var, StringBuilder sb2) {
            C6496s.h(b0Var, "descriptor");
            C6496s.h(sb2, "builder");
            t(b0Var, sb2, "setter");
        }

        public void x(c0 c0Var, StringBuilder sb2) {
            C6496s.h(c0Var, "descriptor");
            C6496s.h(sb2, "builder");
            sb2.append(c0Var.getName());
        }

        public void y(l0 l0Var, StringBuilder sb2) {
            C6496s.h(l0Var, "descriptor");
            C6496s.h(sb2, "builder");
            u.this.q2(l0Var, sb2);
        }

        public void z(m0 m0Var, StringBuilder sb2) {
            C6496s.h(m0Var, "descriptor");
            C6496s.h(sb2, "builder");
            u.this.w2(m0Var, sb2, true);
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f72716a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f72717b;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
        static {
            /*
                qg.F[] r0 = qg.F.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                qg.F r2 = qg.F.f72667a     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                qg.F r3 = qg.F.f72668b     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f72716a = r0
                qg.D[] r0 = qg.D.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                qg.D r3 = qg.D.ALL     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                qg.D r1 = qg.D.ONLY_NON_SYNTHESIZED     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                qg.D r1 = qg.D.NONE     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                f72717b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qg.u.b.<clinit>():void");
        }
    }

    public u(z zVar) {
        C6496s.h(zVar, "options");
        this.f72712m = zVar;
        zVar.p0();
    }

    static /* synthetic */ void A1(u uVar, StringBuilder sb2, Pf.a aVar, e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            eVar = null;
        }
        uVar.z1(sb2, aVar, eVar);
    }

    static /* synthetic */ void A2(u uVar, u0 u0Var, StringBuilder sb2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        uVar.z2(u0Var, sb2, z10);
    }

    private final void B1(C5491i iVar, StringBuilder sb2) {
        List q10 = iVar.q();
        C6496s.g(q10, "getDeclaredTypeParameters(...)");
        List parameters = iVar.l().getParameters();
        C6496s.g(parameters, "getParameters(...)");
        if (j1() && iVar.A() && parameters.size() > q10.size()) {
            sb2.append(" /*captured type parameters: ");
            x2(sb2, parameters.subList(q10.size(), parameters.size()));
            sb2.append("*/");
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B2(Of.t0 r10, boolean r11, java.lang.StringBuilder r12, boolean r13) {
        /*
            r9 = this;
            if (r13 == 0) goto L_0x0010
            java.lang.String r0 = "value-parameter"
            java.lang.String r0 = r9.S1(r0)
            r12.append(r0)
            java.lang.String r0 = " "
            r12.append(r0)
        L_0x0010:
            boolean r0 = r9.j1()
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = "/*"
            r12.append(r0)
            int r0 = r10.getIndex()
            r12.append(r0)
            java.lang.String r0 = "*/ "
            r12.append(r0)
        L_0x0027:
            r5 = 2
            r6 = 0
            r4 = 0
            r1 = r9
            r2 = r12
            r3 = r10
            A1(r1, r2, r3, r4, r5, r6)
            boolean r0 = r10.s0()
            java.lang.String r1 = "crossinline"
            r9.Y1(r12, r0, r1)
            boolean r0 = r10.r0()
            java.lang.String r1 = "noinline"
            r9.Y1(r12, r0, r1)
            boolean r0 = r9.Y0()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0060
            Of.a r0 = r10.b()
            boolean r3 = r0 instanceof Of.C5486d
            if (r3 == 0) goto L_0x0055
            Of.d r0 = (Of.C5486d) r0
            goto L_0x0056
        L_0x0055:
            r0 = 0
        L_0x0056:
            if (r0 == 0) goto L_0x0060
            boolean r0 = r0.d0()
            if (r0 != r2) goto L_0x0060
            r8 = r2
            goto L_0x0061
        L_0x0060:
            r8 = r1
        L_0x0061:
            if (r8 == 0) goto L_0x006c
            boolean r0 = r9.v0()
            java.lang.String r3 = "actual"
            r9.Y1(r12, r0, r3)
        L_0x006c:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r3.D2(r4, r5, r6, r7, r8)
            yf.l r11 = r9.B0()
            if (r11 == 0) goto L_0x008c
            boolean r11 = r9.i()
            if (r11 == 0) goto L_0x0085
            boolean r11 = r10.A0()
            goto L_0x0089
        L_0x0085:
            boolean r11 = vg.C6755e.f(r10)
        L_0x0089:
            if (r11 == 0) goto L_0x008c
            r1 = r2
        L_0x008c:
            if (r1 == 0) goto L_0x00af
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = " = "
            r11.append(r13)
            yf.l r13 = r9.B0()
            kotlin.jvm.internal.C6496s.e(r13)
            java.lang.Object r10 = r13.invoke(r10)
            java.lang.String r10 = (java.lang.String) r10
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r12.append(r10)
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qg.u.B2(Of.t0, boolean, java.lang.StringBuilder, boolean):void");
    }

    /* access modifiers changed from: private */
    public final void C1(C5487e eVar, StringBuilder sb2) {
        boolean z10;
        C5486d E10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        if (eVar.h() == C5488f.ENUM_ENTRY) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!d1()) {
            List a02 = eVar.a0();
            C6496s.g(a02, "getContextReceivers(...)");
            J1(a02, sb2);
            A1(this, sb2, eVar, (e) null, 2, (Object) null);
            if (!z10) {
                C5502u visibility = eVar.getVisibility();
                C6496s.g(visibility, "getVisibility(...)");
                E2(visibility, sb2);
            }
            if (!(eVar.h() == C5488f.INTERFACE && eVar.r() == E.ABSTRACT) && (!eVar.h().b() || eVar.r() != E.FINAL)) {
                E r10 = eVar.r();
                C6496s.g(r10, "getModality(...)");
                W1(r10, sb2, r1(eVar));
            }
            U1(eVar, sb2);
            if (!I0().contains(v.INNER) || !eVar.A()) {
                z11 = false;
            } else {
                z11 = true;
            }
            Y1(sb2, z11, "inner");
            if (!I0().contains(v.DATA) || !eVar.I0()) {
                z12 = false;
            } else {
                z12 = true;
            }
            Y1(sb2, z12, "data");
            if (!I0().contains(v.INLINE) || !eVar.isInline()) {
                z13 = false;
            } else {
                z13 = true;
            }
            Y1(sb2, z13, "inline");
            if (!I0().contains(v.VALUE) || !eVar.t()) {
                z14 = false;
            } else {
                z14 = true;
            }
            Y1(sb2, z14, "value");
            if (!I0().contains(v.FUN) || !eVar.f0()) {
                z15 = false;
            } else {
                z15 = true;
            }
            Y1(sb2, z15, "fun");
            D1(eVar, sb2);
        }
        if (!C6691i.x(eVar)) {
            if (!d1()) {
                m2(sb2);
            }
            Z1(eVar, sb2, true);
        } else {
            F1(eVar, sb2);
        }
        if (!z10) {
            List q10 = eVar.q();
            C6496s.g(q10, "getDeclaredTypeParameters(...)");
            y2(q10, sb2, false);
            B1(eVar, sb2);
            if (!eVar.h().b() && z0() && (E10 = eVar.E()) != null) {
                sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                A1(this, sb2, E10, (e) null, 2, (Object) null);
                C5502u visibility2 = E10.getVisibility();
                C6496s.g(visibility2, "getVisibility(...)");
                E2(visibility2, sb2);
                sb2.append(S1("constructor"));
                List k10 = E10.k();
                C6496s.g(k10, "getValueParameters(...)");
                C2(k10, E10.h0(), sb2);
            }
            n2(eVar, sb2);
            F2(q10, sb2);
        }
    }

    private final void C2(Collection collection, boolean z10, StringBuilder sb2) {
        boolean H22 = H2(z10);
        int size = collection.size();
        i1().a(size, sb2);
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            t0 t0Var = (t0) it.next();
            i1().b(t0Var, i10, size, sb2);
            B2(t0Var, H22, sb2, false);
            i1().c(t0Var, i10, size, sb2);
            i10++;
        }
        i1().d(size, sb2);
    }

    private final void D1(C5487e eVar, StringBuilder sb2) {
        sb2.append(S1(n.f72692a.a(eVar)));
    }

    private final void D2(u0 u0Var, boolean z10, StringBuilder sb2, boolean z11, boolean z12) {
        t0 t0Var;
        S s10;
        boolean z13;
        S type = u0Var.getType();
        C6496s.g(type, "getType(...)");
        S s11 = null;
        if (u0Var instanceof t0) {
            t0Var = (t0) u0Var;
        } else {
            t0Var = null;
        }
        if (t0Var != null) {
            s11 = t0Var.v0();
        }
        if (s11 == null) {
            s10 = type;
        } else {
            s10 = s11;
        }
        if (s11 != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        Y1(sb2, z13, "vararg");
        if (z12 || (z11 && !d1())) {
            z2(u0Var, sb2, z12);
        }
        if (z10) {
            Z1(u0Var, sb2, z11);
            sb2.append(": ");
        }
        sb2.append(U(s10));
        R1(u0Var, sb2);
        if (j1() && s11 != null) {
            sb2.append(" /*");
            sb2.append(U(type));
            sb2.append("*/");
        }
    }

    private final u E0() {
        return (u) this.f72713n.getValue();
    }

    private final boolean E2(C5502u uVar, StringBuilder sb2) {
        if (!I0().contains(v.VISIBILITY)) {
            return false;
        }
        if (J0()) {
            uVar = uVar.f();
        }
        if (!X0() && C6496s.c(uVar, C5501t.f64516l)) {
            return false;
        }
        sb2.append(S1(uVar.c()));
        sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        return true;
    }

    private final void F1(C5495m mVar, StringBuilder sb2) {
        if (S0()) {
            if (d1()) {
                sb2.append("companion object");
            }
            m2(sb2);
            C5495m b10 = mVar.b();
            if (b10 != null) {
                sb2.append("of ");
                f name = b10.getName();
                C6496s.g(name, "getName(...)");
                sb2.append(T(name, false));
            }
        }
        if (j1() || !C6496s.c(mVar.getName(), h.f72306d)) {
            if (!d1()) {
                m2(sb2);
            }
            f name2 = mVar.getName();
            C6496s.g(name2, "getName(...)");
            sb2.append(T(name2, true));
        }
    }

    private final void F2(List list, StringBuilder sb2) {
        if (!o1()) {
            ArrayList arrayList = new ArrayList(0);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m0 m0Var = (m0) it.next();
                List upperBounds = m0Var.getUpperBounds();
                C6496s.g(upperBounds, "getUpperBounds(...)");
                for (S s10 : C6565s.g0(upperBounds, 1)) {
                    StringBuilder sb3 = new StringBuilder();
                    f name = m0Var.getName();
                    C6496s.g(name, "getName(...)");
                    sb3.append(T(name, false));
                    sb3.append(" : ");
                    C6496s.e(s10);
                    sb3.append(U(s10));
                    arrayList.add(sb3.toString());
                }
            }
            if (!arrayList.isEmpty()) {
                sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                sb2.append(S1("where"));
                sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                C6565s.v0(arrayList, sb2, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 124, (Object) null);
            }
        }
    }

    private final String G1(g gVar) {
        C6798l P10 = this.f72712m.P();
        if (P10 != null) {
            return (String) P10.invoke(gVar);
        }
        if (gVar instanceof C6736b) {
            ArrayList arrayList = new ArrayList();
            for (g G12 : (Iterable) ((C6736b) gVar).b()) {
                String G13 = G1(G12);
                if (G13 != null) {
                    arrayList.add(G13);
                }
            }
            return C6565s.x0(arrayList, ", ", "{", "}", 0, (CharSequence) null, (C6798l) null, 56, (Object) null);
        } else if (gVar instanceof C6735a) {
            return p.v0(n.Q(this, (c) ((C6735a) gVar).b(), (e) null, 2, (Object) null), "@");
        } else {
            if (!(gVar instanceof s)) {
                return gVar.toString();
            }
            s.b bVar = (s.b) ((s) gVar).b();
            if (bVar instanceof s.b.a) {
                return ((s.b.a) bVar).a() + "::class";
            } else if (bVar instanceof s.b.C1070b) {
                s.b.C1070b bVar2 = (s.b.C1070b) bVar;
                String b10 = bVar2.b().a().b();
                C6496s.g(b10, "asString(...)");
                for (int i10 = 0; i10 < bVar2.a(); i10++) {
                    b10 = "kotlin.Array<" + b10 + '>';
                }
                return b10 + "::class";
            } else {
                throw new C6535s();
            }
        }
    }

    private final boolean G2(S s10) {
        if (Lf.h.p(s10)) {
            Iterable<B0> L02 = s10.L0();
            if (!(L02 instanceof Collection) || !((Collection) L02).isEmpty()) {
                for (B0 a10 : L02) {
                    if (a10.a()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void H1(Of.C5494l r18, java.lang.StringBuilder r19) {
        /*
            r17 = this;
            r6 = r17
            r7 = r19
            r4 = 2
            r5 = 0
            r3 = 0
            r0 = r17
            r1 = r19
            r2 = r18
            A1(r0, r1, r2, r3, r4, r5)
            qg.z r0 = r6.f72712m
            boolean r0 = r0.X()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0026
            Of.e r0 = r18.e0()
            Of.E r0 = r0.r()
            Of.E r3 = Of.E.SEALED
            if (r0 == r3) goto L_0x0037
        L_0x0026:
            Of.u r0 = r18.getVisibility()
            java.lang.String r3 = "getVisibility(...)"
            kotlin.jvm.internal.C6496s.g(r0, r3)
            boolean r0 = r6.E2(r0, r7)
            if (r0 == 0) goto L_0x0037
            r0 = r2
            goto L_0x0038
        L_0x0037:
            r0 = r1
        L_0x0038:
            r17.T1(r18, r19)
            boolean r3 = r17.U0()
            if (r3 != 0) goto L_0x004c
            boolean r3 = r18.d0()
            if (r3 == 0) goto L_0x004c
            if (r0 == 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r0 = r1
            goto L_0x004d
        L_0x004c:
            r0 = r2
        L_0x004d:
            if (r0 == 0) goto L_0x0058
            java.lang.String r3 = "constructor"
            java.lang.String r3 = r6.S1(r3)
            r7.append(r3)
        L_0x0058:
            Of.i r3 = r18.b()
            java.lang.String r4 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.C6496s.g(r3, r4)
            boolean r4 = r17.b1()
            java.lang.String r5 = "getTypeParameters(...)"
            if (r4 == 0) goto L_0x007d
            if (r0 == 0) goto L_0x0070
            java.lang.String r0 = " "
            r7.append(r0)
        L_0x0070:
            r6.Z1(r3, r7, r2)
            java.util.List r0 = r18.getTypeParameters()
            kotlin.jvm.internal.C6496s.g(r0, r5)
            r6.y2(r0, r7, r1)
        L_0x007d:
            java.util.List r0 = r18.k()
            java.lang.String r1 = "getValueParameters(...)"
            kotlin.jvm.internal.C6496s.g(r0, r1)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r2 = r18.h0()
            r6.C2(r0, r2, r7)
            boolean r0 = r17.T0()
            if (r0 == 0) goto L_0x00ff
            boolean r0 = r18.d0()
            if (r0 != 0) goto L_0x00ff
            boolean r0 = r3 instanceof Of.C5487e
            if (r0 == 0) goto L_0x00ff
            Of.e r3 = (Of.C5487e) r3
            Of.d r0 = r3.E()
            if (r0 == 0) goto L_0x00ff
            java.util.List r0 = r0.k()
            kotlin.jvm.internal.C6496s.g(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00b9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00d6
            java.lang.Object r1 = r0.next()
            r2 = r1
            Of.t0 r2 = (Of.t0) r2
            boolean r3 = r2.A0()
            if (r3 != 0) goto L_0x00b9
            Fg.S r2 = r2.v0()
            if (r2 != 0) goto L_0x00b9
            r8.add(r1)
            goto L_0x00b9
        L_0x00d6:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x00ff
            java.lang.String r0 = " : "
            r7.append(r0)
            java.lang.String r0 = "this"
            java.lang.String r0 = r6.S1(r0)
            r7.append(r0)
            qg.r r14 = qg.r.f72709a
            r15 = 24
            r16 = 0
            java.lang.String r9 = ", "
            java.lang.String r10 = "("
            java.lang.String r11 = ")"
            r12 = 0
            r13 = 0
            java.lang.String r0 = mf.C6565s.x0(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r7.append(r0)
        L_0x00ff:
            boolean r0 = r17.b1()
            if (r0 == 0) goto L_0x010f
            java.util.List r0 = r18.getTypeParameters()
            kotlin.jvm.internal.C6496s.g(r0, r5)
            r6.F2(r0, r7)
        L_0x010f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qg.u.H1(Of.l, java.lang.StringBuilder):void");
    }

    private final boolean H2(boolean z10) {
        int i10 = b.f72717b[M0().ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                throw new C6535s();
            }
        } else if (!z10) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final CharSequence I1(t0 t0Var) {
        return "";
    }

    private final void J1(List list, StringBuilder sb2) {
        if (!list.isEmpty()) {
            sb2.append("context(");
            Iterator it = list.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                int i11 = i10 + 1;
                c0 c0Var = (c0) it.next();
                z1(sb2, c0Var, e.RECEIVER);
                S type = c0Var.getType();
                C6496s.g(type, "getType(...)");
                sb2.append(N1(type));
                if (i10 == C6565s.p(list)) {
                    sb2.append(") ");
                } else {
                    sb2.append(", ");
                }
                i10 = i11;
            }
        }
    }

    private final void K1(StringBuilder sb2, S s10) {
        C5397y yVar;
        A1(this, sb2, s10, (e) null, 2, (Object) null);
        if (s10 instanceof C5397y) {
            yVar = (C5397y) s10;
        } else {
            yVar = null;
        }
        if (yVar != null) {
            yVar.Z0();
        }
        if (!W.a(s10)) {
            v2(this, sb2, s10, (v0) null, 2, (Object) null);
            C6514M m10 = C6514M.f71813a;
        } else if (!d.z(s10) || !O0()) {
            if (!(s10 instanceof i) || H0()) {
                sb2.append(s10.N0().toString());
            } else {
                sb2.append(((i) s10).W0());
            }
            sb2.append(r2(s10.L0()));
        } else {
            sb2.append(L1(l.f63471a.p(s10)));
        }
        if (s10.O0()) {
            sb2.append("?");
        }
        if (C5374h0.c(s10)) {
            sb2.append(" & Any");
        }
    }

    private final String L1(String str) {
        int i10 = b.f72716a[e1().ordinal()];
        if (i10 == 1) {
            return str;
        }
        if (i10 == 2) {
            return "<font color=red><b>" + str + "</b></font>";
        }
        throw new C6535s();
    }

    private final void M1(StringBuilder sb2, C5359a aVar) {
        F e12 = e1();
        F f10 = F.f72668b;
        if (e12 == f10) {
            sb2.append("<font color=\"808080\"><i>");
        }
        sb2.append(" /* ");
        sb2.append("= ");
        b2(sb2, aVar.H());
        sb2.append(" */");
        if (e1() == f10) {
            sb2.append("</i></font>");
        }
    }

    private final String N1(S s10) {
        String U10 = U(s10);
        if ((!G2(s10) || J0.l(s10)) && !(s10 instanceof C5397y)) {
            return U10;
        }
        return '(' + U10 + ')';
    }

    private final String O1(List list) {
        return s0(G.c(list));
    }

    /* access modifiers changed from: private */
    public final void P1(C5507z zVar, StringBuilder sb2) {
        String str;
        if (!d1()) {
            if (!c1()) {
                List x02 = zVar.x0();
                C6496s.g(x02, "getContextReceiverParameters(...)");
                J1(x02, sb2);
                A1(this, sb2, zVar, (e) null, 2, (Object) null);
                C5502u visibility = zVar.getVisibility();
                C6496s.g(visibility, "getVisibility(...)");
                E2(visibility, sb2);
                X1(zVar, sb2);
                if (F0()) {
                    U1(zVar, sb2);
                }
                c2(zVar, sb2);
                if (F0()) {
                    x1(zVar, sb2);
                } else {
                    p2(zVar, sb2);
                }
                T1(zVar, sb2);
                if (j1()) {
                    if (zVar.D0()) {
                        sb2.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (zVar.G0()) {
                        sb2.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb2.append(S1("fun"));
            sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            List typeParameters = zVar.getTypeParameters();
            C6496s.g(typeParameters, "getTypeParameters(...)");
            y2(typeParameters, sb2, true);
            j2(zVar, sb2);
        }
        Z1(zVar, sb2, true);
        List k10 = zVar.k();
        C6496s.g(k10, "getValueParameters(...)");
        C2(k10, zVar.h0(), sb2);
        k2(zVar, sb2);
        S returnType = zVar.getReturnType();
        if (!m1() && (h1() || returnType == null || !Lf.i.C0(returnType))) {
            sb2.append(": ");
            if (returnType == null) {
                str = "[NULL]";
            } else {
                str = U(returnType);
            }
            sb2.append(str);
        }
        List typeParameters2 = zVar.getTypeParameters();
        C6496s.g(typeParameters2, "getTypeParameters(...)");
        F2(typeParameters2, sb2);
    }

    private final void Q1(StringBuilder sb2, S s10) {
        boolean z10;
        boolean z11;
        f fVar;
        boolean z12;
        int length = sb2.length();
        A1(E0(), sb2, s10, (e) null, 2, (Object) null);
        if (sb2.length() != length) {
            z10 = true;
        } else {
            z10 = false;
        }
        S k10 = Lf.h.k(s10);
        List e10 = Lf.h.e(s10);
        boolean r10 = Lf.h.r(s10);
        boolean O02 = s10.O0();
        if (O02 || (z10 && k10 != null)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (r10) {
                sb2.insert(length, '(');
            } else {
                if (z10) {
                    C5538a.c(p.k1(sb2));
                    if (sb2.charAt(p.V(sb2) - 1) != ')') {
                        sb2.insert(p.V(sb2), "()");
                    }
                }
                sb2.append("(");
            }
        }
        if (!e10.isEmpty()) {
            sb2.append("context(");
            for (S a22 : e10.subList(0, C6565s.p(e10))) {
                a2(sb2, a22);
                sb2.append(", ");
            }
            a2(sb2, (S) C6565s.z0(e10));
            sb2.append(") ");
        }
        Y1(sb2, r10, "suspend");
        if (k10 != null) {
            if ((!G2(k10) || k10.O0()) && !q1(k10) && !(k10 instanceof C5397y)) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (z12) {
                sb2.append("(");
            }
            a2(sb2, k10);
            if (z12) {
                sb2.append(")");
            }
            sb2.append(".");
        }
        sb2.append("(");
        if (!Lf.h.n(s10) || s10.L0().size() > 1) {
            int i10 = 0;
            for (B0 b02 : Lf.h.m(s10)) {
                int i11 = i10 + 1;
                if (i10 > 0) {
                    sb2.append(", ");
                }
                if (N0()) {
                    S type = b02.getType();
                    C6496s.g(type, "getType(...)");
                    fVar = Lf.h.d(type);
                } else {
                    fVar = null;
                }
                if (fVar != null) {
                    sb2.append(T(fVar, false));
                    sb2.append(": ");
                }
                sb2.append(V(b02));
                i10 = i11;
            }
        } else {
            sb2.append("???");
        }
        sb2.append(") ");
        sb2.append(r0());
        sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        a2(sb2, Lf.h.l(s10));
        if (z11) {
            sb2.append(")");
        }
        if (O02) {
            sb2.append("?");
        }
    }

    private final void R1(u0 u0Var, StringBuilder sb2) {
        g q02;
        String G12;
        if (G0() && (q02 = u0Var.q0()) != null && (G12 = G1(q02)) != null) {
            sb2.append(" = ");
            sb2.append(s0(G12));
        }
    }

    private final String S1(String str) {
        int i10 = b.f72716a[e1().ordinal()];
        if (i10 == 1) {
            return str;
        }
        if (i10 != 2) {
            throw new C6535s();
        } else if (y0()) {
            return str;
        } else {
            return "<b>" + str + "</b>";
        }
    }

    private final void T1(C5484b bVar, StringBuilder sb2) {
        if (I0().contains(v.MEMBER_KIND) && j1() && bVar.h() != C5484b.a.DECLARATION) {
            sb2.append("/*");
            sb2.append(Ng.a.f(bVar.h().name()));
            sb2.append("*/ ");
        }
    }

    private final void U1(D d10, StringBuilder sb2) {
        boolean z10;
        Y1(sb2, d10.isExternal(), "external");
        boolean z11 = false;
        if (!I0().contains(v.EXPECT) || !d10.k0()) {
            z10 = false;
        } else {
            z10 = true;
        }
        Y1(sb2, z10, "expect");
        if (I0().contains(v.ACTUAL) && d10.Z()) {
            z11 = true;
        }
        Y1(sb2, z11, "actual");
    }

    private final void W1(E e10, StringBuilder sb2, E e11) {
        if (W0() || e10 != e11) {
            Y1(sb2, I0().contains(v.MODALITY), Ng.a.f(e10.name()));
        }
    }

    private final void X1(C5484b bVar, StringBuilder sb2) {
        if (C6691i.J(bVar) && bVar.r() == E.FINAL) {
            return;
        }
        if (L0() != C.RENDER_OVERRIDE || bVar.r() != E.OPEN || !u1(bVar)) {
            E r10 = bVar.r();
            C6496s.g(r10, "getModality(...)");
            W1(r10, sb2, r1(bVar));
        }
    }

    private final void Y1(StringBuilder sb2, boolean z10, String str) {
        if (z10) {
            sb2.append(S1(str));
            sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        }
    }

    /* access modifiers changed from: private */
    public final void Z1(C5495m mVar, StringBuilder sb2, boolean z10) {
        f name = mVar.getName();
        C6496s.g(name, "getName(...)");
        sb2.append(T(name, z10));
    }

    private final void a2(StringBuilder sb2, S s10) {
        C5359a aVar;
        M0 Q02 = s10.Q0();
        if (Q02 instanceof C5359a) {
            aVar = (C5359a) Q02;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            b2(sb2, s10);
        } else if (Z0()) {
            b2(sb2, aVar.H());
            if (R0()) {
                v1(sb2, aVar);
            }
        } else {
            b2(sb2, aVar.Z0());
            if (a1()) {
                M1(sb2, aVar);
            }
        }
    }

    private final void b2(StringBuilder sb2, S s10) {
        if (!(s10 instanceof O0) || !i() || ((O0) s10).S0()) {
            M0 Q02 = s10.Q0();
            if (Q02 instanceof I) {
                sb2.append(((I) Q02).X0(this, this));
            } else if (Q02 instanceof C5366d0) {
                l2(sb2, (C5366d0) Q02);
            } else {
                throw new C6535s();
            }
        } else {
            sb2.append("<Not computed yet>");
        }
    }

    private final void c2(C5484b bVar, StringBuilder sb2) {
        if (I0().contains(v.OVERRIDE) && u1(bVar) && L0() != C.RENDER_OPEN) {
            Y1(sb2, true, "override");
            if (j1()) {
                sb2.append("/*");
                sb2.append(bVar.e().size());
                sb2.append("*/ ");
            }
        }
    }

    /* access modifiers changed from: private */
    public final void d2(N n10, StringBuilder sb2) {
        e2(n10.f(), "package-fragment", sb2);
        if (i()) {
            sb2.append(" in ");
            Z1(n10.b(), sb2, false);
        }
    }

    private final void e2(ng.c cVar, String str, StringBuilder sb2) {
        sb2.append(S1(str));
        ng.d j10 = cVar.j();
        C6496s.g(j10, "toUnsafe(...)");
        String S10 = S(j10);
        if (S10.length() > 0) {
            sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb2.append(S10);
        }
    }

    /* access modifiers changed from: private */
    public final void f2(V v10, StringBuilder sb2) {
        e2(v10.f(), "package", sb2);
        if (i()) {
            sb2.append(" in context of ");
            Z1(v10.B0(), sb2, false);
        }
    }

    private final void g2(StringBuilder sb2, X x10) {
        X c10 = x10.c();
        if (c10 != null) {
            g2(sb2, c10);
            sb2.append('.');
            f name = x10.b().getName();
            C6496s.g(name, "getName(...)");
            sb2.append(T(name, false));
        } else {
            v0 l10 = x10.b().l();
            C6496s.g(l10, "getTypeConstructor(...)");
            sb2.append(s2(l10));
        }
        sb2.append(r2(x10.a()));
    }

    /* access modifiers changed from: private */
    public final void h2(Z z10, StringBuilder sb2) {
        boolean z11;
        if (!d1()) {
            if (!c1()) {
                List x02 = z10.x0();
                C6496s.g(x02, "getContextReceiverParameters(...)");
                J1(x02, sb2);
                i2(z10, sb2);
                C5502u visibility = z10.getVisibility();
                C6496s.g(visibility, "getVisibility(...)");
                E2(visibility, sb2);
                boolean z12 = false;
                if (!I0().contains(v.CONST) || !z10.c0()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                Y1(sb2, z11, "const");
                U1(z10, sb2);
                X1(z10, sb2);
                c2(z10, sb2);
                if (I0().contains(v.LATEINIT) && z10.y0()) {
                    z12 = true;
                }
                Y1(sb2, z12, "lateinit");
                T1(z10, sb2);
            }
            A2(this, z10, sb2, false, 4, (Object) null);
            List typeParameters = z10.getTypeParameters();
            C6496s.g(typeParameters, "getTypeParameters(...)");
            y2(typeParameters, sb2, true);
            j2(z10, sb2);
        }
        Z1(z10, sb2, true);
        sb2.append(": ");
        S type = z10.getType();
        C6496s.g(type, "getType(...)");
        sb2.append(U(type));
        k2(z10, sb2);
        R1(z10, sb2);
        List typeParameters2 = z10.getTypeParameters();
        C6496s.g(typeParameters2, "getTypeParameters(...)");
        F2(typeParameters2, sb2);
    }

    private final void i2(Z z10, StringBuilder sb2) {
        if (I0().contains(v.ANNOTATIONS)) {
            A1(this, sb2, z10, (e) null, 2, (Object) null);
            C5504w w02 = z10.w0();
            if (w02 != null) {
                z1(sb2, w02, e.FIELD);
            }
            C5504w Q10 = z10.Q();
            if (Q10 != null) {
                z1(sb2, Q10, e.PROPERTY_DELEGATE_FIELD);
            }
            if (P0() == E.NONE) {
                a0 d10 = z10.d();
                if (d10 != null) {
                    z1(sb2, d10, e.PROPERTY_GETTER);
                }
                b0 g10 = z10.g();
                if (g10 != null) {
                    z1(sb2, g10, e.PROPERTY_SETTER);
                    List k10 = g10.k();
                    C6496s.g(k10, "getValueParameters(...)");
                    t0 t0Var = (t0) C6565s.P0(k10);
                    C6496s.e(t0Var);
                    z1(sb2, t0Var, e.SETTER_PARAMETER);
                }
            }
        }
    }

    private final void j2(C5483a aVar, StringBuilder sb2) {
        c0 P10 = aVar.P();
        if (P10 != null) {
            z1(sb2, P10, e.RECEIVER);
            S type = P10.getType();
            C6496s.g(type, "getType(...)");
            sb2.append(N1(type));
            sb2.append(".");
        }
    }

    private final void k2(C5483a aVar, StringBuilder sb2) {
        c0 P10;
        if (Q0() && (P10 = aVar.P()) != null) {
            sb2.append(" on ");
            S type = P10.getType();
            C6496s.g(type, "getType(...)");
            sb2.append(U(type));
        }
    }

    private final void l2(StringBuilder sb2, C5366d0 d0Var) {
        if (C6496s.c(d0Var, J0.f62946b) || J0.k(d0Var)) {
            sb2.append("???");
        } else if (l.o(d0Var)) {
            if (g1()) {
                v0 N02 = d0Var.N0();
                C6496s.f(N02, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                sb2.append(L1(((j) N02).c(0)));
                return;
            }
            sb2.append("???");
        } else if (W.a(d0Var)) {
            K1(sb2, d0Var);
        } else if (G2(d0Var)) {
            Q1(sb2, d0Var);
        } else {
            K1(sb2, d0Var);
        }
    }

    private final void m2(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0 || sb2.charAt(length - 1) != ' ') {
            sb2.append(' ');
        }
    }

    private final void n2(C5487e eVar, StringBuilder sb2) {
        if (!n1() && !Lf.i.n0(eVar.p())) {
            Collection l10 = eVar.l().l();
            C6496s.g(l10, "getSupertypes(...)");
            if (l10.isEmpty()) {
                return;
            }
            if (l10.size() != 1 || !Lf.i.b0((S) l10.iterator().next())) {
                m2(sb2);
                sb2.append(": ");
                C6565s.v0(l10, sb2, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new s(this), 60, (Object) null);
            }
        }
    }

    private final void o0(StringBuilder sb2, C5495m mVar) {
        C5495m b10;
        String str;
        String name;
        if (!(mVar instanceof N) && !(mVar instanceof V) && (b10 = mVar.b()) != null && !(b10 instanceof H)) {
            sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb2.append(V1("defined in"));
            sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            ng.d m10 = C6691i.m(b10);
            C6496s.g(m10, "getFqName(...)");
            if (m10.e()) {
                str = "root package";
            } else {
                str = S(m10);
            }
            sb2.append(str);
            if (l1() && (b10 instanceof N) && (mVar instanceof C5498p) && (name = ((C5498p) mVar).i().b().getName()) != null) {
                sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                sb2.append(V1("in file"));
                sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                sb2.append(name);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final CharSequence o2(u uVar, S s10) {
        C6496s.e(s10);
        return uVar.U(s10);
    }

    private final void p0(StringBuilder sb2, List list) {
        C6565s.v0(list, sb2, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new q(this), 60, (Object) null);
    }

    private final String p1() {
        return s0(">");
    }

    private final void p2(C5507z zVar, StringBuilder sb2) {
        Y1(sb2, zVar.isSuspend(), "suspend");
    }

    /* access modifiers changed from: private */
    public static final CharSequence q0(u uVar, B0 b02) {
        C6496s.h(b02, "it");
        if (b02.a()) {
            return "*";
        }
        S type = b02.getType();
        C6496s.g(type, "getType(...)");
        String U10 = uVar.U(type);
        if (b02.b() == N0.INVARIANT) {
            return U10;
        }
        return b02.b() + ' ' + U10;
    }

    private final boolean q1(S s10) {
        if (Lf.h.r(s10) || !s10.getAnnotations().isEmpty()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final void q2(l0 l0Var, StringBuilder sb2) {
        A1(this, sb2, l0Var, (e) null, 2, (Object) null);
        C5502u visibility = l0Var.getVisibility();
        C6496s.g(visibility, "getVisibility(...)");
        E2(visibility, sb2);
        U1(l0Var, sb2);
        sb2.append(S1("typealias"));
        sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        Z1(l0Var, sb2, true);
        List q10 = l0Var.q();
        C6496s.g(q10, "getDeclaredTypeParameters(...)");
        y2(q10, sb2, false);
        B1(l0Var, sb2);
        sb2.append(" = ");
        sb2.append(U(l0Var.u0()));
    }

    private final String r0() {
        int i10 = b.f72716a[e1().ordinal()];
        if (i10 == 1) {
            return s0("->");
        }
        if (i10 == 2) {
            return "&rarr;";
        }
        throw new C6535s();
    }

    private final E r1(D d10) {
        C5487e eVar;
        if (!(d10 instanceof C5487e)) {
            C5495m b10 = d10.b();
            if (b10 instanceof C5487e) {
                eVar = (C5487e) b10;
            } else {
                eVar = null;
            }
            if (eVar == null) {
                return E.FINAL;
            }
            if (!(d10 instanceof C5484b)) {
                return E.FINAL;
            }
            C5484b bVar = (C5484b) d10;
            Collection e10 = bVar.e();
            C6496s.g(e10, "getOverriddenDescriptors(...)");
            if (!e10.isEmpty() && eVar.r() != E.FINAL) {
                return E.OPEN;
            }
            if (eVar.h() != C5488f.INTERFACE || C6496s.c(bVar.getVisibility(), C5501t.f64505a)) {
                return E.FINAL;
            }
            E r10 = bVar.r();
            E e11 = E.ABSTRACT;
            if (r10 == e11) {
                return e11;
            }
            return E.OPEN;
        } else if (((C5487e) d10).h() == C5488f.INTERFACE) {
            return E.ABSTRACT;
        } else {
            return E.FINAL;
        }
    }

    private final String s0(String str) {
        return e1().b(str);
    }

    private final boolean s1(c cVar) {
        return C6496s.c(cVar.f(), o.a.f63962E);
    }

    /* access modifiers changed from: private */
    public static final u t0(u uVar) {
        n W10 = uVar.W(t.f72711a);
        C6496s.f(W10, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        return (u) W10;
    }

    private final String t1() {
        return s0("<");
    }

    /* access modifiers changed from: private */
    public static final Object t2(S s10) {
        C6496s.h(s10, "it");
        return s10;
    }

    /* access modifiers changed from: private */
    public static final C6514M u0(w wVar) {
        C6496s.h(wVar, "$this$withOptions");
        wVar.k(mf.Y.n(wVar.h(), C6565s.q(o.a.f63958C, o.a.f63960D)));
        return C6514M.f71813a;
    }

    private final boolean u1(C5484b bVar) {
        return !bVar.e().isEmpty();
    }

    private final void u2(StringBuilder sb2, S s10, v0 v0Var) {
        X d10 = q0.d(s10);
        if (d10 == null) {
            sb2.append(s2(v0Var));
            sb2.append(r2(s10.L0()));
            return;
        }
        g2(sb2, d10);
    }

    private final void v1(StringBuilder sb2, C5359a aVar) {
        F e12 = e1();
        F f10 = F.f72668b;
        if (e12 == f10) {
            sb2.append("<font color=\"808080\"><i>");
        }
        sb2.append(" /* ");
        sb2.append("from: ");
        b2(sb2, aVar.Z0());
        sb2.append(" */");
        if (e1() == f10) {
            sb2.append("</i></font>");
        }
    }

    static /* synthetic */ void v2(u uVar, StringBuilder sb2, S s10, v0 v0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            v0Var = s10.N0();
        }
        uVar.u2(sb2, s10, v0Var);
    }

    /* access modifiers changed from: private */
    public final void w1(Y y10, StringBuilder sb2) {
        U1(y10, sb2);
    }

    /* access modifiers changed from: private */
    public final void w2(m0 m0Var, StringBuilder sb2, boolean z10) {
        boolean z11;
        if (z10) {
            sb2.append(t1());
        }
        if (j1()) {
            sb2.append("/*");
            sb2.append(m0Var.getIndex());
            sb2.append("*/ ");
        }
        Y1(sb2, m0Var.x(), "reified");
        String c10 = m0Var.n().c();
        boolean z12 = true;
        if (c10.length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Y1(sb2, z11, c10);
        A1(this, sb2, m0Var, (e) null, 2, (Object) null);
        Z1(m0Var, sb2, z10);
        int size = m0Var.getUpperBounds().size();
        if ((size > 1 && !z10) || size == 1) {
            S s10 = (S) m0Var.getUpperBounds().iterator().next();
            if (!Lf.i.j0(s10)) {
                sb2.append(" : ");
                C6496s.e(s10);
                sb2.append(U(s10));
            }
        } else if (z10) {
            for (S s11 : m0Var.getUpperBounds()) {
                if (!Lf.i.j0(s11)) {
                    if (z12) {
                        sb2.append(" : ");
                    } else {
                        sb2.append(" & ");
                    }
                    C6496s.e(s11);
                    sb2.append(U(s11));
                    z12 = false;
                }
            }
        }
        if (z10) {
            sb2.append(p1());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        if (w0() != false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006f, code lost:
        if (w0() != false) goto L_0x0071;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void x1(Of.C5507z r6, java.lang.StringBuilder r7) {
        /*
            r5 = this;
            boolean r0 = r6.isOperator()
            r1 = 0
            r2 = 1
            java.lang.String r3 = "getOverriddenDescriptors(...)"
            if (r0 == 0) goto L_0x003b
            java.util.Collection r0 = r6.e()
            kotlin.jvm.internal.C6496s.g(r0, r3)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x001d
            goto L_0x0039
        L_0x001d:
            java.util.Iterator r0 = r0.iterator()
        L_0x0021:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0039
            java.lang.Object r4 = r0.next()
            Of.z r4 = (Of.C5507z) r4
            boolean r4 = r4.isOperator()
            if (r4 == 0) goto L_0x0021
            boolean r0 = r5.w0()
            if (r0 == 0) goto L_0x003b
        L_0x0039:
            r0 = r2
            goto L_0x003c
        L_0x003b:
            r0 = r1
        L_0x003c:
            boolean r4 = r6.isInfix()
            if (r4 == 0) goto L_0x0072
            java.util.Collection r4 = r6.e()
            kotlin.jvm.internal.C6496s.g(r4, r3)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r3 = r4
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0055
            goto L_0x0071
        L_0x0055:
            java.util.Iterator r3 = r4.iterator()
        L_0x0059:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0071
            java.lang.Object r4 = r3.next()
            Of.z r4 = (Of.C5507z) r4
            boolean r4 = r4.isInfix()
            if (r4 == 0) goto L_0x0059
            boolean r3 = r5.w0()
            if (r3 == 0) goto L_0x0072
        L_0x0071:
            r1 = r2
        L_0x0072:
            boolean r2 = r6.D()
            java.lang.String r3 = "tailrec"
            r5.Y1(r7, r2, r3)
            r5.p2(r6, r7)
            boolean r6 = r6.isInline()
            java.lang.String r2 = "inline"
            r5.Y1(r7, r6, r2)
            java.lang.String r6 = "infix"
            r5.Y1(r7, r1, r6)
            java.lang.String r6 = "operator"
            r5.Y1(r7, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qg.u.x1(Of.z, java.lang.StringBuilder):void");
    }

    private final void x2(StringBuilder sb2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w2((m0) it.next(), sb2, false);
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
    }

    private final List y1(c cVar) {
        C5487e eVar;
        String str;
        C5486d E10;
        List k10;
        Map a10 = cVar.a();
        List list = null;
        if (V0()) {
            eVar = C6755e.l(cVar);
        } else {
            eVar = null;
        }
        if (!(eVar == null || (E10 = eVar.E()) == null || (k10 = E10.k()) == null)) {
            ArrayList<t0> arrayList = new ArrayList<>();
            for (Object next : k10) {
                if (((t0) next).A0()) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C6565s.y(arrayList, 10));
            for (t0 name : arrayList) {
                arrayList2.add(name.getName());
            }
            list = arrayList2;
        }
        if (list == null) {
            list = C6565s.n();
        }
        ArrayList<f> arrayList3 = new ArrayList<>();
        for (Object next2 : list) {
            if (!a10.containsKey((f) next2)) {
                arrayList3.add(next2);
            }
        }
        ArrayList arrayList4 = new ArrayList(C6565s.y(arrayList3, 10));
        for (f b10 : arrayList3) {
            arrayList4.add(b10.b() + " = ...");
        }
        Iterable<Map.Entry> entrySet = a10.entrySet();
        ArrayList arrayList5 = new ArrayList(C6565s.y(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            f fVar = (f) entry.getKey();
            g gVar = (g) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(fVar.b());
            sb2.append(" = ");
            if (!list.contains(fVar)) {
                str = G1(gVar);
            } else {
                str = "...";
            }
            sb2.append(str);
            arrayList5.add(sb2.toString());
        }
        return C6565s.T0(C6565s.K0(arrayList4, arrayList5));
    }

    private final void y2(List list, StringBuilder sb2, boolean z10) {
        if (!o1() && !list.isEmpty()) {
            sb2.append(t1());
            x2(sb2, list);
            sb2.append(p1());
            if (z10) {
                sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            }
        }
    }

    private final void z1(StringBuilder sb2, Pf.a aVar, e eVar) {
        Set set;
        if (I0().contains(v.ANNOTATIONS)) {
            if (aVar instanceof S) {
                set = h();
            } else {
                set = D0();
            }
            C6798l x02 = x0();
            for (c cVar : aVar.getAnnotations()) {
                if (!C6565s.e0(set, cVar.f()) && !s1(cVar)) {
                    if (x02 == null || ((Boolean) x02.invoke(cVar)).booleanValue()) {
                        sb2.append(P(cVar, eVar));
                        if (C0()) {
                            sb2.append(10);
                            C6496s.g(sb2, "append(...)");
                        } else {
                            sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                        }
                    }
                }
            }
        }
    }

    private final void z2(u0 u0Var, StringBuilder sb2, boolean z10) {
        String str;
        if (z10 || !(u0Var instanceof t0)) {
            if (u0Var.O()) {
                str = "var";
            } else {
                str = "val";
            }
            sb2.append(S1(str));
            sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        }
    }

    public C6661b A0() {
        return this.f72712m.B();
    }

    public C6798l B0() {
        return this.f72712m.C();
    }

    public boolean C0() {
        return this.f72712m.D();
    }

    public Set D0() {
        return this.f72712m.E();
    }

    public String E1(C5490h hVar) {
        C6496s.h(hVar, "klass");
        if (l.m(hVar)) {
            return hVar.l().toString();
        }
        return A0().a(hVar, this);
    }

    public boolean F0() {
        return this.f72712m.F();
    }

    public boolean G0() {
        return this.f72712m.G();
    }

    public boolean H0() {
        return this.f72712m.H();
    }

    public Set I0() {
        return this.f72712m.I();
    }

    public boolean J0() {
        return this.f72712m.J();
    }

    public final z K0() {
        return this.f72712m;
    }

    public C L0() {
        return this.f72712m.K();
    }

    public D M0() {
        return this.f72712m.L();
    }

    public boolean N0() {
        return this.f72712m.M();
    }

    public String O(C5495m mVar) {
        C6496s.h(mVar, "declarationDescriptor");
        StringBuilder sb2 = new StringBuilder();
        mVar.U(new a(), sb2);
        if (k1()) {
            o0(sb2, mVar);
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }

    public boolean O0() {
        return this.f72712m.N();
    }

    public String P(c cVar, e eVar) {
        C6496s.h(cVar, "annotation");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        if (eVar != null) {
            sb2.append(eVar.b() + ':');
        }
        S type = cVar.getType();
        sb2.append(U(type));
        if (o()) {
            List y12 = y1(cVar);
            if (a() || !y12.isEmpty()) {
                C6565s.v0(y12, sb2, ", ", "(", ")", 0, (CharSequence) null, (C6798l) null, 112, (Object) null);
            }
        }
        if (j1() && (W.a(type) || (type.N0().o() instanceof M.b))) {
            sb2.append(" /* annotation class not found */");
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }

    public E P0() {
        return this.f72712m.O();
    }

    public boolean Q0() {
        return this.f72712m.Q();
    }

    public String R(String str, String str2, Lf.i iVar) {
        C6496s.h(str, "lowerRendered");
        C6496s.h(str2, "upperRendered");
        C6496s.h(iVar, "builtIns");
        if (!G.f(str, str2)) {
            C6661b A02 = A0();
            C5487e w10 = iVar.w();
            C6496s.g(w10, "getCollection(...)");
            String a12 = p.a1(A02.a(w10, this), "Collection", (String) null, 2, (Object) null);
            String d10 = G.d(str, a12 + "Mutable", str2, a12, a12 + '(' + "Mutable" + ')');
            if (d10 != null) {
                return d10;
            }
            String d11 = G.d(str, a12 + "MutableMap.MutableEntry", str2, a12 + "Map.Entry", a12 + "(Mutable)Map.(Mutable)Entry");
            if (d11 != null) {
                return d11;
            }
            C6661b A03 = A0();
            C5487e j10 = iVar.j();
            C6496s.g(j10, "getArray(...)");
            String a13 = p.a1(A03.a(j10, this), "Array", (String) null, 2, (Object) null);
            String d12 = G.d(str, a13 + s0("Array<"), str2, a13 + s0("Array<out "), a13 + s0("Array<(out) "));
            if (d12 != null) {
                return d12;
            }
            return '(' + str + ".." + str2 + ')';
        } else if (p.J(str2, "(", false, 2, (Object) null)) {
            return '(' + str + ")!";
        } else {
            return str + '!';
        }
    }

    public boolean R0() {
        return this.f72712m.R();
    }

    public String S(ng.d dVar) {
        C6496s.h(dVar, "fqName");
        List h10 = dVar.h();
        C6496s.g(h10, "pathSegments(...)");
        return O1(h10);
    }

    public boolean S0() {
        return this.f72712m.S();
    }

    public String T(f fVar, boolean z10) {
        C6496s.h(fVar, "name");
        String s02 = s0(G.b(fVar));
        if (!y0() || e1() != F.f72668b || !z10) {
            return s02;
        }
        return "<b>" + s02 + "</b>";
    }

    public boolean T0() {
        return this.f72712m.T();
    }

    public String U(S s10) {
        C6496s.h(s10, "type");
        StringBuilder sb2 = new StringBuilder();
        a2(sb2, (S) f1().invoke(s10));
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }

    public boolean U0() {
        return this.f72712m.U();
    }

    public String V(B0 b02) {
        C6496s.h(b02, "typeProjection");
        StringBuilder sb2 = new StringBuilder();
        p0(sb2, C6565s.e(b02));
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }

    public boolean V0() {
        return this.f72712m.V();
    }

    public String V1(String str) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        int i10 = b.f72716a[e1().ordinal()];
        if (i10 == 1) {
            return str;
        }
        if (i10 == 2) {
            return "<i>" + str + "</i>";
        }
        throw new C6535s();
    }

    public boolean W0() {
        return this.f72712m.W();
    }

    public boolean X0() {
        return this.f72712m.X();
    }

    public boolean Y0() {
        return this.f72712m.Y();
    }

    public boolean Z0() {
        return this.f72712m.Z();
    }

    public boolean a() {
        return this.f72712m.a();
    }

    public boolean a1() {
        return this.f72712m.a0();
    }

    public void b(boolean z10) {
        this.f72712m.b(z10);
    }

    public boolean b1() {
        return this.f72712m.b0();
    }

    public void c(boolean z10) {
        this.f72712m.c(z10);
    }

    public boolean c1() {
        return this.f72712m.c0();
    }

    public boolean d() {
        return this.f72712m.d();
    }

    public boolean d1() {
        return this.f72712m.d0();
    }

    public void e(F f10) {
        C6496s.h(f10, "<set-?>");
        this.f72712m.e(f10);
    }

    public F e1() {
        return this.f72712m.e0();
    }

    public void f(boolean z10) {
        this.f72712m.f(z10);
    }

    public C6798l f1() {
        return this.f72712m.f0();
    }

    public void g(boolean z10) {
        this.f72712m.g(z10);
    }

    public boolean g1() {
        return this.f72712m.g0();
    }

    public Set h() {
        return this.f72712m.h();
    }

    public boolean h1() {
        return this.f72712m.h0();
    }

    public boolean i() {
        return this.f72712m.i();
    }

    public n.b i1() {
        return this.f72712m.i0();
    }

    public C6660a j() {
        return this.f72712m.j();
    }

    public boolean j1() {
        return this.f72712m.j0();
    }

    public void k(Set set) {
        C6496s.h(set, "<set-?>");
        this.f72712m.k(set);
    }

    public boolean k1() {
        return this.f72712m.k0();
    }

    public void l(Set set) {
        C6496s.h(set, "<set-?>");
        this.f72712m.l(set);
    }

    public boolean l1() {
        return this.f72712m.l0();
    }

    public void m(boolean z10) {
        this.f72712m.m(z10);
    }

    public boolean m1() {
        return this.f72712m.m0();
    }

    public void n(boolean z10) {
        this.f72712m.n(z10);
    }

    public boolean n1() {
        return this.f72712m.n0();
    }

    public boolean o() {
        return this.f72712m.o();
    }

    public boolean o1() {
        return this.f72712m.o0();
    }

    public void p(C6661b bVar) {
        C6496s.h(bVar, "<set-?>");
        this.f72712m.p(bVar);
    }

    public void q(D d10) {
        C6496s.h(d10, "<set-?>");
        this.f72712m.q(d10);
    }

    public void r(boolean z10) {
        this.f72712m.r(z10);
    }

    public String r2(List list) {
        C6496s.h(list, "typeArguments");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(t1());
        p0(sb2, list);
        sb2.append(p1());
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }

    public String s2(v0 v0Var) {
        C6496s.h(v0Var, "typeConstructor");
        C5490h o10 = v0Var.o();
        if ((o10 instanceof m0) || (o10 instanceof C5487e) || (o10 instanceof l0)) {
            return E1(o10);
        }
        if (o10 != null) {
            throw new IllegalStateException(("Unexpected classifier: " + o10.getClass()).toString());
        } else if (v0Var instanceof Q) {
            return ((Q) v0Var).i(p.f72707a);
        } else {
            return v0Var.toString();
        }
    }

    public boolean v0() {
        return this.f72712m.w();
    }

    public boolean w0() {
        return this.f72712m.x();
    }

    public C6798l x0() {
        return this.f72712m.y();
    }

    public boolean y0() {
        return this.f72712m.z();
    }

    public boolean z0() {
        return this.f72712m.A();
    }
}
