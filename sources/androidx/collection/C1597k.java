package androidx.collection;

import com.amazon.a.a.o.b.f;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.collection.k  reason: case insensitive filesystem */
public abstract class C1597k {

    /* renamed from: a  reason: collision with root package name */
    public long[] f12179a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f12180b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f12181c;

    /* renamed from: d  reason: collision with root package name */
    public int f12182d;

    /* renamed from: e  reason: collision with root package name */
    public int f12183e;

    public /* synthetic */ C1597k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(int i10) {
        if (b(i10) >= 0) {
            return true;
        }
        return false;
    }

    public final int b(int i10) {
        int hashCode = Integer.hashCode(i10) * -862048943;
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f12182d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f12179a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-((long) i17)) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & -9187201950435737472L; j12 != 0; j12 &= j12 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i14) & i13;
                if (this.f12180b[numberOfTrailingZeros] == i10) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & -9187201950435737472L) != 0) {
                return -1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
    }

    public final int c(int i10) {
        int b10 = b(i10);
        if (b10 >= 0) {
            return this.f12181c[b10];
        }
        throw new NoSuchElementException("Cannot find value for key " + i10);
    }

    public final int d() {
        return this.f12182d;
    }

    public final int e(int i10, int i11) {
        int b10 = b(i10);
        if (b10 >= 0) {
            return this.f12181c[b10];
        }
        return i11;
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L_0x0008
            return r2
        L_0x0008:
            boolean r3 = r1 instanceof androidx.collection.C1597k
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            androidx.collection.k r1 = (androidx.collection.C1597k) r1
            int r3 = r1.f()
            int r5 = r18.f()
            if (r3 == r5) goto L_0x001b
            return r4
        L_0x001b:
            int[] r3 = r0.f12180b
            int[] r5 = r0.f12181c
            long[] r6 = r0.f12179a
            int r7 = r6.length
            int r7 = r7 + -2
            if (r7 < 0) goto L_0x0065
            r8 = r4
        L_0x0027:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L_0x0060
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L_0x0041:
            if (r13 >= r11) goto L_0x005e
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x005a
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            int r15 = r1.c(r15)
            if (r14 == r15) goto L_0x005a
            return r4
        L_0x005a:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L_0x0041
        L_0x005e:
            if (r11 != r12) goto L_0x0065
        L_0x0060:
            if (r8 == r7) goto L_0x0065
            int r8 = r8 + 1
            goto L_0x0027
        L_0x0065:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.C1597k.equals(java.lang.Object):boolean");
    }

    public final int f() {
        return this.f12183e;
    }

    public final boolean g() {
        if (this.f12183e == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f12180b;
        int[] iArr2 = this.f12181c;
        long[] jArr = this.f12179a;
        int length = jArr.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j10) < 128) {
                            int i15 = (i11 << 3) + i14;
                            int i16 = iArr[i15];
                            i12 += Integer.hashCode(iArr2[i15]) ^ Integer.hashCode(i16);
                        }
                        j10 >>= 8;
                    }
                    if (i13 != 8) {
                        return i12;
                    }
                }
                if (i11 == length) {
                    i10 = i12;
                    break;
                }
                i11++;
            }
        }
        return i10;
    }

    public String toString() {
        if (g()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('{');
        int[] iArr = this.f12180b;
        int[] iArr2 = this.f12181c;
        long[] jArr = this.f12179a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i10 << 3) + i13;
                            int i15 = iArr[i14];
                            int i16 = iArr2[i14];
                            sb2.append(i15);
                            sb2.append(f.f37530b);
                            sb2.append(i16);
                            i11++;
                            if (i11 < this.f12183e) {
                                sb2.append(',');
                                sb2.append(' ');
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        C6496s.g(sb3, "s.append('}').toString()");
        return sb3;
    }

    private C1597k() {
        this.f12179a = V.f12128a;
        this.f12180b = r.a();
        this.f12181c = r.a();
    }
}
