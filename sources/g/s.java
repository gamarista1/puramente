package G;

import C.C1085c;
import E.M;
import E.x;
import Ef.g;
import Ef.m;
import H0.U;
import Y.C1510r0;
import c1.t;
import java.util.ArrayList;
import java.util.List;
import k0.c;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6559l;
import mf.C6565s;
import yf.C6798l;
import z.q;

public abstract class s {

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f2368a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1510r0 f2369b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(List list, C1510r0 r0Var) {
            super(1);
            this.f2368a = list;
            this.f2369b = r0Var;
        }

        public final void a(U.a aVar) {
            List list = this.f2368a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((C1179e) list.get(i10)).h(aVar);
            }
            M.a(this.f2369b);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f2371a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f2372b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r f2373c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f2374d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q f2375e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c.b f2376f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c.C0368c f2377g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f2378h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f2379i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(x xVar, long j10, r rVar, long j11, q qVar, c.b bVar, c.C0368c cVar, boolean z10, int i10) {
            super(1);
            this.f2371a = xVar;
            this.f2372b = j10;
            this.f2373c = rVar;
            this.f2374d = j11;
            this.f2375e = qVar;
            this.f2376f = bVar;
            this.f2377g = cVar;
            this.f2378h = z10;
            this.f2379i = i10;
        }

