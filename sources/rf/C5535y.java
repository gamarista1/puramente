package Rf;

import Fg.C;
import Fg.C5366d0;
import Fg.C5393u;
import Fg.C5396x;
import Fg.E0;
import Fg.G0;
import Fg.J0;
import Fg.N0;
import Fg.S;
import Fg.V;
import Fg.v0;
import Gg.g;
import Of.C5486d;
import Of.C5487e;
import Of.C5488f;
import Of.C5495m;
import Of.C5497o;
import Of.C5502u;
import Of.E;
import Of.c0;
import Of.h0;
import Of.m0;
import Of.r0;
import Pf.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import mf.C6565s;
import ng.f;
import rg.C6691i;
import vg.C6755e;
import yf.C6798l;
import yg.C6812k;
import yg.C6821t;

/* renamed from: Rf.y  reason: case insensitive filesystem */
public class C5535y extends z {

    /* renamed from: b  reason: collision with root package name */
    private final z f64956b;

    /* renamed from: c  reason: collision with root package name */
    private final G0 f64957c;

    /* renamed from: d  reason: collision with root package name */
    private G0 f64958d;

    /* renamed from: e  reason: collision with root package name */
    private List f64959e;

    /* renamed from: f  reason: collision with root package name */
    private List f64960f;

    /* renamed from: g  reason: collision with root package name */
    private v0 f64961g;

    /* renamed from: Rf.y$a */
    class a implements C6798l {
        a() {
        }

        /* renamed from: a */
        public Boolean invoke(m0 m0Var) {
            return Boolean.valueOf(!m0Var.R());
        }
    }

    /* renamed from: Rf.y$b */
    class b implements C6798l {
        b() {
        }

        /* renamed from: a */
        public C5366d0 invoke(C5366d0 d0Var) {
            return C5535y.this.M0(d0Var);
        }
    }

