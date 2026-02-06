package w;

/* renamed from: w.d0  reason: case insensitive filesystem */
public abstract class C2789d0 {
    public static final long a(double d10, double d11, double d12, double d13, double d14) {
        double sqrt = 2.0d * d11 * Math.sqrt(d10);
        double d15 = (sqrt * sqrt) - (4.0d * d10);
        double d16 = -sqrt;
        C2810v a10 = C2811w.a(d15);
        a10.f27631a = a10.f27631a + d16;
        a10.f27631a = a10.f27631a * 0.5d;
        a10.f27632b = a10.f27632b * 0.5d;
        C2810v a11 = C2811w.a(d15);
        double d17 = (double) -1;
        a11.f27631a = a11.f27631a * d17;
        a11.f27632b = a11.f27632b * d17;
        a11.f27631a = a11.f27631a + d16;
        a11.f27631a = a11.f27631a * 0.5d;
        a11.f27632b = a11.f27632b * 0.5d;
        return d(a10, a11, d11, d12, d13, d14);
    }

    public static final long b(float f10, float f11, float f12, float f13, float f14) {
        if (f11 == 0.0f) {
            return 9223372036854L;
        }
        return a((double) f10, (double) f11, (double) f12, (double) f13, (double) f14);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b1 A[LOOP:1: B:36:0x00a4->B:40:0x00b1, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final double c(w.C2810v r20, double r21, double r23, double r25) {
        /*
            r0 = r25
            double r2 = r20.f()
            double r4 = r2 * r21
            double r6 = r23 - r4
            double r8 = r0 / r21
            double r8 = java.lang.Math.abs(r8)
            double r8 = java.lang.Math.log(r8)
            double r8 = r8 / r2
            double r10 = r0 / r6
            double r10 = java.lang.Math.abs(r10)
            double r10 = java.lang.Math.log(r10)
            r14 = r10
            r13 = 0
        L_0x0021:
            r12 = 6
            if (r13 >= r12) goto L_0x0032
            double r14 = r14 / r2
            double r14 = java.lang.Math.abs(r14)
            double r14 = java.lang.Math.log(r14)
            double r14 = r10 - r14
            int r13 = r13 + 1
            goto L_0x0021
        L_0x0032:
            double r14 = r14 / r2
            boolean r10 = java.lang.Double.isInfinite(r8)
            r11 = 1
            if (r10 != 0) goto L_0x0042
            boolean r10 = java.lang.Double.isNaN(r8)
            if (r10 != 0) goto L_0x0042
            r10 = r11
            goto L_0x0043
        L_0x0042:
            r10 = 0
        L_0x0043:
            if (r10 != 0) goto L_0x0047
            r8 = r14
            goto L_0x005d
        L_0x0047:
            boolean r10 = java.lang.Double.isInfinite(r14)
            if (r10 != 0) goto L_0x0055
            boolean r10 = java.lang.Double.isNaN(r14)
            if (r10 != 0) goto L_0x0055
            r10 = r11
            goto L_0x0056
        L_0x0055:
            r10 = 0
        L_0x0056:
            if (r10 != 0) goto L_0x0059
            goto L_0x005d
        L_0x0059:
            double r8 = java.lang.Math.max(r8, r14)
        L_0x005d:
            double r12 = r4 + r6
            double r12 = -r12
            double r14 = r2 * r6
            double r12 = r12 / r14
            double r14 = r2 * r12
            double r16 = java.lang.Math.exp(r14)
            double r16 = r16 * r21
            double r18 = r6 * r12
            double r14 = java.lang.Math.exp(r14)
            double r18 = r18 * r14
            double r14 = r16 + r18
            boolean r10 = java.lang.Double.isNaN(r12)
            if (r10 != 0) goto L_0x0095
            r16 = 0
            int r10 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r10 > 0) goto L_0x0082
            goto L_0x0095
        L_0x0082:
            int r10 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r10 <= 0) goto L_0x0097
            double r12 = -r14
            int r10 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r10 >= 0) goto L_0x0097
            int r10 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r10 >= 0) goto L_0x0095
            int r10 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1))
            if (r10 <= 0) goto L_0x0095
            r8 = r16
        L_0x0095:
            double r0 = -r0
            goto L_0x009e
        L_0x0097:
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r8 = r8 / r2
            double r8 = -r8
            double r12 = r21 / r6
            double r8 = r8 - r12
        L_0x009e:
            r12 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r10 = 0
        L_0x00a4:
            r14 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 <= 0) goto L_0x00d7
            r12 = 100
            if (r10 >= r12) goto L_0x00d7
            int r10 = r10 + 1
            double r12 = r6 * r8
            double r12 = r21 + r12
            double r14 = r2 * r8
            double r16 = java.lang.Math.exp(r14)
            double r12 = r12 * r16
            double r12 = r12 + r0
            r23 = r0
            double r0 = (double) r11
            double r0 = r0 + r14
            double r0 = r0 * r6
            double r0 = r0 + r4
            double r14 = java.lang.Math.exp(r14)
            double r0 = r0 * r14
            double r12 = r12 / r0
            double r0 = r8 - r12
            double r8 = r8 - r0
            double r12 = java.lang.Math.abs(r8)
            r8 = r0
            r0 = r23
            goto L_0x00a4
        L_0x00d7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C2789d0.c(w.v, double, double, double):double");
    }

    private static final long d(C2810v vVar, C2810v vVar2, double d10, double d11, double d12, double d13) {
        double d14;
        double d15 = d11;
        int i10 = (d12 > 0.0d ? 1 : (d12 == 0.0d ? 0 : -1));
        if (i10 == 0 && d15 == 0.0d) {
            return 0;
        }
        if (i10 < 0) {
            d15 = -d15;
        }
        double abs = Math.abs(d12);
        if (d10 > 1.0d) {
            d14 = e(vVar, vVar2, abs, d15, d13);
        } else if (d10 < 1.0d) {
            d14 = g(vVar, abs, d15, d13);
        } else {
            d14 = c(vVar, abs, d15, d13);
        }
        return (long) (d14 * 1000.0d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final double e(w.C2810v r29, w.C2810v r30, double r31, double r33, double r35) {
        /*
            r0 = r35
            double r12 = r29.f()
            double r14 = r30.f()
            double r2 = r12 * r31
            double r2 = r2 - r33
            double r16 = r12 - r14
            double r10 = r2 / r16
            double r18 = r31 - r10
            double r2 = r0 / r18
            double r2 = java.lang.Math.abs(r2)
            double r2 = java.lang.Math.log(r2)
            double r2 = r2 / r12
            double r4 = r0 / r10
            double r4 = java.lang.Math.abs(r4)
            double r4 = java.lang.Math.log(r4)
            double r4 = r4 / r14
            boolean r6 = java.lang.Double.isInfinite(r2)
            r20 = 0
            r7 = 1
            if (r6 != 0) goto L_0x003b
            boolean r6 = java.lang.Double.isNaN(r2)
            if (r6 != 0) goto L_0x003b
            r6 = r7
            goto L_0x003d
        L_0x003b:
            r6 = r20
        L_0x003d:
            if (r6 != 0) goto L_0x0042
            r21 = r4
            goto L_0x005b
        L_0x0042:
            boolean r6 = java.lang.Double.isInfinite(r4)
            if (r6 != 0) goto L_0x004f
            boolean r6 = java.lang.Double.isNaN(r4)
            if (r6 != 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r7 = r20
        L_0x0051:
            if (r7 != 0) goto L_0x0056
        L_0x0053:
            r21 = r2
            goto L_0x005b
        L_0x0056:
            double r2 = java.lang.Math.max(r2, r4)
            goto L_0x0053
        L_0x005b:
            double r23 = r18 * r12
            double r2 = -r10
            double r2 = r2 * r14
            double r2 = r23 / r2
            double r2 = java.lang.Math.log(r2)
            double r4 = r14 - r12
            double r6 = r2 / r4
            boolean r2 = java.lang.Double.isNaN(r6)
            if (r2 != 0) goto L_0x0075
            r25 = 0
            int r2 = (r6 > r25 ? 1 : (r6 == r25 ? 0 : -1))
            if (r2 > 0) goto L_0x0078
        L_0x0075:
            r27 = r10
            goto L_0x0096
        L_0x0078:
            int r2 = (r6 > r25 ? 1 : (r6 == r25 ? 0 : -1))
            if (r2 <= 0) goto L_0x0098
            r2 = r18
            r4 = r12
            r8 = r10
            r27 = r10
            r10 = r14
            double r2 = f(r2, r4, r6, r8, r10)
            double r2 = -r2
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x009a
            int r2 = (r27 > r25 ? 1 : (r27 == r25 ? 0 : -1))
            if (r2 <= 0) goto L_0x0096
            int r2 = (r18 > r25 ? 1 : (r18 == r25 ? 0 : -1))
            if (r2 >= 0) goto L_0x0096
            r21 = r25
        L_0x0096:
            double r0 = -r0
            goto L_0x00a7
        L_0x0098:
            r27 = r10
        L_0x009a:
            double r10 = r27 * r14
            double r10 = r10 * r14
            double r2 = -r10
            double r4 = r23 * r12
            double r2 = r2 / r4
            double r2 = java.lang.Math.log(r2)
            double r21 = r2 / r16
        L_0x00a7:
            double r2 = r12 * r21
            double r2 = java.lang.Math.exp(r2)
            double r2 = r2 * r23
            double r10 = r27 * r14
            double r4 = r14 * r21
            double r4 = java.lang.Math.exp(r4)
            double r4 = r4 * r10
            double r2 = r2 + r4
            double r2 = java.lang.Math.abs(r2)
            r4 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x00c7
            return r21
        L_0x00c7:
            r2 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r4 = r20
        L_0x00ce:
            r5 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x0109
            r2 = 100
            if (r4 >= r2) goto L_0x0109
            int r4 = r4 + 1
            double r2 = r12 * r21
            double r5 = java.lang.Math.exp(r2)
            double r5 = r5 * r18
            double r7 = r14 * r21
            double r16 = java.lang.Math.exp(r7)
            double r16 = r16 * r27
            double r5 = r5 + r16
            double r5 = r5 + r0
            double r2 = java.lang.Math.exp(r2)
            double r2 = r2 * r23
            double r7 = java.lang.Math.exp(r7)
            double r7 = r7 * r10
            double r2 = r2 + r7
            double r5 = r5 / r2
            double r2 = r21 - r5
            double r21 = r21 - r2
            double r5 = java.lang.Math.abs(r21)
            r21 = r2
            r2 = r5
            goto L_0x00ce
        L_0x0109:
            return r21
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C2789d0.e(w.v, w.v, double, double, double):double");
    }

    private static final double f(double d10, double d11, double d12, double d13, double d14) {
        return (d10 * Math.exp(d11 * d12)) + (d13 * Math.exp(d14 * d12));
    }

    private static final double g(C2810v vVar, double d10, double d11, double d12) {
        double f10 = vVar.f();
        double e10 = (d11 - (f10 * d10)) / vVar.e();
        return Math.log(d12 / Math.sqrt((d10 * d10) + (e10 * e10))) / f10;
    }
}
