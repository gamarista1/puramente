package F;

import E.M;
import E.x;
import H0.U;
import Ug.K;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6558k;
import r0.F1;
import yf.C6798l;

public abstract class s {

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f2052a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f2053b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(List list, r rVar) {
            super(1);
            this.f2052a = list;
            this.f2053b = rVar;
        }

        public final void a(U.a aVar) {
            List list = this.f2052a;
            r rVar = this.f2053b;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((x) list.get(i10)).r(aVar, rVar);
            }
            M.a(this.f2053b.r().B());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    private static final List a(r rVar, C6558k[] kVarArr, int[] iArr, int i10) {
        int i11;
        int i12 = 0;
        for (C6558k size : kVarArr) {
            i12 += size.size();
        }
        ArrayList arrayList = new ArrayList(i12);
        while (true) {
            int length = kVarArr.length;
            int i13 = 0;
            while (i13 < length) {
                if (!kVarArr[i13].isEmpty()) {
                    int length2 = kVarArr.length;
                    int i14 = -1;
                    int i15 = Integer.MAX_VALUE;
                    for (int i16 = 0; i16 < length2; i16++) {
                        x xVar = (x) kVarArr[i16].t();
                        if (xVar != null) {
                            i11 = xVar.getIndex();
                        } else {
                            i11 = Integer.MAX_VALUE;
                        }
                        if (i15 > i11) {
                            i14 = i16;
                            i15 = i11;
                        }
                    }
                    x xVar2 = (x) kVarArr[i14].removeFirst();
                    if (xVar2.l() == i14) {
                        long a10 = G.a(xVar2.l(), xVar2.f());
                        int g10 = g(iArr, a10);
                        xVar2.s(g10, rVar.o().a()[i14], i10);
                        arrayList.add(xVar2);
                        int i17 = (int) (a10 & 4294967295L);
                        for (int i18 = (int) (a10 >> 32); i18 < i17; i18++) {
                            iArr[i18] = xVar2.i() + g10;
                        }
                    }
                } else {
                    i13++;
                }
            }
            return arrayList;
        }
    }

