package androidx.collection;

import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6508G;
import mf.C6559l;
import u.C2667d;

public final class A extends C1597k {

    /* renamed from: f  reason: collision with root package name */
    private int f12075f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final void h() {
        if (this.f12182d <= 8 || Long.compare(C6508G.b(C6508G.b((long) this.f12183e) * 32) ^ Long.MIN_VALUE, C6508G.b(C6508G.b((long) this.f12182d) * 25) ^ Long.MIN_VALUE) > 0) {
            p(V.e(this.f12182d));
        } else {
            j();
        }
    }

    private final void j() {
        int[] iArr;
        int i10;
        int i11;
        long[] jArr = this.f12179a;
        int i12 = this.f12182d;
        int[] iArr2 = this.f12180b;
        int[] iArr3 = this.f12181c;
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
                    int k10 = k(i18);
                    int i19 = i18 & i12;
                    if (((k10 - i19) & i12) / 8 == ((i13 - i19) & i12) / 8) {
                        jArr[i15] = (((long) (i17 & 127)) << i16) | ((~(255 << i16)) & jArr[i15]);
                        jArr[C6559l.i0(jArr)] = (jArr[c10] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i20 = k10 >> 3;
                        long j11 = jArr[i20];
                        int i21 = (k10 & 7) << 3;
                        if (((j11 >> i21) & 255) == 128) {
                            int i22 = i13;
                            iArr = iArr2;
                            jArr[i20] = (j11 & (~(255 << i21))) | (((long) (i17 & 127)) << i21);
                            jArr[i15] = (jArr[i15] & (~(255 << i16))) | (128 << i16);
                            iArr[k10] = iArr[i22];
                            iArr[i22] = 0;
                            iArr3[k10] = iArr3[i22];
                            iArr3[i22] = 0;
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
                            iArr[i14] = iArr[k10];
                            iArr[k10] = iArr[i24];
                            iArr[i24] = iArr[i14];
                            iArr3[i14] = iArr3[k10];
                            iArr3[k10] = iArr3[i24];
                            iArr3[i24] = iArr3[i14];
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
        int i11 = this.f12182d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f12179a;
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

    private final int l(int i10) {
        int i11;
        int hashCode = Integer.hashCode(i10) * -862048943;
        int i12 = hashCode ^ (hashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f12182d;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr = this.f12179a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j10 = ((jArr[i18 + 1] << (64 - i19)) & ((-((long) i19)) >> 63)) | (jArr[i18] >>> i19);
            long j11 = (long) i14;
            int i20 = i17;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & -9187201950435737472L; j13 != 0; j13 &= j13 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i16) & i15;
                if (this.f12180b[numberOfTrailingZeros] == i10) {
                    return numberOfTrailingZeros;
                }
            }
            int i21 = i10;
            if ((((~j10) << 6) & j10 & -9187201950435737472L) != 0) {
                int k10 = k(i13);
                if (this.f12075f == 0 && ((this.f12179a[k10 >> 3] >> ((k10 & 7) << 3)) & 255) != 254) {
                    h();
                    k10 = k(i13);
                }
                this.f12183e++;
                int i22 = this.f12075f;
                long[] jArr2 = this.f12179a;
                int i23 = k10 >> 3;
                long j14 = jArr2[i23];
                int i24 = (k10 & 7) << 3;
                if (((j14 >> i24) & 255) == 128) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                this.f12075f = i22 - i11;
                int i25 = this.f12182d;
                long j15 = ((~(255 << i24)) & j14) | (j11 << i24);
                jArr2[i23] = j15;
                jArr2[(((k10 - 7) & i25) + (i25 & 7)) >> 3] = j15;
                return ~k10;
            }
            i17 = i20 + 8;
            i16 = (i16 + i17) & i15;
        }
    }

    private final void m() {
        this.f12075f = V.c(d()) - this.f12183e;
    }

    private final void n(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = V.f12128a;
        } else {
            jArr = new long[(((i10 + 15) & -8) >> 3)];
            C6559l.z(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f12179a = jArr;
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
        this.f12182d = i11;
        n(i11);
        this.f12180b = new int[i11];
        this.f12181c = new int[i11];
    }

    private final void p(int i10) {
        long[] jArr;
        A a10 = this;
        long[] jArr2 = a10.f12179a;
        int[] iArr = a10.f12180b;
        int[] iArr2 = a10.f12181c;
        int i11 = a10.f12182d;
        o(i10);
        long[] jArr3 = a10.f12179a;
        int[] iArr3 = a10.f12180b;
        int[] iArr4 = a10.f12181c;
        int i12 = a10.f12182d;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr2[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                int i14 = iArr[i13];
                int hashCode = Integer.hashCode(i14) * -862048943;
                int i15 = hashCode ^ (hashCode << 16);
                int k10 = a10.k(i15 >>> 7);
                long j10 = (long) (i15 & 127);
                int i16 = k10 >> 3;
                int i17 = (k10 & 7) << 3;
                jArr = jArr2;
                long j11 = (jArr3[i16] & (~(255 << i17))) | (j10 << i17);
                jArr3[i16] = j11;
                jArr3[(((k10 - 7) & i12) + (i12 & 7)) >> 3] = j11;
                iArr3[k10] = i14;
                iArr4[k10] = iArr2[i13];
            } else {
                jArr = jArr2;
            }
            i13++;
            a10 = this;
            jArr2 = jArr;
        }
    }

    public final void i() {
        this.f12183e = 0;
        long[] jArr = this.f12179a;
        if (jArr != V.f12128a) {
            C6559l.z(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f12179a;
            int i10 = this.f12182d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        m();
    }

    public final void q(int i10, int i11) {
        int l10 = l(i10);
        if (l10 < 0) {
            l10 = ~l10;
        }
        this.f12180b[l10] = i10;
        this.f12181c[l10] = i11;
    }

    public A(int i10) {
        super((DefaultConstructorMarker) null);
        if (!(i10 >= 0)) {
            C2667d.a("Capacity must be a positive value.");
        }
        o(V.g(i10));
    }
}
