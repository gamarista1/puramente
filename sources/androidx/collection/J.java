package androidx.collection;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6508G;
import mf.C6559l;
import u.C2667d;

public final class J extends S {

    /* renamed from: f  reason: collision with root package name */
    private int f12082f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final void h() {
        if (this.f12120d <= 8 || Long.compare(C6508G.b(C6508G.b((long) this.f12121e) * 32) ^ Long.MIN_VALUE, C6508G.b(C6508G.b((long) this.f12120d) * 25) ^ Long.MIN_VALUE) > 0) {
            o(V.e(this.f12120d));
        } else {
            i();
        }
    }

    private final void i() {
        int i10;
        Object[] objArr;
        int i11;
        int i12;
        long[] jArr = this.f12117a;
        int i13 = this.f12120d;
        Object[] objArr2 = this.f12118b;
        long[] jArr2 = this.f12119c;
        V.a(jArr, i13);
        int i14 = 0;
        int i15 = 0;
        int i16 = -1;
        while (i15 != i13) {
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j10 = (jArr[i17] >> i18) & 255;
            if (j10 == 128) {
                i16 = i15;
                i15++;
            } else {
                if (j10 == 254) {
                    Object obj = objArr2[i15];
                    if (obj != null) {
                        i10 = obj.hashCode();
                    } else {
                        i10 = i14;
                    }
                    int i19 = i10 * -862048943;
                    int i20 = i19 ^ (i19 << 16);
                    int i21 = i20 >>> 7;
                    int j11 = j(i21);
                    int i22 = i21 & i13;
                    if (((j11 - i22) & i13) / 8 == ((i15 - i22) & i13) / 8) {
                        jArr[i17] = (((long) (i20 & 127)) << i18) | ((~(255 << i18)) & jArr[i17]);
                        jArr[C6559l.i0(jArr)] = (jArr[i14] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i23 = j11 >> 3;
                        long j12 = jArr[i23];
                        int i24 = (j11 & 7) << 3;
                        if (((j12 >> i24) & 255) == 128) {
                            int i25 = i15;
                            objArr = objArr2;
                            jArr[i23] = (j12 & (~(255 << i24))) | (((long) (i20 & 127)) << i24);
                            jArr[i17] = (jArr[i17] & (~(255 << i18))) | (128 << i18);
                            objArr[j11] = objArr[i25];
                            objArr[i25] = null;
                            jArr2[j11] = jArr2[i25];
                            jArr2[i25] = 0;
                            i11 = i25;
                            i16 = i11;
                            i12 = i13;
                        } else {
                            int i26 = i13;
                            objArr = objArr2;
                            int i27 = i15;
                            jArr[i23] = (((long) (i20 & 127)) << i24) | (j12 & (~(255 << i24)));
                            if (i16 == -1) {
                                i12 = i26;
                                i16 = V.b(jArr, i27 + 1, i12);
                            } else {
                                i12 = i26;
                            }
                            objArr[i16] = objArr[j11];
                            objArr[j11] = objArr[i27];
                            objArr[i27] = objArr[i16];
                            jArr2[i16] = jArr2[j11];
                            jArr2[j11] = jArr2[i27];
                            jArr2[i27] = jArr2[i16];
                            i11 = i27 - 1;
                        }
                        i14 = 0;
                        jArr[C6559l.i0(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                        i15 = i11 + 1;
                        i13 = i12;
                        objArr2 = objArr;
                    }
                }
                i15++;
            }
        }
        l();
    }

    private final int j(int i10) {
        int i11 = this.f12120d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f12117a;
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

    private final int k(Object obj) {
        int i10;
        int i11;
        Object obj2 = obj;
        if (obj2 != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * -862048943;
        int i13 = i12 ^ (i12 << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f12120d;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr = this.f12117a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            long j10 = ((jArr[i19 + 1] << (64 - i20)) & ((-((long) i20)) >> 63)) | (jArr[i19] >>> i20);
            long j11 = (long) i15;
            int i21 = i15;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & -9187201950435737472L; j13 != 0; j13 &= j13 - 1) {
                int numberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j13) >> 3)) & i16;
                if (C6496s.c(this.f12118b[numberOfTrailingZeros], obj2)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & -9187201950435737472L) != 0) {
                int j14 = j(i14);
                if (this.f12082f == 0 && ((this.f12117a[j14 >> 3] >> ((j14 & 7) << 3)) & 255) != 254) {
                    h();
                    j14 = j(i14);
                }
                this.f12121e++;
                int i22 = this.f12082f;
                long[] jArr2 = this.f12117a;
                int i23 = j14 >> 3;
                long j15 = jArr2[i23];
                int i24 = (j14 & 7) << 3;
                if (((j15 >> i24) & 255) == 128) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                this.f12082f = i22 - i11;
                int i25 = this.f12120d;
                long j16 = ((~(255 << i24)) & j15) | (j11 << i24);
                jArr2[i23] = j16;
                jArr2[(((j14 - 7) & i25) + (i25 & 7)) >> 3] = j16;
                return ~j14;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
            i15 = i21;
        }
    }

    private final void l() {
        this.f12082f = V.c(d()) - this.f12121e;
    }

    private final void m(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = V.f12128a;
        } else {
            jArr = new long[(((i10 + 15) & -8) >> 3)];
            C6559l.z(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f12117a = jArr;
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
        this.f12120d = i11;
        m(i11);
        this.f12118b = new Object[i11];
        this.f12119c = new long[i11];
    }

    private final void o(int i10) {
        int i11;
        int i12;
        long[] jArr = this.f12117a;
        Object[] objArr = this.f12118b;
        long[] jArr2 = this.f12119c;
        int i13 = this.f12120d;
        n(i10);
        long[] jArr3 = this.f12117a;
        Object[] objArr2 = this.f12118b;
        long[] jArr4 = this.f12119c;
        int i14 = this.f12120d;
        int i15 = 0;
        while (i15 < i13) {
            if (((jArr[i15 >> 3] >> ((i15 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i15];
                if (obj != null) {
                    i12 = obj.hashCode();
                } else {
                    i12 = 0;
                }
                int i16 = i12 * -862048943;
                int i17 = i16 ^ (i16 << 16);
                int j10 = j(i17 >>> 7);
                i11 = i15;
                long j11 = (long) (i17 & 127);
                int i18 = j10 >> 3;
                int i19 = (j10 & 7) << 3;
                long j12 = (j11 << i19) | (jArr3[i18] & (~(255 << i19)));
                jArr3[i18] = j12;
                jArr3[(((j10 - 7) & i14) + (i14 & 7)) >> 3] = j12;
                objArr2[j10] = obj;
                jArr4[j10] = jArr2[i11];
            } else {
                i11 = i15;
            }
            i15 = i11 + 1;
        }
    }

    public final void p(Object obj, long j10) {
        int k10 = k(obj);
        if (k10 < 0) {
            k10 = ~k10;
        }
        this.f12118b[k10] = obj;
        this.f12119c[k10] = j10;
    }

    public J(int i10) {
        super((DefaultConstructorMarker) null);
        if (!(i10 >= 0)) {
            C2667d.a("Capacity must be a positive value.");
        }
        n(V.g(i10));
    }
}
