package F4;

import G4.c;
import H4.k;
import H4.l;
import I4.a;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.collection.Z;
import java.lang.ref.WeakReference;
import u4.C4065e;
import u4.C4071k;
import z1.C2955a;

abstract class t {

    /* renamed from: a  reason: collision with root package name */
    private static final Interpolator f30728a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    private static Z f30729b;

    /* renamed from: c  reason: collision with root package name */
    static c.a f30730c = c.a.a("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: d  reason: collision with root package name */
    static c.a f30731d = c.a.a("x", "y");

    private static WeakReference a(int i10) {
        WeakReference weakReference;
        synchronized (t.class) {
            weakReference = (WeakReference) g().g(i10);
        }
        return weakReference;
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        Interpolator linearInterpolator;
        pointF.x = k.b(pointF.x, -1.0f, 1.0f);
        pointF.y = k.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = k.b(pointF2.x, -1.0f, 1.0f);
        float b10 = k.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b10;
        int i10 = l.i(pointF.x, pointF.y, pointF2.x, b10);
        Interpolator interpolator = null;
        if (C4065e.e()) {
            weakReference = null;
        } else {
            weakReference = a(i10);
        }
        if (weakReference != null) {
            interpolator = (Interpolator) weakReference.get();
        }
        if (weakReference == null || interpolator == null) {
            try {
                linearInterpolator = C2955a.a(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e10) {
                if ("The Path cannot loop back on itself.".equals(e10.getMessage())) {
                    linearInterpolator = C2955a.a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
            }
            interpolator = linearInterpolator;
            if (!C4065e.e()) {
                try {
                    h(i10, new WeakReference(interpolator));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return interpolator;
    }

    static a c(c cVar, C4071k kVar, float f10, N n10, boolean z10, boolean z11) {
        if (z10 && z11) {
            return e(kVar, cVar, f10, n10);
        }
        if (z10) {
            return d(kVar, cVar, f10, n10);
        }
        return f(cVar, f10, n10);
    }

    private static a d(C4071k kVar, c cVar, float f10, N n10) {
        Interpolator interpolator;
        Object obj;
        Interpolator interpolator2;
        cVar.f();
        PointF pointF = null;
        Object obj2 = null;
        Object obj3 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float f11 = 0.0f;
        boolean z10 = false;
        PointF pointF4 = null;
        while (cVar.q()) {
            switch (cVar.T(f30730c)) {
                case 0:
                    f11 = (float) cVar.v();
                    break;
                case 1:
                    obj3 = n10.a(cVar, f10);
                    break;
                case 2:
                    obj2 = n10.a(cVar, f10);
                    break;
                case 3:
                    pointF = s.e(cVar, 1.0f);
                    break;
                case 4:
                    pointF4 = s.e(cVar, 1.0f);
                    break;
                case 5:
                    if (cVar.y() != 1) {
                        z10 = false;
                        break;
                    } else {
                        z10 = true;
                        break;
                    }
                case 6:
                    pointF2 = s.e(cVar, f10);
                    break;
                case 7:
                    pointF3 = s.e(cVar, f10);
                    break;
                default:
                    cVar.V();
                    break;
            }
        }
        cVar.o();
        if (z10) {
            interpolator = f30728a;
            obj = obj3;
        } else {
            if (pointF == null || pointF4 == null) {
                interpolator2 = f30728a;
            } else {
                interpolator2 = b(pointF, pointF4);
            }
            interpolator = interpolator2;
            obj = obj2;
        }
        a aVar = new a(kVar, obj3, obj, interpolator, f11, (Float) null);
        aVar.f31752o = pointF2;
        aVar.f31753p = pointF3;
        return aVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e0, code lost:
        r14 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static I4.a e(u4.C4071k r21, G4.c r22, float r23, F4.N r24) {
        /*
            r0 = r22
            r1 = r23
            r2 = r24
            r22.f()
            r3 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x0016:
            boolean r17 = r22.q()
            if (r17 == 0) goto L_0x01a5
            G4.c$a r4 = f30730c
            int r4 = r0.T(r4)
            r5 = 1
            switch(r4) {
                case 0: goto L_0x019a;
                case 1: goto L_0x018f;
                case 2: goto L_0x0184;
                case 3: goto L_0x00ef;
                case 4: goto L_0x003e;
                case 5: goto L_0x0034;
                case 6: goto L_0x002f;
                case 7: goto L_0x002a;
                default: goto L_0x0026;
            }
        L_0x0026:
            r22.V()
            goto L_0x0016
        L_0x002a:
            android.graphics.PointF r3 = F4.s.e(r22, r23)
            goto L_0x0016
        L_0x002f:
            android.graphics.PointF r15 = F4.s.e(r22, r23)
            goto L_0x0016
        L_0x0034:
            int r4 = r22.y()
            if (r4 != r5) goto L_0x003c
            r6 = r5
            goto L_0x0016
        L_0x003c:
            r6 = 0
            goto L_0x0016
        L_0x003e:
            G4.c$b r4 = r22.M()
            G4.c$b r5 = G4.c.b.BEGIN_OBJECT
            if (r4 != r5) goto L_0x00e5
            r22.f()
            r4 = 0
            r5 = 0
            r12 = 0
            r13 = 0
        L_0x004d:
            boolean r18 = r22.q()
            if (r18 == 0) goto L_0x00cc
            r18 = r15
            G4.c$a r15 = f30731d
            int r15 = r0.T(r15)
            if (r15 == 0) goto L_0x009f
            r19 = r3
            r3 = 1
            if (r15 == r3) goto L_0x006a
            r22.V()
        L_0x0065:
            r15 = r18
            r3 = r19
            goto L_0x004d
        L_0x006a:
            G4.c$b r3 = r22.M()
            G4.c$b r5 = G4.c.b.NUMBER
            if (r3 != r5) goto L_0x007b
            r3 = r14
            double r13 = r22.v()
            float r13 = (float) r13
            r14 = r3
            r5 = r13
            goto L_0x0065
        L_0x007b:
            r3 = r14
            r22.b()
            double r13 = r22.v()
            float r13 = (float) r13
            G4.c$b r14 = r22.M()
            if (r14 != r5) goto L_0x0090
            double r14 = r22.v()
            float r5 = (float) r14
            goto L_0x0091
        L_0x0090:
            r5 = r13
        L_0x0091:
            r22.n()
            r14 = r3
            r15 = r18
            r3 = r19
            r20 = r13
            r13 = r5
            r5 = r20
            goto L_0x004d
        L_0x009f:
            r19 = r3
            r3 = r14
            G4.c$b r4 = r22.M()
            G4.c$b r12 = G4.c.b.NUMBER
            if (r4 != r12) goto L_0x00b2
            double r14 = r22.v()
            float r12 = (float) r14
            r14 = r3
            r4 = r12
            goto L_0x0065
        L_0x00b2:
            r22.b()
            double r14 = r22.v()
            float r4 = (float) r14
            G4.c$b r14 = r22.M()
            if (r14 != r12) goto L_0x00c6
            double r14 = r22.v()
            float r12 = (float) r14
            goto L_0x00c7
        L_0x00c6:
            r12 = r4
        L_0x00c7:
            r22.n()
            r14 = r3
            goto L_0x0065
        L_0x00cc:
            r19 = r3
            r3 = r14
            r18 = r15
            android.graphics.PointF r14 = new android.graphics.PointF
            r14.<init>(r4, r5)
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r12, r13)
            r22.o()
            r13 = r4
            r12 = r14
        L_0x00e0:
            r14 = r3
        L_0x00e1:
            r3 = r19
            goto L_0x0016
        L_0x00e5:
            r19 = r3
            r3 = r14
            r18 = r15
            android.graphics.PointF r8 = F4.s.e(r22, r23)
            goto L_0x00e1
        L_0x00ef:
            r19 = r3
            r3 = r14
            r18 = r15
            G4.c$b r4 = r22.M()
            G4.c$b r5 = G4.c.b.BEGIN_OBJECT
            if (r4 != r5) goto L_0x017b
            r22.f()
            r4 = 0
            r5 = 0
            r9 = 0
            r11 = 0
        L_0x0103:
            boolean r14 = r22.q()
            if (r14 == 0) goto L_0x0168
            G4.c$a r14 = f30731d
            int r14 = r0.T(r14)
            if (r14 == 0) goto L_0x0140
            r15 = 1
            if (r14 == r15) goto L_0x0118
            r22.V()
            goto L_0x0103
        L_0x0118:
            G4.c$b r5 = r22.M()
            G4.c$b r11 = G4.c.b.NUMBER
            if (r5 != r11) goto L_0x0127
            double r14 = r22.v()
            float r11 = (float) r14
            r5 = r11
            goto L_0x0103
        L_0x0127:
            r22.b()
            double r14 = r22.v()
            float r5 = (float) r14
            G4.c$b r14 = r22.M()
            if (r14 != r11) goto L_0x013b
            double r14 = r22.v()
            float r11 = (float) r14
            goto L_0x013c
        L_0x013b:
            r11 = r5
        L_0x013c:
            r22.n()
            goto L_0x0103
        L_0x0140:
            G4.c$b r4 = r22.M()
            G4.c$b r9 = G4.c.b.NUMBER
            if (r4 != r9) goto L_0x014f
            double r14 = r22.v()
            float r9 = (float) r14
            r4 = r9
            goto L_0x0103
        L_0x014f:
            r22.b()
            double r14 = r22.v()
            float r4 = (float) r14
            G4.c$b r14 = r22.M()
            if (r14 != r9) goto L_0x0163
            double r14 = r22.v()
            float r9 = (float) r14
            goto L_0x0164
        L_0x0163:
            r9 = r4
        L_0x0164:
            r22.n()
            goto L_0x0103
        L_0x0168:
            android.graphics.PointF r14 = new android.graphics.PointF
            r14.<init>(r4, r5)
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r9, r11)
            r22.o()
            r11 = r4
            r9 = r14
            r15 = r18
            goto L_0x00e0
        L_0x017b:
            android.graphics.PointF r7 = F4.s.e(r22, r23)
            r14 = r3
            r15 = r18
            goto L_0x00e1
        L_0x0184:
            r19 = r3
            r3 = r14
            r18 = r15
            java.lang.Object r16 = r2.a(r0, r1)
            goto L_0x00e1
        L_0x018f:
            r19 = r3
            r3 = r14
            r18 = r15
            java.lang.Object r10 = r2.a(r0, r1)
            goto L_0x00e1
        L_0x019a:
            r19 = r3
            r18 = r15
            double r3 = r22.v()
            float r14 = (float) r3
            goto L_0x00e1
        L_0x01a5:
            r19 = r3
            r3 = r14
            r18 = r15
            r22.o()
            if (r6 == 0) goto L_0x01b5
            android.view.animation.Interpolator r0 = f30728a
            r11 = r10
        L_0x01b2:
            r12 = 0
            r13 = 0
            goto L_0x01d9
        L_0x01b5:
            if (r7 == 0) goto L_0x01c0
            if (r8 == 0) goto L_0x01c0
            android.view.animation.Interpolator r0 = b(r7, r8)
        L_0x01bd:
            r11 = r16
            goto L_0x01b2
        L_0x01c0:
            if (r9 == 0) goto L_0x01d6
            if (r11 == 0) goto L_0x01d6
            if (r12 == 0) goto L_0x01d6
            if (r13 == 0) goto L_0x01d6
            android.view.animation.Interpolator r0 = b(r9, r12)
            android.view.animation.Interpolator r1 = b(r11, r13)
            r12 = r0
            r13 = r1
            r11 = r16
            r0 = 0
            goto L_0x01d9
        L_0x01d6:
            android.view.animation.Interpolator r0 = f30728a
            goto L_0x01bd
        L_0x01d9:
            if (r12 == 0) goto L_0x01ea
            if (r13 == 0) goto L_0x01ea
            I4.a r0 = new I4.a
            r15 = 0
            r8 = r0
            r9 = r21
            r14 = r3
            r1 = r18
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x01f8
        L_0x01ea:
            r1 = r18
            I4.a r2 = new I4.a
            r14 = 0
            r8 = r2
            r9 = r21
            r12 = r0
            r13 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0 = r2
        L_0x01f8:
            r0.f31752o = r1
            r3 = r19
            r0.f31753p = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: F4.t.e(u4.k, G4.c, float, F4.N):I4.a");
    }

    private static a f(c cVar, float f10, N n10) {
        return new a(n10.a(cVar, f10));
    }

    private static Z g() {
        if (f30729b == null) {
            f30729b = new Z();
        }
        return f30729b;
    }

    private static void h(int i10, WeakReference weakReference) {
        synchronized (t.class) {
            f30729b.k(i10, weakReference);
        }
    }
}