    private static final void b(r rVar, int[] iArr, int i10) {
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                while (true) {
                    if (iArr[length] < i10 && rVar.i().a(iArr[length], length)) {
                        break;
                    }
                    iArr[length] = c(rVar, iArr[length], length);
                }
                if (iArr[length] >= 0 && !rVar.s(rVar.g(), iArr[length])) {
                    rVar.i().l(iArr[length], length);
                }
                if (i11 >= 0) {
                    length = i11;
                } else {
                    return;
                }
            }
        }
    }

    private static final int c(r rVar, int i10, int i11) {
        return rVar.i().f(i10, i11);
    }

    private static final int d(int[] iArr) {
        int length = iArr.length;
        int i10 = -1;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            if (i11 < i13) {
                i10 = i12;
                i11 = i13;
            }
        }
        return i10;
    }

    public static final int e(int[] iArr, int i10) {
        int length = iArr.length;
        int i11 = -1;
        int i12 = a.e.API_PRIORITY_OTHER;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = i10 + 1;
            int i15 = iArr[i13];
            if (i14 <= i15 && i15 < i12) {
                i11 = i13;
                i12 = i15;
            }
        }
        return i11;
    }

    public static /* synthetic */ int f(int[] iArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Integer.MIN_VALUE;
        }
        return e(iArr, i10);
    }

    private static final int g(int[] iArr, long j10) {
        int i10 = (int) (j10 & 4294967295L);
        int i11 = Integer.MIN_VALUE;
        for (int i12 = (int) (j10 >> 32); i12 < i10; i12++) {
            i11 = Math.max(i11, iArr[i12]);
        }
        return i11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02ed, code lost:
        r3 = f(r13, 0, 1, (java.lang.Object) null);
        r4 = d(r30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02f8, code lost:
        if (r3 == r4) goto L_0x0303;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02fe, code lost:
        if (r13[r3] != r13[r4]) goto L_0x0302;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0300, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0302, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0303, code lost:
        r4 = r30[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0306, code lost:
        if (r4 != -1) goto L_0x030c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0308, code lost:
        r8 = r47;
        r4 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x030c, code lost:
        r8 = r47;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x030e, code lost:
        r4 = c(r8, r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0312, code lost:
        if (r4 >= 0) goto L_0x0354;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0314, code lost:
        r11 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0316, code lost:
        if (r0 != false) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x031c, code lost:
        if (j(r11, r8, r13, r3) == false) goto L_0x031f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x031f, code lost:
        r9 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0322, code lost:
        if (r51 == false) goto L_0x031f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0324, code lost:
        r47.i().j();
        r0 = r11.length;
        r1 = new int[r0];
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x032f, code lost:
        if (r2 >= r0) goto L_0x0337;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0331, code lost:
        r1[r2] = -1;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0337, code lost:
        r0 = r13.length;
        r2 = new int[r0];
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x033b, code lost:
        if (r4 >= r0) goto L_0x0344;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x033d, code lost:
        r2[r4] = r13[r3];
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x034b, code lost:
        return h(r8, r29, r1, r2, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x034c, code lost:
        r31 = r1;
        r25 = r7;
        r48 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0354, code lost:
        r9 = r29;
        r11 = r30;
        r48 = r15;
        r14 = r8.q(r47.g(), r4, r3);
        r3 = r47.i();
        r50 = r0;
        r31 = r1;
        r0 = (int) (r14 & 4294967295L);
        r25 = r7;
        r1 = (int) (r14 >> 32);
        r7 = r0 - r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x037c, code lost:
        if (r7 == 1) goto L_0x0380;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x037e, code lost:
        r8 = -2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0380, code lost:
        r8 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0381, code lost:
        r3.l(r4, r8);
        r3 = r47.m().e(r4, r14);
        r8 = g(r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0391, code lost:
        if (r7 == 1) goto L_0x039c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0393, code lost:
        r7 = r47.i().g(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x039c, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x039d, code lost:
        r14 = r1;
        r1 = r50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03a0, code lost:
        if (r14 >= r0) goto L_0x03c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03a4, code lost:
        if (r13[r14] == r8) goto L_0x03a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03a6, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03a7, code lost:
        r6[r14].addFirst(r3);
        r11[r14] = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03ae, code lost:
        if (r7 != null) goto L_0x03b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03b0, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03b2, code lost:
        r15 = r7[r14];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03b4, code lost:
        r13[r14] = (r8 + r3.i()) + r15;
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0552, code lost:
        if ((r4 != null ? r4.getIndex() : -1) > r11) goto L_0x0554;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0556, code lost:
        r4 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0619  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0646  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final F.v h(F.r r47, int r48, int[] r49, int[] r50, boolean r51) {
        /*
            r0 = r47
            r1 = r48
            r2 = r49
            r3 = r50
            E.x r11 = r47.l()
            F.j r4 = r47.g()
            int r12 = r4.a()
            if (r12 <= 0) goto L_0x001c
            int r4 = r47.h()
            if (r4 != 0) goto L_0x0022
        L_0x001c:
            r24 = r11
            r25 = r12
            goto L_0x084f
        L_0x0022:
            int r4 = r2.length
            int[] r8 = java.util.Arrays.copyOf(r2, r4)
            java.lang.String r4 = "copyOf(this, size)"
            kotlin.jvm.internal.C6496s.g(r8, r4)
            int r2 = r3.length
            int[] r13 = java.util.Arrays.copyOf(r3, r2)
            kotlin.jvm.internal.C6496s.g(r13, r4)
            b(r0, r8, r12)
            int r2 = -r1
            l(r13, r2)
            int r5 = r47.h()
            mf.k[] r6 = new mf.C6558k[r5]
            r2 = 0
        L_0x0042:
            if (r2 >= r5) goto L_0x0050
            mf.k r3 = new mf.k
            r9 = 16
            r3.<init>(r9)
            r6[r2] = r3
            int r2 = r2 + 1
            goto L_0x0042
        L_0x0050:
            int r2 = r47.b()
            int r2 = -r2
            l(r13, r2)
            r2 = 0
        L_0x0059:
            boolean r3 = i(r8, r13, r0)
            if (r3 == 0) goto L_0x00e9
            int r3 = d(r8)
            r7 = r8[r3]
            int r10 = r13.length
            r9 = 0
        L_0x0067:
            if (r9 >= r10) goto L_0x007a
            r14 = r8[r9]
            r15 = r8[r3]
            if (r14 == r15) goto L_0x0077
            r14 = r13[r9]
            r15 = r13[r3]
            if (r14 >= r15) goto L_0x0077
            r13[r9] = r15
        L_0x0077:
            int r9 = r9 + 1
            goto L_0x0067
        L_0x007a:
            int r7 = c(r0, r7, r3)
            if (r7 >= 0) goto L_0x0086
            r24 = r11
            r25 = r12
            goto L_0x00ee
        L_0x0086:
            F.j r9 = r47.g()
            long r9 = r0.q(r9, r7, r3)
            F.p r3 = r47.i()
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r14 = r14 & r9
            int r14 = (int) r14
            r24 = r11
            r25 = r12
            r15 = 32
            long r11 = r9 >> r15
            int r11 = (int) r11
            int r12 = r14 - r11
            r15 = 1
            if (r12 == r15) goto L_0x00a9
            r15 = -2
            goto L_0x00aa
        L_0x00a9:
            r15 = r11
        L_0x00aa:
            r3.l(r7, r15)
            F.u r3 = r47.m()
            F.x r3 = r3.e(r7, r9)
            int r9 = g(r13, r9)
            r10 = 1
            if (r12 == r10) goto L_0x00c5
            F.p r10 = r47.i()
            int[] r10 = r10.g(r7)
            goto L_0x00c6
        L_0x00c5:
            r10 = 0
        L_0x00c6:
            if (r11 >= r14) goto L_0x00e3
            r8[r11] = r7
            if (r10 != 0) goto L_0x00ce
            r12 = 0
            goto L_0x00d0
        L_0x00ce:
            r12 = r10[r11]
        L_0x00d0:
            int r15 = r3.i()
            int r15 = r15 + r9
            int r15 = r15 + r12
            r13[r11] = r15
            int r12 = r47.j()
            int r12 = r12 + r15
            if (r12 > 0) goto L_0x00e0
            r2 = 1
        L_0x00e0:
            int r11 = r11 + 1
            goto L_0x00c6
        L_0x00e3:
            r11 = r24
            r12 = r25
            goto L_0x0059
        L_0x00e9:
            r24 = r11
            r25 = r12
            r3 = -1
        L_0x00ee:
            int r7 = r47.b()
            int r12 = -r7
            r7 = 0
            r9 = r13[r7]
            if (r9 >= r12) goto L_0x00fe
            int r1 = r1 + r9
            int r9 = r12 - r9
            l(r13, r9)
        L_0x00fe:
            int r9 = r47.b()
            l(r13, r9)
            r9 = -1
            if (r3 != r9) goto L_0x010c
            int r3 = mf.C6559l.o0(r8, r7)
        L_0x010c:
            if (r3 == r9) goto L_0x013c
            boolean r7 = j(r8, r0, r13, r3)
            if (r7 == 0) goto L_0x013c
            if (r51 == 0) goto L_0x013c
            F.p r2 = r47.i()
            r2.j()
            int r2 = r8.length
            int[] r4 = new int[r2]
            r5 = 0
        L_0x0121:
            if (r5 >= r2) goto L_0x0129
            r4[r5] = r9
            int r5 = r5 + 1
            r9 = -1
            goto L_0x0121
        L_0x0129:
            int r2 = r13.length
            int[] r5 = new int[r2]
            r6 = 0
        L_0x012d:
            if (r6 >= r2) goto L_0x0136
            r7 = r13[r3]
            r5[r6] = r7
            int r6 = r6 + 1
            goto L_0x012d
        L_0x0136:
            r6 = 0
            F.v r0 = h(r0, r1, r4, r5, r6)
            return r0
        L_0x013c:
            int r3 = r8.length
            int[] r7 = java.util.Arrays.copyOf(r8, r3)
            kotlin.jvm.internal.C6496s.g(r7, r4)
            int r9 = r13.length
            int[] r10 = new int[r9]
            r3 = 0
        L_0x0148:
            if (r3 >= r9) goto L_0x0152
            r11 = r13[r3]
            int r11 = -r11
            r10[r3] = r11
            int r3 = r3 + 1
            goto L_0x0148
        L_0x0152:
            int r3 = r47.k()
            int r11 = r12 + r3
            int r3 = r47.j()
            int r14 = r47.a()
            int r3 = r3 + r14
            r14 = 0
            int r15 = Ef.m.d(r3, r14)
            r49 = r2
            r2 = 1
            r3 = 0
            int r26 = f(r7, r14, r2, r3)
            r3 = r26
            r2 = 0
            r14 = -1
            r26 = r49
        L_0x0174:
            if (r3 == r14) goto L_0x0208
            int r14 = r47.h()
            if (r2 >= r14) goto L_0x0208
            r14 = r7[r3]
            int r27 = e(r7, r14)
            int r2 = r2 + 1
            r48 = r2
            if (r14 < 0) goto L_0x0201
            F.j r2 = r47.g()
            long r2 = r0.q(r2, r14, r3)
            r49 = r12
            F.u r12 = r47.m()
            F.x r12 = r12.e(r14, r2)
            r28 = r4
            F.p r4 = r47.i()
            r29 = r1
            r22 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r2 & r22
            int r0 = (int) r0
            r30 = r8
            r31 = r9
            r1 = 32
            long r8 = r2 >> r1
            int r1 = (int) r8
            int r8 = r0 - r1
            r9 = 1
            if (r8 == r9) goto L_0x01ba
            r9 = -2
            goto L_0x01bb
        L_0x01ba:
            r9 = r1
        L_0x01bb:
            r4.l(r14, r9)
            int r2 = g(r10, r2)
            r3 = r1
        L_0x01c3:
            if (r3 >= r0) goto L_0x01d6
            int r4 = r12.i()
            int r4 = r4 + r2
            r10[r3] = r4
            r7[r3] = r14
            r4 = r6[r3]
            r4.addLast(r12)
            int r3 = r3 + 1
            goto L_0x01c3
        L_0x01d6:
            if (r2 >= r11) goto L_0x01e4
            r0 = r10[r1]
            if (r0 > r11) goto L_0x01e4
            r0 = 0
            r12.t(r0)
            r0 = 1
            r26 = 1
            goto L_0x01e5
        L_0x01e4:
            r0 = 1
        L_0x01e5:
            if (r8 == r0) goto L_0x01fc
            int r2 = r47.h()
            r0 = r47
        L_0x01ed:
            r12 = r49
            r3 = r27
            r4 = r28
            r1 = r29
            r8 = r30
            r9 = r31
            r14 = -1
            goto L_0x0174
        L_0x01fc:
            r0 = r47
            r2 = r48
            goto L_0x01ed
        L_0x0201:
            r14 = -1
            r0 = r47
            r3 = r27
            goto L_0x0174
        L_0x0208:
            r29 = r1
            r28 = r4
            r30 = r8
            r31 = r9
            r49 = r12
        L_0x0212:
            r1 = r31
            r0 = 0
        L_0x0215:
            if (r0 >= r1) goto L_0x0225
            r2 = r10[r0]
            if (r2 < r15) goto L_0x0221
            if (r2 > 0) goto L_0x021e
            goto L_0x0221
        L_0x021e:
            int r0 = r0 + 1
            goto L_0x0215
        L_0x0221:
            r0 = 0
            r2 = 0
            r3 = 1
            goto L_0x0237
        L_0x0225:
            r0 = 0
        L_0x0226:
            if (r0 >= r5) goto L_0x0221
            r2 = r6[r0]
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0234
            r12 = r25
            r3 = 1
            goto L_0x0244
        L_0x0234:
            int r0 = r0 + 1
            goto L_0x0226
        L_0x0237:
            int r4 = f(r10, r0, r3, r2)
            int r0 = mf.C6559l.U0(r7)
            int r0 = r0 + r3
            r12 = r25
            if (r0 < r12) goto L_0x07a9
        L_0x0244:
            r0 = 0
        L_0x0245:
            if (r0 >= r5) goto L_0x029b
            r2 = r6[r0]
        L_0x0249:
            int r4 = r2.size()
            if (r4 <= r3) goto L_0x0287
            java.lang.Object r4 = r2.first()
            F.x r4 = (F.x) r4
            boolean r4 = r4.q()
            if (r4 != 0) goto L_0x0287
            java.lang.Object r4 = r2.removeFirst()
            F.x r4 = (F.x) r4
            int r8 = r4.f()
            if (r8 == r3) goto L_0x0274
            F.p r3 = r47.i()
            int r8 = r4.getIndex()
            int[] r3 = r3.g(r8)
            goto L_0x0275
        L_0x0274:
            r3 = 0
        L_0x0275:
            r8 = r13[r0]
            int r4 = r4.i()
            if (r3 != 0) goto L_0x027f
            r3 = 0
            goto L_0x0281
        L_0x027f:
            r3 = r3[r0]
        L_0x0281:
            int r4 = r4 + r3
            int r8 = r8 - r4
            r13[r0] = r8
            r3 = 1
            goto L_0x0249
        L_0x0287:
            java.lang.Object r2 = r2.t()
            F.x r2 = (F.x) r2
            if (r2 == 0) goto L_0x0294
            int r2 = r2.getIndex()
            goto L_0x0295
        L_0x0294:
            r2 = -1
        L_0x0295:
            r30[r0] = r2
            int r0 = r0 + 1
            r3 = 1
            goto L_0x0245
        L_0x029b:
            int r0 = r7.length
            r2 = 0
        L_0x029d:
            if (r2 >= r0) goto L_0x02b1
            r3 = r7[r2]
            int r4 = r12 + -1
            if (r3 != r4) goto L_0x02ae
            int r0 = r47.k()
            int r0 = -r0
            l(r10, r0)
            goto L_0x02b1
        L_0x02ae:
            int r2 = r2 + 1
            goto L_0x029d
        L_0x02b1:
            r0 = 0
        L_0x02b2:
            if (r0 >= r1) goto L_0x02ce
            r2 = r10[r0]
            int r3 = r47.j()
            if (r2 >= r3) goto L_0x02bf
            int r0 = r0 + 1
            goto L_0x02b2
        L_0x02bf:
            r8 = r47
            r31 = r1
            r25 = r7
            r48 = r15
            r1 = r29
            r11 = r30
            r7 = 0
            goto L_0x0410
        L_0x02ce:
            int r0 = d(r10)
            int r2 = r47.j()
            r0 = r10[r0]
            int r2 = r2 - r0
            int r0 = -r2
            l(r13, r0)
            l(r10, r2)
            r0 = 0
        L_0x02e1:
            int r3 = r13.length
            r4 = 0
        L_0x02e3:
            if (r4 >= r3) goto L_0x03dc
            r8 = r13[r4]
            int r9 = r47.b()
            if (r8 >= r9) goto L_0x03ce
            r8 = 0
            r9 = 0
            r11 = 1
            int r3 = f(r13, r8, r11, r9)
            int r4 = d(r30)
            if (r3 == r4) goto L_0x0303
            r8 = r13[r3]
            r9 = r13[r4]
            if (r8 != r9) goto L_0x0302
            r3 = r4
            goto L_0x0303
        L_0x0302:
            r0 = 1
        L_0x0303:
            r4 = r30[r3]
            r8 = -1
            if (r4 != r8) goto L_0x030c
            r8 = r47
            r4 = r12
            goto L_0x030e
        L_0x030c:
            r8 = r47
        L_0x030e:
            int r4 = c(r8, r4, r3)
            if (r4 >= 0) goto L_0x0354
            r11 = r30
            if (r0 != 0) goto L_0x0322
            boolean r4 = j(r11, r8, r13, r3)
            if (r4 == 0) goto L_0x031f
            goto L_0x0322
        L_0x031f:
            r9 = r29
            goto L_0x034c
        L_0x0322:
            if (r51 == 0) goto L_0x031f
            F.p r0 = r47.i()
            r0.j()
            int r0 = r11.length
            int[] r1 = new int[r0]
            r2 = 0
        L_0x032f:
            if (r2 >= r0) goto L_0x0337
            r4 = -1
            r1[r2] = r4
            int r2 = r2 + 1
            goto L_0x032f
        L_0x0337:
            int r0 = r13.length
            int[] r2 = new int[r0]
            r4 = 0
        L_0x033b:
            if (r4 >= r0) goto L_0x0344
            r5 = r13[r3]
            r2[r4] = r5
            int r4 = r4 + 1
            goto L_0x033b
        L_0x0344:
            r9 = r29
            r4 = 0
            F.v r0 = h(r8, r9, r1, r2, r4)
            return r0
        L_0x034c:
            r31 = r1
            r25 = r7
            r48 = r15
            goto L_0x03e6
        L_0x0354:
            r9 = r29
            r11 = r30
            F.j r14 = r47.g()
            r48 = r15
            long r14 = r8.q(r14, r4, r3)
            F.p r3 = r47.i()
            r50 = r0
            r31 = r1
            r22 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r14 & r22
            int r0 = (int) r0
            r25 = r7
            r1 = 32
            long r7 = r14 >> r1
            int r1 = (int) r7
            int r7 = r0 - r1
            r8 = 1
            if (r7 == r8) goto L_0x0380
            r8 = -2
            goto L_0x0381
        L_0x0380:
            r8 = r1
        L_0x0381:
            r3.l(r4, r8)
            F.u r3 = r47.m()
            F.x r3 = r3.e(r4, r14)
            int r8 = g(r13, r14)
            r14 = 1
            if (r7 == r14) goto L_0x039c
            F.p r7 = r47.i()
            int[] r7 = r7.g(r4)
            goto L_0x039d
        L_0x039c:
            r7 = 0
        L_0x039d:
            r14 = r1
            r1 = r50
        L_0x03a0:
            if (r14 >= r0) goto L_0x03c1
            r15 = r13[r14]
            if (r15 == r8) goto L_0x03a7
            r1 = 1
        L_0x03a7:
            r15 = r6[r14]
            r15.addFirst(r3)
            r11[r14] = r4
            if (r7 != 0) goto L_0x03b2
            r15 = 0
            goto L_0x03b4
        L_0x03b2:
            r15 = r7[r14]
        L_0x03b4:
            int r27 = r3.i()
            int r27 = r8 + r27
            int r27 = r27 + r15
            r13[r14] = r27
            int r14 = r14 + 1
            goto L_0x03a0
        L_0x03c1:
            r15 = r48
            r0 = r1
            r29 = r9
            r30 = r11
            r7 = r25
            r1 = r31
            goto L_0x02e1
        L_0x03ce:
            r31 = r1
            r25 = r7
            r48 = r15
            r9 = r29
            r11 = r30
            int r4 = r4 + 1
            goto L_0x02e3
        L_0x03dc:
            r31 = r1
            r25 = r7
            r48 = r15
            r9 = r29
            r11 = r30
        L_0x03e6:
            if (r0 == 0) goto L_0x03f9
            if (r51 == 0) goto L_0x03f9
            F.p r0 = r47.i()
            r0.j()
            r0 = 0
            r8 = r47
            F.v r0 = h(r8, r9, r11, r13, r0)
            return r0
        L_0x03f9:
            r0 = 0
            r8 = r47
            int r1 = r9 + r2
            r2 = 1
            r7 = 0
            int r3 = f(r13, r0, r2, r7)
            r0 = r13[r3]
            if (r0 >= 0) goto L_0x0410
            int r1 = r1 + r0
            l(r10, r0)
            int r0 = -r0
            l(r13, r0)
        L_0x0410:
            F.E r0 = r47.r()
            float r0 = r0.G()
            int r0 = java.lang.Math.round(r0)
            int r0 = Af.a.a(r0)
            int r2 = Af.a.a(r1)
            if (r0 != r2) goto L_0x043e
            F.E r0 = r47.r()
            float r0 = r0.G()
            int r0 = java.lang.Math.round(r0)
            int r0 = java.lang.Math.abs(r0)
            int r2 = java.lang.Math.abs(r1)
            if (r0 < r2) goto L_0x043e
            float r0 = (float) r1
            goto L_0x0446
        L_0x043e:
            F.E r0 = r47.r()
            float r0 = r0.G()
        L_0x0446:
            int r1 = r13.length
            int[] r1 = java.util.Arrays.copyOf(r13, r1)
            r14 = r28
            kotlin.jvm.internal.C6496s.g(r1, r14)
            int r2 = r1.length
            r3 = 0
        L_0x0452:
            if (r3 >= r2) goto L_0x045c
            r4 = r1[r3]
            int r4 = -r4
            r1[r3] = r4
            int r3 = r3 + 1
            goto L_0x0452
        L_0x045c:
            int r2 = r47.b()
            int r3 = r47.k()
            if (r2 <= r3) goto L_0x04b2
            r2 = 0
        L_0x0467:
            if (r2 >= r5) goto L_0x04b2
            r3 = r6[r2]
            int r4 = r3.size()
            r9 = 0
        L_0x0470:
            if (r9 >= r4) goto L_0x04ae
            java.lang.Object r14 = r3.get(r9)
            F.x r14 = (F.x) r14
            F.p r15 = r47.i()
            int r7 = r14.getIndex()
            int[] r7 = r15.g(r7)
            int r14 = r14.i()
            if (r7 != 0) goto L_0x048c
            r7 = 0
            goto L_0x048e
        L_0x048c:
            r7 = r7[r2]
        L_0x048e:
            int r14 = r14 + r7
            int r7 = mf.C6565s.p(r3)
            if (r9 == r7) goto L_0x04ae
            r7 = r13[r2]
            if (r7 == 0) goto L_0x04ae
            if (r7 < r14) goto L_0x04ae
            int r7 = r7 - r14
            r13[r2] = r7
            int r9 = r9 + 1
            java.lang.Object r7 = r3.get(r9)
            F.x r7 = (F.x) r7
            int r7 = r7.getIndex()
            r11[r2] = r7
            r7 = 0
            goto L_0x0470
        L_0x04ae:
            int r2 = r2 + 1
            r7 = 0
            goto L_0x0467
        L_0x04b2:
            int r2 = r47.b()
            int r3 = r47.a()
            int r2 = r2 + r3
            boolean r3 = r47.t()
            if (r3 == 0) goto L_0x04ca
            long r3 = r47.c()
            int r3 = c1.b.l(r3)
            goto L_0x04d7
        L_0x04ca:
            long r3 = r47.c()
            int r7 = mf.C6559l.U0(r10)
            int r7 = r7 + r2
            int r3 = c1.c.i(r3, r7)
        L_0x04d7:
            boolean r4 = r47.t()
            if (r4 == 0) goto L_0x04eb
            long r14 = r47.c()
            int r4 = mf.C6559l.U0(r10)
            int r4 = r4 + r2
            int r4 = c1.c.h(r14, r4)
            goto L_0x04f3
        L_0x04eb:
            long r14 = r47.c()
            int r4 = c1.b.k(r14)
        L_0x04f3:
            boolean r7 = r47.t()
            if (r7 == 0) goto L_0x04fb
            r7 = r4
            goto L_0x04fc
        L_0x04fb:
            r7 = r3
        L_0x04fc:
            int r9 = r47.j()
            int r7 = java.lang.Math.min(r7, r9)
            int r9 = r47.b()
            int r7 = r7 - r9
            int r9 = r47.a()
            int r7 = r7 + r9
            r9 = 0
            r14 = r1[r9]
            java.util.List r9 = r47.n()
            int r15 = r9.size()
            r18 = -1
            int r15 = r15 + -1
            if (r15 < 0) goto L_0x05ae
            r30 = r11
            r11 = r15
            r15 = r14
            r14 = 0
        L_0x0524:
            int r21 = r11 + -1
            java.lang.Object r11 = r9.get(r11)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            r50 = r9
            F.p r9 = r47.i()
            int r9 = r9.h(r11)
            r51 = r4
            r4 = -2
            if (r9 == r4) goto L_0x0558
            r4 = -1
            if (r9 == r4) goto L_0x0558
            r4 = r6[r9]
            java.lang.Object r4 = r4.t()
            F.x r4 = (F.x) r4
            if (r4 == 0) goto L_0x0551
            int r9 = r4.getIndex()
            goto L_0x0552
        L_0x0551:
            r9 = -1
        L_0x0552:
            if (r9 <= r11) goto L_0x0556
        L_0x0554:
            r4 = 1
            goto L_0x0576
        L_0x0556:
            r4 = 0
            goto L_0x0576
        L_0x0558:
            r4 = 0
        L_0x0559:
            if (r4 >= r5) goto L_0x0554
            r9 = r6[r4]
            java.lang.Object r9 = r9.t()
            F.x r9 = (F.x) r9
            if (r9 == 0) goto L_0x056a
            int r9 = r9.getIndex()
            goto L_0x056b
        L_0x056a:
            r9 = -1
        L_0x056b:
            if (r9 <= r11) goto L_0x056f
            r9 = 1
            goto L_0x0570
        L_0x056f:
            r9 = 0
        L_0x0570:
            if (r9 != 0) goto L_0x0573
            goto L_0x0556
        L_0x0573:
            int r4 = r4 + 1
            goto L_0x0559
        L_0x0576:
            if (r4 == 0) goto L_0x059f
            F.j r4 = r47.g()
            r27 = r5
            r9 = 0
            long r4 = r8.q(r4, r11, r9)
            if (r14 != 0) goto L_0x058a
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x058a:
            F.u r9 = r47.m()
            F.x r4 = r9.e(r11, r4)
            int r5 = r4.i()
            int r15 = r15 - r5
            r5 = 0
            r4.s(r15, r5, r7)
            r14.add(r4)
            goto L_0x05a1
        L_0x059f:
            r27 = r5
        L_0x05a1:
            if (r21 >= 0) goto L_0x05a4
            goto L_0x05b3
        L_0x05a4:
            r9 = r50
            r4 = r51
            r11 = r21
            r5 = r27
            goto L_0x0524
        L_0x05ae:
            r51 = r4
            r30 = r11
            r14 = 0
        L_0x05b3:
            if (r14 != 0) goto L_0x05b9
            java.util.List r14 = mf.C6565s.n()
        L_0x05b9:
            java.util.List r23 = a(r8, r6, r1, r7)
            r4 = 0
            r1 = r1[r4]
            java.util.List r4 = r47.n()
            int r5 = r4.size()
            r6 = 0
            r17 = 0
        L_0x05cb:
            if (r6 >= r5) goto L_0x0656
            java.lang.Object r9 = r4.get(r6)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 < r12) goto L_0x05e1
        L_0x05d9:
            r50 = r4
            r21 = r5
            r11 = r25
        L_0x05df:
            r4 = 0
            goto L_0x0617
        L_0x05e1:
            F.p r11 = r47.i()
            int r11 = r11.h(r9)
            r15 = -2
            if (r11 == r15) goto L_0x05fb
            r15 = -1
            if (r11 == r15) goto L_0x05fb
            r11 = r25[r11]
            if (r11 >= r9) goto L_0x05d9
            r50 = r4
            r21 = r5
            r11 = r25
        L_0x05f9:
            r4 = 1
            goto L_0x0617
        L_0x05fb:
            r11 = r25
            int r15 = r11.length
            r50 = r4
            r4 = 0
        L_0x0601:
            if (r4 >= r15) goto L_0x0614
            r21 = r5
            r5 = r11[r4]
            if (r5 >= r9) goto L_0x060b
            r5 = 1
            goto L_0x060c
        L_0x060b:
            r5 = 0
        L_0x060c:
            if (r5 != 0) goto L_0x060f
            goto L_0x05df
        L_0x060f:
            int r4 = r4 + 1
            r5 = r21
            goto L_0x0601
        L_0x0614:
            r21 = r5
            goto L_0x05f9
        L_0x0617:
            if (r4 == 0) goto L_0x0646
            F.j r4 = r47.g()
            r15 = r11
            r25 = r12
            r5 = 0
            long r11 = r8.q(r4, r9, r5)
            if (r17 != 0) goto L_0x062c
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
        L_0x062c:
            r22 = r15
            r4 = r17
            F.u r15 = r47.m()
            F.x r9 = r15.e(r9, r11)
            r9.s(r1, r5, r7)
            int r5 = r9.i()
            int r1 = r1 + r5
            r4.add(r9)
            r17 = r4
            goto L_0x064a
        L_0x0646:
            r22 = r11
            r25 = r12
        L_0x064a:
            int r6 = r6 + 1
            r4 = r50
            r5 = r21
            r12 = r25
            r25 = r22
            goto L_0x05cb
        L_0x0656:
            r22 = r25
            r25 = r12
            if (r17 != 0) goto L_0x0660
            java.util.List r17 = mf.C6565s.n()
        L_0x0660:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Collection r14 = (java.util.Collection) r14
            r1.addAll(r14)
            r4 = r23
            java.util.Collection r4 = (java.util.Collection) r4
            r1.addAll(r4)
            r4 = r17
            java.util.Collection r4 = (java.util.Collection) r4
            r1.addAll(r4)
            F.E r4 = r47.r()
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator r32 = r4.t()
            int r4 = (int) r0
            F.u r5 = r47.m()
            androidx.compose.foundation.lazy.layout.c r37 = r5.f()
            F.u r38 = r47.m()
            boolean r39 = r47.t()
            int r41 = r47.h()
            int r43 = mf.C6559l.W0(r13)
            int r5 = mf.C6559l.U0(r10)
            int r44 = r5 + r2
            Ug.K r45 = r47.e()
            r0.F1 r46 = r47.f()
            r40 = 0
            r42 = 0
            r33 = r4
            r34 = r3
            r35 = r51
            r36 = r1
            r32.m(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            F.E r2 = r47.r()
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator r2 = r2.t()
            long r4 = r2.i()
            c1.r$a r2 = c1.r.f19235b
            long r6 = r2.a()
            boolean r2 = c1.r.e(r4, r6)
            if (r2 != 0) goto L_0x071b
            boolean r2 = r47.t()
            if (r2 == 0) goto L_0x06d7
            r2 = r51
            goto L_0x06d8
        L_0x06d7:
            r2 = r3
        L_0x06d8:
            long r6 = r47.c()
            int r9 = c1.r.g(r4)
            int r3 = java.lang.Math.max(r3, r9)
            int r3 = c1.c.i(r6, r3)
            long r6 = r47.c()
            int r4 = c1.r.f(r4)
            r5 = r51
            int r4 = java.lang.Math.max(r5, r4)
            int r4 = c1.c.h(r6, r4)
            boolean r5 = r47.t()
            if (r5 == 0) goto L_0x0702
            r5 = r4
            goto L_0x0703
        L_0x0702:
            r5 = r3
        L_0x0703:
            if (r5 == r2) goto L_0x0718
            int r2 = r1.size()
            r7 = 0
        L_0x070a:
            if (r7 >= r2) goto L_0x0718
            java.lang.Object r6 = r1.get(r7)
            F.x r6 = (F.x) r6
            r6.u(r5)
            int r7 = r7 + 1
            goto L_0x070a
        L_0x0718:
            r9 = r3
            r11 = r4
            goto L_0x071f
        L_0x071b:
            r5 = r51
            r9 = r3
            r11 = r5
        L_0x071f:
            r5 = r31
            r7 = 0
        L_0x0722:
            if (r7 >= r5) goto L_0x0736
            r2 = r10[r7]
            int r3 = r47.j()
            if (r2 <= r3) goto L_0x072e
            r15 = 1
            goto L_0x072f
        L_0x072e:
            r15 = 0
        L_0x072f:
            if (r15 == 0) goto L_0x0733
            r15 = 1
            goto L_0x0737
        L_0x0733:
            int r7 = r7 + 1
            goto L_0x0722
        L_0x0736:
            r15 = 0
        L_0x0737:
            if (r15 != 0) goto L_0x0755
            r2 = r22
            int r3 = r2.length
            r7 = 0
        L_0x073d:
            if (r7 >= r3) goto L_0x074f
            r4 = r2[r7]
            int r12 = r25 + -1
            if (r4 >= r12) goto L_0x0747
            r15 = 1
            goto L_0x0748
        L_0x0747:
            r15 = 0
        L_0x0748:
            if (r15 != 0) goto L_0x074c
            r15 = 0
            goto L_0x0750
        L_0x074c:
            int r7 = r7 + 1
            goto L_0x073d
        L_0x074f:
            r15 = 1
        L_0x0750:
            if (r15 == 0) goto L_0x0753
            goto L_0x0755
        L_0x0753:
            r12 = 0
            goto L_0x0756
        L_0x0755:
            r12 = 1
        L_0x0756:
            F.s$b r5 = new F.s$b
            r5.<init>(r1, r8)
            r6 = 4
            r7 = 0
            r4 = 0
            r1 = r24
            r2 = r9
            r3 = r11
            H0.G r5 = H0.H.N(r1, r2, r3, r4, r5, r6, r7)
            boolean r7 = r47.t()
            long r14 = c1.s.a(r9, r11)
            r28 = r48
            int r18 = r47.b()
            int r19 = r47.a()
            int r20 = r47.k()
            F.C r9 = r47.o()
            F.j r1 = r47.g()
            F.D r10 = r1.h()
            Ug.K r21 = r47.e()
            F.v r27 = new F.v
            r1 = r27
            r22 = 0
            r2 = r30
            r3 = r13
            r4 = r0
            r6 = r12
            r8 = r26
            r11 = r24
            r29 = r49
            r12 = r25
            r13 = r23
            r16 = r29
            r17 = r28
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22)
            return r27
        L_0x07a9:
            r8 = r47
            r27 = r5
            r25 = r12
            r14 = r28
            r9 = r29
            r29 = r49
            r5 = r1
            r28 = r15
            r1 = r30
            F.j r2 = r47.g()
            long r2 = r8.q(r2, r0, r4)
            F.p r4 = r47.i()
            r12 = r9
            r22 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r2 & r22
            int r8 = (int) r8
            r48 = r12
            r15 = r13
            r9 = 32
            long r12 = r2 >> r9
            int r12 = (int) r12
            int r13 = r8 - r12
            r9 = 1
            if (r13 == r9) goto L_0x07df
            r20 = r9
            goto L_0x07e1
        L_0x07df:
            r20 = 0
        L_0x07e1:
            if (r20 == 0) goto L_0x07e5
            r9 = -2
            goto L_0x07e6
        L_0x07e5:
            r9 = r12
        L_0x07e6:
            r4.l(r0, r9)
            F.u r4 = r47.m()
            F.x r4 = r4.e(r0, r2)
            int r2 = g(r10, r2)
            r9 = 1
            if (r13 == r9) goto L_0x07fa
            r3 = r9
            goto L_0x07fb
        L_0x07fa:
            r3 = 0
        L_0x07fb:
            if (r3 == 0) goto L_0x080e
            F.p r3 = r47.i()
            int[] r3 = r3.g(r0)
            if (r3 != 0) goto L_0x080f
            int r3 = r47.h()
            int[] r3 = new int[r3]
            goto L_0x080f
        L_0x080e:
            r3 = 0
        L_0x080f:
            r13 = r12
        L_0x0810:
            if (r13 >= r8) goto L_0x082d
            if (r3 == 0) goto L_0x081a
            r20 = r10[r13]
            int r20 = r2 - r20
            r3[r13] = r20
        L_0x081a:
            r7[r13] = r0
            int r20 = r4.i()
            int r20 = r2 + r20
            r10[r13] = r20
            r9 = r6[r13]
            r9.addLast(r4)
            int r13 = r13 + 1
            r9 = 1
            goto L_0x0810
        L_0x082d:
            F.p r8 = r47.i()
            r8.k(r0, r3)
            if (r2 >= r11) goto L_0x083e
            r0 = r10[r12]
            if (r0 > r11) goto L_0x083e
            r0 = 0
            r4.t(r0)
        L_0x083e:
            r30 = r1
            r31 = r5
            r13 = r15
            r5 = r27
            r15 = r28
            r49 = r29
            r29 = r48
            r28 = r14
            goto L_0x0212
        L_0x084f:
            long r0 = r47.c()
            int r0 = c1.b.n(r0)
            long r4 = r47.c()
            int r1 = c1.b.m(r4)
            F.E r4 = r47.r()
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator r4 = r4.t()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            F.u r5 = r47.m()
            androidx.compose.foundation.lazy.layout.c r9 = r5.f()
            F.u r10 = r47.m()
            int r13 = r47.h()
            boolean r11 = r47.t()
            Ug.K r17 = r47.e()
            r0.F1 r18 = r47.f()
            r15 = 0
            r16 = 0
            r5 = 0
            r12 = 0
            r14 = 0
            r6 = r0
            r7 = r1
            r4.m(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            F.E r4 = r47.r()
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator r4 = r4.t()
            long r4 = r4.i()
            c1.r$a r6 = c1.r.f19235b
            long r6 = r6.a()
            boolean r6 = c1.r.e(r4, r6)
            if (r6 != 0) goto L_0x08c3
            long r0 = r47.c()
            int r6 = c1.r.g(r4)
            int r0 = c1.c.i(r0, r6)
            long r6 = r47.c()
            int r1 = c1.r.f(r4)
            int r1 = c1.c.h(r6, r1)
        L_0x08c3:
            r5 = r0
            r6 = r1
            F.s$a r8 = F.s.a.f2051a
            r9 = 4
            r10 = 0
            r7 = 0
            r4 = r24
            H0.G r5 = H0.H.N(r4, r5, r6, r7, r8, r9, r10)
            boolean r7 = r47.t()
            java.util.List r13 = mf.C6565s.n()
            long r0 = r47.c()
            int r0 = c1.b.n(r0)
            long r8 = r47.c()
            int r1 = c1.b.m(r8)
            long r14 = c1.s.a(r0, r1)
            int r0 = r47.b()
            int r0 = -r0
            r16 = r0
            int r0 = r47.j()
            int r1 = r47.a()
            int r17 = r0 + r1
            int r18 = r47.b()
            int r19 = r47.a()
            int r20 = r47.k()
            F.C r9 = r47.o()
            F.j r0 = r47.g()
            F.D r10 = r0.h()
            Ug.K r21 = r47.e()
            F.v r0 = new F.v
            r1 = r0
            r8 = 0
            r22 = 0
            r4 = 0
            r6 = 0
            r2 = r49
            r3 = r50
            r11 = r24
            r12 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: F.s.h(F.r, int, int[], int[], boolean):F.v");
    }

    private static final boolean i(int[] iArr, int[] iArr2, r rVar) {
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            if (iArr2[i10] < Math.max(-rVar.k(), 0) && i11 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean j(int[] iArr, r rVar, int[] iArr2, int i10) {
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (c(rVar, iArr[i11], i11) == -1 && iArr2[i11] != iArr2[i10]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i12 = 0; i12 < length2; i12++) {
            if (c(rVar, iArr[i12], i12) != -1 && iArr2[i12] >= iArr2[i10]) {
                return true;
            }
        }
        int h10 = rVar.i().h(0);
        if (h10 == 0 || h10 == -1 || h10 == -2) {
            return false;
        }
        return true;
    }

    public static final v k(x xVar, E e10, List list, j jVar, C c10, long j10, boolean z10, boolean z11, long j11, int i10, int i11, int i12, int i13, K k10, F1 f12) {
        int i14;
        int i15;
        E e11 = e10;
        r rVar = r0;
        r rVar2 = new r(e11, list, jVar, c10, j10, z10, xVar, i10, j11, i12, i13, z11, i11, k10, f12, (DefaultConstructorMarker) null);
        int[] P10 = e11.P(jVar, e10.F().d());
        int[] g10 = e10.F().g();
        if (P10.length != rVar.h()) {
            rVar.i().j();
            int h10 = rVar.h();
            int[] iArr = new int[h10];
            for (int i16 = 0; i16 < h10; i16++) {
                if (i16 >= P10.length || (i15 = P10[i16]) == -1) {
                    if (i16 == 0) {
                        i15 = 0;
                    } else {
                        i15 = g(iArr, G.a(0, i16)) + 1;
                    }
                }
                iArr[i16] = i15;
                rVar.i().l(iArr[i16], i16);
            }
            P10 = iArr;
        }
        if (g10.length != rVar.h()) {
            int h11 = rVar.h();
            int[] iArr2 = new int[h11];
            for (int i17 = 0; i17 < h11; i17++) {
                if (i17 < g10.length) {
                    i14 = g10[i17];
                } else if (i17 == 0) {
                    i14 = 0;
                } else {
                    i14 = iArr2[i17 - 1];
                }
                iArr2[i17] = i14;
            }
            g10 = iArr2;
        }
        return h(rVar, Math.round(e10.G()), P10, g10, true);
    }

    private static final void l(int[] iArr, int i10) {
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = iArr[i11] + i10;
        }
    }

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f2051a = new a();

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
