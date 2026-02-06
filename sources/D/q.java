package D;

import C.C1085c;
import E.M;
import Ef.g;
import Ef.m;
import H0.U;
import Y.C1510r0;
import c1.d;
import c1.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import mf.C6559l;
import mf.C6565s;
import yf.C6798l;

public abstract class q {

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f1302a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s f1303b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f1304c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C1510r0 f1305d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(List list, s sVar, boolean z10, C1510r0 r0Var) {
            super(1);
            this.f1302a = list;
            this.f1303b = sVar;
            this.f1304c = z10;
            this.f1305d = r0Var;
        }

        public final void a(U.a aVar) {
            List list = this.f1302a;
            s sVar = this.f1303b;
            boolean z10 = this.f1304c;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                s sVar2 = (s) list.get(i10);
                if (sVar2 != sVar) {
                    sVar2.q(aVar, z10);
                }
            }
            s sVar3 = this.f1303b;
            if (sVar3 != null) {
                sVar3.q(aVar, this.f1304c);
            }
            M.a(this.f1305d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    private static final List a(List list, List list2, List list3, int i10, int i11, int i12, int i13, int i14, boolean z10, C1085c.m mVar, C1085c.e eVar, boolean z11, d dVar) {
        int i15;
        boolean z12;
        List list4 = list;
        int i16 = i10;
        int i17 = i11;
        C1085c.m mVar2 = mVar;
        boolean z13 = z11;
        int i18 = i13;
        if (z10) {
            i15 = i17;
        } else {
            i15 = i16;
        }
        if (i12 < Math.min(i15, i18)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12 || i14 == 0) {
            ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
            if (!z12) {
                int size = list2.size();
                int i19 = i14;
                for (int i20 = 0; i20 < size; i20++) {
                    List list5 = list2;
                    s sVar = (s) list2.get(i20);
                    i19 -= sVar.i();
                    sVar.r(i19, i16, i17);
                    arrayList.add(sVar);
                }
                int size2 = list.size();
                int i21 = i14;
                for (int i22 = 0; i22 < size2; i22++) {
                    s sVar2 = (s) list.get(i22);
                    sVar2.r(i21, i16, i17);
                    arrayList.add(sVar2);
                    i21 += sVar2.i();
                }
                int size3 = list3.size();
                for (int i23 = 0; i23 < size3; i23++) {
                    s sVar3 = (s) list3.get(i23);
                    sVar3.r(i21, i16, i17);
                    arrayList.add(sVar3);
                    i21 += sVar3.i();
                }
            } else if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("no extra items");
            } else {
                int size4 = list.size();
                int[] iArr = new int[size4];
                for (int i24 = 0; i24 < size4; i24++) {
                    iArr[i24] = ((s) list.get(b(i24, z13, size4))).getSize();
                }
                int[] iArr2 = new int[size4];
                for (int i25 = 0; i25 < size4; i25++) {
                    iArr2[i25] = 0;
                }
                if (!z10) {
                    d dVar2 = dVar;
                    if (eVar != null) {
                        eVar.a(dVar, i15, iArr, t.Ltr, iArr2);
                    } else {
                        throw new IllegalArgumentException("null horizontalArrangement when isVertical == false");
                    }
                } else if (mVar2 != null) {
                    mVar2.arrange(dVar, i15, iArr, iArr2);
                } else {
                    throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
                }
                g e02 = C6559l.e0(iArr2);
                if (z13) {
                    e02 = m.s(e02);
                }
                int k10 = e02.k();
                int n10 = e02.n();
                int r10 = e02.r();
                if ((r10 > 0 && k10 <= n10) || (r10 < 0 && n10 <= k10)) {
                    while (true) {
                        int i26 = iArr2[k10];
                        s sVar4 = (s) list.get(b(k10, z13, size4));
                        if (z13) {
                            i26 = (i15 - i26) - sVar4.getSize();
                        }
                        sVar4.r(i26, i16, i17);
                        arrayList.add(sVar4);
                        if (k10 == n10) {
                            break;
                        }
                        k10 += r10;
                    }
                }
            }
            return arrayList;
        }
        throw new IllegalStateException("non-zero itemsScrollOffset");
    }

