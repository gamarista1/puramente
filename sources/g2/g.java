package g2;

import g2.b;

public final class g extends d {
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e4 A[LOOP:6: B:35:0x00e4->B:36:0x00e6, LOOP_START, PHI: r0 
      PHI: (r0v2 int) = (r0v0 int), (r0v3 int) binds: [B:14:0x003e, B:36:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(java.nio.ByteBuffer r12) {
        /*
            r11 = this;
            int r0 = r12.position()
            int r1 = r12.limit()
            int r2 = r1 - r0
            g2.b$a r3 = r11.f21004b
            int r3 = r3.f21001c
            r4 = 1610612736(0x60000000, float:3.6893488E19)
            r5 = 1342177280(0x50000000, float:8.5899346E9)
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            r7 = 22
            r8 = 21
            r9 = 4
            r10 = 3
            if (r3 == r10) goto L_0x0031
            if (r3 == r9) goto L_0x0034
            if (r3 == r8) goto L_0x002f
            if (r3 == r7) goto L_0x0034
            if (r3 == r6) goto L_0x0036
            if (r3 == r5) goto L_0x002f
            if (r3 != r4) goto L_0x0029
            goto L_0x0034
        L_0x0029:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L_0x002f:
            int r2 = r2 / 3
        L_0x0031:
            int r2 = r2 * 2
            goto L_0x0036
        L_0x0034:
            int r2 = r2 / 2
        L_0x0036:
            java.nio.ByteBuffer r2 = r11.l(r2)
            g2.b$a r3 = r11.f21004b
            int r3 = r3.f21001c
            if (r3 == r10) goto L_0x00e4
            if (r3 == r9) goto L_0x00bf
            if (r3 == r8) goto L_0x00a8
            if (r3 == r7) goto L_0x0091
            if (r3 == r6) goto L_0x007c
            if (r3 == r5) goto L_0x0067
            if (r3 != r4) goto L_0x0061
        L_0x004c:
            if (r0 >= r1) goto L_0x00f9
            int r3 = r0 + 1
            byte r3 = r12.get(r3)
            r2.put(r3)
            byte r3 = r12.get(r0)
            r2.put(r3)
            int r0 = r0 + 4
            goto L_0x004c
        L_0x0061:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L_0x0067:
            if (r0 >= r1) goto L_0x00f9
            int r3 = r0 + 1
            byte r3 = r12.get(r3)
            r2.put(r3)
            byte r3 = r12.get(r0)
            r2.put(r3)
            int r0 = r0 + 3
            goto L_0x0067
        L_0x007c:
            if (r0 >= r1) goto L_0x00f9
            int r3 = r0 + 1
            byte r3 = r12.get(r3)
            r2.put(r3)
            byte r3 = r12.get(r0)
            r2.put(r3)
            int r0 = r0 + 2
            goto L_0x007c
        L_0x0091:
            if (r0 >= r1) goto L_0x00f9
            int r3 = r0 + 2
            byte r3 = r12.get(r3)
            r2.put(r3)
            int r3 = r0 + 3
            byte r3 = r12.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L_0x0091
        L_0x00a8:
            if (r0 >= r1) goto L_0x00f9
            int r3 = r0 + 1
            byte r3 = r12.get(r3)
            r2.put(r3)
            int r3 = r0 + 2
            byte r3 = r12.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L_0x00a8
        L_0x00bf:
            if (r0 >= r1) goto L_0x00f9
            float r3 = r12.getFloat(r0)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 1065353216(0x3f800000, float:1.0)
            float r3 = i2.L.n(r3, r4, r5)
            r4 = 1191181824(0x46fffe00, float:32767.0)
            float r3 = r3 * r4
            int r3 = (int) r3
            short r3 = (short) r3
            r4 = r3 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r2.put(r4)
            int r3 = r3 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 4
            goto L_0x00bf
        L_0x00e4:
            if (r0 >= r1) goto L_0x00f9
            r3 = 0
            r2.put(r3)
            byte r3 = r12.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + -128
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L_0x00e4
        L_0x00f9:
            int r0 = r12.limit()
            r12.position(r0)
            r2.flip()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.g.d(java.nio.ByteBuffer):void");
    }

    public b.a h(b.a aVar) {
        int i10 = aVar.f21001c;
        if (i10 != 3 && i10 != 2 && i10 != 268435456 && i10 != 21 && i10 != 1342177280 && i10 != 22 && i10 != 1610612736 && i10 != 4) {
            throw new b.C0349b(aVar);
        } else if (i10 != 2) {
            return new b.a(aVar.f20999a, aVar.f21000b, 2);
        } else {
            return b.a.f20998e;
        }
    }
}
