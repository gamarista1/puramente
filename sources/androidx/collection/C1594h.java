package androidx.collection;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.collection.h  reason: case insensitive filesystem */
public abstract class C1594h {

    /* renamed from: a  reason: collision with root package name */
    public long[] f12170a;

    /* renamed from: b  reason: collision with root package name */
    public float[] f12171b;

    /* renamed from: c  reason: collision with root package name */
    public int f12172c;

    /* renamed from: d  reason: collision with root package name */
    public int f12173d;

    public /* synthetic */ C1594h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ String d(C1594h hVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
        CharSequence charSequence5;
        if (obj == null) {
            if ((i11 & 1) != 0) {
                charSequence = ", ";
            }
            CharSequence charSequence6 = "";
            if ((i11 & 2) != 0) {
                charSequence5 = charSequence6;
            } else {
                charSequence5 = charSequence2;
            }
            if ((i11 & 4) == 0) {
                charSequence6 = charSequence3;
            }
            if ((i11 & 8) != 0) {
                i10 = -1;
            }
            int i12 = i10;
            if ((i11 & 16) != 0) {
                charSequence4 = "...";
            }
            return hVar.c(charSequence, charSequence5, charSequence6, i12, charSequence4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0066, code lost:
        if (((r6 & ((~r6) << 6)) & -9187201950435737472L) == 0) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0068, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(float r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = java.lang.Float.hashCode(r17)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f12172c
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L_0x0016:
            long[] r6 = r0.f12170a
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
            float[] r14 = r0.f12171b
            r14 = r14[r10]
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
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
            if (r6 == 0) goto L_0x006d
            r10 = -1
        L_0x0069:
            if (r10 < 0) goto L_0x006c
            r4 = r11
        L_0x006c:
            return r4
        L_0x006d:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.C1594h.a(float):boolean");
    }

    public final int b() {
        return this.f12172c;
    }

    public final String c(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4) {
        CharSequence charSequence5 = charSequence;
        CharSequence charSequence6 = charSequence2;
        CharSequence charSequence7 = charSequence3;
        CharSequence charSequence8 = charSequence4;
        C6496s.h(charSequence5, "separator");
        C6496s.h(charSequence6, "prefix");
        C6496s.h(charSequence7, "postfix");
        C6496s.h(charSequence8, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence6);
        float[] fArr = this.f12171b;
        long[] jArr = this.f12170a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            loop0:
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i11 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j10 & 255) < 128) {
                            float f10 = fArr[(i11 << 3) + i15];
                            if (i12 == i10) {
                                sb2.append(charSequence8);
                                break loop0;
                            }
                            if (i12 != 0) {
                                sb2.append(charSequence5);
                            }
                            sb2.append(f10);
                            i12++;
                        } else {
                            int i16 = i10;
                        }
                        j10 >>= 8;
                        i15++;
                        i13 = 8;
                    }
                    int i17 = i13;
                    int i18 = i10;
                    if (i14 != i17) {
                        break;
                    }
                } else {
                    int i19 = i10;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
            String sb3 = sb2.toString();
            C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }
        sb2.append(charSequence7);
        String sb32 = sb2.toString();
        C6496s.g(sb32, "StringBuilder().apply(builderAction).toString()");
        return sb32;
    }

    /* JADX WARNING: type inference failed for: r18v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L_0x0008
            return r2
        L_0x0008:
            boolean r3 = r1 instanceof androidx.collection.C1594h
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            androidx.collection.h r1 = (androidx.collection.C1594h) r1
            int r3 = r1.f12173d
            int r5 = r0.f12173d
            if (r3 == r5) goto L_0x0017
            return r4
        L_0x0017:
            float[] r3 = r0.f12171b
            long[] r5 = r0.f12170a
            int r6 = r5.length
            int r6 = r6 + -2
            if (r6 < 0) goto L_0x005d
            r7 = r4
        L_0x0021:
            r8 = r5[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L_0x0058
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L_0x003b:
            if (r12 >= r10) goto L_0x0056
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L_0x0052
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            boolean r13 = r1.a(r13)
            if (r13 != 0) goto L_0x0052
            return r4
        L_0x0052:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L_0x003b
        L_0x0056:
            if (r10 != r11) goto L_0x005d
        L_0x0058:
            if (r7 == r6) goto L_0x005d
            int r7 = r7 + 1
            goto L_0x0021
        L_0x005d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.C1594h.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        float[] fArr = this.f12171b;
        long[] jArr = this.f12170a;
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
                            i12 += Float.hashCode(fArr[(i11 << 3) + i14]);
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
        return d(this, (CharSequence) null, "[", "]", 0, (CharSequence) null, 25, (Object) null);
    }

    private C1594h() {
        this.f12170a = V.f12128a;
        this.f12171b = C1595i.a();
    }
}
