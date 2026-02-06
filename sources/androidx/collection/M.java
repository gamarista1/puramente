package androidx.collection;

import com.amazon.a.a.o.b.f;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u.C2664a;

public abstract class M {

    /* renamed from: a  reason: collision with root package name */
    public long[] f12101a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f12102b;

    /* renamed from: c  reason: collision with root package name */
    public float[] f12103c;

    /* renamed from: d  reason: collision with root package name */
    public int f12104d;

    /* renamed from: e  reason: collision with root package name */
    public int f12105e;

    public /* synthetic */ M(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(Object obj) {
        if (b(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int b(Object obj) {
        int i10;
        int i11 = 0;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * -862048943;
        int i13 = i12 ^ (i12 << 16);
        int i14 = i13 & 127;
        int i15 = this.f12104d;
        int i16 = i13 >>> 7;
        while (true) {
            int i17 = i16 & i15;
            long[] jArr = this.f12101a;
            int i18 = i17 >> 3;
            int i19 = (i17 & 7) << 3;
            long j10 = ((jArr[i18 + 1] << (64 - i19)) & ((-((long) i19)) >> 63)) | (jArr[i18] >>> i19);
            long j11 = (((long) i14) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & -9187201950435737472L; j12 != 0; j12 &= j12 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i17) & i15;
                if (C6496s.c(this.f12102b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & -9187201950435737472L) != 0) {
                return -1;
            }
            i11 += 8;
            i16 = i17 + i11;
        }
    }

    public final float c(Object obj) {
        int b10 = b(obj);
        if (b10 >= 0) {
            return this.f12103c[b10];
        }
        throw new NoSuchElementException("There is no key " + obj + " in the map");
    }

    public final int d() {
        return this.f12104d;
    }

    public final float e(Object obj, float f10) {
        int b10 = b(obj);
        if (b10 >= 0) {
            return this.f12103c[b10];
        }
        return f10;
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
            boolean r3 = r1 instanceof androidx.collection.M
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            androidx.collection.M r1 = (androidx.collection.M) r1
            int r3 = r1.f()
            int r5 = r18.f()
            if (r3 == r5) goto L_0x001b
            return r4
        L_0x001b:
            java.lang.Object[] r3 = r0.f12102b
            float[] r5 = r0.f12103c
            long[] r6 = r0.f12101a
            int r7 = r6.length
            int r7 = r7 + -2
            if (r7 < 0) goto L_0x0068
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
            if (r11 == 0) goto L_0x0063
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L_0x0041:
            if (r13 >= r11) goto L_0x0061
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x005d
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            float r15 = r1.c(r15)
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 != 0) goto L_0x005c
            goto L_0x005d
        L_0x005c:
            return r4
        L_0x005d:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L_0x0041
        L_0x0061:
            if (r11 != r12) goto L_0x0068
        L_0x0063:
            if (r8 == r7) goto L_0x0068
            int r8 = r8 + 1
            goto L_0x0027
        L_0x0068:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.M.equals(java.lang.Object):boolean");
    }

    public final int f() {
        return this.f12105e;
    }

    public final boolean g() {
        if (this.f12105e == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        Object[] objArr = this.f12102b;
        float[] fArr = this.f12103c;
        long[] jArr = this.f12101a;
        int length = jArr.length - 2;
        int i11 = 0;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                long j10 = jArr[i12];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j10) < 128) {
                            int i16 = (i12 << 3) + i15;
                            Object obj = objArr[i16];
                            float f10 = fArr[i16];
                            if (obj != null) {
                                i10 = obj.hashCode();
                            } else {
                                i10 = 0;
                            }
                            i13 += Float.hashCode(f10) ^ i10;
                        }
                        j10 >>= 8;
                    }
                    if (i14 != 8) {
                        return i13;
                    }
                }
                if (i12 == length) {
                    i11 = i13;
                    break;
                }
                i12++;
            }
        }
        return i11;
    }

    public String toString() {
        if (g()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('{');
        Object[] objArr = this.f12102b;
        float[] fArr = this.f12103c;
        long[] jArr = this.f12101a;
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
                            Object obj = objArr[i14];
                            float f10 = fArr[i14];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append(f.f37530b);
                            sb2.append(f10);
                            i11++;
                            if (i11 < this.f12105e) {
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

    private M() {
        this.f12101a = V.f12128a;
        this.f12102b = C2664a.f26375c;
        this.f12103c = C1595i.a();
    }
}
