package R0;

import Ef.g;
import Ef.m;
import R0.L;
import S0.f;
import android.graphics.RectF;
import android.text.Layout;
import mf.C6559l;
import yf.p;

public abstract class m0 {
    private static final float a(int i10, int i11, float[] fArr) {
        return fArr[(i10 - i11) * 2];
    }

    private static final float b(int i10, int i11, float[] fArr) {
        return fArr[((i10 - i11) * 2) + 1];
    }

    private static final int c(L.a aVar, RectF rectF, int i10, int i11, int i12, float f10, float f11, float[] fArr, f fVar, p pVar) {
        int i13;
        int c10;
        float f12;
        float f13;
        if (!g(rectF, f10, f11)) {
            return -1;
        }
        if ((aVar.c() || rectF.right < f11) && (!aVar.c() || rectF.left > f10)) {
            i13 = aVar.b();
            int a10 = aVar.a();
            while (a10 - i13 > 1) {
                int i14 = (a10 + i13) / 2;
                float a11 = a(i14, i10, fArr);
                if ((aVar.c() || a11 <= rectF.right) && (!aVar.c() || a11 >= rectF.left)) {
                    i13 = i14;
                } else {
                    a10 = i14;
                }
            }
            if (aVar.c()) {
                i13 = a10;
            }
        } else {
            i13 = aVar.a() - 1;
        }
        int b10 = fVar.b(i13 + 1);
        if (b10 == -1 || (c10 = fVar.c(b10)) <= aVar.b()) {
            return -1;
        }
        int d10 = m.d(b10, aVar.b());
        int h10 = m.h(c10, aVar.a());
        RectF rectF2 = new RectF(0.0f, (float) i11, 0.0f, (float) i12);
        while (true) {
            if (aVar.c()) {
                f12 = a(h10 - 1, i10, fArr);
            } else {
                f12 = a(d10, i10, fArr);
            }
            rectF2.left = f12;
            if (aVar.c()) {
                f13 = b(d10, i10, fArr);
            } else {
                f13 = b(h10 - 1, i10, fArr);
            }
            rectF2.right = f13;
            if (((Boolean) pVar.invoke(rectF2, rectF)).booleanValue()) {
                return h10;
            }
            h10 = fVar.d(h10);
            if (h10 == -1 || h10 <= aVar.b()) {
                return -1;
            }
            d10 = m.d(fVar.b(h10), aVar.b());
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0086 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int[] d(R0.l0 r17, android.text.Layout r18, R0.L r19, android.graphics.RectF r20, int r21, yf.p r22) {
        /*
            r8 = r17
            r9 = r18
            r10 = r20
            r11 = 1
            r0 = r21
            if (r0 != r11) goto L_0x001a
            S0.j r0 = new S0.j
            java.lang.CharSequence r1 = r17.G()
            S0.i r2 = r17.I()
            r0.<init>(r1, r2)
        L_0x0018:
            r12 = r0
            goto L_0x0027
        L_0x001a:
            java.lang.CharSequence r0 = r17.G()
            android.text.TextPaint r1 = r17.H()
            S0.f r0 = S0.g.a(r0, r1)
            goto L_0x0018
        L_0x0027:
            float r0 = r10.top
            int r0 = (int) r0
            int r0 = r9.getLineForVertical(r0)
            float r1 = r10.top
            float r2 = r8.l(r0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r13 = 0
            if (r1 <= 0) goto L_0x0042
            int r0 = r0 + 1
            int r1 = r17.m()
            if (r0 < r1) goto L_0x0042
            return r13
        L_0x0042:
            r14 = r0
            float r0 = r10.bottom
            int r0 = (int) r0
            int r15 = r9.getLineForVertical(r0)
            if (r15 != 0) goto L_0x0058
            float r0 = r10.bottom
            r1 = 0
            float r1 = r8.w(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0058
            return r13
        L_0x0058:
            r7 = 1
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r14
            r4 = r20
            r5 = r12
            r6 = r22
            int r0 = f(r0, r1, r2, r3, r4, r5, r6, r7)
        L_0x0069:
            r7 = r14
            r14 = r0
            r6 = -1
            if (r14 != r6) goto L_0x0084
            if (r7 >= r15) goto L_0x0084
            int r14 = r7 + 1
            r7 = 1
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r14
            r4 = r20
            r5 = r12
            r6 = r22
            int r0 = f(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0069
        L_0x0084:
            if (r14 != r6) goto L_0x0087
            return r13
        L_0x0087:
            r16 = 0
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r15
            r4 = r20
            r5 = r12
            r11 = r6
            r6 = r22
            r13 = r7
            r7 = r16
            int r0 = f(r0, r1, r2, r3, r4, r5, r6, r7)
        L_0x009d:
            if (r0 != r11) goto L_0x00b5
            if (r13 >= r15) goto L_0x00b5
            int r15 = r15 + -1
            r7 = 0
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r15
            r4 = r20
            r5 = r12
            r6 = r22
            int r0 = f(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x009d
        L_0x00b5:
            if (r0 != r11) goto L_0x00b9
            r1 = 0
            return r1
        L_0x00b9:
            r1 = 1
            int r14 = r14 + r1
            int r2 = r12.b(r14)
            int r0 = r0 - r1
            int r0 = r12.c(r0)
            int[] r0 = new int[]{r2, r0}
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.m0.d(R0.l0, android.text.Layout, R0.L, android.graphics.RectF, int, yf.p):int[]");
    }

    private static final int e(L.a aVar, RectF rectF, int i10, int i11, int i12, float f10, float f11, float[] fArr, f fVar, p pVar) {
        int i13;
        int b10;
        float f12;
        float f13;
        if (!g(rectF, f10, f11)) {
            return -1;
        }
        if ((aVar.c() || rectF.left > f10) && (!aVar.c() || rectF.right < f11)) {
            i13 = aVar.b();
            int a10 = aVar.a();
            while (a10 - i13 > 1) {
                int i14 = (a10 + i13) / 2;
                float a11 = a(i14, i10, fArr);
                if ((aVar.c() || a11 <= rectF.left) && (!aVar.c() || a11 >= rectF.right)) {
                    i13 = i14;
                } else {
                    a10 = i14;
                }
            }
            if (aVar.c()) {
                i13 = a10;
            }
        } else {
            i13 = aVar.b();
        }
        int c10 = fVar.c(i13);
        if (c10 == -1 || (b10 = fVar.b(c10)) >= aVar.a()) {
            return -1;
        }
        int d10 = m.d(b10, aVar.b());
        int h10 = m.h(c10, aVar.a());
        RectF rectF2 = new RectF(0.0f, (float) i11, 0.0f, (float) i12);
        while (true) {
            if (aVar.c()) {
                f12 = a(h10 - 1, i10, fArr);
            } else {
                f12 = a(d10, i10, fArr);
            }
            rectF2.left = f12;
            if (aVar.c()) {
                f13 = b(d10, i10, fArr);
            } else {
                f13 = b(h10 - 1, i10, fArr);
            }
            rectF2.right = f13;
            if (((Boolean) pVar.invoke(rectF2, rectF)).booleanValue()) {
                return d10;
            }
            d10 = fVar.a(d10);
            if (d10 == -1 || d10 >= aVar.a()) {
                return -1;
            }
            h10 = m.h(fVar.c(d10), aVar.a());
        }
        return -1;
    }

    private static final int f(l0 l0Var, Layout layout, L l10, int i10, RectF rectF, f fVar, p pVar, boolean z10) {
        g gVar;
        float a10;
        float b10;
        L.a[] aVarArr;
        int i11;
        int i12;
        int i13;
        Layout layout2 = layout;
        int i14 = i10;
        int lineTop = layout2.getLineTop(i14);
        int lineBottom = layout2.getLineBottom(i14);
        int lineStart = layout2.getLineStart(i14);
        int lineEnd = layout2.getLineEnd(i14);
        if (lineStart == lineEnd) {
            return -1;
        }
        float[] fArr = new float[((lineEnd - lineStart) * 2)];
        l0Var.b(i14, fArr);
        L.a[] d10 = l10.d(i10);
        if (z10) {
            gVar = C6559l.f0(d10);
        } else {
            gVar = m.p(C6559l.j0(d10), 0);
        }
        int k10 = gVar.k();
        int n10 = gVar.n();
        int r10 = gVar.r();
        if ((r10 <= 0 || k10 > n10) && (r10 >= 0 || n10 > k10)) {
            return -1;
        }
        int i15 = k10;
        while (true) {
            L.a aVar = d10[i15];
            if (aVar.c()) {
                a10 = a(aVar.a() - 1, lineStart, fArr);
            } else {
                a10 = a(aVar.b(), lineStart, fArr);
            }
            float f10 = a10;
            if (aVar.c()) {
                b10 = b(aVar.b(), lineStart, fArr);
            } else {
                b10 = b(aVar.a() - 1, lineStart, fArr);
            }
            float f11 = b10;
            if (z10) {
                i12 = i15;
                aVarArr = d10;
                i11 = n10;
                i13 = e(aVar, rectF, lineStart, lineTop, lineBottom, f10, f11, fArr, fVar, pVar);
            } else {
                i12 = i15;
                aVarArr = d10;
                i11 = n10;
                i13 = c(aVar, rectF, lineStart, lineTop, lineBottom, f10, f11, fArr, fVar, pVar);
            }
            if (i13 >= 0) {
                return i13;
            }
            if (i12 == i11) {
                return -1;
            }
            i15 = i12 + r10;
            n10 = i11;
            d10 = aVarArr;
        }
    }

    private static final boolean g(RectF rectF, float f10, float f11) {
        if (f11 < rectF.left || f10 > rectF.right) {
            return false;
        }
        return true;
    }
}
