package androidx.collection;

import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6508G;
import mf.C6559l;
import u.C2667d;

public final class E extends C1604s {

    /* renamed from: f  reason: collision with root package name */
    private int f12078f;

    public E(int i10) {
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
        m(V.g(i10));
    }

    private final void f() {
        if (this.f12203d <= 8 || Long.compare(C6508G.b(C6508G.b((long) this.f12204e) * 32) ^ Long.MIN_VALUE, C6508G.b(C6508G.b((long) this.f12203d) * 25) ^ Long.MIN_VALUE) > 0) {
            n(V.e(this.f12203d));
        } else {
            h();
        }
    }

    private final void h() {
        long[] jArr;
        int i10;
        int i11;
        long[] jArr2 = this.f12200a;
        int i12 = this.f12203d;
        long[] jArr3 = this.f12201b;
        Object[] objArr = this.f12202c;
        V.a(jArr2, i12);
        char c10 = 0;
        int i13 = 0;
        int i14 = -1;
        while (i13 != i12) {
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = (jArr2[i15] >> i16) & 255;
            if (j10 == 128) {
                i14 = i13;
                i13++;
            } else {
                if (j10 == 254) {
                    int hashCode = Long.hashCode(jArr3[i13]) * -862048943;
                    int i17 = hashCode ^ (hashCode << 16);
                    int i18 = i17 >>> 7;
                    int j11 = j(i18);
                    int i19 = i18 & i12;
                    if (((j11 - i19) & i12) / 8 == ((i13 - i19) & i12) / 8) {
                        jArr2[i15] = (((long) (i17 & 127)) << i16) | ((~(255 << i16)) & jArr2[i15]);
                        jArr2[C6559l.i0(jArr2)] = (jArr2[c10] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i20 = j11 >> 3;
                        long j12 = jArr2[i20];
                        int i21 = (j11 & 7) << 3;
                        if (((j12 >> i21) & 255) == 128) {
                            int i22 = i13;
                            jArr = jArr3;
                            jArr2[i20] = (j12 & (~(255 << i21))) | (((long) (i17 & 127)) << i21);
                            jArr2[i15] = (jArr2[i15] & (~(255 << i16))) | (128 << i16);
                            jArr[j11] = jArr[i22];
                            jArr[i22] = 0;
                            objArr[j11] = objArr[i22];
                            objArr[i22] = null;
                            i10 = i22;
                            i14 = i10;
                            i11 = i12;
                        } else {
                            int i23 = i12;
                            jArr = jArr3;
                            int i24 = i13;
                            jArr2[i20] = (((long) (i17 & 127)) << i21) | (j12 & (~(255 << i21)));
                            if (i14 == -1) {
                                i11 = i23;
                                i14 = V.b(jArr2, i24 + 1, i11);
                            } else {
                                i11 = i23;
                            }
                            jArr[i14] = jArr[j11];
                            jArr[j11] = jArr[i24];
                            jArr[i24] = jArr[i14];
                            objArr[i14] = objArr[j11];
                            objArr[j11] = objArr[i24];
                            objArr[i24] = objArr[i14];
                            i10 = i24 - 1;
                        }
                        c10 = 0;
                        jArr2[C6559l.i0(jArr2)] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                        i13 = i10 + 1;
                        i12 = i11;
                        jArr3 = jArr;
                    }
                }
                i13++;
            }
        }
        k();
    }

    private final int i(long j10) {
        int i10;
        int hashCode = Long.hashCode(j10) * -862048943;
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f12203d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f12200a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j11 = ((jArr[i17 + 1] << (64 - i18)) & ((-((long) i18)) >> 63)) | (jArr[i17] >>> i18);
            long j12 = (long) i13;
            int i19 = i16;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & -9187201950435737472L; j14 != 0; j14 &= j14 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i15) & i14;
                if (this.f12201b[numberOfTrailingZeros] == j10) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j11) << 6) & j11 & -9187201950435737472L) != 0) {
                int j15 = j(i12);
                if (this.f12078f == 0 && ((this.f12200a[j15 >> 3] >> ((j15 & 7) << 3)) & 255) != 254) {
                    f();
                    j15 = j(i12);
                }
                this.f12204e++;
                int i20 = this.f12078f;
                long[] jArr2 = this.f12200a;
                int i21 = j15 >> 3;
                long j16 = jArr2[i21];
                int i22 = (j15 & 7) << 3;
                if (((j16 >> i22) & 255) == 128) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                this.f12078f = i20 - i10;
                int i23 = this.f12203d;
                long j17 = ((~(255 << i22)) & j16) | (j12 << i22);
                jArr2[i21] = j17;
                jArr2[(((j15 - 7) & i23) + (i23 & 7)) >> 3] = j17;
                return j15;
            }
            i16 = i19 + 8;
            i15 = (i15 + i16) & i14;
        }
    }

    private final int j(int i10) {
        int i11 = this.f12203d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f12200a;
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

    private final void k() {
        this.f12078f = V.c(c()) - this.f12204e;
    }

    private final void l(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = V.f12128a;
        } else {
            jArr = new long[(((i10 + 15) & -8) >> 3)];
            C6559l.z(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f12200a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        k();
    }

    private final void m(int i10) {
        int i11;
        if (i10 > 0) {
            i11 = Math.max(7, V.f(i10));
        } else {
            i11 = 0;
        }
        this.f12203d = i11;
        l(i11);
        this.f12201b = new long[i11];
        this.f12202c = new Object[i11];
    }

    private final void n(int i10) {
        long[] jArr;
        E e10 = this;
        long[] jArr2 = e10.f12200a;
        long[] jArr3 = e10.f12201b;
        Object[] objArr = e10.f12202c;
        int i11 = e10.f12203d;
        m(i10);
        long[] jArr4 = e10.f12200a;
        long[] jArr5 = e10.f12201b;
        Object[] objArr2 = e10.f12202c;
        int i12 = e10.f12203d;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr2[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                long j10 = jArr3[i13];
                int hashCode = Long.hashCode(j10) * -862048943;
                int i14 = hashCode ^ (hashCode << 16);
                int j11 = e10.j(i14 >>> 7);
                long j12 = (long) (i14 & 127);
                int i15 = j11 >> 3;
                int i16 = (j11 & 7) << 3;
                jArr = jArr2;
                long j13 = (jArr4[i15] & (~(255 << i16))) | (j12 << i16);
                jArr4[i15] = j13;
                jArr4[(((j11 - 7) & i12) + (i12 & 7)) >> 3] = j13;
                jArr5[j11] = j10;
                objArr2[j11] = objArr[i13];
            } else {
                jArr = jArr2;
            }
            i13++;
            e10 = this;
            jArr2 = jArr;
        }
    }

    public final void g() {
        this.f12204e = 0;
        long[] jArr = this.f12200a;
        if (jArr != V.f12128a) {
            C6559l.z(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f12200a;
            int i10 = this.f12203d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        C6559l.w(this.f12202c, (Object) null, 0, this.f12203d);
        k();
    }

    public final void o(long j10, Object obj) {
        int i10 = i(j10);
        this.f12201b[i10] = j10;
        this.f12202c[i10] = obj;
    }
}
