package x0;

import r0.S1;

public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    private static final float[] f28154a = new float[0];

    private static final void a(S1 s12, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        double d19 = d12;
        double d20 = (double) 4;
        int ceil = (int) Math.ceil(Math.abs((d18 * d20) / 3.141592653589793d));
        double cos = Math.cos(d16);
        double sin = Math.sin(d16);
        double cos2 = Math.cos(d17);
        double sin2 = Math.sin(d17);
        double d21 = -d19;
        double d22 = d21 * cos;
        double d23 = d13 * sin;
        double d24 = (d22 * sin2) - (d23 * cos2);
        double d25 = d21 * sin;
        double d26 = d13 * cos;
        double d27 = (sin2 * d25) + (cos2 * d26);
        double d28 = d18 / ((double) ceil);
        double d29 = d14;
        double d30 = d27;
        double d31 = d24;
        int i10 = 0;
        double d32 = d15;
        double d33 = d17;
        while (i10 < ceil) {
            double d34 = d33 + d28;
            double sin3 = Math.sin(d34);
            double cos3 = Math.cos(d34);
            int i11 = ceil;
            double d35 = (d10 + ((d19 * cos) * cos3)) - (d23 * sin3);
            double d36 = d11 + (d19 * sin * cos3) + (d26 * sin3);
            double d37 = (d22 * sin3) - (d23 * cos3);
            double d38 = (sin3 * d25) + (cos3 * d26);
            double d39 = d34 - d33;
            double tan = Math.tan(d39 / ((double) 2));
            double d40 = d20;
            double sin4 = (Math.sin(d39) * (Math.sqrt(d20 + ((3.0d * tan) * tan)) - ((double) 1))) / ((double) 3);
            s12.q((float) (d29 + (d31 * sin4)), (float) (d32 + (d30 * sin4)), (float) (d35 - (sin4 * d37)), (float) (d36 - (sin4 * d38)), (float) d35, (float) d36);
            i10++;
            d28 = d28;
            sin = sin;
            d29 = d35;
            d25 = d25;
            d33 = d34;
            d30 = d38;
            d20 = d40;
            d31 = d37;
            cos = cos;
            ceil = i11;
            d32 = d36;
            d19 = d12;
        }
    }

    private static final void b(S1 s12, double d10, double d11, double d12, double d13, double d14, double d15, double d16, boolean z10, boolean z11) {
        double d17;
        double d18;
        boolean z12;
        double d19 = d10;
        double d20 = d12;
        boolean z13 = z11;
        double d21 = (d16 / ((double) 180)) * 3.141592653589793d;
        double cos = Math.cos(d21);
        double sin = Math.sin(d21);
        double d22 = ((d19 * cos) + (d11 * sin)) / d14;
        double d23 = (((-d19) * sin) + (d11 * cos)) / d15;
        double d24 = ((d20 * cos) + (d13 * sin)) / d14;
        double d25 = (((-d20) * sin) + (d13 * cos)) / d15;
        double d26 = d22 - d24;
        double d27 = d23 - d25;
        double d28 = (double) 2;
        double d29 = (d22 + d24) / d28;
        double d30 = (d23 + d25) / d28;
        double d31 = (d26 * d26) + (d27 * d27);
        if (d31 != 0.0d) {
            double d32 = (1.0d / d31) - 0.25d;
            if (d32 < 0.0d) {
                double sqrt = (double) ((float) (Math.sqrt(d31) / 1.99999d));
                b(s12, d10, d11, d12, d13, d14 * sqrt, d15 * sqrt, d16, z10, z11);
                return;
            }
            double sqrt2 = Math.sqrt(d32);
            double d33 = d26 * sqrt2;
            double d34 = sqrt2 * d27;
            boolean z14 = z11;
            if (z10 == z14) {
                d18 = d29 - d34;
                d17 = d30 + d33;
            } else {
                d18 = d29 + d34;
                d17 = d30 - d33;
            }
            double atan2 = Math.atan2(d23 - d17, d22 - d18);
            double atan22 = Math.atan2(d25 - d17, d24 - d18) - atan2;
            int i10 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (i10 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z14 != z12) {
                if (i10 > 0) {
                    atan22 -= 6.283185307179586d;
                } else {
                    atan22 += 6.283185307179586d;
                }
            }
            double d35 = atan22;
            double d36 = d18 * d14;
            double d37 = d17 * d15;
            a(s12, (d36 * cos) - (d37 * sin), (d36 * sin) + (d37 * cos), d14, d15, d10, d11, d21, atan2, d35);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: x0.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v45, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v48, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v49, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v52, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v58, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v37, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v65, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v69, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v72, resolved type: float} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final r0.S1 c(java.util.List r26, r0.S1 r27) {
        /*
            r0 = r26
            r14 = r27
            int r1 = r27.n()
            r27.o()
            r14.e(r1)
            boolean r1 = r26.isEmpty()
            r2 = 0
            if (r1 == 0) goto L_0x0018
            x0.h$b r1 = x0.C2895h.b.f28101c
            goto L_0x001e
        L_0x0018:
            java.lang.Object r1 = r0.get(r2)
            x0.h r1 = (x0.C2895h) r1
        L_0x001e:
            int r15 = r26.size()
            r12 = 0
            r13 = r2
            r2 = r12
            r3 = r2
            r8 = r3
            r9 = r8
            r18 = r9
            r19 = r18
        L_0x002c:
            if (r13 >= r15) goto L_0x0379
            java.lang.Object r4 = r0.get(r13)
            r10 = r4
            x0.h r10 = (x0.C2895h) r10
            boolean r4 = r10 instanceof x0.C2895h.b
            if (r4 == 0) goto L_0x004b
            r27.close()
            r0 = r10
            r22 = r12
            r23 = r13
            r24 = r15
            r2 = r18
            r8 = r2
            r3 = r19
            r9 = r3
            goto L_0x036c
        L_0x004b:
            boolean r4 = r10 instanceof x0.C2895h.n
            if (r4 == 0) goto L_0x0074
            r1 = r10
            x0.h$n r1 = (x0.C2895h.n) r1
            float r4 = r1.c()
            float r8 = r8 + r4
            float r4 = r1.d()
            float r9 = r9 + r4
            float r4 = r1.c()
            float r1 = r1.d()
            r14.c(r4, r1)
            r18 = r8
        L_0x0069:
            r19 = r9
        L_0x006b:
            r0 = r10
            r22 = r12
            r23 = r13
            r24 = r15
            goto L_0x036c
        L_0x0074:
            boolean r4 = r10 instanceof x0.C2895h.f
            if (r4 == 0) goto L_0x0093
            r1 = r10
            x0.h$f r1 = (x0.C2895h.f) r1
            float r4 = r1.c()
            float r5 = r1.d()
            float r6 = r1.c()
            float r1 = r1.d()
            r14.p(r6, r1)
            r8 = r4
            r18 = r8
            r9 = r5
            goto L_0x0069
        L_0x0093:
            boolean r4 = r10 instanceof x0.C2895h.m
            if (r4 == 0) goto L_0x00b0
            r1 = r10
            x0.h$m r1 = (x0.C2895h.m) r1
            float r4 = r1.c()
            float r5 = r1.d()
            r14.s(r4, r5)
            float r4 = r1.c()
            float r8 = r8 + r4
            float r1 = r1.d()
        L_0x00ae:
            float r9 = r9 + r1
            goto L_0x006b
        L_0x00b0:
            boolean r4 = r10 instanceof x0.C2895h.e
            if (r4 == 0) goto L_0x00cd
            r1 = r10
            x0.h$e r1 = (x0.C2895h.e) r1
            float r4 = r1.c()
            float r5 = r1.d()
            r14.t(r4, r5)
            float r4 = r1.c()
            float r1 = r1.d()
        L_0x00ca:
            r9 = r1
            r8 = r4
            goto L_0x006b
        L_0x00cd:
            boolean r4 = r10 instanceof x0.C2895h.l
            if (r4 == 0) goto L_0x00e1
            r1 = r10
            x0.h$l r1 = (x0.C2895h.l) r1
            float r4 = r1.c()
            r14.s(r4, r12)
            float r1 = r1.c()
            float r8 = r8 + r1
            goto L_0x006b
        L_0x00e1:
            boolean r4 = r10 instanceof x0.C2895h.d
            if (r4 == 0) goto L_0x00f6
            r1 = r10
            x0.h$d r1 = (x0.C2895h.d) r1
            float r4 = r1.c()
            r14.t(r4, r9)
            float r1 = r1.c()
            r8 = r1
            goto L_0x006b
        L_0x00f6:
            boolean r4 = r10 instanceof x0.C2895h.r
            if (r4 == 0) goto L_0x0109
            r1 = r10
            x0.h$r r1 = (x0.C2895h.r) r1
            float r4 = r1.c()
            r14.s(r12, r4)
            float r1 = r1.c()
            goto L_0x00ae
        L_0x0109:
            boolean r4 = r10 instanceof x0.C2895h.s
            if (r4 == 0) goto L_0x011e
            r1 = r10
            x0.h$s r1 = (x0.C2895h.s) r1
            float r4 = r1.c()
            r14.t(r8, r4)
            float r1 = r1.c()
            r9 = r1
            goto L_0x006b
        L_0x011e:
            boolean r4 = r10 instanceof x0.C2895h.k
            if (r4 == 0) goto L_0x0161
            r11 = r10
            x0.h$k r11 = (x0.C2895h.k) r11
            float r2 = r11.c()
            float r3 = r11.f()
            float r4 = r11.d()
            float r5 = r11.g()
            float r6 = r11.e()
            float r7 = r11.h()
            r1 = r27
            r1.d(r2, r3, r4, r5, r6, r7)
            float r1 = r11.d()
            float r1 = r1 + r8
            float r2 = r11.g()
            float r2 = r2 + r9
            float r3 = r11.e()
            float r8 = r8 + r3
            float r3 = r11.h()
        L_0x0155:
            float r9 = r9 + r3
            r3 = r2
            r0 = r10
            r22 = r12
            r23 = r13
            r24 = r15
        L_0x015e:
            r2 = r1
            goto L_0x036c
        L_0x0161:
            boolean r4 = r10 instanceof x0.C2895h.c
            if (r4 == 0) goto L_0x01a0
            r8 = r10
            x0.h$c r8 = (x0.C2895h.c) r8
            float r2 = r8.c()
            float r3 = r8.f()
            float r4 = r8.d()
            float r5 = r8.g()
            float r6 = r8.e()
            float r7 = r8.h()
            r1 = r27
            r1.q(r2, r3, r4, r5, r6, r7)
            float r1 = r8.d()
            float r2 = r8.g()
            float r3 = r8.e()
            float r4 = r8.h()
        L_0x0195:
            r8 = r3
            r9 = r4
            r0 = r10
            r22 = r12
            r23 = r13
            r24 = r15
            r3 = r2
            goto L_0x015e
        L_0x01a0:
            boolean r4 = r10 instanceof x0.C2895h.p
            if (r4 == 0) goto L_0x01e0
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x01b1
            float r1 = r8 - r2
            float r2 = r9 - r3
            r3 = r2
            r2 = r1
            goto L_0x01b3
        L_0x01b1:
            r2 = r12
            r3 = r2
        L_0x01b3:
            r11 = r10
            x0.h$p r11 = (x0.C2895h.p) r11
            float r4 = r11.c()
            float r5 = r11.e()
            float r6 = r11.d()
            float r7 = r11.f()
            r1 = r27
            r1.d(r2, r3, r4, r5, r6, r7)
            float r1 = r11.c()
            float r1 = r1 + r8
            float r2 = r11.e()
            float r2 = r2 + r9
            float r3 = r11.d()
            float r8 = r8 + r3
            float r3 = r11.f()
            goto L_0x0155
        L_0x01e0:
            boolean r4 = r10 instanceof x0.C2895h.C0470h
            r5 = 2
            if (r4 == 0) goto L_0x021f
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x01f3
            float r1 = (float) r5
            float r8 = r8 * r1
            float r8 = r8 - r2
            float r1 = r1 * r9
            float r1 = r1 - r3
            r3 = r1
            r2 = r8
            goto L_0x01f5
        L_0x01f3:
            r2 = r8
            r3 = r9
        L_0x01f5:
            r8 = r10
            x0.h$h r8 = (x0.C2895h.C0470h) r8
            float r4 = r8.c()
            float r5 = r8.e()
            float r6 = r8.d()
            float r7 = r8.f()
            r1 = r27
            r1.q(r2, r3, r4, r5, r6, r7)
            float r1 = r8.c()
            float r2 = r8.e()
            float r3 = r8.d()
            float r4 = r8.f()
            goto L_0x0195
        L_0x021f:
            boolean r4 = r10 instanceof x0.C2895h.o
            if (r4 == 0) goto L_0x024e
            r1 = r10
            x0.h$o r1 = (x0.C2895h.o) r1
            float r2 = r1.c()
            float r3 = r1.e()
            float r4 = r1.d()
            float r5 = r1.f()
            r14.k(r2, r3, r4, r5)
            float r2 = r1.c()
            float r2 = r2 + r8
            float r3 = r1.e()
            float r3 = r3 + r9
            float r4 = r1.d()
            float r8 = r8 + r4
            float r1 = r1.f()
            goto L_0x00ae
        L_0x024e:
            boolean r4 = r10 instanceof x0.C2895h.g
            if (r4 == 0) goto L_0x027a
            r1 = r10
            x0.h$g r1 = (x0.C2895h.g) r1
            float r2 = r1.c()
            float r3 = r1.e()
            float r4 = r1.d()
            float r5 = r1.f()
            r14.f(r2, r3, r4, r5)
            float r2 = r1.c()
            float r3 = r1.e()
            float r4 = r1.d()
            float r1 = r1.f()
            goto L_0x00ca
        L_0x027a:
            boolean r4 = r10 instanceof x0.C2895h.q
            if (r4 == 0) goto L_0x02a6
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x0289
            float r1 = r8 - r2
            float r2 = r9 - r3
            goto L_0x028b
        L_0x0289:
            r1 = r12
            r2 = r1
        L_0x028b:
            r3 = r10
            x0.h$q r3 = (x0.C2895h.q) r3
            float r4 = r3.c()
            float r5 = r3.d()
            r14.k(r1, r2, r4, r5)
            float r1 = r1 + r8
            float r2 = r2 + r9
            float r4 = r3.c()
            float r8 = r8 + r4
            float r3 = r3.d()
            goto L_0x0155
        L_0x02a6:
            boolean r4 = r10 instanceof x0.C2895h.i
            if (r4 == 0) goto L_0x02dc
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x02b6
            float r1 = (float) r5
            float r8 = r8 * r1
            float r8 = r8 - r2
            float r1 = r1 * r9
            float r9 = r1 - r3
        L_0x02b6:
            r1 = r10
            x0.h$i r1 = (x0.C2895h.i) r1
            float r2 = r1.c()
            float r3 = r1.d()
            r14.f(r8, r9, r2, r3)
            float r2 = r1.c()
            float r1 = r1.d()
            r3 = r9
            r0 = r10
            r22 = r12
            r23 = r13
            r24 = r15
            r9 = r1
            r25 = r8
            r8 = r2
            r2 = r25
            goto L_0x036c
        L_0x02dc:
            boolean r1 = r10 instanceof x0.C2895h.j
            if (r1 == 0) goto L_0x0329
            r1 = r10
            x0.h$j r1 = (x0.C2895h.j) r1
            float r2 = r1.c()
            float r11 = r2 + r8
            float r2 = r1.d()
            float r6 = r2 + r9
            double r2 = (double) r8
            double r4 = (double) r9
            double r7 = (double) r11
            r9 = r6
            r6 = r7
            r17 = r13
            double r12 = (double) r9
            r20 = r9
            r8 = r12
            float r12 = r1.e()
            double r12 = (double) r12
            r0 = r10
            r21 = r11
            r10 = r12
            float r12 = r1.g()
            double r12 = (double) r12
            r23 = r17
            r22 = 0
            float r14 = r1.f()
            r16 = r15
            double r14 = (double) r14
            r24 = r16
            boolean r16 = r1.h()
            boolean r17 = r1.i()
            r1 = r27
            b(r1, r2, r4, r6, r8, r10, r12, r14, r16, r17)
            r3 = r20
            r9 = r3
            r2 = r21
            r8 = r2
            goto L_0x036c
        L_0x0329:
            r0 = r10
            r22 = r12
            r23 = r13
            r24 = r15
            boolean r1 = r0 instanceof x0.C2895h.a
            if (r1 == 0) goto L_0x036c
            double r2 = (double) r8
            double r4 = (double) r9
            r20 = r0
            x0.h$a r20 = (x0.C2895h.a) r20
            float r1 = r20.c()
            double r6 = (double) r1
            float r1 = r20.d()
            double r8 = (double) r1
            float r1 = r20.e()
            double r10 = (double) r1
            float r1 = r20.g()
            double r12 = (double) r1
            float r1 = r20.f()
            double r14 = (double) r1
            boolean r16 = r20.h()
            boolean r17 = r20.i()
            r1 = r27
            b(r1, r2, r4, r6, r8, r10, r12, r14, r16, r17)
            float r1 = r20.c()
            float r2 = r20.d()
            r8 = r1
            r3 = r2
            r9 = r3
            r2 = r8
        L_0x036c:
            int r13 = r23 + 1
            r14 = r27
            r1 = r0
            r12 = r22
            r15 = r24
            r0 = r26
            goto L_0x002c
        L_0x0379:
            return r27
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.k.c(java.util.List, r0.S1):r0.S1");
    }
}
