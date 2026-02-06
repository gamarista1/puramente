package i1;

import f1.d;
import java.util.ArrayList;

/* renamed from: i1.b  reason: case insensitive filesystem */
public abstract class C2060b {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: i1.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: f1.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: f1.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: i1.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: f1.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: i1.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: f1.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: i1.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: i1.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v39, resolved type: f1.i} */
    /* JADX WARNING: type inference failed for: r5v10, types: [f1.i] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r7 == 2) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        if (r7 == 2) goto L_0x0033;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0261 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02bf A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x03a7  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x03bc  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x049e  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x04dc A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x04e8  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x04f4  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x04f7  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x04fd  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0500  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0504  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x0514  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0518 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x03a9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:328:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(i1.C2064f r37, f1.d r38, int r39, int r40, i1.C2061c r41) {
        /*
            r0 = r37
            r9 = r38
            r10 = r39
            r1 = r41
            i1.e r11 = r1.f21822a
            i1.e r12 = r1.f21824c
            i1.e r13 = r1.f21823b
            i1.e r14 = r1.f21825d
            i1.e r2 = r1.f21826e
            float r3 = r1.f21832k
            i1.e$b[] r4 = r0.f21913b0
            r4 = r4[r10]
            i1.e$b r5 = i1.C2063e.b.WRAP_CONTENT
            r15 = 1
            if (r4 != r5) goto L_0x001f
            r4 = r15
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            r5 = 2
            if (r10 != 0) goto L_0x003d
            int r7 = r2.f21883J0
            if (r7 != 0) goto L_0x0029
            r8 = r15
            goto L_0x002a
        L_0x0029:
            r8 = 0
        L_0x002a:
            if (r7 != r15) goto L_0x002f
            r16 = r15
            goto L_0x0031
        L_0x002f:
            r16 = 0
        L_0x0031:
            if (r7 != r5) goto L_0x0035
        L_0x0033:
            r5 = r15
            goto L_0x0036
        L_0x0035:
            r5 = 0
        L_0x0036:
            r17 = r16
            r7 = 0
            r16 = r8
            r8 = r11
            goto L_0x004e
        L_0x003d:
            int r7 = r2.f21885K0
            if (r7 != 0) goto L_0x0043
            r8 = r15
            goto L_0x0044
        L_0x0043:
            r8 = 0
        L_0x0044:
            if (r7 != r15) goto L_0x0049
            r16 = r15
            goto L_0x004b
        L_0x0049:
            r16 = 0
        L_0x004b:
            if (r7 != r5) goto L_0x0035
            goto L_0x0033
        L_0x004e:
            r21 = 0
            if (r7 != 0) goto L_0x0130
            i1.d[] r6 = r8.f21908Y
            r6 = r6[r40]
            if (r5 == 0) goto L_0x005b
            r19 = 1
            goto L_0x005d
        L_0x005b:
            r19 = 4
        L_0x005d:
            int r23 = r6.f()
            i1.e$b[] r15 = r8.f21913b0
            r15 = r15[r10]
            r25 = r3
            i1.e$b r3 = i1.C2063e.b.MATCH_CONSTRAINT
            if (r15 != r3) goto L_0x0075
            int[] r15 = r8.f21958y
            r15 = r15[r10]
            if (r15 != 0) goto L_0x0075
            r26 = r7
            r15 = 1
            goto L_0x0078
        L_0x0075:
            r26 = r7
            r15 = 0
        L_0x0078:
            i1.d r7 = r6.f21849f
            if (r7 == 0) goto L_0x0084
            if (r8 == r11) goto L_0x0084
            int r7 = r7.f()
            int r23 = r23 + r7
        L_0x0084:
            r7 = r23
            if (r5 == 0) goto L_0x0091
            if (r8 == r11) goto L_0x0091
            if (r8 == r13) goto L_0x0091
            r23 = r2
            r19 = 8
            goto L_0x0093
        L_0x0091:
            r23 = r2
        L_0x0093:
            i1.d r2 = r6.f21849f
            if (r2 == 0) goto L_0x00cd
            if (r8 != r13) goto L_0x00a4
            r27 = r11
            f1.i r11 = r6.f21852i
            f1.i r2 = r2.f21852i
            r1 = 6
            r9.h(r11, r2, r7, r1)
            goto L_0x00af
        L_0x00a4:
            r27 = r11
            f1.i r1 = r6.f21852i
            f1.i r2 = r2.f21852i
            r11 = 8
            r9.h(r1, r2, r7, r11)
        L_0x00af:
            if (r15 == 0) goto L_0x00b5
            if (r5 != 0) goto L_0x00b5
            r19 = 5
        L_0x00b5:
            if (r8 != r13) goto L_0x00c1
            if (r5 == 0) goto L_0x00c1
            boolean r1 = r8.j0(r10)
            if (r1 == 0) goto L_0x00c1
            r1 = 5
            goto L_0x00c3
        L_0x00c1:
            r1 = r19
        L_0x00c3:
            f1.i r2 = r6.f21852i
            i1.d r6 = r6.f21849f
            f1.i r6 = r6.f21852i
            r9.e(r2, r6, r7, r1)
            goto L_0x00cf
        L_0x00cd:
            r27 = r11
        L_0x00cf:
            if (r4 == 0) goto L_0x0103
            int r1 = r8.X()
            r2 = 8
            if (r1 == r2) goto L_0x00f1
            i1.e$b[] r1 = r8.f21913b0
            r1 = r1[r10]
            if (r1 != r3) goto L_0x00f1
            i1.d[] r1 = r8.f21908Y
            int r2 = r40 + 1
            r2 = r1[r2]
            f1.i r2 = r2.f21852i
            r1 = r1[r40]
            f1.i r1 = r1.f21852i
            r3 = 0
            r6 = 5
            r9.h(r2, r1, r3, r6)
            goto L_0x00f2
        L_0x00f1:
            r3 = 0
        L_0x00f2:
            i1.d[] r1 = r8.f21908Y
            r1 = r1[r40]
            f1.i r1 = r1.f21852i
            i1.d[] r2 = r0.f21908Y
            r2 = r2[r40]
            f1.i r2 = r2.f21852i
            r6 = 8
            r9.h(r1, r2, r3, r6)
        L_0x0103:
            i1.d[] r1 = r8.f21908Y
            int r2 = r40 + 1
            r1 = r1[r2]
            i1.d r1 = r1.f21849f
            if (r1 == 0) goto L_0x011e
            i1.e r1 = r1.f21847d
            i1.d[] r2 = r1.f21908Y
            r2 = r2[r40]
            i1.d r2 = r2.f21849f
            if (r2 == 0) goto L_0x011e
            i1.e r2 = r2.f21847d
            if (r2 == r8) goto L_0x011c
            goto L_0x011e
        L_0x011c:
            r21 = r1
        L_0x011e:
            if (r21 == 0) goto L_0x0125
            r8 = r21
            r7 = r26
            goto L_0x0126
        L_0x0125:
            r7 = 1
        L_0x0126:
            r1 = r41
            r2 = r23
            r3 = r25
            r11 = r27
            goto L_0x004e
        L_0x0130:
            r23 = r2
            r25 = r3
            r27 = r11
            if (r14 == 0) goto L_0x0194
            i1.d[] r1 = r12.f21908Y
            int r2 = r40 + 1
            r1 = r1[r2]
            i1.d r1 = r1.f21849f
            if (r1 == 0) goto L_0x0194
            i1.d[] r1 = r14.f21908Y
            r1 = r1[r2]
            i1.e$b[] r3 = r14.f21913b0
            r3 = r3[r10]
            i1.e$b r6 = i1.C2063e.b.MATCH_CONSTRAINT
            if (r3 != r6) goto L_0x016a
            int[] r3 = r14.f21958y
            r3 = r3[r10]
            if (r3 != 0) goto L_0x016a
            if (r5 != 0) goto L_0x016a
            i1.d r3 = r1.f21849f
            i1.e r6 = r3.f21847d
            if (r6 != r0) goto L_0x016a
            f1.i r6 = r1.f21852i
            f1.i r3 = r3.f21852i
            int r7 = r1.f()
            int r7 = -r7
            r8 = 5
            r9.e(r6, r3, r7, r8)
            goto L_0x0180
        L_0x016a:
            r8 = 5
            if (r5 == 0) goto L_0x0180
            i1.d r3 = r1.f21849f
            i1.e r6 = r3.f21847d
            if (r6 != r0) goto L_0x0180
            f1.i r6 = r1.f21852i
            f1.i r3 = r3.f21852i
            int r7 = r1.f()
            int r7 = -r7
            r11 = 4
            r9.e(r6, r3, r7, r11)
        L_0x0180:
            f1.i r3 = r1.f21852i
            i1.d[] r6 = r12.f21908Y
            r2 = r6[r2]
            i1.d r2 = r2.f21849f
            f1.i r2 = r2.f21852i
            int r1 = r1.f()
            int r1 = -r1
            r6 = 6
            r9.j(r3, r2, r1, r6)
            goto L_0x0195
        L_0x0194:
            r8 = 5
        L_0x0195:
            if (r4 == 0) goto L_0x01ae
            i1.d[] r0 = r0.f21908Y
            int r1 = r40 + 1
            r0 = r0[r1]
            f1.i r0 = r0.f21852i
            i1.d[] r2 = r12.f21908Y
            r1 = r2[r1]
            f1.i r2 = r1.f21852i
            int r1 = r1.f()
            r3 = 8
            r9.h(r0, r2, r1, r3)
        L_0x01ae:
            r0 = r41
            java.util.ArrayList r1 = r0.f21829h
            if (r1 == 0) goto L_0x025f
            int r2 = r1.size()
            r3 = 1
            if (r2 <= r3) goto L_0x025f
            boolean r3 = r0.f21839r
            if (r3 == 0) goto L_0x01c7
            boolean r3 = r0.f21841t
            if (r3 != 0) goto L_0x01c7
            int r3 = r0.f21831j
            float r3 = (float) r3
            goto L_0x01c9
        L_0x01c7:
            r3 = r25
        L_0x01c9:
            r4 = 0
            r29 = r4
            r7 = r21
            r6 = 0
        L_0x01cf:
            if (r6 >= r2) goto L_0x025f
            java.lang.Object r11 = r1.get(r6)
            i1.e r11 = (i1.C2063e) r11
            float[] r15 = r11.f21891N0
            r15 = r15[r10]
            int r20 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r20 >= 0) goto L_0x01fb
            boolean r15 = r0.f21841t
            if (r15 == 0) goto L_0x01f6
            i1.d[] r11 = r11.f21908Y
            int r15 = r40 + 1
            r15 = r11[r15]
            f1.i r15 = r15.f21852i
            r11 = r11[r40]
            f1.i r11 = r11.f21852i
            r4 = 4
            r8 = 0
            r9.e(r15, r11, r8, r4)
            r4 = r8
            goto L_0x0213
        L_0x01f6:
            r4 = 4
            r15 = 1065353216(0x3f800000, float:1.0)
        L_0x01f9:
            r8 = 0
            goto L_0x01fd
        L_0x01fb:
            r4 = 4
            goto L_0x01f9
        L_0x01fd:
            int r19 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r19 != 0) goto L_0x0218
            i1.d[] r11 = r11.f21908Y
            int r15 = r40 + 1
            r15 = r11[r15]
            f1.i r15 = r15.f21852i
            r11 = r11[r40]
            f1.i r11 = r11.f21852i
            r4 = 0
            r8 = 8
            r9.e(r15, r11, r4, r8)
        L_0x0213:
            r25 = r1
            r18 = r2
            goto L_0x0255
        L_0x0218:
            r4 = 0
            if (r7 == 0) goto L_0x024e
            i1.d[] r7 = r7.f21908Y
            r8 = r7[r40]
            f1.i r8 = r8.f21852i
            int r18 = r40 + 1
            r7 = r7[r18]
            f1.i r7 = r7.f21852i
            i1.d[] r4 = r11.f21908Y
            r25 = r1
            r1 = r4[r40]
            f1.i r1 = r1.f21852i
            r4 = r4[r18]
            f1.i r4 = r4.f21852i
            r18 = r2
            f1.b r2 = r38.r()
            r28 = r2
            r30 = r3
            r31 = r15
            r32 = r8
            r33 = r7
            r34 = r1
            r35 = r4
            r28.l(r29, r30, r31, r32, r33, r34, r35)
            r9.d(r2)
            goto L_0x0252
        L_0x024e:
            r25 = r1
            r18 = r2
        L_0x0252:
            r7 = r11
            r29 = r15
        L_0x0255:
            int r6 = r6 + 1
            r2 = r18
            r1 = r25
            r4 = 0
            r8 = 5
            goto L_0x01cf
        L_0x025f:
            if (r13 == 0) goto L_0x0268
            if (r13 == r14) goto L_0x0265
            if (r5 == 0) goto L_0x0268
        L_0x0265:
            r11 = r27
            goto L_0x026b
        L_0x0268:
            r11 = r27
            goto L_0x02bd
        L_0x026b:
            i1.d[] r0 = r11.f21908Y
            r0 = r0[r40]
            i1.d[] r1 = r12.f21908Y
            int r2 = r40 + 1
            r1 = r1[r2]
            i1.d r0 = r0.f21849f
            if (r0 == 0) goto L_0x027d
            f1.i r0 = r0.f21852i
            r3 = r0
            goto L_0x027f
        L_0x027d:
            r3 = r21
        L_0x027f:
            i1.d r0 = r1.f21849f
            if (r0 == 0) goto L_0x0287
            f1.i r0 = r0.f21852i
            r5 = r0
            goto L_0x0289
        L_0x0287:
            r5 = r21
        L_0x0289:
            i1.d[] r0 = r13.f21908Y
            r0 = r0[r40]
            if (r14 == 0) goto L_0x0293
            i1.d[] r1 = r14.f21908Y
            r1 = r1[r2]
        L_0x0293:
            if (r3 == 0) goto L_0x04da
            if (r5 == 0) goto L_0x04da
            if (r10 != 0) goto L_0x029f
            r2 = r23
            float r2 = r2.f21943q0
        L_0x029d:
            r4 = r2
            goto L_0x02a4
        L_0x029f:
            r2 = r23
            float r2 = r2.f21945r0
            goto L_0x029d
        L_0x02a4:
            int r6 = r0.f()
            int r7 = r1.f()
            f1.i r2 = r0.f21852i
            f1.i r8 = r1.f21852i
            r10 = 7
            r0 = r38
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04da
        L_0x02bd:
            if (r16 == 0) goto L_0x03ae
            if (r13 == 0) goto L_0x03ae
            int r1 = r0.f21831j
            if (r1 <= 0) goto L_0x02cc
            int r0 = r0.f21830i
            if (r0 != r1) goto L_0x02cc
            r24 = 1
            goto L_0x02ce
        L_0x02cc:
            r24 = 0
        L_0x02ce:
            r8 = r13
            r15 = r8
        L_0x02d0:
            if (r15 == 0) goto L_0x04da
            i1.e[] r0 = r15.f21895P0
            r0 = r0[r10]
            r7 = r0
        L_0x02d7:
            if (r7 == 0) goto L_0x02e6
            int r0 = r7.X()
            r6 = 8
            if (r0 != r6) goto L_0x02e8
            i1.e[] r0 = r7.f21895P0
            r7 = r0[r10]
            goto L_0x02d7
        L_0x02e6:
            r6 = 8
        L_0x02e8:
            if (r7 != 0) goto L_0x02f5
            if (r15 != r14) goto L_0x02ed
            goto L_0x02f5
        L_0x02ed:
            r22 = r7
        L_0x02ef:
            r18 = r8
            r20 = 5
            goto L_0x039e
        L_0x02f5:
            i1.d[] r0 = r15.f21908Y
            r0 = r0[r40]
            f1.i r1 = r0.f21852i
            i1.d r2 = r0.f21849f
            if (r2 == 0) goto L_0x0302
            f1.i r2 = r2.f21852i
            goto L_0x0304
        L_0x0302:
            r2 = r21
        L_0x0304:
            if (r8 == r15) goto L_0x030f
            i1.d[] r2 = r8.f21908Y
            int r3 = r40 + 1
            r2 = r2[r3]
            f1.i r2 = r2.f21852i
            goto L_0x031e
        L_0x030f:
            if (r15 != r13) goto L_0x031e
            i1.d[] r2 = r11.f21908Y
            r2 = r2[r40]
            i1.d r2 = r2.f21849f
            if (r2 == 0) goto L_0x031c
            f1.i r2 = r2.f21852i
            goto L_0x031e
        L_0x031c:
            r2 = r21
        L_0x031e:
            int r0 = r0.f()
            i1.d[] r3 = r15.f21908Y
            int r4 = r40 + 1
            r3 = r3[r4]
            int r3 = r3.f()
            if (r7 == 0) goto L_0x0337
            i1.d[] r5 = r7.f21908Y
            r5 = r5[r40]
            f1.i r6 = r5.f21852i
        L_0x0334:
            r37 = r7
            goto L_0x0346
        L_0x0337:
            i1.d[] r5 = r12.f21908Y
            r5 = r5[r4]
            i1.d r5 = r5.f21849f
            if (r5 == 0) goto L_0x0342
            f1.i r6 = r5.f21852i
            goto L_0x0334
        L_0x0342:
            r37 = r7
            r6 = r21
        L_0x0346:
            i1.d[] r7 = r15.f21908Y
            r7 = r7[r4]
            f1.i r7 = r7.f21852i
            if (r5 == 0) goto L_0x0353
            int r5 = r5.f()
            int r3 = r3 + r5
        L_0x0353:
            i1.d[] r5 = r8.f21908Y
            r5 = r5[r4]
            int r5 = r5.f()
            int r0 = r0 + r5
            if (r1 == 0) goto L_0x039a
            if (r2 == 0) goto L_0x039a
            if (r6 == 0) goto L_0x039a
            if (r7 == 0) goto L_0x039a
            if (r15 != r13) goto L_0x036e
            i1.d[] r0 = r13.f21908Y
            r0 = r0[r40]
            int r0 = r0.f()
        L_0x036e:
            r5 = r0
            if (r15 != r14) goto L_0x037c
            i1.d[] r0 = r14.f21908Y
            r0 = r0[r4]
            int r0 = r0.f()
            r18 = r0
            goto L_0x037e
        L_0x037c:
            r18 = r3
        L_0x037e:
            if (r24 == 0) goto L_0x0383
            r19 = 8
            goto L_0x0385
        L_0x0383:
            r19 = 5
        L_0x0385:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r3 = r5
            r5 = r6
            r20 = 5
            r6 = r7
            r22 = r37
            r7 = r18
            r18 = r8
            r8 = r19
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x039e
        L_0x039a:
            r22 = r37
            goto L_0x02ef
        L_0x039e:
            int r0 = r15.X()
            r8 = 8
            if (r0 == r8) goto L_0x03a7
            goto L_0x03a9
        L_0x03a7:
            r15 = r18
        L_0x03a9:
            r8 = r15
            r15 = r22
            goto L_0x02d0
        L_0x03ae:
            r8 = 8
            if (r17 == 0) goto L_0x04da
            if (r13 == 0) goto L_0x04da
            int r1 = r0.f21831j
            if (r1 <= 0) goto L_0x03bf
            int r0 = r0.f21830i
            if (r0 != r1) goto L_0x03bf
            r24 = 1
            goto L_0x03c1
        L_0x03bf:
            r24 = 0
        L_0x03c1:
            r7 = r13
            r15 = r7
        L_0x03c3:
            if (r15 == 0) goto L_0x0485
            i1.e[] r0 = r15.f21895P0
            r0 = r0[r10]
        L_0x03c9:
            if (r0 == 0) goto L_0x03d6
            int r1 = r0.X()
            if (r1 != r8) goto L_0x03d6
            i1.e[] r0 = r0.f21895P0
            r0 = r0[r10]
            goto L_0x03c9
        L_0x03d6:
            if (r15 == r13) goto L_0x0470
            if (r15 == r14) goto L_0x0470
            if (r0 == 0) goto L_0x0470
            if (r0 != r14) goto L_0x03e1
            r6 = r21
            goto L_0x03e2
        L_0x03e1:
            r6 = r0
        L_0x03e2:
            i1.d[] r0 = r15.f21908Y
            r0 = r0[r40]
            f1.i r1 = r0.f21852i
            i1.d r2 = r0.f21849f
            if (r2 == 0) goto L_0x03ee
            f1.i r2 = r2.f21852i
        L_0x03ee:
            i1.d[] r2 = r7.f21908Y
            int r3 = r40 + 1
            r2 = r2[r3]
            f1.i r2 = r2.f21852i
            int r0 = r0.f()
            i1.d[] r4 = r15.f21908Y
            r4 = r4[r3]
            int r4 = r4.f()
            if (r6 == 0) goto L_0x041b
            i1.d[] r5 = r6.f21908Y
            r5 = r5[r40]
            f1.i r8 = r5.f21852i
            r37 = r6
            i1.d r6 = r5.f21849f
            if (r6 == 0) goto L_0x0413
            f1.i r6 = r6.f21852i
            goto L_0x0415
        L_0x0413:
            r6 = r21
        L_0x0415:
            r36 = r8
            r8 = r6
            r6 = r36
            goto L_0x042e
        L_0x041b:
            r37 = r6
            i1.d[] r5 = r14.f21908Y
            r5 = r5[r40]
            if (r5 == 0) goto L_0x0426
            f1.i r6 = r5.f21852i
            goto L_0x0428
        L_0x0426:
            r6 = r21
        L_0x0428:
            i1.d[] r8 = r15.f21908Y
            r8 = r8[r3]
            f1.i r8 = r8.f21852i
        L_0x042e:
            if (r5 == 0) goto L_0x0435
            int r5 = r5.f()
            int r4 = r4 + r5
        L_0x0435:
            r18 = r4
            i1.d[] r4 = r7.f21908Y
            r3 = r4[r3]
            int r3 = r3.f()
            int r3 = r3 + r0
            if (r24 == 0) goto L_0x0445
            r20 = 8
            goto L_0x0447
        L_0x0445:
            r20 = 4
        L_0x0447:
            if (r1 == 0) goto L_0x0465
            if (r2 == 0) goto L_0x0465
            if (r6 == 0) goto L_0x0465
            if (r8 == 0) goto L_0x0465
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r19 = 4
            r5 = r6
            r22 = r37
            r6 = r8
            r23 = r7
            r7 = r18
            r10 = 8
            r8 = r20
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x046d
        L_0x0465:
            r22 = r37
            r23 = r7
            r10 = 8
            r19 = 4
        L_0x046d:
            r0 = r22
            goto L_0x0475
        L_0x0470:
            r23 = r7
            r10 = r8
            r19 = 4
        L_0x0475:
            int r1 = r15.X()
            if (r1 == r10) goto L_0x047d
            r7 = r15
            goto L_0x047f
        L_0x047d:
            r7 = r23
        L_0x047f:
            r15 = r0
            r8 = r10
            r10 = r39
            goto L_0x03c3
        L_0x0485:
            i1.d[] r0 = r13.f21908Y
            r0 = r0[r40]
            i1.d[] r1 = r11.f21908Y
            r1 = r1[r40]
            i1.d r1 = r1.f21849f
            i1.d[] r2 = r14.f21908Y
            int r3 = r40 + 1
            r10 = r2[r3]
            i1.d[] r2 = r12.f21908Y
            r2 = r2[r3]
            i1.d r11 = r2.f21849f
            r15 = 5
            if (r1 == 0) goto L_0x04ca
            if (r13 == r14) goto L_0x04ac
            f1.i r2 = r0.f21852i
            f1.i r1 = r1.f21852i
            int r0 = r0.f()
            r9.e(r2, r1, r0, r15)
            goto L_0x04ca
        L_0x04ac:
            if (r11 == 0) goto L_0x04ca
            f1.i r2 = r0.f21852i
            f1.i r3 = r1.f21852i
            int r4 = r0.f()
            f1.i r5 = r10.f21852i
            f1.i r6 = r11.f21852i
            int r7 = r10.f()
            r8 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r8
            r8 = r15
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x04ca:
            if (r11 == 0) goto L_0x04da
            if (r13 == r14) goto L_0x04da
            f1.i r0 = r10.f21852i
            f1.i r1 = r11.f21852i
            int r2 = r10.f()
            int r2 = -r2
            r9.e(r0, r1, r2, r15)
        L_0x04da:
            if (r16 != 0) goto L_0x04de
            if (r17 == 0) goto L_0x0537
        L_0x04de:
            if (r13 == 0) goto L_0x0537
            if (r13 == r14) goto L_0x0537
            i1.d[] r0 = r13.f21908Y
            r1 = r0[r40]
            if (r14 != 0) goto L_0x04e9
            r14 = r13
        L_0x04e9:
            i1.d[] r2 = r14.f21908Y
            r3 = 1
            int r3 = r40 + 1
            r2 = r2[r3]
            i1.d r4 = r1.f21849f
            if (r4 == 0) goto L_0x04f7
            f1.i r4 = r4.f21852i
            goto L_0x04f9
        L_0x04f7:
            r4 = r21
        L_0x04f9:
            i1.d r5 = r2.f21849f
            if (r5 == 0) goto L_0x0500
            f1.i r5 = r5.f21852i
            goto L_0x0502
        L_0x0500:
            r5 = r21
        L_0x0502:
            if (r12 == r14) goto L_0x0512
            i1.d[] r5 = r12.f21908Y
            r5 = r5[r3]
            i1.d r5 = r5.f21849f
            if (r5 == 0) goto L_0x0510
            f1.i r5 = r5.f21852i
            r21 = r5
        L_0x0510:
            r5 = r21
        L_0x0512:
            if (r13 != r14) goto L_0x0516
            r2 = r0[r3]
        L_0x0516:
            if (r4 == 0) goto L_0x0537
            if (r5 == 0) goto L_0x0537
            int r6 = r1.f()
            i1.d[] r0 = r14.f21908Y
            r0 = r0[r3]
            int r7 = r0.f()
            f1.i r1 = r1.f21852i
            f1.i r8 = r2.f21852i
            r10 = 5
            r11 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r2 = r4
            r3 = r6
            r4 = r11
            r6 = r8
            r8 = r10
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0537:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.C2060b.a(i1.f, f1.d, int, int, i1.c):void");
    }

    public static void b(C2064f fVar, d dVar, ArrayList arrayList, int i10) {
        int i11;
        C2061c[] cVarArr;
        int i12;
        if (i10 == 0) {
            i12 = fVar.f21978g1;
            cVarArr = fVar.f21981j1;
            i11 = 0;
        } else {
            i12 = fVar.f21979h1;
            cVarArr = fVar.f21980i1;
            i11 = 2;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            C2061c cVar = cVarArr[i13];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.f21822a)) {
                a(fVar, dVar, i10, i11, cVar);
            }
        }
    }
}
