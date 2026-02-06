package fg;

import Fg.C5366d0;
import Fg.C5374h0;
import Fg.S;
import ag.e;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

/* renamed from: fg.g  reason: case insensitive filesystem */
public final class C5908g {

    /* renamed from: a  reason: collision with root package name */
    private final e f67643a;

    /* renamed from: fg.g$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final S f67644a;

        /* renamed from: b  reason: collision with root package name */
        private final int f67645b;

        public a(S s10, int i10) {
            this.f67644a = s10;
            this.f67645b = i10;
        }

        public final int a() {
            return this.f67645b;
        }

        public final S b() {
            return this.f67644a;
        }
    }

    /* renamed from: fg.g$b */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final C5366d0 f67646a;

        /* renamed from: b  reason: collision with root package name */
        private final int f67647b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f67648c;

        public b(C5366d0 d0Var, int i10, boolean z10) {
            this.f67646a = d0Var;
            this.f67647b = i10;
            this.f67648c = z10;
        }

        public final boolean a() {
            return this.f67648c;
        }

        public final int b() {
            return this.f67647b;
        }

        public final C5366d0 c() {
            return this.f67646a;
        }
    }

    public C5908g(e eVar) {
        C6496s.h(eVar, "javaResolverSettings");
        this.f67643a = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0202  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final fg.C5908g.b b(Fg.C5366d0 r19, yf.C6798l r20, int r21, fg.C5911h0 r22, boolean r23, boolean r24) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r22
            r3 = r24
            boolean r4 = fg.C5913i0.a(r22)
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x0015
            if (r23 != 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r7 = r5
            goto L_0x0016
        L_0x0015:
            r7 = r6
        L_0x0016:
            r8 = 0
            if (r4 != 0) goto L_0x0029
            java.util.List r4 = r19.L0()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0029
            fg.g$b r1 = new fg.g$b
            r1.<init>(r8, r6, r5)
            return r1
        L_0x0029:
            Fg.v0 r4 = r19.N0()
            Of.h r4 = r4.o()
            if (r4 != 0) goto L_0x0039
            fg.g$b r1 = new fg.g$b
            r1.<init>(r8, r6, r5)
            return r1
        L_0x0039:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r21)
            java.lang.Object r9 = r1.invoke(r9)
            fg.h r9 = (fg.C5910h) r9
            Of.h r4 = fg.C5917k0.f(r4, r9, r2)
            java.lang.Boolean r2 = fg.C5917k0.h(r9, r2)
            if (r4 == 0) goto L_0x0056
            Fg.v0 r10 = r4.l()
            if (r10 != 0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r12 = r10
            goto L_0x005b
        L_0x0056:
            Fg.v0 r10 = r19.N0()
            goto L_0x0054
        L_0x005b:
            int r10 = r21 + 1
            java.util.List r11 = r19.L0()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.List r13 = r12.getParameters()
            java.lang.String r14 = "getParameters(...)"
            kotlin.jvm.internal.C6496s.g(r13, r14)
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r14 = r11.iterator()
            java.util.Iterator r15 = r13.iterator()
            java.util.ArrayList r6 = new java.util.ArrayList
            r5 = 10
            int r11 = mf.C6565s.y(r11, r5)
            int r13 = mf.C6565s.y(r13, r5)
            int r11 = java.lang.Math.min(r11, r13)
            r6.<init>(r11)
        L_0x0089:
            boolean r11 = r14.hasNext()
            if (r11 == 0) goto L_0x014e
            boolean r11 = r15.hasNext()
            if (r11 == 0) goto L_0x014e
            java.lang.Object r11 = r14.next()
            java.lang.Object r13 = r15.next()
            Of.m0 r13 = (Of.m0) r13
            Fg.B0 r11 = (Fg.B0) r11
            if (r7 != 0) goto L_0x00ac
            fg.g$a r5 = new fg.g$a
            r23 = r7
            r7 = 0
            r5.<init>(r8, r7)
            goto L_0x0100
        L_0x00ac:
            r23 = r7
            boolean r5 = r11.a()
            if (r5 != 0) goto L_0x00c1
            Fg.S r5 = r11.getType()
            Fg.M0 r5 = r5.Q0()
            fg.g$a r5 = r0.d(r5, r1, r10, r3)
            goto L_0x0100
        L_0x00c1:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            java.lang.Object r5 = r1.invoke(r5)
            fg.h r5 = (fg.C5910h) r5
            fg.k r5 = r5.f()
            fg.k r7 = fg.C5916k.FORCE_FLEXIBILITY
            if (r5 != r7) goto L_0x00f8
            Fg.S r5 = r11.getType()
            Fg.M0 r5 = r5.Q0()
            fg.g$a r7 = new fg.g$a
            Fg.d0 r8 = Fg.L.c(r5)
            r1 = 0
            Fg.d0 r8 = r8.U0(r1)
            Fg.d0 r1 = Fg.L.d(r5)
            r5 = 1
            Fg.d0 r1 = r1.U0(r5)
            Fg.M0 r1 = Fg.V.e(r8, r1)
            r7.<init>(r1, r5)
            r5 = r7
            goto L_0x0100
        L_0x00f8:
            r5 = 1
            fg.g$a r1 = new fg.g$a
            r7 = 0
            r1.<init>(r7, r5)
            r5 = r1
        L_0x0100:
            int r1 = r5.a()
            int r10 = r10 + r1
            Fg.S r1 = r5.b()
            java.lang.String r7 = "getProjectionKind(...)"
            if (r1 == 0) goto L_0x011d
            Fg.S r1 = r5.b()
            Fg.N0 r5 = r11.b()
            kotlin.jvm.internal.C6496s.g(r5, r7)
            Fg.B0 r7 = Kg.d.k(r1, r5, r13)
            goto L_0x0142
        L_0x011d:
            if (r4 == 0) goto L_0x013a
            boolean r1 = r11.a()
            if (r1 != 0) goto L_0x013a
            Fg.S r1 = r11.getType()
            java.lang.String r5 = "getType(...)"
            kotlin.jvm.internal.C6496s.g(r1, r5)
            Fg.N0 r5 = r11.b()
            kotlin.jvm.internal.C6496s.g(r5, r7)
            Fg.B0 r7 = Kg.d.k(r1, r5, r13)
            goto L_0x0142
        L_0x013a:
            if (r4 == 0) goto L_0x0141
            Fg.B0 r7 = Fg.J0.s(r13)
            goto L_0x0142
        L_0x0141:
            r7 = 0
        L_0x0142:
            r6.add(r7)
            r1 = r20
            r7 = r23
            r5 = 10
            r8 = 0
            goto L_0x0089
        L_0x014e:
            int r10 = r10 - r21
            if (r4 != 0) goto L_0x016e
            if (r2 != 0) goto L_0x016e
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x015b
            goto L_0x0170
        L_0x015b:
            java.util.Iterator r1 = r6.iterator()
        L_0x015f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0170
            java.lang.Object r3 = r1.next()
            Fg.B0 r3 = (Fg.B0) r3
            if (r3 != 0) goto L_0x016e
            goto L_0x015f
        L_0x016e:
            r7 = 0
            goto L_0x0178
        L_0x0170:
            fg.g$b r1 = new fg.g$b
            r2 = 0
            r7 = 0
            r1.<init>(r7, r10, r2)
            return r1
        L_0x0178:
            Pf.h r1 = r19.getAnnotations()
            fg.f r3 = fg.C5917k0.f67677b
            if (r4 == 0) goto L_0x0183
            goto L_0x0184
        L_0x0183:
            r3 = r7
        L_0x0184:
            Pf.h r4 = fg.C5917k0.g()
            if (r2 == 0) goto L_0x018c
            r8 = r4
            goto L_0x018d
        L_0x018c:
            r8 = r7
        L_0x018d:
            r4 = 3
            Pf.h[] r4 = new Pf.h[r4]
            r5 = 0
            r4[r5] = r1
            r1 = 1
            r4[r1] = r3
            r3 = 2
            r4[r3] = r8
            java.util.List r3 = mf.C6565s.s(r4)
            Pf.h r3 = fg.C5917k0.e(r3)
            Fg.r0 r11 = Fg.s0.b(r3)
            java.util.List r3 = r19.L0()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r4 = r6.iterator()
            java.util.Iterator r7 = r3.iterator()
            java.util.ArrayList r13 = new java.util.ArrayList
            r8 = 10
            int r6 = mf.C6565s.y(r6, r8)
            int r3 = mf.C6565s.y(r3, r8)
            int r3 = java.lang.Math.min(r6, r3)
            r13.<init>(r3)
        L_0x01c6:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x01e6
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x01e6
            java.lang.Object r3 = r4.next()
            java.lang.Object r6 = r7.next()
            Fg.B0 r6 = (Fg.B0) r6
            Fg.B0 r3 = (Fg.B0) r3
            if (r3 != 0) goto L_0x01e1
            goto L_0x01e2
        L_0x01e1:
            r6 = r3
        L_0x01e2:
            r13.add(r6)
            goto L_0x01c6
        L_0x01e6:
            if (r2 == 0) goto L_0x01ee
            boolean r3 = r2.booleanValue()
        L_0x01ec:
            r14 = r3
            goto L_0x01f3
        L_0x01ee:
            boolean r3 = r19.O0()
            goto L_0x01ec
        L_0x01f3:
            r16 = 16
            r17 = 0
            r15 = 0
            Fg.d0 r3 = Fg.V.k(r11, r12, r13, r14, r15, r16, r17)
            boolean r4 = r9.d()
            if (r4 == 0) goto L_0x0206
            Fg.d0 r3 = r0.e(r3)
        L_0x0206:
            if (r2 == 0) goto L_0x020f
            boolean r2 = r9.g()
            if (r2 == 0) goto L_0x020f
            r5 = r1
        L_0x020f:
            fg.g$b r1 = new fg.g$b
            r1.<init>(r3, r10, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fg.C5908g.b(Fg.d0, yf.l, int, fg.h0, boolean, boolean):fg.g$b");
    }

    static /* synthetic */ b c(C5908g gVar, C5366d0 d0Var, C6798l lVar, int i10, C5911h0 h0Var, boolean z10, boolean z11, int i11, Object obj) {
        boolean z12;
        boolean z13;
        if ((i11 & 8) != 0) {
            z12 = false;
        } else {
            z12 = z10;
        }
        if ((i11 & 16) != 0) {
            z13 = false;
        } else {
            z13 = z11;
        }
        return gVar.b(d0Var, lVar, i10, h0Var, z12, z13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0096, code lost:
        if (r13 == null) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final fg.C5908g.a d(Fg.M0 r12, yf.C6798l r13, int r14, boolean r15) {
        /*
            r11 = this;
            boolean r0 = Fg.W.a(r12)
            r1 = 0
            if (r0 == 0) goto L_0x000e
            fg.g$a r12 = new fg.g$a
            r13 = 1
            r12.<init>(r1, r13)
            return r12
        L_0x000e:
            boolean r0 = r12 instanceof Fg.I
            if (r0 == 0) goto L_0x00ad
            boolean r0 = r12 instanceof Fg.C5364c0
            r9 = r12
            Fg.I r9 = (Fg.I) r9
            Fg.d0 r3 = r9.V0()
            fg.h0 r6 = fg.C5911h0.FLEXIBLE_LOWER
            r2 = r11
            r4 = r13
            r5 = r14
            r7 = r0
            r8 = r15
            fg.g$b r10 = r2.b(r3, r4, r5, r6, r7, r8)
            Fg.d0 r3 = r9.W0()
            fg.h0 r6 = fg.C5911h0.FLEXIBLE_UPPER
            fg.g$b r13 = r2.b(r3, r4, r5, r6, r7, r8)
            r10.b()
            r13.b()
            Fg.d0 r14 = r10.c()
            if (r14 != 0) goto L_0x0043
            Fg.d0 r14 = r13.c()
            if (r14 != 0) goto L_0x0043
            goto L_0x00a3
        L_0x0043:
            boolean r14 = r10.a()
            if (r14 != 0) goto L_0x0085
            boolean r14 = r13.a()
            if (r14 == 0) goto L_0x0050
            goto L_0x0085
        L_0x0050:
            if (r0 == 0) goto L_0x006c
            cg.k r1 = new cg.k
            Fg.d0 r12 = r10.c()
            if (r12 != 0) goto L_0x005e
            Fg.d0 r12 = r9.V0()
        L_0x005e:
            Fg.d0 r13 = r13.c()
            if (r13 != 0) goto L_0x0068
            Fg.d0 r13 = r9.W0()
        L_0x0068:
            r1.<init>(r12, r13)
            goto L_0x00a3
        L_0x006c:
            Fg.d0 r12 = r10.c()
            if (r12 != 0) goto L_0x0076
            Fg.d0 r12 = r9.V0()
        L_0x0076:
            Fg.d0 r13 = r13.c()
            if (r13 != 0) goto L_0x0080
            Fg.d0 r13 = r9.W0()
        L_0x0080:
            Fg.M0 r1 = Fg.V.e(r12, r13)
            goto L_0x00a3
        L_0x0085:
            Fg.d0 r13 = r13.c()
            if (r13 == 0) goto L_0x0098
            Fg.d0 r14 = r10.c()
            if (r14 != 0) goto L_0x0092
            r14 = r13
        L_0x0092:
            Fg.M0 r13 = Fg.V.e(r14, r13)
            if (r13 != 0) goto L_0x009f
        L_0x0098:
            Fg.d0 r13 = r10.c()
            kotlin.jvm.internal.C6496s.e(r13)
        L_0x009f:
            Fg.M0 r1 = Fg.L0.d(r12, r13)
        L_0x00a3:
            fg.g$a r12 = new fg.g$a
            int r13 = r10.b()
            r12.<init>(r1, r13)
            goto L_0x00df
        L_0x00ad:
            boolean r0 = r12 instanceof Fg.C5366d0
            if (r0 == 0) goto L_0x00e0
            r2 = r12
            Fg.d0 r2 = (Fg.C5366d0) r2
            fg.h0 r5 = fg.C5911h0.INFLEXIBLE
            r8 = 8
            r9 = 0
            r6 = 0
            r1 = r11
            r3 = r13
            r4 = r14
            r7 = r15
            fg.g$b r13 = c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            fg.g$a r14 = new fg.g$a
            boolean r15 = r13.a()
            if (r15 == 0) goto L_0x00d3
            Fg.d0 r15 = r13.c()
            Fg.M0 r12 = Fg.L0.d(r12, r15)
            goto L_0x00d7
        L_0x00d3:
            Fg.d0 r12 = r13.c()
        L_0x00d7:
            int r13 = r13.b()
            r14.<init>(r12, r13)
            r12 = r14
        L_0x00df:
            return r12
        L_0x00e0:
            lf.s r12 = new lf.s
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: fg.C5908g.d(Fg.M0, yf.l, int, boolean):fg.g$a");
    }

    private final C5366d0 e(C5366d0 d0Var) {
        if (this.f67643a.a()) {
            return C5374h0.h(d0Var, true);
        }
        return new C5914j(d0Var);
    }

    public final S a(S s10, C6798l lVar, boolean z10) {
        C6496s.h(s10, "<this>");
        C6496s.h(lVar, "qualifiers");
        return d(s10.Q0(), lVar, 0, z10).b();
    }
}
