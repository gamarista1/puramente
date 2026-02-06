package W2;

import i2.C2082g;
import java.util.List;

public abstract class i {
    private static int a(k kVar, long j10) {
        if (j10 == -9223372036854775807L) {
            return 0;
        }
        int a10 = kVar.a(j10);
        if (a10 == -1) {
            a10 = kVar.e();
        }
        if (a10 <= 0 || kVar.c(a10 - 1) != j10) {
            return a10;
        }
        return a10 - 1;
    }

    private static void b(k kVar, int i10, C2082g gVar) {
        long c10 = kVar.c(i10);
        List b10 = kVar.b(c10);
        if (!b10.isEmpty()) {
            if (i10 != kVar.e() - 1) {
                long c11 = kVar.c(i10 + 1) - kVar.c(i10);
                if (c11 > 0) {
                    gVar.accept(new e(b10, c10, c11));
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043 A[LOOP:0: B:11:0x003d->B:13:0x0043, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(W2.k r11, W2.s.b r12, i2.C2082g r13) {
        /*
            long r0 = r12.f8666a
            int r0 = a(r11, r0)
            long r1 = r12.f8666a
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L_0x003b
            int r1 = r11.e()
            if (r0 >= r1) goto L_0x003b
            long r3 = r12.f8666a
            java.util.List r6 = r11.b(r3)
            long r3 = r11.c(r0)
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x003b
            long r7 = r12.f8666a
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x003b
            W2.e r1 = new W2.e
            long r9 = r3 - r7
            r5 = r1
            r5.<init>(r6, r7, r9)
            r13.accept(r1)
            r1 = 1
            goto L_0x003c
        L_0x003b:
            r1 = r2
        L_0x003c:
            r3 = r0
        L_0x003d:
            int r4 = r11.e()
            if (r3 >= r4) goto L_0x0049
            b(r11, r3, r13)
            int r3 = r3 + 1
            goto L_0x003d
        L_0x0049:
            boolean r3 = r12.f8667b
            if (r3 == 0) goto L_0x0076
            if (r1 == 0) goto L_0x0051
            int r0 = r0 + -1
        L_0x0051:
            if (r2 >= r0) goto L_0x0059
            b(r11, r2, r13)
            int r2 = r2 + 1
            goto L_0x0051
        L_0x0059:
            if (r1 == 0) goto L_0x0076
            W2.e r1 = new W2.e
            long r2 = r12.f8666a
            java.util.List r4 = r11.b(r2)
            long r5 = r11.c(r0)
            long r2 = r12.f8666a
            long r11 = r11.c(r0)
            long r7 = r2 - r11
            r3 = r1
            r3.<init>(r4, r5, r7)
            r13.accept(r1)
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W2.i.c(W2.k, W2.s$b, i2.g):void");
    }
}
