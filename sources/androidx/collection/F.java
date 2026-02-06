package androidx.collection;

import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6508G;
import mf.C6559l;
import u.C2667d;

public final class F extends C1605t {

    /* renamed from: e  reason: collision with root package name */
    private int f12079e;

    public F(int i10) {
        super((DefaultConstructorMarker) null);
        boolean z10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C2667d.a("Capacity must be a positive value.");
        }
        k(V.g(i10));
    }

    private final void e() {
        if (this.f12207c <= 8 || Long.compare(C6508G.b(C6508G.b((long) this.f12208d) * 32) ^ Long.MIN_VALUE, C6508G.b(C6508G.b((long) this.f12207c) * 25) ^ Long.MIN_VALUE) > 0) {
            o(V.e(this.f12207c));
        } else {
            f();
        }
    }

    private final void f() {
        int i10;
        long[] jArr = this.f12205a;
        int i11 = this.f12207c;
        long[] jArr2 = this.f12206b;
        V.a(jArr, i11);
        char c10 = 0;
        int i12 = 0;
        int i13 = -1;
        while (i12 != i11) {
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = (jArr[i14] >> i15) & 255;
            if (j10 == 128) {
                i13 = i12;
                i12++;
            } else {
                if (j10 == 254) {
                    int hashCode = Long.hashCode(jArr2[i12]) * -862048943;
                    int i16 = hashCode ^ (hashCode << 16);
                    int i17 = i16 >>> 7;
                    int h10 = h(i17);
                    int i18 = i17 & i11;
                    if (((h10 - i18) & i11) / 8 == ((i12 - i18) & i11) / 8) {
                        jArr[i14] = (((long) (i16 & 127)) << i15) | ((~(255 << i15)) & jArr[i14]);
                        jArr[C6559l.i0(jArr)] = (jArr[c10] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i19 = h10 >> 3;
                        long j11 = jArr[i19];
                        int i20 = (h10 & 7) << 3;
                        if (((j11 >> i20) & 255) == 128) {
                            int i21 = i12;
                            jArr[i19] = (((long) (i16 & 127)) << i20) | (j11 & (~(255 << i20)));
                            jArr[i14] = (jArr[i14] & (~(255 << i15))) | (128 << i15);
                            jArr2[h10] = jArr2[i21];
                            jArr2[i21] = 0;
                            i10 = i21;
                            i13 = i10;
                        } else {
                            int i22 = i12;
                            jArr[i19] = (((long) (i16 & 127)) << i20) | (j11 & (~(255 << i20)));
                            if (i13 == -1) {
                                i13 = V.b(jArr, i22 + 1, i11);
                            }
                            jArr2[i13] = jArr2[h10];
                            jArr2[h10] = jArr2[i22];
                            jArr2[i22] = jArr2[i13];
                            i10 = i22 - 1;
                        }
                        jArr[C6559l.i0(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                        i12 = i10 + 1;
                        c10 = 0;
                    }
                }
                i12++;
            }
        }
        i();
    }

    private final int g(long j10) {
        int i10;
        int hashCode = Long.hashCode(j10) * -862048943;
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f12207c;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f12205a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j11 = ((jArr[i17 + 1] << (64 - i18)) & ((-((long) i18)) >> 63)) | (jArr[i17] >>> i18);
            long j12 = (long) i13;
            int i19 = i16;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & -9187201950435737472L; j14 != 0; j14 &= j14 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i15) & i14;
                if (this.f12206b[numberOfTrailingZeros] == j10) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j11) << 6) & j11 & -9187201950435737472L) != 0) {
                int h10 = h(i12);
                if (this.f12079e == 0 && ((this.f12205a[h10 >> 3] >> ((h10 & 7) << 3)) & 255) != 254) {
                    e();
                    h10 = h(i12);
                }
                this.f12208d++;
                int i20 = this.f12079e;
                long[] jArr2 = this.f12205a;
                int i21 = h10 >> 3;
                long j15 = jArr2[i21];
                int i22 = (h10 & 7) << 3;
                if (((j15 >> i22) & 255) == 128) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                this.f12079e = i20 - i10;
                int i23 = this.f12207c;
                long j16 = ((~(255 << i22)) & j15) | (j12 << i22);
                jArr2[i21] = j16;
                jArr2[(((h10 - 7) & i23) + (i23 & 7)) >> 3] = j16;
                return h10;
            }
            i16 = i19 + 8;
            i15 = (i15 + i16) & i14;
        }
    }

    private final int h(int i10) {
        int i11 = this.f12207c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f12205a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-((long) i15)) >> 63)) | (jArr[i14] >>> i15);
            long j11 = j10 & ((~j10) << 7) & -9187201950435737472L;
            if (j11 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    private final void i() {
        this.f12079e = V.c(b()) - this.f12208d;
    }

    private final void j(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = V.f12128a;
        } else {
            jArr = new long[(((i10 + 15) & -8) >> 3)];
            C6559l.z(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f12205a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        i();
    }

    private final void k(int i10) {
        int i11;
        if (i10 > 0) {
            i11 = Math.max(7, V.f(i10));
        } else {
            i11 = 0;
        }
        this.f12207c = i11;
        j(i11);
        this.f12206b = new long[i11];
    }

    private final void n(int i10) {
        this.f12208d--;
        long[] jArr = this.f12205a;
        int i11 = this.f12207c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
    }

    private final void o(int i10) {
        long[] jArr = this.f12205a;
        long[] jArr2 = this.f12206b;
        int i11 = this.f12207c;
        k(i10);
        long[] jArr3 = this.f12205a;
        long[] jArr4 = this.f12206b;
        int i12 = this.f12207c;
        for (int i13 = 0; i13 < i11; i13++) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                long j10 = jArr2[i13];
                int hashCode = Long.hashCode(j10) * -862048943;
                int i14 = hashCode ^ (hashCode << 16);
                int h10 = h(i14 >>> 7);
                long j11 = (long) (i14 & 127);
                int i15 = h10 >> 3;
                int i16 = (h10 & 7) << 3;
                long j12 = (jArr3[i15] & (~(255 << i16))) | (j11 << i16);
                jArr3[i15] = j12;
                jArr3[(((h10 - 7) & i12) + (i12 & 7)) >> 3] = j12;
                jArr4[h10] = j10;
            }
        }
    }

    public final void l(long j10) {
        this.f12206b[g(j10)] = j10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0066, code lost:
        if (((r6 & ((~r6) << 6)) & -9187201950435737472L) == 0) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0068, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(long r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = java.lang.Long.hashCode(r18)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f12207c
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L_0x0016:
            long[] r6 = r0.f12205a
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r12 = r6[r7]
            int r6 = 64 - r8
            long r6 = r12 << r6
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L_0x0042:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x005f
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            long[] r14 = r0.f12206b
            r15 = r14[r10]
            int r14 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r14 != 0) goto L_0x0059
            goto L_0x0069
        L_0x0059:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L_0x0042
        L_0x005f:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0072
            r10 = -1
        L_0x0069:
            if (r10 < 0) goto L_0x006c
            r4 = r11
        L_0x006c:
            if (r4 == 0) goto L_0x0071
            r0.n(r10)
        L_0x0071:
            return r4
        L_0x0072:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.F.m(long):boolean");
    }
}