    public C5535y(z zVar, G0 g02) {
        this.f64956b = zVar;
        this.f64957c = g02;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e3 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ void F0(int r15) {
        /*
            r0 = 23
            r1 = 13
            r2 = 10
            r3 = 8
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 2
            if (r15 == r7) goto L_0x001f
            if (r15 == r6) goto L_0x001f
            if (r15 == r5) goto L_0x001f
            if (r15 == r4) goto L_0x001f
            if (r15 == r3) goto L_0x001f
            if (r15 == r2) goto L_0x001f
            if (r15 == r1) goto L_0x001f
            if (r15 == r0) goto L_0x001f
            java.lang.String r8 = "@NotNull method %s.%s must not return null"
            goto L_0x0021
        L_0x001f:
            java.lang.String r8 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
        L_0x0021:
            if (r15 == r7) goto L_0x0033
            if (r15 == r6) goto L_0x0033
            if (r15 == r5) goto L_0x0033
            if (r15 == r4) goto L_0x0033
            if (r15 == r3) goto L_0x0033
            if (r15 == r2) goto L_0x0033
            if (r15 == r1) goto L_0x0033
            if (r15 == r0) goto L_0x0033
            r9 = r7
            goto L_0x0034
        L_0x0033:
            r9 = r6
        L_0x0034:
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r10 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor"
            r11 = 0
            if (r15 == r7) goto L_0x005b
            if (r15 == r6) goto L_0x0056
            if (r15 == r5) goto L_0x0051
            if (r15 == r4) goto L_0x0056
            if (r15 == r3) goto L_0x005b
            if (r15 == r2) goto L_0x0051
            if (r15 == r1) goto L_0x0056
            if (r15 == r0) goto L_0x004c
            r9[r11] = r10
            goto L_0x005f
        L_0x004c:
            java.lang.String r12 = "substitutor"
            r9[r11] = r12
            goto L_0x005f
        L_0x0051:
            java.lang.String r12 = "typeSubstitution"
            r9[r11] = r12
            goto L_0x005f
        L_0x0056:
            java.lang.String r12 = "kotlinTypeRefiner"
            r9[r11] = r12
            goto L_0x005f
        L_0x005b:
            java.lang.String r12 = "typeArguments"
            r9[r11] = r12
        L_0x005f:
            java.lang.String r11 = "getMemberScope"
            java.lang.String r12 = "getUnsubstitutedMemberScope"
            java.lang.String r13 = "substitute"
            r14 = 1
            switch(r15) {
                case 2: goto L_0x00c2;
                case 3: goto L_0x00c2;
                case 4: goto L_0x00bf;
                case 5: goto L_0x00c2;
                case 6: goto L_0x00c2;
                case 7: goto L_0x00bf;
                case 8: goto L_0x00c2;
                case 9: goto L_0x00bf;
                case 10: goto L_0x00c2;
                case 11: goto L_0x00bf;
                case 12: goto L_0x00bc;
                case 13: goto L_0x00c2;
                case 14: goto L_0x00bc;
                case 15: goto L_0x00b7;
                case 16: goto L_0x00b2;
                case 17: goto L_0x00ad;
                case 18: goto L_0x00a8;
                case 19: goto L_0x00a3;
                case 20: goto L_0x009e;
                case 21: goto L_0x0099;
                case 22: goto L_0x0094;
                case 23: goto L_0x00c2;
                case 24: goto L_0x0091;
                case 25: goto L_0x008c;
                case 26: goto L_0x0087;
                case 27: goto L_0x0082;
                case 28: goto L_0x007d;
                case 29: goto L_0x0078;
                case 30: goto L_0x0073;
                case 31: goto L_0x006e;
                default: goto L_0x0069;
            }
        L_0x0069:
            java.lang.String r10 = "getTypeConstructor"
            r9[r14] = r10
            goto L_0x00c4
        L_0x006e:
            java.lang.String r10 = "getSealedSubclasses"
            r9[r14] = r10
            goto L_0x00c4
        L_0x0073:
            java.lang.String r10 = "getDeclaredTypeParameters"
            r9[r14] = r10
            goto L_0x00c4
        L_0x0078:
            java.lang.String r10 = "getSource"
            r9[r14] = r10
            goto L_0x00c4
        L_0x007d:
            java.lang.String r10 = "getUnsubstitutedInnerClassesScope"
            r9[r14] = r10
            goto L_0x00c4
        L_0x0082:
            java.lang.String r10 = "getVisibility"
            r9[r14] = r10
            goto L_0x00c4
        L_0x0087:
            java.lang.String r10 = "getModality"
            r9[r14] = r10
            goto L_0x00c4
        L_0x008c:
            java.lang.String r10 = "getKind"
            r9[r14] = r10
            goto L_0x00c4
        L_0x0091:
            r9[r14] = r13
            goto L_0x00c4
        L_0x0094:
            java.lang.String r10 = "getContainingDeclaration"
            r9[r14] = r10
            goto L_0x00c4
        L_0x0099:
            java.lang.String r10 = "getOriginal"
            r9[r14] = r10
            goto L_0x00c4
        L_0x009e:
            java.lang.String r10 = "getName"
            r9[r14] = r10
            goto L_0x00c4
        L_0x00a3:
            java.lang.String r10 = "getAnnotations"
            r9[r14] = r10
            goto L_0x00c4
        L_0x00a8:
            java.lang.String r10 = "getConstructors"
            r9[r14] = r10
            goto L_0x00c4
        L_0x00ad:
            java.lang.String r10 = "getContextReceivers"
            r9[r14] = r10
            goto L_0x00c4
        L_0x00b2:
            java.lang.String r10 = "getDefaultType"
            r9[r14] = r10
            goto L_0x00c4
        L_0x00b7:
            java.lang.String r10 = "getStaticScope"
            r9[r14] = r10
            goto L_0x00c4
        L_0x00bc:
            r9[r14] = r12
            goto L_0x00c4
        L_0x00bf:
            r9[r14] = r11
            goto L_0x00c4
        L_0x00c2:
            r9[r14] = r10
        L_0x00c4:
            if (r15 == r7) goto L_0x00db
            if (r15 == r6) goto L_0x00db
            if (r15 == r5) goto L_0x00db
            if (r15 == r4) goto L_0x00db
            if (r15 == r3) goto L_0x00db
            if (r15 == r2) goto L_0x00db
            if (r15 == r1) goto L_0x00d8
            if (r15 == r0) goto L_0x00d5
            goto L_0x00dd
        L_0x00d5:
            r9[r7] = r13
            goto L_0x00dd
        L_0x00d8:
            r9[r7] = r12
            goto L_0x00dd
        L_0x00db:
            r9[r7] = r11
        L_0x00dd:
            java.lang.String r8 = java.lang.String.format(r8, r9)
            if (r15 == r7) goto L_0x00f7
            if (r15 == r6) goto L_0x00f7
            if (r15 == r5) goto L_0x00f7
            if (r15 == r4) goto L_0x00f7
            if (r15 == r3) goto L_0x00f7
            if (r15 == r2) goto L_0x00f7
            if (r15 == r1) goto L_0x00f7
            if (r15 == r0) goto L_0x00f7
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>(r8)
            goto L_0x00fc
        L_0x00f7:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            r15.<init>(r8)
        L_0x00fc:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: Rf.C5535y.F0(int):void");
    }

    private G0 K0() {
        if (this.f64958d == null) {
            if (this.f64957c.k()) {
                this.f64958d = this.f64957c;
            } else {
                List parameters = this.f64956b.l().getParameters();
                this.f64959e = new ArrayList(parameters.size());
                this.f64958d = C.b(parameters, this.f64957c.j(), this, this.f64959e);
                this.f64960f = C6565s.k0(this.f64959e, new a());
            }
        }
        return this.f64958d;
    }

    /* access modifiers changed from: private */
    public C5366d0 M0(C5366d0 d0Var) {
        if (d0Var == null || this.f64957c.k()) {
            return d0Var;
        }
        return (C5366d0) K0().p(d0Var, N0.INVARIANT);
    }

    public boolean A() {
        return this.f64956b.A();
    }

    public C5486d E() {
        return this.f64956b.E();
    }

    public C6812k I(E0 e02) {
        if (e02 == null) {
            F0(10);
        }
        C6812k i02 = i0(e02, C6755e.r(C6691i.g(this)));
        if (i02 == null) {
            F0(11);
        }
        return i02;
    }

    public boolean I0() {
        return this.f64956b.I0();
    }

    public c0 J0() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: L0 */
    public C5487e c(G0 g02) {
        if (g02 == null) {
            F0(23);
        }
        if (g02.k()) {
            return this;
        }
        return new C5535y(this, G0.h(g02.j(), K0().j()));
    }

    public Object U(C5497o oVar, Object obj) {
        return oVar.c(this, obj);
    }

    public C6812k V() {
        C6812k V10 = this.f64956b.V();
        if (V10 == null) {
            F0(28);
        }
        return V10;
    }

    public r0 W() {
        r0 W10 = this.f64956b.W();
        if (W10 == null) {
            return null;
        }
        return W10.b(new b());
    }

    public C6812k Y() {
        C6812k m02 = m0(C6755e.r(C6691i.g(this.f64956b)));
        if (m02 == null) {
            F0(12);
        }
        return m02;
    }

    public boolean Z() {
        return this.f64956b.Z();
    }

    public List a0() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            F0(17);
        }
        return emptyList;
    }

