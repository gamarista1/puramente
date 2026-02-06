package fg;

import Fg.C5364c0;
import Fg.J0;
import Fg.M0;
import Fg.S;
import Kg.d;
import Nf.c;
import Of.C5484b;
import Of.C5490h;
import Of.C5500s;
import Of.c0;
import Of.m0;
import Of.t0;
import Pf.a;
import Pf.h;
import Xf.C5670c;
import ag.k;
import bg.C5769j;
import bg.C5773n;
import eg.C5824a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import ng.f;
import vg.C6755e;
import yf.C6798l;

/* renamed from: fg.e0  reason: case insensitive filesystem */
public final class C5905e0 {

    /* renamed from: a  reason: collision with root package name */
    private final C5908g f67633a;

    public C5905e0(C5908g gVar) {
        C6496s.h(gVar, "typeEnhancement");
        this.f67633a = gVar;
    }

    private final boolean f(S s10) {
        return J0.c(s10, C5903d0.f67631a);
    }

    /* access modifiers changed from: private */
    public static final Boolean g(M0 m02) {
        boolean z10;
        C5490h o10 = m02.N0().o();
        if (o10 == null) {
            return Boolean.FALSE;
        }
        f name = o10.getName();
        c cVar = c.f64255a;
        if (!C6496s.c(name, cVar.h().g()) || !C6496s.c(C6755e.k(o10), cVar.h())) {
            z10 = false;
        } else {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    private final S h(C5484b bVar, a aVar, boolean z10, k kVar, C5670c cVar, C5915j0 j0Var, boolean z11, C6798l lVar) {
        C6798l lVar2 = lVar;
        C5909g0 g0Var = new C5909g0(aVar, z10, kVar, cVar, false, 16, (DefaultConstructorMarker) null);
        C5484b bVar2 = bVar;
        S s10 = (S) lVar2.invoke(bVar);
        Collection e10 = bVar.e();
        C6496s.g(e10, "getOverriddenDescriptors(...)");
        Iterable<C5484b> iterable = e10;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (C5484b bVar3 : iterable) {
            C6496s.e(bVar3);
            arrayList.add((S) lVar2.invoke(bVar3));
        }
        return i(g0Var, s10, arrayList, j0Var, z11);
    }

    private final S i(C5909g0 g0Var, S s10, List list, C5915j0 j0Var, boolean z10) {
        return this.f67633a.a(s10, g0Var.d(s10, list, j0Var, z10), g0Var.z());
    }

    static /* synthetic */ S j(C5905e0 e0Var, C5484b bVar, a aVar, boolean z10, k kVar, C5670c cVar, C5915j0 j0Var, boolean z11, C6798l lVar, int i10, Object obj) {
        boolean z12;
        if ((i10 & 32) != 0) {
            z12 = false;
        } else {
            z12 = z11;
        }
        return e0Var.h(bVar, aVar, z10, kVar, cVar, j0Var, z12, lVar);
    }

    static /* synthetic */ S k(C5905e0 e0Var, C5909g0 g0Var, S s10, List list, C5915j0 j0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j0Var = null;
        }
        C5915j0 j0Var2 = j0Var;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return e0Var.i(g0Var, s10, list, j0Var2, z10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final Of.C5484b l(Of.C5484b r22, ag.k r23) {
        /*
            r21 = this;
            r11 = r21
            r12 = r22
            boolean r0 = r12 instanceof Zf.a
            if (r0 != 0) goto L_0x0009
            return r12
        L_0x0009:
            Of.b$a r0 = r22.h()
            Of.b$a r1 = Of.C5484b.a.FAKE_OVERRIDE
            r13 = 1
            if (r0 != r1) goto L_0x0021
            Of.b r0 = r22.a()
            java.util.Collection r0 = r0.e()
            int r0 = r0.size()
            if (r0 != r13) goto L_0x0021
            return r12
        L_0x0021:
            Pf.h r0 = r21.u(r22, r23)
            r7 = r23
            ag.k r8 = ag.c.k(r7, r0)
            boolean r0 = r12 instanceof Zf.f
            if (r0 == 0) goto L_0x0047
            r0 = r12
            Rf.K r0 = (Rf.K) r0
            Rf.L r1 = r0.d()
            if (r1 == 0) goto L_0x0047
            boolean r1 = r1.G()
            if (r1 != 0) goto L_0x0047
            Rf.L r0 = r0.d()
            kotlin.jvm.internal.C6496s.e(r0)
            r9 = r0
            goto L_0x0048
        L_0x0047:
            r9 = r12
        L_0x0048:
            Of.c0 r0 = r22.P()
            r14 = 0
            if (r0 == 0) goto L_0x0074
            boolean r0 = r9 instanceof Of.C5507z
            if (r0 == 0) goto L_0x0057
            r0 = r9
            Of.z r0 = (Of.C5507z) r0
            goto L_0x0058
        L_0x0057:
            r0 = r14
        L_0x0058:
            if (r0 == 0) goto L_0x0064
            Of.a$a r1 = Zf.e.f66931G
            java.lang.Object r0 = r0.B(r1)
            Of.t0 r0 = (Of.t0) r0
            r2 = r0
            goto L_0x0065
        L_0x0064:
            r2 = r14
        L_0x0065:
            r5 = 0
            fg.Z r6 = fg.C5895Z.f67618a
            r4 = 0
            r0 = r21
            r1 = r22
            r3 = r8
            Fg.S r0 = r0.t(r1, r2, r3, r4, r5, r6)
            r15 = r0
            goto L_0x0075
        L_0x0074:
            r15 = r14
        L_0x0075:
            boolean r0 = r12 instanceof Zf.e
            if (r0 == 0) goto L_0x007d
            r0 = r12
            Zf.e r0 = (Zf.e) r0
            goto L_0x007e
        L_0x007d:
            r0 = r14
        L_0x007e:
            r10 = 0
            if (r0 == 0) goto L_0x00d3
            gg.F r1 = gg.C5946F.f67716a
            Of.m r2 = r0.b()
            java.lang.String r3 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            kotlin.jvm.internal.C6496s.f(r2, r3)
            Of.e r2 = (Of.C5487e) r2
            r3 = 3
            java.lang.String r0 = gg.C5943C.c(r0, r10, r10, r3, r14)
            java.lang.String r0 = gg.C5942B.a(r1, r2, r0)
            if (r0 == 0) goto L_0x00d3
            java.util.Map r1 = fg.C5893X.u0()
            java.lang.Object r0 = r1.get(r0)
            fg.Y r0 = (fg.C5894Y) r0
            if (r0 == 0) goto L_0x00cf
            java.lang.String r1 = r0.a()
            if (r1 == 0) goto L_0x00c3
            java.lang.String r1 = r0.a()
            if (r1 == 0) goto L_0x00bb
            java.lang.String r2 = "2."
            r3 = 2
            boolean r1 = Sg.p.J(r1, r2, r10, r3, r14)
            if (r1 != r13) goto L_0x00bb
            goto L_0x00c3
        L_0x00bb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            r0.<init>(r1)
            throw r0
        L_0x00c3:
            java.lang.String r1 = r0.a()
            if (r1 != 0) goto L_0x00ca
            goto L_0x00d0
        L_0x00ca:
            fg.Y r0 = r0.d()
            goto L_0x00d0
        L_0x00cf:
            r0 = r14
        L_0x00d0:
            r16 = r0
            goto L_0x00d5
        L_0x00d3:
            r16 = r14
        L_0x00d5:
            if (r16 == 0) goto L_0x00e8
            java.util.List r0 = r16.b()
            r0.size()
            r0 = r12
            Zf.e r0 = (Zf.e) r0
            java.util.List r0 = r0.k()
            r0.size()
        L_0x00e8:
            ag.d r0 = r23.a()
            Xf.D r0 = r0.i()
            boolean r0 = Xf.V.c(r0)
            if (r0 != 0) goto L_0x0104
            ag.d r0 = r8.a()
            ag.e r0 = r0.q()
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x010c
        L_0x0104:
            boolean r0 = Xf.V.b(r22)
            if (r0 == 0) goto L_0x010c
            r7 = r13
            goto L_0x010d
        L_0x010c:
            r7 = r10
        L_0x010d:
            java.util.List r0 = r9.k()
            java.lang.String r6 = "getValueParameters(...)"
            kotlin.jvm.internal.C6496s.g(r0, r6)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r5 = new java.util.ArrayList
            r4 = 10
            int r1 = mf.C6565s.y(r0, r4)
            r5.<init>(r1)
            java.util.Iterator r17 = r0.iterator()
        L_0x0127:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x016e
            java.lang.Object r0 = r17.next()
            r2 = r0
            Of.t0 r2 = (Of.t0) r2
            if (r16 == 0) goto L_0x0149
            java.util.List r0 = r16.b()
            if (r0 == 0) goto L_0x0149
            int r1 = r2.getIndex()
            java.lang.Object r0 = mf.C6565s.r0(r0, r1)
            fg.j0 r0 = (fg.C5915j0) r0
            r18 = r0
            goto L_0x014b
        L_0x0149:
            r18 = r14
        L_0x014b:
            fg.a0 r3 = new fg.a0
            r3.<init>(r2)
            r0 = r21
            r1 = r22
            r19 = r3
            r3 = r8
            r14 = r4
            r4 = r18
            r14 = r5
            r5 = r7
            r20 = r6
            r6 = r19
            Fg.S r0 = r0.t(r1, r2, r3, r4, r5, r6)
            r14.add(r0)
            r5 = r14
            r6 = r20
            r4 = 10
            r14 = 0
            goto L_0x0127
        L_0x016e:
            r14 = r5
            r20 = r6
            boolean r0 = r12 instanceof Of.Z
            if (r0 == 0) goto L_0x0179
            r0 = r12
            Of.Z r0 = (Of.Z) r0
            goto L_0x017a
        L_0x0179:
            r0 = 0
        L_0x017a:
            if (r0 == 0) goto L_0x0186
            boolean r0 = bg.C5763d.a(r0)
            if (r0 != r13) goto L_0x0186
            Xf.c r0 = Xf.C5670c.FIELD
        L_0x0184:
            r5 = r0
            goto L_0x0189
        L_0x0186:
            Xf.c r0 = Xf.C5670c.METHOD_RETURN_TYPE
            goto L_0x0184
        L_0x0189:
            if (r16 == 0) goto L_0x0191
            fg.j0 r0 = r16.c()
            r6 = r0
            goto L_0x0192
        L_0x0191:
            r6 = 0
        L_0x0192:
            fg.b0 r16 = fg.C5899b0.f67624a
            r17 = 32
            r19 = 0
            r3 = 1
            r7 = 0
            r0 = r21
            r1 = r22
            r2 = r9
            r4 = r8
            r8 = r16
            r9 = r17
            r16 = r10
            r10 = r19
            Fg.S r0 = j(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            Fg.S r1 = r22.getReturnType()
            kotlin.jvm.internal.C6496s.e(r1)
            boolean r1 = r11.f(r1)
            java.lang.String r2 = "getType(...)"
            if (r1 != 0) goto L_0x020f
            Of.c0 r1 = r22.P()
            if (r1 == 0) goto L_0x01cc
            Fg.S r1 = r1.getType()
            if (r1 == 0) goto L_0x01cc
            boolean r10 = r11.f(r1)
            goto L_0x01ce
        L_0x01cc:
            r10 = r16
        L_0x01ce:
            if (r10 != 0) goto L_0x020f
            java.util.List r1 = r22.k()
            r3 = r20
            kotlin.jvm.internal.C6496s.g(r1, r3)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r3 = r1 instanceof java.util.Collection
            if (r3 == 0) goto L_0x01eb
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x01eb
        L_0x01e8:
            r10 = r16
            goto L_0x0209
        L_0x01eb:
            java.util.Iterator r1 = r1.iterator()
        L_0x01ef:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x01e8
            java.lang.Object r3 = r1.next()
            Of.t0 r3 = (Of.t0) r3
            Fg.S r3 = r3.getType()
            kotlin.jvm.internal.C6496s.g(r3, r2)
            boolean r3 = r11.f(r3)
            if (r3 == 0) goto L_0x01ef
            r10 = r13
        L_0x0209:
            if (r10 == 0) goto L_0x020c
            goto L_0x020f
        L_0x020c:
            r10 = r16
            goto L_0x0210
        L_0x020f:
            r10 = r13
        L_0x0210:
            if (r10 == 0) goto L_0x0220
            Of.a$a r1 = ug.C6746d.a()
            Xf.n r3 = new Xf.n
            r3.<init>(r12)
            kotlin.Pair r1 = lf.C6502A.a(r1, r3)
            goto L_0x0221
        L_0x0220:
            r1 = 0
        L_0x0221:
            if (r15 != 0) goto L_0x024c
            if (r0 != 0) goto L_0x024c
            boolean r3 = r14.isEmpty()
            if (r3 == 0) goto L_0x022e
        L_0x022b:
            r13 = r16
            goto L_0x0246
        L_0x022e:
            java.util.Iterator r3 = r14.iterator()
        L_0x0232:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x022b
            java.lang.Object r4 = r3.next()
            Fg.S r4 = (Fg.S) r4
            if (r4 == 0) goto L_0x0242
            r10 = r13
            goto L_0x0244
        L_0x0242:
            r10 = r16
        L_0x0244:
            if (r10 == 0) goto L_0x0232
        L_0x0246:
            if (r13 != 0) goto L_0x024c
            if (r1 == 0) goto L_0x024b
            goto L_0x024c
        L_0x024b:
            return r12
        L_0x024c:
            r3 = r12
            Zf.a r3 = (Zf.a) r3
            if (r15 != 0) goto L_0x025e
            Of.c0 r4 = r22.P()
            if (r4 == 0) goto L_0x025d
            Fg.S r4 = r4.getType()
            r15 = r4
            goto L_0x025e
        L_0x025d:
            r15 = 0
        L_0x025e:
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = mf.C6565s.y(r14, r5)
            r4.<init>(r5)
            java.util.Iterator r5 = r14.iterator()
            r10 = r16
        L_0x026f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x029a
            java.lang.Object r6 = r5.next()
            int r7 = r10 + 1
            if (r10 >= 0) goto L_0x0280
            mf.C6565s.x()
        L_0x0280:
            Fg.S r6 = (Fg.S) r6
            if (r6 != 0) goto L_0x0295
            java.util.List r6 = r22.k()
            java.lang.Object r6 = r6.get(r10)
            Of.t0 r6 = (Of.t0) r6
            Fg.S r6 = r6.getType()
            kotlin.jvm.internal.C6496s.g(r6, r2)
        L_0x0295:
            r4.add(r6)
            r10 = r7
            goto L_0x026f
        L_0x029a:
            if (r0 != 0) goto L_0x02a3
            Fg.S r0 = r22.getReturnType()
            kotlin.jvm.internal.C6496s.e(r0)
        L_0x02a3:
            Zf.a r0 = r3.z(r15, r4, r0, r1)
            java.lang.String r1 = "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature"
            kotlin.jvm.internal.C6496s.f(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fg.C5905e0.l(Of.b, ag.k):Of.b");
    }

    /* access modifiers changed from: private */
    public static final S m(C5484b bVar) {
        C6496s.h(bVar, "it");
        S returnType = bVar.getReturnType();
        C6496s.e(returnType);
        return returnType;
    }

    /* access modifiers changed from: private */
    public static final S n(C5484b bVar) {
        C6496s.h(bVar, "it");
        c0 P10 = bVar.P();
        C6496s.e(P10);
        S type = P10.getType();
        C6496s.g(type, "getType(...)");
        return type;
    }

    /* access modifiers changed from: private */
    public static final S o(t0 t0Var, C5484b bVar) {
        C6496s.h(bVar, "it");
        S type = ((t0) bVar.k().get(t0Var.getIndex())).getType();
        C6496s.g(type, "getType(...)");
        return type;
    }

    /* access modifiers changed from: private */
    public static final boolean s(M0 m02) {
        C6496s.h(m02, "it");
        return m02 instanceof C5364c0;
    }

    private final S t(C5484b bVar, t0 t0Var, k kVar, C5915j0 j0Var, boolean z10, C6798l lVar) {
        k kVar2;
        k k10;
        if (t0Var == null || (k10 = ag.c.k(kVar, t0Var.getAnnotations())) == null) {
            kVar2 = kVar;
        } else {
            kVar2 = k10;
        }
        return h(bVar, t0Var, false, kVar2, C5670c.VALUE_PARAMETER, j0Var, z10, lVar);
    }

    private final h u(C5484b bVar, k kVar) {
        C5773n nVar;
        C5490h a10 = C5500s.a(bVar);
        if (a10 == null) {
            return bVar.getAnnotations();
        }
        List list = null;
        if (a10 instanceof C5773n) {
            nVar = (C5773n) a10;
        } else {
            nVar = null;
        }
        if (nVar != null) {
            list = nVar.T0();
        }
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            return bVar.getAnnotations();
        }
        Iterable<C5824a> iterable = list;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (C5824a jVar : iterable) {
            arrayList.add(new C5769j(kVar, jVar, true));
        }
        return h.f64602L.a(C6565s.I0(bVar.getAnnotations(), arrayList));
    }

    public final Collection p(k kVar, Collection collection) {
        C6496s.h(kVar, "c");
        C6496s.h(collection, "platformSignatures");
        Iterable<C5484b> iterable = collection;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (C5484b l10 : iterable) {
            arrayList.add(l(l10, kVar));
        }
        return arrayList;
    }

    public final S q(S s10, k kVar) {
        C6496s.h(s10, "type");
        C6496s.h(kVar, "context");
        S k10 = k(this, new C5909g0((a) null, false, kVar, C5670c.TYPE_USE, true), s10, C6565s.n(), (C5915j0) null, false, 12, (Object) null);
        if (k10 == null) {
            return s10;
        }
        return k10;
    }

    public final List r(m0 m0Var, List list, k kVar) {
        C6496s.h(m0Var, "typeParameter");
        C6496s.h(list, "bounds");
        C6496s.h(kVar, "context");
        Iterable<S> iterable = list;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (S s10 : iterable) {
            if (!d.e(s10, C5901c0.f67627a)) {
                S s11 = s10;
                S k10 = k(this, new C5909g0(m0Var, false, kVar, C5670c.TYPE_PARAMETER_BOUNDS, false, 16, (DefaultConstructorMarker) null), s11, C6565s.n(), (C5915j0) null, false, 12, (Object) null);
                if (k10 != null) {
                    s10 = k10;
                }
            }
            arrayList.add(s10);
        }
        return arrayList;
    }
}