        public final C1179e a(int i10) {
            x xVar = this.f2371a;
            return s.g(xVar, i10, this.f2372b, this.f2373c, this.f2374d, this.f2375e, this.f2376f, this.f2377g, xVar.getLayoutDirection(), this.f2378h, this.f2379i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f2380a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f2381b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r f2382c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f2383d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q f2384e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c.b f2385f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c.C0368c f2386g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f2387h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f2388i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(x xVar, long j10, r rVar, long j11, q qVar, c.b bVar, c.C0368c cVar, boolean z10, int i10) {
            super(1);
            this.f2380a = xVar;
            this.f2381b = j10;
            this.f2382c = rVar;
            this.f2383d = j11;
            this.f2384e = qVar;
            this.f2385f = bVar;
            this.f2386g = cVar;
            this.f2387h = z10;
            this.f2388i = i10;
        }

        public final C1179e a(int i10) {
            x xVar = this.f2380a;
            return s.g(xVar, i10, this.f2381b, this.f2382c, this.f2383d, this.f2384e, this.f2385f, this.f2386g, xVar.getLayoutDirection(), this.f2387h, this.f2388i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: G.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final G.C1179e b(int r15, java.util.List r16, int r17, int r18, int r19, A.j r20, int r21) {
        /*
            r0 = r16
            boolean r1 = r16.isEmpty()
            if (r1 == 0) goto L_0x000a
            r0 = 0
            goto L_0x0066
        L_0x000a:
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            r2 = r1
            G.e r2 = (G.C1179e) r2
            int r7 = r2.a()
            int r8 = r2.getIndex()
            r3 = r15
            r4 = r17
            r5 = r18
            r6 = r19
            r9 = r20
            r10 = r21
            float r2 = A.k.a(r3, r4, r5, r6, r7, r8, r9, r10)
            float r2 = java.lang.Math.abs(r2)
            float r2 = -r2
            int r3 = mf.C6565s.p(r16)
            r4 = 1
            if (r4 > r3) goto L_0x0065
        L_0x0035:
            java.lang.Object r5 = r0.get(r4)
            r6 = r5
            G.e r6 = (G.C1179e) r6
            int r11 = r6.a()
            int r12 = r6.getIndex()
            r7 = r15
            r8 = r17
            r9 = r18
            r10 = r19
            r13 = r20
            r14 = r21
            float r6 = A.k.a(r7, r8, r9, r10, r11, r12, r13, r14)
            float r6 = java.lang.Math.abs(r6)
            float r6 = -r6
            int r7 = java.lang.Float.compare(r2, r6)
            if (r7 >= 0) goto L_0x0060
            r1 = r5
            r2 = r6
        L_0x0060:
            if (r4 == r3) goto L_0x0065
            int r4 = r4 + 1
            goto L_0x0035
        L_0x0065:
            r0 = r1
        L_0x0066:
            G.e r0 = (G.C1179e) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: G.s.b(int, java.util.List, int, int, int, A.j, int):G.e");
    }

    private static final List c(x xVar, List list, List list2, List list3, int i10, int i11, int i12, int i13, int i14, q qVar, boolean z10, c1.d dVar, int i15, int i16) {
        int i17;
        int i18;
        boolean z11;
        List list4 = list;
        int i19 = i10;
        int i20 = i11;
        int i21 = i14;
        q qVar2 = qVar;
        boolean z12 = z10;
        int i22 = i15;
        int i23 = i16 + i22;
        if (qVar2 == q.Vertical) {
            i18 = i13;
            i17 = i20;
        } else {
            i18 = i13;
            i17 = i19;
        }
        if (i12 < Math.min(i17, i18)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 || i21 == 0) {
            ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
            if (!z11) {
                int size = list2.size();
                int i24 = i21;
                for (int i25 = 0; i25 < size; i25++) {
                    C1179e eVar = (C1179e) list2.get(i25);
                    i24 -= i23;
                    eVar.i(i24, i19, i20);
                    arrayList.add(eVar);
                }
                int size2 = list.size();
                for (int i26 = 0; i26 < size2; i26++) {
                    C1179e eVar2 = (C1179e) list4.get(i26);
                    eVar2.i(i21, i19, i20);
                    arrayList.add(eVar2);
                    i21 += i23;
                }
                int size3 = list3.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    C1179e eVar3 = (C1179e) list3.get(i27);
                    eVar3.i(i21, i19, i20);
                    arrayList.add(eVar3);
                    i21 += i23;
                }
            } else if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("No extra pages");
            } else {
                int size4 = list.size();
                int[] iArr = new int[size4];
                for (int i28 = 0; i28 < size4; i28++) {
                    iArr[i28] = i16;
                }
                int[] iArr2 = new int[size4];
                for (int i29 = 0; i29 < size4; i29++) {
                    iArr2[i29] = 0;
                }
                C1085c.f d10 = C1085c.a.f891a.d(xVar.E(i22));
                if (qVar2 == q.Vertical) {
                    d10.arrange(dVar, i17, iArr, iArr2);
                } else {
                    c1.d dVar2 = dVar;
                    d10.a(dVar, i17, iArr, t.Ltr, iArr2);
                }
                g e02 = C6559l.e0(iArr2);
                if (z12) {
                    e02 = m.s(e02);
                }
                int k10 = e02.k();
                int n10 = e02.n();
                int r10 = e02.r();
                if ((r10 > 0 && k10 <= n10) || (r10 < 0 && n10 <= k10)) {
                    while (true) {
                        int i30 = iArr2[k10];
                        C1179e eVar4 = (C1179e) list4.get(d(k10, z12, size4));
                        if (z12) {
                            i30 = (i17 - i30) - eVar4.g();
                        }
                        eVar4.i(i30, i19, i20);
                        arrayList.add(eVar4);
                        if (k10 == n10) {
                            break;
                        }
                        k10 += r10;
                    }
                }
            }
            return arrayList;
        }
        throw new IllegalStateException(("non-zero pagesScrollOffset=" + i21).toString());
    }

    private static final int d(int i10, boolean z10, int i11) {
        if (!z10) {
            return i10;
        }
        return (i11 - i10) - 1;
    }

    private static final List e(int i10, int i11, int i12, List list, C6798l lVar) {
        int min = Math.min(i12 + i10, i11 - 1);
        int i13 = i10 + 1;
        ArrayList arrayList = null;
        if (i13 <= min) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.invoke(Integer.valueOf(i13)));
                if (i13 == min) {
                    break;
                }
                i13++;
            }
        }
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            int intValue = ((Number) list.get(i14)).intValue();
            if (min + 1 <= intValue && intValue < i11) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.invoke(Integer.valueOf(intValue)));
            }
        }
        if (arrayList == null) {
            return C6565s.n();
        }
        return arrayList;
    }

    private static final List f(int i10, int i11, List list, C6798l lVar) {
        int max = Math.max(0, i10 - i11);
        int i12 = i10 - 1;
        ArrayList arrayList = null;
        if (max <= i12) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.invoke(Integer.valueOf(i12)));
                if (i12 == max) {
                    break;
                }
                i12--;
            }
        }
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            int intValue = ((Number) list.get(i13)).intValue();
            if (intValue < max) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.invoke(Integer.valueOf(intValue)));
            }
        }
        if (arrayList == null) {
            return C6565s.n();
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final C1179e g(x xVar, int i10, long j10, r rVar, long j11, q qVar, c.b bVar, c.C0368c cVar, t tVar, boolean z10, int i11) {
        return new C1179e(i10, i11, xVar.l0(i10, j10), j11, rVar.d(i10), qVar, bVar, cVar, tVar, z10, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final G.u h(E.x r32, int r33, G.r r34, int r35, int r36, int r37, int r38, int r39, int r40, long r41, z.q r43, k0.c.C0368c r44, k0.c.b r45, boolean r46, long r47, int r49, int r50, java.util.List r51, A.j r52, Y.C1510r0 r53, Ug.K r54, yf.q r55) {
        /*
            r7 = r33
            r6 = r35
            r5 = r36
            r0 = r41
            r4 = r43
            r3 = r50
            r2 = r51
            r15 = r55
            if (r5 < 0) goto L_0x0463
            if (r37 < 0) goto L_0x045b
            int r8 = r49 + r38
            r13 = 0
            int r14 = Ef.m.d(r8, r13)
            if (r7 > 0) goto L_0x0068
            java.util.List r8 = mf.C6565s.n()
            int r13 = -r5
            int r14 = r6 + r37
            int r2 = c1.b.n(r41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r0 = c1.b.m(r41)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            G.s$b r1 = G.s.b.f2370a
            java.lang.Object r0 = r15.invoke(r2, r0, r1)
            r23 = r0
            H0.G r23 = (H0.G) r23
            G.u r0 = new G.u
            r7 = r0
            r28 = 393216(0x60000, float:5.51013E-40)
            r29 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r9 = r49
            r10 = r38
            r11 = r37
            r12 = r43
            r16 = r50
            r22 = r52
            r27 = r54
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r0
        L_0x0068:
            z.q r8 = z.q.Vertical
            if (r4 != r8) goto L_0x0073
            int r9 = c1.b.l(r41)
            r17 = r9
            goto L_0x0075
        L_0x0073:
            r17 = r49
        L_0x0075:
            if (r4 == r8) goto L_0x007e
            int r8 = c1.b.k(r41)
            r19 = r8
            goto L_0x0080
        L_0x007e:
            r19 = r49
        L_0x0080:
            r20 = 5
            r21 = 0
            r16 = 0
            r18 = 0
            long r21 = c1.c.b(r16, r17, r18, r19, r20, r21)
            r8 = r39
            r9 = r40
        L_0x0090:
            if (r8 <= 0) goto L_0x0098
            if (r9 <= 0) goto L_0x0098
            int r8 = r8 + -1
            int r9 = r9 - r14
            goto L_0x0090
        L_0x0098:
            int r9 = r9 * -1
            if (r8 < r7) goto L_0x009f
            int r8 = r7 + -1
            r9 = r13
        L_0x009f:
            mf.k r12 = new mf.k
            r12.<init>()
            int r10 = -r5
            if (r38 >= 0) goto L_0x00aa
            r11 = r38
            goto L_0x00ab
        L_0x00aa:
            r11 = r13
        L_0x00ab:
            int r11 = r11 + r10
            int r9 = r9 + r11
            r0 = r13
        L_0x00ae:
            if (r9 >= 0) goto L_0x00f9
            if (r8 <= 0) goto L_0x00f9
            int r1 = r8 + -1
            c1.t r18 = r32.getLayoutDirection()
            r8 = r32
            r4 = r9
            r9 = r1
            r39 = r1
            r23 = r10
            r1 = r11
            r10 = r21
            r2 = r12
            r12 = r34
            r3 = r13
            r30 = r14
            r13 = r47
            r15 = r43
            r16 = r45
            r17 = r44
            r19 = r46
            r20 = r49
            G.e r8 = g(r8, r9, r10, r12, r13, r15, r16, r17, r18, r19, r20)
            r2.add(r3, r8)
            int r8 = r8.c()
            int r0 = java.lang.Math.max(r0, r8)
            r15 = r30
            int r9 = r4 + r15
            r8 = r39
            r4 = r43
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r15
            r10 = r23
            r3 = r50
            r2 = r51
            r15 = r55
            goto L_0x00ae
        L_0x00f9:
            r4 = r9
            r23 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r15 = r14
            if (r4 >= r1) goto L_0x0104
            r11 = r1
            goto L_0x0105
        L_0x0104:
            r11 = r4
        L_0x0105:
            int r11 = r11 - r1
            int r4 = r6 + r37
            int r13 = Ef.m.d(r4, r3)
            int r9 = -r11
            r10 = r3
            r12 = r10
            r14 = r8
        L_0x0110:
            int r3 = r2.size()
            r25 = 1
            if (r10 >= r3) goto L_0x0126
            if (r9 < r13) goto L_0x0120
            r2.remove(r10)
            r12 = r25
            goto L_0x0110
        L_0x0120:
            int r14 = r14 + 1
            int r9 = r9 + r15
            int r10 = r10 + 1
            goto L_0x0110
        L_0x0126:
            r3 = r8
            r26 = r11
            r27 = r12
            r12 = r14
            r14 = r9
        L_0x012d:
            if (r12 >= r7) goto L_0x013a
            if (r14 < r13) goto L_0x0142
            if (r14 <= 0) goto L_0x0142
            boolean r8 = r2.isEmpty()
            if (r8 == 0) goto L_0x013a
            goto L_0x0142
        L_0x013a:
            r40 = r3
            r39 = r4
            r4 = r12
            r3 = r14
            r5 = r15
            goto L_0x0192
        L_0x0142:
            c1.t r18 = r32.getLayoutDirection()
            r8 = r32
            r9 = r12
            r10 = r21
            r39 = r4
            r4 = r12
            r12 = r34
            r40 = r3
            r28 = r13
            r3 = r14
            r13 = r47
            r5 = r15
            r15 = r43
            r16 = r45
            r17 = r44
            r19 = r46
            r20 = r49
            G.e r8 = g(r8, r9, r10, r12, r13, r15, r16, r17, r18, r19, r20)
            int r9 = r7 + -1
            if (r4 != r9) goto L_0x016d
            r14 = r49
            goto L_0x016e
        L_0x016d:
            r14 = r5
        L_0x016e:
            int r14 = r14 + r3
            if (r14 > r1) goto L_0x017b
            if (r4 == r9) goto L_0x017b
            int r12 = r4 + 1
            int r26 = r26 - r5
            r3 = r12
            r27 = r25
            goto L_0x0188
        L_0x017b:
            int r3 = r8.c()
            int r0 = java.lang.Math.max(r0, r3)
            r2.add(r8)
            r3 = r40
        L_0x0188:
            int r12 = r4 + 1
            r4 = r39
            r15 = r5
            r13 = r28
            r5 = r36
            goto L_0x012d
        L_0x0192:
            if (r3 >= r6) goto L_0x01e1
            int r1 = r6 - r3
            int r26 = r26 - r1
            int r1 = r1 + r3
            r15 = r36
            r3 = r40
            r13 = r5
            r5 = r26
        L_0x01a0:
            if (r5 >= r15) goto L_0x01d5
            if (r3 <= 0) goto L_0x01d5
            int r3 = r3 + -1
            c1.t r18 = r32.getLayoutDirection()
            r8 = r32
            r9 = r3
            r10 = r21
            r12 = r34
            r6 = r13
            r13 = r47
            r15 = r43
            r16 = r45
            r17 = r44
            r19 = r46
            r20 = r49
            G.e r8 = g(r8, r9, r10, r12, r13, r15, r16, r17, r18, r19, r20)
            r15 = 0
            r2.add(r15, r8)
            int r8 = r8.c()
            int r0 = java.lang.Math.max(r0, r8)
            int r5 = r5 + r6
            r15 = r36
            r13 = r6
            r6 = r35
            goto L_0x01a0
        L_0x01d5:
            r6 = r13
            r15 = 0
            if (r5 >= 0) goto L_0x01de
            int r14 = r1 + r5
            r5 = r14
            r13 = r15
            goto L_0x01e8
        L_0x01de:
            r13 = r5
            r5 = r1
            goto L_0x01e8
        L_0x01e1:
            r6 = r5
            r15 = 0
            r5 = r3
            r13 = r26
            r3 = r40
        L_0x01e8:
            if (r13 < 0) goto L_0x0453
            int r1 = -r13
            java.lang.Object r8 = r2.first()
            G.e r8 = (G.C1179e) r8
            if (r36 > 0) goto L_0x01fa
            if (r38 >= 0) goto L_0x01f6
            goto L_0x01fa
        L_0x01f6:
            r24 = r13
            r13 = r8
            goto L_0x0219
        L_0x01fa:
            int r9 = r2.size()
            r10 = r13
            r13 = r15
        L_0x0200:
            if (r13 >= r9) goto L_0x0216
            if (r10 == 0) goto L_0x0216
            if (r6 > r10) goto L_0x0216
            int r11 = mf.C6565s.p(r2)
            if (r13 == r11) goto L_0x0216
            int r10 = r10 - r6
            int r13 = r13 + 1
            java.lang.Object r8 = r2.get(r13)
            G.e r8 = (G.C1179e) r8
            goto L_0x0200
        L_0x0216:
            r13 = r8
            r24 = r10
        L_0x0219:
            G.s$d r14 = new G.s$d
            r8 = r14
            r9 = r32
            r10 = r21
            r12 = r34
            r40 = r0
            r26 = r4
            r4 = r13
            r0 = r14
            r13 = r47
            r20 = r15
            r15 = r43
            r16 = r45
            r17 = r44
            r18 = r46
            r19 = r49
            r8.<init>(r9, r10, r12, r13, r15, r16, r17, r18, r19)
            r15 = r51
            r29 = r2
            r28 = r20
            r2 = r50
            java.util.List r0 = f(r3, r2, r15, r0)
            int r3 = r0.size()
            r13 = r40
            r8 = r28
        L_0x024d:
            if (r8 >= r3) goto L_0x0260
            java.lang.Object r9 = r0.get(r8)
            G.e r9 = (G.C1179e) r9
            int r9 = r9.c()
            int r13 = java.lang.Math.max(r13, r9)
            int r8 = r8 + 1
            goto L_0x024d
        L_0x0260:
            java.lang.Object r3 = r29.last()
            G.e r3 = (G.C1179e) r3
            int r3 = r3.getIndex()
            G.s$c r14 = new G.s$c
            r8 = r14
            r9 = r32
            r10 = r21
            r12 = r34
            r30 = r6
            r20 = r13
            r6 = r14
            r13 = r47
            r21 = r1
            r1 = r15
            r15 = r43
            r16 = r45
            r17 = r44
            r18 = r46
            r19 = r49
            r8.<init>(r9, r10, r12, r13, r15, r16, r17, r18, r19)
            java.util.List r1 = e(r3, r7, r2, r1, r6)
            int r3 = r1.size()
            r6 = r20
            r13 = r28
        L_0x0296:
            if (r13 >= r3) goto L_0x02a9
            java.lang.Object r8 = r1.get(r13)
            G.e r8 = (G.C1179e) r8
            int r8 = r8.c()
            int r6 = java.lang.Math.max(r6, r8)
            int r13 = r13 + 1
            goto L_0x0296
        L_0x02a9:
            java.lang.Object r3 = r29.first()
            boolean r3 = kotlin.jvm.internal.C6496s.c(r4, r3)
            if (r3 == 0) goto L_0x02c2
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x02c2
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x02c2
            r3 = r25
            goto L_0x02c4
        L_0x02c2:
            r3 = r28
        L_0x02c4:
            z.q r8 = z.q.Vertical
            r15 = r43
            if (r15 != r8) goto L_0x02ce
            r9 = r41
            r11 = r6
            goto L_0x02d1
        L_0x02ce:
            r9 = r41
            r11 = r5
        L_0x02d1:
            int r22 = c1.c.i(r9, r11)
            if (r15 != r8) goto L_0x02d8
            r6 = r5
        L_0x02d8:
            int r31 = c1.c.h(r9, r6)
            r8 = r32
            r9 = r29
            r10 = r0
            r11 = r1
            r12 = r22
            r13 = r31
            r14 = r5
            r6 = r15
            r15 = r35
            r16 = r21
            r17 = r43
            r18 = r46
            r19 = r32
            r20 = r38
            r21 = r49
            java.util.List r8 = c(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            if (r3 == 0) goto L_0x02fe
            r9 = r8
            goto L_0x033d
        L_0x02fe:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r9 = r8.size()
            r3.<init>(r9)
            int r9 = r8.size()
            r13 = r28
        L_0x030d:
            if (r13 >= r9) goto L_0x033c
            java.lang.Object r10 = r8.get(r13)
            r11 = r10
            G.e r11 = (G.C1179e) r11
            int r12 = r11.getIndex()
            java.lang.Object r14 = r29.first()
            G.e r14 = (G.C1179e) r14
            int r14 = r14.getIndex()
            if (r12 < r14) goto L_0x0339
            int r11 = r11.getIndex()
            java.lang.Object r12 = r29.last()
            G.e r12 = (G.C1179e) r12
            int r12 = r12.getIndex()
            if (r11 > r12) goto L_0x0339
            r3.add(r10)
        L_0x0339:
            int r13 = r13 + 1
            goto L_0x030d
        L_0x033c:
            r9 = r3
        L_0x033d:
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x034a
            java.util.List r0 = mf.C6565s.n()
        L_0x0347:
            r18 = r0
            goto L_0x0378
        L_0x034a:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r8.size()
            r0.<init>(r3)
            int r3 = r8.size()
            r13 = r28
        L_0x0359:
            if (r13 >= r3) goto L_0x0347
            java.lang.Object r10 = r8.get(r13)
            r11 = r10
            G.e r11 = (G.C1179e) r11
            int r11 = r11.getIndex()
            java.lang.Object r12 = r29.first()
            G.e r12 = (G.C1179e) r12
            int r12 = r12.getIndex()
            if (r11 >= r12) goto L_0x0375
            r0.add(r10)
        L_0x0375:
            int r13 = r13 + 1
            goto L_0x0359
        L_0x0378:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0385
            java.util.List r0 = mf.C6565s.n()
        L_0x0382:
            r19 = r0
            goto L_0x03b3
        L_0x0385:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r8.size()
            r0.<init>(r1)
            int r1 = r8.size()
            r13 = r28
        L_0x0394:
            if (r13 >= r1) goto L_0x0382
            java.lang.Object r3 = r8.get(r13)
            r10 = r3
            G.e r10 = (G.C1179e) r10
            int r10 = r10.getIndex()
            java.lang.Object r11 = r29.last()
            G.e r11 = (G.C1179e) r11
            int r11 = r11.getIndex()
            if (r10 <= r11) goto L_0x03b0
            r0.add(r3)
        L_0x03b0:
            int r13 = r13 + 1
            goto L_0x0394
        L_0x03b3:
            z.q r0 = z.q.Vertical
            if (r6 != r0) goto L_0x03ba
            r0 = r31
            goto L_0x03bc
        L_0x03ba:
            r0 = r22
        L_0x03bc:
            r1 = r9
            r2 = r36
            r3 = r37
            r10 = r39
            r11 = r4
            r12 = r26
            r4 = r30
            r14 = r5
            r5 = r52
            r13 = r35
            r15 = r30
            r6 = r33
            G.e r16 = b(r0, r1, r2, r3, r4, r5, r6)
            if (r16 == 0) goto L_0x03dd
            int r0 = r16.getIndex()
            r5 = r0
            goto L_0x03df
        L_0x03dd:
            r5 = r28
        L_0x03df:
            r0 = r52
            r1 = r35
            r2 = r49
            r3 = r36
            r4 = r37
            r6 = r33
            int r0 = r0.a(r1, r2, r3, r4, r5, r6)
            if (r16 == 0) goto L_0x03f6
            int r1 = r16.a()
            goto L_0x03f8
        L_0x03f6:
            r1 = r28
        L_0x03f8:
            if (r15 != 0) goto L_0x03fd
            r0 = 0
        L_0x03fb:
            r15 = r0
            goto L_0x040a
        L_0x03fd:
            int r0 = r0 - r1
            float r0 = (float) r0
            float r1 = (float) r15
            float r0 = r0 / r1
            r1 = -1090519040(0xffffffffbf000000, float:-0.5)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r0 = Ef.m.k(r0, r1, r2)
            goto L_0x03fb
        L_0x040a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r31)
            G.s$a r2 = new G.s$a
            r3 = r53
            r2.<init>(r8, r3)
            r3 = r55
            java.lang.Object r0 = r3.invoke(r0, r1, r2)
            r17 = r0
            H0.G r17 = (H0.G) r17
            if (r12 < r7) goto L_0x042b
            if (r14 <= r13) goto L_0x0428
            goto L_0x042b
        L_0x0428:
            r14 = r28
            goto L_0x042d
        L_0x042b:
            r14 = r25
        L_0x042d:
            G.u r21 = new G.u
            r0 = r21
            r1 = r9
            r2 = r49
            r3 = r38
            r4 = r37
            r5 = r43
            r6 = r23
            r7 = r10
            r8 = r46
            r9 = r50
            r10 = r11
            r11 = r16
            r12 = r15
            r13 = r24
            r15 = r52
            r16 = r17
            r17 = r27
            r20 = r54
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r21
        L_0x0453:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "invalid currentFirstPageScrollOffset"
            r0.<init>(r1)
            throw r0
        L_0x045b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "negative afterContentPadding"
            r0.<init>(r1)
            throw r0
        L_0x0463:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "negative beforeContentPadding"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: G.s.h(E.x, int, G.r, int, int, int, int, int, int, long, z.q, k0.c$c, k0.c$b, boolean, long, int, int, java.util.List, A.j, Y.r0, Ug.K, yf.q):G.u");
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f2370a = new b();

        b() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }

        public final void a(U.a aVar) {
        }
    }
}