    public C5495m b() {
        C5495m b10 = this.f64956b.b();
        if (b10 == null) {
            F0(22);
        }
        return b10;
    }

    public boolean b0() {
        return this.f64956b.b0();
    }

    public boolean f0() {
        return this.f64956b.f0();
    }

    public h getAnnotations() {
        h annotations = this.f64956b.getAnnotations();
        if (annotations == null) {
            F0(19);
        }
        return annotations;
    }

    public f getName() {
        f name = this.f64956b.getName();
        if (name == null) {
            F0(20);
        }
        return name;
    }

    public C5502u getVisibility() {
        C5502u visibility = this.f64956b.getVisibility();
        if (visibility == null) {
            F0(27);
        }
        return visibility;
    }

    public C5488f h() {
        C5488f h10 = this.f64956b.h();
        if (h10 == null) {
            F0(25);
        }
        return h10;
    }

    public h0 i() {
        h0 h0Var = h0.f64497a;
        if (h0Var == null) {
            F0(29);
        }
        return h0Var;
    }

    public C6812k i0(E0 e02, g gVar) {
        if (e02 == null) {
            F0(5);
        }
        if (gVar == null) {
            F0(6);
        }
        C6812k i02 = this.f64956b.i0(e02, gVar);
        if (!this.f64957c.k()) {
            return new C6821t(i02, K0());
        }
        if (i02 == null) {
            F0(7);
        }
        return i02;
    }

