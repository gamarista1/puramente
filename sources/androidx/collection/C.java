package androidx.collection;

import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6508G;
import mf.C6559l;
import u.C2667d;

public final class C extends C1601o {

    /* renamed from: f  reason: collision with root package name */
    private int f12076f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final void h() {
        if (this.f12191d <= 8 || Long.compare(C6508G.b(C6508G.b((long) this.f12192e) * 32) ^ Long.MIN_VALUE, C6508G.b(C6508G.b((long) this.f12191d) * 25) ^ Long.MIN_VALUE) > 0) {
            s(V.e(this.f12191d));
        } else {
            j();
        }
    }

    private final void j() {
        int[] iArr;
        int i10;
        int i11;
        long[] jArr = this.f12188a;
        int i12 = this.f12191d;
        int[] iArr2 = this.f12189b;
        Object[] objArr = this.f12190c;
        V.a(jArr, i12);
        char c10 = 0;
        int i13 = 0;
        int i14 = -1;
        while (i13 != i12) {
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = (jArr[i15] >> i16) & 255;
            if (j10 == 128) {
                i14 = i13;
                i13++;
            } else {
                if (j10 == 254) {
                    int hashCode = Integer.hashCode(iArr2[i13]) * -862048943;
                    int i17 = hashCode ^ (hashCode << 16);
                    int i18 = i17 >>> 7;
                    int l10 = l(i18);
                    int i19 = i18 & i12;
                    if (((l10 - i19) & i12) / 8 == ((i13 - i19) & i12) / 8) {
                        jArr[i15] = (((long) (i17 & 127)) << i16) | ((~(255 << i16)) & jArr[i15]);
                        jArr[C6559l.i0(jArr)] = (jArr[c10] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i20 = l10 >> 3;
                        long j11 = jArr[i20];
                        int i21 = (l10 & 7) << 3;
                        if (((j11 >> i21) & 255) == 128) {
                            int i22 = i13;
                            iArr = iArr2;
                            jArr[i20] = (j11 & (~(255 << i21))) | (((long) (i17 & 127)) << i21);
                            jArr[i15] = (jArr[i15] & (~(255 << i16))) | (128 << i16);
                            iArr[l10] = iArr[i22];
                            iArr[i22] = 0;
                            objArr[l10] = objArr[i22];
                            objArr[i22] = null;
                            i10 = i22;
                            i14 = i10;
                            i11 = i12;
                        } else {
                            int i23 = i12;
                            iArr = iArr2;
                            int i24 = i13;
                            jArr[i20] = (((long) (i17 & 127)) << i21) | (j11 & (~(255 << i21)));
                            if (i14 == -1) {
                                i11 = i23;
                                i14 = V.b(jArr, i24 + 1, i11);
                            } else {
                                i11 = i23;
                            }
                            iArr[i14] = iArr[l10];
                            iArr[l10] = iArr[i24];
                            iArr[i24] = iArr[i14];
                            objArr[i14] = objArr[l10];
                            objArr[l10] = objArr[i24];
                            objArr[i24] = objArr[i14];
                            i10 = i24 - 1;
                        }
                        c10 = 0;
                        jArr[C6559l.i0(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                        i13 = i10 + 1;
                        i12 = i11;
                        iArr2 = iArr;
                    }
                }
                i13++;
            }
        }
        m();
    }

    private final int k(int i10) {
        int i11;
        int hashCode = Integer.hashCode(i10) * -862048943;
        int i12 = hashCode ^ (hashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f12191d;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr = this.f12188a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j10 = ((jArr[i18 + 1] << (64 - i19)) & ((-((long) i19)) >> 63)) | (jArr[i18] >>> i19);
            long j11 = (long) i14;
            int i20 = i17;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & -9187201950435737472L; j13 != 0; j13 &= j13 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i16) & i15;
                if (this.f12189b[numberOfTrailingZeros] == i10) {
                    return numberOfTrailingZeros;
                }
            }
            int i21 = i10;
            if ((((~j10) << 6) & j10 & -9187201950435737472L) != 0) {
                int l10 = l(i13);
                if (this.f12076f == 0 && ((this.f12188a[l10 >> 3] >> ((l10 & 7) << 3)) & 255) != 254) {
                    h();
                    l10 = l(i13);
                }
                this.f12192e++;
                int i22 = this.f12076f;
                long[] jArr2 = this.f12188a;
                int i23 = l10 >> 3;
                long j14 = jArr2[i23];
                int i24 = (l10 & 7) << 3;
                if (((j14 >> i24) & 255) == 128) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                this.f12076f = i22 - i11;
                int i25 = this.f12191d;
                long j15 = ((~(255 << i24)) & j14) | (j11 << i24);
                jArr2[i23] = j15;
                jArr2[(((l10 - 7) & i25) + (i25 & 7)) >> 3] = j15;
                return l10;
            }
            i17 = i20 + 8;
            i16 = (i16 + i17) & i15;
        }
    }

    private final int l(int i10) {
        int i11 = this.f12191d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f12188a;
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

    private final void m() {
        this.f12076f = V.c(d()) - this.f12192e;
    }

    private final void n(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = V.f12128a;
        } else {
            jArr = new long[(((i10 + 15) & -8) >> 3)];
            C6559l.z(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f12188a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        m();
    }

    private final void o(int i10) {
        int i11;
        if (i10 > 0) {
            i11 = Math.max(7, V.f(i10));
        } else {
            i11 = 0;
        }
        this.f12191d = i11;
        n(i11);
        this.f12189b = new int[i11];
        this.f12190c = new Object[i11];
    }

    private final void s(int i10) {
        long[] jArr;
        C c10 = this;
        long[] jArr2 = c10.f12188a;
        int[] iArr = c10.f12189b;
        Object[] objArr = c10.f12190c;
        int i11 = c10.f12191d;
        o(i10);
        long[] jArr3 = c10.f12188a;
        int[] iArr2 = c10.f12189b;
        Object[] objArr2 = c10.f12190c;
        int i12 = c10.f12191d;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr2[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                int i14 = iArr[i13];
                int hashCode = Integer.hashCode(i14) * -862048943;
                int i15 = hashCode ^ (hashCode << 16);
                int l10 = c10.l(i15 >>> 7);
                long j10 = (long) (i15 & 127);
                int i16 = l10 >> 3;
                int i17 = (l10 & 7) << 3;
                jArr = jArr2;
                long j11 = (jArr3[i16] & (~(255 << i17))) | (j10 << i17);
                jArr3[i16] = j11;
                jArr3[(((l10 - 7) & i12) + (i12 & 7)) >> 3] = j11;
                iArr2[l10] = i14;
                objArr2[l10] = objArr[i13];
            } else {
                jArr = jArr2;
            }
            i13++;
            c10 = this;
            jArr2 = jArr;
        }
    }

    public final void i() {
        this.f12192e = 0;
        long[] jArr = this.f12188a;
        if (jArr != V.f12128a) {
            C6559l.z(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f12188a;
            int i10 = this.f12191d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        C6559l.w(this.f12190c, (Object) null, 0, this.f12191d);
        m();
    }

    public final Object p(int i10, Object obj) {
        int k10 = k(i10);
        Object[] objArr = this.f12190c;
        Object obj2 = objArr[k10];
        this.f12189b[k10] = i10;
        objArr[k10] = obj;
        return obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0061, code lost:
        if (((r4 & ((~r4) << 6)) & -9187201950435737472L) == 0) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0063, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object q(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f12191d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L_0x0013:
            long[] r4 = r13.f12188a
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
            int[] r11 = r13.f12189b
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
            if (r4 == 0) goto L_0x006d
            r10 = -1
        L_0x0064:
            if (r10 < 0) goto L_0x006b
            java.lang.Object r14 = r13.r(r10)
            return r14
        L_0x006b:
            r14 = 0
            return r14
        L_0x006d:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.C.q(int):java.lang.Object");
    }

    public final Object r(int i10) {
        this.f12192e--;
        long[] jArr = this.f12188a;
        int i11 = this.f12191d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        Object[] objArr = this.f12190c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void t(int i10, Object obj) {
        int k10 = k(i10);
        this.f12189b[k10] = i10;
        this.f12190c[k10] = obj;
    }

    public C(int i10) {
        super((DefaultConstructorMarker) null);
        if (!(i10 >= 0)) {
            C2667d.a("Capacity must be a positive value.");
        }
        o(V.g(i10));
    }
}
