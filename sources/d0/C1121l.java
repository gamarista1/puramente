package D0;

import E0.b;
import H0.C1197s;
import J0.C1239e0;
import J0.C1245k;
import J0.C1247m;
import J0.s0;
import a0.C1538b;
import androidx.collection.C1607v;
import androidx.collection.I;
import java.util.List;
import k0.i;
import q0.C2421g;

/* renamed from: D0.l  reason: case insensitive filesystem */
public final class C1121l extends C1122m {

    /* renamed from: c  reason: collision with root package name */
    private final i.c f1472c;

    /* renamed from: d  reason: collision with root package name */
    private final b f1473d = new b();

    /* renamed from: e  reason: collision with root package name */
    private final C1607v f1474e = new C1607v(2);

    /* renamed from: f  reason: collision with root package name */
    private C1197s f1475f;

    /* renamed from: g  reason: collision with root package name */
    private C1124o f1476g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1477h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1478i = true;

    /* renamed from: j  reason: collision with root package name */
    private boolean f1479j = true;

    public C1121l(i.c cVar) {
        this.f1472c = cVar;
    }

    private final void j() {
        this.f1474e.a();
        this.f1475f = null;
    }

    private final boolean m(C1124o oVar, C1124o oVar2) {
        if (oVar == null || oVar.c().size() != oVar2.c().size()) {
            return true;
        }
        int size = oVar2.c().size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!C2421g.j(((A) oVar.c().get(i10)).h(), ((A) oVar2.c().get(i10)).h())) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: D0.A} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: D0.A} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: D0.A} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: D0.A} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0250  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(androidx.collection.C1607v r37, H0.C1197s r38, D0.C1116g r39, boolean r40) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            r2 = r38
            r3 = r39
            boolean r4 = super.a(r37, r38, r39, r40)
            k0.i$c r5 = r0.f1472c
            boolean r5 = r5.S1()
            r6 = 1
            if (r5 != 0) goto L_0x0016
            return r6
        L_0x0016:
            k0.i$c r5 = r0.f1472c
            r7 = 16
            int r8 = J0.C1239e0.a(r7)
            r10 = 0
        L_0x001f:
            r11 = 0
            if (r5 == 0) goto L_0x0070
            boolean r12 = r5 instanceof J0.s0
            if (r12 == 0) goto L_0x002f
            J0.s0 r5 = (J0.s0) r5
            H0.s r5 = J0.t0.a(r5)
            r0.f1475f = r5
            goto L_0x006b
        L_0x002f:
            int r12 = r5.N1()
            r12 = r12 & r8
            if (r12 == 0) goto L_0x006b
            boolean r12 = r5 instanceof J0.C1247m
            if (r12 == 0) goto L_0x006b
            r12 = r5
            J0.m r12 = (J0.C1247m) r12
            k0.i$c r12 = r12.m2()
            r13 = r11
        L_0x0042:
            if (r12 == 0) goto L_0x0068
            int r14 = r12.N1()
            r14 = r14 & r8
            if (r14 == 0) goto L_0x0063
            int r13 = r13 + 1
            if (r13 != r6) goto L_0x0051
            r5 = r12
            goto L_0x0063
        L_0x0051:
            if (r10 != 0) goto L_0x005a
            a0.b r10 = new a0.b
            k0.i$c[] r14 = new k0.i.c[r7]
            r10.<init>(r14, r11)
        L_0x005a:
            if (r5 == 0) goto L_0x0060
            r10.b(r5)
            r5 = 0
        L_0x0060:
            r10.b(r12)
        L_0x0063:
            k0.i$c r12 = r12.J1()
            goto L_0x0042
        L_0x0068:
            if (r13 != r6) goto L_0x006b
            goto L_0x001f
        L_0x006b:
            k0.i$c r5 = J0.C1245k.g(r10)
            goto L_0x001f
        L_0x0070:
            int r5 = r37.m()
            r7 = r11
        L_0x0075:
            if (r7 >= r5) goto L_0x0148
            long r12 = r1.i(r7)
            java.lang.Object r8 = r1.o(r7)
            r14 = r8
            D0.A r14 = (D0.A) r14
            E0.b r8 = r0.f1473d
            boolean r8 = r8.d(r12)
            if (r8 == 0) goto L_0x0136
            long r9 = r14.k()
            r33 = r7
            long r6 = r14.h()
            boolean r15 = q0.C2421g.p(r9)
            if (r15 == 0) goto L_0x0131
            boolean r15 = q0.C2421g.p(r6)
            if (r15 == 0) goto L_0x0131
            java.util.ArrayList r15 = new java.util.ArrayList
            java.util.List r16 = r14.e()
            int r8 = r16.size()
            r15.<init>(r8)
            java.util.List r8 = r14.e()
            int r11 = r8.size()
            r34 = r5
            r5 = 0
        L_0x00b8:
            if (r5 >= r11) goto L_0x00fd
            java.lang.Object r16 = r8.get(r5)
            D0.e r16 = (D0.C1114e) r16
            r35 = r4
            long r3 = r16.b()
            boolean r17 = q0.C2421g.p(r3)
            if (r17 == 0) goto L_0x00ee
            r17 = r8
            D0.e r8 = new D0.e
            long r19 = r16.c()
            r26 = r11
            H0.s r11 = r0.f1475f
            kotlin.jvm.internal.C6496s.e(r11)
            long r21 = r11.W(r2, r3)
            long r23 = r16.a()
            r25 = 0
            r18 = r8
            r18.<init>(r19, r21, r23, r25)
            r15.add(r8)
            goto L_0x00f2
        L_0x00ee:
            r17 = r8
            r26 = r11
        L_0x00f2:
            int r5 = r5 + 1
            r3 = r39
            r8 = r17
            r11 = r26
            r4 = r35
            goto L_0x00b8
        L_0x00fd:
            r35 = r4
            androidx.collection.v r3 = r0.f1474e
            H0.s r4 = r0.f1475f
            kotlin.jvm.internal.C6496s.e(r4)
            long r24 = r4.W(r2, r9)
            H0.s r4 = r0.f1475f
            kotlin.jvm.internal.C6496s.e(r4)
            long r19 = r4.W(r2, r6)
            r31 = 731(0x2db, float:1.024E-42)
            r32 = 0
            r4 = 0
            r6 = r15
            r15 = r4
            r17 = 0
            r21 = 0
            r22 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r28 = r6
            D0.A r4 = D0.A.c(r14, r15, r17, r19, r21, r22, r24, r26, r27, r28, r29, r31, r32)
            r3.j(r12, r4)
            goto L_0x013c
        L_0x0131:
            r35 = r4
            r34 = r5
            goto L_0x013c
        L_0x0136:
            r35 = r4
            r34 = r5
            r33 = r7
        L_0x013c:
            int r7 = r33 + 1
            r3 = r39
            r5 = r34
            r4 = r35
            r6 = 1
            r11 = 0
            goto L_0x0075
        L_0x0148:
            r35 = r4
            androidx.collection.v r2 = r0.f1474e
            boolean r2 = r2.h()
            if (r2 == 0) goto L_0x0160
            E0.b r1 = r0.f1473d
            r1.c()
            a0.b r1 = r36.g()
            r1.i()
            r2 = 1
            return r2
        L_0x0160:
            r2 = 1
            E0.b r3 = r0.f1473d
            int r3 = r3.f()
            int r3 = r3 - r2
        L_0x0168:
            r2 = -1
            if (r2 >= r3) goto L_0x017f
            E0.b r2 = r0.f1473d
            long r4 = r2.e(r3)
            boolean r2 = r1.d(r4)
            if (r2 != 0) goto L_0x017c
            E0.b r2 = r0.f1473d
            r2.j(r3)
        L_0x017c:
            int r3 = r3 + -1
            goto L_0x0168
        L_0x017f:
            java.util.ArrayList r1 = new java.util.ArrayList
            androidx.collection.v r2 = r0.f1474e
            int r2 = r2.m()
            r1.<init>(r2)
            androidx.collection.v r2 = r0.f1474e
            int r2 = r2.m()
            r3 = 0
        L_0x0191:
            if (r3 >= r2) goto L_0x019f
            androidx.collection.v r4 = r0.f1474e
            java.lang.Object r4 = r4.o(r3)
            r1.add(r4)
            int r3 = r3 + 1
            goto L_0x0191
        L_0x019f:
            D0.o r2 = new D0.o
            r3 = r39
            r2.<init>(r1, r3)
            java.util.List r1 = r2.c()
            int r4 = r1.size()
            r5 = 0
        L_0x01af:
            if (r5 >= r4) goto L_0x01c7
            java.lang.Object r6 = r1.get(r5)
            r7 = r6
            D0.A r7 = (D0.A) r7
            long r7 = r7.f()
            boolean r7 = r3.a(r7)
            if (r7 == 0) goto L_0x01c4
            r9 = r6
            goto L_0x01c8
        L_0x01c4:
            int r5 = r5 + 1
            goto L_0x01af
        L_0x01c7:
            r9 = 0
        L_0x01c8:
            D0.A r9 = (D0.A) r9
            if (r9 == 0) goto L_0x0278
            if (r40 != 0) goto L_0x01d3
            r1 = 0
            r0.f1478i = r1
        L_0x01d1:
            r4 = 1
            goto L_0x01f5
        L_0x01d3:
            r1 = 0
            boolean r3 = r0.f1478i
            if (r3 != 0) goto L_0x01d1
            boolean r3 = r9.i()
            if (r3 != 0) goto L_0x01e4
            boolean r3 = r9.l()
            if (r3 == 0) goto L_0x01d1
        L_0x01e4:
            H0.s r3 = r0.f1475f
            kotlin.jvm.internal.C6496s.e(r3)
            long r3 = r3.b()
            boolean r3 = D0.C1125p.e(r9, r3)
            r4 = 1
            r3 = r3 ^ r4
            r0.f1478i = r3
        L_0x01f5:
            boolean r3 = r0.f1478i
            boolean r5 = r0.f1477h
            if (r3 == r5) goto L_0x0238
            int r3 = r2.f()
            D0.s$a r5 = D0.C1127s.f1491a
            int r6 = r5.c()
            boolean r3 = D0.C1127s.i(r3, r6)
            if (r3 != 0) goto L_0x0227
            int r3 = r2.f()
            int r6 = r5.a()
            boolean r3 = D0.C1127s.i(r3, r6)
            if (r3 != 0) goto L_0x0227
            int r3 = r2.f()
            int r6 = r5.b()
            boolean r3 = D0.C1127s.i(r3, r6)
            if (r3 == 0) goto L_0x0238
        L_0x0227:
            boolean r3 = r0.f1478i
            if (r3 == 0) goto L_0x0230
            int r3 = r5.a()
            goto L_0x0234
        L_0x0230:
            int r3 = r5.b()
        L_0x0234:
            r2.g(r3)
            goto L_0x027a
        L_0x0238:
            int r3 = r2.f()
            D0.s$a r5 = D0.C1127s.f1491a
            int r6 = r5.a()
            boolean r3 = D0.C1127s.i(r3, r6)
            if (r3 == 0) goto L_0x0258
            boolean r3 = r0.f1477h
            if (r3 == 0) goto L_0x0258
            boolean r3 = r0.f1479j
            if (r3 != 0) goto L_0x0258
            int r3 = r5.c()
            r2.g(r3)
            goto L_0x027a
        L_0x0258:
            int r3 = r2.f()
            int r6 = r5.b()
            boolean r3 = D0.C1127s.i(r3, r6)
            if (r3 == 0) goto L_0x027a
            boolean r3 = r0.f1478i
            if (r3 == 0) goto L_0x027a
            boolean r3 = r9.i()
            if (r3 == 0) goto L_0x027a
            int r3 = r5.c()
            r2.g(r3)
            goto L_0x027a
        L_0x0278:
            r1 = 0
            r4 = 1
        L_0x027a:
            if (r35 != 0) goto L_0x0297
            int r3 = r2.f()
            D0.s$a r5 = D0.C1127s.f1491a
            int r5 = r5.c()
            boolean r3 = D0.C1127s.i(r3, r5)
            if (r3 == 0) goto L_0x0297
            D0.o r3 = r0.f1476g
            boolean r3 = r0.m(r3, r2)
            if (r3 == 0) goto L_0x0295
            goto L_0x0297
        L_0x0295:
            r6 = r1
            goto L_0x0298
        L_0x0297:
            r6 = r4
        L_0x0298:
            r0.f1476g = r2
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.C1121l.a(androidx.collection.v, H0.s, D0.g, boolean):boolean");
    }

    public void b(C1116g gVar) {
        super.b(gVar);
        C1124o oVar = this.f1476g;
        if (oVar != null) {
            this.f1477h = this.f1478i;
            List c10 = oVar.c();
            int size = c10.size();
            for (int i10 = 0; i10 < size; i10++) {
                A a10 = (A) c10.get(i10);
                boolean i11 = a10.i();
                boolean a11 = gVar.a(a10.f());
                boolean z10 = this.f1478i;
                if ((!i11 && !a11) || (!i11 && !z10)) {
                    this.f1473d.i(a10.f());
                }
            }
            this.f1478i = false;
            this.f1479j = C1127s.i(oVar.f(), C1127s.f1491a.b());
        }
    }

    public void d() {
        C1538b g10 = g();
        int q10 = g10.q();
        if (q10 > 0) {
            Object[] p10 = g10.p();
            int i10 = 0;
            do {
                ((C1121l) p10[i10]).d();
                i10++;
            } while (i10 < q10);
        }
        i.c cVar = this.f1472c;
        int a10 = C1239e0.a(16);
        C1538b bVar = null;
        while (cVar != null) {
            if (cVar instanceof s0) {
                ((s0) cVar).i1();
            } else if ((cVar.N1() & a10) != 0 && (cVar instanceof C1247m)) {
                int i11 = 0;
                for (i.c m22 = ((C1247m) cVar).m2(); m22 != null; m22 = m22.J1()) {
                    if ((m22.N1() & a10) != 0) {
                        i11++;
                        if (i11 == 1) {
                            cVar = m22;
                        } else {
                            if (bVar == null) {
                                bVar = new C1538b(new i.c[16], 0);
                            }
                            if (cVar != null) {
                                bVar.b(cVar);
                                cVar = null;
                            }
                            bVar.b(m22);
                        }
                    }
                }
                if (i11 == 1) {
                }
            }
            cVar = C1245k.g(bVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(D0.C1116g r14) {
        /*
            r13 = this;
            androidx.collection.v r0 = r13.f1474e
            boolean r0 = r0.h()
            r1 = 0
            if (r0 == 0) goto L_0x000b
            goto L_0x009e
        L_0x000b:
            k0.i$c r0 = r13.f1472c
            boolean r0 = r0.S1()
            if (r0 != 0) goto L_0x0015
            goto L_0x009e
        L_0x0015:
            D0.o r0 = r13.f1476g
            kotlin.jvm.internal.C6496s.e(r0)
            H0.s r2 = r13.f1475f
            kotlin.jvm.internal.C6496s.e(r2)
            long r2 = r2.b()
            k0.i$c r4 = r13.f1472c
            r5 = 16
            int r6 = J0.C1239e0.a(r5)
            r7 = 0
            r8 = r7
        L_0x002d:
            r9 = 1
            if (r4 == 0) goto L_0x007d
            boolean r10 = r4 instanceof J0.s0
            if (r10 == 0) goto L_0x003c
            J0.s0 r4 = (J0.s0) r4
            D0.q r9 = D0.C1126q.Final
            r4.C0(r0, r9, r2)
            goto L_0x0078
        L_0x003c:
            int r10 = r4.N1()
            r10 = r10 & r6
            if (r10 == 0) goto L_0x0078
            boolean r10 = r4 instanceof J0.C1247m
            if (r10 == 0) goto L_0x0078
            r10 = r4
            J0.m r10 = (J0.C1247m) r10
            k0.i$c r10 = r10.m2()
            r11 = r1
        L_0x004f:
            if (r10 == 0) goto L_0x0075
            int r12 = r10.N1()
            r12 = r12 & r6
            if (r12 == 0) goto L_0x0070
            int r11 = r11 + 1
            if (r11 != r9) goto L_0x005e
            r4 = r10
            goto L_0x0070
        L_0x005e:
            if (r8 != 0) goto L_0x0067
            a0.b r8 = new a0.b
            k0.i$c[] r12 = new k0.i.c[r5]
            r8.<init>(r12, r1)
        L_0x0067:
            if (r4 == 0) goto L_0x006d
            r8.b(r4)
            r4 = r7
        L_0x006d:
            r8.b(r10)
        L_0x0070:
            k0.i$c r10 = r10.J1()
            goto L_0x004f
        L_0x0075:
            if (r11 != r9) goto L_0x0078
            goto L_0x002d
        L_0x0078:
            k0.i$c r4 = J0.C1245k.g(r8)
            goto L_0x002d
        L_0x007d:
            k0.i$c r0 = r13.f1472c
            boolean r0 = r0.S1()
            if (r0 == 0) goto L_0x009d
            a0.b r0 = r13.g()
            int r2 = r0.q()
            if (r2 <= 0) goto L_0x009d
            java.lang.Object[] r0 = r0.p()
        L_0x0093:
            r3 = r0[r1]
            D0.l r3 = (D0.C1121l) r3
            r3.e(r14)
            int r1 = r1 + r9
            if (r1 < r2) goto L_0x0093
        L_0x009d:
            r1 = r9
        L_0x009e:
            r13.b(r14)
            r13.j()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.C1121l.e(D0.g):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean f(androidx.collection.C1607v r12, H0.C1197s r13, D0.C1116g r14, boolean r15) {
        /*
            r11 = this;
            androidx.collection.v r12 = r11.f1474e
            boolean r12 = r12.h()
            r13 = 0
            if (r12 == 0) goto L_0x000b
            goto L_0x0104
        L_0x000b:
            k0.i$c r12 = r11.f1472c
            boolean r12 = r12.S1()
            if (r12 != 0) goto L_0x0015
            goto L_0x0104
        L_0x0015:
            D0.o r12 = r11.f1476g
            kotlin.jvm.internal.C6496s.e(r12)
            H0.s r0 = r11.f1475f
            kotlin.jvm.internal.C6496s.e(r0)
            long r0 = r0.b()
            k0.i$c r2 = r11.f1472c
            r3 = 16
            int r4 = J0.C1239e0.a(r3)
            r5 = 0
            r6 = r5
        L_0x002d:
            r7 = 1
            if (r2 == 0) goto L_0x007d
            boolean r8 = r2 instanceof J0.s0
            if (r8 == 0) goto L_0x003c
            J0.s0 r2 = (J0.s0) r2
            D0.q r7 = D0.C1126q.Initial
            r2.C0(r12, r7, r0)
            goto L_0x0078
        L_0x003c:
            int r8 = r2.N1()
            r8 = r8 & r4
            if (r8 == 0) goto L_0x0078
            boolean r8 = r2 instanceof J0.C1247m
            if (r8 == 0) goto L_0x0078
            r8 = r2
            J0.m r8 = (J0.C1247m) r8
            k0.i$c r8 = r8.m2()
            r9 = r13
        L_0x004f:
            if (r8 == 0) goto L_0x0075
            int r10 = r8.N1()
            r10 = r10 & r4
            if (r10 == 0) goto L_0x0070
            int r9 = r9 + 1
            if (r9 != r7) goto L_0x005e
            r2 = r8
            goto L_0x0070
        L_0x005e:
            if (r6 != 0) goto L_0x0067
            a0.b r6 = new a0.b
            k0.i$c[] r10 = new k0.i.c[r3]
            r6.<init>(r10, r13)
        L_0x0067:
            if (r2 == 0) goto L_0x006d
            r6.b(r2)
            r2 = r5
        L_0x006d:
            r6.b(r8)
        L_0x0070:
            k0.i$c r8 = r8.J1()
            goto L_0x004f
        L_0x0075:
            if (r9 != r7) goto L_0x0078
            goto L_0x002d
        L_0x0078:
            k0.i$c r2 = J0.C1245k.g(r6)
            goto L_0x002d
        L_0x007d:
            k0.i$c r2 = r11.f1472c
            boolean r2 = r2.S1()
            if (r2 == 0) goto L_0x00a5
            a0.b r2 = r11.g()
            int r4 = r2.q()
            if (r4 <= 0) goto L_0x00a5
            java.lang.Object[] r2 = r2.p()
            r6 = r13
        L_0x0094:
            r8 = r2[r6]
            D0.l r8 = (D0.C1121l) r8
            androidx.collection.v r9 = r11.f1474e
            H0.s r10 = r11.f1475f
            kotlin.jvm.internal.C6496s.e(r10)
            r8.f(r9, r10, r14, r15)
            int r6 = r6 + r7
            if (r6 < r4) goto L_0x0094
        L_0x00a5:
            k0.i$c r14 = r11.f1472c
            boolean r14 = r14.S1()
            if (r14 == 0) goto L_0x0103
            k0.i$c r14 = r11.f1472c
            int r15 = J0.C1239e0.a(r3)
            r2 = r5
        L_0x00b4:
            if (r14 == 0) goto L_0x0103
            boolean r4 = r14 instanceof J0.s0
            if (r4 == 0) goto L_0x00c2
            J0.s0 r14 = (J0.s0) r14
            D0.q r4 = D0.C1126q.Main
            r14.C0(r12, r4, r0)
            goto L_0x00fe
        L_0x00c2:
            int r4 = r14.N1()
            r4 = r4 & r15
            if (r4 == 0) goto L_0x00fe
            boolean r4 = r14 instanceof J0.C1247m
            if (r4 == 0) goto L_0x00fe
            r4 = r14
            J0.m r4 = (J0.C1247m) r4
            k0.i$c r4 = r4.m2()
            r6 = r13
        L_0x00d5:
            if (r4 == 0) goto L_0x00fb
            int r8 = r4.N1()
            r8 = r8 & r15
            if (r8 == 0) goto L_0x00f6
            int r6 = r6 + 1
            if (r6 != r7) goto L_0x00e4
            r14 = r4
            goto L_0x00f6
        L_0x00e4:
            if (r2 != 0) goto L_0x00ed
            a0.b r2 = new a0.b
            k0.i$c[] r8 = new k0.i.c[r3]
            r2.<init>(r8, r13)
        L_0x00ed:
            if (r14 == 0) goto L_0x00f3
            r2.b(r14)
            r14 = r5
        L_0x00f3:
            r2.b(r4)
        L_0x00f6:
            k0.i$c r4 = r4.J1()
            goto L_0x00d5
        L_0x00fb:
            if (r6 != r7) goto L_0x00fe
            goto L_0x00b4
        L_0x00fe:
            k0.i$c r14 = J0.C1245k.g(r2)
            goto L_0x00b4
        L_0x0103:
            r13 = r7
        L_0x0104:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.C1121l.f(androidx.collection.v, H0.s, D0.g, boolean):boolean");
    }

    public void i(long j10, I i10) {
        if (this.f1473d.d(j10) && !i10.a(this)) {
            this.f1473d.h(j10);
            this.f1474e.k(j10);
        }
        C1538b g10 = g();
        int q10 = g10.q();
        if (q10 > 0) {
            Object[] p10 = g10.p();
            int i11 = 0;
            do {
                ((C1121l) p10[i11]).i(j10, i10);
                i11++;
            } while (i11 < q10);
        }
    }

    public final i.c k() {
        return this.f1472c;
    }

    public final b l() {
        return this.f1473d;
    }

    public final void n() {
        this.f1478i = true;
    }

    public String toString() {
        return "Node(pointerInputFilter=" + this.f1472c + ", children=" + g() + ", pointerIds=" + this.f1473d + ')';
    }
}