    public boolean isExternal() {
        return this.f64956b.isExternal();
    }

    public boolean isInline() {
        return this.f64956b.isInline();
    }

    public Collection j() {
        Collection<C5486d> j10 = this.f64956b.j();
        ArrayList arrayList = new ArrayList(j10.size());
        for (C5486d dVar : j10) {
            arrayList.add(((C5486d) dVar.v().y(dVar.a()).r(dVar.r()).k(dVar.getVisibility()).n(dVar.h()).w(false).f()).c(K0()));
        }
        return arrayList;
    }

    public boolean k0() {
        return this.f64956b.k0();
    }

    public v0 l() {
        v0 l10 = this.f64956b.l();
        if (this.f64957c.k()) {
            if (l10 == null) {
                F0(0);
            }
            return l10;
        }
        if (this.f64961g == null) {
            G0 K02 = K0();
            Collection<S> l11 = l10.l();
            ArrayList arrayList = new ArrayList(l11.size());
            for (S p10 : l11) {
                arrayList.add(K02.p(p10, N0.INVARIANT));
            }
            this.f64961g = new C5393u(this, this.f64959e, arrayList, Eg.f.f62842e);
        }
        v0 v0Var = this.f64961g;
        if (v0Var == null) {
            F0(1);
        }
        return v0Var;
    }

    public C6812k m0(g gVar) {
        if (gVar == null) {
            F0(13);
        }
        C6812k m02 = this.f64956b.m0(gVar);
        if (!this.f64957c.k()) {
            return new C6821t(m02, K0());
        }
        if (m02 == null) {
            F0(14);
        }
        return m02;
    }

    public C6812k n0() {
        C6812k n02 = this.f64956b.n0();
        if (n02 == null) {
            F0(15);
        }
        return n02;
    }

    public C5487e o0() {
        return this.f64956b.o0();
    }

    public C5366d0 p() {
        C5366d0 m10 = V.m(C5396x.f63077a.a(getAnnotations(), (v0) null, (C5495m) null), l(), J0.g(l().getParameters()), false, Y());
        if (m10 == null) {
            F0(16);
        }
        return m10;
    }

    public List q() {
        K0();
        List list = this.f64960f;
        if (list == null) {
            F0(30);
        }
        return list;
    }

    public E r() {
        E r10 = this.f64956b.r();
        if (r10 == null) {
            F0(26);
        }
        return r10;
    }

    public boolean t() {
        return this.f64956b.t();
    }

    public Collection y() {
        Collection y10 = this.f64956b.y();
        if (y10 == null) {
            F0(31);
        }
        return y10;
    }

    public C5487e a() {
        C5487e a10 = this.f64956b.a();
        if (a10 == null) {
            F0(21);
        }
        return a10;
    }
}
