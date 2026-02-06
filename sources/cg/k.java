package cg;

import Fg.A0;
import Fg.B0;
import Fg.C5364c0;
import Fg.C5366d0;
import Fg.I;
import Fg.S;
import Fg.r0;
import Gg.e;
import Gg.g;
import Of.C5487e;
import Of.C5490h;
import Sg.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import qg.n;
import yg.C6812k;

public final class k extends I implements C5364c0 {
    private k(C5366d0 d0Var, C5366d0 d0Var2, boolean z10) {
        super(d0Var, d0Var2);
        if (!z10) {
            e.f63178a.c(d0Var, d0Var2);
        }
    }

    /* access modifiers changed from: private */
    public static final CharSequence b1(String str) {
        C6496s.h(str, "it");
        return "(raw) " + str;
    }

    private static final boolean c1(String str, String str2) {
        if (C6496s.c(str, p.v0(str2, "out ")) || C6496s.c(str2, "*")) {
            return true;
        }
        return false;
    }

    private static final List d1(n nVar, S s10) {
        Iterable<B0> L02 = s10.L0();
        ArrayList arrayList = new ArrayList(C6565s.y(L02, 10));
        for (B0 V10 : L02) {
            arrayList.add(nVar.V(V10));
        }
        return arrayList;
    }

    private static final String e1(String str, String str2) {
        if (!p.N(str, '<', false, 2, (Object) null)) {
            return str;
        }
        return p.Z0(str, '<', (String) null, 2, (Object) null) + '<' + str2 + '>' + p.V0(str, '>', (String) null, 2, (Object) null);
    }

    public C5366d0 U0() {
        return V0();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00bf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String X0(qg.n r13, qg.w r14) {
        /*
            r12 = this;
            java.lang.String r0 = "renderer"
            kotlin.jvm.internal.C6496s.h(r13, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.C6496s.h(r14, r0)
            Fg.d0 r0 = r12.V0()
            java.lang.String r0 = r13.U(r0)
            Fg.d0 r1 = r12.W0()
            java.lang.String r1 = r13.U(r1)
            boolean r14 = r14.i()
            if (r14 == 0) goto L_0x003f
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "raw ("
            r13.append(r14)
            r13.append(r0)
            java.lang.String r14 = ".."
            r13.append(r14)
            r13.append(r1)
            r14 = 41
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            return r13
        L_0x003f:
            Fg.d0 r14 = r12.W0()
            java.util.List r14 = r14.L0()
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L_0x0056
            Lf.i r14 = Kg.d.n(r12)
            java.lang.String r13 = r13.R(r0, r1, r14)
            return r13
        L_0x0056:
            Fg.d0 r14 = r12.V0()
            java.util.List r14 = d1(r13, r14)
            Fg.d0 r2 = r12.W0()
            java.util.List r2 = d1(r13, r2)
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            cg.j r9 = cg.j.f67357a
            r10 = 30
            r11 = 0
            java.lang.String r4 = ", "
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r14
            java.lang.String r3 = mf.C6565s.x0(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r14 = mf.C6565s.n1(r14, r2)
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            boolean r2 = r14 instanceof java.util.Collection
            if (r2 == 0) goto L_0x008e
            r2 = r14
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x008e
            goto L_0x00b1
        L_0x008e:
            java.util.Iterator r14 = r14.iterator()
        L_0x0092:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L_0x00b1
            java.lang.Object r2 = r14.next()
            kotlin.Pair r2 = (kotlin.Pair) r2
            java.lang.Object r4 = r2.c()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.d()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = c1(r4, r2)
            if (r2 != 0) goto L_0x0092
            goto L_0x00b5
        L_0x00b1:
            java.lang.String r1 = e1(r1, r3)
        L_0x00b5:
            java.lang.String r14 = e1(r0, r3)
            boolean r0 = kotlin.jvm.internal.C6496s.c(r14, r1)
            if (r0 == 0) goto L_0x00c0
            return r14
        L_0x00c0:
            Lf.i r0 = Kg.d.n(r12)
            java.lang.String r13 = r13.R(r14, r1, r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: cg.k.X0(qg.n, qg.w):java.lang.String");
    }

    /* renamed from: Z0 */
    public k R0(boolean z10) {
        return new k(V0().U0(z10), W0().U0(z10));
    }

    /* renamed from: a1 */
    public I S0(g gVar) {
        C6496s.h(gVar, "kotlinTypeRefiner");
        S h10 = gVar.h(V0());
        C6496s.f(h10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        S h11 = gVar.h(W0());
        C6496s.f(h11, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new k((C5366d0) h10, (C5366d0) h11, true);
    }

    /* renamed from: f1 */
    public k T0(r0 r0Var) {
        C6496s.h(r0Var, "newAttributes");
        return new k(V0().V0(r0Var), W0().V0(r0Var));
    }

    public C6812k o() {
        C5487e eVar;
        C5490h o10 = N0().o();
        if (o10 instanceof C5487e) {
            eVar = (C5487e) o10;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            C6812k I10 = eVar.I(new i((A0) null, 1, (DefaultConstructorMarker) null));
            C6496s.g(I10, "getMemberScope(...)");
            return I10;
        }
        throw new IllegalStateException(("Incorrect classifier: " + N0().o()).toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public k(C5366d0 d0Var, C5366d0 d0Var2) {
        this(d0Var, d0Var2, false);
        C6496s.h(d0Var, "lowerBound");
        C6496s.h(d0Var2, "upperBound");
    }
}
