package r0;

import androidx.collection.C1593g;

/* renamed from: r0.e0  reason: case insensitive filesystem */
public abstract class C2487e0 {
    public static final long b(float f10, float f11, float f12, float f13, float[] fArr, int i10) {
        float f14 = (f11 - f10) * 3.0f;
        float f15 = (f12 - f11) * 3.0f;
        float f16 = (f13 - f12) * 3.0f;
        int f17 = f(f14, f15, f16, fArr, i10);
        float f18 = (f15 - f14) * 2.0f;
        int a10 = f17 + g((-f18) / (((f16 - f15) * 2.0f) - f18), fArr, i10 + f17);
        float min = Math.min(f10, f13);
        float max = Math.max(f10, f13);
        for (int i11 = 0; i11 < a10; i11++) {
            float d10 = d(f10, f11, f12, f13, fArr[i11]);
            min = Math.min(min, d10);
            max = Math.max(max, d10);
        }
        return C1593g.a(min, max);
    }

    public static final float c(float f10, float f11, float f12) {
        return ((((((f10 - f11) + 0.33333334f) * f12) + (f11 - (2.0f * f10))) * f12) + f10) * 3.0f * f12;
    }

    private static final float d(float f10, float f11, float f12, float f13, float f14) {
        return (((((((f13 + ((f11 - f12) * 3.0f)) - f10) * f14) + (((f12 - (2.0f * f11)) + f10) * 3.0f)) * f14) + ((f11 - f10) * 3.0f)) * f14) + f10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x01ac A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x012d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x015a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x015b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final float e(float r22, float r23, float r24, float r25) {
        /*
            r0 = r22
            r1 = r23
            r2 = r24
            double r3 = (double) r0
            double r5 = (double) r1
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r5 = r5 * r7
            double r5 = r3 - r5
            double r9 = (double) r2
            double r5 = r5 + r9
            r9 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r5 = r5 * r9
            float r11 = r1 - r0
            double r11 = (double) r11
            double r11 = r11 * r9
            float r0 = -r0
            double r13 = (double) r0
            float r0 = r1 - r2
            double r0 = (double) r0
            double r0 = r0 * r9
            double r13 = r13 + r0
            r0 = r25
            double r0 = (double) r0
            double r13 = r13 + r0
            r0 = 0
            double r15 = r13 - r0
            double r15 = java.lang.Math.abs(r15)
            r17 = 4502148214488346440(0x3e7ad7f29abcaf48, double:1.0E-7)
            int r2 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            r15 = 1065353223(0x3f800007, float:1.0000008)
            r16 = -1251999744(0xffffffffb5600000, float:-8.34465E-7)
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            r21 = 2143289344(0x7fc00000, float:NaN)
            if (r2 >= 0) goto L_0x00bc
            double r9 = r5 - r0
            double r9 = java.lang.Math.abs(r9)
            int r2 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r2 >= 0) goto L_0x006f
            double r0 = r11 - r0
            double r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x0052
            return r21
        L_0x0052:
            double r0 = -r3
            double r0 = r0 / r11
            float r0 = (float) r0
            int r1 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r1 >= 0) goto L_0x0063
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x0060
            r19 = r20
            goto L_0x006e
        L_0x0060:
            r19 = r21
            goto L_0x006e
        L_0x0063:
            int r1 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r1 <= 0) goto L_0x006c
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x0060
            goto L_0x006e
        L_0x006c:
            r19 = r0
        L_0x006e:
            return r19
        L_0x006f:
            double r0 = r11 * r11
            r9 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r9 = r9 * r5
            double r9 = r9 * r3
            double r0 = r0 - r9
            double r0 = java.lang.Math.sqrt(r0)
            double r5 = r5 * r7
            double r2 = r0 - r11
            double r2 = r2 / r5
            float r2 = (float) r2
            int r3 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r3 >= 0) goto L_0x008d
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 < 0) goto L_0x008a
            r2 = r20
            goto L_0x0097
        L_0x008a:
            r2 = r21
            goto L_0x0097
        L_0x008d:
            int r3 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r3 <= 0) goto L_0x0097
            int r2 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r2 > 0) goto L_0x008a
            r2 = r19
        L_0x0097:
            boolean r3 = java.lang.Float.isNaN(r2)
            if (r3 != 0) goto L_0x009e
            return r2
        L_0x009e:
            double r2 = -r11
            double r2 = r2 - r0
            double r2 = r2 / r5
            float r0 = (float) r2
            int r1 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r1 >= 0) goto L_0x00b0
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x00ad
            r19 = r20
            goto L_0x00bb
        L_0x00ad:
            r19 = r21
            goto L_0x00bb
        L_0x00b0:
            int r1 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r1 <= 0) goto L_0x00b9
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x00ad
            goto L_0x00bb
        L_0x00b9:
            r19 = r0
        L_0x00bb:
            return r19
        L_0x00bc:
            double r5 = r5 / r13
            double r11 = r11 / r13
            double r3 = r3 / r13
            double r13 = r11 * r9
            double r17 = r5 * r5
            double r13 = r13 - r17
            r17 = 4621256167635550208(0x4022000000000000, double:9.0)
            double r13 = r13 / r17
            double r7 = r7 * r5
            double r7 = r7 * r5
            double r7 = r7 * r5
            double r17 = r17 * r5
            double r17 = r17 * r11
            double r7 = r7 - r17
            r11 = 4628293042053316608(0x403b000000000000, double:27.0)
            double r3 = r3 * r11
            double r7 = r7 + r3
            r2 = 4632796641680687104(0x404b000000000000, double:54.0)
            double r7 = r7 / r2
            double r2 = r7 * r7
            double r11 = r13 * r13
            double r11 = r11 * r13
            double r2 = r2 + r11
            double r5 = r5 / r9
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 >= 0) goto L_0x0183
            double r2 = -r11
            double r2 = java.lang.Math.sqrt(r2)
            double r7 = -r7
            double r7 = r7 / r2
            r11 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f4
            r7 = r11
        L_0x00f4:
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x00fb
            r7 = r11
        L_0x00fb:
            double r7 = java.lang.Math.acos(r7)
            float r0 = (float) r2
            float r0 = e1.C1943b.a(r0)
            float r0 = r0 * r1
            double r0 = (double) r0
            double r2 = r7 / r9
            double r2 = java.lang.Math.cos(r2)
            double r2 = r2 * r0
            double r2 = r2 - r5
            float r2 = (float) r2
            int r3 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r3 >= 0) goto L_0x011d
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 < 0) goto L_0x011a
            r2 = r20
            goto L_0x0127
        L_0x011a:
            r2 = r21
            goto L_0x0127
        L_0x011d:
            int r3 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r3 <= 0) goto L_0x0127
            int r2 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r2 > 0) goto L_0x011a
            r2 = r19
        L_0x0127:
            boolean r3 = java.lang.Float.isNaN(r2)
            if (r3 != 0) goto L_0x012e
            return r2
        L_0x012e:
            r2 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r2 = r2 + r7
            double r2 = r2 / r9
            double r2 = java.lang.Math.cos(r2)
            double r2 = r2 * r0
            double r2 = r2 - r5
            float r2 = (float) r2
            int r3 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r3 >= 0) goto L_0x014a
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 < 0) goto L_0x0147
            r2 = r20
            goto L_0x0154
        L_0x0147:
            r2 = r21
            goto L_0x0154
        L_0x014a:
            int r3 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r3 <= 0) goto L_0x0154
            int r2 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r2 > 0) goto L_0x0147
            r2 = r19
        L_0x0154:
            boolean r3 = java.lang.Float.isNaN(r2)
            if (r3 != 0) goto L_0x015b
            return r2
        L_0x015b:
            r2 = 4623263855806786840(0x402921fb54442d18, double:12.566370614359172)
            double r7 = r7 + r2
            double r7 = r7 / r9
            double r2 = java.lang.Math.cos(r7)
            double r0 = r0 * r2
            double r0 = r0 - r5
            float r0 = (float) r0
            int r1 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r1 >= 0) goto L_0x0177
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x0174
            r19 = r20
            goto L_0x0182
        L_0x0174:
            r19 = r21
            goto L_0x0182
        L_0x0177:
            int r1 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r1 <= 0) goto L_0x0180
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x0174
            goto L_0x0182
        L_0x0180:
            r19 = r0
        L_0x0182:
            return r19
        L_0x0183:
            if (r0 != 0) goto L_0x01c9
            float r0 = (float) r7
            float r0 = e1.C1943b.a(r0)
            float r0 = -r0
            float r1 = r1 * r0
            float r2 = (float) r5
            float r1 = r1 - r2
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r3 >= 0) goto L_0x019c
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 < 0) goto L_0x0199
            r1 = r20
            goto L_0x01a6
        L_0x0199:
            r1 = r21
            goto L_0x01a6
        L_0x019c:
            int r3 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r3 <= 0) goto L_0x01a6
            int r1 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r1 > 0) goto L_0x0199
            r1 = r19
        L_0x01a6:
            boolean r3 = java.lang.Float.isNaN(r1)
            if (r3 != 0) goto L_0x01ad
            return r1
        L_0x01ad:
            float r0 = -r0
            float r0 = r0 - r2
            int r1 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r1 >= 0) goto L_0x01bd
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x01ba
            r19 = r20
            goto L_0x01c8
        L_0x01ba:
            r19 = r21
            goto L_0x01c8
        L_0x01bd:
            int r1 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r1 <= 0) goto L_0x01c6
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x01ba
            goto L_0x01c8
        L_0x01c6:
            r19 = r0
        L_0x01c8:
            return r19
        L_0x01c9:
            double r0 = java.lang.Math.sqrt(r2)
            double r2 = -r7
            double r2 = r2 + r0
            float r2 = (float) r2
            float r2 = e1.C1943b.a(r2)
            double r7 = r7 + r0
            float r0 = (float) r7
            float r0 = e1.C1943b.a(r0)
            float r2 = r2 - r0
            double r0 = (double) r2
            double r0 = r0 - r5
            float r0 = (float) r0
            int r1 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r1 >= 0) goto L_0x01ec
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x01e9
            r19 = r20
            goto L_0x01f7
        L_0x01e9:
            r19 = r21
            goto L_0x01f7
        L_0x01ec:
            int r1 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r1 <= 0) goto L_0x01f5
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x01e9
            goto L_0x01f7
        L_0x01f5:
            r19 = r0
        L_0x01f7:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.C2487e0.e(float, float, float, float):float");
    }

    private static final int f(float f10, float f11, float f12, float[] fArr, int i10) {
        float[] fArr2 = fArr;
        int i11 = i10;
        double d10 = (double) f10;
        double d11 = (double) f11;
        double d12 = (double) f12;
        double d13 = d11 * 2.0d;
        double d14 = (d10 - d13) + d12;
        if (d14 != 0.0d) {
            double d15 = -Math.sqrt((d11 * d11) - (d12 * d10));
            double d16 = (-d10) + d11;
            int g10 = g((float) ((-(d15 + d16)) / d14), fArr2, i11);
            int g11 = g10 + g((float) ((d15 - d16) / d14), fArr2, i11 + g10);
            if (g11 > 1) {
                float f13 = fArr2[i11];
                int i12 = i11 + 1;
                float f14 = fArr2[i12];
                if (f13 > f14) {
                    fArr2[i11] = f14;
                    fArr2[i12] = f13;
                } else if (f13 == f14) {
                    return g11 - 1;
                }
            }
            return g11;
        } else if (d11 == d12) {
            return 0;
        } else {
            return g((float) ((d13 - d12) / (d13 - (d12 * 2.0d))), fArr2, i11);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r3 >= -8.34465E-7f) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        r3 = Float.NaN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r3 <= 1.0000008f) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int g(float r3, float[] r4, int r5) {
        /*
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r2 = 2143289344(0x7fc00000, float:NaN)
            if (r1 >= 0) goto L_0x0011
            r1 = -1251999744(0xffffffffb5600000, float:-8.34465E-7)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 < 0) goto L_0x000f
        L_0x000d:
            r3 = r0
            goto L_0x001f
        L_0x000f:
            r3 = r2
            goto L_0x001f
        L_0x0011:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x001f
            r1 = 1065353223(0x3f800007, float:1.0000008)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x000f
            goto L_0x000d
        L_0x001f:
            r4[r5] = r3
            boolean r3 = java.lang.Float.isNaN(r3)
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.C2487e0.g(float, float[], int):int");
    }
}
