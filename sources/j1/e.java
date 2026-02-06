package j1;

import i1.C2063e;
import i1.C2064f;
import i1.C2066h;
import i1.C2068j;
import j1.C2121b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private C2064f f22619a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f22620b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f22621c = true;

    /* renamed from: d  reason: collision with root package name */
    private C2064f f22622d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList f22623e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private ArrayList f22624f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private C2121b.C0361b f22625g = null;

    /* renamed from: h  reason: collision with root package name */
    private C2121b.a f22626h = new C2121b.a();

    /* renamed from: i  reason: collision with root package name */
    ArrayList f22627i = new ArrayList();

    public e(C2064f fVar) {
        this.f22619a = fVar;
        this.f22622d = fVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: j1.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: j1.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(j1.f r9, int r10, int r11, j1.f r12, java.util.ArrayList r13, j1.m r14) {
        /*
            r8 = this;
            j1.p r9 = r9.f22631d
            j1.m r0 = r9.f22682c
            if (r0 != 0) goto L_0x0107
            i1.f r0 = r8.f22619a
            j1.l r1 = r0.f21918e
            if (r9 == r1) goto L_0x0107
            j1.n r0 = r0.f21920f
            if (r9 != r0) goto L_0x0012
            goto L_0x0107
        L_0x0012:
            if (r14 != 0) goto L_0x001c
            j1.m r14 = new j1.m
            r14.<init>(r9, r11)
            r13.add(r14)
        L_0x001c:
            r9.f22682c = r14
            r14.a(r9)
            j1.f r11 = r9.f22687h
            java.util.List r11 = r11.f22638k
            java.util.Iterator r11 = r11.iterator()
        L_0x0029:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0046
            java.lang.Object r0 = r11.next()
            j1.d r0 = (j1.d) r0
            boolean r1 = r0 instanceof j1.f
            if (r1 == 0) goto L_0x0029
            r1 = r0
            j1.f r1 = (j1.f) r1
            r3 = 0
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L_0x0029
        L_0x0046:
            j1.f r11 = r9.f22688i
            java.util.List r11 = r11.f22638k
            java.util.Iterator r11 = r11.iterator()
        L_0x004e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r0 = r11.next()
            j1.d r0 = (j1.d) r0
            boolean r1 = r0 instanceof j1.f
            if (r1 == 0) goto L_0x004e
            r1 = r0
            j1.f r1 = (j1.f) r1
            r3 = 1
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L_0x004e
        L_0x006b:
            r11 = 1
            if (r10 != r11) goto L_0x009a
            boolean r0 = r9 instanceof j1.n
            if (r0 == 0) goto L_0x009a
            r0 = r9
            j1.n r0 = (j1.n) r0
            j1.f r0 = r0.f22663k
            java.util.List r0 = r0.f22638k
            java.util.Iterator r7 = r0.iterator()
        L_0x007d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x009a
            java.lang.Object r0 = r7.next()
            j1.d r0 = (j1.d) r0
            boolean r1 = r0 instanceof j1.f
            if (r1 == 0) goto L_0x007d
            r1 = r0
            j1.f r1 = (j1.f) r1
            r3 = 2
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L_0x007d
        L_0x009a:
            j1.f r0 = r9.f22687h
            java.util.List r0 = r0.f22639l
            java.util.Iterator r7 = r0.iterator()
        L_0x00a2:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r0 = r7.next()
            r1 = r0
            j1.f r1 = (j1.f) r1
            if (r1 != r12) goto L_0x00b3
            r14.f22657b = r11
        L_0x00b3:
            r3 = 0
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L_0x00a2
        L_0x00bd:
            j1.f r0 = r9.f22688i
            java.util.List r0 = r0.f22639l
            java.util.Iterator r7 = r0.iterator()
        L_0x00c5:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00e0
            java.lang.Object r0 = r7.next()
            r1 = r0
            j1.f r1 = (j1.f) r1
            if (r1 != r12) goto L_0x00d6
            r14.f22657b = r11
        L_0x00d6:
            r3 = 1
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L_0x00c5
        L_0x00e0:
            if (r10 != r11) goto L_0x0107
            boolean r11 = r9 instanceof j1.n
            if (r11 == 0) goto L_0x0107
            j1.n r9 = (j1.n) r9
            j1.f r9 = r9.f22663k
            java.util.List r9 = r9.f22639l
            java.util.Iterator r9 = r9.iterator()
        L_0x00f0:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0107
            java.lang.Object r11 = r9.next()
            r1 = r11
            j1.f r1 = (j1.f) r1
            r3 = 2
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L_0x00f0
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.e.a(j1.f, int, int, j1.f, java.util.ArrayList, j1.m):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0280, code lost:
        r4 = r0.f21913b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(i1.C2064f r17) {
        /*
            r16 = this;
            r0 = r17
            java.util.ArrayList r1 = r0.f22048V0
            java.util.Iterator r1 = r1.iterator()
        L_0x0008:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0338
            java.lang.Object r2 = r1.next()
            i1.e r2 = (i1.C2063e) r2
            i1.e$b[] r4 = r2.f21913b0
            r5 = r4[r3]
            r10 = 1
            r4 = r4[r10]
            int r6 = r2.X()
            r7 = 8
            if (r6 != r7) goto L_0x0027
            r2.f21910a = r10
            goto L_0x0008
        L_0x0027:
            float r6 = r2.f21866B
            r11 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            r7 = 2
            if (r6 >= 0) goto L_0x0036
            i1.e$b r6 = i1.C2063e.b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x0036
            r2.f21954w = r7
        L_0x0036:
            float r6 = r2.f21872E
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0042
            i1.e$b r6 = i1.C2063e.b.MATCH_CONSTRAINT
            if (r4 != r6) goto L_0x0042
            r2.f21956x = r7
        L_0x0042:
            float r6 = r2.x()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r8 = 3
            if (r6 <= 0) goto L_0x0078
            i1.e$b r6 = i1.C2063e.b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x005b
            i1.e$b r9 = i1.C2063e.b.WRAP_CONTENT
            if (r4 == r9) goto L_0x0058
            i1.e$b r9 = i1.C2063e.b.FIXED
            if (r4 != r9) goto L_0x005b
        L_0x0058:
            r2.f21954w = r8
            goto L_0x0078
        L_0x005b:
            if (r4 != r6) goto L_0x0068
            i1.e$b r9 = i1.C2063e.b.WRAP_CONTENT
            if (r5 == r9) goto L_0x0065
            i1.e$b r9 = i1.C2063e.b.FIXED
            if (r5 != r9) goto L_0x0068
        L_0x0065:
            r2.f21956x = r8
            goto L_0x0078
        L_0x0068:
            if (r5 != r6) goto L_0x0078
            if (r4 != r6) goto L_0x0078
            int r6 = r2.f21954w
            if (r6 != 0) goto L_0x0072
            r2.f21954w = r8
        L_0x0072:
            int r6 = r2.f21956x
            if (r6 != 0) goto L_0x0078
            r2.f21956x = r8
        L_0x0078:
            i1.e$b r6 = i1.C2063e.b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x008e
            int r9 = r2.f21954w
            if (r9 != r10) goto L_0x008e
            i1.d r9 = r2.f21896Q
            i1.d r9 = r9.f21849f
            if (r9 == 0) goto L_0x008c
            i1.d r9 = r2.f21900S
            i1.d r9 = r9.f21849f
            if (r9 != 0) goto L_0x008e
        L_0x008c:
            i1.e$b r5 = i1.C2063e.b.WRAP_CONTENT
        L_0x008e:
            r9 = r5
            if (r4 != r6) goto L_0x00a3
            int r5 = r2.f21956x
            if (r5 != r10) goto L_0x00a3
            i1.d r5 = r2.f21898R
            i1.d r5 = r5.f21849f
            if (r5 == 0) goto L_0x00a1
            i1.d r5 = r2.f21902T
            i1.d r5 = r5.f21849f
            if (r5 != 0) goto L_0x00a3
        L_0x00a1:
            i1.e$b r4 = i1.C2063e.b.WRAP_CONTENT
        L_0x00a3:
            r12 = r4
            j1.l r4 = r2.f21918e
            r4.f22683d = r9
            int r5 = r2.f21954w
            r4.f22680a = r5
            j1.n r4 = r2.f21920f
            r4.f22683d = r12
            int r13 = r2.f21956x
            r4.f22680a = r13
            i1.e$b r4 = i1.C2063e.b.MATCH_PARENT
            if (r9 == r4) goto L_0x00c0
            i1.e$b r14 = i1.C2063e.b.FIXED
            if (r9 == r14) goto L_0x00c0
            i1.e$b r14 = i1.C2063e.b.WRAP_CONTENT
            if (r9 != r14) goto L_0x00cc
        L_0x00c0:
            if (r12 == r4) goto L_0x02e2
            i1.e$b r14 = i1.C2063e.b.FIXED
            if (r12 == r14) goto L_0x02e2
            i1.e$b r14 = i1.C2063e.b.WRAP_CONTENT
            if (r12 != r14) goto L_0x00cc
            goto L_0x02e2
        L_0x00cc:
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r9 != r6) goto L_0x0199
            i1.e$b r15 = i1.C2063e.b.WRAP_CONTENT
            if (r12 == r15) goto L_0x00d8
            i1.e$b r11 = i1.C2063e.b.FIXED
            if (r12 != r11) goto L_0x0199
        L_0x00d8:
            if (r5 != r8) goto L_0x0113
            if (r12 != r15) goto L_0x00e6
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r15
            r4.l(r5, r6, r7, r8, r9)
        L_0x00e6:
            int r9 = r2.z()
            float r3 = (float) r9
            float r4 = r2.f21921f0
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r7 = (int) r3
            i1.e$b r8 = i1.C2063e.b.FIXED
            r4 = r16
            r5 = r2
            r6 = r8
            r4.l(r5, r6, r7, r8, r9)
            j1.l r3 = r2.f21918e
            j1.g r3 = r3.f22684e
            int r4 = r2.Y()
            r3.d(r4)
            j1.n r3 = r2.f21920f
            j1.g r3 = r3.f22684e
            int r4 = r2.z()
            r3.d(r4)
            r2.f21910a = r10
            goto L_0x0008
        L_0x0113:
            if (r5 != r10) goto L_0x012b
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.l(r5, r6, r7, r8, r9)
            j1.l r3 = r2.f21918e
            j1.g r3 = r3.f22684e
            int r2 = r2.Y()
            r3.f22649m = r2
            goto L_0x0008
        L_0x012b:
            if (r5 != r7) goto L_0x0167
            i1.e$b[] r11 = r0.f21913b0
            r11 = r11[r3]
            i1.e$b r15 = i1.C2063e.b.FIXED
            if (r11 == r15) goto L_0x0137
            if (r11 != r4) goto L_0x0199
        L_0x0137:
            float r3 = r2.f21866B
            int r4 = r17.Y()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r7 = (int) r3
            int r9 = r2.z()
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.l(r5, r6, r7, r8, r9)
            j1.l r3 = r2.f21918e
            j1.g r3 = r3.f22684e
            int r4 = r2.Y()
            r3.d(r4)
            j1.n r3 = r2.f21920f
            j1.g r3 = r3.f22684e
            int r4 = r2.z()
            r3.d(r4)
            r2.f21910a = r10
            goto L_0x0008
        L_0x0167:
            i1.d[] r11 = r2.f21908Y
            r7 = r11[r3]
            i1.d r7 = r7.f21849f
            if (r7 == 0) goto L_0x0175
            r7 = r11[r10]
            i1.d r7 = r7.f21849f
            if (r7 != 0) goto L_0x0199
        L_0x0175:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.l(r5, r6, r7, r8, r9)
            j1.l r3 = r2.f21918e
            j1.g r3 = r3.f22684e
            int r4 = r2.Y()
            r3.d(r4)
            j1.n r3 = r2.f21920f
            j1.g r3 = r3.f22684e
            int r4 = r2.z()
            r3.d(r4)
            r2.f21910a = r10
            goto L_0x0008
        L_0x0199:
            if (r12 != r6) goto L_0x0272
            i1.e$b r11 = i1.C2063e.b.WRAP_CONTENT
            if (r9 == r11) goto L_0x01a3
            i1.e$b r7 = i1.C2063e.b.FIXED
            if (r9 != r7) goto L_0x0272
        L_0x01a3:
            if (r13 != r8) goto L_0x01e9
            if (r9 != r11) goto L_0x01b1
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            r8 = r11
            r4.l(r5, r6, r7, r8, r9)
        L_0x01b1:
            int r7 = r2.Y()
            float r3 = r2.f21921f0
            int r4 = r2.y()
            r5 = -1
            if (r4 != r5) goto L_0x01c2
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 / r3
        L_0x01c2:
            float r4 = (float) r7
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            i1.e$b r8 = i1.C2063e.b.FIXED
            r4 = r16
            r5 = r2
            r6 = r8
            r4.l(r5, r6, r7, r8, r9)
            j1.l r3 = r2.f21918e
            j1.g r3 = r3.f22684e
            int r4 = r2.Y()
            r3.d(r4)
            j1.n r3 = r2.f21920f
            j1.g r3 = r3.f22684e
            int r4 = r2.z()
            r3.d(r4)
            r2.f21910a = r10
            goto L_0x0008
        L_0x01e9:
            if (r13 != r10) goto L_0x0202
            r7 = 0
            r3 = 0
            r4 = r16
            r5 = r2
            r6 = r9
            r8 = r11
            r9 = r3
            r4.l(r5, r6, r7, r8, r9)
            j1.n r3 = r2.f21920f
            j1.g r3 = r3.f22684e
            int r2 = r2.z()
            r3.f22649m = r2
            goto L_0x0008
        L_0x0202:
            r7 = 2
            if (r13 != r7) goto L_0x023f
            i1.e$b[] r7 = r0.f21913b0
            r7 = r7[r10]
            i1.e$b r8 = i1.C2063e.b.FIXED
            if (r7 == r8) goto L_0x020f
            if (r7 != r4) goto L_0x0272
        L_0x020f:
            float r3 = r2.f21872E
            int r7 = r2.Y()
            int r4 = r17.z()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r3 = (int) r3
            r4 = r16
            r5 = r2
            r6 = r9
            r9 = r3
            r4.l(r5, r6, r7, r8, r9)
            j1.l r3 = r2.f21918e
            j1.g r3 = r3.f22684e
            int r4 = r2.Y()
            r3.d(r4)
            j1.n r3 = r2.f21920f
            j1.g r3 = r3.f22684e
            int r4 = r2.z()
            r3.d(r4)
            r2.f21910a = r10
            goto L_0x0008
        L_0x023f:
            i1.d[] r4 = r2.f21908Y
            r7 = 2
            r15 = r4[r7]
            i1.d r7 = r15.f21849f
            if (r7 == 0) goto L_0x024e
            r4 = r4[r8]
            i1.d r4 = r4.f21849f
            if (r4 != 0) goto L_0x0272
        L_0x024e:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            r8 = r12
            r4.l(r5, r6, r7, r8, r9)
            j1.l r3 = r2.f21918e
            j1.g r3 = r3.f22684e
            int r4 = r2.Y()
            r3.d(r4)
            j1.n r3 = r2.f21920f
            j1.g r3 = r3.f22684e
            int r4 = r2.z()
            r3.d(r4)
            r2.f21910a = r10
            goto L_0x0008
        L_0x0272:
            if (r9 != r6) goto L_0x0008
            if (r12 != r6) goto L_0x0008
            if (r5 == r10) goto L_0x02c1
            if (r13 != r10) goto L_0x027b
            goto L_0x02c1
        L_0x027b:
            r4 = 2
            if (r13 != r4) goto L_0x0008
            if (r5 != r4) goto L_0x0008
            i1.e$b[] r4 = r0.f21913b0
            r3 = r4[r3]
            i1.e$b r8 = i1.C2063e.b.FIXED
            if (r3 != r8) goto L_0x0008
            r3 = r4[r10]
            if (r3 != r8) goto L_0x0008
            float r3 = r2.f21866B
            float r4 = r2.f21872E
            int r5 = r17.Y()
            float r5 = (float) r5
            float r3 = r3 * r5
            float r3 = r3 + r14
            int r7 = (int) r3
            int r3 = r17.z()
            float r3 = (float) r3
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            r4 = r16
            r5 = r2
            r6 = r8
            r4.l(r5, r6, r7, r8, r9)
            j1.l r3 = r2.f21918e
            j1.g r3 = r3.f22684e
            int r4 = r2.Y()
            r3.d(r4)
            j1.n r3 = r2.f21920f
            j1.g r3 = r3.f22684e
            int r4 = r2.z()
            r3.d(r4)
            r2.f21910a = r10
            goto L_0x0008
        L_0x02c1:
            i1.e$b r8 = i1.C2063e.b.WRAP_CONTENT
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r8
            r4.l(r5, r6, r7, r8, r9)
            j1.l r3 = r2.f21918e
            j1.g r3 = r3.f22684e
            int r4 = r2.Y()
            r3.f22649m = r4
            j1.n r3 = r2.f21920f
            j1.g r3 = r3.f22684e
            int r2 = r2.z()
            r3.f22649m = r2
            goto L_0x0008
        L_0x02e2:
            int r3 = r2.Y()
            if (r9 != r4) goto L_0x02fb
            int r3 = r17.Y()
            i1.d r5 = r2.f21896Q
            int r5 = r5.f21850g
            int r3 = r3 - r5
            i1.d r5 = r2.f21900S
            int r5 = r5.f21850g
            int r3 = r3 - r5
            i1.e$b r5 = i1.C2063e.b.FIXED
            r7 = r3
            r6 = r5
            goto L_0x02fd
        L_0x02fb:
            r7 = r3
            r6 = r9
        L_0x02fd:
            int r3 = r2.z()
            if (r12 != r4) goto L_0x0316
            int r3 = r17.z()
            i1.d r4 = r2.f21898R
            int r4 = r4.f21850g
            int r3 = r3 - r4
            i1.d r4 = r2.f21902T
            int r4 = r4.f21850g
            int r3 = r3 - r4
            i1.e$b r4 = i1.C2063e.b.FIXED
            r9 = r3
            r8 = r4
            goto L_0x0318
        L_0x0316:
            r9 = r3
            r8 = r12
        L_0x0318:
            r4 = r16
            r5 = r2
            r4.l(r5, r6, r7, r8, r9)
            j1.l r3 = r2.f21918e
            j1.g r3 = r3.f22684e
            int r4 = r2.Y()
            r3.d(r4)
            j1.n r3 = r2.f21920f
            j1.g r3 = r3.f22684e
            int r4 = r2.z()
            r3.d(r4)
            r2.f21910a = r10
            goto L_0x0008
        L_0x0338:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.e.b(i1.f):boolean");
    }

    private int e(C2064f fVar, int i10) {
        int size = this.f22627i.size();
        long j10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            j10 = Math.max(j10, ((m) this.f22627i.get(i11)).b(fVar, i10));
        }
        return (int) j10;
    }

    private void i(p pVar, int i10, ArrayList arrayList) {
        for (d dVar : pVar.f22687h.f22638k) {
            if (dVar instanceof f) {
                a((f) dVar, i10, 0, pVar.f22688i, arrayList, (m) null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f22687h, i10, 0, pVar.f22688i, arrayList, (m) null);
            }
        }
        for (d dVar2 : pVar.f22688i.f22638k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i10, 1, pVar.f22687h, arrayList, (m) null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f22688i, i10, 1, pVar.f22687h, arrayList, (m) null);
            }
        }
        if (i10 == 1) {
            for (d dVar3 : ((n) pVar).f22663k.f22638k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i10, 2, (f) null, arrayList, (m) null);
                }
            }
        }
    }

    private void l(C2063e eVar, C2063e.b bVar, int i10, C2063e.b bVar2, int i11) {
        C2121b.a aVar = this.f22626h;
        aVar.f22607a = bVar;
        aVar.f22608b = bVar2;
        aVar.f22609c = i10;
        aVar.f22610d = i11;
        this.f22625g.b(eVar, aVar);
        eVar.p1(this.f22626h.f22611e);
        eVar.Q0(this.f22626h.f22612f);
        eVar.P0(this.f22626h.f22614h);
        eVar.F0(this.f22626h.f22613g);
    }

    public void c() {
        d(this.f22623e);
        this.f22627i.clear();
        m.f22655h = 0;
        i(this.f22619a.f21918e, 0, this.f22627i);
        i(this.f22619a.f21920f, 1, this.f22627i);
        this.f22620b = false;
    }

    public void d(ArrayList arrayList) {
        arrayList.clear();
        this.f22622d.f21918e.f();
        this.f22622d.f21920f.f();
        arrayList.add(this.f22622d.f21918e);
        arrayList.add(this.f22622d.f21920f);
        Iterator it = this.f22622d.f22048V0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C2063e eVar = (C2063e) it.next();
            if (eVar instanceof C2066h) {
                arrayList.add(new j(eVar));
            } else {
                if (eVar.k0()) {
                    if (eVar.f21914c == null) {
                        eVar.f21914c = new c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f21914c);
                } else {
                    arrayList.add(eVar.f21918e);
                }
                if (eVar.m0()) {
                    if (eVar.f21916d == null) {
                        eVar.f21916d = new c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f21916d);
                } else {
                    arrayList.add(eVar.f21920f);
                }
                if (eVar instanceof C2068j) {
                    arrayList.add(new k(eVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((p) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p pVar = (p) it3.next();
            if (pVar.f22681b != this.f22622d) {
                pVar.d();
            }
        }
    }

    public boolean f(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (this.f22620b || this.f22621c) {
            Iterator it = this.f22619a.f22048V0.iterator();
            while (it.hasNext()) {
                C2063e eVar = (C2063e) it.next();
                eVar.p();
                eVar.f21910a = false;
                eVar.f21918e.r();
                eVar.f21920f.q();
            }
            this.f22619a.p();
            C2064f fVar = this.f22619a;
            fVar.f21910a = false;
            fVar.f21918e.r();
            this.f22619a.f21920f.q();
            this.f22621c = false;
        }
        if (b(this.f22622d)) {
            return false;
        }
        this.f22619a.r1(0);
        this.f22619a.s1(0);
        C2063e.b w10 = this.f22619a.w(0);
        C2063e.b w11 = this.f22619a.w(1);
        if (this.f22620b) {
            c();
        }
        int Z10 = this.f22619a.Z();
        int a02 = this.f22619a.a0();
        this.f22619a.f21918e.f22687h.d(Z10);
        this.f22619a.f21920f.f22687h.d(a02);
        m();
        C2063e.b bVar = C2063e.b.WRAP_CONTENT;
        if (w10 == bVar || w11 == bVar) {
            if (z10) {
                Iterator it2 = this.f22623e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((p) it2.next()).m()) {
                            z10 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z10 && w10 == C2063e.b.WRAP_CONTENT) {
                this.f22619a.U0(C2063e.b.FIXED);
                C2064f fVar2 = this.f22619a;
                fVar2.p1(e(fVar2, 0));
                C2064f fVar3 = this.f22619a;
                fVar3.f21918e.f22684e.d(fVar3.Y());
            }
            if (z10 && w11 == C2063e.b.WRAP_CONTENT) {
                this.f22619a.l1(C2063e.b.FIXED);
                C2064f fVar4 = this.f22619a;
                fVar4.Q0(e(fVar4, 1));
                C2064f fVar5 = this.f22619a;
                fVar5.f21920f.f22684e.d(fVar5.z());
            }
        }
        C2064f fVar6 = this.f22619a;
        C2063e.b bVar2 = fVar6.f21913b0[0];
        C2063e.b bVar3 = C2063e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == C2063e.b.MATCH_PARENT) {
            int Y10 = fVar6.Y() + Z10;
            this.f22619a.f21918e.f22688i.d(Y10);
            this.f22619a.f21918e.f22684e.d(Y10 - Z10);
            m();
            C2064f fVar7 = this.f22619a;
            C2063e.b bVar4 = fVar7.f21913b0[1];
            if (bVar4 == bVar3 || bVar4 == C2063e.b.MATCH_PARENT) {
                int z13 = fVar7.z() + a02;
                this.f22619a.f21920f.f22688i.d(z13);
                this.f22619a.f21920f.f22684e.d(z13 - a02);
            }
            m();
            z11 = true;
        } else {
            z11 = false;
        }
        Iterator it3 = this.f22623e.iterator();
        while (it3.hasNext()) {
            p pVar = (p) it3.next();
            if (pVar.f22681b != this.f22619a || pVar.f22686g) {
                pVar.e();
            }
        }
        Iterator it4 = this.f22623e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z12 = true;
                break;
            }
            p pVar2 = (p) it4.next();
            if ((z11 || pVar2.f22681b != this.f22619a) && (!pVar2.f22687h.f22637j || ((!pVar2.f22688i.f22637j && !(pVar2 instanceof j)) || (!pVar2.f22684e.f22637j && !(pVar2 instanceof c) && !(pVar2 instanceof j))))) {
                break;
            }
        }
        this.f22619a.U0(w10);
        this.f22619a.l1(w11);
        return z12;
    }

    public boolean g(boolean z10) {
        if (this.f22620b) {
            Iterator it = this.f22619a.f22048V0.iterator();
            while (it.hasNext()) {
                C2063e eVar = (C2063e) it.next();
                eVar.p();
                eVar.f21910a = false;
                l lVar = eVar.f21918e;
                lVar.f22684e.f22637j = false;
                lVar.f22686g = false;
                lVar.r();
                n nVar = eVar.f21920f;
                nVar.f22684e.f22637j = false;
                nVar.f22686g = false;
                nVar.q();
            }
            this.f22619a.p();
            C2064f fVar = this.f22619a;
            fVar.f21910a = false;
            l lVar2 = fVar.f21918e;
            lVar2.f22684e.f22637j = false;
            lVar2.f22686g = false;
            lVar2.r();
            n nVar2 = this.f22619a.f21920f;
            nVar2.f22684e.f22637j = false;
            nVar2.f22686g = false;
            nVar2.q();
            c();
        }
        if (b(this.f22622d)) {
            return false;
        }
        this.f22619a.r1(0);
        this.f22619a.s1(0);
        this.f22619a.f21918e.f22687h.d(0);
        this.f22619a.f21920f.f22687h.d(0);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x013e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean h(boolean r10, int r11) {
        /*
            r9 = this;
            i1.f r0 = r9.f22619a
            r1 = 0
            i1.e$b r0 = r0.w(r1)
            i1.f r2 = r9.f22619a
            r3 = 1
            i1.e$b r2 = r2.w(r3)
            i1.f r4 = r9.f22619a
            int r4 = r4.Z()
            i1.f r5 = r9.f22619a
            int r5 = r5.a0()
            if (r10 == 0) goto L_0x0088
            i1.e$b r6 = i1.C2063e.b.WRAP_CONTENT
            if (r0 == r6) goto L_0x0022
            if (r2 != r6) goto L_0x0088
        L_0x0022:
            java.util.ArrayList r6 = r9.f22623e
            java.util.Iterator r6 = r6.iterator()
        L_0x0028:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x003f
            java.lang.Object r7 = r6.next()
            j1.p r7 = (j1.p) r7
            int r8 = r7.f22685f
            if (r8 != r11) goto L_0x0028
            boolean r7 = r7.m()
            if (r7 != 0) goto L_0x0028
            r10 = r1
        L_0x003f:
            if (r11 != 0) goto L_0x0065
            if (r10 == 0) goto L_0x0088
            i1.e$b r10 = i1.C2063e.b.WRAP_CONTENT
            if (r0 != r10) goto L_0x0088
            i1.f r10 = r9.f22619a
            i1.e$b r6 = i1.C2063e.b.FIXED
            r10.U0(r6)
            i1.f r10 = r9.f22619a
            int r6 = r9.e(r10, r1)
            r10.p1(r6)
            i1.f r10 = r9.f22619a
            j1.l r6 = r10.f21918e
            j1.g r6 = r6.f22684e
            int r10 = r10.Y()
            r6.d(r10)
            goto L_0x0088
        L_0x0065:
            if (r10 == 0) goto L_0x0088
            i1.e$b r10 = i1.C2063e.b.WRAP_CONTENT
            if (r2 != r10) goto L_0x0088
            i1.f r10 = r9.f22619a
            i1.e$b r6 = i1.C2063e.b.FIXED
            r10.l1(r6)
            i1.f r10 = r9.f22619a
            int r6 = r9.e(r10, r3)
            r10.Q0(r6)
            i1.f r10 = r9.f22619a
            j1.n r6 = r10.f21920f
            j1.g r6 = r6.f22684e
            int r10 = r10.z()
            r6.d(r10)
        L_0x0088:
            if (r11 != 0) goto L_0x00b2
            i1.f r10 = r9.f22619a
            i1.e$b[] r5 = r10.f21913b0
            r5 = r5[r1]
            i1.e$b r6 = i1.C2063e.b.FIXED
            if (r5 == r6) goto L_0x0098
            i1.e$b r6 = i1.C2063e.b.MATCH_PARENT
            if (r5 != r6) goto L_0x00c1
        L_0x0098:
            int r10 = r10.Y()
            int r10 = r10 + r4
            i1.f r5 = r9.f22619a
            j1.l r5 = r5.f21918e
            j1.f r5 = r5.f22688i
            r5.d(r10)
            i1.f r5 = r9.f22619a
            j1.l r5 = r5.f21918e
            j1.g r5 = r5.f22684e
            int r10 = r10 - r4
            r5.d(r10)
        L_0x00b0:
            r10 = r3
            goto L_0x00dc
        L_0x00b2:
            i1.f r10 = r9.f22619a
            i1.e$b[] r4 = r10.f21913b0
            r4 = r4[r3]
            i1.e$b r6 = i1.C2063e.b.FIXED
            if (r4 == r6) goto L_0x00c3
            i1.e$b r6 = i1.C2063e.b.MATCH_PARENT
            if (r4 != r6) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            r10 = r1
            goto L_0x00dc
        L_0x00c3:
            int r10 = r10.z()
            int r10 = r10 + r5
            i1.f r4 = r9.f22619a
            j1.n r4 = r4.f21920f
            j1.f r4 = r4.f22688i
            r4.d(r10)
            i1.f r4 = r9.f22619a
            j1.n r4 = r4.f21920f
            j1.g r4 = r4.f22684e
            int r10 = r10 - r5
            r4.d(r10)
            goto L_0x00b0
        L_0x00dc:
            r9.m()
            java.util.ArrayList r4 = r9.f22623e
            java.util.Iterator r4 = r4.iterator()
        L_0x00e5:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0105
            java.lang.Object r5 = r4.next()
            j1.p r5 = (j1.p) r5
            int r6 = r5.f22685f
            if (r6 == r11) goto L_0x00f6
            goto L_0x00e5
        L_0x00f6:
            i1.e r6 = r5.f22681b
            i1.f r7 = r9.f22619a
            if (r6 != r7) goto L_0x0101
            boolean r6 = r5.f22686g
            if (r6 != 0) goto L_0x0101
            goto L_0x00e5
        L_0x0101:
            r5.e()
            goto L_0x00e5
        L_0x0105:
            java.util.ArrayList r4 = r9.f22623e
            java.util.Iterator r4 = r4.iterator()
        L_0x010b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x013e
            java.lang.Object r5 = r4.next()
            j1.p r5 = (j1.p) r5
            int r6 = r5.f22685f
            if (r6 == r11) goto L_0x011c
            goto L_0x010b
        L_0x011c:
            if (r10 != 0) goto L_0x0125
            i1.e r6 = r5.f22681b
            i1.f r7 = r9.f22619a
            if (r6 != r7) goto L_0x0125
            goto L_0x010b
        L_0x0125:
            j1.f r6 = r5.f22687h
            boolean r6 = r6.f22637j
            if (r6 != 0) goto L_0x012c
            goto L_0x013f
        L_0x012c:
            j1.f r6 = r5.f22688i
            boolean r6 = r6.f22637j
            if (r6 != 0) goto L_0x0133
            goto L_0x013f
        L_0x0133:
            boolean r6 = r5 instanceof j1.c
            if (r6 != 0) goto L_0x010b
            j1.g r5 = r5.f22684e
            boolean r5 = r5.f22637j
            if (r5 != 0) goto L_0x010b
            goto L_0x013f
        L_0x013e:
            r1 = r3
        L_0x013f:
            i1.f r10 = r9.f22619a
            r10.U0(r0)
            i1.f r10 = r9.f22619a
            r10.l1(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.e.h(boolean, int):boolean");
    }

    public void j() {
        this.f22620b = true;
    }

    public void k() {
        this.f22621c = true;
    }

    public void m() {
        boolean z10;
        g gVar;
        Iterator it = this.f22619a.f22048V0.iterator();
        while (it.hasNext()) {
            C2063e eVar = (C2063e) it.next();
            if (!eVar.f21910a) {
                C2063e.b[] bVarArr = eVar.f21913b0;
                boolean z11 = false;
                C2063e.b bVar = bVarArr[0];
                C2063e.b bVar2 = bVarArr[1];
                int i10 = eVar.f21954w;
                int i11 = eVar.f21956x;
                C2063e.b bVar3 = C2063e.b.WRAP_CONTENT;
                if (bVar == bVar3 || (bVar == C2063e.b.MATCH_CONSTRAINT && i10 == 1)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (bVar2 == bVar3 || (bVar2 == C2063e.b.MATCH_CONSTRAINT && i11 == 1)) {
                    z11 = true;
                }
                g gVar2 = eVar.f21918e.f22684e;
                boolean z12 = gVar2.f22637j;
                g gVar3 = eVar.f21920f.f22684e;
                boolean z13 = gVar3.f22637j;
                if (z12 && z13) {
                    C2063e.b bVar4 = C2063e.b.FIXED;
                    l(eVar, bVar4, gVar2.f22634g, bVar4, gVar3.f22634g);
                    eVar.f21910a = true;
                } else if (z12 && z11) {
                    l(eVar, C2063e.b.FIXED, gVar2.f22634g, bVar3, gVar3.f22634g);
                    if (bVar2 == C2063e.b.MATCH_CONSTRAINT) {
                        eVar.f21920f.f22684e.f22649m = eVar.z();
                    } else {
                        eVar.f21920f.f22684e.d(eVar.z());
                        eVar.f21910a = true;
                    }
                } else if (z13 && z10) {
                    l(eVar, bVar3, gVar2.f22634g, C2063e.b.FIXED, gVar3.f22634g);
                    if (bVar == C2063e.b.MATCH_CONSTRAINT) {
                        eVar.f21918e.f22684e.f22649m = eVar.Y();
                    } else {
                        eVar.f21918e.f22684e.d(eVar.Y());
                        eVar.f21910a = true;
                    }
                }
                if (eVar.f21910a && (gVar = eVar.f21920f.f22664l) != null) {
                    gVar.d(eVar.r());
                }
            }
        }
    }

    public void n(C2121b.C0361b bVar) {
        this.f22625g = bVar;
    }
}
