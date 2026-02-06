package Q0;

import V0.h;
import V0.o;
import V0.p;
import V0.s;
import X0.e;
import b1.C1869a;
import b1.C1870b;
import b1.k;
import b1.m;
import b1.n;
import c1.v;
import c1.w;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2544x0;
import r0.C2550z0;
import r0.e2;
import r0.f2;
import t0.C2606g;
import t0.C2609j;
import yf.C6787a;

public abstract class D {

    /* renamed from: a  reason: collision with root package name */
    private static final long f5246a = w.f(14);

    /* renamed from: b  reason: collision with root package name */
    private static final long f5247b = w.f(0);

    /* renamed from: c  reason: collision with root package name */
    private static final long f5248c;

    /* renamed from: d  reason: collision with root package name */
    private static final long f5249d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final n f5250e;

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f5251a = new a();

        a() {
            super(0);
        }

        /* renamed from: a */
        public final n invoke() {
            return D.f5250e;
        }
    }

    static {
        C2544x0.a aVar = C2544x0.f25560b;
        f5248c = aVar.g();
        long a10 = aVar.a();
        f5249d = a10;
        f5250e = n.f19132a.b(a10);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x00e4: MOVE  (r14v2 X0.e) = (r37v0 X0.e)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0193  */
    public static final Q0.C b(Q0.C r21, long r22, r0.C2514n0 r24, float r25, long r26, V0.p r28, V0.n r29, V0.o r30, V0.h r31, java.lang.String r32, long r33, b1.C1869a r35, b1.o r36, X0.e r37, long r38, b1.k r40, r0.e2 r41, Q0.z r42, t0.C2606g r43) {
        /*
            r0 = r21
            r1 = r22
            r3 = r24
            r4 = r25
            r5 = r28
            r6 = r29
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r35
            r11 = r36
            r12 = r37
            r13 = r38
            r15 = r40
            r0 = r41
            boolean r16 = c1.w.g(r26)
            r17 = 16
            if (r16 != 0) goto L_0x003f
            long r13 = r21.k()
            r11 = r26
            boolean r13 = c1.v.e(r11, r13)
            if (r13 == 0) goto L_0x0033
            goto L_0x0041
        L_0x0033:
            r0 = r21
            r13 = r36
        L_0x0037:
            r11 = r38
        L_0x0039:
            r14 = r42
        L_0x003b:
            r15 = r43
            goto L_0x013f
        L_0x003f:
            r11 = r26
        L_0x0041:
            if (r3 != 0) goto L_0x0055
            int r13 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r13 == 0) goto L_0x0055
            b1.n r13 = r21.t()
            long r13 = r13.d()
            boolean r13 = r0.C2544x0.q(r1, r13)
            if (r13 == 0) goto L_0x0033
        L_0x0055:
            if (r6 == 0) goto L_0x0061
            V0.n r13 = r21.l()
            boolean r13 = kotlin.jvm.internal.C6496s.c(r6, r13)
            if (r13 == 0) goto L_0x0033
        L_0x0061:
            if (r5 == 0) goto L_0x006d
            V0.p r13 = r21.n()
            boolean r13 = kotlin.jvm.internal.C6496s.c(r5, r13)
            if (r13 == 0) goto L_0x0033
        L_0x006d:
            if (r8 == 0) goto L_0x0075
            V0.h r13 = r21.i()
            if (r8 != r13) goto L_0x0033
        L_0x0075:
            boolean r13 = c1.w.g(r33)
            if (r13 != 0) goto L_0x0088
            long r13 = r21.o()
            r11 = r33
            boolean r13 = c1.v.e(r11, r13)
            if (r13 == 0) goto L_0x0033
            goto L_0x008a
        L_0x0088:
            r11 = r33
        L_0x008a:
            if (r15 == 0) goto L_0x0096
            b1.k r13 = r21.s()
            boolean r13 = kotlin.jvm.internal.C6496s.c(r15, r13)
            if (r13 == 0) goto L_0x0033
        L_0x0096:
            b1.n r13 = r21.t()
            r0.n0 r13 = r13.f()
            boolean r13 = kotlin.jvm.internal.C6496s.c(r3, r13)
            if (r13 == 0) goto L_0x0033
            if (r3 == 0) goto L_0x00b2
            b1.n r13 = r21.t()
            float r13 = r13.a()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x0033
        L_0x00b2:
            if (r7 == 0) goto L_0x00be
            V0.o r13 = r21.m()
            boolean r13 = kotlin.jvm.internal.C6496s.c(r7, r13)
            if (r13 == 0) goto L_0x0033
        L_0x00be:
            if (r9 == 0) goto L_0x00ca
            java.lang.String r13 = r21.j()
            boolean r13 = kotlin.jvm.internal.C6496s.c(r9, r13)
            if (r13 == 0) goto L_0x0033
        L_0x00ca:
            if (r10 == 0) goto L_0x00d6
            b1.a r13 = r21.e()
            boolean r13 = kotlin.jvm.internal.C6496s.c(r10, r13)
            if (r13 == 0) goto L_0x0033
        L_0x00d6:
            r13 = r36
            if (r13 == 0) goto L_0x00e4
            b1.o r14 = r21.u()
            boolean r14 = kotlin.jvm.internal.C6496s.c(r13, r14)
            if (r14 == 0) goto L_0x00e7
        L_0x00e4:
            r14 = r37
            goto L_0x00eb
        L_0x00e7:
            r0 = r21
            goto L_0x0037
        L_0x00eb:
            if (r14 == 0) goto L_0x00f7
            X0.e r11 = r21.p()
            boolean r11 = kotlin.jvm.internal.C6496s.c(r14, r11)
            if (r11 == 0) goto L_0x00e7
        L_0x00f7:
            r11 = r38
            int r16 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r16 == 0) goto L_0x010c
            long r14 = r21.d()
            boolean r14 = r0.C2544x0.q(r11, r14)
            if (r14 == 0) goto L_0x0108
            goto L_0x010c
        L_0x0108:
            r0 = r21
            goto L_0x0039
        L_0x010c:
            if (r0 == 0) goto L_0x0118
            r0.e2 r14 = r21.r()
            boolean r14 = kotlin.jvm.internal.C6496s.c(r0, r14)
            if (r14 == 0) goto L_0x0108
        L_0x0118:
            r14 = r42
            if (r14 == 0) goto L_0x0126
            Q0.z r15 = r21.q()
            boolean r15 = kotlin.jvm.internal.C6496s.c(r14, r15)
            if (r15 == 0) goto L_0x0129
        L_0x0126:
            r15 = r43
            goto L_0x012d
        L_0x0129:
            r0 = r21
            goto L_0x003b
        L_0x012d:
            if (r15 == 0) goto L_0x013c
            t0.g r0 = r21.h()
            boolean r0 = kotlin.jvm.internal.C6496s.c(r15, r0)
            if (r0 != 0) goto L_0x013c
            r0 = r21
            goto L_0x013f
        L_0x013c:
            r0 = r21
            return r0
        L_0x013f:
            if (r3 == 0) goto L_0x0148
            b1.n$a r1 = b1.n.f19132a
            b1.n r1 = r1.a(r3, r4)
            goto L_0x014e
        L_0x0148:
            b1.n$a r3 = b1.n.f19132a
            b1.n r1 = r3.b(r1)
        L_0x014e:
            b1.n r2 = r21.t()
            b1.n r1 = r2.e(r1)
            if (r8 != 0) goto L_0x015d
            V0.h r2 = r21.i()
            goto L_0x015e
        L_0x015d:
            r2 = r8
        L_0x015e:
            boolean r3 = c1.w.g(r26)
            if (r3 != 0) goto L_0x0167
            r3 = r26
            goto L_0x016b
        L_0x0167:
            long r3 = r21.k()
        L_0x016b:
            if (r5 != 0) goto L_0x0171
            V0.p r5 = r21.n()
        L_0x0171:
            if (r6 != 0) goto L_0x0177
            V0.n r6 = r21.l()
        L_0x0177:
            if (r7 != 0) goto L_0x017d
            V0.o r7 = r21.m()
        L_0x017d:
            if (r9 != 0) goto L_0x0184
            java.lang.String r8 = r21.j()
            r9 = r8
        L_0x0184:
            boolean r8 = c1.w.g(r33)
            if (r8 != 0) goto L_0x018d
            r19 = r33
            goto L_0x0191
        L_0x018d:
            long r19 = r21.o()
        L_0x0191:
            if (r10 != 0) goto L_0x0198
            b1.a r8 = r21.e()
            r10 = r8
        L_0x0198:
            if (r13 != 0) goto L_0x019f
            b1.o r8 = r21.u()
            r13 = r8
        L_0x019f:
            if (r37 != 0) goto L_0x01a6
            X0.e r8 = r21.p()
            goto L_0x01a8
        L_0x01a6:
            r8 = r37
        L_0x01a8:
            int r16 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r16 == 0) goto L_0x01ad
            goto L_0x01b1
        L_0x01ad:
            long r11 = r21.d()
        L_0x01b1:
            if (r40 != 0) goto L_0x01b8
            b1.k r16 = r21.s()
            goto L_0x01ba
        L_0x01b8:
            r16 = r40
        L_0x01ba:
            if (r41 != 0) goto L_0x01c1
            r0.e2 r17 = r21.r()
            goto L_0x01c3
        L_0x01c1:
            r17 = r41
        L_0x01c3:
            Q0.z r14 = g(r0, r14)
            if (r15 != 0) goto L_0x01ce
            t0.g r0 = r21.h()
            r15 = r0
        L_0x01ce:
            Q0.C r0 = new Q0.C
            r21 = r0
            r18 = 0
            r41 = r18
            r22 = r1
            r23 = r3
            r25 = r5
            r26 = r6
            r27 = r7
            r28 = r2
            r29 = r9
            r30 = r19
            r32 = r10
            r33 = r13
            r34 = r8
            r35 = r11
            r37 = r16
            r38 = r17
            r39 = r14
            r40 = r15
            r21.<init>((b1.n) r22, (long) r23, (V0.p) r25, (V0.n) r26, (V0.o) r27, (V0.h) r28, (java.lang.String) r29, (long) r30, (b1.C1869a) r32, (b1.o) r33, (X0.e) r34, (long) r35, (b1.k) r37, (r0.e2) r38, (Q0.z) r39, (t0.C2606g) r40, (kotlin.jvm.internal.DefaultConstructorMarker) r41)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.D.b(Q0.C, long, r0.n0, float, long, V0.p, V0.n, V0.o, V0.h, java.lang.String, long, b1.a, b1.o, X0.e, long, b1.k, r0.e2, Q0.z, t0.g):Q0.C");
    }

    public static final C c(C c10, C c11, float f10) {
        float f11;
        float f12;
        float f13 = f10;
        n b10 = m.b(c10.t(), c11.t(), f13);
        h hVar = (h) d(c10.i(), c11.i(), f13);
        long f14 = f(c10.k(), c11.k(), f13);
        p n10 = c10.n();
        if (n10 == null) {
            n10 = p.f8210b.c();
        }
        p n11 = c11.n();
        if (n11 == null) {
            n11 = p.f8210b.c();
        }
        p a10 = s.a(n10, n11, f13);
        V0.n nVar = (V0.n) d(c10.l(), c11.l(), f13);
        o oVar = (o) d(c10.m(), c11.m(), f13);
        String str = (String) d(c10.j(), c11.j(), f13);
        long f15 = f(c10.o(), c11.o(), f13);
        C1869a e10 = c10.e();
        if (e10 != null) {
            f11 = e10.h();
        } else {
            f11 = C1869a.c(0.0f);
        }
        C1869a e11 = c11.e();
        if (e11 != null) {
            f12 = e11.h();
        } else {
            f12 = C1869a.c(0.0f);
        }
        float a11 = C1870b.a(f11, f12, f13);
        b1.o u10 = c10.u();
        if (u10 == null) {
            u10 = b1.o.f19137c.a();
        }
        b1.o u11 = c11.u();
        if (u11 == null) {
            u11 = b1.o.f19137c.a();
        }
        b1.o a12 = b1.p.a(u10, u11, f13);
        e eVar = (e) d(c10.p(), c11.p(), f13);
        b1.o oVar2 = a12;
        long i10 = C2550z0.i(c10.d(), c11.d(), f13);
        k kVar = (k) d(c10.s(), c11.s(), f13);
        e2 r10 = c10.r();
        if (r10 == null) {
            r10 = new e2(0, 0, 0.0f, 7, (DefaultConstructorMarker) null);
        }
        e2 r11 = c11.r();
        if (r11 == null) {
            r11 = new e2(0, 0, 0.0f, 7, (DefaultConstructorMarker) null);
        }
        return new C(b10, f14, a10, nVar, oVar, hVar, str, f15, C1869a.b(a11), oVar2, eVar, i10, kVar, f2.a(r10, r11, f13), e(c10.q(), c11.q(), f13), (C2606g) d(c10.h(), c11.h(), f13), (DefaultConstructorMarker) null);
    }

    public static final Object d(Object obj, Object obj2, float f10) {
        if (((double) f10) < 0.5d) {
            return obj;
        }
        return obj2;
    }

    private static final z e(z zVar, z zVar2, float f10) {
        if (zVar == null && zVar2 == null) {
            return null;
        }
        if (zVar == null) {
            zVar = z.f5397a.a();
        }
        if (zVar2 == null) {
            zVar2 = z.f5397a.a();
        }
        return C1320c.c(zVar, zVar2, f10);
    }

    public static final long f(long j10, long j11, float f10) {
        if (w.g(j10) || w.g(j11)) {
            return ((v) d(v.b(j10), v.b(j11), f10)).k();
        }
        return w.h(j10, j11, f10);
    }

    private static final z g(C c10, z zVar) {
        if (c10.q() == null) {
            return zVar;
        }
        if (zVar == null) {
            return c10.q();
        }
        return c10.q().b(zVar);
    }

    public static final C h(C c10) {
        long k10;
        int i10;
        int i11;
        long o10;
        float f10;
        n g10 = c10.t().g(a.f5251a);
        if (w.g(c10.k())) {
            k10 = f5246a;
        } else {
            k10 = c10.k();
        }
        long j10 = k10;
        p n10 = c10.n();
        if (n10 == null) {
            n10 = p.f8210b.c();
        }
        p pVar = n10;
        V0.n l10 = c10.l();
        if (l10 != null) {
            i10 = l10.i();
        } else {
            i10 = V0.n.f8200b.b();
        }
        V0.n c11 = V0.n.c(i10);
        o m10 = c10.m();
        if (m10 != null) {
            i11 = m10.k();
        } else {
            i11 = o.f8204b.a();
        }
        o e10 = o.e(i11);
        h i12 = c10.i();
        if (i12 == null) {
            i12 = h.f8176b.a();
        }
        h hVar = i12;
        String j11 = c10.j();
        if (j11 == null) {
            j11 = "";
        }
        String str = j11;
        if (w.g(c10.o())) {
            o10 = f5247b;
        } else {
            o10 = c10.o();
        }
        long j12 = o10;
        C1869a e11 = c10.e();
        if (e11 != null) {
            f10 = e11.h();
        } else {
            f10 = C1869a.f19059b.a();
        }
        C1869a b10 = C1869a.b(f10);
        b1.o u10 = c10.u();
        if (u10 == null) {
            u10 = b1.o.f19137c.a();
        }
        b1.o oVar = u10;
        e p10 = c10.p();
        if (p10 == null) {
            p10 = e.f9568c.a();
        }
        e eVar = p10;
        long d10 = c10.d();
        if (d10 == 16) {
            d10 = f5248c;
        }
        long j13 = d10;
        k s10 = c10.s();
        if (s10 == null) {
            s10 = k.f19119b.c();
        }
        k kVar = s10;
        e2 r10 = c10.r();
        if (r10 == null) {
            r10 = e2.f25491d.a();
        }
        e2 e2Var = r10;
        z q10 = c10.q();
        C2606g h10 = c10.h();
        if (h10 == null) {
            h10 = C2609j.f25944a;
        }
        return new C(g10, j10, pVar, c11, e10, hVar, str, j12, b10, oVar, eVar, j13, kVar, e2Var, q10, h10, (DefaultConstructorMarker) null);
    }
}
