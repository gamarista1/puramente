package W2;

import com.google.common.collect.C4770v;
import com.google.common.collect.O;
import i2.C2076a;
import i2.L;

public final class g implements k {

    /* renamed from: c  reason: collision with root package name */
    private static final O f8641c = O.d().f(new f());

    /* renamed from: a  reason: collision with root package name */
    private final C4770v f8642a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f8643b;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d4 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g(java.util.List r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = 2
            r2 = 0
            r17.<init>()
            int r3 = r18.size()
            r4 = 1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 != r4) goto L_0x004c
            java.lang.Object r3 = com.google.common.collect.B.g(r18)
            W2.e r3 = (W2.e) r3
            long r7 = r3.f8638b
            long r7 = h(r7)
            long r9 = r3.f8639c
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0034
            com.google.common.collect.v r1 = r3.f8637a
            com.google.common.collect.v r1 = com.google.common.collect.C4770v.H(r1)
            r0.f8642a = r1
            long[] r1 = new long[r4]
            r1[r2] = r7
            r0.f8643b = r1
            goto L_0x004b
        L_0x0034:
            com.google.common.collect.v r5 = r3.f8637a
            com.google.common.collect.v r6 = com.google.common.collect.C4770v.E()
            com.google.common.collect.v r5 = com.google.common.collect.C4770v.I(r5, r6)
            r0.f8642a = r5
            long r5 = r3.f8639c
            long r5 = r5 + r7
            long[] r1 = new long[r1]
            r1[r2] = r7
            r1[r4] = r5
            r0.f8643b = r1
        L_0x004b:
            return
        L_0x004c:
            int r3 = r18.size()
            int r3 = r3 * r1
            long[] r1 = new long[r3]
            r0.f8643b = r1
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.Arrays.fill(r1, r7)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.google.common.collect.O r3 = f8641c
            r7 = r18
            com.google.common.collect.v r3 = com.google.common.collect.C4770v.W(r3, r7)
            r7 = r2
        L_0x006b:
            int r8 = r3.size()
            if (r2 >= r8) goto L_0x00d6
            java.lang.Object r8 = r3.get(r2)
            W2.e r8 = (W2.e) r8
            long r9 = r8.f8638b
            long r9 = h(r9)
            long r11 = r8.f8639c
            long r11 = r11 + r9
            if (r7 == 0) goto L_0x00b4
            long[] r13 = r0.f8643b
            int r14 = r7 + -1
            r15 = r13[r14]
            int r13 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r13 >= 0) goto L_0x008d
            goto L_0x00b4
        L_0x008d:
            int r13 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r13 != 0) goto L_0x00a3
            java.lang.Object r13 = r1.get(r14)
            com.google.common.collect.v r13 = (com.google.common.collect.C4770v) r13
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L_0x00a3
            com.google.common.collect.v r9 = r8.f8637a
            r1.set(r14, r9)
            goto L_0x00c0
        L_0x00a3:
            java.lang.String r13 = "CuesWithTimingSubtitle"
            java.lang.String r15 = "Truncating unsupported overlapping cues."
            i2.p.h(r13, r15)
            long[] r13 = r0.f8643b
            r13[r14] = r9
            com.google.common.collect.v r9 = r8.f8637a
            r1.set(r14, r9)
            goto L_0x00c0
        L_0x00b4:
            long[] r13 = r0.f8643b
            int r14 = r7 + 1
            r13[r7] = r9
            com.google.common.collect.v r7 = r8.f8637a
            r1.add(r7)
            r7 = r14
        L_0x00c0:
            long r8 = r8.f8639c
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x00d4
            long[] r8 = r0.f8643b
            int r9 = r7 + 1
            r8[r7] = r11
            com.google.common.collect.v r7 = com.google.common.collect.C4770v.E()
            r1.add(r7)
            r7 = r9
        L_0x00d4:
            int r2 = r2 + r4
            goto L_0x006b
        L_0x00d6:
            com.google.common.collect.v r1 = com.google.common.collect.C4770v.z(r1)
            r0.f8642a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W2.g.<init>(java.util.List):void");
    }

    private static long h(long j10) {
        if (j10 == -9223372036854775807L) {
            return 0;
        }
        return j10;
    }

    public int a(long j10) {
        int d10 = L.d(this.f8643b, j10, false, false);
        if (d10 < this.f8642a.size()) {
            return d10;
        }
        return -1;
    }

    public long c(int i10) {
        boolean z10;
        if (i10 < this.f8642a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        return this.f8643b[i10];
    }

    public int e() {
        return this.f8642a.size();
    }

    /* renamed from: f */
    public C4770v b(long j10) {
        int g10 = L.g(this.f8643b, j10, true, false);
        if (g10 == -1) {
            return C4770v.E();
        }
        return (C4770v) this.f8642a.get(g10);
    }
}