    private static final int b(int i10, boolean z10, int i11) {
        if (!z10) {
            return i10;
        }
        return (i11 - i10) - 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
        r5 = (D.k) r5.get(r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.util.List c(java.util.List r18, D.t r19, int r20, int r21, java.util.List r22, float r23, boolean r24, D.p r25) {
        /*
            r0 = r20
            java.lang.Object r1 = mf.C6565s.z0(r18)
            D.s r1 = (D.s) r1
            int r1 = r1.getIndex()
            int r1 = r1 + r21
            int r2 = r0 + -1
            int r1 = java.lang.Math.min(r1, r2)
            java.lang.Object r3 = mf.C6565s.z0(r18)
            D.s r3 = (D.s) r3
            int r3 = r3.getIndex()
            int r3 = r3 + 1
            r4 = 0
            if (r3 > r1) goto L_0x0040
            r5 = r4
        L_0x0024:
            if (r5 != 0) goto L_0x002b
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x002b:
            r11 = r5
            r9 = 2
            r10 = 0
            r7 = 0
            r5 = r19
            r6 = r3
            D.s r5 = D.t.e(r5, r6, r7, r9, r10)
            r11.add(r5)
            if (r3 == r1) goto L_0x0041
            int r3 = r3 + 1
            r5 = r11
            goto L_0x0024
        L_0x0040:
            r11 = r4
        L_0x0041:
            r3 = 0
            if (r24 == 0) goto L_0x0172
            if (r25 == 0) goto L_0x0172
            java.util.List r5 = r25.k()
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0172
            java.util.List r5 = r25.k()
            int r6 = r5.size()
            int r6 = r6 + -1
        L_0x005c:
            r7 = -1
            if (r7 >= r6) goto L_0x0085
            java.lang.Object r7 = r5.get(r6)
            D.k r7 = (D.k) r7
            int r7 = r7.getIndex()
            if (r7 <= r1) goto L_0x0082
            if (r6 == 0) goto L_0x007b
            int r7 = r6 + -1
            java.lang.Object r7 = r5.get(r7)
            D.k r7 = (D.k) r7
            int r7 = r7.getIndex()
            if (r7 > r1) goto L_0x0082
        L_0x007b:
            java.lang.Object r5 = r5.get(r6)
            D.k r5 = (D.k) r5
            goto L_0x0086
        L_0x0082:
            int r6 = r6 + -1
            goto L_0x005c
        L_0x0085:
            r5 = r4
        L_0x0086:
            java.util.List r6 = r25.k()
            java.lang.Object r6 = mf.C6565s.z0(r6)
            D.k r6 = (D.k) r6
            if (r5 == 0) goto L_0x00dd
            int r5 = r5.getIndex()
            int r7 = r6.getIndex()
            int r2 = java.lang.Math.min(r7, r2)
            if (r5 > r2) goto L_0x00dd
        L_0x00a0:
            if (r11 == 0) goto L_0x00be
            int r7 = r11.size()
            r8 = r3
        L_0x00a7:
            if (r8 >= r7) goto L_0x00ba
            java.lang.Object r9 = r11.get(r8)
            r10 = r9
            D.s r10 = (D.s) r10
            int r10 = r10.getIndex()
            if (r10 != r5) goto L_0x00b7
            goto L_0x00bb
        L_0x00b7:
            int r8 = r8 + 1
            goto L_0x00a7
        L_0x00ba:
            r9 = r4
        L_0x00bb:
            D.s r9 = (D.s) r9
            goto L_0x00bf
        L_0x00be:
            r9 = r4
        L_0x00bf:
            if (r9 != 0) goto L_0x00d8
            if (r11 != 0) goto L_0x00c8
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
        L_0x00c8:
            r16 = 2
            r17 = 0
            r14 = 0
            r12 = r19
            r13 = r5
            D.s r7 = D.t.e(r12, r13, r14, r16, r17)
            r11.add(r7)
        L_0x00d8:
            if (r5 == r2) goto L_0x00dd
            int r5 = r5 + 1
            goto L_0x00a0
        L_0x00dd:
            int r2 = r25.g()
            int r5 = r6.a()
            int r2 = r2 - r5
            int r5 = r6.getSize()
            int r2 = r2 - r5
            float r2 = (float) r2
            float r2 = r2 - r23
            r5 = 0
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0172
            int r5 = r6.getIndex()
            int r5 = r5 + 1
            r6 = r3
        L_0x00fa:
            if (r5 >= r0) goto L_0x0172
            float r7 = (float) r6
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x0172
            if (r5 > r1) goto L_0x0123
            int r7 = r18.size()
            r8 = r3
        L_0x0108:
            if (r8 >= r7) goto L_0x011d
            r9 = r18
            java.lang.Object r10 = r9.get(r8)
            r12 = r10
            D.s r12 = (D.s) r12
            int r12 = r12.getIndex()
            if (r12 != r5) goto L_0x011a
            goto L_0x0120
        L_0x011a:
            int r8 = r8 + 1
            goto L_0x0108
        L_0x011d:
            r9 = r18
            r10 = r4
        L_0x0120:
            D.s r10 = (D.s) r10
            goto L_0x0144
        L_0x0123:
            r9 = r18
            if (r11 == 0) goto L_0x0143
            int r7 = r11.size()
            r8 = r3
        L_0x012c:
            if (r8 >= r7) goto L_0x013f
            java.lang.Object r10 = r11.get(r8)
            r12 = r10
            D.s r12 = (D.s) r12
            int r12 = r12.getIndex()
            if (r12 != r5) goto L_0x013c
            goto L_0x0140
        L_0x013c:
            int r8 = r8 + 1
            goto L_0x012c
        L_0x013f:
            r10 = r4
        L_0x0140:
            D.s r10 = (D.s) r10
            goto L_0x0144
        L_0x0143:
            r10 = r4
        L_0x0144:
            if (r10 == 0) goto L_0x014e
            int r5 = r5 + 1
            int r7 = r10.i()
        L_0x014c:
            int r6 = r6 + r7
            goto L_0x00fa
        L_0x014e:
            if (r11 != 0) goto L_0x0155
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
        L_0x0155:
            r16 = 2
            r17 = 0
            r14 = 0
            r12 = r19
            r13 = r5
            D.s r7 = D.t.e(r12, r13, r14, r16, r17)
            r11.add(r7)
            int r5 = r5 + 1
            java.lang.Object r7 = mf.C6565s.z0(r11)
            D.s r7 = (D.s) r7
            int r7 = r7.i()
            goto L_0x014c
        L_0x0172:
            if (r11 == 0) goto L_0x018a
            java.lang.Object r0 = mf.C6565s.z0(r11)
            D.s r0 = (D.s) r0
            int r0 = r0.getIndex()
            if (r0 <= r1) goto L_0x018a
            java.lang.Object r0 = mf.C6565s.z0(r11)
            D.s r0 = (D.s) r0
            int r1 = r0.getIndex()
        L_0x018a:
            int r0 = r22.size()
        L_0x018e:
            if (r3 >= r0) goto L_0x01b5
            r2 = r22
            java.lang.Object r4 = r2.get(r3)
            java.lang.Number r4 = (java.lang.Number) r4
            int r6 = r4.intValue()
            if (r6 <= r1) goto L_0x01b2
            if (r11 != 0) goto L_0x01a5
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
        L_0x01a5:
            r9 = 2
            r10 = 0
            r7 = 0
            r5 = r19
            D.s r4 = D.t.e(r5, r6, r7, r9, r10)
            r11.add(r4)
        L_0x01b2:
            int r3 = r3 + 1
            goto L_0x018e
        L_0x01b5:
            if (r11 != 0) goto L_0x01bb
            java.util.List r11 = mf.C6565s.n()
        L_0x01bb:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: D.q.c(java.util.List, D.t, int, int, java.util.List, float, boolean, D.p):java.util.List");
    }

    private static final List d(int i10, t tVar, int i11, List list) {
        int max = Math.max(0, i10 - i11);
        int i12 = i10 - 1;
        ArrayList arrayList = null;
        if (max <= i12) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(t.e(tVar, i12, 0, 2, (Object) null));
                if (i12 == max) {
                    break;
                }
                i12--;
            }
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i13 = size - 1;
                int intValue = ((Number) list.get(size)).intValue();
                if (intValue < max) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(t.e(tVar, intValue, 0, 2, (Object) null));
                }
                if (i13 < 0) {
                    break;
                }
                size = i13;
            }
        }
        if (arrayList == null) {
            return C6565s.n();
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: D.s} */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x024c, code lost:
        r17 = r3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03cd  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0410  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0415  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final D.r e(int r40, D.t r41, int r42, int r43, int r44, int r45, int r46, int r47, float r48, long r49, boolean r51, java.util.List r52, C.C1085c.m r53, C.C1085c.e r54, boolean r55, c1.d r56, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator r57, int r58, java.util.List r59, boolean r60, boolean r61, D.p r62, Ug.K r63, Y.C1510r0 r64, r0.F1 r65, yf.q r66) {
        /*
            r15 = r40
            r13 = r42
            r14 = r43
            r11 = r49
            r10 = r61
            r9 = r66
            if (r14 < 0) goto L_0x044f
            if (r44 < 0) goto L_0x0447
            if (r15 > 0) goto L_0x00a6
            int r0 = c1.b.n(r49)
            int r1 = c1.b.m(r49)
            java.util.ArrayList r19 = new java.util.ArrayList
            r19.<init>()
            androidx.compose.foundation.lazy.layout.c r20 = r41.g()
            r26 = 0
            r27 = 0
            r16 = 0
            r24 = 1
            r15 = r57
            r17 = r0
            r18 = r1
            r21 = r41
            r22 = r51
            r23 = r61
            r25 = r60
            r28 = r63
            r29 = r65
            r15.m(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            if (r10 != 0) goto L_0x0062
            long r2 = r57.i()
            c1.r$a r4 = c1.r.f19235b
            long r4 = r4.a()
            boolean r4 = c1.r.e(r2, r4)
            if (r4 != 0) goto L_0x0062
            int r0 = c1.r.g(r2)
            int r0 = c1.c.i(r11, r0)
            int r1 = c1.r.f(r2)
            int r1 = c1.c.h(r11, r1)
        L_0x0062:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            D.q$a r2 = D.q.a.f1301a
            java.lang.Object r0 = r9.invoke(r0, r1, r2)
            r5 = r0
            H0.G r5 = (H0.G) r5
            java.util.List r12 = mf.C6565s.n()
            int r14 = -r14
            int r16 = r13 + r44
            if (r51 == 0) goto L_0x0081
            z.q r0 = z.q.Vertical
        L_0x007e:
            r17 = r0
            goto L_0x0084
        L_0x0081:
            z.q r0 = z.q.Horizontal
            goto L_0x007e
        L_0x0084:
            long r10 = r41.f()
            D.r r21 = new D.r
            r0 = r21
            r15 = 0
            r20 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = r63
            r9 = r56
            r13 = r14
            r14 = r16
            r16 = r55
            r18 = r44
            r19 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r21
        L_0x00a6:
            r8 = 0
            r0 = r46
            if (r0 < r15) goto L_0x00af
            int r0 = r15 + -1
            r1 = r8
            goto L_0x00b1
        L_0x00af:
            r1 = r47
        L_0x00b1:
            int r2 = java.lang.Math.round(r48)
            int r1 = r1 - r2
            if (r0 != 0) goto L_0x00bc
            if (r1 >= 0) goto L_0x00bc
            int r2 = r2 + r1
            r1 = r8
        L_0x00bc:
            mf.k r7 = new mf.k
            r7.<init>()
            int r6 = -r14
            if (r45 >= 0) goto L_0x00c7
            r3 = r45
            goto L_0x00c8
        L_0x00c7:
            r3 = r8
        L_0x00c8:
            int r3 = r3 + r6
            int r1 = r1 + r3
            r4 = r8
        L_0x00cb:
            if (r1 >= 0) goto L_0x00f1
            if (r0 <= 0) goto L_0x00f1
            int r0 = r0 + -1
            r20 = 2
            r21 = 0
            r18 = 0
            r16 = r41
            r17 = r0
            D.s r5 = D.t.e(r16, r17, r18, r20, r21)
            r7.add(r8, r5)
            int r8 = r5.m()
            int r4 = java.lang.Math.max(r4, r8)
            int r5 = r5.i()
            int r1 = r1 + r5
            r8 = 0
            goto L_0x00cb
        L_0x00f1:
            if (r1 >= r3) goto L_0x00f5
            int r2 = r2 + r1
            r1 = r3
        L_0x00f5:
            int r1 = r1 - r3
            int r8 = r13 + r44
            r46 = r0
            r5 = 0
            int r0 = Ef.m.d(r8, r5)
            int r5 = -r1
            r18 = r46
            r47 = r1
            r19 = r4
            r1 = r5
            r5 = 0
            r17 = 0
        L_0x010a:
            int r4 = r7.size()
            r31 = 1
            if (r5 >= r4) goto L_0x012a
            if (r1 < r0) goto L_0x011a
            r7.remove(r5)
            r17 = r31
            goto L_0x010a
        L_0x011a:
            int r18 = r18 + 1
            java.lang.Object r4 = r7.get(r5)
            D.s r4 = (D.s) r4
            int r4 = r4.i()
            int r1 = r1 + r4
            int r5 = r5 + 1
            goto L_0x010a
        L_0x012a:
            r5 = r47
            r4 = r1
            r32 = r17
            r9 = r18
            r1 = r19
        L_0x0133:
            if (r9 >= r15) goto L_0x017f
            if (r4 < r0) goto L_0x013f
            if (r4 <= 0) goto L_0x013f
            boolean r17 = r7.isEmpty()
            if (r17 == 0) goto L_0x017f
        L_0x013f:
            r21 = 2
            r22 = 0
            r19 = 0
            r17 = r41
            r18 = r9
            r47 = r0
            D.s r0 = D.t.e(r17, r18, r19, r21, r22)
            int r17 = r0.i()
            int r4 = r4 + r17
            if (r4 > r3) goto L_0x0167
            r17 = r3
            int r3 = r15 + -1
            if (r9 == r3) goto L_0x0169
            int r3 = r9 + 1
            int r0 = r0.i()
            int r5 = r5 - r0
            r32 = r31
            goto L_0x0176
        L_0x0167:
            r17 = r3
        L_0x0169:
            int r3 = r0.m()
            int r1 = java.lang.Math.max(r1, r3)
            r7.add(r0)
            r3 = r46
        L_0x0176:
            int r9 = r9 + 1
            r0 = r47
            r46 = r3
            r3 = r17
            goto L_0x0133
        L_0x017f:
            if (r4 >= r13) goto L_0x01c2
            int r0 = r13 - r4
            int r5 = r5 - r0
            int r4 = r4 + r0
            r3 = r1
            r1 = r46
        L_0x0188:
            if (r5 >= r14) goto L_0x01b6
            if (r1 <= 0) goto L_0x01b6
            int r1 = r1 + -1
            r21 = 2
            r22 = 0
            r19 = 0
            r17 = r41
            r18 = r1
            r46 = r1
            D.s r1 = D.t.e(r17, r18, r19, r21, r22)
            r47 = r8
            r8 = 0
            r7.add(r8, r1)
            int r8 = r1.m()
            int r3 = java.lang.Math.max(r3, r8)
            int r1 = r1.i()
            int r5 = r5 + r1
            r1 = r46
            r8 = r47
            goto L_0x0188
        L_0x01b6:
            r47 = r8
            int r0 = r0 + r2
            if (r5 >= 0) goto L_0x01c0
            int r0 = r0 + r5
            int r4 = r4 + r5
            r8 = r4
            r5 = 0
            goto L_0x01c9
        L_0x01c0:
            r8 = r4
            goto L_0x01c9
        L_0x01c2:
            r47 = r8
            r3 = r1
            r0 = r2
            r8 = r4
            r1 = r46
        L_0x01c9:
            int r4 = java.lang.Math.round(r48)
            int r4 = Af.a.a(r4)
            r46 = r3
            int r3 = Af.a.a(r0)
            if (r4 != r3) goto L_0x01ea
            int r3 = java.lang.Math.round(r48)
            int r3 = java.lang.Math.abs(r3)
            int r4 = java.lang.Math.abs(r0)
            if (r3 < r4) goto L_0x01ea
            float r3 = (float) r0
            r4 = r3
            goto L_0x01ec
        L_0x01ea:
            r4 = r48
        L_0x01ec:
            float r3 = r48 - r4
            r17 = 0
            if (r10 == 0) goto L_0x01fe
            if (r0 <= r2) goto L_0x01fe
            int r18 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r18 > 0) goto L_0x01fe
            int r0 = r0 - r2
            float r0 = (float) r0
            float r0 = r0 + r3
            r33 = r0
            goto L_0x0200
        L_0x01fe:
            r33 = r17
        L_0x0200:
            if (r5 < 0) goto L_0x043f
            int r3 = -r5
            java.lang.Object r0 = r7.first()
            D.s r0 = (D.s) r0
            if (r14 > 0) goto L_0x021a
            if (r45 >= 0) goto L_0x020e
            goto L_0x021a
        L_0x020e:
            r2 = r58
            r17 = r3
            r34 = r5
            r3 = r41
            r5 = r0
        L_0x0217:
            r0 = r59
            goto L_0x0257
        L_0x021a:
            int r2 = r7.size()
            r48 = r0
            r0 = r5
            r5 = 0
        L_0x0222:
            if (r5 >= r2) goto L_0x024c
            java.lang.Object r17 = r7.get(r5)
            D.s r17 = (D.s) r17
            r18 = r2
            int r2 = r17.i()
            if (r0 == 0) goto L_0x024c
            if (r2 > r0) goto L_0x024c
            r17 = r3
            int r3 = mf.C6565s.p(r7)
            if (r5 == r3) goto L_0x024e
            int r0 = r0 - r2
            int r5 = r5 + 1
            java.lang.Object r2 = r7.get(r5)
            D.s r2 = (D.s) r2
            r48 = r2
            r3 = r17
            r2 = r18
            goto L_0x0222
        L_0x024c:
            r17 = r3
        L_0x024e:
            r3 = r41
            r5 = r48
            r2 = r58
            r34 = r0
            goto L_0x0217
        L_0x0257:
            java.util.List r1 = d(r1, r3, r2, r0)
            int r0 = r1.size()
            r18 = r9
            r2 = 0
            r9 = r46
        L_0x0264:
            if (r2 >= r0) goto L_0x027b
            java.lang.Object r19 = r1.get(r2)
            D.s r19 = (D.s) r19
            r46 = r0
            int r0 = r19.m()
            int r9 = java.lang.Math.max(r9, r0)
            int r2 = r2 + 1
            r0 = r46
            goto L_0x0264
        L_0x027b:
            r0 = r7
            r19 = r1
            r1 = r41
            r2 = r40
            r3 = r58
            r46 = r4
            r4 = r59
            r14 = r5
            r5 = r46
            r35 = r6
            r6 = r61
            r36 = r7
            r7 = r62
            java.util.List r2 = c(r0, r1, r2, r3, r4, r5, r6, r7)
            int r0 = r2.size()
            r5 = 0
        L_0x029c:
            if (r5 >= r0) goto L_0x02af
            java.lang.Object r1 = r2.get(r5)
            D.s r1 = (D.s) r1
            int r1 = r1.m()
            int r9 = java.lang.Math.max(r9, r1)
            int r5 = r5 + 1
            goto L_0x029c
        L_0x02af:
            java.lang.Object r0 = r36.first()
            boolean r0 = kotlin.jvm.internal.C6496s.c(r14, r0)
            if (r0 == 0) goto L_0x02c8
            boolean r0 = r19.isEmpty()
            if (r0 == 0) goto L_0x02c8
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x02c8
            r37 = r31
            goto L_0x02ca
        L_0x02c8:
            r37 = 0
        L_0x02ca:
            if (r51 == 0) goto L_0x02ce
            r0 = r9
            goto L_0x02cf
        L_0x02ce:
            r0 = r8
        L_0x02cf:
            int r7 = c1.c.i(r11, r0)
            if (r51 == 0) goto L_0x02d6
            r9 = r8
        L_0x02d6:
            int r9 = c1.c.h(r11, r9)
            r0 = r36
            r1 = r19
            r3 = r7
            r4 = r9
            r5 = r8
            r6 = r42
            r48 = r7
            r7 = r17
            r39 = r47
            r47 = r8
            r38 = 0
            r8 = r51
            r58 = r9
            r59 = r14
            r14 = r18
            r9 = r53
            r13 = r10
            r10 = r54
            r62 = r14
            r14 = r11
            r11 = r55
            r12 = r56
            java.util.List r6 = a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r7 = r46
            int r0 = (int) r7
            androidx.compose.foundation.lazy.layout.c r21 = r41.g()
            r25 = 1
            r16 = r57
            r17 = r0
            r18 = r48
            r19 = r58
            r20 = r6
            r22 = r41
            r23 = r51
            r24 = r61
            r26 = r60
            r27 = r34
            r28 = r47
            r29 = r63
            r30 = r65
            r16.m(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            if (r13 != 0) goto L_0x037d
            long r0 = r57.i()
            c1.r$a r2 = c1.r.f19235b
            long r2 = r2.a()
            boolean r2 = c1.r.e(r0, r2)
            if (r2 != 0) goto L_0x037d
            if (r51 == 0) goto L_0x0342
            r2 = r58
            goto L_0x0344
        L_0x0342:
            r2 = r48
        L_0x0344:
            int r3 = c1.r.g(r0)
            r4 = r48
            int r3 = java.lang.Math.max(r4, r3)
            int r3 = c1.c.i(r14, r3)
            int r0 = c1.r.f(r0)
            r1 = r58
            int r0 = java.lang.Math.max(r1, r0)
            int r9 = c1.c.h(r14, r0)
            if (r51 == 0) goto L_0x0364
            r0 = r9
            goto L_0x0365
        L_0x0364:
            r0 = r3
        L_0x0365:
            if (r0 == r2) goto L_0x037b
            int r1 = r6.size()
            r8 = r38
        L_0x036d:
            if (r8 >= r1) goto L_0x037b
            java.lang.Object r2 = r6.get(r8)
            D.s r2 = (D.s) r2
            r2.s(r0)
            int r8 = r8 + 1
            goto L_0x036d
        L_0x037b:
            r8 = r3
            goto L_0x0383
        L_0x037d:
            r4 = r48
            r1 = r58
            r9 = r1
            r8 = r4
        L_0x0383:
            r0 = r52
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x039f
            r0 = r6
            r1 = r41
            r2 = r52
            r3 = r43
            r4 = r8
            r5 = r9
            D.s r0 = D.h.a(r0, r1, r2, r3, r4, r5)
        L_0x039a:
            r15 = r40
            r1 = r62
            goto L_0x03a1
        L_0x039f:
            r0 = 0
            goto L_0x039a
        L_0x03a1:
            if (r1 < r15) goto L_0x03ae
            r1 = r42
            r4 = r47
            r2 = r13
            if (r4 <= r1) goto L_0x03ab
            goto L_0x03af
        L_0x03ab:
            r3 = r38
            goto L_0x03b1
        L_0x03ae:
            r2 = r13
        L_0x03af:
            r3 = r31
        L_0x03b1:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            D.q$b r5 = new D.q$b
            r8 = r64
            r5.<init>(r6, r0, r2, r8)
            r2 = r66
            java.lang.Object r1 = r2.invoke(r1, r4, r5)
            r5 = r1
            H0.G r5 = (H0.G) r5
            if (r37 == 0) goto L_0x03cd
            r12 = r6
            goto L_0x040e
        L_0x03cd:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r6.size()
            r1.<init>(r2)
            int r2 = r6.size()
            r8 = r38
        L_0x03dc:
            if (r8 >= r2) goto L_0x040d
            java.lang.Object r4 = r6.get(r8)
            r9 = r4
            D.s r9 = (D.s) r9
            int r10 = r9.getIndex()
            java.lang.Object r11 = r36.first()
            D.s r11 = (D.s) r11
            int r11 = r11.getIndex()
            if (r10 < r11) goto L_0x0405
            int r10 = r9.getIndex()
            java.lang.Object r11 = r36.last()
            D.s r11 = (D.s) r11
            int r11 = r11.getIndex()
            if (r10 <= r11) goto L_0x0407
        L_0x0405:
            if (r9 != r0) goto L_0x040a
        L_0x0407:
            r1.add(r4)
        L_0x040a:
            int r8 = r8 + 1
            goto L_0x03dc
        L_0x040d:
            r12 = r1
        L_0x040e:
            if (r51 == 0) goto L_0x0415
            z.q r0 = z.q.Vertical
        L_0x0412:
            r17 = r0
            goto L_0x0418
        L_0x0415:
            z.q r0 = z.q.Horizontal
            goto L_0x0412
        L_0x0418:
            long r10 = r41.f()
            D.r r21 = new D.r
            r0 = r21
            r20 = 0
            r1 = r59
            r2 = r34
            r4 = r7
            r6 = r33
            r7 = r32
            r8 = r63
            r9 = r56
            r13 = r35
            r14 = r39
            r15 = r40
            r16 = r55
            r18 = r44
            r19 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r21
        L_0x043f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "negative currentFirstItemScrollOffset"
            r0.<init>(r1)
            throw r0
        L_0x0447:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "invalid afterContentPadding"
            r0.<init>(r1)
            throw r0
        L_0x044f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "invalid beforeContentPadding"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: D.q.e(int, D.t, int, int, int, int, int, int, float, long, boolean, java.util.List, C.c$m, C.c$e, boolean, c1.d, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator, int, java.util.List, boolean, boolean, D.p, Ug.K, Y.r0, r0.F1, yf.q):D.r");
    }

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f1301a = new a();

        a() {
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
