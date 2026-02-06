package j1;

import i1.C2062d;
import i1.C2063e;
import i1.C2066h;
import i1.C2068j;
import java.util.ArrayList;

public abstract class i {
    public static o a(C2063e eVar, int i10, ArrayList arrayList, o oVar) {
        int i11;
        int x12;
        if (i10 == 0) {
            i11 = eVar.f21901S0;
        } else {
            i11 = eVar.f21903T0;
        }
        int i12 = 0;
        if (i11 != -1 && (oVar == null || i11 != oVar.c())) {
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList.size()) {
                    break;
                }
                o oVar2 = (o) arrayList.get(i13);
                if (oVar2.c() == i11) {
                    if (oVar != null) {
                        oVar.g(i10, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i13++;
                }
            }
        } else if (i11 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof C2068j) && (x12 = ((C2068j) eVar).x1(i10)) != -1) {
                int i14 = 0;
                while (true) {
                    if (i14 >= arrayList.size()) {
                        break;
                    }
                    o oVar3 = (o) arrayList.get(i14);
                    if (oVar3.c() == x12) {
                        oVar = oVar3;
                        break;
                    }
                    i14++;
                }
            }
            if (oVar == null) {
                oVar = new o(i10);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof C2066h) {
                C2066h hVar = (C2066h) eVar;
                C2062d w12 = hVar.w1();
                if (hVar.x1() == 0) {
                    i12 = 1;
                }
                w12.c(i12, arrayList, oVar);
            }
            if (i10 == 0) {
                eVar.f21901S0 = oVar.c();
                eVar.f21896Q.c(i10, arrayList, oVar);
                eVar.f21900S.c(i10, arrayList, oVar);
            } else {
                eVar.f21903T0 = oVar.c();
                eVar.f21898R.c(i10, arrayList, oVar);
                eVar.f21904U.c(i10, arrayList, oVar);
                eVar.f21902T.c(i10, arrayList, oVar);
            }
            eVar.f21907X.c(i10, arrayList, oVar);
        }
        return oVar;
    }

    private static o b(ArrayList arrayList, int i10) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = (o) arrayList.get(i11);
            if (i10 == oVar.c()) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:175:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0392 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(i1.C2064f r16, j1.C2121b.C0361b r17) {
        /*
            r0 = r16
            java.util.ArrayList r1 = r16.w1()
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        L_0x000c:
            if (r4 >= r2) goto L_0x0033
            java.lang.Object r5 = r1.get(r4)
            i1.e r5 = (i1.C2063e) r5
            i1.e$b r6 = r16.C()
            i1.e$b r7 = r16.V()
            i1.e$b r8 = r5.C()
            i1.e$b r9 = r5.V()
            boolean r6 = d(r6, r7, r8, r9)
            if (r6 != 0) goto L_0x002b
            return r3
        L_0x002b:
            boolean r5 = r5 instanceof i1.C2065g
            if (r5 == 0) goto L_0x0030
            return r3
        L_0x0030:
            int r4 = r4 + 1
            goto L_0x000c
        L_0x0033:
            r5 = r3
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x003a:
            if (r5 >= r2) goto L_0x0113
            java.lang.Object r13 = r1.get(r5)
            i1.e r13 = (i1.C2063e) r13
            i1.e$b r14 = r16.C()
            i1.e$b r15 = r16.V()
            i1.e$b r4 = r13.C()
            i1.e$b r12 = r13.V()
            boolean r4 = d(r14, r15, r4, r12)
            if (r4 != 0) goto L_0x0062
            j1.b$a r4 = r0.f21997z1
            int r12 = j1.C2121b.a.f22604k
            r14 = r17
            i1.C2064f.Y1(r3, r13, r14, r4, r12)
            goto L_0x0064
        L_0x0062:
            r14 = r17
        L_0x0064:
            boolean r4 = r13 instanceof i1.C2066h
            if (r4 == 0) goto L_0x008c
            r12 = r13
            i1.h r12 = (i1.C2066h) r12
            int r15 = r12.x1()
            if (r15 != 0) goto L_0x007b
            if (r8 != 0) goto L_0x0078
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x0078:
            r8.add(r12)
        L_0x007b:
            int r15 = r12.x1()
            r3 = 1
            if (r15 != r3) goto L_0x008c
            if (r6 != 0) goto L_0x0089
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0089:
            r6.add(r12)
        L_0x008c:
            boolean r3 = r13 instanceof i1.C2068j
            if (r3 == 0) goto L_0x00d0
            boolean r3 = r13 instanceof i1.C2059a
            if (r3 == 0) goto L_0x00b9
            r3 = r13
            i1.a r3 = (i1.C2059a) r3
            int r12 = r3.C1()
            if (r12 != 0) goto L_0x00a7
            if (r7 != 0) goto L_0x00a4
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00a4:
            r7.add(r3)
        L_0x00a7:
            int r12 = r3.C1()
            r15 = 1
            if (r12 != r15) goto L_0x00d0
            if (r9 != 0) goto L_0x00b5
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00b5:
            r9.add(r3)
            goto L_0x00d0
        L_0x00b9:
            r3 = r13
            i1.j r3 = (i1.C2068j) r3
            if (r7 != 0) goto L_0x00c3
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00c3:
            r7.add(r3)
            if (r9 != 0) goto L_0x00cd
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00cd:
            r9.add(r3)
        L_0x00d0:
            i1.d r3 = r13.f21896Q
            i1.d r3 = r3.f21849f
            if (r3 != 0) goto L_0x00ec
            i1.d r3 = r13.f21900S
            i1.d r3 = r3.f21849f
            if (r3 != 0) goto L_0x00ec
            if (r4 != 0) goto L_0x00ec
            boolean r3 = r13 instanceof i1.C2059a
            if (r3 != 0) goto L_0x00ec
            if (r10 != 0) goto L_0x00e9
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x00e9:
            r10.add(r13)
        L_0x00ec:
            i1.d r3 = r13.f21898R
            i1.d r3 = r3.f21849f
            if (r3 != 0) goto L_0x010e
            i1.d r3 = r13.f21902T
            i1.d r3 = r3.f21849f
            if (r3 != 0) goto L_0x010e
            i1.d r3 = r13.f21904U
            i1.d r3 = r3.f21849f
            if (r3 != 0) goto L_0x010e
            if (r4 != 0) goto L_0x010e
            boolean r3 = r13 instanceof i1.C2059a
            if (r3 != 0) goto L_0x010e
            if (r11 != 0) goto L_0x010b
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
        L_0x010b:
            r11.add(r13)
        L_0x010e:
            int r5 = r5 + 1
            r3 = 0
            goto L_0x003a
        L_0x0113:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r6 == 0) goto L_0x0130
            java.util.Iterator r4 = r6.iterator()
        L_0x011e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0130
            java.lang.Object r5 = r4.next()
            i1.h r5 = (i1.C2066h) r5
            r6 = 0
            r12 = 0
            a(r5, r6, r3, r12)
            goto L_0x011e
        L_0x0130:
            r6 = 0
            r12 = 0
            if (r7 == 0) goto L_0x0151
            java.util.Iterator r4 = r7.iterator()
        L_0x0138:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0151
            java.lang.Object r5 = r4.next()
            i1.j r5 = (i1.C2068j) r5
            j1.o r7 = a(r5, r6, r3, r12)
            r5.w1(r3, r6, r7)
            r7.b(r3)
            r6 = 0
            r12 = 0
            goto L_0x0138
        L_0x0151:
            i1.d$a r4 = i1.C2062d.a.LEFT
            i1.d r4 = r0.q(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x0179
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x0165:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0179
            java.lang.Object r5 = r4.next()
            i1.d r5 = (i1.C2062d) r5
            i1.e r5 = r5.f21847d
            r6 = 0
            r7 = 0
            a(r5, r6, r3, r7)
            goto L_0x0165
        L_0x0179:
            i1.d$a r4 = i1.C2062d.a.RIGHT
            i1.d r4 = r0.q(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x01a1
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x018d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01a1
            java.lang.Object r5 = r4.next()
            i1.d r5 = (i1.C2062d) r5
            i1.e r5 = r5.f21847d
            r6 = 0
            r7 = 0
            a(r5, r6, r3, r7)
            goto L_0x018d
        L_0x01a1:
            i1.d$a r4 = i1.C2062d.a.CENTER
            i1.d r4 = r0.q(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x01c9
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x01b5:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01c9
            java.lang.Object r5 = r4.next()
            i1.d r5 = (i1.C2062d) r5
            i1.e r5 = r5.f21847d
            r6 = 0
            r7 = 0
            a(r5, r6, r3, r7)
            goto L_0x01b5
        L_0x01c9:
            r6 = 0
            r7 = 0
            if (r10 == 0) goto L_0x01e1
            java.util.Iterator r4 = r10.iterator()
        L_0x01d1:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01e1
            java.lang.Object r5 = r4.next()
            i1.e r5 = (i1.C2063e) r5
            a(r5, r6, r3, r7)
            goto L_0x01d1
        L_0x01e1:
            if (r8 == 0) goto L_0x01f8
            java.util.Iterator r4 = r8.iterator()
        L_0x01e7:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01f8
            java.lang.Object r5 = r4.next()
            i1.h r5 = (i1.C2066h) r5
            r6 = 1
            a(r5, r6, r3, r7)
            goto L_0x01e7
        L_0x01f8:
            r6 = 1
            if (r9 == 0) goto L_0x0218
            java.util.Iterator r4 = r9.iterator()
        L_0x01ff:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0218
            java.lang.Object r5 = r4.next()
            i1.j r5 = (i1.C2068j) r5
            j1.o r8 = a(r5, r6, r3, r7)
            r5.w1(r3, r6, r8)
            r8.b(r3)
            r6 = 1
            r7 = 0
            goto L_0x01ff
        L_0x0218:
            i1.d$a r4 = i1.C2062d.a.TOP
            i1.d r4 = r0.q(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x0240
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x022c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0240
            java.lang.Object r5 = r4.next()
            i1.d r5 = (i1.C2062d) r5
            i1.e r5 = r5.f21847d
            r6 = 0
            r7 = 1
            a(r5, r7, r3, r6)
            goto L_0x022c
        L_0x0240:
            i1.d$a r4 = i1.C2062d.a.BASELINE
            i1.d r4 = r0.q(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x0268
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x0254:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0268
            java.lang.Object r5 = r4.next()
            i1.d r5 = (i1.C2062d) r5
            i1.e r5 = r5.f21847d
            r6 = 0
            r7 = 1
            a(r5, r7, r3, r6)
            goto L_0x0254
        L_0x0268:
            i1.d$a r4 = i1.C2062d.a.BOTTOM
            i1.d r4 = r0.q(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x0290
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x027c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0290
            java.lang.Object r5 = r4.next()
            i1.d r5 = (i1.C2062d) r5
            i1.e r5 = r5.f21847d
            r6 = 0
            r7 = 1
            a(r5, r7, r3, r6)
            goto L_0x027c
        L_0x0290:
            i1.d$a r4 = i1.C2062d.a.CENTER
            i1.d r4 = r0.q(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x02b8
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x02a4:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02b8
            java.lang.Object r5 = r4.next()
            i1.d r5 = (i1.C2062d) r5
            i1.e r5 = r5.f21847d
            r6 = 1
            r12 = 0
            a(r5, r6, r3, r12)
            goto L_0x02a4
        L_0x02b8:
            r6 = 1
            r12 = 0
            if (r11 == 0) goto L_0x02d0
            java.util.Iterator r4 = r11.iterator()
        L_0x02c0:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02d0
            java.lang.Object r5 = r4.next()
            i1.e r5 = (i1.C2063e) r5
            a(r5, r6, r3, r12)
            goto L_0x02c0
        L_0x02d0:
            r4 = 0
        L_0x02d1:
            if (r4 >= r2) goto L_0x02fd
            java.lang.Object r5 = r1.get(r4)
            i1.e r5 = (i1.C2063e) r5
            boolean r6 = r5.u0()
            if (r6 == 0) goto L_0x02fa
            int r6 = r5.f21901S0
            j1.o r6 = b(r3, r6)
            int r5 = r5.f21903T0
            j1.o r5 = b(r3, r5)
            if (r6 == 0) goto L_0x02fa
            if (r5 == 0) goto L_0x02fa
            r7 = 0
            r6.g(r7, r5)
            r7 = 2
            r5.i(r7)
            r3.remove(r6)
        L_0x02fa:
            int r4 = r4 + 1
            goto L_0x02d1
        L_0x02fd:
            int r1 = r3.size()
            r2 = 1
            if (r1 > r2) goto L_0x0306
            r1 = 0
            return r1
        L_0x0306:
            i1.e$b r1 = r16.C()
            i1.e$b r2 = i1.C2063e.b.WRAP_CONTENT
            if (r1 != r2) goto L_0x0348
            java.util.Iterator r1 = r3.iterator()
            r2 = r12
            r6 = 0
        L_0x0314:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0339
            java.lang.Object r4 = r1.next()
            j1.o r4 = (j1.o) r4
            int r5 = r4.d()
            r7 = 1
            if (r5 != r7) goto L_0x0328
            goto L_0x0314
        L_0x0328:
            r5 = 0
            r4.h(r5)
            f1.d r7 = r16.Q1()
            int r7 = r4.f(r7, r5)
            if (r7 <= r6) goto L_0x0314
            r2 = r4
            r6 = r7
            goto L_0x0314
        L_0x0339:
            if (r2 == 0) goto L_0x0348
            i1.e$b r1 = i1.C2063e.b.FIXED
            r0.U0(r1)
            r0.p1(r6)
            r1 = 1
            r2.h(r1)
            goto L_0x0349
        L_0x0348:
            r2 = r12
        L_0x0349:
            i1.e$b r1 = r16.V()
            i1.e$b r4 = i1.C2063e.b.WRAP_CONTENT
            if (r1 != r4) goto L_0x038d
            java.util.Iterator r1 = r3.iterator()
            r3 = r12
            r6 = 0
        L_0x0357:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x037c
            java.lang.Object r4 = r1.next()
            j1.o r4 = (j1.o) r4
            int r5 = r4.d()
            if (r5 != 0) goto L_0x036a
            goto L_0x0357
        L_0x036a:
            r5 = 0
            r4.h(r5)
            f1.d r7 = r16.Q1()
            r8 = 1
            int r7 = r4.f(r7, r8)
            if (r7 <= r6) goto L_0x0357
            r3 = r4
            r6 = r7
            goto L_0x0357
        L_0x037c:
            r5 = 0
            r8 = 1
            if (r3 == 0) goto L_0x038f
            i1.e$b r1 = i1.C2063e.b.FIXED
            r0.l1(r1)
            r0.Q0(r6)
            r3.h(r8)
            r4 = r3
            goto L_0x0390
        L_0x038d:
            r5 = 0
            r8 = 1
        L_0x038f:
            r4 = r12
        L_0x0390:
            if (r2 != 0) goto L_0x0397
            if (r4 == 0) goto L_0x0395
            goto L_0x0397
        L_0x0395:
            r3 = r5
            goto L_0x0398
        L_0x0397:
            r3 = r8
        L_0x0398:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.i.c(i1.f, j1.b$b):boolean");
    }

    public static boolean d(C2063e.b bVar, C2063e.b bVar2, C2063e.b bVar3, C2063e.b bVar4) {
        boolean z10;
        boolean z11;
        C2063e.b bVar5;
        C2063e.b bVar6;
        C2063e.b bVar7 = C2063e.b.FIXED;
        if (bVar3 == bVar7 || bVar3 == (bVar6 = C2063e.b.WRAP_CONTENT) || (bVar3 == C2063e.b.MATCH_PARENT && bVar != bVar6)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (bVar4 == bVar7 || bVar4 == (bVar5 = C2063e.b.WRAP_CONTENT) || (bVar4 == C2063e.b.MATCH_PARENT && bVar2 != bVar5)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 || z11) {
            return true;
        }
        return false;
    }
}
