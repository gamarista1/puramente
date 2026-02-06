package androidx.collection;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6508G;
import mf.C6559l;
import u.C2667d;

public final class D extends C1603q {

    /* renamed from: e  reason: collision with root package name */
    private int f12077e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final void g() {
        if (this.f12196c <= 8 || Long.compare(C6508G.b(C6508G.b((long) this.f12197d) * 32) ^ Long.MIN_VALUE, C6508G.b(C6508G.b((long) this.f12196c) * 25) ^ Long.MIN_VALUE) > 0) {
            t(V.e(this.f12196c));
        } else {
            i();
        }
    }

    private final void i() {
        int i10;
        long[] jArr = this.f12194a;
        int i11 = this.f12196c;
        int[] iArr = this.f12195b;
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
                    int hashCode = Integer.hashCode(iArr[i12]) * -862048943;
                    int i16 = hashCode ^ (hashCode << 16);
                    int i17 = i16 >>> 7;
                    int k10 = k(i17);
                    int i18 = i17 & i11;
                    if (((k10 - i18) & i11) / 8 == ((i12 - i18) & i11) / 8) {
                        jArr[i14] = (((long) (i16 & 127)) << i15) | ((~(255 << i15)) & jArr[i14]);
                        jArr[C6559l.i0(jArr)] = (jArr[c10] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i19 = k10 >> 3;
                        long j11 = jArr[i19];
                        int i20 = (k10 & 7) << 3;
                        if (((j11 >> i20) & 255) == 128) {
                            int i21 = i12;
                            jArr[i19] = (((long) (i16 & 127)) << i20) | (j11 & (~(255 << i20)));
                            jArr[i14] = (jArr[i14] & (~(255 << i15))) | (128 << i15);
                            iArr[k10] = iArr[i21];
                            iArr[i21] = 0;
                            i10 = i21;
                            i13 = i10;
                        } else {
                            int i22 = i12;
                            jArr[i19] = (((long) (i16 & 127)) << i20) | (j11 & (~(255 << i20)));
                            if (i13 == -1) {
                                i13 = V.b(jArr, i22 + 1, i11);
                            }
                            iArr[i13] = iArr[k10];
                            iArr[k10] = iArr[i22];
                            iArr[i22] = iArr[i13];
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
        l();
    }

    private final int j(int i10) {
        int i11;
        int hashCode = Integer.hashCode(i10) * -862048943;
        int i12 = hashCode ^ (hashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f12196c;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr = this.f12194a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j10 = ((jArr[i18 + 1] << (64 - i19)) & ((-((long) i19)) >> 63)) | (jArr[i18] >>> i19);
            long j11 = (long) i14;
            int i20 = i17;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & -9187201950435737472L; j13 != 0; j13 &= j13 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i16) & i15;
                if (this.f12195b[numberOfTrailingZeros] == i10) {
                    return numberOfTrailingZeros;
                }
            }
            int i21 = i10;
            if ((((~j10) << 6) & j10 & -9187201950435737472L) != 0) {
                int k10 = k(i13);
                if (this.f12077e == 0 && ((this.f12194a[k10 >> 3] >> ((k10 & 7) << 3)) & 255) != 254) {
                    g();
                    k10 = k(i13);
                }
                this.f12197d++;
                int i22 = this.f12077e;
                long[] jArr2 = this.f12194a;
                int i23 = k10 >> 3;
                long j14 = jArr2[i23];
                int i24 = (k10 & 7) << 3;
                if (((j14 >> i24) & 255) == 128) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                this.f12077e = i22 - i11;
                int i25 = this.f12196c;
                long j15 = ((~(255 << i24)) & j14) | (j11 << i24);
                jArr2[i23] = j15;
                jArr2[(((k10 - 7) & i25) + (i25 & 7)) >> 3] = j15;
                return k10;
            }
            i17 = i20 + 8;
            i16 = (i16 + i17) & i15;
        }
    }

    private final int k(int i10) {
        int i11 = this.f12196c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f12194a;
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

    private final void l() {
        this.f12077e = V.c(b()) - this.f12197d;
    }

    private final void m(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = V.f12128a;
        } else {
            jArr = new long[(((i10 + 15) & -8) >> 3)];
            C6559l.z(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f12194a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        l();
    }

    private final void n(int i10) {
        int i11;
        if (i10 > 0) {
            i11 = Math.max(7, V.f(i10));
        } else {
            i11 = 0;
        }
        this.f12196c = i11;
        m(i11);
        this.f12195b = new int[i11];
    }

    private final void s(int i10) {
        this.f12197d--;
        long[] jArr = this.f12194a;
        int i11 = this.f12196c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
    }

    private final void t(int i10) {
        long[] jArr = this.f12194a;
        int[] iArr = this.f12195b;
        int i11 = this.f12196c;
        n(i10);
        long[] jArr2 = this.f12194a;
        int[] iArr2 = this.f12195b;
        int i12 = this.f12196c;
        for (int i13 = 0; i13 < i11; i13++) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                int i14 = iArr[i13];
                int hashCode = Integer.hashCode(i14) * -862048943;
                int i15 = hashCode ^ (hashCode << 16);
                int k10 = k(i15 >>> 7);
                long j10 = (long) (i15 & 127);
                int i16 = k10 >> 3;
                int i17 = (k10 & 7) << 3;
                long j11 = (jArr2[i16] & (~(255 << i17))) | (j10 << i17);
                jArr2[i16] = j11;
                jArr2[(((k10 - 7) & i12) + (i12 & 7)) >> 3] = j11;
                iArr2[k10] = i14;
            }
        }
    }

    public final boolean f(int i10) {
        int i11 = this.f12197d;
        this.f12195b[j(i10)] = i10;
        if (this.f12197d != i11) {
            return true;
        }
        return false;
    }

    public final void h() {
        this.f12197d = 0;
        long[] jArr = this.f12194a;
        if (jArr != V.f12128a) {
            C6559l.z(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f12194a;
            int i10 = this.f12196c;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        l();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0061, code lost:
        if (((r4 & ((~r4) << 6)) & -9187201950435737472L) == 0) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0063, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f12196c
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L_0x0013:
            long[] r4 = r13.f12194a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L_0x003f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x005a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.f12195b
            r11 = r11[r10]
            if (r11 != r14) goto L_0x0054
            goto L_0x0064
        L_0x0054:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L_0x003f
        L_0x005a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x006a
            r10 = -1
        L_0x0064:
            if (r10 < 0) goto L_0x0069
            r13.s(r10)
        L_0x0069:
            return
        L_0x006a:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.D.o(int):void");
    }

    public final void p(C1603q qVar) {
        C6496s.h(qVar, "elements");
        int[] iArr = qVar.f12195b;
        long[] jArr = qVar.f12194a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            o(iArr[(i10 << 3) + i12]);
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 != length) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0067, code lost:
        if (((r6 & ((~r6) << 6)) & -9187201950435737472L) == 0) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0069, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q(int r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = java.lang.Integer.hashCode(r19)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f12196c
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L_0x0016:
            long[] r6 = r0.f12194a
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
            if (r10 == 0) goto L_0x0060
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            int[] r14 = r0.f12195b
            r14 = r14[r10]
            r15 = r19
            if (r14 != r15) goto L_0x0059
            goto L_0x006a
        L_0x0059:
            r16 = 1
            long r16 = r8 - r16
            long r8 = r8 & r16
            goto L_0x0042
        L_0x0060:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0073
            r10 = -1
        L_0x006a:
            if (r10 < 0) goto L_0x006d
            r4 = r11
        L_0x006d:
            if (r4 == 0) goto L_0x0072
            r0.s(r10)
        L_0x0072:
            return r4
        L_0x0073:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.D.q(int):boolean");
    }

    public final boolean r(C1603q qVar) {
        C6496s.h(qVar, "elements");
        int i10 = this.f12197d;
        p(qVar);
        if (i10 != this.f12197d) {
            return true;
        }
        return false;
    }

    public D(int i10) {
        super((DefaultConstructorMarker) null);
        if (!(i10 >= 0)) {
            C2667d.a("Capacity must be a positive value.");
        }
        n(V.g(i10));
    }
}
